// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzae

public final class SearchAdRequestParcel
    implements SafeParcelable
{

    public static final zzae CREATOR = new zzae();
    public final int backgroundColor;
    public final int versionCode;
    public final int zztP;
    public final int zztQ;
    public final int zztR;
    public final int zztS;
    public final int zztT;
    public final int zztU;
    public final int zztV;
    public final String zztW;
    public final int zztX;
    public final String zztY;
    public final int zztZ;
    public final int zzua;
    public final String zzub;

    SearchAdRequestParcel(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        zztP = j;
        backgroundColor = k;
        zztQ = l;
        zztR = i1;
        zztS = j1;
        zztT = k1;
        zztU = l1;
        zztV = i2;
        zztW = s;
        zztX = j2;
        zztY = s1;
        zztZ = k2;
        zzua = l2;
        zzub = s2;
    }

    public SearchAdRequestParcel(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        zztP = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        zztQ = searchadrequest.getBackgroundGradientBottom();
        zztR = searchadrequest.getBackgroundGradientTop();
        zztS = searchadrequest.getBorderColor();
        zztT = searchadrequest.getBorderThickness();
        zztU = searchadrequest.getBorderType();
        zztV = searchadrequest.getCallButtonColor();
        zztW = searchadrequest.getCustomChannels();
        zztX = searchadrequest.getDescriptionTextColor();
        zztY = searchadrequest.getFontFace();
        zztZ = searchadrequest.getHeaderTextColor();
        zzua = searchadrequest.getHeaderTextSize();
        zzub = searchadrequest.getQuery();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzae.a(this, parcel);
    }

}
