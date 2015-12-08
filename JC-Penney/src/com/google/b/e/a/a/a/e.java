// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.b.a;
import com.google.b.m;

// Referenced classes of package com.google.b.e.a.a.a:
//            i, t

final class e extends i
{

    private final String a;
    private final String b;

    e(a a1, String s, String s1)
    {
        super(a1);
        a = s1;
        b = s;
    }

    private void c(StringBuilder stringbuilder, int j)
    {
        int k = c().a(j, 16);
        if (k == 38400)
        {
            return;
        }
        stringbuilder.append('(');
        stringbuilder.append(a);
        stringbuilder.append(')');
        j = k % 32;
        int l = k / 32;
        k = l % 12 + 1;
        l /= 12;
        if (l / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(l);
        if (k / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(k);
        if (j / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(j);
    }

    protected int a(int j)
    {
        return j % 0x186a0;
    }

    public String a()
    {
        if (b().a() != 84)
        {
            throw m.a();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            b(stringbuilder, 8);
            b(stringbuilder, 48, 20);
            c(stringbuilder, 68);
            return stringbuilder.toString();
        }
    }

    protected void a(StringBuilder stringbuilder, int j)
    {
        j /= 0x186a0;
        stringbuilder.append('(');
        stringbuilder.append(b);
        stringbuilder.append(j);
        stringbuilder.append(')');
    }
}
