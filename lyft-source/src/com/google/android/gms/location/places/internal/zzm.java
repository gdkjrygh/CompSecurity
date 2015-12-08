// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, zzr, PlaceImpl, PlaceLikelihoodEntity

public class zzm extends zzt
    implements PlaceLikelihood
{

    private final Context c;

    public zzm(DataHolder dataholder, int i, Context context)
    {
        super(dataholder, i);
        c = context;
    }

    public Object a()
    {
        return c();
    }

    public Place b()
    {
        return new zzr(a, b, c);
    }

    public PlaceLikelihood c()
    {
        return PlaceLikelihoodEntity.a((PlaceImpl)b().a(), d());
    }

    public float d()
    {
        return a("place_likelihood", -1F);
    }
}
