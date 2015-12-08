// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletInstrument

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.bankAccounts bankAccounts[];
    public com.google.wallet.proto.nse.bankAccounts callError;
    public Integer errorCode;

    private clear clear()
    {
        errorCode = null;
        callError = null;
        bankAccounts = com.google.wallet.proto.nse.bankAccounts();
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
    //                   8: 59
    //                   18: 98
    //                   26: 127;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
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
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        com.google.wallet.proto.nse anse[];
        int k;
        if (bankAccounts == null)
        {
            k = 0;
        } else
        {
            k = bankAccounts.length;
        }
        anse = new com.google.wallet.proto.nse.bankAccounts[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(bankAccounts, 0, anse, 0, k);
            l = k;
        }
        for (; l < anse.length - 1; l++)
        {
            anse[l] = new com.google.wallet.proto.nse.bankAccounts();
            codedinputbytebuffernano.readMessage(anse[l]);
            codedinputbytebuffernano.readTag();
        }

        anse[l] = new com.google.wallet.proto.nse.bankAccounts();
        codedinputbytebuffernano.readMessage(anse[l]);
        bankAccounts = anse;
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (errorCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(1, errorCode.intValue());
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
        }
        int l = i;
        if (bankAccounts != null)
        {
            l = i;
            if (bankAccounts.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= bankAccounts.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nse nse = bankAccounts[k];
                    l = i;
                    if (nse != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, nse);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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
        if (bankAccounts != null && bankAccounts.length > 0)
        {
            for (int i = 0; i < bankAccounts.length; i++)
            {
                com.google.wallet.proto.nse nse = bankAccounts[i];
                if (nse != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, nse);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
