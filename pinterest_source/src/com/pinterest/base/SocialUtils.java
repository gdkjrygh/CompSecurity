// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.invites.InviteCategory;
import com.pinterest.schemas.invites.InviteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.base:
//            Device, Application, Social

public class SocialUtils
{

    public static final SocialUtils INSTANCE = new SocialUtils(Preferences.persisted());
    static final int MAX_APP_PREFERENCES = 3;
    public static final int MAX_SEND_APP = 2;
    static final int MAX_SEND_SHARE_APP = 7;
    public static final int MAX_SHARE_APP = 3;
    private final PreferencesManager preferencesManager;

    public SocialUtils(PreferencesManager preferencesmanager)
    {
        preferencesManager = preferencesmanager;
    }

    private static String attachTracking(String s)
    {
        String s2 = (new StringBuilder("?s=")).append(String.valueOf(Device.getAppTypeInt())).toString();
        String s1 = s2;
        if (!StringUtils.isEmpty(s))
        {
            s1 = (new StringBuilder()).append(s2).append(getMedium(s)).toString();
        }
        return s1;
    }

    private static Bundle buildShareBundle(SendableObject sendableobject, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("invite_object", sendableobject.getInviteObject().getValue());
        bundle.putString("invite_code", s);
        return bundle;
    }

    private static Intent buildShareIntent(PinterestJsonObject pinterestjsonobject)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", pinterestjsonobject.a("message", ""));
        intent.putExtra("android.intent.extra.SUBJECT", pinterestjsonobject.a("title", ""));
        return intent;
    }

    private static String capDescription(String s)
    {
        String s1 = s;
        if (s.length() > 105)
        {
            s1 = (new StringBuilder()).append(s.substring(0, 100)).append("...").toString();
        }
        s = s1;
        if (s1.length() > 0)
        {
            s = (new StringBuilder()).append(s1).append(" - ").toString();
        }
        return s;
    }

    public static Drawable getAppIcon(String s)
    {
        PackageManager packagemanager = Application.context().getPackageManager();
        try
        {
            s = packagemanager.getApplicationIcon(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static List getAppListForSend()
    {
        return getIconTextList(Social.RANKDED_APP_LIST, 2);
    }

    public static List getAppListForShare()
    {
        return getIconTextList(Social.RANKDED_APP_LIST, 3);
    }

    public static List getIconTextList(List list, int i)
    {
        ArrayList arraylist;
        PackageManager packagemanager;
        arraylist = new ArrayList(list.size());
        packagemanager = Application.context().getPackageManager();
        list = list.iterator();
_L2:
        String s;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s = (String)list.next();
        int j;
        ApplicationInfo applicationinfo = packagemanager.getApplicationInfo(s, 0);
        if (!applicationinfo.enabled)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s1 = (String)packagemanager.getApplicationLabel(applicationinfo);
        arraylist.add(new com.pinterest.adapter.IconTextListAdapter.IconText(packagemanager.getApplicationIcon(applicationinfo), s1, s));
        j = arraylist.size();
        if (j < i)
        {
            continue; /* Loop/switch isn't completed */
        }
        return arraylist;
        NullPointerException nullpointerexception;
        nullpointerexception;
        CrashReporting.a(nullpointerexception, (new StringBuilder("Can't load the app icon from ")).append(s).toString());
        continue; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static ArrayList getInstalledTopApps(int i)
    {
        ArrayList arraylist = new ArrayList(i);
        Iterator iterator = Social.RANKDED_APP_LIST.iterator();
label0:
        do
        {
            String s;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s = (String)iterator.next();
            } while (!isAppInstalled(s));
            arraylist.add(s);
        } while (arraylist.size() < i);
        return arraylist;
    }

    public static String getMedium(String s)
    {
        return (new StringBuilder("&m=")).append(s.replaceAll("\\s", "").toLowerCase()).toString();
    }

    public static boolean isAppInstalled(String s)
    {
        PackageManager packagemanager = Application.context().getPackageManager();
        try
        {
            packagemanager.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public static boolean isLineInstalledInJp()
    {
        return LocaleUtils.isLanguageJa() && isAppInstalled("jp.naver.line.android");
    }

    public static void shareWithInviteCode(final Context context, final SendableObject sendableObject, final String packageName, final String apiTag)
    {
        String s = sendableObject.getUid();
        context = new _cls1();
        UserApi.a(s, InviteCategory.MESSAGE, sendableObject.getInviteObject(), Social.getInviteChannelFromAppPackage(packageName), context, apiTag);
    }

    public static void startShare(Context context, SendableObject sendableobject, String s, String s1, String s2)
    {
        if (sendableobject != null)
        {
            if (sendableobject.isPin())
            {
                startShare(context, ModelHelper.getPin(sendableobject.getUid()), s, s1, s2);
                return;
            }
            if (sendableobject.isBoard())
            {
                startShare(context, ModelHelper.getBoard(sendableobject.getUid()), s, s1, s2);
                return;
            }
            if (sendableobject.isUser())
            {
                startShare(context, ModelHelper.getUser(sendableobject.getUid()), s, s1, s2);
                return;
            }
        }
    }

    public static void startShare(Context context, Board board, String s, String s1)
    {
        startShare(context, board, s, s1, null);
    }

    public static void startShare(Context context, Board board, String s, String s1, String s2)
    {
        if (board == null)
        {
            return;
        } else
        {
            INSTANCE.saveAppPreference(s1);
            s2 = capDescription((new StringBuilder()).append(Resources.string(0x7f07057e)).append(" ").append(board.getName()).toString());
            board = (new StringBuilder()).append(s2).append(StringUtils.removeEnd(Resources.string(0x7f070738), "/")).append(board.getUrl()).toString();
            board = (new StringBuilder()).append(board).append(attachTracking(s)).toString();
            s = new Bundle();
            s.putInt("invite_object", 1);
            ActivityHelper.doShare(context, board, s, s1);
            return;
        }
    }

    public static void startShare(Context context, Pin pin)
    {
        startShare(context, pin, null, null);
    }

    public static void startShare(Context context, Pin pin, String s, String s1)
    {
        startShare(context, pin, s, s1, null);
    }

    public static void startShare(Context context, Pin pin, String s, String s1, String s2)
    {
        if (pin == null)
        {
            return;
        }
        INSTANCE.saveAppPreference(s1);
        String s4 = capDescription(pin.getDescription());
        String s3 = s4;
        if (!TextUtils.isEmpty(s2))
        {
            s3 = (new StringBuilder()).append(s2).append(" ").append(s4).toString();
        }
        s2 = (new StringBuilder()).append(s3).append(String.format(context.getString(0x7f070749), new Object[] {
            pin.getUid().toString()
        })).toString();
        s = (new StringBuilder()).append(s2).append(attachTracking(s)).toString();
        s2 = new Bundle();
        s2.putString("com.pinterest.EXTRA_PIN_ID", pin.getUid());
        s2.putString("com.pinterest.EXTRA_MESSAGE", pin.getDescription());
        s2.putString("com.pinterest.EXTRA_URL", pin.getImageLargeUrl());
        s2.putInt("invite_object", 0);
        ActivityHelper.doShare(context, s, s2, s1);
    }

    public static void startShare(Context context, User user, String s, String s1)
    {
        startShare(context, user, s, s1, null);
    }

    public static void startShare(Context context, User user, String s, String s1, String s2)
    {
        if (user == null)
        {
            return;
        } else
        {
            INSTANCE.saveAppPreference(s1);
            s2 = capDescription((new StringBuilder()).append(Resources.string(0x7f07057e)).append(" ").append(user.getFullName()).toString());
            user = (new StringBuilder()).append(s2).append(Resources.string(0x7f070738)).append(user.getUsername()).toString();
            user = (new StringBuilder()).append(user).append(attachTracking(s)).toString();
            s = new Bundle();
            s.putInt("invite_object", 2);
            ActivityHelper.doShare(context, user, s, s1);
            return;
        }
    }

    public List getAppListForSendShare()
    {
        return getIconTextList(getPreferredAppList(), 7);
    }

    protected List getPreferredAppList()
    {
        String s = preferencesManager.getString("PREF_APP_PREFERENCES", "");
        List list = Arrays.asList(s.split(","));
        ArrayList arraylist = Lists.newArrayList(Social.RANKDED_APP_LIST);
        if (!TextUtils.isEmpty(s))
        {
            arraylist.removeAll(list);
            arraylist.addAll(0, list);
        }
        return arraylist;
    }

    protected void saveAppPreference(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        ArrayList arraylist = Lists.newArrayList(preferencesManager.getString("PREF_APP_PREFERENCES", "").split(","));
        if (arraylist.contains(s))
        {
            arraylist.remove(s);
        }
        arraylist.add(0, s.toLowerCase());
        s = arraylist.subList(0, Math.min(3, arraylist.size()));
        preferencesManager.set("PREF_APP_PREFERENCES", Joiner.on(',').join(s));
    }




    private class _cls1 extends BaseApiResponseHandler
    {

        final String val$apiTag;
        final Context val$context;
        final String val$packageName;
        final SendableObject val$sendableObject;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.showToast(apiresponse.getMessage());
            Events.post(new com.pinterest.activity.sendshare.SendShareFragment.SendShareDismissEvent());
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            apiresponse = ((ApiResponse) (apiresponse.getData()));
            if (apiresponse instanceof PinterestJsonObject)
            {
                apiresponse = (PinterestJsonObject)apiresponse;
                Intent intent = SocialUtils.buildShareIntent(apiresponse);
                String s = apiresponse.a("invite_code", "");
                if (TextUtils.isEmpty(packageName))
                {
                    ActivityHelper.doCustomShare(context, intent, apiresponse.a("message", ""), SocialUtils.buildShareBundle(sendableObject, s), apiTag);
                } else
                {
                    intent.setPackage(packageName);
                    try
                    {
                        context.startActivity(intent);
                        UserApi.a(InviteCategory.MESSAGE, sendableObject.getInviteObject(), Social.getInviteChannelFromAppPackage(packageName), InviteUtil.getInviteSource(), s, apiTag);
                    }
                    // Misplaced declaration of an exception variable
                    catch (ApiResponse apiresponse)
                    {
                        Application.showToast(Resources.string(0x7f0700b0, new Object[] {
                            AppUtils.getApplicationName(packageName)
                        }));
                    }
                }
                Events.post(new com.pinterest.activity.sendshare.SendShareFragment.SendShareDismissEvent());
            }
        }

        _cls1()
        {
            packageName = s;
            context = context1;
            sendableObject = sendableobject;
            apiTag = s1;
            super();
        }
    }

}
