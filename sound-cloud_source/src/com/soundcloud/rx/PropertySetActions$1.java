// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import com.soundcloud.java.collections.PropertySet;
import rx.b.b;

final class val.sourceSet
    implements b
{

    final PropertySet val$sourceSet;

    public final void call(PropertySet propertyset)
    {
        val$sourceSet.update(propertyset);
    }

    public final volatile void call(Object obj)
    {
        call((PropertySet)obj);
    }

    ySet()
    {
        val$sourceSet = propertyset;
        super();
    }
}
