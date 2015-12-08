// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            z, o, y, aa, 
//            b, u, m

public final class t extends z
    implements o
{

    public t(m m)
    {
        super(m);
    }

    public final void a(int i, int j, boolean flag)
    {
        b(i, j, flag);
    }

    public final void a(int i, long l, boolean flag)
    {
        b = f.a(l, this, f.a(y.a(i, 0), this, b));
    }

    public final void a(int i, b b1, boolean flag)
    {
        b1 = b1.a();
        b = f.a(b1, b1.length, this, f.a(b1.length, this, f.a(y.a(i, 2), this, b)));
    }

    public final void a(int i, Object obj, u u1, boolean flag)
    {
        b = f.a(y.a(i, 3), this, b);
        u1.a(this, obj);
        b = f.a(y.a(i, 4), this, b);
    }

    public final void a(int i, String s, boolean flag)
    {
        b = f.a(s, this, f.a(y.a(i, 2), this, b));
    }

    public final void a(int i, boolean flag, boolean flag1)
    {
        aa aa1 = f;
        byte byte0;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        b = aa1.a(byte0, this, f.a(y.a(i, 0), this, b));
    }

    public final void b(int i, int j, boolean flag)
    {
        if (j < 0)
        {
            b = f.a(j, this, f.a(y.a(i, 0), this, b));
            return;
        } else
        {
            b = f.a(j, this, f.a(y.a(i, 0), this, b));
            return;
        }
    }
}
