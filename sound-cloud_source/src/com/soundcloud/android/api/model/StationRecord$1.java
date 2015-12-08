// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.api.model:
//            StationRecord

final class 
    implements Function
{

    public final Urn apply(StationRecord stationrecord)
    {
        return stationrecord.getUrn();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((StationRecord)obj);
    }

    ()
    {
    }
}
