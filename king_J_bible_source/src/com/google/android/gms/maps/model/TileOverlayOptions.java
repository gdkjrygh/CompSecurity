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
//            TileOverlayOptionsCreator, j, TileProvider, Tile

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();
    private float SN;
    private boolean SO;
    private i Tt;
    private TileProvider Tu;
    private boolean Tv;
    private final int xH;

    public TileOverlayOptions()
    {
        SO = true;
        Tv = true;
        xH = 1;
    }

    TileOverlayOptions(int k, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        SO = true;
        Tv = true;
        xH = k;
        Tt = com.google.android.gms.maps.model.internal.i.a.aK(ibinder);
        if (Tt == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final i Tw;
                final TileOverlayOptions Tx;

                public Tile getTile(int l, int i1, int j1)
                {
                    Tile tile;
                    try
                    {
                        tile = Tw.getTile(l, i1, j1);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
            {
                Tx = TileOverlayOptions.this;
                super();
                Tw = TileOverlayOptions.a(Tx);
            }
            };
        }
        Tu = ibinder;
        SO = flag;
        SN = f;
        Tv = flag1;
    }

    static i a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.Tt;
    }

    public int describeContents()
    {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean flag)
    {
        Tv = flag;
        return this;
    }

    public boolean getFadeIn()
    {
        return Tv;
    }

    public TileProvider getTileProvider()
    {
        return Tu;
    }

    int getVersionCode()
    {
        return xH;
    }

    public float getZIndex()
    {
        return SN;
    }

    IBinder iG()
    {
        return Tt.asBinder();
    }

    public boolean isVisible()
    {
        return SO;
    }

    public TileOverlayOptions tileProvider(TileProvider tileprovider)
    {
        Tu = tileprovider;
        if (Tu == null)
        {
            tileprovider = null;
        } else
        {
            tileprovider = new com.google.android.gms.maps.model.internal.i.a(tileprovider) {

                final TileOverlayOptions Tx;
                final TileProvider Ty;

                public Tile getTile(int k, int l, int i1)
                {
                    return Ty.getTile(k, l, i1);
                }

            
            {
                Tx = TileOverlayOptions.this;
                Ty = tileprovider;
                super();
            }
            };
        }
        Tt = tileprovider;
        return this;
    }

    public TileOverlayOptions visible(boolean flag)
    {
        SO = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        if (v.iB())
        {
            j.a(this, parcel, k);
            return;
        } else
        {
            TileOverlayOptionsCreator.a(this, parcel, k);
            return;
        }
    }

    public TileOverlayOptions zIndex(float f)
    {
        SN = f;
        return this;
    }

}
