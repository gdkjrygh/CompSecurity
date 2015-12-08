// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf.nano:
//            InvalidProtocolBufferNanoException, CodedInputByteBufferNano, CodedOutputByteBufferNano, MessageNanoPrinter

public abstract class MessageNano
{

    public volatile int cachedSize;

    public MessageNano()
    {
        cachedSize = -1;
    }

    public static MessageNano mergeFrom$1ec43da(MessageNano messagenano, byte abyte0[], int i)
        throws InvalidProtocolBufferNanoException
    {
        try
        {
            abyte0 = new CodedInputByteBufferNano(abyte0, 0, i);
            messagenano.mergeFrom(abyte0);
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

    public static final byte[] toByteArray(MessageNano messagenano)
    {
        byte abyte0[] = new byte[messagenano.getSerializedSize()];
        int i = abyte0.length;
        try
        {
            CodedOutputByteBufferNano codedoutputbytebuffernano = CodedOutputByteBufferNano.newInstance(abyte0, 0, i);
            messagenano.writeTo(codedoutputbytebuffernano);
            if (codedoutputbytebuffernano.buffer.remaining() != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", messagenano);
        }
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

    public int computeSerializedSize()
    {
        return 0;
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
