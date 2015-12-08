// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            nj, nn, nh, ng

public final class nf extends nj
{

    private static volatile nf c[];
    public int a;
    public ng b;

    public nf()
    {
        a = 1;
        b = null;
        o = null;
        p = -1;
    }

    public static nf[] b()
    {
        if (c == null)
        {
            synchronized (nn.a)
            {
                if (c == null)
                {
                    c = new nf[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a() + nh.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + nh.b(2, b);
        }
        return i;
    }

    public final void a(nh nh1)
    {
        nh1.a(1, a);
        if (b != null)
        {
            nh1.a(2, b);
        }
        super.a(nh1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof nf)) goto _L4; else goto _L3
_L3:
        obj = (nf)obj;
        flag = flag1;
        if (a != ((nf) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((nf) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((nj) (obj)));
_L7:
        if (!b.equals(((nf) (obj)).b))
        {
            return false;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final int hashCode()
    {
        int j = a;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return (i + (j + 527) * 31) * 31 + c();
    }
}
