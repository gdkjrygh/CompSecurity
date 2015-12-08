// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.http;

import android.util.Log;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.impl.cookie.RFC2109Spec;

public class AudCookieSpec extends RFC2109Spec
{

    private String TAG;

    public AudCookieSpec()
    {
        TAG = "AudCookieSpec";
    }

    public boolean match(Cookie cookie, CookieOrigin cookieorigin)
    {
        if (cookie == null)
        {
            throw new IllegalArgumentException("Cookie cannot be null");
        }
        if (cookieorigin == null)
        {
            throw new IllegalArgumentException("Cookie origin cannot be null");
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("Matching cookie ")).append(cookie).append(" with origin ").append(cookieorigin).toString());
        }
        return true;
    }
}
