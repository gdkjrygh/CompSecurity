// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            EddystoneUidPrefix, Bytes

public final class EddystoneUid
{

    private final EddystoneUidPrefix mPrefix;

    public EddystoneUid(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Bytes must be a namespace plus instance ID (16 bytes).");
        mPrefix = new EddystoneUidPrefix(abyte0);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof EddystoneUid))
        {
            return false;
        } else
        {
            obj = (EddystoneUid)obj;
            return Objects.equal(mPrefix, ((EddystoneUid) (obj)).mPrefix);
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
        return (new StringBuilder("EddystoneUid{id=")).append(Bytes.toHexString(((Bytes) (mPrefix)).mBytes)).append('}').toString();
    }
}
