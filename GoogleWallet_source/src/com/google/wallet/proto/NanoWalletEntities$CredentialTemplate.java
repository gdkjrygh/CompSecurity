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
    public static final class BinRange extends ExtendableMessageNano
    {

        private static volatile BinRange _emptyArray[];
        public Long rangeMax;
        public Long rangeMin;

        private BinRange clear()
        {
            rangeMin = null;
            rangeMax = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static BinRange[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new BinRange[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private BinRange mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    rangeMin = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 16: // '\020'
                    rangeMax = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (rangeMin != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, rangeMin.longValue());
            }
            j = i;
            if (rangeMax != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, rangeMax.longValue());
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
            if (rangeMin != null)
            {
                codedoutputbytebuffernano.writeInt64(1, rangeMin.longValue());
            }
            if (rangeMax != null)
            {
                codedoutputbytebuffernano.writeInt64(2, rangeMax.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BinRange()
        {
            clear();
        }
    }


    public Boolean activationRequired;
    public String alternatePhoneNumber;
    public Integer bankApiType;
    public String bankApiUrl;
    public String bankName;
    public String bankWebsite;
    public BinRange binRange[];
    public Long creationTime;
    public Integer credentialType;
    public String frontImage;
    public BinRange id;
    public ion kycQuestions[];
    public Integer network;
    public String partnerId;
    public String productName;
    public Integer provisioningType;
    public ion removeRestrictionQuestions[];
    public String restrictionMessage;
    public Boolean tapAndPayEligible;
    public String tollFreePhoneNumber;

    private BinRange clear()
    {
        id = null;
        bankName = null;
        tollFreePhoneNumber = null;
        alternatePhoneNumber = null;
        bankWebsite = null;
        frontImage = null;
        credentialType = null;
        network = null;
        productName = null;
        bankApiType = null;
        bankApiUrl = null;
        partnerId = null;
        tapAndPayEligible = null;
        provisioningType = null;
        activationRequired = null;
        kycQuestions = ion.emptyArray();
        removeRestrictionQuestions = ion.emptyArray();
        restrictionMessage = null;
        creationTime = null;
        binRange = BinRange.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L23:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 21: default 184
    //                   0: 193
    //                   10: 195
    //                   18: 224
    //                   26: 235
    //                   34: 246
    //                   42: 257
    //                   50: 268
    //                   56: 279
    //                   64: 334
    //                   74: 386
    //                   80: 397
    //                   88: 446
    //                   98: 460
    //                   106: 584
    //                   114: 708
    //                   120: 719
    //                   130: 733
    //                   138: 858
    //                   144: 869
    //                   152: 883
    //                   162: 926;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L23; else goto _L2
_L2:
        return this;
_L3:
        if (id == null)
        {
            id = new nit>();
        }
        codedinputbytebuffernano.readMessage(id);
          goto _L23
_L4:
        bankName = codedinputbytebuffernano.readString();
          goto _L23
_L5:
        tollFreePhoneNumber = codedinputbytebuffernano.readString();
          goto _L23
_L6:
        alternatePhoneNumber = codedinputbytebuffernano.readString();
          goto _L23
_L7:
        bankWebsite = codedinputbytebuffernano.readString();
          goto _L23
_L8:
        frontImage = codedinputbytebuffernano.readString();
          goto _L23
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
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            network = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        productName = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L12:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            bankApiType = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        tapAndPayEligible = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L14:
        int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 98);
        ion aion[];
        int i1;
        if (kycQuestions == null)
        {
            i1 = 0;
        } else
        {
            i1 = kycQuestions.length;
        }
        aion = new ion[i1 + i2];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(kycQuestions, 0, aion, 0, i1);
            i2 = i1;
        }
        for (; i2 < aion.length - 1; i2++)
        {
            aion[i2] = new ion();
            codedinputbytebuffernano.readMessage(aion[i2]);
            codedinputbytebuffernano.readTag();
        }

        aion[i2] = new ion();
        codedinputbytebuffernano.readMessage(aion[i2]);
        kycQuestions = aion;
        continue; /* Loop/switch isn't completed */
_L15:
        int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 106);
        ion aion1[];
        int j1;
        if (removeRestrictionQuestions == null)
        {
            j1 = 0;
        } else
        {
            j1 = removeRestrictionQuestions.length;
        }
        aion1 = new ion[j1 + j2];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(removeRestrictionQuestions, 0, aion1, 0, j1);
            j2 = j1;
        }
        for (; j2 < aion1.length - 1; j2++)
        {
            aion1[j2] = new ion();
            codedinputbytebuffernano.readMessage(aion1[j2]);
            codedinputbytebuffernano.readTag();
        }

        aion1[j2] = new ion();
        codedinputbytebuffernano.readMessage(aion1[j2]);
        removeRestrictionQuestions = aion1;
        continue; /* Loop/switch isn't completed */
_L16:
        restrictionMessage = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L17:
        creationTime = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L18:
        int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 130);
        BinRange abinrange[];
        int k1;
        if (binRange == null)
        {
            k1 = 0;
        } else
        {
            k1 = binRange.length;
        }
        abinrange = new BinRange[k1 + k2];
        k2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(binRange, 0, abinrange, 0, k1);
            k2 = k1;
        }
        for (; k2 < abinrange.length - 1; k2++)
        {
            abinrange[k2] = new BinRange();
            codedinputbytebuffernano.readMessage(abinrange[k2]);
            codedinputbytebuffernano.readTag();
        }

        abinrange[k2] = new BinRange();
        codedinputbytebuffernano.readMessage(abinrange[k2]);
        binRange = abinrange;
        continue; /* Loop/switch isn't completed */
_L19:
        bankApiUrl = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L20:
        activationRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L21:
        int l1 = codedinputbytebuffernano.readInt32();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
            provisioningType = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        partnerId = codedinputbytebuffernano.readString();
        if (true) goto _L23; else goto _L24
_L24:
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
        if (bankName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, bankName);
        }
        i = j;
        if (tollFreePhoneNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, tollFreePhoneNumber);
        }
        j = i;
        if (alternatePhoneNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, alternatePhoneNumber);
        }
        i = j;
        if (bankWebsite != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, bankWebsite);
        }
        j = i;
        if (frontImage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, frontImage);
        }
        i = j;
        if (credentialType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(7, credentialType.intValue());
        }
        j = i;
        if (network != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(8, network.intValue());
        }
        i = j;
        if (productName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, productName);
        }
        int k = i;
        if (bankApiType != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(10, bankApiType.intValue());
        }
        j = k;
        if (tapAndPayEligible != null)
        {
            j = k + CodedOutputByteBufferNano.computeBoolSize(11, tapAndPayEligible.booleanValue());
        }
        i = j;
        if (kycQuestions != null)
        {
            i = j;
            if (kycQuestions.length > 0)
            {
                k = 0;
                do
                {
                    i = j;
                    if (k >= kycQuestions.length)
                    {
                        break;
                    }
                    ion ion = kycQuestions[k];
                    i = j;
                    if (ion != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(12, ion);
                    }
                    k++;
                    j = i;
                } while (true);
            }
        }
        j = i;
        if (removeRestrictionQuestions != null)
        {
            j = i;
            if (removeRestrictionQuestions.length > 0)
            {
                k = 0;
                do
                {
                    j = i;
                    if (k >= removeRestrictionQuestions.length)
                    {
                        break;
                    }
                    ion ion1 = removeRestrictionQuestions[k];
                    j = i;
                    if (ion1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(13, ion1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        k = j;
        if (restrictionMessage != null)
        {
            k = j + CodedOutputByteBufferNano.computeStringSize(14, restrictionMessage);
        }
        i = k;
        if (creationTime != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt64Size(15, creationTime.longValue());
        }
        j = i;
        if (binRange != null)
        {
            j = i;
            if (binRange.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= binRange.length)
                    {
                        break;
                    }
                    BinRange binrange = binRange[l];
                    j = i;
                    if (binrange != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(16, binrange);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (bankApiUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(17, bankApiUrl);
        }
        j = i;
        if (activationRequired != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(18, activationRequired.booleanValue());
        }
        i = j;
        if (provisioningType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(19, provisioningType.intValue());
        }
        j = i;
        if (partnerId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(20, partnerId);
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
        if (bankName != null)
        {
            codedoutputbytebuffernano.writeString(2, bankName);
        }
        if (tollFreePhoneNumber != null)
        {
            codedoutputbytebuffernano.writeString(3, tollFreePhoneNumber);
        }
        if (alternatePhoneNumber != null)
        {
            codedoutputbytebuffernano.writeString(4, alternatePhoneNumber);
        }
        if (bankWebsite != null)
        {
            codedoutputbytebuffernano.writeString(5, bankWebsite);
        }
        if (frontImage != null)
        {
            codedoutputbytebuffernano.writeString(6, frontImage);
        }
        if (credentialType != null)
        {
            codedoutputbytebuffernano.writeInt32(7, credentialType.intValue());
        }
        if (network != null)
        {
            codedoutputbytebuffernano.writeInt32(8, network.intValue());
        }
        if (productName != null)
        {
            codedoutputbytebuffernano.writeString(9, productName);
        }
        if (bankApiType != null)
        {
            codedoutputbytebuffernano.writeInt32(10, bankApiType.intValue());
        }
        if (tapAndPayEligible != null)
        {
            codedoutputbytebuffernano.writeBool(11, tapAndPayEligible.booleanValue());
        }
        if (kycQuestions != null && kycQuestions.length > 0)
        {
            for (int i = 0; i < kycQuestions.length; i++)
            {
                ion ion = kycQuestions[i];
                if (ion != null)
                {
                    codedoutputbytebuffernano.writeMessage(12, ion);
                }
            }

        }
        if (removeRestrictionQuestions != null && removeRestrictionQuestions.length > 0)
        {
            for (int j = 0; j < removeRestrictionQuestions.length; j++)
            {
                ion ion1 = removeRestrictionQuestions[j];
                if (ion1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(13, ion1);
                }
            }

        }
        if (restrictionMessage != null)
        {
            codedoutputbytebuffernano.writeString(14, restrictionMessage);
        }
        if (creationTime != null)
        {
            codedoutputbytebuffernano.writeInt64(15, creationTime.longValue());
        }
        if (binRange != null && binRange.length > 0)
        {
            for (int k = 0; k < binRange.length; k++)
            {
                BinRange binrange = binRange[k];
                if (binrange != null)
                {
                    codedoutputbytebuffernano.writeMessage(16, binrange);
                }
            }

        }
        if (bankApiUrl != null)
        {
            codedoutputbytebuffernano.writeString(17, bankApiUrl);
        }
        if (activationRequired != null)
        {
            codedoutputbytebuffernano.writeBool(18, activationRequired.booleanValue());
        }
        if (provisioningType != null)
        {
            codedoutputbytebuffernano.writeInt32(19, provisioningType.intValue());
        }
        if (partnerId != null)
        {
            codedoutputbytebuffernano.writeString(20, partnerId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public BinRange.clear()
    {
        clear();
    }
}
