// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;
import com.google.android.gms.maps.model.internal.o;

// Referenced classes of package com.google.android.gms.maps.model:
//            w, x, TileProvider, Tile

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    private final int CK;
    private float alX;
    private boolean alY;
    private o amD;
    private TileProvider amE;
    private boolean amF;

    public TileOverlayOptions()
    {
        alY = true;
        amF = true;
        CK = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        alY = true;
        amF = true;
        CK = i;
        amD = com.google.android.gms.maps.model.internal.o.a.bE(ibinder);
        if (amD == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final o amG;
                final TileOverlayOptions amH;

                public Tile getTile(int j, int k, int l)
                {
                    Tile tile;
                    try
                    {
                        tile = amG.getTile(j, k, l);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
            {
                amH = TileOverlayOptions.this;
                super();
                amG = TileOverlayOptions.a(amH);
            }
            };
        }
        amE = ibinder;
        alY = flag;
        alX = f;
        amF = flag1;
    }

    static o a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.amD;
    }

    public int describeContents()
    {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean flag)
    {
        amF = flag;
        return this;
    }

    public boolean getFadeIn()
    {
        return amF;
    }

    public TileProvider getTileProvider()
    {
        return amE;
    }

    int getVersionCode()
    {
        return CK;
    }

    public float getZIndex()
    {
        return alX;
    }

    public boolean isVisible()
    {
        return alY;
    }

    IBinder og()
    {
        return amD.asBinder();
    }

    public TileOverlayOptions tileProvider(TileProvider tileprovider)
    {
        amE = tileprovider;
        if (amE == null)
        {
            tileprovider = null;
        } else
        {
            tileprovider = new com.google.android.gms.maps.model.internal.o.a(tileprovider) {

                final TileOverlayOptions amH;
                final TileProvider amI;

                public Tile getTile(int i, int j, int k)
                {
                    return amI.getTile(i, j, k);
                }

            
            {
                amH = TileOverlayOptions.this;
                amI = tileprovider;
                super();
            }
            };
        }
        amD = tileprovider;
        return this;
    }

    public TileOverlayOptions visible(boolean flag)
    {
        alY = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (aa.ob())
        {
            x.a(this, parcel, i);
            return;
        } else
        {
            w.a(this, parcel, i);
            return;
        }
    }

    public TileOverlayOptions zIndex(float f)
    {
        alX = f;
        return this;
    }

}
