// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

public class PolicyMapper extends RxResultMapper
{

    public PolicyMapper()
    {
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(1);
        if (cursorreader.isNotNull("sub_mid_tier"))
        {
            propertyset.put(TrackProperty.SUB_MID_TIER, Boolean.valueOf(cursorreader.getBoolean("sub_mid_tier")));
        }
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
