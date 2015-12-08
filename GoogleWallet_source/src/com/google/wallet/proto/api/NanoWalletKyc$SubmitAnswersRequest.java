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
//            NanoWalletKyc

public static final class clear extends ExtendableMessageNano
{

    public Integer country;
    public com.google.wallet.proto.features.ry referralAnswer[];
    public String source;

    private clear clear()
    {
        referralAnswer = com.google.wallet.proto.features.rray();
        source = null;
        country = null;
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
    //                   18: 183
    //                   24: 194;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
        com.google.wallet.proto.features.dSize adsize[];
        int j;
        if (referralAnswer == null)
        {
            j = 0;
        } else
        {
            j = referralAnswer.length;
        }
        adsize = new com.google.wallet.proto.features.ralAnswer[j + l];
        l = j;
        if (j != 0)
        {
            System.arraycopy(referralAnswer, 0, adsize, 0, j);
            l = j;
        }
        for (; l < adsize.length - 1; l++)
        {
            adsize[l] = new com.google.wallet.proto.features.();
            codedinputbytebuffernano.readMessage(adsize[l]);
            codedinputbytebuffernano.readTag();
        }

        adsize[l] = new com.google.wallet.proto.features.();
        codedinputbytebuffernano.readMessage(adsize[l]);
        referralAnswer = adsize;
          goto _L6
_L4:
        source = codedinputbytebuffernano.readString();
          goto _L6
_L5:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
            country = Integer.valueOf(k);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (referralAnswer != null)
        {
            j = i;
            if (referralAnswer.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= referralAnswer.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.features.ry ry = referralAnswer[k];
                    j = i;
                    if (ry != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, ry);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (source != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, source);
        }
        j = i;
        if (country != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(3, country.intValue());
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
        if (referralAnswer != null && referralAnswer.length > 0)
        {
            for (int i = 0; i < referralAnswer.length; i++)
            {
                com.google.wallet.proto.features.From from = referralAnswer[i];
                if (from != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, from);
                }
            }

        }
        if (source != null)
        {
            codedoutputbytebuffernano.writeString(2, source);
        }
        if (country != null)
        {
            codedoutputbytebuffernano.writeInt32(3, country.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
