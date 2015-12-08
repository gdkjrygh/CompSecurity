// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            aw

public final class av
    implements SafeParcelable
{

    public static final aw CREATOR = new aw();
    public final int backgroundColor;
    public final int mA;
    public final int mB;
    public final String mC;
    public final int mq;
    public final int mr;
    public final int ms;
    public final int mt;
    public final int mu;
    public final int mv;
    public final int mw;
    public final String mx;
    public final int my;
    public final String mz;
    public final int versionCode;

    av(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        mq = j;
        backgroundColor = k;
        mr = l;
        ms = i1;
        mt = j1;
        mu = k1;
        mv = l1;
        mw = i2;
        mx = s;
        my = j2;
        mz = s1;
        mA = k2;
        mB = l2;
        mC = s2;
    }

    public av(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        mq = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        mr = searchadrequest.getBackgroundGradientBottom();
        ms = searchadrequest.getBackgroundGradientTop();
        mt = searchadrequest.getBorderColor();
        mu = searchadrequest.getBorderThickness();
        mv = searchadrequest.getBorderType();
        mw = searchadrequest.getCallButtonColor();
        mx = searchadrequest.getCustomChannels();
        my = searchadrequest.getDescriptionTextColor();
        mz = searchadrequest.getFontFace();
        mA = searchadrequest.getHeaderTextColor();
        mB = searchadrequest.getHeaderTextSize();
        mC = searchadrequest.getQuery();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aw.a(this, parcel, i);
    }

}
