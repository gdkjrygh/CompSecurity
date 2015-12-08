// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.net.Uri;

final class AuthUrls
{

    static boolean isAuthRedirectUrl(Uri uri)
    {
        return isAuthUrl(uri) && (uri.getPath().endsWith("Reauthenticate") || uri.getPath().endsWith("Login"));
    }

    static boolean isAuthSpeedbumpUrl(Uri uri)
    {
        return isAuthUrl(uri) && !uri.getPath().endsWith("CheckCookie");
    }

    private static boolean isAuthUrl(Uri uri)
    {
        while (uri.getHost() == null || uri.getPath() == null || !uri.getHost().matches("accounts\\.google\\.[^\\.]*") && (!uri.getHost().matches("www\\.google\\.[^\\.]*") || !uri.getPath().endsWith("/accounts/"))) 
        {
            return false;
        }
        return true;
    }
}
