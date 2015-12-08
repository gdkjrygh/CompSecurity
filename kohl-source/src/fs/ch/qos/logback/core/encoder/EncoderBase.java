// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.encoder;

import fs.ch.qos.logback.core.spi.ContextAwareBase;
import java.io.OutputStream;

// Referenced classes of package fs.ch.qos.logback.core.encoder:
//            Encoder

public abstract class EncoderBase extends ContextAwareBase
    implements Encoder
{

    protected OutputStream outputStream;
    protected boolean started;

    public EncoderBase()
    {
    }

    public boolean isStarted()
    {
        return started;
    }

    public void start()
    {
        started = true;
    }

    public void stop()
    {
        started = false;
    }
}
