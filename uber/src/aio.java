// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import org.json.JSONObject;

public final class aio
{

    public final AdRequestInfoParcel a;
    public final AdResponseParcel b;
    public final aeb c;
    public final AdSizeParcel d;
    public final int e;
    public final long f;
    public final long g;
    public final JSONObject h;

    public aio(AdRequestInfoParcel adrequestinfoparcel, AdResponseParcel adresponseparcel, aeb aeb, AdSizeParcel adsizeparcel, int i, long l, 
            long l1, JSONObject jsonobject)
    {
        a = adrequestinfoparcel;
        b = adresponseparcel;
        c = aeb;
        d = adsizeparcel;
        e = i;
        f = l;
        g = l1;
        h = jsonobject;
    }
}
