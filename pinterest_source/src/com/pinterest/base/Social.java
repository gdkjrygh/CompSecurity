// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.facebook.Session;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.invites.InviteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Social
{

    private static final HashMap APP_PACKAGE_TO_INVITE_CHANNEL_MAP = new _cls2();
    public static final String DEFAULT_EMAIL_PACKAGE = "com.android.email";
    public static final String DEFAULT_SMS_PACKAGE = "com.android.mms";
    public static final String FACEBOOK_PACKAGE = "com.facebook.katana";
    public static final String FB_APP_ID = "274266067164";
    public static final String FB_PUBLISH = "publish_actions";
    public static final List FB_READ_PERMISSIONS = Collections.unmodifiableList(new _cls3());
    public static final List FB_REQUIRED_PERMISSIONS = Collections.unmodifiableList(new _cls4());
    public static final List FB_STREAM_PERMISSIONS = Collections.unmodifiableList(new _cls5());
    public static final String GMAIL_PACKAGE = "com.google.android.gm";
    public static final String G_CLIENT_ID = "694505692171-0sais4o9h31deb9pjarv5fhg8tpigj4o.apps.googleusercontent.com";
    public static final String G_PLUS_ACTIONS = "http://schemas.google.com/AddActivity";
    public static final String G_PLUS_EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
    public static final String G_PLUS_ID_SCOPE = "audience:server:client_id:694505692171-31closf3bcmlt59aeulg2j81ej68j6hk.apps.googleusercontent.com";
    public static final String G_PLUS_SCOPE = "https://www.googleapis.com/auth/plus.login";
    public static final String G_PLUS_SCOPES = "oauth2:server:client_id:694505692171-31closf3bcmlt59aeulg2j81ej68j6hk.apps.googleusercontent.com:api_scope:https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/userinfo.email";
    public static final String G_PLUS_SCOPES_SIMPLE = "oauth2:https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/userinfo.email";
    public static final String G_PLUS_USERINFO_SCOPE = "https://www.googleapis.com/auth/userinfo.profile";
    public static final String G_SERVER_CLIENT_ID = "694505692171-31closf3bcmlt59aeulg2j81ej68j6hk.apps.googleusercontent.com";
    public static final String HANGOUTS_PACKAGE = "com.google.android.babel";
    public static final String LINE_PACKAGE = "jp.naver.line.android";
    public static final String MESSENGER_PACKAGE = "com.facebook.orca";
    public static final String OAUTH_CALLBACK_PREFIX = "http://www.pinterest.com/android_app_oauth/";
    public static final String OAUTH_TEST_CALLBACK_PREFIX = "http://www.pinterdev.com/android_app_oauth/";
    public static final String RAKUTEN_API_BASE = "https://app.rakuten.co.jp/engine/api/";
    public static final String RAKUTEN_API_KEY = "pinterest";
    public static final String RAKUTEN_API_SECRET = "i6UHWChXFhPOloTCtkC7fQHoBBAsy0AIDSPCxIhC";
    public static final String RAKUTEN_BASIC_INFO = "https://app.rakuten.co.jp/engine/api/MemberInformation/GetBasicInfo/20110601";
    public static final String RAKUTEN_CALLBACK = "http://www.pinterest.com/android_app_oauth/rakuten";
    public static final String RAKUTEN_EMAIL_INFO = "https://app.rakuten.co.jp/engine/api/MemberInformation/GetMail/20110601";
    public static final String RAKUTEN_ID_INFO = "https://app.rakuten.co.jp/engine/api/IdInformation/GetOpenID/20110601";
    public static final String RAKUTEN_NAME_INFO = "https://app.rakuten.co.jp/engine/api/MemberInformation/GetName/20110601";
    public static final String RAKUTEN_SCOPE = "idinfo_read_openid,memberinfo_read_basic,memberinfo_read_name,memberinfo_read_mail,90days@Access,90days@Refresh";
    public static final String RAKUTEN_TEST_API_KEY = "pinterest_test";
    public static final String RAKUTEN_TEST_API_SECRET = "D6PRiub4HnQ2vmRh_1eSX2wttUJzXEHAgGSFkWFN5pnP";
    public static final String RAKUTEN_TEST_CALLBACK = "http://www.pinterdev.com/android_app_oauth/rakuten";
    public static final List RANKDED_APP_LIST = new _cls1();
    public static final String TWITTER_API_KEY = "Zr6TVkMT2KhKIZwERTB8IQ";
    public static final String TWITTER_API_SECRET = "WYmVb7f0a1JOUVpMBJaG699SlL6xu8hAyX83gNCGQ0";
    public static final String TWITTER_CALLBACK = "oauth://twitter";
    public static final String TWITTER_INFO = "https://api.twitter.com/1.1/account/verify_credentials.json";
    public static final String TWITTER_PACKAGE = "com.twitter.android";
    public static final String WECHAT_PACKAGE = "com.tencent.mm";
    public static final String WHATSAPP_PACKAGE = "com.whatsapp";

    public Social()
    {
    }

    public static InviteChannel getInviteChannelFromAppPackage(String s)
    {
        if (APP_PACKAGE_TO_INVITE_CHANNEL_MAP.containsKey(s))
        {
            return (InviteChannel)APP_PACKAGE_TO_INVITE_CHANNEL_MAP.get(s);
        } else
        {
            return InviteChannel.OTHER;
        }
    }

    public static ArrayList getMissingPermissions(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null)
        {
            return arraylist;
        }
        Iterator iterator = FB_REQUIRED_PERMISSIONS.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!list.contains(s))
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }

    public static void init()
    {
        Session session = Session.getActiveSession();
        if (session != null)
        {
            session.closeAndClearTokenInformation();
        }
    }

    public static boolean isPublishPermission(List list)
    {
        return list.contains("publish_actions");
    }

    public static void tryCloseFacebookSession()
    {
        Session session;
label0:
        {
            PLog.info("FB tryCloseFacebookSession", new Object[0]);
            session = Session.getActiveSession();
            if (session != null && session.isOpened())
            {
                if (!MyUser.isConnectedToFacebook())
                {
                    break label0;
                }
                session.close();
            }
            return;
        }
        session.closeAndClearTokenInformation();
    }


    private class _cls1 extends ArrayList
    {

        _cls1()
        {
            add("com.whatsapp");
            add("com.facebook.orca");
            add("com.facebook.katana");
            add("com.twitter.android");
            add("com.tencent.mm");
            add("jp.naver.line.android");
            add("com.google.android.babel");
            add("com.google.android.gm");
            add("com.android.email");
            add("com.android.mms");
        }
    }


    private class _cls2 extends HashMap
    {

        _cls2()
        {
            put("com.whatsapp", InviteChannel.WHATSAPP);
            put("com.facebook.orca", InviteChannel.FACEBOOK_MESSENGER);
            put("com.facebook.katana", InviteChannel.FACEBOOK);
            put("com.twitter.android", InviteChannel.TWITTER);
            put("jp.naver.line.android", InviteChannel.LINE);
            put("com.google.android.babel", InviteChannel.SMS);
            put("com.google.android.gm", InviteChannel.EMAIL_APP);
            put("com.android.email", InviteChannel.EMAIL_APP);
            put("com.android.mms", InviteChannel.SMS);
        }
    }


    private class _cls3 extends ArrayList
    {

        _cls3()
        {
            add("public_profile");
            add("email");
            add("user_likes");
            add("user_birthday");
            add("user_friends");
        }
    }


    private class _cls4 extends ArrayList
    {

        _cls4()
        {
            add("email");
        }
    }


    private class _cls5 extends ArrayList
    {

        _cls5()
        {
            add("publish_actions");
        }
    }

}
