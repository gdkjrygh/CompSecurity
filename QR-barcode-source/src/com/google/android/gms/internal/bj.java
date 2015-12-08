// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            bk

public final class bj
    implements SafeParcelable
{

    public static final bk CREATOR = new bk();
    public final int backgroundColor;
    public final int oH;
    public final int oI;
    public final int oJ;
    public final int oK;
    public final int oL;
    public final int oM;
    public final int oN;
    public final String oO;
    public final int oP;
    public final String oQ;
    public final int oR;
    public final int oS;
    public final String oT;
    public final int versionCode;

    bj(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        oH = j;
        backgroundColor = k;
        oI = l;
        oJ = i1;
        oK = j1;
        oL = k1;
        oM = l1;
        oN = i2;
        oO = s;
        oP = j2;
        oQ = s1;
        oR = k2;
        oS = l2;
        oT = s2;
    }

    public bj(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        oH = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        oI = searchadrequest.getBackgroundGradientBottom();
        oJ = searchadrequest.getBackgroundGradientTop();
        oK = searchadrequest.getBorderColor();
        oL = searchadrequest.getBorderThickness();
        oM = searchadrequest.getBorderType();
        oN = searchadrequest.getCallButtonColor();
        oO = searchadrequest.getCustomChannels();
        oP = searchadrequest.getDescriptionTextColor();
        oQ = searchadrequest.getFontFace();
        oR = searchadrequest.getHeaderTextColor();
        oS = searchadrequest.getHeaderTextSize();
        oT = searchadrequest.getQuery();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bk.a(this, parcel, i);
    }

}
