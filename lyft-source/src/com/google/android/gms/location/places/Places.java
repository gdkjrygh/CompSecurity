// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.places.internal.zzc;
import com.google.android.gms.location.places.internal.zzi;

// Referenced classes of package com.google.android.gms.location.places:
//            GeoDataApi, PlaceDetectionApi

public class Places
{

    public static final com.google.android.gms.common.api.Api.ClientKey a;
    public static final com.google.android.gms.common.api.Api.ClientKey b;
    public static final Api c;
    public static final Api d;
    public static final GeoDataApi e = new zzc();
    public static final PlaceDetectionApi f = new zzi();

    static 
    {
        a = new com.google.android.gms.common.api.Api.ClientKey();
        b = new com.google.android.gms.common.api.Api.ClientKey();
        c = new Api("Places.GEO_DATA_API", new com.google.android.gms.location.places.internal.zzd.zza(null, null), a, new Scope[0]);
        d = new Api("Places.PLACE_DETECTION_API", new com.google.android.gms.location.places.internal.zzj.zza(null, null), b, new Scope[0]);
    }
}
