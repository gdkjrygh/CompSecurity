// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

public class ip
{

    private static boolean GX = false;
    private boolean GY;
    private boolean GZ;
    private String Ha;
    private final String mTag;

    public ip(String s)
    {
        this(s, fS());
    }

    public ip(String s, boolean flag)
    {
        mTag = s;
        GY = flag;
        GZ = false;
    }

    private transient String e(String s, Object aobj[])
    {
        if (aobj.length != 0)
        {
            s = String.format(s, aobj);
        }
        aobj = s;
        if (!TextUtils.isEmpty(Ha))
        {
            aobj = (new StringBuilder()).append(Ha).append(s).toString();
        }
        return ((String) (aobj));
    }

    public static boolean fS()
    {
        return GX;
    }

    public transient void a(String s, Object aobj[])
    {
        if (fR())
        {
            Log.v(mTag, e(s, aobj));
        }
    }

    public transient void a(Throwable throwable, String s, Object aobj[])
    {
        if (fQ() || GX)
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
        Ha = s;
    }

    public transient void b(String s, Object aobj[])
    {
        if (fQ() || GX)
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

    public boolean fQ()
    {
        return GY;
    }

    public boolean fR()
    {
        return GZ;
    }

}
