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
    private float aau;
    private boolean aav;
    private i aba;
    private TileProvider abb;
    private boolean abc;
    private final int xJ;

    public TileOverlayOptions()
    {
        aav = true;
        abc = true;
        xJ = 1;
    }

    TileOverlayOptions(int k, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        aav = true;
        abc = true;
        xJ = k;
        aba = com.google.android.gms.maps.model.internal.i.a.bg(ibinder);
        if (aba == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final i abd;
                final TileOverlayOptions abe;

                public Tile getTile(int l, int i1, int j1)
                {
                    Tile tile;
                    try
                    {
                        tile = abd.getTile(l, i1, j1);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
            {
                abe = TileOverlayOptions.this;
                super();
                abd = TileOverlayOptions.a(abe);
            }
            };
        }
        abb = ibinder;
        aav = flag;
        aau = f;
        abc = flag1;
    }

    static i a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.aba;
    }

    public int describeContents()
    {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean flag)
    {
        abc = flag;
        return this;
    }

    public boolean getFadeIn()
    {
        return abc;
    }

    public TileProvider getTileProvider()
    {
        return abb;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public float getZIndex()
    {
        return aau;
    }

    public boolean isVisible()
    {
        return aav;
    }

    IBinder jL()
    {
        return aba.asBinder();
    }

    public TileOverlayOptions tileProvider(TileProvider tileprovider)
    {
        abb = tileprovider;
        if (abb == null)
        {
            tileprovider = null;
        } else
        {
            tileprovider = new com.google.android.gms.maps.model.internal.i.a(tileprovider) {

                final TileOverlayOptions abe;
                final TileProvider abf;

                public Tile getTile(int k, int l, int i1)
                {
                    return abf.getTile(k, l, i1);
                }

            
            {
                abe = TileOverlayOptions.this;
                abf = tileprovider;
                super();
            }
            };
        }
        aba = tileprovider;
        return this;
    }

    public TileOverlayOptions visible(boolean flag)
    {
        aav = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        if (v.jG())
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
        aau = f;
        return this;
    }

}
