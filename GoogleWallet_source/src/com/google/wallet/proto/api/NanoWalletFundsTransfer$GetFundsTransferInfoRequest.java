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

    public String currencyCode;
    public Integer feeResponseFormat;
    public com.google.wallet.proto.est.requestRenderInfo requestRenderInfo;
    public com.google.wallet.proto.est.requestRenderInfo transactionType;

    private clear clear()
    {
        transactionType = null;
        currencyCode = null;
        feeResponseFormat = null;
        requestRenderInfo = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 96
    //                   24: 107
    //                   34: 150;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (transactionType == null)
        {
            transactionType = new com.google.wallet.proto.est.transactionType();
        }
        codedinputbytebuffernano.readMessage(transactionType);
          goto _L7
_L4:
        currencyCode = codedinputbytebuffernano.readString();
          goto _L7
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            feeResponseFormat = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (requestRenderInfo == null)
        {
            requestRenderInfo = new com.google.wallet.proto.est.requestRenderInfo();
        }
        codedinputbytebuffernano.readMessage(requestRenderInfo);
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (transactionType != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, transactionType);
        }
        j = i;
        if (currencyCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, currencyCode);
        }
        i = j;
        if (feeResponseFormat != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, feeResponseFormat.intValue());
        }
        j = i;
        if (requestRenderInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, requestRenderInfo);
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
        if (transactionType != null)
        {
            codedoutputbytebuffernano.writeMessage(1, transactionType);
        }
        if (currencyCode != null)
        {
            codedoutputbytebuffernano.writeString(2, currencyCode);
        }
        if (feeResponseFormat != null)
        {
            codedoutputbytebuffernano.writeInt32(3, feeResponseFormat.intValue());
        }
        if (requestRenderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(4, requestRenderInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
