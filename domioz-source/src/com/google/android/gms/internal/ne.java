// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            nj, nn, nh, nf

public final class ne extends nj
{

    private static volatile ne c[];
    public String a;
    public nf b;

    public ne()
    {
        a = "";
        b = null;
        o = null;
        p = -1;
    }

    public static ne[] b()
    {
        if (c == null)
        {
            synchronized (nn.a)
            {
                if (c == null)
                {
                    c = new ne[0];
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
        if (!(obj instanceof ne)) goto _L4; else goto _L3
_L3:
        obj = (ne)obj;
        if (a != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((ne) (obj)).a != null) goto _L4; else goto _L7
_L7:
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((ne) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((nj) (obj)));
_L6:
        if (!a.equals(((ne) (obj)).a))
        {
            return false;
        }
          goto _L7
        if (!b.equals(((ne) (obj)).b))
        {
            return false;
        }
          goto _L8
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + c();
    }
}
