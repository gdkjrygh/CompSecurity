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
//            m, n

public final class PolygonOptions
    implements SafeParcelable
{

    public static final m CREATOR = new m();
    private final List aAC;
    private final List aAD;
    private boolean aAE;
    private int aAa;
    private int aAb;
    private float aAc;
    private boolean aAd;
    private float azZ;
    private final int mVersionCode;

    public PolygonOptions()
    {
        azZ = 10F;
        aAa = 0xff000000;
        aAb = 0;
        aAc = 0.0F;
        aAd = true;
        aAE = false;
        mVersionCode = 1;
        aAC = new ArrayList();
        aAD = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        azZ = 10F;
        aAa = 0xff000000;
        aAb = 0;
        aAc = 0.0F;
        aAd = true;
        aAE = false;
        mVersionCode = i;
        aAC = list;
        aAD = list1;
        azZ = f;
        aAa = j;
        aAb = k;
        aAc = f1;
        aAd = flag;
        aAE = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getFillColor()
    {
        return aAb;
    }

    public final List getPoints()
    {
        return aAC;
    }

    public final int getStrokeColor()
    {
        return aAa;
    }

    public final float getStrokeWidth()
    {
        return azZ;
    }

    final int getVersionCode()
    {
        return mVersionCode;
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

    final List qt()
    {
        return aAD;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            n.a(this, parcel, i);
            return;
        } else
        {
            m.a(this, parcel, i);
            return;
        }
    }

}
