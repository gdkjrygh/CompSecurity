// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;
import com.google.android.gms.maps.model.internal.g;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptionsCreator, j, TileProvider, Tile

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();
    private final int iM;
    private g qP;
    private TileProvider qQ;
    private float qk;
    private boolean ql;

    public TileOverlayOptions()
    {
        ql = true;
        iM = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f)
    {
        ql = true;
        iM = i;
        qP = com.google.android.gms.maps.model.internal.g.a.aj(ibinder);
        if (qP == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final g qR;
                final TileOverlayOptions qS;

                public Tile getTile(int k, int l, int i1)
                {
                    Tile tile;
                    try
                    {
                        tile = qR.getTile(k, l, i1);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
            {
                qS = TileOverlayOptions.this;
                super();
                qR = TileOverlayOptions.a(qS);
            }
            };
        }
        qQ = ibinder;
        ql = flag;
        qk = f;
    }

    static g a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.qP;
    }

    IBinder cP()
    {
        return qP.asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public TileProvider getTileProvider()
    {
        return qQ;
    }

    int getVersionCode()
    {
        return iM;
    }

    public float getZIndex()
    {
        return qk;
    }

    public boolean isVisible()
    {
        return ql;
    }

    public TileOverlayOptions tileProvider(TileProvider tileprovider)
    {
        qQ = tileprovider;
        if (qQ == null)
        {
            tileprovider = null;
        } else
        {
            tileprovider = new com.google.android.gms.maps.model.internal.g.a(tileprovider) {

                final TileOverlayOptions qS;
                final TileProvider qT;

                public Tile getTile(int i, int k, int l)
                {
                    return qT.getTile(i, k, l);
                }

            
            {
                qS = TileOverlayOptions.this;
                qT = tileprovider;
                super();
            }
            };
        }
        qP = tileprovider;
        return this;
    }

    public TileOverlayOptions visible(boolean flag)
    {
        ql = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
        {
            j.a(this, parcel, i);
            return;
        } else
        {
            TileOverlayOptionsCreator.a(this, parcel, i);
            return;
        }
    }

    public TileOverlayOptions zIndex(float f)
    {
        qk = f;
        return this;
    }

}
