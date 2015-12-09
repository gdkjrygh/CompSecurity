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

    public String cardBackImageUrl;
    public String cardFrontImageUrl;
    public String cardNumberLast4;
    public String correlationId;
    public Integer credentialType;
    public String expirationMonth;
    public String expirationYear;
    public String nameOnCard;
    public String nickname;
    public String partnerId;

    private clear clear()
    {
        cardFrontImageUrl = null;
        cardBackImageUrl = null;
        cardNumberLast4 = null;
        expirationMonth = null;
        expirationYear = null;
        nameOnCard = null;
        credentialType = null;
        nickname = null;
        correlationId = null;
        partnerId = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L13:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 126
    //                   26: 137
    //                   34: 148
    //                   42: 159
    //                   50: 170
    //                   56: 181
    //                   66: 234
    //                   74: 245
    //                   82: 256;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        cardFrontImageUrl = codedinputbytebuffernano.readString();
          goto _L13
_L4:
        cardBackImageUrl = codedinputbytebuffernano.readString();
          goto _L13
_L5:
        cardNumberLast4 = codedinputbytebuffernano.readString();
          goto _L13
_L6:
        expirationMonth = codedinputbytebuffernano.readString();
          goto _L13
_L7:
        expirationYear = codedinputbytebuffernano.readString();
          goto _L13
_L8:
        nameOnCard = codedinputbytebuffernano.readString();
          goto _L13
_L9:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            credentialType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        nickname = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L11:
        correlationId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L12:
        partnerId = codedinputbytebuffernano.readString();
        if (true) goto _L13; else goto _L14
_L14:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (cardFrontImageUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, cardFrontImageUrl);
        }
        j = i;
        if (cardBackImageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, cardBackImageUrl);
        }
        i = j;
        if (cardNumberLast4 != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, cardNumberLast4);
        }
        j = i;
        if (expirationMonth != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, expirationMonth);
        }
        i = j;
        if (expirationYear != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, expirationYear);
        }
        j = i;
        if (nameOnCard != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, nameOnCard);
        }
        i = j;
        if (credentialType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(7, credentialType.intValue());
        }
        j = i;
        if (nickname != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, nickname);
        }
        i = j;
        if (correlationId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, correlationId);
        }
        j = i;
        if (partnerId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, partnerId);
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
        if (cardFrontImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(1, cardFrontImageUrl);
        }
        if (cardBackImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(2, cardBackImageUrl);
        }
        if (cardNumberLast4 != null)
        {
            codedoutputbytebuffernano.writeString(3, cardNumberLast4);
        }
        if (expirationMonth != null)
        {
            codedoutputbytebuffernano.writeString(4, expirationMonth);
        }
        if (expirationYear != null)
        {
            codedoutputbytebuffernano.writeString(5, expirationYear);
        }
        if (nameOnCard != null)
        {
            codedoutputbytebuffernano.writeString(6, nameOnCard);
        }
        if (credentialType != null)
        {
            codedoutputbytebuffernano.writeInt32(7, credentialType.intValue());
        }
        if (nickname != null)
        {
            codedoutputbytebuffernano.writeString(8, nickname);
        }
        if (correlationId != null)
        {
            codedoutputbytebuffernano.writeString(9, correlationId);
        }
        if (partnerId != null)
        {
            codedoutputbytebuffernano.writeString(10, partnerId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        clear();
    }
}
