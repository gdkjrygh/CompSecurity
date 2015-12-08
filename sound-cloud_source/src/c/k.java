// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;

// Referenced classes of package c:
//            x, z, e

public abstract class k
    implements x
{

    private final x _flddelegate;

    public k(x x1)
    {
        if (x1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = x1;
            return;
        }
    }

    public void close()
        throws IOException
    {
        _flddelegate.close();
    }

    public final x _mthdelegate()
    {
        return _flddelegate;
    }

    public void flush()
        throws IOException
    {
        _flddelegate.flush();
    }

    public z timeout()
    {
        return _flddelegate.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(_flddelegate.toString()).append(")").toString();
    }

    public void write(e e, long l)
        throws IOException
    {
        _flddelegate.write(e, l);
    }
}
