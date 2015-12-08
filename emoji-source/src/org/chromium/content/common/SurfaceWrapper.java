// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;

public class SurfaceWrapper
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public SurfaceWrapper createFromParcel(Parcel parcel)
        {
            return new SurfaceWrapper((Surface)Surface.CREATOR.createFromParcel(parcel));
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public SurfaceWrapper[] newArray(int i)
        {
            return new SurfaceWrapper[i];
        }

    };
    private final Surface mSurface;

    public SurfaceWrapper(Surface surface)
    {
        mSurface = surface;
    }

    public int describeContents()
    {
        return 0;
    }

    public Surface getSurface()
    {
        return mSurface;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mSurface.writeToParcel(parcel, 0);
    }

}
