// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            q, c, s

public abstract class g
    implements q
{

    private final q a;

    public g(q q1)
    {
        if (q1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = q1;
            return;
        }
    }

    public void a_(c c, long l)
        throws IOException
    {
        a.a_(c, l);
    }

    public void close()
        throws IOException
    {
        a.close();
    }

    public void flush()
        throws IOException
    {
        a.flush();
    }

    public final s q_()
    {
        return a.q_();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(a.toString()).append(")").toString();
    }
}
