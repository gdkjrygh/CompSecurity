// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import java.io.ByteArrayOutputStream;

// Referenced classes of package android_src.mms.e:
//            n, k, o, l

class m
{

    int a;
    final k b;
    private n c;
    private n d;

    private m(k k1)
    {
        b = k1;
        super();
        c = null;
        d = null;
        a = 0;
    }

    m(k k1, l l)
    {
        this(k1);
    }

    void a()
    {
        if (d != null)
        {
            throw new RuntimeException("BUG: Invalid newbuf() before copy()");
        } else
        {
            n n1 = new n(null);
            n1.a = b.a;
            n1.b = b.b;
            n1.c = c;
            c = n1;
            a = a + 1;
            b.a = new ByteArrayOutputStream();
            b.b = 0;
            return;
        }
    }

    void b()
    {
        ByteArrayOutputStream bytearrayoutputstream = b.a;
        int i = b.b;
        b.a = c.a;
        b.b = c.b;
        d = c;
        c = c.c;
        a = a - 1;
        d.a = bytearrayoutputstream;
        d.b = i;
    }

    void c()
    {
        b.a(d.a.toByteArray(), 0, d.b);
        d = null;
    }

    o d()
    {
        o o1 = new o(b, null);
        o.a(o1, b.b);
        o.b(o1, a);
        return o1;
    }
}
