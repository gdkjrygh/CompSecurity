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

    public String id;
    public String moneyRequestId;
    public Integer reason;

    private clear clear()
    {
        moneyRequestId = null;
        reason = null;
        id = null;
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
    //                   10: 59
    //                   16: 70
    //                   26: 118;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        moneyRequestId = codedinputbytebuffernano.readString();
          goto _L6
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            reason = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        id = codedinputbytebuffernano.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (moneyRequestId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, moneyRequestId);
        }
        j = i;
        if (reason != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, reason.intValue());
        }
        i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, id);
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
        if (moneyRequestId != null)
        {
            codedoutputbytebuffernano.writeString(1, moneyRequestId);
        }
        if (reason != null)
        {
            codedoutputbytebuffernano.writeInt32(2, reason.intValue());
        }
        if (id != null)
        {
            codedoutputbytebuffernano.writeString(3, id);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
