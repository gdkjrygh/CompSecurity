// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.logcat.raw;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.facebook.debug.logcat.raw:
//            LogcatProcess

class a
    implements Runnable
{

    final LogcatProcess a;

    public void run()
    {
        InputStream inputstream;
        byte abyte0[];
        inputstream = LogcatProcess.a(a).getErrorStream();
        abyte0 = new byte[4096];
_L1:
        if (inputstream.read(abyte0) < 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
label0:
        {
            synchronized (a)
            {
                if (LogcatProcess.b(a) == ate.RUNNING)
                {
                    break label0;
                }
            }
            return;
        }
        logcatprocess;
        JVM INSTR monitorexit ;
          goto _L1
        exception;
        logcatprocess;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (IOException ioexception)
        {
            LogcatProcess.a(a).destroy();
        }
        LogcatProcess.a(a, ate.KILLED);
    }

    ate(LogcatProcess logcatprocess)
    {
        a = logcatprocess;
        super();
    }
}
