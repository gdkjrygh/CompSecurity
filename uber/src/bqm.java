// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;

final class bqm extends HashSet
{

    bqm()
    {
        bqk abqk[] = bqk.values();
        int j = abqk.length;
        for (int i = 0; i < j; i++)
        {
            add(abqk[i].a());
        }

    }
}
