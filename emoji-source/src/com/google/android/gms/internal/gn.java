// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

public class gn
{

    private static boolean Cl = false;
    private boolean Cm;
    private boolean Cn;
    private String Co;
    private final String mTag;

    public gn(String s)
    {
        this(s, es());
    }

    public gn(String s, boolean flag)
    {
        mTag = s;
        Cm = flag;
        Cn = false;
    }

    private transient String e(String s, Object aobj[])
    {
        aobj = String.format(s, aobj);
        s = ((String) (aobj));
        if (!TextUtils.isEmpty(Co))
        {
            s = (new StringBuilder()).append(Co).append(((String) (aobj))).toString();
        }
        return s;
    }

    public static boolean es()
    {
        return Cl;
    }

    public transient void a(String s, Object aobj[])
    {
        if (er())
        {
            Log.v(mTag, e(s, aobj));
        }
    }

    public transient void a(Throwable throwable, String s, Object aobj[])
    {
        if (eq() || Cl)
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
        Co = s;
    }

    public transient void b(String s, Object aobj[])
    {
        if (eq() || Cl)
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

    public boolean eq()
    {
        return Cm;
    }

    public boolean er()
    {
        return Cn;
    }

}
