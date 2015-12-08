// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;


public final class c extends Exception
{

    final long a = System.currentTimeMillis();
    final long b;

    public c(String s, long l)
    {
        super(s);
        b = l;
    }
}
