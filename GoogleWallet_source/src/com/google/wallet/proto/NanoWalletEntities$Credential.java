// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class EncryptedInboundCardData extends ExtendableMessageNano
    {

        public String billingPublicKeyEncryptedSessionMaterial;
        public String encryptedCardNumber;
        public String encryptedCvc;

        private EncryptedInboundCardData clear()
        {
            billingPublicKeyEncryptedSessionMaterial = null;
            encryptedCardNumber = null;
            encryptedCvc = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EncryptedInboundCardData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (storeUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    billingPublicKeyEncryptedSessionMaterial = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    encryptedCardNumber = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    encryptedCvc = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (billingPublicKeyEncryptedSessionMaterial != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, billingPublicKeyEncryptedSessionMaterial);
            }
            j = i;
            if (encryptedCardNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, encryptedCardNumber);
            }
            i = j;
            if (encryptedCvc != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, encryptedCvc);
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
            if (billingPublicKeyEncryptedSessionMaterial != null)
            {
                codedoutputbytebuffernano.writeString(1, billingPublicKeyEncryptedSessionMaterial);
            }
            if (encryptedCardNumber != null)
            {
                codedoutputbytebuffernano.writeString(2, encryptedCardNumber);
            }
            if (encryptedCvc != null)
            {
                codedoutputbytebuffernano.writeString(3, encryptedCvc);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EncryptedInboundCardData()
        {
            clear();
        }
    }


    private static volatile  _emptyArray[];
    public  billingAddress;
    public int cardColor[];
    public String cardFrontImageUrl;
    public String cardNumberLast4;
    public  cdpInstrumentId;
    public Integer cloudSyncState;
    public Long creationTime;
    public emplate credentialTemplate;
    public ifier credentialTemplateId;
    public EncryptedInboundCardData encryptedInboundCardData;
    public String expirationMonth;
    public String expirationYear;
    public ifier id;
    public Integer invalidFundingSourceReason;
    public Boolean isExpired;
    public ata metadata;
    public String nameOnCard;
    public Integer network;
    public String nickname;
    public String paymentsSdkInstrumentId;
    public nstrumentUse restrictedUses[];
    public Integer status;
    public Integer type;

    private  clear()
    {
        id = null;
        metadata = null;
        nickname = null;
        expirationMonth = null;
        expirationYear = null;
        nameOnCard = null;
        billingAddress = null;
        credentialTemplateId = null;
        credentialTemplate = null;
        creationTime = null;
        cardFrontImageUrl = null;
        cardNumberLast4 = null;
        encryptedInboundCardData = null;
        cloudSyncState = null;
        cdpInstrumentId = null;
        network = null;
        cardColor = WireFormatNano.EMPTY_INT_ARRAY;
        status = null;
        isExpired = null;
        invalidFundingSourceReason = null;
        restrictedUses = nstrumentUse.emptyArray();
        paymentsSdkInstrumentId = null;
        type = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L27:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 25: default 216
    //                   0: 225
    //                   10: 227
    //                   18: 256
    //                   34: 267
    //                   42: 278
    //                   58: 289
    //                   66: 300
    //                   74: 329
    //                   80: 358
    //                   98: 372
    //                   106: 383
    //                   114: 394
    //                   122: 423
    //                   130: 452
    //                   136: 481
    //                   146: 530
    //                   152: 559
    //                   160: 606
    //                   162: 708
    //                   168: 836
    //                   176: 890
    //                   184: 904
    //                   194: 970
    //                   202: 1095
    //                   208: 1106;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L27; else goto _L2
_L2:
        return this;
_L3:
        if (id == null)
        {
            id = new ifier();
        }
        codedinputbytebuffernano.readMessage(id);
          goto _L27
_L4:
        nickname = codedinputbytebuffernano.readString();
          goto _L27
_L5:
        expirationMonth = codedinputbytebuffernano.readString();
          goto _L27
_L6:
        expirationYear = codedinputbytebuffernano.readString();
          goto _L27
_L7:
        nameOnCard = codedinputbytebuffernano.readString();
          goto _L27
_L8:
        if (billingAddress == null)
        {
            billingAddress = new it>();
        }
        codedinputbytebuffernano.readMessage(billingAddress);
          goto _L27
_L9:
        if (credentialTemplateId == null)
        {
            credentialTemplateId = new ifier();
        }
        codedinputbytebuffernano.readMessage(credentialTemplateId);
          goto _L27
_L10:
        creationTime = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L27
_L11:
        cardFrontImageUrl = codedinputbytebuffernano.readString();
          goto _L27
_L12:
        cardNumberLast4 = codedinputbytebuffernano.readString();
          goto _L27
_L13:
        if (metadata == null)
        {
            metadata = new ata();
        }
        codedinputbytebuffernano.readMessage(metadata);
          goto _L27
_L14:
        if (encryptedInboundCardData == null)
        {
            encryptedInboundCardData = new EncryptedInboundCardData();
        }
        codedinputbytebuffernano.readMessage(encryptedInboundCardData);
          goto _L27
_L15:
        if (cdpInstrumentId == null)
        {
            cdpInstrumentId = new init>();
        }
        codedinputbytebuffernano.readMessage(cdpInstrumentId);
          goto _L27
_L16:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            network = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        if (credentialTemplate == null)
        {
            credentialTemplate = new emplate();
        }
        codedinputbytebuffernano.readMessage(credentialTemplate);
        continue; /* Loop/switch isn't completed */
_L18:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            cloudSyncState = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 160);
        int ai[];
        int l;
        if (cardColor == null)
        {
            l = 0;
        } else
        {
            l = cardColor.length;
        }
        ai = new int[l + j2];
        j2 = l;
        if (l != 0)
        {
            System.arraycopy(cardColor, 0, ai, 0, l);
            j2 = l;
        }
        for (; j2 < ai.length - 1; j2++)
        {
            ai[j2] = codedinputbytebuffernano.readInt32();
            codedinputbytebuffernano.readTag();
        }

        ai[j2] = codedinputbytebuffernano.readInt32();
        cardColor = ai;
        continue; /* Loop/switch isn't completed */
_L20:
        int i3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        int k2 = 0;
        int i1 = codedinputbytebuffernano.getPosition();
        while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
        {
            codedinputbytebuffernano.readInt32();
            k2++;
        }
        codedinputbytebuffernano.rewindToPosition(i1);
        int ai1[];
        if (cardColor == null)
        {
            i1 = 0;
        } else
        {
            i1 = cardColor.length;
        }
        ai1 = new int[i1 + k2];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(cardColor, 0, ai1, 0, i1);
            k2 = i1;
        }
        for (; k2 < ai1.length; k2++)
        {
            ai1[k2] = codedinputbytebuffernano.readInt32();
        }

        cardColor = ai1;
        codedinputbytebuffernano.popLimit(i3);
        continue; /* Loop/switch isn't completed */
_L21:
        int j1 = codedinputbytebuffernano.readInt32();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            status = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        isExpired = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L23:
        int k1 = codedinputbytebuffernano.readInt32();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            invalidFundingSourceReason = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 194);
        nstrumentUse anstrumentuse[];
        int l1;
        if (restrictedUses == null)
        {
            l1 = 0;
        } else
        {
            l1 = restrictedUses.length;
        }
        anstrumentuse = new nstrumentUse[l1 + l2];
        l2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(restrictedUses, 0, anstrumentuse, 0, l1);
            l2 = l1;
        }
        for (; l2 < anstrumentuse.length - 1; l2++)
        {
            anstrumentuse[l2] = new nstrumentUse();
            codedinputbytebuffernano.readMessage(anstrumentuse[l2]);
            codedinputbytebuffernano.readTag();
        }

        anstrumentuse[l2] = new nstrumentUse();
        codedinputbytebuffernano.readMessage(anstrumentuse[l2]);
        restrictedUses = anstrumentuse;
        continue; /* Loop/switch isn't completed */
_L25:
        paymentsSdkInstrumentId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L26:
        int i2 = codedinputbytebuffernano.readInt32();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            type = Integer.valueOf(i2);
            break;
        }
        if (true) goto _L27; else goto _L28
_L28:
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
        if (nickname != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, nickname);
        }
        i = j;
        if (expirationMonth != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(4, expirationMonth);
        }
        j = i;
        if (expirationYear != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(5, expirationYear);
        }
        i = j;
        if (nameOnCard != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, nameOnCard);
        }
        j = i;
        if (billingAddress != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(8, billingAddress);
        }
        i = j;
        if (credentialTemplateId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, credentialTemplateId);
        }
        j = i;
        if (creationTime != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(10, creationTime.longValue());
        }
        i = j;
        if (cardFrontImageUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(12, cardFrontImageUrl);
        }
        j = i;
        if (cardNumberLast4 != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(13, cardNumberLast4);
        }
        i = j;
        if (metadata != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(14, metadata);
        }
        j = i;
        if (encryptedInboundCardData != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(15, encryptedInboundCardData);
        }
        i = j;
        if (cdpInstrumentId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(16, cdpInstrumentId);
        }
        j = i;
        if (network != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(17, network.intValue());
        }
        int k = j;
        if (credentialTemplate != null)
        {
            k = j + CodedOutputByteBufferNano.computeMessageSize(18, credentialTemplate);
        }
        i = k;
        if (cloudSyncState != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(19, cloudSyncState.intValue());
        }
        j = i;
        if (cardColor != null)
        {
            j = i;
            if (cardColor.length > 0)
            {
                int l = 0;
                for (j = 0; j < cardColor.length; j++)
                {
                    l += CodedOutputByteBufferNano.computeInt32SizeNoTag(cardColor[j]);
                }

                j = i + l + cardColor.length * 2;
            }
        }
        i = j;
        if (status != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(21, status.intValue());
        }
        j = i;
        if (isExpired != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(22, isExpired.booleanValue());
        }
        i = j;
        if (invalidFundingSourceReason != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(23, invalidFundingSourceReason.intValue());
        }
        j = i;
        if (restrictedUses != null)
        {
            j = i;
            if (restrictedUses.length > 0)
            {
                int i1 = 0;
                do
                {
                    j = i;
                    if (i1 >= restrictedUses.length)
                    {
                        break;
                    }
                    nstrumentUse nstrumentuse = restrictedUses[i1];
                    j = i;
                    if (nstrumentuse != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(24, nstrumentuse);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (paymentsSdkInstrumentId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(25, paymentsSdkInstrumentId);
        }
        j = i;
        if (type != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(26, type.intValue());
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (nickname != null)
        {
            codedoutputbytebuffernano.writeString(2, nickname);
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
            codedoutputbytebuffernano.writeString(7, nameOnCard);
        }
        if (billingAddress != null)
        {
            codedoutputbytebuffernano.writeMessage(8, billingAddress);
        }
        if (credentialTemplateId != null)
        {
            codedoutputbytebuffernano.writeMessage(9, credentialTemplateId);
        }
        if (creationTime != null)
        {
            codedoutputbytebuffernano.writeInt64(10, creationTime.longValue());
        }
        if (cardFrontImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(12, cardFrontImageUrl);
        }
        if (cardNumberLast4 != null)
        {
            codedoutputbytebuffernano.writeString(13, cardNumberLast4);
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(14, metadata);
        }
        if (encryptedInboundCardData != null)
        {
            codedoutputbytebuffernano.writeMessage(15, encryptedInboundCardData);
        }
        if (cdpInstrumentId != null)
        {
            codedoutputbytebuffernano.writeMessage(16, cdpInstrumentId);
        }
        if (network != null)
        {
            codedoutputbytebuffernano.writeInt32(17, network.intValue());
        }
        if (credentialTemplate != null)
        {
            codedoutputbytebuffernano.writeMessage(18, credentialTemplate);
        }
        if (cloudSyncState != null)
        {
            codedoutputbytebuffernano.writeInt32(19, cloudSyncState.intValue());
        }
        if (cardColor != null && cardColor.length > 0)
        {
            for (int i = 0; i < cardColor.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(20, cardColor[i]);
            }

        }
        if (status != null)
        {
            codedoutputbytebuffernano.writeInt32(21, status.intValue());
        }
        if (isExpired != null)
        {
            codedoutputbytebuffernano.writeBool(22, isExpired.booleanValue());
        }
        if (invalidFundingSourceReason != null)
        {
            codedoutputbytebuffernano.writeInt32(23, invalidFundingSourceReason.intValue());
        }
        if (restrictedUses != null && restrictedUses.length > 0)
        {
            for (int j = 0; j < restrictedUses.length; j++)
            {
                nstrumentUse nstrumentuse = restrictedUses[j];
                if (nstrumentuse != null)
                {
                    codedoutputbytebuffernano.writeMessage(24, nstrumentuse);
                }
            }

        }
        if (paymentsSdkInstrumentId != null)
        {
            codedoutputbytebuffernano.writeString(25, paymentsSdkInstrumentId);
        }
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(26, type.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public EncryptedInboundCardData.clear()
    {
        clear();
    }
}
