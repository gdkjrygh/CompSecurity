// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.a.i;

// Referenced classes of package com.google.android.gms.maps.model:
//            s, d

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final s CREATOR = new s();
    private final int a;
    private i b;
    private d c;
    private boolean d;
    private float e;
    private boolean f;

    public TileOverlayOptions()
    {
        d = true;
        f = true;
        a = 1;
    }

    TileOverlayOptions(int j, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        d = true;
        f = true;
        a = j;
        b = com.google.android.gms.maps.model.a.i.a.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new d() {

                final TileOverlayOptions a;
                private final i c;

            
            {
                a = TileOverlayOptions.this;
                super();
                c = TileOverlayOptions.a(a);
            }
            };
        }
        c = ibinder;
        d = flag;
        e = f1;
        f = flag1;
    }

    static i a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    final int a()
    {
        return a;
    }

    final IBinder b()
    {
        return b.asBinder();
    }

    public final float c()
    {
        return e;
    }

    public final boolean d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return f;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        s.a(this, parcel);
    }

}
