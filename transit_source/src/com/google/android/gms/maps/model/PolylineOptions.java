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
//            PolylineOptionsCreator, LatLng, h

public final class PolylineOptions
    implements SafeParcelable
{

    public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();
    private final int iM;
    private int jc;
    private final List qK;
    private boolean qM;
    private float qk;
    private boolean ql;
    private float qp;

    public PolylineOptions()
    {
        qp = 10F;
        jc = 0xff000000;
        qk = 0.0F;
        ql = true;
        qM = false;
        iM = 1;
        qK = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        qp = 10F;
        jc = 0xff000000;
        qk = 0.0F;
        ql = true;
        qM = false;
        iM = i;
        qK = list;
        qp = f;
        jc = j;
        qk = f1;
        ql = flag;
        qM = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        qK.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        qK.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); qK.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolylineOptions color(int i)
    {
        jc = i;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolylineOptions geodesic(boolean flag)
    {
        qM = flag;
        return this;
    }

    public int getColor()
    {
        return jc;
    }

    public List getPoints()
    {
        return qK;
    }

    int getVersionCode()
    {
        return iM;
    }

    public float getWidth()
    {
        return qp;
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

    public PolylineOptions visible(boolean flag)
    {
        ql = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        qp = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
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
        qk = f;
        return this;
    }

}
