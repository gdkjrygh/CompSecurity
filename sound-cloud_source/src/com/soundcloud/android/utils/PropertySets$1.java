// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Function;

final class ce
    implements Function
{

    public final PropertySet apply(PropertySetSource propertysetsource)
    {
        return propertysetsource.toPropertySet();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((PropertySetSource)obj);
    }

    ce()
    {
    }
}
