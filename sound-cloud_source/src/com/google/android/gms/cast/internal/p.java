// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.Locale;

public final class p
{

    private static boolean d = false;
    protected final String a;
    boolean b;
    String c;
    private final boolean e;
    private boolean f;

    public p(String s)
    {
        this(s, d);
    }

    private p(String s, boolean flag)
    {
        zzx.zzh(s, "The log tag cannot be null or empty.");
        a = s;
        boolean flag1;
        if (s.length() <= 23)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        e = flag1;
        f = flag;
        b = false;
    }

    private boolean a()
    {
        return f || e && Log.isLoggable(a, 3);
    }

    public final transient void a(String s, Object aobj[])
    {
        if (a() || d)
        {
            c(s, aobj);
        }
    }

    public final transient void b(String s, Object aobj[])
    {
        if (a() || d)
        {
            c(s, aobj);
        }
    }

    public final transient String c(String s, Object aobj[])
    {
        if (aobj.length != 0)
        {
            s = String.format(Locale.ROOT, s, aobj);
        }
        aobj = s;
        if (!TextUtils.isEmpty(c))
        {
            aobj = (new StringBuilder()).append(c).append(s).toString();
        }
        return ((String) (aobj));
    }

}
