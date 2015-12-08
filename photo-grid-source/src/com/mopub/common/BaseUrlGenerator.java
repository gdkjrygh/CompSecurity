// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import com.mopub.network.Networking;

public abstract class BaseUrlGenerator
{

    private StringBuilder a;
    private boolean b;

    public BaseUrlGenerator()
    {
    }

    protected final void a(Point point)
    {
        b("w", (new StringBuilder()).append(point.x).toString());
        b("h", (new StringBuilder()).append(point.y).toString());
    }

    protected final void a(String s, String s1)
    {
        String s2;
        if (Networking.useHttps())
        {
            s2 = "https";
        } else
        {
            s2 = "http";
        }
        a = (new StringBuilder(s2)).append("://").append(s).append(s1);
        b = true;
    }

    protected final void a(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        b("android_perms_ext_storage", s);
    }

    protected final transient void a(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 2; i++)
        {
            stringbuilder.append(as[i]).append(",");
        }

        stringbuilder.append(as[2]);
        b("dn", stringbuilder.toString());
    }

    protected final String b()
    {
        return a.toString();
    }

    protected final void b(String s)
    {
        b("v", s);
    }

    protected final void b(String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        StringBuilder stringbuilder = a;
        String s2;
        if (b)
        {
            b = false;
            s2 = "?";
        } else
        {
            s2 = "&";
        }
        stringbuilder.append(s2);
        a.append(s);
        a.append("=");
        a.append(Uri.encode(s1));
    }

    protected final void b(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        b("dnt", s);
    }

    protected final void c()
    {
        b("udid", "mp_tmpl_advertising_id");
        b("dnt", "mp_tmpl_do_not_track");
    }

    protected final void c(String s)
    {
        b("av", s);
    }

    protected final void d(String s)
    {
        b("udid", s);
    }

    public abstract String generateUrlString(String s);
}
