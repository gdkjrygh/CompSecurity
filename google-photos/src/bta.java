// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class bta
    implements btb
{

    private bnk a;
    private cag b;
    private int c;

    bta(bnk bnk, cag cag, int i)
    {
        a = bnk;
        b = cag;
        c = i;
        super();
    }

    public final bsz a(List list, List list1, int i, int j)
    {
        return new bsz(a, b, list, list1, i, j, c);
    }
}
