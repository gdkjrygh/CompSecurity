// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.b.a;

// Referenced classes of package com.google.b.e.a.a.a:
//            j, t

abstract class h extends j
{

    h(a a1)
    {
        super(a1);
    }

    private static void a(StringBuilder stringbuilder, int i)
    {
        int k = 0;
        int l = 0;
        for (; k < 13; k++)
        {
            int j1 = stringbuilder.charAt(k + i) - 48;
            int i1 = j1;
            if ((k & 1) == 0)
            {
                i1 = j1 * 3;
            }
            l += i1;
        }

        k = 10 - l % 10;
        i = k;
        if (k == 10)
        {
            i = 0;
        }
        stringbuilder.append(i);
    }

    protected final void a(StringBuilder stringbuilder, int i, int k)
    {
        for (int l = 0; l < 4; l++)
        {
            int i1 = c().a(l * 10 + i, 10);
            if (i1 / 100 == 0)
            {
                stringbuilder.append('0');
            }
            if (i1 / 10 == 0)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(i1);
        }

        a(stringbuilder, k);
    }

    protected final void b(StringBuilder stringbuilder, int i)
    {
        stringbuilder.append("(01)");
        int k = stringbuilder.length();
        stringbuilder.append('9');
        a(stringbuilder, i, k);
    }
}
