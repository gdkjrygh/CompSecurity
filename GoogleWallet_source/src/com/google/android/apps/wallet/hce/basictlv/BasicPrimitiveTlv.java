// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;

import com.google.android.apps.wallet.hce.util.Hex;
import com.google.common.base.Joiner;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlv, BasicTlvInvalidTagException, BasicTlvException, BasicTlvInvalidValueException

public final class BasicPrimitiveTlv extends BasicTlv
{

    private final int mLength;
    private final byte mValue[];

    private BasicPrimitiveTlv(int i, byte abyte0[])
        throws BasicTlvInvalidTagException
    {
        super(i);
        mLength = abyte0.length;
        mValue = abyte0;
        if (tagIsConstructed(i))
        {
            throw new BasicTlvInvalidTagException(i);
        } else
        {
            return;
        }
    }

    public static BasicPrimitiveTlv getByteInstance(int i, byte byte0)
        throws BasicTlvException
    {
        return getInstance(i, new byte[] {
            byte0
        });
    }

    public static BasicPrimitiveTlv getInstance(int i, int j, byte abyte0[], int k)
        throws BasicTlvException
    {
        int l = k + j;
        if (l <= abyte0.length)
        {
            return new BasicPrimitiveTlv(i, Arrays.copyOfRange(abyte0, k, l));
        } else
        {
            throw new BasicTlvInvalidValueException(j, abyte0.length - k);
        }
    }

    private static transient BasicPrimitiveTlv getInstance(int i, byte abyte0[])
        throws BasicTlvException
    {
        return getInstance(i, abyte0.length, abyte0, 0);
    }

    protected final int encodeValue(byte abyte0[], int i)
    {
        int j = mLength;
        System.arraycopy(mValue, 0, abyte0, i, j);
        return i + j;
    }

    public final int getLength()
    {
        return mLength;
    }

    public final String toString()
    {
        String s = String.valueOf(Joiner.on(",").join(new String[] {
            getTagAsString(), Integer.toHexString(getLength()), Hex.encode(mValue)
        }).toUpperCase());
        return (new StringBuilder(String.valueOf(s).length() + 2)).append("(").append(s).append(")").toString();
    }
}
