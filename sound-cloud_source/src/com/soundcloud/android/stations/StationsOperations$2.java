// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;
import java.util.List;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(StationRecord stationrecord)
    {
        boolean flag;
        if (stationrecord.getTracks().size() > 0)
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
        return call((StationRecord)obj);
    }

    ()
    {
    }
}
