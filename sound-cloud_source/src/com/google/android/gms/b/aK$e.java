// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.b:
//            aB, aK, aF, aA

public static final class n extends aB
{

    private static volatile b c[];
    public String a;
    public String b;

    public static n[] f()
    {
        if (c == null)
        {
            synchronized (aF.a)
            {
                if (c == null)
                {
                    c = new c[0];
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
        int j = super.a();
        int i = j;
        if (!a.equals(""))
        {
            i = j + aA.b(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + aA.b(2, b);
        }
        return j;
    }

    public final void a(aA aa)
        throws IOException
    {
        if (!a.equals(""))
        {
            aa.a(1, a);
        }
        if (!b.equals(""))
        {
            aa.a(2, b);
        }
        super.a(aa);
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
        if (!(obj instanceof b)) goto _L4; else goto _L3
_L3:
        obj = (b)obj;
        if (a != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((a) (obj)).a != null) goto _L4; else goto _L7
_L7:
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((b) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((aB) (obj)));
_L6:
        if (!a.equals(((a) (obj)).a))
        {
            return false;
        }
          goto _L7
        if (!b.equals(((b) (obj)).b))
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
        return ((i + 527) * 31 + j) * 31 + b();
    }

    public ()
    {
        a = "";
        b = "";
        m = null;
        n = -1;
    }
}
