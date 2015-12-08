// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.internal.ITileProviderDelegate;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptionsCreator, TileProvider

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();
    boolean mFadeIn;
    private TileProvider mTileProvider;
    ITileProviderDelegate mTileProviderDelegate;
    final int mVersionCode;
    boolean mVisible;
    float mZIndex;

    public TileOverlayOptions()
    {
        mVisible = true;
        mFadeIn = true;
        mVersionCode = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        mVisible = true;
        mFadeIn = true;
        mVersionCode = i;
        mTileProviderDelegate = com.google.android.gms.maps.model.internal.ITileProviderDelegate.Stub.asInterface(ibinder);
        if (mTileProviderDelegate == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final ITileProviderDelegate mDelegate;
                final TileOverlayOptions this$0;

            
            {
                this$0 = TileOverlayOptions.this;
                super();
                mDelegate = mTileProviderDelegate;
            }
            };
        }
        mTileProvider = ibinder;
        mVisible = flag;
        mZIndex = f;
        mFadeIn = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        TileOverlayOptionsCreator.writeToParcel$4b899d8a(this, parcel);
    }


}
