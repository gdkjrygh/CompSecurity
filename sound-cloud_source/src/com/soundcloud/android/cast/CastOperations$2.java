// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

final class 
    implements f
{

    public final Urn call(PropertySet propertyset)
    {
        return (Urn)propertyset.get(TrackProperty.URN);
    }

    public final volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
    }
}
