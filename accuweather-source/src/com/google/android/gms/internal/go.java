// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

public class go
{

    private static boolean Ci = false;
    private boolean Cj;
    private boolean Ck;
    private String Cl;
    private final String mTag;

    public go(String s)
    {
        this(s, en());
    }

    public go(String s, boolean flag)
    {
        mTag = s;
        Cj = flag;
        Ck = false;
    }

    private transient String e(String s, Object aobj[])
    {
        aobj = String.format(s, aobj);
        s = ((String) (aobj));
        if (!TextUtils.isEmpty(Cl))
        {
            s = (new StringBuilder()).append(Cl).append(((String) (aobj))).toString();
        }
        return s;
    }

    public static boolean en()
    {
        return Ci;
    }

    public transient void a(String s, Object aobj[])
    {
        if (em())
        {
            Log.v(mTag, e(s, aobj));
        }
    }

    public transient void a(Throwable throwable, String s, Object aobj[])
    {
        if (el() || Ci)
        {
            Log.d(mTag, e(s, aobj), throwable);
        }
    }

    public void ap(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = String.format("[%s] ", new Object[] {
                s
            });
        }
        Cl = s;
    }

    public transient void b(String s, Object aobj[])
    {
        if (el() || Ci)
        {
            Log.d(mTag, e(s, aobj));
        }
    }

    public transient void c(String s, Object aobj[])
    {
        Log.i(mTag, e(s, aobj));
    }

    public transient void d(String s, Object aobj[])
    {
        Log.w(mTag, e(s, aobj));
    }

    public boolean el()
    {
        return Cj;
    }

    public boolean em()
    {
        return Ck;
    }

}
