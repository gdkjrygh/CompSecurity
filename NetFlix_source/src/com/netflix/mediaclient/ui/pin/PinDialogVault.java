// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.util.ParcelUtils;

public class PinDialogVault
    implements Parcelable
{
    public static final class PinInvokedFrom extends Enum
    {

        private static final PinInvokedFrom $VALUES[];
        public static final PinInvokedFrom MDX;
        public static final PinInvokedFrom PLAYER;
        public static final PinInvokedFrom PLAY_LAUNCHER;
        public static final PinInvokedFrom UNKNOWN;
        private String value;

        public static PinInvokedFrom create(String s)
        {
            PinInvokedFrom apininvokedfrom[] = values();
            int j = apininvokedfrom.length;
            for (int i = 0; i < j; i++)
            {
                PinInvokedFrom pininvokedfrom = apininvokedfrom[i];
                if (pininvokedfrom.value.equalsIgnoreCase(s))
                {
                    return pininvokedfrom;
                }
            }

            return UNKNOWN;
        }

        public static PinInvokedFrom valueOf(String s)
        {
            return (PinInvokedFrom)Enum.valueOf(com/netflix/mediaclient/ui/pin/PinDialogVault$PinInvokedFrom, s);
        }

        public static PinInvokedFrom[] values()
        {
            return (PinInvokedFrom[])$VALUES.clone();
        }

        public String getValue()
        {
            return value;
        }

        static 
        {
            MDX = new PinInvokedFrom("MDX", 0, "mdx");
            PLAYER = new PinInvokedFrom("PLAYER", 1, "player");
            PLAY_LAUNCHER = new PinInvokedFrom("PLAY_LAUNCHER", 2, "launcher");
            UNKNOWN = new PinInvokedFrom("UNKNOWN", 3, "");
            $VALUES = (new PinInvokedFrom[] {
                MDX, PLAYER, PLAY_LAUNCHER, UNKNOWN
            });
        }

        private PinInvokedFrom(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PinDialogVault createFromParcel(Parcel parcel)
        {
            return new PinDialogVault(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PinDialogVault[] newArray(int i)
        {
            return new PinDialogVault[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String NAME = com/netflix/mediaclient/ui/pin/PinDialogVault.getSimpleName();
    private Asset mAsset;
    private String mInvokeLocation;
    private boolean mRemotePlayback;
    private String mUuid;

    PinDialogVault()
    {
    }

    PinDialogVault(Parcel parcel)
    {
        mInvokeLocation = ParcelUtils.readString(parcel);
        mUuid = ParcelUtils.readString(parcel);
        mRemotePlayback = ParcelUtils.readBoolean(parcel);
        mAsset = (Asset)parcel.readParcelable(com/netflix/mediaclient/ui/Asset.getClassLoader());
    }

    public PinDialogVault(String s)
    {
        this(s, null, false, null);
    }

    public PinDialogVault(String s, Asset asset, boolean flag)
    {
        this(s, asset, flag, null);
    }

    PinDialogVault(String s, Asset asset, boolean flag, String s1)
    {
        mInvokeLocation = s;
        mAsset = asset;
        mRemotePlayback = flag;
        mUuid = s1;
    }

    public PinDialogVault(String s, String s1)
    {
        this(s, null, false, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public Asset getAsset()
    {
        return mAsset;
    }

    public String getInvokeLocation()
    {
        return mInvokeLocation;
    }

    public String getUuid()
    {
        return mUuid;
    }

    public boolean isRemotePlayback()
    {
        return mRemotePlayback;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PinDialogVault [mInvokeLocation=").append(mInvokeLocation).append(", mAsset=").append(mAsset).append(", mRemotePlayback=").append(mRemotePlayback).append(", mUuid=").append(mUuid).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelUtils.writeString(parcel, mInvokeLocation);
        ParcelUtils.writeString(parcel, mUuid);
        ParcelUtils.writeBoolean(parcel, mRemotePlayback);
        parcel.writeParcelable(mAsset, i);
    }

}
