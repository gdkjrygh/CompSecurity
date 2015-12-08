// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;


public class CrashReporterConfig
{

    private boolean a;
    private boolean b;
    private boolean c;
    private long d;

    public CrashReporterConfig()
    {
        d = 1L;
    }

    public final void a(long l)
    {
        d = l;
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final boolean a()
    {
        return a;
    }

    public final boolean b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }
}
