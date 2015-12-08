// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.internal.zzl;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzn, TileProvider, Tile

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final zzn CREATOR = new zzn();
    private final int a;
    private zzl b;
    private TileProvider c;
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
        b = com.google.android.gms.maps.model.internal.zzl.zza.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                final TileOverlayOptions a;
                private final zzl c;

                public Tile getTile(int j, int k, int l)
                {
                    Tile tile;
                    try
                    {
                        tile = c.a(j, k, l);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
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

    static zzl a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    int a()
    {
        return a;
    }

    public TileOverlayOptions a(float f1)
    {
        e = f1;
        return this;
    }

    public TileOverlayOptions a(TileProvider tileprovider)
    {
        c = tileprovider;
        if (c == null)
        {
            tileprovider = null;
        } else
        {
            tileprovider = new com.google.android.gms.maps.model.internal.zzl.zza(tileprovider) {

                final TileProvider a;
                final TileOverlayOptions b;

                public Tile a(int i, int j, int k)
                {
                    return a.getTile(i, j, k);
                }

            
            {
                b = TileOverlayOptions.this;
                a = tileprovider;
                super();
            }
            };
        }
        b = tileprovider;
        return this;
    }

    public TileOverlayOptions a(boolean flag)
    {
        f = flag;
        return this;
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
        zzn.a(this, parcel, i);
    }

}
