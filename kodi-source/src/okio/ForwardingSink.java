// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            Sink, Timeout, Buffer

public abstract class ForwardingSink
    implements Sink
{

    private final Sink _flddelegate;

    public ForwardingSink(Sink sink)
    {
        if (sink == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = sink;
            return;
        }
    }

    public void close()
        throws IOException
    {
        _flddelegate.close();
    }

    public void flush()
        throws IOException
    {
        _flddelegate.flush();
    }

    public Timeout timeout()
    {
        return _flddelegate.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(_flddelegate.toString()).append(")").toString();
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        _flddelegate.write(buffer, l);
    }
}
