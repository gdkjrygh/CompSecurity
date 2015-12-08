// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.googlecode.flickrjandroid.people.User;

// Referenced classes of package com.roidapp.cloudlib.common:
//            b

public final class a
{

    private static SharedPreferences a;
    private static b b = new b();

    public static void A(Context context)
    {
        B(context);
        context = a.edit();
        context.remove("com.roidapp.cloudlib.photoOriginal");
        context.apply();
    }

    private static void B(Context context)
    {
        if (a == null)
        {
            a = PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    public static b a()
    {
        return b;
    }

    public static void a(int i1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putInt("instagram-mode", i1);
        editor.apply();
    }

    public static void a(Context context)
    {
        B(context);
        context = a.edit();
        context.remove("instagram-username");
        context.remove("instagram-userId");
        context.remove("instagram-token");
        context.remove("instagram-head");
        context.apply();
    }

    public static void a(Context context, int i1)
    {
        B(context);
        context = a.edit();
        context.putInt("FlickrMode", i1);
        context.apply();
    }

    public static void a(Context context, String s1)
    {
        B(context);
        context = a.edit();
        context.putString("flickrj-android-userName", s1);
        context.apply();
    }

    public static void a(Context context, String s1, String s2)
    {
        B(context);
        context = a.edit();
        context.putString("facebook_user_name", s1);
        context.putString("FbUserId", s2);
        context.apply();
    }

    public static void a(Context context, String s1, String s2, String s3)
    {
        B(context);
        context = a.edit();
        context.putString("twitter_token", s2);
        context.putString("twitter_token_secret", s3);
        context.putString("twitter_user_name", s1);
        context.apply();
    }

    public static void a(Context context, String s1, String s2, String s3, String s4)
    {
        B(context);
        context = a.edit();
        context.putString("instagram-username", s1);
        context.putString("instagram-userId", s2);
        context.putString("instagram-token", s3);
        context.putString("instagram-head", s4);
        context.apply();
    }

    public static void a(String s1, String s2, int i1, String s3, String s4)
    {
        b.a = s1;
        b.c = s2;
        b.b = i1;
        b.d = s3;
        b.e = s4;
    }

    public static String b(Context context)
    {
        B(context);
        return a.getString("instagram-username", "");
    }

    public static void b()
    {
        b.a = "";
        b.c = "";
        b.b = 0;
        b.d = "";
        b.e = "";
    }

    public static void b(Context context, int i1)
    {
        B(context);
        context = a.edit();
        context.putInt("com.roidapp.cloudlib.photoOriginal", i1);
        context.apply();
    }

    public static void b(Context context, String s1)
    {
        B(context);
        context = a.edit();
        context.putString("UserUrl", s1);
        context.apply();
    }

    public static void b(Context context, String s1, String s2)
    {
        context = context.getSharedPreferences("cloudlib_dropbox_prefs", 0).edit();
        context.putString("cloudlib_dropbox_access_key", s1);
        context.putString("cloudlib_dropbox_access_secret", s2);
        context.apply();
    }

    public static void b(Context context, String s1, String s2, String s3, String s4)
    {
        B(context);
        context = a.edit();
        context.putString("flickrj-android-oauthToken", s3);
        context.putString("flickrj-android-tokenSecret", s4);
        context.putString("flickrj-android-userName", s1);
        context.putString("flickrj-android-userId", s2);
        context.apply();
    }

    public static String c(Context context)
    {
        B(context);
        return a.getString("instagram-userId", "");
    }

    public static void c(Context context, String s1)
    {
        B(context);
        context = a.edit();
        context.putString("googleToken", s1);
        context.apply();
    }

    public static String d(Context context)
    {
        B(context);
        return a.getString("instagram-token", "");
    }

    public static void d(Context context, String s1)
    {
        if (context == null)
        {
            return;
        } else
        {
            context = context.getSharedPreferences("cloudlib_dropbox_prefs", 0).edit();
            context.putString("cloudlib_dropbox_user_name", s1);
            context.apply();
            return;
        }
    }

    public static String e(Context context)
    {
        B(context);
        return a.getString("instagram-head", "");
    }

    public static int f(Context context)
    {
        B(context);
        return a.getInt("instagram-mode", 0);
    }

    public static String g(Context context)
    {
        B(context);
        return a.getString("flickrj-android-userName", "");
    }

    public static OAuth h(Context context)
    {
        B(context);
        context = a.getString("flickrj-android-oauthToken", null);
        String s1 = a.getString("flickrj-android-tokenSecret", null);
        Object obj = a.getString("flickrj-android-userName", null);
        String s2 = a.getString("flickrj-android-userId", null);
        if (context == null && s1 == null)
        {
            Log.w("Prefers", "No oauth token retrieved");
            return null;
        }
        OAuth oauth = new OAuth();
        if (s2 != null)
        {
            User user = new User();
            user.setUsername(((String) (obj)));
            user.setId(s2);
            oauth.setUser(user);
        }
        obj = new OAuthToken();
        oauth.setToken(((OAuthToken) (obj)));
        ((OAuthToken) (obj)).setOauthToken(context);
        ((OAuthToken) (obj)).setOauthTokenSecret(s1);
        return oauth;
    }

    public static String i(Context context)
    {
        B(context);
        return a.getString("UserUrl", "");
    }

    public static int j(Context context)
    {
        B(context);
        return a.getInt("FlickrMode", 0);
    }

    public static String k(Context context)
    {
        B(context);
        return a.getString("facebook_user_name", "");
    }

    public static void l(Context context)
    {
        B(context);
        context = a.edit();
        context.remove("facebook_user_name");
        context.remove("FbUserId");
        context.apply();
    }

    public static int m(Context context)
    {
        B(context);
        return a.getInt("select_photo_index", 0);
    }

    public static void n(Context context)
    {
        B(context);
        context = a.edit();
        context.remove("select_photo_index");
        context.apply();
    }

    public static void o(Context context)
    {
        B(context);
        context = a.edit();
        context.remove("twitter_token");
        context.remove("twitter_token_secret");
        context.remove("twitter_user_name");
        context.apply();
    }

    public static boolean p(Context context)
    {
        String s1 = q(context);
        context = r(context);
        return !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(context);
    }

    public static String q(Context context)
    {
        B(context);
        return a.getString("twitter_token", "");
    }

    public static String r(Context context)
    {
        B(context);
        return a.getString("twitter_token_secret", "");
    }

    public static String s(Context context)
    {
        B(context);
        return a.getString("twitter_user_name", "");
    }

    public static String t(Context context)
    {
        B(context);
        return a.getString("Search_Keyword", "");
    }

    public static void u(Context context)
    {
        B(context);
        context = a.edit();
        context.remove("googleToken");
        context.apply();
    }

    public static String v(Context context)
    {
        B(context);
        return a.getString("googleToken", "");
    }

    public static String[] w(Context context)
    {
        Object obj = null;
        context = context.getSharedPreferences("cloudlib_dropbox_prefs", 0);
        String s1 = context.getString("cloudlib_dropbox_access_key", null);
        String s2 = context.getString("cloudlib_dropbox_access_secret", null);
        context = obj;
        if (s1 != null)
        {
            context = obj;
            if (s2 != null)
            {
                context = new String[2];
                context[0] = s1;
                context[1] = s2;
            }
        }
        return context;
    }

    public static String x(Context context)
    {
        return context.getSharedPreferences("cloudlib_dropbox_prefs", 0).getString("cloudlib_dropbox_user_name", null);
    }

    public static void y(Context context)
    {
        context = context.getSharedPreferences("cloudlib_dropbox_prefs", 0).edit();
        context.clear();
        context.apply();
    }

    public static int z(Context context)
    {
        B(context);
        return a.getInt("com.roidapp.cloudlib.photoOriginal", 0);
    }

}
