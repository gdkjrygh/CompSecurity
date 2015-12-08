// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.internal.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacesStatusCodes, AutocompletePrediction

public class AutocompletePredictionBuffer extends AbstractDataBuffer
    implements Result
{

    public AutocompletePredictionBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Status a()
    {
        return PlacesStatusCodes.c(a.e());
    }

    public Object a(int i)
    {
        return b(i);
    }

    public AutocompletePrediction b(int i)
    {
        return new zzb(a, i);
    }

    public String toString()
    {
        return zzt.a(this).a("status", a()).toString();
    }
}
