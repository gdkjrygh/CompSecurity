// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

static final class nit> extends nit>
{

    nit> copyEntry(CustomConcurrentHashMap customconcurrenthashmap, nit> nit>, nit> nit>1)
    {
        customconcurrenthashmap = super.pyEntry(customconcurrenthashmap, nit>, nit>1);
        copyExpirableEntry(nit>, customconcurrenthashmap);
        copyEvictableEntry(nit>, customconcurrenthashmap);
        return customconcurrenthashmap;
    }

    copyEvictableEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, copyEvictableEntry copyevictableentry)
    {
        return new ictableEntry(customconcurrenthashmap, obj, i, copyevictableentry);
    }

    ictableEntry(String s, int i)
    {
        super(s, i, null);
    }
}
