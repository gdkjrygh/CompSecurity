// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            ju, em

final class ei extends ju
{

    private final transient em a;

    ei(Object aobj[], em em1)
    {
        super(aobj, 0, aobj.length);
        a = em1;
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }
}
