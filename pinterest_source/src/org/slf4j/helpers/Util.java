// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.io.PrintStream;

public class Util
{

    public Util()
    {
    }

    public static final void report(String s)
    {
        System.err.println((new StringBuilder("SLF4J: ")).append(s).toString());
    }

    public static final void report(String s, Throwable throwable)
    {
        System.err.println(s);
        System.err.println("Reported exception:");
        throwable.printStackTrace();
    }
}
