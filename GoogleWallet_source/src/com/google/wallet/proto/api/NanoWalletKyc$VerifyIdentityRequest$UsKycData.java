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
//            NanoWalletKyc

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.ata.fullSsn address;
    public com.google.wallet.proto.features.sn dateOfBirth;
    public String firstName;
    public com.google.wallet.proto.ata.fullSsn fullSsn;
    public Integer kycStep;
    public com.google.wallet.proto.ata.fullSsn lastFourSsn;
    public String lastName;

    private clear clear()
    {
        firstName = null;
        lastName = null;
        address = null;
        dateOfBirth = null;
        kycStep = null;
        lastFourSsn = null;
        fullSsn = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L10:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 102
    //                   26: 113
    //                   34: 142
    //                   40: 171
    //                   50: 214
    //                   58: 243;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        firstName = codedinputbytebuffernano.readString();
          goto _L10
_L4:
        lastName = codedinputbytebuffernano.readString();
          goto _L10
_L5:
        if (address == null)
        {
            address = new com.google.wallet.proto.ata.address();
        }
        codedinputbytebuffernano.readMessage(address);
          goto _L10
_L6:
        if (dateOfBirth == null)
        {
            dateOfBirth = new com.google.wallet.proto.features.fBirth();
        }
        codedinputbytebuffernano.readMessage(dateOfBirth);
          goto _L10
_L7:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            kycStep = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (lastFourSsn == null)
        {
            lastFourSsn = new com.google.wallet.proto.ata.lastFourSsn();
        }
        codedinputbytebuffernano.readMessage(lastFourSsn);
        continue; /* Loop/switch isn't completed */
_L9:
        if (fullSsn == null)
        {
            fullSsn = new com.google.wallet.proto.ata.fullSsn();
        }
        codedinputbytebuffernano.readMessage(fullSsn);
        if (true) goto _L10; else goto _L11
_L11:
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
        if (dateOfBirth != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, dateOfBirth);
        }
        i = j;
        if (kycStep != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, kycStep.intValue());
        }
        j = i;
        if (lastFourSsn != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, lastFourSsn);
        }
        i = j;
        if (fullSsn != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, fullSsn);
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
        if (dateOfBirth != null)
        {
            codedoutputbytebuffernano.writeMessage(4, dateOfBirth);
        }
        if (kycStep != null)
        {
            codedoutputbytebuffernano.writeInt32(5, kycStep.intValue());
        }
        if (lastFourSsn != null)
        {
            codedoutputbytebuffernano.writeMessage(6, lastFourSsn);
        }
        if (fullSsn != null)
        {
            codedoutputbytebuffernano.writeMessage(7, fullSsn);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
