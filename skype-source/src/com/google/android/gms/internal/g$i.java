// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, g, ku, kt, 
//            lf, kz, lb

public static final class s extends kv
{

    public c a[];
    public c b;
    public String c;

    protected final int a()
    {
        int j = super.a();
        int k = j;
        if (a != null)
        {
            k = j;
            if (a.length > 0)
            {
                int l = 0;
                do
                {
                    k = j;
                    if (l >= a.length)
                    {
                        break;
                    }
                    s s = a[l];
                    k = j;
                    if (s != null)
                    {
                        k = j + ku.b(1, s);
                    }
                    l++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (b != null)
        {
            j = k + ku.b(2, b);
        }
        k = j;
        if (!c.equals(""))
        {
            k = j + ku.b(3, c);
        }
        return k;
    }

    public final lb a(kt kt1)
        throws IOException
    {
        do
        {
            int j = kt1.a();
            switch (j)
            {
            default:
                if (a(kt1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l = lf.a(kt1, 10);
                c ac[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ac = new a[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ac, 0, k);
                    l = k;
                }
                for (; l < ac.length - 1; l++)
                {
                    ac[l] = new <init>();
                    kt1.a(ac[l]);
                    kt1.a();
                }

                ac[l] = new <init>();
                kt1.a(ac[l]);
                a = ac;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new <init>();
                }
                kt1.a(b);
                break;

            case 26: // '\032'
                c = kt1.d();
                break;
            }
        } while (true);
    }

    public final void a(ku ku1)
        throws IOException
    {
        if (a != null && a.length > 0)
        {
            for (int j = 0; j < a.length; j++)
            {
                  = a[j];
                if ( != null)
                {
                    ku1.a(1, );
                }
            }

        }
        if (b != null)
        {
            ku1.a(2, b);
        }
        if (!c.equals(""))
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
        flag = flag1;
        if (!kz.a(a, ((a) (obj)).a)) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((b) (obj)).b != null) goto _L4; else goto _L8
_L8:
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        if (((c) (obj)).c != null) goto _L4; else goto _L9
_L9:
        return a(((kv) (obj)));
_L7:
        if (!b.equals(((equals) (obj)).b))
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
        int k = 0;
        int l = kz.a(a);
        int j;
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
        return ((j + (l + 527) * 31) * 31 + k) * 31 + c();
    }

    public ()
    {
        a = b();
        b = null;
        c = "";
        r = null;
        s = -1;
    }
}
