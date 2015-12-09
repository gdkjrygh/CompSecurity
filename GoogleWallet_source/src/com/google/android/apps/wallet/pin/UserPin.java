// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;

public final class UserPin
{
    public static final class Builder
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

        public final Builder clear()
        {
            position(0);
            return this;
        }

        public final boolean equals(Object obj)
        {
            return this == obj || obj != null && obj.getClass() == getClass() && Arrays.equals(bytes, ((Builder)obj).bytes);
        }

        public final int hashCode()
        {
            return Arrays.hashCode(bytes) * 31 + mCharBuffer.hashCode();
        }

        public final int length()
        {
            return mCharBuffer.position();
        }

        public final Builder pop()
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

        public final Builder push(CharSequence charsequence)
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

        public Builder(int i)
        {
            this(new byte[i << 1]);
        }

        private Builder(byte abyte0[])
        {
            this(abyte0, ByteBuffer.wrap(abyte0).asCharBuffer());
        }

        private Builder(byte abyte0[], CharBuffer charbuffer)
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


    public static final UserPin NO_PIN;
    private final byte bytes[];
    private final CharBuffer charBuffer;
    private boolean shredded;

    UserPin(byte abyte0[])
    {
        bytes = abyte0;
        charBuffer = ByteBuffer.wrap(abyte0).asReadOnlyBuffer().asCharBuffer();
    }

    private boolean isShredded()
    {
        return shredded;
    }

    public final char charAt(int i)
    {
        return charBuffer.get(i);
    }

    public final UserPin deepCopy()
        throws IllegalStateException
    {
        UserPin userpin = this;
        if (!equals(NO_PIN))
        {
            boolean flag;
            if (!isShredded())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Cannot copy shredded instance");
            userpin = new UserPin((byte[])bytes.clone());
        }
        return userpin;
    }

    public final boolean equals(Object obj)
    {
        return obj != null && (this == obj || Arrays.equals(bytes, ((UserPin)obj).bytes) && !shredded && !((UserPin)obj).shredded);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(bytes) * 31 + Boolean.valueOf(shredded).hashCode();
    }

    public final int length()
    {
        return charBuffer.limit();
    }

    public final void shred()
    {
        if (!shredded)
        {
            Arrays.fill(bytes, 0, bytes.length, (byte)0);
            shredded = true;
        }
    }

    public final String toString()
    {
        return charBuffer.toString();
    }

    static 
    {
        UserPin userpin = new UserPin(new byte[0]);
        NO_PIN = userpin;
        userpin.shred();
    }
}
