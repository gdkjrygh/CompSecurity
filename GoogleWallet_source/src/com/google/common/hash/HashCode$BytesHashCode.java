// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            HashCode

static final class ull extends HashCode
    implements Serializable
{

    final byte bytes[];

    public final byte[] asBytes()
    {
        return (byte[])bytes.clone();
    }

    public final int asInt()
    {
        boolean flag;
        if (bytes.length >= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[] {
            Integer.valueOf(bytes.length)
        });
        return bytes[0] & 0xff | (bytes[1] & 0xff) << 8 | (bytes[2] & 0xff) << 16 | (bytes[3] & 0xff) << 24;
    }

    public final int bits()
    {
        return bytes.length << 3;
    }

    (byte abyte0[])
    {
        bytes = (byte[])Preconditions.checkNotNull(abyte0);
    }
}
