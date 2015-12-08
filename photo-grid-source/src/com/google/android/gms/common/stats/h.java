// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;


public abstract class h
{

    public static int b = 0;
    public static int c = 1;

    public h()
    {
    }

    public abstract long a();

    public abstract int b();

    public abstract long i();

    public abstract String l();

    public String toString()
    {
        return (new StringBuilder()).append(a()).append("\t").append(b()).append("\t").append(i()).append(l()).toString();
    }

}
