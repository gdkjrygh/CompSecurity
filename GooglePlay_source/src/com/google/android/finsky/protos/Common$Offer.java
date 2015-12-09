// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    private static volatile Nano _emptyArray[];
    public boolean checkoutFlowRequired;
    public Nano convertedPrice[];
    public String currencyCode;
    public String formattedAmount;
    public String formattedDescription;
    public String formattedFullAmount;
    public String formattedName;
    public long fullPriceMicros;
    public boolean hasCheckoutFlowRequired;
    public boolean hasCurrencyCode;
    public boolean hasFormattedAmount;
    public boolean hasFormattedDescription;
    public boolean hasFormattedFullAmount;
    public boolean hasFormattedName;
    public boolean hasFullPriceMicros;
    public boolean hasLicensedOfferType;
    public boolean hasMicros;
    public boolean hasOfferId;
    public boolean hasOfferType;
    public boolean hasOnSaleDate;
    public boolean hasOnSaleDateDisplayTimeZoneOffsetMsec;
    public boolean hasPreorder;
    public boolean hasPreorderFulfillmentDisplayDate;
    public boolean hasTemporarilyFree;
    public eTerms licenseTerms;
    public int licensedOfferType;
    public long micros;
    public String offerId;
    public ayment offerPayment[];
    public int offerType;
    public long onSaleDate;
    public int onSaleDateDisplayTimeZoneOffsetMsec;
    public boolean preorder;
    public long preorderFulfillmentDisplayDate;
    public String promotionLabel[];
    public Terms rentalTerms;
    public iptionContentTerms subscriptionContentTerms;
    public iptionTerms subscriptionTerms;
    public boolean temporarilyFree;
    public rOfferTerms voucherTerms;

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

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasMicros)
            {
                i = j;
                if (micros == 0L)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, micros);
        }
        int k;
label1:
        {
            if (!hasCurrencyCode)
            {
                k = i;
                if (currencyCode.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, currencyCode);
        }
label2:
        {
            if (!hasFormattedAmount)
            {
                i = k;
                if (formattedAmount.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, formattedAmount);
        }
label3:
        {
            k = i;
            if (convertedPrice != null)
            {
                k = i;
                if (convertedPrice.length > 0)
                {
                    int j1 = 0;
                    do
                    {
                        k = i;
                        if (j1 >= convertedPrice.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray = convertedPrice[j1];
                        k = i;
                        if (_lemptyarray != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(4, _lemptyarray);
                        }
                        j1++;
                        i = k;
                    } while (true);
                }
            }
            if (!hasCheckoutFlowRequired)
            {
                i = k;
                if (!checkoutFlowRequired)
                {
                    break label3;
                }
            }
            i = k + (CodedOutputByteBufferNano.computeTagSize(5) + 1);
        }
label4:
        {
            if (!hasFullPriceMicros)
            {
                k = i;
                if (fullPriceMicros == 0L)
                {
                    break label4;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt64Size(6, fullPriceMicros);
        }
label5:
        {
            if (!hasFormattedFullAmount)
            {
                i = k;
                if (formattedFullAmount.equals(""))
                {
                    break label5;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(7, formattedFullAmount);
        }
label6:
        {
            if (offerType == 1)
            {
                k = i;
                if (!hasOfferType)
                {
                    break label6;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(8, offerType);
        }
label7:
        {
            int k1 = k;
            if (rentalTerms != null)
            {
                k1 = k + CodedOutputByteBufferNano.computeMessageSize(9, rentalTerms);
            }
            if (!hasOnSaleDate)
            {
                i = k1;
                if (onSaleDate == 0L)
                {
                    break label7;
                }
            }
            i = k1 + CodedOutputByteBufferNano.computeInt64Size(10, onSaleDate);
        }
label8:
        {
            k = i;
            if (promotionLabel != null)
            {
                k = i;
                if (promotionLabel.length > 0)
                {
                    int k2 = 0;
                    int l1 = 0;
                    for (k = 0; k < promotionLabel.length;)
                    {
                        String s = promotionLabel[k];
                        int l2 = k2;
                        int j2 = l1;
                        if (s != null)
                        {
                            l2 = k2 + 1;
                            j2 = l1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        k++;
                        k2 = l2;
                        l1 = j2;
                    }

                    k = i + l1 + k2 * 1;
                }
            }
            i = k;
            if (subscriptionTerms != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(12, subscriptionTerms);
            }
            if (!hasFormattedName)
            {
                k = i;
                if (formattedName.equals(""))
                {
                    break label8;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(13, formattedName);
        }
label9:
        {
            if (!hasFormattedDescription)
            {
                i = k;
                if (formattedDescription.equals(""))
                {
                    break label9;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(14, formattedDescription);
        }
label10:
        {
            if (!hasPreorder)
            {
                k = i;
                if (!preorder)
                {
                    break label10;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(15) + 1);
        }
label11:
        {
            if (!hasOnSaleDateDisplayTimeZoneOffsetMsec)
            {
                i = k;
                if (onSaleDateDisplayTimeZoneOffsetMsec == 0)
                {
                    break label11;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(16, onSaleDateDisplayTimeZoneOffsetMsec);
        }
label12:
        {
            if (licensedOfferType == 1)
            {
                k = i;
                if (!hasLicensedOfferType)
                {
                    break label12;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(17, licensedOfferType);
        }
label13:
        {
            i = k;
            if (subscriptionContentTerms != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(18, subscriptionContentTerms);
            }
            if (!hasOfferId)
            {
                k = i;
                if (offerId.equals(""))
                {
                    break label13;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(19, offerId);
        }
label14:
        {
            if (!hasPreorderFulfillmentDisplayDate)
            {
                i = k;
                if (preorderFulfillmentDisplayDate == 0L)
                {
                    break label14;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(20, preorderFulfillmentDisplayDate);
        }
        int i2;
label15:
        {
            int l = i;
            if (licenseTerms != null)
            {
                l = i + CodedOutputByteBufferNano.computeMessageSize(21, licenseTerms);
            }
            if (!hasTemporarilyFree)
            {
                i2 = l;
                if (!temporarilyFree)
                {
                    break label15;
                }
            }
            i2 = l + (CodedOutputByteBufferNano.computeTagSize(22) + 1);
        }
        i = i2;
        if (voucherTerms != null)
        {
            i = i2 + CodedOutputByteBufferNano.computeMessageSize(23, voucherTerms);
        }
        i2 = i;
        if (offerPayment != null)
        {
            i2 = i;
            if (offerPayment.length > 0)
            {
                int i1 = 0;
                do
                {
                    i2 = i;
                    if (i1 >= offerPayment.length)
                    {
                        break;
                    }
                    ayment ayment = offerPayment[i1];
                    i2 = i;
                    if (ayment != null)
                    {
                        i2 = i + CodedOutputByteBufferNano.computeMessageSize(24, ayment);
                    }
                    i1++;
                    i = i2;
                } while (true);
            }
        }
        return i2;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L27:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 25: default 216
    //                   0: 224
    //                   8: 226
    //                   18: 242
    //                   26: 258
    //                   34: 274
    //                   40: 398
    //                   48: 414
    //                   58: 430
    //                   64: 446
    //                   74: 532
    //                   80: 561
    //                   90: 577
    //                   98: 679
    //                   106: 708
    //                   114: 724
    //                   120: 740
    //                   128: 756
    //                   136: 772
    //                   146: 856
    //                   154: 885
    //                   160: 901
    //                   170: 917
    //                   176: 946
    //                   186: 962
    //                   194: 991;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L27; else goto _L2
_L2:
        return this;
_L3:
        micros = codedinputbytebuffernano.readRawVarint64();
        hasMicros = true;
          goto _L27
_L4:
        currencyCode = codedinputbytebuffernano.readString();
        hasCurrencyCode = true;
          goto _L27
_L5:
        formattedAmount = codedinputbytebuffernano.readString();
        hasFormattedAmount = true;
          goto _L27
_L6:
        int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
        ano aano[];
        int j;
        if (convertedPrice == null)
        {
            j = 0;
        } else
        {
            j = convertedPrice.length;
        }
        aano = new convertedPrice[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(convertedPrice, 0, aano, 0, j);
            k1 = j;
        }
        for (; k1 < aano.length - 1; k1++)
        {
            aano[k1] = new <init>();
            codedinputbytebuffernano.readMessage(aano[k1]);
            codedinputbytebuffernano.readTag();
        }

        aano[k1] = new <init>();
        codedinputbytebuffernano.readMessage(aano[k1]);
        convertedPrice = aano;
          goto _L27
_L7:
        checkoutFlowRequired = codedinputbytebuffernano.readBool();
        hasCheckoutFlowRequired = true;
          goto _L27
_L8:
        fullPriceMicros = codedinputbytebuffernano.readRawVarint64();
        hasFullPriceMicros = true;
          goto _L27
_L9:
        formattedFullAmount = codedinputbytebuffernano.readString();
        hasFormattedFullAmount = true;
          goto _L27
_L10:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
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
            offerType = k;
            hasOfferType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (rentalTerms == null)
        {
            rentalTerms = new Terms();
        }
        codedinputbytebuffernano.readMessage(rentalTerms);
        continue; /* Loop/switch isn't completed */
_L12:
        onSaleDate = codedinputbytebuffernano.readRawVarint64();
        hasOnSaleDate = true;
        continue; /* Loop/switch isn't completed */
_L13:
        int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
        String as[];
        int l;
        if (promotionLabel == null)
        {
            l = 0;
        } else
        {
            l = promotionLabel.length;
        }
        as = new String[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(promotionLabel, 0, as, 0, l);
            l1 = l;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[l1] = codedinputbytebuffernano.readString();
        promotionLabel = as;
        continue; /* Loop/switch isn't completed */
_L14:
        if (subscriptionTerms == null)
        {
            subscriptionTerms = new iptionTerms();
        }
        codedinputbytebuffernano.readMessage(subscriptionTerms);
        continue; /* Loop/switch isn't completed */
_L15:
        formattedName = codedinputbytebuffernano.readString();
        hasFormattedName = true;
        continue; /* Loop/switch isn't completed */
_L16:
        formattedDescription = codedinputbytebuffernano.readString();
        hasFormattedDescription = true;
        continue; /* Loop/switch isn't completed */
_L17:
        preorder = codedinputbytebuffernano.readBool();
        hasPreorder = true;
        continue; /* Loop/switch isn't completed */
_L18:
        onSaleDateDisplayTimeZoneOffsetMsec = codedinputbytebuffernano.readRawVarint32();
        hasOnSaleDateDisplayTimeZoneOffsetMsec = true;
        continue; /* Loop/switch isn't completed */
_L19:
        int i1 = codedinputbytebuffernano.readRawVarint32();
        switch (i1)
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
            licensedOfferType = i1;
            hasLicensedOfferType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        if (subscriptionContentTerms == null)
        {
            subscriptionContentTerms = new iptionContentTerms();
        }
        codedinputbytebuffernano.readMessage(subscriptionContentTerms);
        continue; /* Loop/switch isn't completed */
_L21:
        offerId = codedinputbytebuffernano.readString();
        hasOfferId = true;
        continue; /* Loop/switch isn't completed */
_L22:
        preorderFulfillmentDisplayDate = codedinputbytebuffernano.readRawVarint64();
        hasPreorderFulfillmentDisplayDate = true;
        continue; /* Loop/switch isn't completed */
_L23:
        if (licenseTerms == null)
        {
            licenseTerms = new eTerms();
        }
        codedinputbytebuffernano.readMessage(licenseTerms);
        continue; /* Loop/switch isn't completed */
_L24:
        temporarilyFree = codedinputbytebuffernano.readBool();
        hasTemporarilyFree = true;
        continue; /* Loop/switch isn't completed */
_L25:
        if (voucherTerms == null)
        {
            voucherTerms = new rOfferTerms();
        }
        codedinputbytebuffernano.readMessage(voucherTerms);
        continue; /* Loop/switch isn't completed */
_L26:
        int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 194);
        ayment aayment[];
        int j1;
        if (offerPayment == null)
        {
            j1 = 0;
        } else
        {
            j1 = offerPayment.length;
        }
        aayment = new ayment[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(offerPayment, 0, aayment, 0, j1);
            i2 = j1;
        }
        for (; i2 < aayment.length - 1; i2++)
        {
            aayment[i2] = new ayment();
            codedinputbytebuffernano.readMessage(aayment[i2]);
            codedinputbytebuffernano.readTag();
        }

        aayment[i2] = new ayment();
        codedinputbytebuffernano.readMessage(aayment[i2]);
        offerPayment = aayment;
        if (true) goto _L27; else goto _L28
_L28:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasMicros || micros != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, micros);
        }
        if (hasCurrencyCode || !currencyCode.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, currencyCode);
        }
        if (hasFormattedAmount || !formattedAmount.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, formattedAmount);
        }
        if (convertedPrice != null && convertedPrice.length > 0)
        {
            for (int i = 0; i < convertedPrice.length; i++)
            {
                Nano nano = convertedPrice[i];
                if (nano != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, nano);
                }
            }

        }
        if (hasCheckoutFlowRequired || checkoutFlowRequired)
        {
            codedoutputbytebuffernano.writeBool(5, checkoutFlowRequired);
        }
        if (hasFullPriceMicros || fullPriceMicros != 0L)
        {
            codedoutputbytebuffernano.writeInt64(6, fullPriceMicros);
        }
        if (hasFormattedFullAmount || !formattedFullAmount.equals(""))
        {
            codedoutputbytebuffernano.writeString(7, formattedFullAmount);
        }
        if (offerType != 1 || hasOfferType)
        {
            codedoutputbytebuffernano.writeInt32(8, offerType);
        }
        if (rentalTerms != null)
        {
            codedoutputbytebuffernano.writeMessage(9, rentalTerms);
        }
        if (hasOnSaleDate || onSaleDate != 0L)
        {
            codedoutputbytebuffernano.writeInt64(10, onSaleDate);
        }
        if (promotionLabel != null && promotionLabel.length > 0)
        {
            for (int j = 0; j < promotionLabel.length; j++)
            {
                String s = promotionLabel[j];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(11, s);
                }
            }

        }
        if (subscriptionTerms != null)
        {
            codedoutputbytebuffernano.writeMessage(12, subscriptionTerms);
        }
        if (hasFormattedName || !formattedName.equals(""))
        {
            codedoutputbytebuffernano.writeString(13, formattedName);
        }
        if (hasFormattedDescription || !formattedDescription.equals(""))
        {
            codedoutputbytebuffernano.writeString(14, formattedDescription);
        }
        if (hasPreorder || preorder)
        {
            codedoutputbytebuffernano.writeBool(15, preorder);
        }
        if (hasOnSaleDateDisplayTimeZoneOffsetMsec || onSaleDateDisplayTimeZoneOffsetMsec != 0)
        {
            codedoutputbytebuffernano.writeInt32(16, onSaleDateDisplayTimeZoneOffsetMsec);
        }
        if (licensedOfferType != 1 || hasLicensedOfferType)
        {
            codedoutputbytebuffernano.writeInt32(17, licensedOfferType);
        }
        if (subscriptionContentTerms != null)
        {
            codedoutputbytebuffernano.writeMessage(18, subscriptionContentTerms);
        }
        if (hasOfferId || !offerId.equals(""))
        {
            codedoutputbytebuffernano.writeString(19, offerId);
        }
        if (hasPreorderFulfillmentDisplayDate || preorderFulfillmentDisplayDate != 0L)
        {
            codedoutputbytebuffernano.writeInt64(20, preorderFulfillmentDisplayDate);
        }
        if (licenseTerms != null)
        {
            codedoutputbytebuffernano.writeMessage(21, licenseTerms);
        }
        if (hasTemporarilyFree || temporarilyFree)
        {
            codedoutputbytebuffernano.writeBool(22, temporarilyFree);
        }
        if (voucherTerms != null)
        {
            codedoutputbytebuffernano.writeMessage(23, voucherTerms);
        }
        if (offerPayment != null && offerPayment.length > 0)
        {
            for (int k = 0; k < offerPayment.length; k++)
            {
                ayment ayment = offerPayment[k];
                if (ayment != null)
                {
                    codedoutputbytebuffernano.writeMessage(24, ayment);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Nano()
    {
        offerPayment = ayment.emptyArray();
        micros = 0L;
        hasMicros = false;
        currencyCode = "";
        hasCurrencyCode = false;
        formattedAmount = "";
        hasFormattedAmount = false;
        formattedName = "";
        hasFormattedName = false;
        formattedDescription = "";
        hasFormattedDescription = false;
        fullPriceMicros = 0L;
        hasFullPriceMicros = false;
        formattedFullAmount = "";
        hasFormattedFullAmount = false;
        convertedPrice = emptyArray();
        checkoutFlowRequired = false;
        hasCheckoutFlowRequired = false;
        temporarilyFree = false;
        hasTemporarilyFree = false;
        offerType = 1;
        hasOfferType = false;
        licensedOfferType = 1;
        hasLicensedOfferType = false;
        licenseTerms = null;
        rentalTerms = null;
        subscriptionTerms = null;
        subscriptionContentTerms = null;
        voucherTerms = null;
        preorder = false;
        hasPreorder = false;
        preorderFulfillmentDisplayDate = 0L;
        hasPreorderFulfillmentDisplayDate = false;
        onSaleDate = 0L;
        hasOnSaleDate = false;
        onSaleDateDisplayTimeZoneOffsetMsec = 0;
        hasOnSaleDateDisplayTimeZoneOffsetMsec = false;
        promotionLabel = WireFormatNano.EMPTY_STRING_ARRAY;
        offerId = "";
        hasOfferId = false;
        cachedSize = -1;
    }
}
