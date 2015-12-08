// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(PropertySet propertyset)
    {
        return (Boolean)propertyset.get(TrackProperty.MONETIZABLE);
    }

    public final volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
    }
}
