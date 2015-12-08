// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;


public abstract class f
{

    public static int n = 0;
    public static int o = 1;

    public f()
    {
    }

    public abstract long a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public String toString()
    {
        return (new StringBuilder()).append(a()).append("\t").append(b()).append("\t").append(c()).append(d()).toString();
    }

}
