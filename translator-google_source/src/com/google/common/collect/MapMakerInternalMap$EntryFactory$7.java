// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cu, cj

final class nit> extends nit>
{

    final cj copyEntry(nit> nit>, cj cj, cj cj1)
    {
        nit> = super.pyEntry(nit>, cj, cj1);
        copyEvictableEntry(cj, nit>);
        return nit>;
    }

    final cj newEntry(copyEvictableEntry copyevictableentry, Object obj, int i, cj cj)
    {
        return new cu(copyevictableentry.renceQueue, obj, i, cj);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
