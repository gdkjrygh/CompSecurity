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
    public final int zzth;
    public final int zzti;
    public final int zztj;
    public final int zztk;
    public final int zztl;
    public final int zztm;
    public final int zztn;
    public final String zzto;
    public final int zztp;
    public final String zztq;
    public final int zztr;
    public final int zzts;
    public final String zztt;

    SearchAdRequestParcel(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        zzth = j;
        backgroundColor = k;
        zzti = l;
        zztj = i1;
        zztk = j1;
        zztl = k1;
        zztm = l1;
        zztn = i2;
        zzto = s;
        zztp = j2;
        zztq = s1;
        zztr = k2;
        zzts = l2;
        zztt = s2;
    }

    public SearchAdRequestParcel(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        zzth = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        zzti = searchadrequest.getBackgroundGradientBottom();
        zztj = searchadrequest.getBackgroundGradientTop();
        zztk = searchadrequest.getBorderColor();
        zztl = searchadrequest.getBorderThickness();
        zztm = searchadrequest.getBorderType();
        zztn = searchadrequest.getCallButtonColor();
        zzto = searchadrequest.getCustomChannels();
        zztp = searchadrequest.getDescriptionTextColor();
        zztq = searchadrequest.getFontFace();
        zztr = searchadrequest.getHeaderTextColor();
        zzts = searchadrequest.getHeaderTextSize();
        zztt = searchadrequest.getQuery();
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
