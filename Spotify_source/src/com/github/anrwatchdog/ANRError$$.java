// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;


final class ANRError$$
{

    final String a;
    final StackTraceElement b[];

    private ANRError$$(String s, StackTraceElement astacktraceelement[])
    {
        a = s;
        b = astacktraceelement;
    }

    ANRError$$(String s, StackTraceElement astacktraceelement[], byte byte0)
    {
        this(s, astacktraceelement);
    }
}
