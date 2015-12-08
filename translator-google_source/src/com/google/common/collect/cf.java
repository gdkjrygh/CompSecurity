// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ad, cj, cd

final class cf extends ad
{

    final cd a;

    cf(cd cd1, cj cj1)
    {
        a = cd1;
        super(cj1);
    }

    protected final Object a(Object obj)
    {
        cj cj1 = ((cj)obj).getNextExpirable();
        obj = cj1;
        if (cj1 == a.a)
        {
            obj = null;
        }
        return obj;
    }
}
