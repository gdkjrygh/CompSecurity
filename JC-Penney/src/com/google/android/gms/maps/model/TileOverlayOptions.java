// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.a.y;
import com.google.android.gms.maps.model.a.z;

// Referenced classes of package com.google.android.gms.maps.model:
//            x, h, i

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final x CREATOR = new x();
    private final int a;
    private y b;
    private i c;
    private boolean d;
    private float e;
    private boolean f;

    public TileOverlayOptions()
    {
        d = true;
        f = true;
        a = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        d = true;
        f = true;
        a = i;
        b = z.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new h(this);
        }
        c = ibinder;
        d = flag;
        e = f1;
        f = flag1;
    }

    static y a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    int a()
    {
        return a;
    }

    IBinder b()
    {
        return b.asBinder();
    }

    public float c()
    {
        return e;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        x.a(this, parcel, i);
    }

}
