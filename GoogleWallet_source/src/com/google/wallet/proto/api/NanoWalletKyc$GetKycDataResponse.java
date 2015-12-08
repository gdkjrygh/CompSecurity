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

    public com.google.wallet.proto.essage address;
    public com.google.wallet.proto.essage callError;
    public com.google.wallet.proto.ument esignLegalDocument;
    public Integer experiment;
    public String firstName;
    public com.google.wallet.proto.csCustomDimension gaCustomDimensions[];
    public String lastName;
    public String regionCode;
    public com.google.wallet.proto.ument walletLegalDocument;

    private clear clear()
    {
        firstName = null;
        lastName = null;
        address = null;
        walletLegalDocument = null;
        esignLegalDocument = null;
        callError = null;
        regionCode = null;
        experiment = null;
        gaCustomDimensions = com.google.wallet.proto.csCustomDimension.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 118
    //                   26: 129
    //                   34: 158
    //                   42: 187
    //                   50: 216
    //                   58: 245
    //                   64: 256
    //                   74: 306;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        firstName = codedinputbytebuffernano.readString();
          goto _L12
_L4:
        lastName = codedinputbytebuffernano.readString();
          goto _L12
_L5:
        if (address == null)
        {
            address = new com.google.wallet.proto.();
        }
        codedinputbytebuffernano.readMessage(address);
          goto _L12
_L6:
        if (walletLegalDocument == null)
        {
            walletLegalDocument = new com.google.wallet.proto.ument();
        }
        codedinputbytebuffernano.readMessage(walletLegalDocument);
          goto _L12
_L7:
        if (esignLegalDocument == null)
        {
            esignLegalDocument = new com.google.wallet.proto.ument();
        }
        codedinputbytebuffernano.readMessage(esignLegalDocument);
          goto _L12
_L8:
        if (callError == null)
        {
            callError = new com.google.wallet.proto.nse.callError();
        }
        codedinputbytebuffernano.readMessage(callError);
          goto _L12
_L9:
        regionCode = codedinputbytebuffernano.readString();
          goto _L12
_L10:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            experiment = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
        com.google.wallet.proto.csCustomDimension acscustomdimension[];
        int k;
        if (gaCustomDimensions == null)
        {
            k = 0;
        } else
        {
            k = gaCustomDimensions.length;
        }
        acscustomdimension = new com.google.wallet.proto.csCustomDimension[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(gaCustomDimensions, 0, acscustomdimension, 0, k);
            l = k;
        }
        for (; l < acscustomdimension.length - 1; l++)
        {
            acscustomdimension[l] = new com.google.wallet.proto.csCustomDimension();
            codedinputbytebuffernano.readMessage(acscustomdimension[l]);
            codedinputbytebuffernano.readTag();
        }

        acscustomdimension[l] = new com.google.wallet.proto.csCustomDimension();
        codedinputbytebuffernano.readMessage(acscustomdimension[l]);
        gaCustomDimensions = acscustomdimension;
        if (true) goto _L12; else goto _L13
_L13:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (firstName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, firstName);
        }
        j = i;
        if (lastName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, lastName);
        }
        i = j;
        if (address != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, address);
        }
        j = i;
        if (walletLegalDocument != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, walletLegalDocument);
        }
        i = j;
        if (esignLegalDocument != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, esignLegalDocument);
        }
        j = i;
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, callError);
        }
        int l = j;
        if (regionCode != null)
        {
            l = j + CodedOutputByteBufferNano.computeStringSize(7, regionCode);
        }
        i = l;
        if (experiment != null)
        {
            i = l + CodedOutputByteBufferNano.computeInt32Size(8, experiment.intValue());
        }
        l = i;
        if (gaCustomDimensions != null)
        {
            l = i;
            if (gaCustomDimensions.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= gaCustomDimensions.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.csCustomDimension cscustomdimension = gaCustomDimensions[k];
                    l = i;
                    if (cscustomdimension != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(9, cscustomdimension);
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
        if (firstName != null)
        {
            codedoutputbytebuffernano.writeString(1, firstName);
        }
        if (lastName != null)
        {
            codedoutputbytebuffernano.writeString(2, lastName);
        }
        if (address != null)
        {
            codedoutputbytebuffernano.writeMessage(3, address);
        }
        if (walletLegalDocument != null)
        {
            codedoutputbytebuffernano.writeMessage(4, walletLegalDocument);
        }
        if (esignLegalDocument != null)
        {
            codedoutputbytebuffernano.writeMessage(5, esignLegalDocument);
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(6, callError);
        }
        if (regionCode != null)
        {
            codedoutputbytebuffernano.writeString(7, regionCode);
        }
        if (experiment != null)
        {
            codedoutputbytebuffernano.writeInt32(8, experiment.intValue());
        }
        if (gaCustomDimensions != null && gaCustomDimensions.length > 0)
        {
            for (int i = 0; i < gaCustomDimensions.length; i++)
            {
                com.google.wallet.proto.csCustomDimension cscustomdimension = gaCustomDimensions[i];
                if (cscustomdimension != null)
                {
                    codedoutputbytebuffernano.writeMessage(9, cscustomdimension);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public t()
    {
        clear();
    }
}
