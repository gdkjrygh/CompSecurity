// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.protobuf.nano:
//            InvalidProtocolBufferNanoException, CodedInputByteBufferNano, CodedOutputByteBufferNano, MessageNanoPrinter

public abstract class MessageNano
{

    protected volatile int cachedSize;

    public MessageNano()
    {
        cachedSize = -1;
    }

    public static final MessageNano mergeFrom(MessageNano messagenano, byte abyte0[])
        throws InvalidProtocolBufferNanoException
    {
        return mergeFrom(messagenano, abyte0, 0, abyte0.length);
    }

    private static MessageNano mergeFrom(MessageNano messagenano, byte abyte0[], int i, int j)
        throws InvalidProtocolBufferNanoException
    {
        try
        {
            abyte0 = CodedInputByteBufferNano.newInstance(abyte0, i, j);
            messagenano.mergeFrom(((CodedInputByteBufferNano) (abyte0)));
            abyte0.checkLastTagWas(0);
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw messagenano;
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return messagenano;
    }

    public static final boolean messageNanoEquals(MessageNano messagenano, MessageNano messagenano1)
    {
        boolean flag1 = false;
        boolean flag;
        if (messagenano == messagenano1)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (messagenano != null)
            {
                flag = flag1;
                if (messagenano1 != null)
                {
                    flag = flag1;
                    if (messagenano.getClass() == messagenano1.getClass())
                    {
                        int i = messagenano.getSerializedSize();
                        flag = flag1;
                        if (messagenano1.getSerializedSize() == i)
                        {
                            byte abyte0[] = new byte[i];
                            byte abyte1[] = new byte[i];
                            toByteArray(messagenano, abyte0, 0, i);
                            toByteArray(messagenano1, abyte1, 0, i);
                            return Arrays.equals(abyte0, abyte1);
                        }
                    }
                }
            }
        }
        return flag;
    }

    private static void toByteArray(MessageNano messagenano, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = CodedOutputByteBufferNano.newInstance(abyte0, i, j);
            messagenano.writeTo(abyte0);
            abyte0.checkNoSpaceLeft();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", messagenano);
        }
    }

    public static final byte[] toByteArray(MessageNano messagenano)
    {
        byte abyte0[] = new byte[messagenano.getSerializedSize()];
        toByteArray(messagenano, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public MessageNano clone()
        throws CloneNotSupportedException
    {
        return (MessageNano)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    protected int computeSerializedSize()
    {
        return 0;
    }

    public final int getCachedSize()
    {
        if (cachedSize < 0)
        {
            getSerializedSize();
        }
        return cachedSize;
    }

    public final int getSerializedSize()
    {
        int i = computeSerializedSize();
        cachedSize = i;
        return i;
    }

    public abstract MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException;

    public String toString()
    {
        return MessageNanoPrinter.print(this);
    }

    public void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
    }
}
