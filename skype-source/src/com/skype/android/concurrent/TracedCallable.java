// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import com.skype.android.util.MethodTrace;
import java.util.concurrent.Callable;

public class TracedCallable
    implements Callable
{

    private Callable a;

    public Object call()
        throws Exception
    {
        MethodTrace methodtrace = new MethodTrace(a, "call");
        Object obj = a.call();
        methodtrace.b();
        return obj;
        Exception exception;
        exception;
        methodtrace.b();
        throw exception;
    }
}
