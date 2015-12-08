// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.security.MessageDigest;

public abstract class HashCode
{
    static final class BytesHashCode extends HashCode
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

        BytesHashCode(byte abyte0[])
        {
            bytes = (byte[])Preconditions.checkNotNull(abyte0);
        }
    }


    private static final char hexDigits[] = "0123456789abcdef".toCharArray();

    HashCode()
    {
    }

    static HashCode fromBytesNoCopy(byte abyte0[])
    {
        return new BytesHashCode(abyte0);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract int bits();

    public final boolean equals(Object obj)
    {
        if (obj instanceof HashCode)
        {
            obj = (HashCode)obj;
            return MessageDigest.isEqual(asBytes(), ((HashCode) (obj)).asBytes());
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        if (bits() < 32) goto _L2; else goto _L1
_L1:
        int k = asInt();
_L4:
        return k;
_L2:
        byte abyte0[] = asBytes();
        int i = abyte0[0] & 0xff;
        int j = 1;
        do
        {
            k = i;
            if (j >= abyte0.length)
            {
                continue;
            }
            i |= (abyte0[j] & 0xff) << (j << 3);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String toString()
    {
        byte abyte0[] = asBytes();
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            stringbuilder.append(hexDigits[byte0 >> 4 & 0xf]).append(hexDigits[byte0 & 0xf]);
        }

        return stringbuilder.toString();
    }

}
