// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;


public class StackTraceHelper
{

    private static final int MAX_STACK_TRACE_LENGTH = 5;
    private static final int STARTING_INDEX = 3;

    public StackTraceHelper()
    {
    }

    public static String getCallerTrace()
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Call trace : ");
        for (int i = 3; i < astacktraceelement.length && i < 8; i++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i];
            stringbuilder.append(stacktraceelement.getFileName());
            stringbuilder.append(": ");
            stringbuilder.append(stacktraceelement.getLineNumber());
            stringbuilder.append(" < ");
        }

        return stringbuilder.toString();
    }
}
