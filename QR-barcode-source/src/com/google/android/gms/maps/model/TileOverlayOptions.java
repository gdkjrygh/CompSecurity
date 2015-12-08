// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;
import com.google.android.gms.maps.model.internal.i;

// Referenced classes of package com.google.android.gms.maps.model:
//            w, x, TileProvider, Tile

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    private final int BR;
    private float ajL;
    private boolean ajM;
    private i akr;
    private TileProvider aks;
    private boolean akt;

    public TileOverlayOptions()
    {
        ajM = true;
        akt = true;
        BR = 1;
    }

    TileOverlayOptions(int j, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        ajM = true;
        akt = true;
        BR = j;
        akr = com.google.android.gms.maps.model.internal.i.a.by(ibinder);
        if (akr == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final i aku;
                final TileOverlayOptions akv;

                public Tile getTile(int k, int l, int i1)
                {
                    Tile tile;
                    try
                    {
                        tile = aku.getTile(k, l, i1);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
            {
                akv = TileOverlayOptions.this;
                super();
                aku = TileOverlayOptions.a(akv);
            }
            };
        }
        aks = ibinder;
        ajM = flag;
        ajL = f;
        akt = flag1;
    }

    static i a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.akr;
    }

    public int describeContents()
    {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean flag)
    {
        akt = flag;
        return this;
    }

    public boolean getFadeIn()
    {
        return akt;
    }

    public TileProvider getTileProvider()
    {
        return aks;
    }

    int getVersionCode()
    {
        return BR;
    }

    public float getZIndex()
    {
        return ajL;
    }

    public boolean isVisible()
    {
        return ajM;
    }

    IBinder mR()
    {
        return akr.asBinder();
    }

    public TileOverlayOptions tileProvider(TileProvider tileprovider)
    {
        aks = tileprovider;
        if (aks == null)
        {
            tileprovider = null;
        } else
        {
            tileprovider = new com.google.android.gms.maps.model.internal.i.a(tileprovider) {

                final TileOverlayOptions akv;
                final TileProvider akw;

                public Tile getTile(int j, int k, int l)
                {
                    return akw.getTile(j, k, l);
                }

            
            {
                akv = TileOverlayOptions.this;
                akw = tileprovider;
                super();
            }
            };
        }
        akr = tileprovider;
        return this;
    }

    public TileOverlayOptions visible(boolean flag)
    {
        ajM = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        if (v.mM())
        {
            x.a(this, parcel, j);
            return;
        } else
        {
            w.a(this, parcel, j);
            return;
        }
    }

    public TileOverlayOptions zIndex(float f)
    {
        ajL = f;
        return this;
    }

}
