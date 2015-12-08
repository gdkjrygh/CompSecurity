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
//            PolygonOptionsCreator, LatLng, g

public final class PolygonOptions
    implements SafeParcelable
{

    public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();
    private float SK;
    private int SL;
    private int SM;
    private float SN;
    private boolean SO;
    private final List Tn;
    private final List To;
    private boolean Tp;
    private final int xH;

    public PolygonOptions()
    {
        SK = 10F;
        SL = 0xff000000;
        SM = 0;
        SN = 0.0F;
        SO = true;
        Tp = false;
        xH = 1;
        Tn = new ArrayList();
        To = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        SK = 10F;
        SL = 0xff000000;
        SM = 0;
        SN = 0.0F;
        SO = true;
        Tp = false;
        xH = i;
        Tn = list;
        To = list1;
        SK = f;
        SL = j;
        SM = k;
        SN = f1;
        SO = flag;
        Tp = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        Tn.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        Tn.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); Tn.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        To.add(arraylist);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        SM = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        Tp = flag;
        return this;
    }

    public int getFillColor()
    {
        return SM;
    }

    public List getHoles()
    {
        return To;
    }

    public List getPoints()
    {
        return Tn;
    }

    public int getStrokeColor()
    {
        return SL;
    }

    public float getStrokeWidth()
    {
        return SK;
    }

    int getVersionCode()
    {
        return xH;
    }

    public float getZIndex()
    {
        return SN;
    }

    List iF()
    {
        return To;
    }

    public boolean isGeodesic()
    {
        return Tp;
    }

    public boolean isVisible()
    {
        return SO;
    }

    public PolygonOptions strokeColor(int i)
    {
        SL = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        SK = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        SO = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.iB())
        {
            g.a(this, parcel, i);
            return;
        } else
        {
            PolygonOptionsCreator.a(this, parcel, i);
            return;
        }
    }

    public PolygonOptions zIndex(float f)
    {
        SN = f;
        return this;
    }

}
