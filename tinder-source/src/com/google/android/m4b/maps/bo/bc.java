// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            n, m, g, i

public final class bc extends n
{

    public g a[];
    m b;

    protected bc(g ag[])
    {
        a = ag;
        b = m.a(ag);
    }

    public static bc a(g g1, g g2, g g3, g g4)
    {
        return new bc(new g[] {
            g1, g2, g4, g3
        });
    }

    public final g a(int j)
    {
        return a[j];
    }

    public final m a()
    {
        return b;
    }

    public final boolean a(g g1)
    {
        int j;
        int k;
        if (i.b(a[0], a[1], g1))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        j = k;
        if (i.b(a[1], a[2], g1))
        {
            j = k + 1;
        }
        k = j;
        if (i.b(a[2], a[3], g1))
        {
            k = j + 1;
        }
        j = k;
        if (i.b(a[3], a[0], g1))
        {
            j = k + 1;
        }
        return j == 1;
    }

    public final int b()
    {
        return 4;
    }

    public final boolean b(n n1)
    {
        if (b.a(n1.a())) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= n1.b())
                {
                    break label1;
                }
                if (!a(n1.a(j)))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof bc)
        {
            obj = (bc)obj;
            return Arrays.equals(a, ((bc) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final g h()
    {
        return a[3];
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }

    public final String toString()
    {
        String s = String.valueOf(a[0]);
        String s1 = String.valueOf(a[1]);
        String s2 = String.valueOf(a[2]);
        String s3 = String.valueOf(a[3]);
        return (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("[").append(s).append(",").append(s1).append(",").append(s2).append(",").append(s3).append("]").toString();
    }
}
