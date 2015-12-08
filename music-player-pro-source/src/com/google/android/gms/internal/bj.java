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
    public final int oQ;
    public final int oR;
    public final int oS;
    public final int oT;
    public final int oU;
    public final int oV;
    public final int oW;
    public final String oX;
    public final int oY;
    public final String oZ;
    public final int pa;
    public final int pb;
    public final String pc;
    public final int versionCode;

    bj(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        oQ = j;
        backgroundColor = k;
        oR = l;
        oS = i1;
        oT = j1;
        oU = k1;
        oV = l1;
        oW = i2;
        oX = s;
        oY = j2;
        oZ = s1;
        pa = k2;
        pb = l2;
        pc = s2;
    }

    public bj(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        oQ = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        oR = searchadrequest.getBackgroundGradientBottom();
        oS = searchadrequest.getBackgroundGradientTop();
        oT = searchadrequest.getBorderColor();
        oU = searchadrequest.getBorderThickness();
        oV = searchadrequest.getBorderType();
        oW = searchadrequest.getCallButtonColor();
        oX = searchadrequest.getCustomChannels();
        oY = searchadrequest.getDescriptionTextColor();
        oZ = searchadrequest.getFontFace();
        pa = searchadrequest.getHeaderTextColor();
        pb = searchadrequest.getHeaderTextSize();
        pc = searchadrequest.getQuery();
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
