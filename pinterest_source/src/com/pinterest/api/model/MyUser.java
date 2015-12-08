// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.text.TextUtils;
import com.pinterest.api.ApiClient;
import com.pinterest.common.async.BackgroundResult;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.offline.OfflineDataRetriever;
import com.pinterest.reporting.CrashReporting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import storm.trident.util.LRUMap;

// Referenced classes of package com.pinterest.api.model:
//            User, ModelHelper

public class MyUser
{

    public static final String EMAIL_COLLABORATION_INVITE = "email_collaboration_invite";
    public static final String EMAIL_COMMENTS = "email_comments";
    public static final String EMAIL_DAILY = "daily";
    public static final String EMAIL_ENABLED = "email_enabled";
    public static final String EMAIL_FEEDBACK_AND_RESEARCH = "email_feedback_and_research";
    public static final String EMAIL_FOLLOWS = "email_follows";
    public static final String EMAIL_FRIENDS_JOINING = "email_friends_joining";
    public static final String EMAIL_IMMEDIATE = "immediate";
    public static final String EMAIL_INTERVAL = "email_interval";
    public static final String EMAIL_LIKES = "email_likes";
    public static final String EMAIL_NEWS = "email_news";
    public static final String EMAIL_PRODUCT_CHANGES = "email_product_changes";
    public static final String EMAIL_REPINS = "email_repins";
    public static final String EMAIL_SHARES = "email_shares";
    public static final String EMAIL_SUGGESTIONS = "email_suggestions";
    public static final String EMAIL_UPDATES = "email_updates";
    private static final int RECENT_INTEREST_SIZE = 6;
    private static String _gplusAccount;
    private static boolean _loggedIn;
    private static User _myUser;
    private static String _myUserId;
    private static final List noSaveCategories;

    public MyUser()
    {
    }

    public static void addLastUsedBoard(String s)
    {
        Object obj = DiskCache.getSerializable("MY_USED_BOARDS_v2");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(3);
        }
        ((LRUMap) (obj)).put(s, Long.valueOf(System.currentTimeMillis()));
        DiskCache.setSerializable("MY_USED_BOARDS_v2", ((java.io.Serializable) (obj)));
    }

    public static void addLastUsedCategory(String s)
    {
        if (noSaveCategories.contains(s))
        {
            return;
        }
        Object obj = DiskCache.getSerializable("MY_USED_CATEGORIES_v2");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(3);
        }
        ((LRUMap) (obj)).put(s, Long.valueOf(System.currentTimeMillis()));
        DiskCache.setSerializable("MY_USED_CATEGORIES_v2", ((java.io.Serializable) (obj)));
    }

    public static void addLastUsedInterest(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return;
        }
        Object obj = DiskCache.getSerializable("MY_USED_INTERESTS");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(6);
        }
        ((LRUMap) (obj)).put(s, Long.valueOf(System.currentTimeMillis()));
        DiskCache.setSerializable("MY_USED_INTERESTS", ((java.io.Serializable) (obj)));
    }

    public static void clearAccessToken()
    {
        ApiClient.a(null);
        Preferences.user().remove("PREF_ACCESSTOKEN");
    }

    public static User get()
    {
        if (_myUser != null) goto _L2; else goto _L1
_L1:
        User user = User.make(getJson(), false);
        if (user != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        _myUser = user;
        if (user == null || !ModelHelper.isValid(_myUser.getUid())) goto _L3; else goto _L2
_L2:
        return _myUser;
    }

    public static String getAccessToken()
    {
        return Preferences.user().getString("PREF_ACCESSTOKEN", null);
    }

    public static String getGPlusAccount()
    {
        if (_gplusAccount == null)
        {
            _gplusAccount = Preferences.user().getString("PREF_GPLUS_ACCOUNT", null);
        }
        return _gplusAccount;
    }

    public static PinterestJsonObject getJson()
    {
        PinterestJsonObject pinterestjsonobject;
        try
        {
            pinterestjsonobject = new PinterestJsonObject(Preferences.user().getString("PREF_MY_USER", ""));
        }
        catch (Exception exception)
        {
            return null;
        }
        return pinterestjsonobject;
    }

    public static PinterestJsonObject getJsonUserSettings()
    {
        PinterestJsonObject pinterestjsonobject;
        try
        {
            pinterestjsonobject = new PinterestJsonObject(Preferences.user().getString("PREF_MY_USER_SETTINGS", ""));
        }
        catch (Exception exception)
        {
            return null;
        }
        return pinterestjsonobject;
    }

    public static String getLastSelectedBoardId()
    {
        String s;
        try
        {
            s = Preferences.user().getString("PREF_LAST_BOARD", null);
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public static String getLastSelectedCategoryKey()
    {
        String s;
        try
        {
            s = Preferences.user().getString("PREF_LAST_CATEGORY", null);
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public static void getLastUsedBoards(final BackgroundResult handler)
    {
        (new _cls1()).execute();
    }

    public static List getLastUsedBoardsBlocking()
    {
        Object obj = DiskCache.getSerializable("MY_USED_BOARDS_v2");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(3);
        }
        obj = new ArrayList(((LRUMap) (obj)).keySet());
        if (((List) (obj)).size() == 0 || !(((List) (obj)).get(0) instanceof String))
        {
            if (((List) (obj)).size() != 0)
            {
                DiskCache.delete("MY_USED_BOARDS_v2");
            }
            return new ArrayList();
        } else
        {
            obj = new ArrayList(((java.util.Collection) (obj)));
            Collections.reverse(((List) (obj)));
            return ModelHelper.getBoards(((List) (obj)));
        }
    }

    public static void getLastUsedCategories(final BackgroundResult handler)
    {
        (new _cls2()).execute();
    }

    public static List getLastUsedCategoriesBlocking()
    {
        Object obj = DiskCache.getSerializable("MY_USED_CATEGORIES_v2");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(3);
        }
        obj = new ArrayList(((LRUMap) (obj)).keySet());
        if (((List) (obj)).size() == 0 || !(((List) (obj)).get(0) instanceof String))
        {
            if (((List) (obj)).size() != 0)
            {
                DiskCache.delete("MY_USED_CATEGORIES_v2");
            }
            return new ArrayList();
        } else
        {
            obj = new ArrayList(((java.util.Collection) (obj)));
            Collections.reverse(((List) (obj)));
            return ModelHelper.getCategories(((List) (obj)));
        }
    }

    public static void getLastUsedInterests(final BackgroundResult handler)
    {
        (new _cls3()).execute();
    }

    public static List getLastUsedInterestsBlocking()
    {
        Object obj = DiskCache.getSerializable("MY_USED_INTERESTS");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(6);
        }
        obj = new ArrayList(((LRUMap) (obj)).keySet());
        if (((List) (obj)).size() == 0 || !(((List) (obj)).get(0) instanceof String))
        {
            if (((List) (obj)).size() != 0)
            {
                DiskCache.delete("MY_USED_INTERESTS");
            }
            return new ArrayList();
        } else
        {
            obj = new ArrayList(((java.util.Collection) (obj)));
            Collections.reverse(((List) (obj)));
            return ModelHelper.getInterests(((List) (obj)));
        }
    }

    public static String getUid()
    {
        if (_myUser != null && ModelHelper.isValid(_myUser.getUid()))
        {
            return _myUser.getUid();
        }
        if (!ModelHelper.isValid(_myUserId))
        {
            try
            {
                Long long1 = Long.valueOf(Preferences.user().getLong("PREF_MY_ID", 0L));
                if (long1.longValue() != 0L)
                {
                    _myUserId = String.valueOf(long1);
                }
            }
            catch (Exception exception1) { }
            if (StringUtils.isEmpty(_myUserId) || _myUserId.equals("0"))
            {
                try
                {
                    _myUserId = Preferences.user().getString("PREF_MY_ID", "");
                }
                catch (Exception exception) { }
            }
        }
        return _myUserId;
    }

    public static boolean hasAccessToken()
    {
        return !TextUtils.isEmpty(ApiClient.c());
    }

    public static boolean hasAccessTokenAndUser()
    {
        return hasAccessToken() && get() != null;
    }

    public static boolean hasFollowing()
    {
        return get() != null && get().getFollowingCountDisplay() > 0;
    }

    public static boolean isConnectedToFacebook()
    {
        return Preferences.user().getBoolean("PREF_CONNETED_FACEBOOK", false);
    }

    public static boolean isConnectedToFacebookSt()
    {
        boolean flag = false;
        if (Preferences.user().getBoolean("PREF_CONNETED_FACEBOOK", false))
        {
            flag = Preferences.user().getBoolean("PREF_CONNETED_FACEBOOK_ST", false);
        }
        return flag;
    }

    public static boolean isConnectedToGplus()
    {
        return Preferences.user().getBoolean("PREF_CONNETED_GPLUS", false);
    }

    public static boolean isConnectedToRakuten()
    {
        return Preferences.user().getBoolean("PREF_CONNETED_RAKUTEN", false);
    }

    public static boolean isConnectedToTwitter()
    {
        return Preferences.user().getBoolean("PREF_CONNETED_TWITTER", false);
    }

    public static boolean isConnectingToGplus()
    {
        return Preferences.user().getBoolean("PREF_CONNETING_GPLUS", false);
    }

    public static boolean isEmployee()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (_myUser != null)
        {
            flag = flag1;
            if (_myUser.getIsEmployee() == Boolean.TRUE)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean isLoggedIn()
    {
        return _loggedIn;
    }

    public static boolean isUserMe(User user)
    {
        return user != null && isUserMe(user.getUid());
    }

    public static boolean isUserMe(String s)
    {
        if (!ModelHelper.isValid(getUid()) || !ModelHelper.isValid(s))
        {
            return false;
        } else
        {
            return s.equals(getUid());
        }
    }

    public static void onLogout()
    {
        setLoggedIn(false);
        Preferences.user().clear();
        OfflineDataRetriever.d().b();
        _myUserId = null;
        _myUser = null;
    }

    public static void saveMe(User user, PinterestJsonObject pinterestjsonobject)
    {
        _myUser = user;
        android.content.SharedPreferences.Editor editor = Preferences.user().edit();
        editor.putString("PREF_MY_USER", pinterestjsonobject.toString());
        editor.remove("PREF_MY_ID");
        editor.putString("PREF_MY_ID", user.getUid());
        editor.putString("PREF_MY_USERNAME", user.getUsername());
        user = pinterestjsonobject.c("data");
        if (user != null)
        {
            pinterestjsonobject = user;
        }
        editor.putBoolean("PREF_CONNETED_FACEBOOK", pinterestjsonobject.a("connected_to_facebook", Boolean.valueOf(isConnectedToFacebook())).booleanValue());
        editor.putBoolean("PREF_CONNETED_FACEBOOK_ST", pinterestjsonobject.a("facebook_publish_stream_enabled", Boolean.valueOf(isConnectedToFacebookSt())).booleanValue());
        editor.putBoolean("PREF_CONNETED_GPLUS", pinterestjsonobject.a("connected_to_gplus", Boolean.valueOf(isConnectedToGplus())).booleanValue());
        editor.putBoolean("PREF_CONNETED_TWITTER", pinterestjsonobject.a("connected_to_twitter", Boolean.valueOf(isConnectedToTwitter())).booleanValue());
        editor.putBoolean("PREF_CONNETED_RAKUTEN", pinterestjsonobject.a("connected_to_rakuten", Boolean.valueOf(isConnectedToTwitter())).booleanValue());
        editor.commit();
        CrashReporting.a(_myUser.getUsername());
    }

    public static void saveUserSettingsMe(PinterestJsonObject pinterestjsonobject)
    {
        Preferences.user().set("PREF_MY_USER_SETTINGS", pinterestjsonobject.toString());
    }

    public static void setAccessToken(String s)
    {
        ApiClient.a(s);
        Preferences.user().set("PREF_ACCESSTOKEN", ApiClient.c());
    }

    public static void setFacebookSt(boolean flag)
    {
        Preferences.user().set("PREF_CONNETED_FACEBOOK_ST", flag);
    }

    public static void setGPlusAccount(String s)
    {
        _gplusAccount = s;
        Preferences.user().set("PREF_GPLUS_ACCOUNT", s);
    }

    public static void setLastSelectedBoardId(String s)
    {
        Preferences.user().set("PREF_LAST_BOARD", s);
    }

    public static void setLastSelectedCategoryKey(String s)
    {
        if (noSaveCategories.contains(s))
        {
            return;
        } else
        {
            Preferences.user().set("PREF_LAST_CATEGORY", s);
            return;
        }
    }

    public static void setLoggedIn(boolean flag)
    {
        _loggedIn = flag;
    }

    public static boolean shouldShareFacebook()
    {
        if (!Preferences.user().getBoolean("PREF_CONNETED_FACEBOOK", false) || !isConnectedToFacebookSt())
        {
            return false;
        } else
        {
            return Preferences.user().getBoolean("PREF_SHARE_FACEBOOK", false);
        }
    }

    public static boolean shouldShareTwitter()
    {
        boolean flag = false;
        if (Preferences.user().getBoolean("PREF_CONNETED_TWITTER", false))
        {
            flag = Preferences.user().getBoolean("PREF_SHARE_TWITTER", false);
        }
        return flag;
    }

    public static void updateMe(PinterestJsonObject pinterestjsonobject)
    {
        _myUser = get();
        pinterestjsonobject = User.make(pinterestjsonobject, false, false);
        pinterestjsonobject.setUid(_myUserId);
        User.merge(pinterestjsonobject, _myUser);
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        noSaveCategories = arraylist;
        arraylist.add("popular");
        noSaveCategories.add("everything");
    }

    private class _cls1 extends BackgroundTask
    {

        List _boards;
        final BackgroundResult val$handler;

        public final void onFinish()
        {
            handler.onFinish(_boards);
        }

        public final void run()
        {
            _boards = MyUser.getLastUsedBoardsBlocking();
        }

        _cls1()
        {
            handler = backgroundresult;
            super();
            _boards = new ArrayList();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        List _categories;
        final BackgroundResult val$handler;

        public final void onFinish()
        {
            handler.onFinish(_categories);
        }

        public final void run()
        {
            _categories = MyUser.getLastUsedCategoriesBlocking();
        }

        _cls2()
        {
            handler = backgroundresult;
            super();
            _categories = new ArrayList();
        }
    }


    private class _cls3 extends BackgroundTask
    {

        List _interests;
        final BackgroundResult val$handler;

        public final void onFinish()
        {
            handler.onFinish(_interests);
        }

        public final void run()
        {
            _interests = MyUser.getLastUsedInterestsBlocking();
        }

        _cls3()
        {
            handler = backgroundresult;
            super();
            _interests = new ArrayList();
        }
    }

}
