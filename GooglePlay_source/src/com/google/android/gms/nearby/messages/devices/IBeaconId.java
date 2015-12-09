// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            IBeaconIdPrefix

public final class IBeaconId
{

    private final IBeaconIdPrefix mPrefix;

    public IBeaconId(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        mPrefix = new IBeaconIdPrefix(abyte0);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof IBeaconId))
        {
            return false;
        } else
        {
            obj = (IBeaconId)obj;
            return Objects.equal(mPrefix, ((IBeaconId) (obj)).mPrefix);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mPrefix
        });
    }

    public final String toString()
    {
        return (new StringBuilder("IBeaconId{proximityUuid=")).append(mPrefix.getProximityUuid()).append(", major=").append(mPrefix.getMajor().shortValue()).append(", minor=").append(mPrefix.getMinor().shortValue()).append('}').toString();
    }
}
