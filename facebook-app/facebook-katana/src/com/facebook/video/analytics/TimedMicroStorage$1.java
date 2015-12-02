// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.debug.log.BLog;
import com.google.common.io.ByteStreams;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.video.analytics:
//            TimedMicroStorage

class a
    implements Runnable
{

    final lback a;
    final TimedMicroStorage b;

    public void run()
    {
        TimedMicroStorage.a(b).set(true);
        if (!TimedMicroStorage.b(b).exists())
        {
            TimedMicroStorage.a();
            a.a(new byte[0]);
            return;
        }
        Object obj = new FileInputStream(TimedMicroStorage.b(b));
        byte abyte0[] = ByteStreams.a(new BufferedInputStream(((java.io.InputStream) (obj))));
        TimedMicroStorage.a();
        a.hashCode();
        a.a(abyte0);
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            BLog.a(TimedMicroStorage.a(), ((Throwable) (obj)), "Cannot read from storage file", new Object[0]);
        }
        a.a(new byte[0]);
        return;
        Exception exception;
        exception;
        ((FileInputStream) (obj)).close();
        throw exception;
    }

    lback(TimedMicroStorage timedmicrostorage, lback lback)
    {
        b = timedmicrostorage;
        a = lback;
        super();
    }
}
