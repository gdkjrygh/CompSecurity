// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ag;

import java.io.OutputStream;
import p.q.f;
import p.s.k;

// Referenced classes of package p.ag:
//            a

public class d
    implements f
{

    private final f a;
    private final f b;
    private String c;

    public d(f f1, f f2)
    {
        a = f1;
        b = f2;
    }

    public String a()
    {
        if (c == null)
        {
            c = (new StringBuilder()).append(a.a()).append(b.a()).toString();
        }
        return c;
    }

    public volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((k)obj, outputstream);
    }

    public boolean a(k k1, OutputStream outputstream)
    {
        k1 = (a)k1.b();
        k k2 = k1.b();
        if (k2 != null)
        {
            return a.a(k2, outputstream);
        } else
        {
            return b.a(k1.c(), outputstream);
        }
    }
}
