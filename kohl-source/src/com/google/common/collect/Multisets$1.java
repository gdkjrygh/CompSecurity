// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Multisets

static final class stractEntry extends stractEntry
{

    final Object val$e;
    final int val$n;

    public int getCount()
    {
        return val$n;
    }

    public Object getElement()
    {
        return val$e;
    }

    stractEntry(Object obj, int i)
    {
        val$e = obj;
        val$n = i;
        super();
    }
}
