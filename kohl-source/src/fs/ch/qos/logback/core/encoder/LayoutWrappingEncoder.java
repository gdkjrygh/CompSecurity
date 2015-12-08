// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.encoder;

import fs.ch.qos.logback.core.Layout;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package fs.ch.qos.logback.core.encoder:
//            EncoderBase

public class LayoutWrappingEncoder extends EncoderBase
{

    private boolean immediateFlush;
    protected Layout layout;

    public LayoutWrappingEncoder()
    {
        immediateFlush = true;
    }

    public Layout getLayout()
    {
        return layout;
    }

    public boolean isStarted()
    {
        return false;
    }

    public void start()
    {
        started = true;
    }

    public void stop()
    {
        started = false;
        if (outputStream == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        outputStream.flush();
        return;
        IOException ioexception;
        ioexception;
    }
}
