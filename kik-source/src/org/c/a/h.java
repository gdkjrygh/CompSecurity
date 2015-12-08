// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.a;

import java.io.PrintStream;

public final class h
{

    public static final void a(String s)
    {
        System.err.println((new StringBuilder("SLF4J: ")).append(s).toString());
    }

    public static final void a(String s, Throwable throwable)
    {
        System.err.println(s);
        System.err.println("Reported exception:");
        throwable.printStackTrace();
    }
}
