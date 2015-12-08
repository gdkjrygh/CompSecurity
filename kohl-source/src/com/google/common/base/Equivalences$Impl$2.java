// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Equivalences

static final class nit> extends nit>
{

    public boolean equivalent(Object obj, Object obj1)
    {
        return obj == obj1;
    }

    public int hash(Object obj)
    {
        return System.identityHashCode(obj);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
