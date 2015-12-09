// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AggregateException extends RuntimeException
{

    private static final long serialVersionUID = 0x21d338ae3de0bdf6L;
    public final List mExceptionList = new ArrayList();

    public AggregateException()
    {
    }

    public final void a(Exception exception)
    {
        mExceptionList.add(exception);
    }

    public void printStackTrace()
    {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printstream)
    {
        super.printStackTrace(printstream);
        Throwable throwable;
        for (Iterator iterator = mExceptionList.iterator(); iterator.hasNext(); throwable.printStackTrace(printstream))
        {
            throwable = (Throwable)iterator.next();
            printstream.println("----------------------------------------");
        }

        printstream.println("----------------------------------------");
    }

    public void printStackTrace(PrintWriter printwriter)
    {
        super.printStackTrace(printwriter);
        Throwable throwable;
        for (Iterator iterator = mExceptionList.iterator(); iterator.hasNext(); throwable.printStackTrace(printwriter))
        {
            throwable = (Throwable)iterator.next();
            printwriter.println("----------------------------------------");
        }

        printwriter.println("----------------------------------------");
    }
}
