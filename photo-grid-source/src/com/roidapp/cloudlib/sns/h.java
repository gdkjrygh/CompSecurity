// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.content.Context;
import android.content.res.Resources;
import com.roidapp.cloudlib.at;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class h
{

    private static h g;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private SimpleDateFormat f;

    public h()
    {
        f = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
    }

    public static h a()
    {
        if (g == null)
        {
            g = new h();
        }
        return g;
    }

    public final String a(Context context, long l)
    {
        if (a == null)
        {
            a = context.getResources().getString(at.aO);
            b = context.getResources().getString(at.aN);
            c = context.getResources().getString(at.aM);
            d = context.getResources().getString(at.aL);
            e = context.getResources().getString(at.aP);
        }
        long l1 = System.currentTimeMillis() / 1000L - l;
        if (l1 < 60L)
        {
            l = l1;
            if (l1 < 0L)
            {
                l = 0L;
            }
            return (new StringBuilder()).append(l).append(a).toString();
        }
        if (l1 < 3600L)
        {
            return (new StringBuilder()).append(l1 / 60L).append(b).toString();
        }
        if (l1 < 0x15180L)
        {
            return (new StringBuilder()).append(l1 / 3600L).append(c).toString();
        }
        if (l1 < 0x93a80L)
        {
            return (new StringBuilder()).append(l1 / 0x15180L).append(d).toString();
        } else
        {
            return (new StringBuilder()).append(l1 / 0x93a80L).append(e).toString();
        }
    }
}
