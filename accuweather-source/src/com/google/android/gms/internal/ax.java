// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ay

public final class ax
    implements SafeParcelable
{

    public static final ay CREATOR = new ay();
    public final int backgroundColor;
    public final int mB;
    public final int mC;
    public final int mD;
    public final int mE;
    public final int mF;
    public final int mG;
    public final int mH;
    public final String mI;
    public final int mJ;
    public final String mK;
    public final int mL;
    public final int mM;
    public final String mN;
    public final int versionCode;

    ax(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        mB = j;
        backgroundColor = k;
        mC = l;
        mD = i1;
        mE = j1;
        mF = k1;
        mG = l1;
        mH = i2;
        mI = s;
        mJ = j2;
        mK = s1;
        mL = k2;
        mM = l2;
        mN = s2;
    }

    public ax(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        mB = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        mC = searchadrequest.getBackgroundGradientBottom();
        mD = searchadrequest.getBackgroundGradientTop();
        mE = searchadrequest.getBorderColor();
        mF = searchadrequest.getBorderThickness();
        mG = searchadrequest.getBorderType();
        mH = searchadrequest.getCallButtonColor();
        mI = searchadrequest.getCustomChannels();
        mJ = searchadrequest.getDescriptionTextColor();
        mK = searchadrequest.getFontFace();
        mL = searchadrequest.getHeaderTextColor();
        mM = searchadrequest.getHeaderTextSize();
        mN = searchadrequest.getQuery();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ay.a(this, parcel, i);
    }

}
