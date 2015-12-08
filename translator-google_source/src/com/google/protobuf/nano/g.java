// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.protobuf.nano:
//            InvalidProtocolBufferNanoException, a, CodedOutputByteBufferNano, h

public abstract class g
{

    public volatile int cachedSize;

    public g()
    {
        cachedSize = -1;
    }

    public static final g mergeFrom(g g1, byte abyte0[])
    {
        return mergeFrom(g1, abyte0, 0, abyte0.length);
    }

    public static final g mergeFrom(g g1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = a.a(abyte0, i, j);
            g1.mergeFrom(((a) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw g1;
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return g1;
    }

    public static final boolean messageNanoEquals(g g1, g g2)
    {
        boolean flag1 = false;
        boolean flag;
        if (g1 == g2)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (g1 != null)
            {
                flag = flag1;
                if (g2 != null)
                {
                    flag = flag1;
                    if (g1.getClass() == g2.getClass())
                    {
                        int i = g1.getSerializedSize();
                        flag = flag1;
                        if (g2.getSerializedSize() == i)
                        {
                            byte abyte0[] = new byte[i];
                            byte abyte1[] = new byte[i];
                            toByteArray(g1, abyte0, 0, i);
                            toByteArray(g2, abyte1, 0, i);
                            return Arrays.equals(abyte0, abyte1);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static final void toByteArray(g g1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = CodedOutputByteBufferNano.a(abyte0, i, j);
            g1.writeTo(abyte0);
            if (((CodedOutputByteBufferNano) (abyte0)).a.remaining() != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", g1);
        }
    }

    public static final byte[] toByteArray(g g1)
    {
        byte abyte0[] = new byte[g1.getSerializedSize()];
        toByteArray(g1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public g clone()
    {
        return (g)super.clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    public int computeSerializedSize()
    {
        return 0;
    }

    public int getCachedSize()
    {
        if (cachedSize < 0)
        {
            getSerializedSize();
        }
        return cachedSize;
    }

    public int getSerializedSize()
    {
        int i = computeSerializedSize();
        cachedSize = i;
        return i;
    }

    public abstract g mergeFrom(a a1);

    public String toString()
    {
        return h.a(this);
    }

    public void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
    }
}
