// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            Bytes

final class IBeaconIdPrefix extends Bytes
{

    public IBeaconIdPrefix(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 16 || abyte0.length == 18 || abyte0.length == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        super(abyte0);
    }

    public final Short getMajor()
    {
        byte abyte0[] = super.mBytes;
        if (abyte0.length >= 18)
        {
            return Short.valueOf(ByteBuffer.wrap(abyte0).getShort(16));
        } else
        {
            return null;
        }
    }

    public final Short getMinor()
    {
        byte abyte0[] = super.mBytes;
        if (abyte0.length == 20)
        {
            return Short.valueOf(ByteBuffer.wrap(abyte0).getShort(18));
        } else
        {
            return null;
        }
    }

    public final UUID getProximityUuid()
    {
        ByteBuffer bytebuffer = ByteBuffer.wrap(super.mBytes);
        return new UUID(bytebuffer.getLong(), bytebuffer.getLong());
    }

    public final String toString()
    {
        return (new StringBuilder("IBeaconIdPrefix{proximityUuid=")).append(getProximityUuid()).append(", major=").append(getMajor()).append(", minor=").append(getMinor()).append('}').toString();
    }
}
