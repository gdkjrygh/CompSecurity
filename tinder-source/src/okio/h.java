// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            r, c, s

public abstract class h
    implements r
{

    private final r a;

    public h(r r1)
    {
        if (r1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = r1;
            return;
        }
    }

    public long a(c c, long l)
        throws IOException
    {
        return a.a(c, l);
    }

    public void close()
        throws IOException
    {
        a.close();
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
