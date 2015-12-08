// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.activity.settings.dialog.CreateNewPasswordDialog;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.model.Sitemap;
import com.pinterest.activity.unauth.UnauthWallActivity;
import com.pinterest.analytics.DeepLinkLogging;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.CommerceApi;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.api.remote.NetworkStoryApi;
import com.pinterest.api.remote.PinApi;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.EventType;
import com.pinterest.schemas.event.ViewParameterType;
import com.pinterest.schemas.event.ViewType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.commons.lang3.StringUtils;

public class WebhookActivity extends BaseActivity
{

    private static Set ALLOWED_SHORTCUT = new _cls1();
    public static final String SOURCE_CLIENT_NOTIF = "CLIENT_NOTIF";
    public static final String SOURCE_OTHERS = "OTHERS";
    public static final String SOURCE_PULL_NOTIF = "PULL_NOTIF";
    public static final String SOURCE_PUSH_NOTIF = "PUSH_NOTIF";
    public static final String SOURCE_WIDGET = "HOME_WIDGET";
    private EventType _deepLinkScheme;
    private boolean _isOcf;

    public WebhookActivity()
    {
        _deepLinkScheme = EventType.DEEP_LINK_HTTP;
        _isOcf = false;
    }

    private void doAutoLogin(final Uri uri)
    {
        AccountApi.a(uri, new _cls8());
    }

    private String getInterestNameOrId(String s)
    {
        String as[] = s.split("-");
        if (as.length >= 2) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        String s1;
        s1 = as[as.length - 1];
        int j = s1.length();
        if (j >= 12)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (!Character.isDigit(s1.charAt(i)))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return s1;
    }

    private void getScheme(Uri uri)
    {
        if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()))
        {
            _deepLinkScheme = EventType.DEEP_LINK_HTTP;
            return;
        }
        if ("pinterest".equalsIgnoreCase(uri.getScheme()))
        {
            _deepLinkScheme = EventType.DEEP_LINK_PINTEREST;
            return;
        } else
        {
            _deepLinkScheme = EventType.DEEP_LINK_OTHER;
            return;
        }
    }

    private String getSource()
    {
        String s;
        try
        {
            s = getIntent().getStringExtra("com.pinterest.EXTRA_SOURCE");
        }
        catch (Exception exception)
        {
            CrashReporting.a(exception);
            return null;
        }
        return s;
    }

    private void goHomeAndFinish()
    {
        trackAction("home");
        ActivityHelper.goHome(this);
        finish();
    }

    private void goNavigationAndFinish(Navigation navigation)
    {
        startActivity(ActivityHelper.getTaskIntent(this, navigation));
        finish();
    }

    private void goSearch(String s)
    {
        goNavigationAndFinish(new Navigation(Location.SEARCH, s));
        trackAction("search");
    }

    private void goSplash()
    {
        ActivityHelper.goSplash(this);
        finish();
    }

    private boolean handleConversation(ArrayList arraylist)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (arraylist.size() >= 2)
        {
            flag = flag1;
            if ("conversation".equals(arraylist.get(0)))
            {
                arraylist = (String)arraylist.get(1);
                if (ModelHelper.isValid(arraylist))
                {
                    arraylist = new Navigation(Location.CONVERSATION, arraylist);
                    trackAction("conversation");
                    goNavigationAndFinish(arraylist);
                }
                finish();
                flag = true;
            }
        }
        return flag;
    }

    private boolean handleInterestAndCategory(ArrayList arraylist)
    {
        if (arraylist != null && arraylist.size() == 1 && "categories".equals(arraylist.get(0)))
        {
            if (Experiments.N())
            {
                arraylist = new Navigation(Location.CONTEXTUAL_EXPLORE);
            } else
            {
                arraylist = new Navigation(Location.EXPLORE);
            }
            trackAction("explore");
            goNavigationAndFinish(arraylist);
            return true;
        }
        if (arraylist == null || arraylist.size() < 2 || !"explore".equals(arraylist.get(0)) && !"categories".equals(arraylist.get(0)))
        {
            return false;
        }
        String s = (String)arraylist.get(1);
        if ("explore".equals(arraylist.get(0)))
        {
            InterestsApi.a(getInterestNameOrId(s), new _cls4(true), getApiTag());
        } else
        if ("categories".equals(arraylist.get(0)))
        {
            if ("home".equals(s))
            {
                goHomeAndFinish();
            } else
            {
                goNavigationAndFinish(new Navigation(Location.CATEGORY, s));
            }
            return true;
        }
        trackAction("categories");
        return true;
    }

    private boolean handleInvite(List list, Uri uri)
    {
        if (list.size() <= 0 || !((String)list.get(0)).equals("invited"))
        {
            return false;
        } else
        {
            Experiments.aa();
            AccountApi.b(uri.getQueryParameter("invite_code"));
            ActivityHelper.goSplashSignup(this, false, uri.toString());
            finish();
            return true;
        }
    }

    private boolean handleNewPassword(List list, Uri uri)
    {
        if (list.size() < 2 || !((String)list.get(0)).equals("pw"))
        {
            return false;
        } else
        {
            TreeMap treemap = new TreeMap();
            treemap.put("username", list.get(1));
            treemap.put("expiration", uri.getQueryParameter("e"));
            treemap.put("token", uri.getQueryParameter("t"));
            CreateNewPasswordDialog.show(treemap);
            return true;
        }
    }

    private boolean handleNews(ArrayList arraylist)
    {
        if (arraylist.size() >= 2 && "news".equals(arraylist.get(0)))
        {
            if (!MyUser.hasAccessToken())
            {
                goHomeAndFinish();
                return true;
            }
            arraylist = (String)arraylist.get(1);
            if (!ModelHelper.isValid(arraylist))
            {
                return false;
            } else
            {
                NetworkStoryApi.a(arraylist, new _cls2(), getApiTag());
                return true;
            }
        } else
        {
            return false;
        }
    }

    private boolean handlePinPick(Uri uri, ArrayList arraylist)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (arraylist.size() >= 2)
        {
            flag = flag1;
            if ("pinpicks".equals(arraylist.get(0)))
            {
                uri = new Navigation(Location.PIN_PICKS, uri.getPath());
                trackAction("pinpick");
                goNavigationAndFinish(uri);
                flag = true;
            }
        }
        return flag;
    }

    private boolean handleSearch(Uri uri, ArrayList arraylist)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (arraylist.size() > 0)
        {
            flag = flag1;
            if (arraylist.size() <= 2)
            {
                flag = flag1;
                if ("search".equals(arraylist.get(0)))
                {
                    flag = flag1;
                    if (uri.getQueryParameter("q") != null)
                    {
                        goSearch(uri.getQueryParameter("q"));
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private boolean handleShopSpace(ArrayList arraylist)
    {
        int i;
        if (arraylist != null)
        {
            if ((i = arraylist.size()) > 0 && "shop_space".equals(arraylist.get(0)))
            {
                if (i == 1)
                {
                    arraylist = new Navigation(Location.COMMERCE_SHOP_SPACE);
                    trackAction("shop_space");
                    goNavigationAndFinish(arraylist);
                    return true;
                }
                if (i == 3)
                {
                    CommerceApi.a(new _cls3(), (String)arraylist.get(1), (String)arraylist.get(2));
                    return true;
                }
            }
        }
        return false;
    }

    private boolean handleShortcuts(Uri uri, String s, ArrayList arraylist)
    {
        if (s.equalsIgnoreCase("search") && uri.getQueryParameter("q") != null)
        {
            goSearch(uri.getQueryParameter("q"));
            return true;
        }
        if (s.equals("categories") && arraylist.size() == 0)
        {
            uri = new Navigation(Location.EXPLORE);
            trackAction("explore");
            goNavigationAndFinish(uri);
            return true;
        }
        if (arraylist.size() == 0)
        {
            return false;
        }
        if (s.equalsIgnoreCase("board"))
        {
            loadBoard(uri, arraylist);
            return true;
        }
        if (s.equalsIgnoreCase("user"))
        {
            loadUser(uri, arraylist);
            return true;
        }
        if (s.equalsIgnoreCase("pin"))
        {
            loadPin(uri, arraylist, MyUser.hasAccessTokenAndUser());
            return true;
        } else
        {
            return false;
        }
    }

    private boolean handleSitemapLink(ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() != 1)
        {
            return false;
        }
        arraylist = Sitemap.getLocation((String)arraylist.get(0));
        if (arraylist == null)
        {
            return false;
        } else
        {
            ActivityHelper.goTask(this, new Navigation(arraylist));
            finish();
            return true;
        }
    }

    public static boolean isAllowedHost(String s)
    {
        return s != null && (s.equalsIgnoreCase("pinterest.com") || s.endsWith(".pinterest.com") || s.endsWith(".pinterdev.com"));
    }

    private boolean isAllowedLink(Uri uri)
    {
        String s;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        if (uri == null)
        {
            return false;
        }
        s = uri.getScheme();
        uri = uri.getHost();
        if (!"pinit".equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        if ("pinterest".equalsIgnoreCase(s))
        {
            if (!isAllowedShortCut(uri))
            {
                flag = flag1;
                if (!isAllowedHost(uri))
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            flag = true;
        } else
        {
            flag = isAllowedHost(uri);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean isAllowedShortCut(String s)
    {
        return s != null && !s.contains(".");
    }

    private void loadBoard(Uri uri, List list)
    {
        String s;
        if (list.size() == 1)
        {
            s = (String)list.get(0);
        } else
        {
            s = String.format("%s/%s", new Object[] {
                list.get(0), list.get(1)
            });
        }
        if (!MyUser.hasAccessTokenAndUser())
        {
            AnalyticsApi.a("unauth_board_deeplink");
            Intent intent = new Intent(Application.context(), com/pinterest/activity/unauth/UnauthWallActivity);
            intent.putExtra("com.pinterest.EXTRA_BOARD_ID", s);
            startActivity(intent);
            finish();
        }
        BoardApi.a(s, MyUser.hasAccessToken(), new _cls7(list), getApiTag());
    }

    private void loadPin(Uri uri, List list, boolean flag)
    {
        try
        {
            list = new ArrayList(list);
            if (TextUtils.equals((CharSequence)list.get(0), "pin"))
            {
                list.remove(0);
            }
            String s = (String)list.get(0);
            trackShareRef(uri);
            Pinalytics.a(_deepLinkScheme, s);
            PinApi.a(s, flag, new _cls5(list), getApiTag());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Application.showToast(0x7f070409);
        }
        finish();
    }

    private void loadUser(Uri uri, List list)
    {
        UserApi.a((String)list.get(0), new _cls6(uri), getApiTag());
    }

    public static void openLink(Context context, String s)
    {
        String s1 = "";
        if (!StringUtils.isEmpty(s))
        {
            if (s.charAt(0) == '/')
            {
                s1 = (new StringBuilder("http://www.pinterest.com")).append(s).toString();
            } else
            {
                s1 = (new StringBuilder("http://www.pinterest.com/")).append(s).toString();
            }
        }
        s = ActivityHelper.getWebhook(context);
        s.setData(Uri.parse(s1));
        context.startActivity(s);
    }

    private void reportParams(Uri uri)
    {
        Object obj;
        Uri uri1;
        obj = null;
        uri1 = NetworkUtils.getDecodedUri(uri.toString());
        if (uri1 != null) goto _L2; else goto _L1
_L1:
        Set set;
        return;
_L2:
        if ((set = uri1.getQueryParameterNames()) == null || !set.contains("utm_source") || !set.contains("utm_medium")) goto _L1; else goto _L3
_L3:
        Object obj1;
        String s;
        s = uri1.getQueryParameter("utm_content");
        uri = uri1.getQueryParameter("utm_source");
        obj1 = uri1.getQueryParameter("utm_medium");
        uri = ViewType.findByValue(Integer.parseInt(uri));
        obj1 = ViewParameterType.findByValue(Integer.parseInt(((String) (obj1))));
        obj = obj1;
_L11:
        if (uri == null || obj == null) goto _L1; else goto _L4
_L4:
        uri = new HashMap();
        obj = set.iterator();
_L7:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_236;
        }
        obj1 = (String)((Iterator) (obj)).next();
        if (!((String) (obj1)).startsWith("cl_")) goto _L6; else goto _L5
_L5:
        uri.put(((String) (obj1)).replaceFirst("cl_", ""), uri1.getQueryParameter(((String) (obj1))));
          goto _L7
_L6:
        if (!((String) (obj1)).startsWith("utm_")) goto _L9; else goto _L8
_L8:
        uri.put(obj1, uri1.getQueryParameter(((String) (obj1))));
          goto _L7
_L9:
        if (!((String) (obj1)).equals("e_t")) goto _L7; else goto _L10
_L10:
        uri.put("tracking_id", uri1.getQueryParameter(((String) (obj1))));
          goto _L7
        try
        {
            Pinalytics.a(EventType.SERVICE_ENTRY, s, uri);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            CrashReporting.a(uri);
            return;
        }
        uri;
        uri = null;
          goto _L11
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L11
    }

    private void setDeepLinkSource()
    {
        String s = getSource();
        if ("PULL_NOTIF".equals(s) || "PUSH_NOTIF".equals(s))
        {
            EventType eventtype;
            if ("PULL_NOTIF".equals(s))
            {
                eventtype = EventType.PULL_NOTIFICATION_OPENED_BY;
            } else
            {
                eventtype = EventType.PUSH_NOTIFICATION_OPENED_BY;
            }
            Pinalytics.a(eventtype, ApplicationInfo.getInstallId());
            if ("PUSH_NOTIF".equals(s))
            {
                AnalyticsApi.a("opened", getIntent().getExtras());
            }
        }
    }

    public static boolean shouldHandleInWebView(String s)
    {
        if (isAllowedHost(s) && !s.equalsIgnoreCase("pinterest.com"))
        {
            s = s.split("\\.");
            if (s.length != 3 || !s[0].equalsIgnoreCase("www") && s[0].length() != 2)
            {
                trackAction("webview");
                return true;
            }
        }
        return false;
    }

    private void showCategory(Category category)
    {
        goNavigationAndFinish(new Navigation(Location.CATEGORY, category));
    }

    private static void trackAction(String s)
    {
        AnalyticsApi.a((new StringBuilder("DL_")).append(s).toString());
    }

    private void trackShareRef(Uri uri)
    {
        String s1 = uri.getQueryParameter("fb_ref");
        String s = s1;
        if (s1 == null)
        {
            uri = uri.getQueryParameter("target_url");
            s = s1;
            if (uri != null)
            {
                uri = uri.split("fb_ref=");
                s = s1;
                if (uri.length > 1)
                {
                    s = uri[1].split("&")[0].replace("%3A", ":");
                }
            }
        }
        if (s != null)
        {
            AccountApi.a(s);
        }
    }

    protected void init(Uri uri)
    {
        PLog.info("WebhookActivity: %s", new Object[] {
            uri
        });
        if (uri != null) goto _L2; else goto _L1
_L1:
        goHomeAndFinish();
_L10:
        return;
_L2:
        Object obj;
        String s1;
        String s2;
        ArrayList arraylist;
        boolean flag1;
        (new DeepLinkLogging()).a(this, getSource());
        setDeepLinkSource();
        showWaitDialog();
        trackAction("start");
        if (!isAllowedLink(uri))
        {
            finish();
            return;
        }
        getScheme(uri);
        reportParams(uri);
        flag1 = MyUser.hasAccessTokenAndUser();
        arraylist = new ArrayList(uri.getPathSegments());
        if (arraylist.contains("secure"))
        {
            if (arraylist.contains("login"))
            {
                if (!flag1)
                {
                    try
                    {
                        doAutoLogin(uri);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        PLog.error(uri, "exception occurred", new Object[0]);
                        goHomeAndFinish();
                    }
                } else
                {
                    String s = uri.getQueryParameter("next");
                    if (StringUtils.isNotEmpty(s))
                    {
                        uri = s;
                        if (!s.contains("//pinterest.com"))
                        {
                            uri = (new StringBuilder("http://pinterest.com")).append(s).toString();
                        }
                        uri = Uri.parse(uri);
                        if (uri != null)
                        {
                            init(uri);
                            return;
                        }
                    }
                    goHomeAndFinish();
                }
            } else
            {
                ActivityHelper.goWebView(this, uri, null);
                finish();
            }
            trackAction("secure");
            return;
        }
        if (handleNewPassword(arraylist, uri))
        {
            trackAction("pw");
            return;
        }
        if (handleSitemapLink(arraylist))
        {
            trackAction("sitemap");
            return;
        }
        if (handleInvite(arraylist, uri))
        {
            trackAction("invited");
            return;
        }
        s2 = uri.getHost();
        if (shouldHandleInWebView(s2))
        {
            ActivityHelper.goWebView(this, uri, null);
            finish();
            return;
        }
        s1 = s2;
        obj = uri;
        if ("pinterest".equals(uri.getScheme())) goto _L4; else goto _L3
_L3:
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        if (!s2.equals("http")) goto _L6; else goto _L5
_L5:
        obj = Uri.parse(uri.toString().replace("http://", ""));
        s1 = ((Uri) (obj)).getHost();
_L4:
        if (s1.contains("facebook"))
        {
            trackAction("facebook");
            if (!flag1)
            {
                goSplash();
                finish();
                return;
            } else
            {
                goHomeAndFinish();
                return;
            }
        }
        break MISSING_BLOCK_LABEL_439;
_L6:
        s1 = s2;
        obj = uri;
        if (s2.length() <= 0) goto _L4; else goto _L7
_L7:
        s1 = s2;
        obj = uri;
        if (s2.contains("pinterest")) goto _L4; else goto _L8
_L8:
        goHomeAndFinish();
        ActivityHelper.goIntentView(this, uri);
        return;
        goHomeAndFinish();
        return;
        String s3 = ((Uri) (obj)).getQueryParameter("url");
        if (ModelHelper.isValid(s3))
        {
            trackAction("redirect");
            if (!flag1)
            {
                goSplash();
                return;
            }
            if (s1.contains("pinit") || arraylist.contains("pinit") || arraylist.contains("pin"))
            {
                uri = new Intent(this, com/pinterest/activity/create/PinItActivity);
                uri.putExtra("android.intent.extra.TEXT", s3);
                s1 = ((Uri) (obj)).getQueryParameter("description");
                if (ModelHelper.isValid(s1))
                {
                    uri.putExtra("com.pinterest.EXTRA_DESCRIPTION", s1);
                }
                s1 = ((Uri) (obj)).getQueryParameter("media");
                if (ModelHelper.isValid(s1))
                {
                    uri.putExtra("com.pinterest.EXTRA_IMAGE", s1);
                }
                obj = ((Uri) (obj)).getQueryParameter("method");
                if (ModelHelper.isValid(obj))
                {
                    uri.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", ((String) (obj)));
                }
                startActivity(uri);
                finish();
                return;
            }
            if (arraylist.contains("offsite"))
            {
                ActivityHelper.gotoBrowser(this, s3);
                return;
            }
        }
        if (!handleShortcuts(((Uri) (obj)), s1, arraylist) && !handleSearch(((Uri) (obj)), arraylist) && !handlePinPick(((Uri) (obj)), arraylist) && !handleConversation(arraylist) && !handleNews(arraylist) && !handleInterestAndCategory(arraylist) && !handleShopSpace(arraylist))
        {
            boolean flag;
            if (arraylist.size() >= 2 && "follow".equalsIgnoreCase((String)arraylist.get(0)))
            {
                arraylist.remove(0);
                flag = true;
            } else
            {
                flag = false;
            }
            if (arraylist.contains("pin"))
            {
                trackAction("pin");
                if (arraylist.size() >= 2)
                {
                    loadPin(((Uri) (obj)), arraylist, flag1);
                    return;
                } else
                {
                    goHomeAndFinish();
                    return;
                }
            }
            if (arraylist.size() == 1 && ((String)arraylist.get(0)).equalsIgnoreCase("about"))
            {
                ActivityHelper.gotoBrowser(this, ((Uri) (obj)));
                trackAction("about");
                return;
            }
            if (arraylist.size() == 1)
            {
                _isOcf = flag;
                loadUser(((Uri) (obj)), arraylist);
                trackAction("user");
                return;
            }
            if (arraylist.size() == 2)
            {
                _isOcf = flag;
                loadBoard(((Uri) (obj)), arraylist);
                if (!flag1)
                {
                    MyUserApi.a(new com.pinterest.api.remote.MyUserApi.BoardInviteFeedResponse(), getApiTag());
                }
                trackAction("board");
                return;
            } else
            {
                goHomeAndFinish();
                trackAction("others");
                return;
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getIntent() == null)
        {
            return;
        } else
        {
            init(getIntent().getData());
            return;
        }
    }

    public void onNewIntent(Intent intent)
    {
        setIntent(intent);
    }







/*
    static boolean access$402(WebhookActivity webhookactivity, boolean flag)
    {
        webhookactivity._isOcf = flag;
        return flag;
    }

*/



    private class _cls8 extends BaseApiResponseHandler
    {

        final WebhookActivity this$0;
        final Uri val$uri;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            CrashReporting.a(throwable);
            goHomeAndFinish();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = (PinterestJsonObject)apiresponse.getData();
            if (apiresponse == null)
            {
                class _cls1 extends com.pinterest.api.remote.MyUserApi.MyUserApiResponse
                {

                    final _cls8 this$1;

                    public void onFailure(Throwable throwable, ApiResponse apiresponse1)
                    {
                        super.onFailure(throwable, apiresponse1);
                        goHomeAndFinish();
                    }

                    public void onSuccess(User user)
                    {
                        super.onSuccess(user);
                        user = uri.getQueryParameter("next");
                        if (StringUtils.isNotEmpty(user))
                        {
                            user = Uri.parse(user);
                            if (user != null)
                            {
                                init(user);
                                return;
                            }
                        }
                        goHomeAndFinish();
                    }

                _cls1()
                {
                    this$1 = _cls8.this;
                    super();
                }
                }

                try
                {
                    onFailure(new Throwable(""), new PinterestJsonObject());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ApiResponse apiresponse)
                {
                    onFailure(new Throwable(""), new PinterestJsonObject());
                }
                break MISSING_BLOCK_LABEL_96;
            }
            MyUser.setAccessToken(apiresponse.a("access_token", ""));
            MyUserApi.a(new _cls1(), getApiTag());
            PWidgetHelper.notifyWidgetStateChange(WebhookActivity.this);
            return;
        }

        _cls8()
        {
            this$0 = WebhookActivity.this;
            uri = uri1;
            super();
        }
    }


    private class _cls4 extends com.pinterest.api.remote.InterestsApi.InterestApiResponseHandler
    {

        final WebhookActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            goHomeAndFinish();
        }

        public void onSuccess(Interest interest)
        {
            if (interest != null)
            {
                interest = new Navigation(Location.INTEREST, interest);
                goNavigationAndFinish(interest);
            }
            finish();
        }

        _cls4(boolean flag)
        {
            this$0 = WebhookActivity.this;
            super(flag);
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final WebhookActivity this$0;

        private void doOnError()
        {
            goHomeAndFinish();
        }

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            doOnError();
        }

        public void onSuccess(final PinterestJsonObject response)
        {
            super.onSuccess(response);
            class _cls1 extends BackgroundTask
            {

                final _cls2 this$1;
                final PinterestJsonObject val$response;

                public void run()
                {
                    Object obj;
                    obj = response.c("data");
                    if (obj == null)
                    {
                        doOnError();
                        return;
                    }
                    obj = Story.make(((PinterestJsonObject) (obj)));
                    int i;
                    if (obj == null || ((Story) (obj)).getMainObjectType() == null)
                    {
                        i = -1;
                    } else
                    {
                        i = ((Story) (obj)).getMainObjectType().intValue();
                    }
                    i;
                    JVM INSTR tableswitch 0 2: default 68
                //                               0 87
                //                               1 116
                //                               2 131;
                       goto _L1 _L2 _L3 _L4
_L1:
                    doOnError();
                    return;
_L2:
                    obj = new Navigation(Location.STORY_PINS, ((com.pinterest.api.model.Model) (obj)));
_L6:
                    WebhookActivity.trackAction("news");
                    goNavigationAndFinish(((Navigation) (obj)));
                    return;
_L3:
                    obj = new Navigation(Location.STORY_BOARDS, ((com.pinterest.api.model.Model) (obj)));
                    continue; /* Loop/switch isn't completed */
_L4:
                    obj = new Navigation(Location.STORY_USERS, ((com.pinterest.api.model.Model) (obj)));
                    if (true) goto _L6; else goto _L5
_L5:
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    response = pinterestjsonobject;
                    super();
                }
            }

            (new _cls1()).execute();
        }


        _cls2()
        {
            this$0 = WebhookActivity.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.CommerceApi.ShopSpaceCollectionItemApiResponse
    {

        final WebhookActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            finish();
        }

        public void onSuccess(ShopCollectionItem shopcollectionitem)
        {
            super.onSuccess(shopcollectionitem);
            if (shopcollectionitem == null)
            {
                finish();
                return;
            } else
            {
                WebhookActivity.trackAction("shop_space_collection");
                shopcollectionitem = ShopSpaceNavigationHelper.getNavigation(shopcollectionitem);
                Intent intent = ActivityHelper.getHomeIntent(WebhookActivity.this);
                intent.putExtra("com.pinterest.EXTRA_PENDING_TASK", shopcollectionitem);
                startActivity(intent);
                finish();
                return;
            }
        }

        _cls3()
        {
            this$0 = WebhookActivity.this;
            super();
        }
    }


    private class _cls7 extends com.pinterest.api.remote.BoardApi.BoardApiResponse
    {

        final WebhookActivity this$0;
        final List val$segments;
        final Uri val$uri;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (!NetworkUtils.getInstance().hasInternet())
            {
                super.onFailure(throwable, apiresponse);
                finish();
                return;
            } else
            {
                loadUser(uri, segments);
                return;
            }
        }

        public void onFinish()
        {
        }

        public void onSuccess(Board board)
        {
            super.onSuccess(board);
            if (board != null)
            {
                board = new Navigation(Location.BOARD, board);
                Intent intent = ActivityHelper.getHomeIntent(WebhookActivity.this);
                intent.putExtra("com.pinterest.EXTRA_PENDING_TASK", board);
                OcfUtils.addOcfFlag(intent, _isOcf);
                _isOcf = false;
                WebhookActivity.trackAction("board");
                startActivity(intent);
            }
            finish();
        }

        _cls7(List list)
        {
            this$0 = WebhookActivity.this;
            uri = uri1;
            segments = list;
            super(final_flag);
        }
    }


    private class _cls5 extends com.pinterest.api.remote.PinApi.PinApiResponse
    {

        final WebhookActivity this$0;
        final boolean val$isAuthenticated;
        final List val$segmentsCopy;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            finish();
        }

        public void onSuccess(Pin pin)
        {
            super.onSuccess(pin);
            if (isAuthenticated && segmentsCopy.contains("repin"))
            {
                Intent intent = ActivityHelper.getRepinDialogIntent(WebhookActivity.this);
                intent.putExtra("com.pinterest.EXTRA_PIN_ID", pin.getUid());
                pin = intent;
            } else
            {
                pin = new Navigation(Location.PIN, pin);
                pin = ActivityHelper.getTaskIntent(WebhookActivity.this, pin);
            }
            startActivity(pin);
            WebhookActivity.trackAction("pin");
            finish();
        }

        _cls5(List list)
        {
            this$0 = WebhookActivity.this;
            isAuthenticated = flag1;
            segmentsCopy = list;
            super(final_flag);
        }
    }


    private class _cls6 extends com.pinterest.api.remote.UserApi.UserApiResponse
    {

        final WebhookActivity this$0;
        final Uri val$uri;

        public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
        {
            if (!NetworkUtils.getInstance().hasInternet())
            {
                super.onFailure(throwable, pinterestjsonobject);
                finish();
                return;
            }
            throwable = uri;
            if (uri.getScheme().equalsIgnoreCase("pinterest"))
            {
                throwable = Uri.parse(uri.toString().replaceFirst("pinterest", "https"));
            }
            ActivityHelper.gotoBrowser(WebhookActivity.this, throwable);
        }

        public void onSuccess(User user)
        {
            super.onSuccess(user);
            user = new Navigation(Location.USER, user);
            Intent intent = ActivityHelper.getHomeIntent(WebhookActivity.this);
            intent.putExtra("com.pinterest.EXTRA_PENDING_TASK", user);
            OcfUtils.addOcfFlag(intent, _isOcf);
            _isOcf = false;
            startActivity(intent);
            WebhookActivity.trackAction("user");
            finish();
        }

        _cls6(Uri uri1)
        {
            this$0 = WebhookActivity.this;
            uri = uri1;
            super(final_flag);
        }
    }


    private class _cls1 extends HashSet
    {

        _cls1()
        {
            add("user");
            add("board");
            add("pin");
            add("conversation");
        }
    }

}
