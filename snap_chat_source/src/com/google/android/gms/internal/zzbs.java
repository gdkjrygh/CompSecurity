// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            zzbt

public final class zzbs
    implements SafeParcelable
{

    public static final zzbt CREATOR = new zzbt();
    public final int backgroundColor;
    public final int versionCode;
    public final int zzpN;
    public final int zzpO;
    public final int zzpP;
    public final int zzpQ;
    public final int zzpR;
    public final int zzpS;
    public final int zzpT;
    public final String zzpU;
    public final int zzpV;
    public final String zzpW;
    public final int zzpX;
    public final int zzpY;
    public final String zzpZ;

    zzbs(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        zzpN = j;
        backgroundColor = k;
        zzpO = l;
        zzpP = i1;
        zzpQ = j1;
        zzpR = k1;
        zzpS = l1;
        zzpT = i2;
        zzpU = s;
        zzpV = j2;
        zzpW = s1;
        zzpX = k2;
        zzpY = l2;
        zzpZ = s2;
    }

    public zzbs(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        zzpN = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        zzpO = searchadrequest.getBackgroundGradientBottom();
        zzpP = searchadrequest.getBackgroundGradientTop();
        zzpQ = searchadrequest.getBorderColor();
        zzpR = searchadrequest.getBorderThickness();
        zzpS = searchadrequest.getBorderType();
        zzpT = searchadrequest.getCallButtonColor();
        zzpU = searchadrequest.getCustomChannels();
        zzpV = searchadrequest.getDescriptionTextColor();
        zzpW = searchadrequest.getFontFace();
        zzpX = searchadrequest.getHeaderTextColor();
        zzpY = searchadrequest.getHeaderTextSize();
        zzpZ = searchadrequest.getQuery();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzbt.zza(this, parcel, i);
    }

}
