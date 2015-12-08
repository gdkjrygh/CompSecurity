// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, g, kz, ku, 
//            kt, lb

public static final class s extends kv
{

    private static volatile c d[];
    public String a;
    public c b;
    public c c;

    public static s[] b()
    {
        if (d == null)
        {
            synchronized (kz.a)
            {
                if (d == null)
                {
                    d = new d[0];
                }
            }
        }
        return d;
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
            i = j + ku.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + ku.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + ku.b(3, c);
        }
        return i;
    }

    public final lb a(kt kt1)
        throws IOException
    {
        do
        {
            int i = kt1.a();
            switch (i)
            {
            default:
                if (a(kt1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kt1.d();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new <init>();
                }
                kt1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new <init>();
                }
                kt1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(ku ku1)
        throws IOException
    {
        if (!a.equals(""))
        {
            ku1.a(1, a);
        }
        if (b != null)
        {
            ku1.a(2, b);
        }
        if (c != null)
        {
            ku1.a(3, c);
        }
        super.a(ku1);
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
        if (!(obj instanceof )) goto _L4; else goto _L3
_L3:
        obj = ()obj;
        if (a != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((a) (obj)).a != null) goto _L4; else goto _L7
_L7:
        if (b != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((b) (obj)).b != null) goto _L4; else goto _L10
_L10:
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        flag = flag1;
        if (((c) (obj)).c != null) goto _L4; else goto _L11
_L11:
        return a(((kv) (obj)));
_L6:
        if (!a.equals(((a) (obj)).a))
        {
            return false;
        }
          goto _L7
_L9:
        if (!b.equals(((equals) (obj)).b))
        {
            return false;
        }
          goto _L10
        if (!c.equals(((equals) (obj)).c))
        {
            return false;
        }
          goto _L11
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (c != null)
        {
            k = c.hashCode();
        }
        return ((j + (i + 527) * 31) * 31 + k) * 31 + c();
    }

    public ()
    {
        a = "";
        b = null;
        c = null;
        r = null;
        s = -1;
    }
}
