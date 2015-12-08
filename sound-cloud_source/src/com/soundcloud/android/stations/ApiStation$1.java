// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.java.functions.Function;

final class 
    implements Function
{

    public final Urn apply(TrackRecord trackrecord)
    {
        return trackrecord.getUrn();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((TrackRecord)obj);
    }

    ()
    {
    }
}
