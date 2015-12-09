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
//            NanoWalletFundsTransfer

public static final class clear extends ExtendableMessageNano
{

    public Integer acceptanceOptions;
    public com.google.wallet.proto.nse.acceptanceOptions callError;

    private clear clear()
    {
        callError = null;
        acceptanceOptions = null;
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
    //                   10: 51
    //                   16: 80;
           goto _L1 _L2 _L3 _L4
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        if (callError == null)
        {
            callError = new com.google.wallet.proto.nse.callError();
        }
        codedinputbytebuffernano.readMessage(callError);
          goto _L5
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            acceptanceOptions = Integer.valueOf(j);
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
        }
        j = i;
        if (acceptanceOptions != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, acceptanceOptions.intValue());
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
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(1, callError);
        }
        if (acceptanceOptions != null)
        {
            codedoutputbytebuffernano.writeInt32(2, acceptanceOptions.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
