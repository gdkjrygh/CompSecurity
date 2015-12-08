// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    public long dasherCustomerId;
    public rentalPeriodDays docid;
    public boolean hasDasherCustomerId;
    public boolean hasLicensedOfferType;
    public boolean hasRentalPeriodDays;
    public boolean hasType;
    public int licensedOfferType;
    public int rentalPeriodDays;
    public int type;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasDasherCustomerId)
            {
                i = j;
                if (dasherCustomerId == 0L)
                {
                    break label0;
                }
            }
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 8);
        }
label1:
        {
            int k = i;
            if (docid != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(2, docid);
            }
            if (licensedOfferType == 1)
            {
                i = k;
                if (!hasLicensedOfferType)
                {
                    break label1;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, licensedOfferType);
        }
        int l;
label2:
        {
            if (type == 0)
            {
                l = i;
                if (!hasType)
                {
                    break label2;
                }
            }
            l = i + CodedOutputByteBufferNano.computeInt32Size(4, type);
        }
label3:
        {
            if (!hasRentalPeriodDays)
            {
                i = l;
                if (rentalPeriodDays == 0)
                {
                    break label3;
                }
            }
            i = l + CodedOutputByteBufferNano.computeInt32Size(5, rentalPeriodDays);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 72
    //                   9: 74
    //                   18: 90
    //                   24: 119
    //                   32: 204
    //                   40: 256;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        dasherCustomerId = codedinputbytebuffernano.readRawLittleEndian64();
        hasDasherCustomerId = true;
          goto _L8
_L4:
        if (docid == null)
        {
            docid = new docid();
        }
        codedinputbytebuffernano.readMessage(docid);
          goto _L8
_L5:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            licensedOfferType = j;
            hasLicensedOfferType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            type = k;
            hasType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        rentalPeriodDays = codedinputbytebuffernano.readRawVarint32();
        hasRentalPeriodDays = true;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDasherCustomerId || dasherCustomerId != 0L)
        {
            codedoutputbytebuffernano.writeFixed64(1, dasherCustomerId);
        }
        if (docid != null)
        {
            codedoutputbytebuffernano.writeMessage(2, docid);
        }
        if (licensedOfferType != 1 || hasLicensedOfferType)
        {
            codedoutputbytebuffernano.writeInt32(3, licensedOfferType);
        }
        if (type != 0 || hasType)
        {
            codedoutputbytebuffernano.writeInt32(4, type);
        }
        if (hasRentalPeriodDays || rentalPeriodDays != 0)
        {
            codedoutputbytebuffernano.writeInt32(5, rentalPeriodDays);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        dasherCustomerId = 0L;
        hasDasherCustomerId = false;
        docid = null;
        licensedOfferType = 1;
        hasLicensedOfferType = false;
        type = 0;
        hasType = false;
        rentalPeriodDays = 0;
        hasRentalPeriodDays = false;
        cachedSize = -1;
    }
}
