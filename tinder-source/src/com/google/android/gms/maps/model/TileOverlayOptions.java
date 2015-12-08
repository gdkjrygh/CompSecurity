// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.a.a;

// Referenced classes of package com.google.android.gms.maps.model:
//            q, b

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    final int a;
    a b;
    boolean c;
    float d;
    boolean e;
    private b f;

    public TileOverlayOptions()
    {
        c = true;
        e = true;
        a = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        c = true;
        e = true;
        a = i;
        b = com.google.android.gms.maps.model.a.a.a.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new b() {

                final TileOverlayOptions a;
                private final a c;

            
            {
                a = TileOverlayOptions.this;
                super();
                c = com.google.android.gms.maps.model.TileOverlayOptions.a(a);
            }
            };
        }
        f = ibinder;
        c = flag;
        d = f1;
        e = flag1;
    }

    static a a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.model.q.a(this, parcel);
    }

}
