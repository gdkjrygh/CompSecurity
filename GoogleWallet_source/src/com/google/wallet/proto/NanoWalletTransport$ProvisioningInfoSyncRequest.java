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
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{

    public String encodedCplc;
    public Long lastSyncGenerationNumber;
    public Integer transportVersion;

    private clear clear()
    {
        lastSyncGenerationNumber = null;
        transportVersion = null;
        encodedCplc = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   16: 59
    //                   24: 73
    //                   34: 142;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L6
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 101: // 'e'
            transportVersion = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        encodedCplc = codedinputbytebuffernano.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (lastSyncGenerationNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
        }
        j = i;
        if (transportVersion != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
        }
        i = j;
        if (encodedCplc != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(4, encodedCplc);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (lastSyncGenerationNumber != null)
        {
            codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
        }
        if (transportVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
        }
        if (encodedCplc != null)
        {
            codedoutputbytebuffernano.writeString(4, encodedCplc);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
