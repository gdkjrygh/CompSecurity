// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            NearbyDeviceIdCreator, EddystoneUid, IBeaconId

public class NearbyDeviceId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new NearbyDeviceIdCreator();
    public static final NearbyDeviceId UNKNOWN_ID = new NearbyDeviceId();
    final byte mBytes[];
    private final EddystoneUid mEddystoneUid;
    private final IBeaconId mIBeaconId;
    final int mType;
    final int mVersionCode;

    private NearbyDeviceId()
    {
        this(1, 1, null);
    }

    NearbyDeviceId(int i, int j, byte abyte0[])
    {
        Object obj1 = null;
        super();
        mVersionCode = i;
        mType = j;
        mBytes = abyte0;
        Object obj;
        if (j == 2)
        {
            obj = new EddystoneUid(abyte0);
        } else
        {
            obj = null;
        }
        mEddystoneUid = ((EddystoneUid) (obj));
        obj = obj1;
        if (j == 3)
        {
            obj = new IBeaconId(abyte0);
        }
        mIBeaconId = ((IBeaconId) (obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyDeviceId))
            {
                return false;
            }
            obj = (NearbyDeviceId)obj;
            if (!Objects.equal(Integer.valueOf(mType), Integer.valueOf(((NearbyDeviceId) (obj)).mType)) || !Objects.equal(mBytes, ((NearbyDeviceId) (obj)).mBytes))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mType), mBytes
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("NearbyDeviceId{");
        mType;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 86
    //                   2 52
    //                   3 69;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append("}");
        return stringbuilder.toString();
_L3:
        stringbuilder.append("eddystoneUid=").append(mEddystoneUid);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append("iBeaconId=").append(mIBeaconId);
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuilder.append("UNKNOWN");
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NearbyDeviceIdCreator.writeToParcel$72a9de3d(this, parcel);
    }

}
