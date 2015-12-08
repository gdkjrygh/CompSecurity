// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            Source, Buffer, Timeout

public abstract class ForwardingSource
    implements Source
{

    private final Source _flddelegate;

    public ForwardingSource(Source source)
    {
        if (source == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = source;
            return;
        }
    }

    public void close()
        throws IOException
    {
        _flddelegate.close();
    }

    public final Source _mthdelegate()
    {
        return _flddelegate;
    }

    public long read(Buffer buffer, long l)
        throws IOException
    {
        return _flddelegate.read(buffer, l);
    }

    public Timeout timeout()
    {
        return _flddelegate.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(_flddelegate.toString()).append(")").toString();
    }
}
