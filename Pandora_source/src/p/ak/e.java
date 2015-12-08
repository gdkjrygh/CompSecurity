// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ak;

import p.ah.d;
import p.q.b;
import p.q.f;
import p.x.j;

// Referenced classes of package p.ak:
//            f, b

public class e
    implements p.ak.f
{

    private final j a;
    private final d b;
    private final p.ak.b c;

    public e(j j, d d1, p.ak.b b1)
    {
        if (j == null)
        {
            throw new NullPointerException("ModelLoader must not be null");
        }
        a = j;
        if (d1 == null)
        {
            throw new NullPointerException("Transcoder must not be null");
        }
        b = d1;
        if (b1 == null)
        {
            throw new NullPointerException("DataLoadProvider must not be null");
        } else
        {
            c = b1;
            return;
        }
    }

    public p.q.e a()
    {
        return c.a();
    }

    public p.q.e b()
    {
        return c.b();
    }

    public b c()
    {
        return c.c();
    }

    public f d()
    {
        return c.d();
    }

    public j e()
    {
        return a;
    }

    public d f()
    {
        return b;
    }
}
