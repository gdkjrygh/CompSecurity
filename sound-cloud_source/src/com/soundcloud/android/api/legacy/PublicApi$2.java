// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

final class 
    implements CookieStore
{

    public final void addCookie(Cookie cookie)
    {
    }

    public final void clear()
    {
    }

    public final boolean clearExpired(Date date)
    {
        return false;
    }

    public final List getCookies()
    {
        return Collections.emptyList();
    }

    ()
    {
    }
}
