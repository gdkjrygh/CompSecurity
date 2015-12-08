// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;
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
    private final int iM;
    private final List qK;
    private final List qL;
    private boolean qM;
    private float qh;
    private int qi;
    private int qj;
    private float qk;
    private boolean ql;

    public PolygonOptions()
    {
        qh = 10F;
        qi = 0xff000000;
        qj = 0;
        qk = 0.0F;
        ql = true;
        qM = false;
        iM = 1;
        qK = new ArrayList();
        qL = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        qh = 10F;
        qi = 0xff000000;
        qj = 0;
        qk = 0.0F;
        ql = true;
        qM = false;
        iM = i;
        qK = list;
        qL = list1;
        qh = f;
        qi = j;
        qj = k;
        qk = f1;
        ql = flag;
        qM = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        qK.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        qK.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); qK.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        qL.add(arraylist);
        return this;
    }

    List cO()
    {
        return qL;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        qj = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        qM = flag;
        return this;
    }

    public int getFillColor()
    {
        return qj;
    }

    public List getHoles()
    {
        return qL;
    }

    public List getPoints()
    {
        return qK;
    }

    public int getStrokeColor()
    {
        return qi;
    }

    public float getStrokeWidth()
    {
        return qh;
    }

    int getVersionCode()
    {
        return iM;
    }

    public float getZIndex()
    {
        return qk;
    }

    public boolean isGeodesic()
    {
        return qM;
    }

    public boolean isVisible()
    {
        return ql;
    }

    public PolygonOptions strokeColor(int i)
    {
        qi = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        qh = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        ql = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
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
        qk = f;
        return this;
    }

}
