// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptionsCreator, LatLng, h

public final class PolylineOptions
    implements SafeParcelable
{

    public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();
    private int Av;
    private float SN;
    private boolean SO;
    private float SS;
    private final List Tn;
    private boolean Tp;
    private final int xH;

    public PolylineOptions()
    {
        SS = 10F;
        Av = 0xff000000;
        SN = 0.0F;
        SO = true;
        Tp = false;
        xH = 1;
        Tn = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        SS = 10F;
        Av = 0xff000000;
        SN = 0.0F;
        SO = true;
        Tp = false;
        xH = i;
        Tn = list;
        SS = f;
        Av = j;
        SN = f1;
        SO = flag;
        Tp = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        Tn.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        Tn.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); Tn.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolylineOptions color(int i)
    {
        Av = i;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolylineOptions geodesic(boolean flag)
    {
        Tp = flag;
        return this;
    }

    public int getColor()
    {
        return Av;
    }

    public List getPoints()
    {
        return Tn;
    }

    int getVersionCode()
    {
        return xH;
    }

    public float getWidth()
    {
        return SS;
    }

    public float getZIndex()
    {
        return SN;
    }

    public boolean isGeodesic()
    {
        return Tp;
    }

    public boolean isVisible()
    {
        return SO;
    }

    public PolylineOptions visible(boolean flag)
    {
        SO = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        SS = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.iB())
        {
            h.a(this, parcel, i);
            return;
        } else
        {
            PolylineOptionsCreator.a(this, parcel, i);
            return;
        }
    }

    public PolylineOptions zIndex(float f)
    {
        SN = f;
        return this;
    }

}
