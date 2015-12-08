// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            o, p

public final class PolylineOptions
    implements SafeParcelable
{

    public static final o CREATOR = new o();
    private final List aAC;
    private boolean aAE;
    private float aAc;
    private boolean aAd;
    private float aAh;
    private int mColor;
    private final int mVersionCode;

    public PolylineOptions()
    {
        aAh = 10F;
        mColor = 0xff000000;
        aAc = 0.0F;
        aAd = true;
        aAE = false;
        mVersionCode = 1;
        aAC = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        aAh = 10F;
        mColor = 0xff000000;
        aAc = 0.0F;
        aAd = true;
        aAE = false;
        mVersionCode = i;
        aAC = list;
        aAh = f;
        mColor = j;
        aAc = f1;
        aAd = flag;
        aAE = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getColor()
    {
        return mColor;
    }

    public final List getPoints()
    {
        return aAC;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final float getWidth()
    {
        return aAh;
    }

    public final float getZIndex()
    {
        return aAc;
    }

    public final boolean isGeodesic()
    {
        return aAE;
    }

    public final boolean isVisible()
    {
        return aAd;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            p.a(this, parcel, i);
            return;
        } else
        {
            o.a(this, parcel, i);
            return;
        }
    }

}
