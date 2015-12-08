// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ie

public final class pb
{

    public final AdRequestInfoParcel a;
    public final AdResponseParcel b;
    public final ie c;
    public final AdSizeParcel d;
    public final int e;
    public final long f;
    public final long g;
    public final JSONObject h;

    public pb(AdRequestInfoParcel adrequestinfoparcel, AdResponseParcel adresponseparcel, ie ie, AdSizeParcel adsizeparcel, int i, long l, 
            long l1, JSONObject jsonobject)
    {
        a = adrequestinfoparcel;
        b = adresponseparcel;
        c = ie;
        d = adsizeparcel;
        e = i;
        f = l;
        g = l1;
        h = jsonobject;
    }
}
