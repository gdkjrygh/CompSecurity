// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            bn, da, cn, cm

final class bu extends bn
{

    bu(String s, int i)
    {
        super(s, i, null);
    }

    cm copyEntry(cn cn, cm cm, cm cm1)
    {
        cn = super.copyEntry(cn, cm, cm1);
        copyExpirableEntry(cm, cn);
        copyEvictableEntry(cm, cn);
        return cn;
    }

    cm newEntry(cn cn, Object obj, int i, cm cm)
    {
        return new da(obj, i, cm);
    }
}
