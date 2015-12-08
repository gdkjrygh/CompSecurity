// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso;


public final class e
{

    private final String a;
    private final int b;
    private final String c;
    private final long d;

    public e(String s, int i, String s1, long l)
    {
        a = s;
        b = i;
        c = s1;
        d = l;
    }

    public final String a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final long c()
    {
        return d;
    }

    public final String toString()
    {
        return (new StringBuilder("[")).append(a).append(": sso ").append(b).append(", sdk ").append(c).append("]").toString();
    }
}
