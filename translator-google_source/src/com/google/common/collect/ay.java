// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            v, ImmutableSet, ax

final class ay extends v
{

    final java.util.Map.Entry a;
    final ax b;

    ay(ax ax, java.util.Map.Entry entry)
    {
        b = ax;
        a = entry;
        super();
    }

    public final Object getKey()
    {
        return a.getKey();
    }

    public final Object getValue()
    {
        return ImmutableSet.of(a.getValue());
    }
}
