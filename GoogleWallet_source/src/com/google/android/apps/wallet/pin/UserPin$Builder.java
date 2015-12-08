// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            UserPin

public static final class mCharBuffer
{

    private final byte bytes[];
    private final CharBuffer mCharBuffer;

    private void position(int i)
    {
        Arrays.fill(bytes, i << 1, bytes.length, (byte)0);
        mCharBuffer.position(i);
    }

    public final UserPin build()
    {
        boolean flag;
        if (mCharBuffer.position() == mCharBuffer.limit())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "UserPin.Builder partially populated (%s of %s bytes)", new Object[] {
            Integer.valueOf(mCharBuffer.position() << 1), Integer.valueOf(mCharBuffer.limit() << 1)
        });
        return new UserPin((byte[])bytes.clone());
    }

    public final bytes clear()
    {
        position(0);
        return this;
    }

    public final boolean equals(Object obj)
    {
        return this == obj || obj != null && obj.getClass() == getClass() && Arrays.equals(bytes, ((bytes)obj).bytes);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(bytes) * 31 + mCharBuffer.hashCode();
    }

    public final int length()
    {
        return mCharBuffer.position();
    }

    public final mCharBuffer pop()
    {
        int i = mCharBuffer.position();
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        position(i - 1);
        return this;
    }

    public final position push(CharSequence charsequence)
    {
        boolean flag;
        if (mCharBuffer.remaining() >= charsequence.length())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mCharBuffer.append(charsequence);
        return this;
    }

    public (int i)
    {
        this(new byte[i << 1]);
    }

    private <init>(byte abyte0[])
    {
        this(abyte0, ByteBuffer.wrap(abyte0).asCharBuffer());
    }

    private <init>(byte abyte0[], CharBuffer charbuffer)
    {
        bytes = abyte0;
        mCharBuffer = charbuffer;
        boolean flag;
        if (abyte0.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot build %s-byte UserPin", new Object[] {
            Integer.valueOf(abyte0.length)
        });
    }
}
