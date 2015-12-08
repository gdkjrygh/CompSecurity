// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package com.quantcast.measurement.service:
//            QCEventHandler, QCMeasurement, QCLog

private static class m_delegate
    implements Runnable
{

    final Runnable m_delegate;

    public void run()
    {
        try
        {
            m_delegate.run();
            return;
        }
        catch (Throwable throwable)
        {
            Object obj = new StringWriter();
            throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
            obj = ((StringWriter) (obj)).toString();
            QCMeasurement.INSTANCE.logSDKError("android-sdk-catchall", throwable.toString(), ((String) (obj)));
            QCLog.e(QCEventHandler.access$100(), (new StringBuilder()).append("Catchall exception - ").append(((String) (obj))).toString());
            return;
        }
    }

    public (Runnable runnable)
    {
        m_delegate = runnable;
    }
}
