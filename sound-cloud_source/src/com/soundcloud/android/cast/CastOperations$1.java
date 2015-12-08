// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(PropertySet propertyset)
    {
        boolean flag;
        if (!((Boolean)propertyset.get(TrackProperty.IS_PRIVATE)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
    }
}
