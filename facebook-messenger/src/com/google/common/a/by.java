// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            bn, cr, cn, cm

final class by extends bn
{

    by(String s, int i)
    {
        super(s, i, null);
    }

    cm copyEntry(cn cn1, cm cm, cm cm1)
    {
        cn1 = super.copyEntry(cn1, cm, cm1);
        copyExpirableEntry(cm, cn1);
        copyEvictableEntry(cm, cn1);
        return cn1;
    }

    cm newEntry(cn cn1, Object obj, int i, cm cm)
    {
        return new cr(cn1.g, obj, i, cm);
    }
}
