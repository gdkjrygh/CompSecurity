// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.error;

import com.netflix.mediaclient.servicemgr.ErrorLogging;

// Referenced classes of package com.netflix.mediaclient.service.logging.error:
//            ErrorLoggingManager

public final class CrittercismErrorLoggingImpl
    implements ErrorLogging
{

    public CrittercismErrorLoggingImpl()
    {
    }

    public void logHandledException(Exception exception)
    {
        ErrorLoggingManager.logHandledException(exception);
    }

    public void logHandledException(String s)
    {
        ErrorLoggingManager.logHandledException(s);
    }
}
