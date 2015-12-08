// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.m4b.maps.k.c;
import com.google.android.m4b.maps.model.internal.o;

// Referenced classes of package com.google.android.m4b.maps.model:
//            t, u, Tile

public final class TileOverlayOptions
    implements c
{

    public static final t CREATOR = new t();
    final int a;
    o b;
    public u c;
    public boolean d;
    public float e;
    public boolean f;

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
        b = com.google.android.m4b.maps.model.internal.o.a.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new u() {

                private final o b;
                private TileOverlayOptions c;

                public final Tile a(int j, int k, int l)
                {
                    Tile tile;
                    try
                    {
                        tile = b.a(j, k, l);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
            {
                c = TileOverlayOptions.this;
                super();
                b = TileOverlayOptions.a(c);
            }
            };
        }
        c = ibinder;
        d = flag;
        e = f1;
        f = flag1;
    }

    static o a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel);
    }

}
