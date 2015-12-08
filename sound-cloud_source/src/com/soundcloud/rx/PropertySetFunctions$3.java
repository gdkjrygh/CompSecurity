// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

final class val.sourceSet
    implements f
{

    final PropertySet val$sourceSet;

    public final PropertySet call(PropertySet propertyset)
    {
        return val$sourceSet.merge(propertyset);
    }

    public final volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    et()
    {
        val$sourceSet = propertyset;
        super();
    }
}
