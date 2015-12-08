// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import com.soundcloud.java.collections.PropertySet;
import rx.b.g;

final class et
    implements g
{

    public final PropertySet call(PropertySet propertyset, PropertySet propertyset1)
    {
        return propertyset.merge(propertyset1);
    }

    public final volatile Object call(Object obj, Object obj1)
    {
        return call((PropertySet)obj, (PropertySet)obj1);
    }

    et()
    {
    }
}
