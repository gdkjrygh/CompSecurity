// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook:
//            P, s, C, N, 
//            Q, GraphRequest

final class M extends FilterOutputStream
    implements P
{

    private final Map a;
    private final C b;
    private final long c = s.g();
    private long d;
    private long e;
    private long f;
    private Q g;

    M(OutputStream outputstream, C c1, Map map, long l)
    {
        super(outputstream);
        b = c1;
        a = map;
        f = l;
    }

    private void a()
    {
        if (d > e)
        {
            Iterator iterator = b.e.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (C.a)iterator.next();
                if (obj instanceof C.b)
                {
                    Handler handler = b.a;
                    obj = (C.b)obj;
                    if (handler != null)
                    {
                        handler.post(new N(this, ((C.b) (obj))));
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
            Q q = g;
            q.b = q.b + l;
            if (q.b >= q.c + q.a || q.b >= q.d)
            {
                q.a();
            }
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
            graphrequest = (Q)a.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        g = graphrequest;
    }

    public final void close()
        throws IOException
    {
        super.close();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((Q)iterator.next()).a()) { }
        a();
    }

    public final void write(int i)
        throws IOException
    {
        out.write(i);
        a(1L);
    }

    public final void write(byte abyte0[])
        throws IOException
    {
        out.write(abyte0);
        a(abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
        throws IOException
    {
        out.write(abyte0, i, j);
        a(j);
    }
}
