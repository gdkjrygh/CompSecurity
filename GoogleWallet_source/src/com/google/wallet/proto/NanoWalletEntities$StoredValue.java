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

    public oney balance;
    public Integer balanceState;
    public oney id;
    public oney pendingTopUpsTotal;
    public oney requiredTopUpAmount;

    private clear clear()
    {
        id = null;
        balance = null;
        balanceState = null;
        pendingTopUpsTotal = null;
        requiredTopUpAmount = null;
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
    //                   10: 75
    //                   18: 104
    //                   24: 133
    //                   34: 178
    //                   42: 207;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (id == null)
        {
            id = new nit>();
        }
        codedinputbytebuffernano.readMessage(id);
          goto _L8
_L4:
        if (balance == null)
        {
            balance = new oney();
        }
        codedinputbytebuffernano.readMessage(balance);
          goto _L8
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            balanceState = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (pendingTopUpsTotal == null)
        {
            pendingTopUpsTotal = new oney();
        }
        codedinputbytebuffernano.readMessage(pendingTopUpsTotal);
        continue; /* Loop/switch isn't completed */
_L7:
        if (requiredTopUpAmount == null)
        {
            requiredTopUpAmount = new oney();
        }
        codedinputbytebuffernano.readMessage(requiredTopUpAmount);
        if (true) goto _L8; else goto _L9
_L9:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
        }
        j = i;
        if (balance != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, balance);
        }
        i = j;
        if (balanceState != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, balanceState.intValue());
        }
        j = i;
        if (pendingTopUpsTotal != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, pendingTopUpsTotal);
        }
        i = j;
        if (requiredTopUpAmount != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, requiredTopUpAmount);
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (balance != null)
        {
            codedoutputbytebuffernano.writeMessage(2, balance);
        }
        if (balanceState != null)
        {
            codedoutputbytebuffernano.writeInt32(3, balanceState.intValue());
        }
        if (pendingTopUpsTotal != null)
        {
            codedoutputbytebuffernano.writeMessage(4, pendingTopUpsTotal);
        }
        if (requiredTopUpAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(5, requiredTopUpAmount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public oney()
    {
        clear();
    }
}
