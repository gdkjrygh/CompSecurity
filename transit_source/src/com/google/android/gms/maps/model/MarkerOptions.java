// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.internal.r;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptionsCreator, BitmapDescriptor, f, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();
    private final int iM;
    private float mAlpha;
    private LatLng qA;
    private String qB;
    private String qC;
    private BitmapDescriptor qD;
    private boolean qE;
    private boolean qF;
    private float qG;
    private float qH;
    private float qI;
    private boolean ql;
    private float qt;
    private float qu;

    public MarkerOptions()
    {
        qt = 0.5F;
        qu = 1.0F;
        ql = true;
        qF = false;
        qG = 0.0F;
        qH = 0.5F;
        qI = 0.0F;
        mAlpha = 1.0F;
        iM = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        qt = 0.5F;
        qu = 1.0F;
        ql = true;
        qF = false;
        qG = 0.0F;
        qH = 0.5F;
        qI = 0.0F;
        mAlpha = 1.0F;
        iM = i;
        qA = latlng;
        qB = s;
        qC = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.b.a.z(ibinder));
        }
        qD = latlng;
        qt = f1;
        qu = f2;
        qE = flag;
        ql = flag1;
        qF = flag2;
        qG = f3;
        qH = f4;
        qI = f5;
        mAlpha = f6;
    }

    public MarkerOptions alpha(float f1)
    {
        mAlpha = f1;
        return this;
    }

    public MarkerOptions anchor(float f1, float f2)
    {
        qt = f1;
        qu = f2;
        return this;
    }

    IBinder cN()
    {
        if (qD == null)
        {
            return null;
        } else
        {
            return qD.cs().asBinder();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        qE = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        qF = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return qt;
    }

    public float getAnchorV()
    {
        return qu;
    }

    public BitmapDescriptor getIcon()
    {
        return qD;
    }

    public float getInfoWindowAnchorU()
    {
        return qH;
    }

    public float getInfoWindowAnchorV()
    {
        return qI;
    }

    public LatLng getPosition()
    {
        return qA;
    }

    public float getRotation()
    {
        return qG;
    }

    public String getSnippet()
    {
        return qC;
    }

    public String getTitle()
    {
        return qB;
    }

    int getVersionCode()
    {
        return iM;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        qD = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f1, float f2)
    {
        qH = f1;
        qI = f2;
        return this;
    }

    public boolean isDraggable()
    {
        return qE;
    }

    public boolean isFlat()
    {
        return qF;
    }

    public boolean isVisible()
    {
        return ql;
    }

    public MarkerOptions position(LatLng latlng)
    {
        qA = latlng;
        return this;
    }

    public MarkerOptions rotation(float f1)
    {
        qG = f1;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        qC = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        qB = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        ql = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
        {
            f.a(this, parcel, i);
            return;
        } else
        {
            MarkerOptionsCreator.a(this, parcel, i);
            return;
        }
    }

}
