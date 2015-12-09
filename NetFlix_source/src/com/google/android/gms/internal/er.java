// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

public class er
{

    private static boolean zC = false;
    private final String mTag;
    private boolean zD;
    private boolean zE;
    private String zF;

    public er(String s)
    {
        this(s, dR());
    }

    public er(String s, boolean flag)
    {
        mTag = s;
        zD = flag;
        zE = false;
    }

    public static boolean dR()
    {
        return zC;
    }

    private transient String e(String s, Object aobj[])
    {
        aobj = String.format(s, aobj);
        s = ((String) (aobj));
        if (!TextUtils.isEmpty(zF))
        {
            s = (new StringBuilder()).append(zF).append(((String) (aobj))).toString();
        }
        return s;
    }

    public transient void a(String s, Object aobj[])
    {
        if (dQ())
        {
            Log.v(mTag, e(s, aobj));
        }
    }

    public transient void a(Throwable throwable, String s, Object aobj[])
    {
        if (dP() || zC)
        {
            Log.d(mTag, e(s, aobj), throwable);
        }
    }

    public void ab(String s)
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
        zF = s;
    }

    public transient void b(String s, Object aobj[])
    {
        if (dP() || zC)
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

    public boolean dP()
    {
        return zD;
    }

    public boolean dQ()
    {
        return zE;
    }

}
