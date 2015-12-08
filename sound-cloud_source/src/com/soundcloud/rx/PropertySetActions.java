// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import com.soundcloud.java.collections.PropertySet;
import rx.b.b;

public final class PropertySetActions
{

    private PropertySetActions()
    {
    }

    public static b update(final PropertySet sourceSet)
    {
        return new _cls1();
    }

    private class _cls1
        implements b
    {

        final PropertySet val$sourceSet;

        public final void call(PropertySet propertyset)
        {
            sourceSet.update(propertyset);
        }

        public final volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls1()
        {
            sourceSet = propertyset;
            super();
        }
    }

}
