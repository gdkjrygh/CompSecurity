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
    public final int zztA;
    public final int zztB;
    public final int zztC;
    public final int zztD;
    public final int zztE;
    public final int zztF;
    public final int zztG;
    public final String zztH;
    public final int zztI;
    public final String zztJ;
    public final int zztK;
    public final int zztL;
    public final String zztM;

    SearchAdRequestParcel(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        zztA = j;
        backgroundColor = k;
        zztB = l;
        zztC = i1;
        zztD = j1;
        zztE = k1;
        zztF = l1;
        zztG = i2;
        zztH = s;
        zztI = j2;
        zztJ = s1;
        zztK = k2;
        zztL = l2;
        zztM = s2;
    }

    public SearchAdRequestParcel(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        zztA = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        zztB = searchadrequest.getBackgroundGradientBottom();
        zztC = searchadrequest.getBackgroundGradientTop();
        zztD = searchadrequest.getBorderColor();
        zztE = searchadrequest.getBorderThickness();
        zztF = searchadrequest.getBorderType();
        zztG = searchadrequest.getCallButtonColor();
        zztH = searchadrequest.getCustomChannels();
        zztI = searchadrequest.getDescriptionTextColor();
        zztJ = searchadrequest.getFontFace();
        zztK = searchadrequest.getHeaderTextColor();
        zztL = searchadrequest.getHeaderTextSize();
        zztM = searchadrequest.getQuery();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzae.zza(this, parcel, i);
    }

}
