// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            Bytes

final class EddystoneUidPrefix extends Bytes
{

    public EddystoneUidPrefix(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 10 || abyte0.length == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Bytes must be a namespace (10 bytes), or a namespace plus instance ID (16 bytes).");
        super(abyte0);
    }

    public final String toString()
    {
        return (new StringBuilder("EddystoneUidPrefix{bytes=")).append(getHex()).append('}').toString();
    }
}
