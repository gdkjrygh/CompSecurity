// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.Context;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.roidapp.baselib.c.aj;
import com.roidapp.cloudlib.common.a;
import java.util.Arrays;
import java.util.Set;

public final class al
{

    public static String a()
    {
        AccessToken accesstoken = b();
        if (accesstoken != null && !accesstoken.isExpired())
        {
            return accesstoken.getToken();
        } else
        {
            return null;
        }
    }

    public static void a(Context context)
    {
        FacebookSdk.sdkInitialize(aj.a());
        LoginManager.getInstance().logOut();
        com.roidapp.cloudlib.common.a.l(context);
    }

    public static boolean a(String as[])
    {
        Object obj = b();
        if (obj != null && !((AccessToken) (obj)).isExpired())
        {
            if ((obj = ((AccessToken) (obj)).getPermissions()) != null && ((Set) (obj)).containsAll(Arrays.asList(as)))
            {
                return true;
            }
        }
        return false;
    }

    public static AccessToken b()
    {
        FacebookSdk.sdkInitialize(aj.a());
        return AccessToken.getCurrentAccessToken();
    }

    public static boolean c()
    {
        AccessToken accesstoken = b();
        return accesstoken != null && !accesstoken.isExpired();
    }

    public static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT >= 8;
    }
}
