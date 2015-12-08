// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, AutocompletePredictionEntity

public class zzb extends zzt
    implements AutocompletePrediction
{

    public zzb(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object a()
    {
        return e();
    }

    public String b()
    {
        return a("ap_description", "");
    }

    public String c()
    {
        return a("ap_place_id", null);
    }

    public List d()
    {
        return a("ap_place_types", Collections.emptyList());
    }

    public AutocompletePrediction e()
    {
        return AutocompletePredictionEntity.a(b(), c(), d(), f(), g());
    }

    public List f()
    {
        return a("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    public int g()
    {
        return a("ap_personalization_type", 6);
    }
}
