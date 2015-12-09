// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook:
//            az, q, ag, ah, 
//            ai, at, ba, GraphRequest

final class as extends FilterOutputStream
    implements az
{

    private final Map a;
    private final ag b;
    private final long c = q.g();
    private long d;
    private long e;
    private long f;
    private ba g;

    as(OutputStream outputstream, ag ag1, Map map, long l)
    {
        super(outputstream);
        b = ag1;
        a = map;
        f = l;
    }

    private void a()
    {
        if (d > e)
        {
            Iterator iterator = b.e().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (ah)iterator.next();
                if (obj instanceof ai)
                {
                    Handler handler = b.c();
                    obj = (ai)obj;
                    if (handler != null)
                    {
                        handler.post(new at(this, ((ai) (obj))));
                    }
                }
            } while (true);
            e = d;
        }
    }

    private void a(long l)
    {
        if (g != null)
        {
            g.a(l);
        }
        d = d + l;
        if (d >= e + c || d >= f)
        {
            a();
        }
    }

    public final void a(GraphRequest graphrequest)
    {
        if (graphrequest != null)
        {
            graphrequest = (ba)a.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        g = graphrequest;
    }

    public final void close()
    {
        super.close();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((ba)iterator.next()).a()) { }
        a();
    }

    public final void write(int i)
    {
        out.write(i);
        a(1L);
    }

    public final void write(byte abyte0[])
    {
        out.write(abyte0);
        a(abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        a(j);
    }
}
