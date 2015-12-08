// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;

// Referenced classes of package c:
//            y, e, z

public abstract class l
    implements y
{

    private final y a;

    public l(y y1)
    {
        if (y1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = y1;
            return;
        }
    }

    public long a(e e, long l1)
        throws IOException
    {
        return a.a(e, l1);
    }

    public void close()
        throws IOException
    {
        a.close();
    }

    public z timeout()
    {
        return a.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(a.toString()).append(")").toString();
    }
}
