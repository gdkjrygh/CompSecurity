// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook:
//            q, r, GraphRequest

final class n extends OutputStream
    implements q
{

    final Map a = new HashMap();
    int b;
    private final Handler c;
    private GraphRequest d;
    private r e;

    n(Handler handler)
    {
        c = handler;
    }

    final void a(long l)
    {
        if (e == null)
        {
            e = new r(c, d);
            a.put(d, e);
        }
        r r1 = e;
        r1.d = r1.d + l;
        b = (int)((long)b + l);
    }

    public final void a(GraphRequest graphrequest)
    {
        d = graphrequest;
        if (graphrequest != null)
        {
            graphrequest = (r)a.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        e = graphrequest;
    }

    public final void write(int i)
    {
        a(1L);
    }

    public final void write(byte abyte0[])
    {
        a(abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        a(j);
    }
}
