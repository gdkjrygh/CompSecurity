// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

public class is
{

    private static boolean HN = false;
    private boolean HO;
    private boolean HP;
    private String HQ;
    protected final String mTag;

    public is(String s)
    {
        this(s, go());
    }

    public is(String s, boolean flag)
    {
        mTag = s;
        HO = flag;
        HP = false;
    }

    public static boolean go()
    {
        return HN;
    }

    public transient void a(String s, Object aobj[])
    {
        if (gn())
        {
            Log.v(mTag, e(s, aobj));
        }
    }

    public transient void a(Throwable throwable, String s, Object aobj[])
    {
        if (gm() || HN)
        {
            Log.d(mTag, e(s, aobj), throwable);
        }
    }

    public void aK(String s)
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
        HQ = s;
    }

    public transient void b(String s, Object aobj[])
    {
        if (gm() || HN)
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

    protected transient String e(String s, Object aobj[])
    {
        if (aobj.length != 0)
        {
            s = String.format(s, aobj);
        }
        aobj = s;
        if (!TextUtils.isEmpty(HQ))
        {
            aobj = (new StringBuilder()).append(HQ).append(s).toString();
        }
        return ((String) (aobj));
    }

    public boolean gm()
    {
        return HO;
    }

    public boolean gn()
    {
        return HP;
    }

}
