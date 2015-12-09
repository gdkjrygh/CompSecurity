// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletInstrument

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.metadata callError;
    public Integer errorCode;
    public com.google.wallet.proto.nse.metadata metadata;
    public com.google.wallet.proto.nse.metadata storedValue;
    public String storedValueNotCreatedDisplay;

    private clear clear()
    {
        errorCode = null;
        callError = null;
        storedValue = null;
        storedValueNotCreatedDisplay = null;
        metadata = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 114
    //                   26: 143
    //                   34: 172
    //                   72002: 183;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
            errorCode = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (callError == null)
        {
            callError = new com.google.wallet.proto.nse.callError();
        }
        codedinputbytebuffernano.readMessage(callError);
        continue; /* Loop/switch isn't completed */
_L5:
        if (storedValue == null)
        {
            storedValue = new com.google.wallet.proto.nse.storedValue();
        }
        codedinputbytebuffernano.readMessage(storedValue);
        continue; /* Loop/switch isn't completed */
_L6:
        storedValueNotCreatedDisplay = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        if (metadata == null)
        {
            metadata = new com.google.wallet.proto.nse.metadata();
        }
        codedinputbytebuffernano.readMessage(metadata);
        if (true) goto _L8; else goto _L9
_L9:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (errorCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, errorCode.intValue());
        }
        j = i;
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
        }
        i = j;
        if (storedValue != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, storedValue);
        }
        j = i;
        if (storedValueNotCreatedDisplay != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, storedValueNotCreatedDisplay);
        }
        i = j;
        if (metadata != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9000, metadata);
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
        if (errorCode != null)
        {
            codedoutputbytebuffernano.writeInt32(1, errorCode.intValue());
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        if (storedValue != null)
        {
            codedoutputbytebuffernano.writeMessage(3, storedValue);
        }
        if (storedValueNotCreatedDisplay != null)
        {
            codedoutputbytebuffernano.writeString(4, storedValueNotCreatedDisplay);
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(9000, metadata);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
