// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;
import com.google.android.gms.maps.model.internal.o;

// Referenced classes of package com.google.android.gms.maps.model:
//            w, x, TileProvider

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    private o aAI;
    private TileProvider aAJ;
    private boolean aAK;
    private float aAc;
    private boolean aAd;
    private final int mVersionCode;

    public TileOverlayOptions()
    {
        aAd = true;
        aAK = true;
        mVersionCode = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        aAd = true;
        aAK = true;
        mVersionCode = i;
        aAI = com.google.android.gms.maps.model.internal.o.a.dk(ibinder);
        if (aAI == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final o aAL;
                final TileOverlayOptions aAM;

            
            {
                aAM = TileOverlayOptions.this;
                super();
                aAL = TileOverlayOptions.a(aAM);
            }
            };
        }
        aAJ = ibinder;
        aAd = flag;
        aAc = f;
        aAK = flag1;
    }

    static o a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.aAI;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean getFadeIn()
    {
        return aAK;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final float getZIndex()
    {
        return aAc;
    }

    public final boolean isVisible()
    {
        return aAd;
    }

    final IBinder qu()
    {
        return aAI.asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            x.a(this, parcel, i);
            return;
        } else
        {
            w.a(this, parcel, i);
            return;
        }
    }

}
