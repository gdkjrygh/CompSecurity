// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.charset.CodingErrorAction;

public final class hdh
{

    final boolean a;
    final boolean b;
    final CodingErrorAction c;
    final CodingErrorAction d;
    final int e;
    public final int f;

    public hdh(boolean flag, boolean flag1, CodingErrorAction codingerroraction, CodingErrorAction codingerroraction1, int i, int j, int k, 
            int l)
    {
        boolean flag3 = true;
        super();
        boolean flag2;
        if (k > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        hdm.a(flag2, (new StringBuilder("packer buffer size must be larger than 0: ")).append(k).toString());
        if (i > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        hdm.a(flag2, (new StringBuilder("string encoder buffer size must be larger than 0: ")).append(i).toString());
        if (j > 0)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        hdm.a(flag2, (new StringBuilder("string decoder buffer size must be larger than 0: ")).append(j).toString());
        a = flag;
        b = flag1;
        c = codingerroraction;
        d = codingerroraction1;
        e = k;
        f = l;
    }
}
