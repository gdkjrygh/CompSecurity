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
//            q, g, i, r, 
//            GraphRequest

final class o extends FilterOutputStream
    implements q
{

    private final Map a;
    private final i b;
    private final long c = com.facebook.g.i();
    private long d;
    private long e;
    private long f;
    private r g;

    o(OutputStream outputstream, i j, Map map, long l)
    {
        super(outputstream);
        b = j;
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
                Object obj = (i.a)iterator.next();
                if (obj instanceof i.b)
                {
                    Handler handler = b.a;
                    obj = (i.b)obj;
                    if (handler != null)
                    {
                        handler.post(new Runnable(((i.b) (obj))) {

                            final i.b a;
                            final o b;

                            public final void run()
                            {
                            }

            
            {
                b = o.this;
                a = b1;
                super();
            }
                        });
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
            r r1 = g;
            r1.b = r1.b + l;
            if (r1.b >= r1.c + r1.a || r1.b >= r1.d)
            {
                r1.a();
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
            graphrequest = (r)a.get(graphrequest);
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
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((r)iterator.next()).a()) { }
        a();
    }

    public final void write(int j)
        throws IOException
    {
        out.write(j);
        a(1L);
    }

    public final void write(byte abyte0[])
        throws IOException
    {
        out.write(abyte0);
        a(abyte0.length);
    }

    public final void write(byte abyte0[], int j, int k)
        throws IOException
    {
        out.write(abyte0, j, k);
        a(k);
    }
}
