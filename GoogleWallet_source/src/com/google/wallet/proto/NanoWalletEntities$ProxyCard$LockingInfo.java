// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public Integer lockingStatus;
    public Long lockingTimestampMillis;

    private clear clear()
    {
        lockingStatus = null;
        lockingTimestampMillis = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L5:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   16: 98;
           goto _L1 _L2 _L3 _L4
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            lockingStatus = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        lockingTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        if (true) goto _L5; else goto _L6
_L6:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (lockingStatus != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, lockingStatus.intValue());
        }
        j = i;
        if (lockingTimestampMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, lockingTimestampMillis.longValue());
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (lockingStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(1, lockingStatus.intValue());
        }
        if (lockingTimestampMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, lockingTimestampMillis.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
