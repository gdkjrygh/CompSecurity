// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.b:
//            aB, aK, aA

public static final class n extends aB
{

    public int a;
    public String b;
    public String c;

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != 0)
        {
            i = j + aA.b(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + aA.b(2, b);
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + aA.b(3, c);
        }
        return i;
    }

    public final void a(aA aa)
        throws IOException
    {
        if (a != 0)
        {
            aa.a(1, a);
        }
        if (!b.equals(""))
        {
            aa.a(2, b);
        }
        if (!c.equals(""))
        {
            aa.a(3, c);
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
        if (!(obj instanceof c)) goto _L4; else goto _L3
_L3:
        obj = (c)obj;
        flag = flag1;
        if (a != ((a) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((b) (obj)).b != null) goto _L4; else goto _L8
_L8:
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((c) (obj)).c != null) goto _L4; else goto _L9
_L9:
        return a(((aB) (obj)));
_L7:
        if (!b.equals(((b) (obj)).b))
        {
            return false;
        }
          goto _L8
        if (!c.equals(((c) (obj)).c))
        {
            return false;
        }
          goto _L9
    }

    public final int hashCode()
    {
        int j = 0;
        int k = a;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + b();
    }

    public ()
    {
        a = 0;
        b = "";
        c = "";
        m = null;
        n = -1;
    }
}
