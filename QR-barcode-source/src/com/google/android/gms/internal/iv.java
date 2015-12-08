// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;

public abstract class iv
{
    private static interface a
    {
    }

    private static class b
        implements a
    {

        private final ContentResolver mContentResolver;

        public b(ContentResolver contentresolver)
        {
            mContentResolver = contentresolver;
        }
    }


    private static a JN = null;
    private static final Object mw = new Object();
    protected final String JO;
    protected final Object JP;
    private Object JQ;

    protected iv(String s, Object obj)
    {
        JQ = null;
        JO = s;
        JP = obj;
    }

    public static void H(Context context)
    {
        synchronized (mw)
        {
            if (JN == null)
            {
                JN = new b(context.getContentResolver());
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static iv a(String s, Integer integer)
    {
        return new iv(s, integer) {

        };
    }

    public static iv g(String s, boolean flag)
    {
        return new iv(s, Boolean.valueOf(flag)) {

        };
    }

    public static iv m(String s, String s1)
    {
        return new iv(s, s1) {

        };
    }

    public String getKey()
    {
        return JO;
    }

}
