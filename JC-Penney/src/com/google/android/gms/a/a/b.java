// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a.a;


public final class b
{

    private final String a;
    private final boolean b;

    public b(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public String a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{").append(a).append("}").append(b).toString();
    }
}
