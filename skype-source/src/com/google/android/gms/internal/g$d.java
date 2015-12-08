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
    public c b[];
    public c c[];

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    s s = a[j];
                    int i1 = i;
                    if (s != null)
                    {
                        i1 = i + ku.b(1, s);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (int k = 0; k < b.length;)
                {
                    s s1 = b[k];
                    int j1 = i;
                    if (s1 != null)
                    {
                        j1 = i + ku.b(2, s1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (c != null)
        {
            k1 = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    s s2 = c[l];
                    k1 = i;
                    if (s2 != null)
                    {
                        k1 = i + ku.b(3, s2);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                int i1 = lf.a(kt1, 10);
                 a1[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                a1 = new a[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, a1, 0, j);
                    i1 = j;
                }
                for (; i1 < a1.length - 1; i1++)
                {
                    a1[i1] = new <init>();
                    kt1.a(a1[i1]);
                    kt1.a();
                }

                a1[i1] = new <init>();
                kt1.a(a1[i1]);
                a = a1;
                break;

            case 18: // '\022'
                int j1 = lf.a(kt1, 18);
                 a2[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                a2 = new b[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, a2, 0, k);
                    j1 = k;
                }
                for (; j1 < a2.length - 1; j1++)
                {
                    a2[j1] = new <init>();
                    kt1.a(a2[j1]);
                    kt1.a();
                }

                a2[j1] = new <init>();
                kt1.a(a2[j1]);
                b = a2;
                break;

            case 26: // '\032'
                int k1 = lf.a(kt1, 26);
                 a3[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                a3 = new c[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, a3, 0, l);
                    k1 = l;
                }
                for (; k1 < a3.length - 1; k1++)
                {
                    a3[k1] = new <init>();
                    kt1.a(a3[k1]);
                    kt1.a();
                }

                a3[k1] = new <init>();
                kt1.a(a3[k1]);
                c = a3;
                break;
            }
        } while (true);
    }

    public final void a(ku ku1)
        throws IOException
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                c c1 = a[i];
                if (c1 != null)
                {
                    ku1.a(1, c1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                c c2 = b[j];
                if (c2 != null)
                {
                    ku1.a(2, c2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                c c3 = c[k];
                if (c3 != null)
                {
                    ku1.a(3, c3);
                }
            }

        }
        super.a(ku1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof )
            {
                obj = ()obj;
                flag = flag1;
                if (kz.a(a, ((a) (obj)).a))
                {
                    flag = flag1;
                    if (kz.a(b, ((b) (obj)).b))
                    {
                        flag = flag1;
                        if (kz.a(c, ((c) (obj)).c))
                        {
                            return a(((kv) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (((kz.a(a) + 527) * 31 + kz.a(b)) * 31 + kz.a(c)) * 31 + c();
    }

    public ()
    {
        a = b();
        b = b();
        c = b();
        r = null;
        s = -1;
    }
}
