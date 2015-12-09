// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Arrays;

// Referenced classes of package b.a:
//            os, fy

public final class fz
{

    final fy a[];
    final os b;

    public fz(fy afy[])
    {
        a = (fy[])afy.clone();
        b = new os(afy.length);
        for (int i = 0; i < afy.length; i++)
        {
            b.a(i, afy[i].m);
        }

    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof fz) && Arrays.equals(((fz)obj).a, a);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(a[i]);
        }

        return stringbuilder.toString();
    }
}
