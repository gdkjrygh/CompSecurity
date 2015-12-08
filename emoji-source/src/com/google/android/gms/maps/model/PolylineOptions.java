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
    private int Dj;
    private float aaC;
    private final List aaX;
    private boolean aaZ;
    private float aax;
    private boolean aay;
    private final int xM;

    public PolylineOptions()
    {
        aaC = 10F;
        Dj = 0xff000000;
        aax = 0.0F;
        aay = true;
        aaZ = false;
        xM = 1;
        aaX = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        aaC = 10F;
        Dj = 0xff000000;
        aax = 0.0F;
        aay = true;
        aaZ = false;
        xM = i;
        aaX = list;
        aaC = f;
        Dj = j;
        aax = f1;
        aay = flag;
        aaZ = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        aaX.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        aaX.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); aaX.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolylineOptions color(int i)
    {
        Dj = i;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolylineOptions geodesic(boolean flag)
    {
        aaZ = flag;
        return this;
    }

    public int getColor()
    {
        return Dj;
    }

    public List getPoints()
    {
        return aaX;
    }

    int getVersionCode()
    {
        return xM;
    }

    public float getWidth()
    {
        return aaC;
    }

    public float getZIndex()
    {
        return aax;
    }

    public boolean isGeodesic()
    {
        return aaZ;
    }

    public boolean isVisible()
    {
        return aay;
    }

    public PolylineOptions visible(boolean flag)
    {
        aay = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        aaC = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jL())
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
        aax = f;
        return this;
    }

}
