// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.content.Context;
import com.qihoo.security.SecurityApplication;

public class a
{

    private static a a;
    private final Context b = SecurityApplication.a();
    private int c;
    private int d;
    private int e;
    private int f;

    private a()
    {
        int i = com.qihoo360.mobilesafe.b.a.c(b);
        int j = com.qihoo360.mobilesafe.b.a.a(b, 0x7f09001c);
        f = com.qihoo360.mobilesafe.b.a.b(b) - i - j;
        f();
    }

    public static a a()
    {
        com/qihoo/security/ui/result/view/a;
        JVM INSTR monitorenter ;
        a a1;
        if (a == null)
        {
            a = new a();
        }
        a1 = a;
        com/qihoo/security/ui/result/view/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        c = (int)(((float)f * 56.25F) / 100F);
        d = (int)(((double)f * 20.75D) / 100D);
        e = (f * 23) / 100;
    }

    public int b()
    {
        return f;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return e;
    }

    public int e()
    {
        return d;
    }
}
