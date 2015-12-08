// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import java.io.IOException;
import java.io.InputStream;
import p.q.a;
import p.q.e;
import p.s.k;
import p.t.c;

// Referenced classes of package p.ab:
//            f, c

public class q
    implements e
{

    private final f a;
    private c b;
    private a c;
    private String d;

    public q(f f1, c c1, a a1)
    {
        a = f1;
        b = c1;
        c = a1;
    }

    public q(c c1, a a1)
    {
        this(p.ab.f.a, c1, a1);
    }

    public String a()
    {
        if (d == null)
        {
            d = (new StringBuilder()).append("StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap").append(a.a()).append(c.name()).toString();
        }
        return d;
    }

    public k a(InputStream inputstream, int i, int j)
    {
        return p.ab.c.a(a.a(inputstream, b, i, j, c), b);
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((InputStream)obj, i, j);
    }
}
