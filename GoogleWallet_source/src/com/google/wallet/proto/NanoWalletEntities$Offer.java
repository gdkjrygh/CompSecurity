// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class ExplosionDetails extends ExtendableMessageNano
    {

        public Boolean active;
        public Long activeDurationBeforeExplosion;
        public String explosionRedemptionCode;
        public Long explosionTimeMillis;

        private ExplosionDetails clear()
        {
            active = null;
            explosionTimeMillis = null;
            activeDurationBeforeExplosion = null;
            explosionRedemptionCode = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ExplosionDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    active = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 16: // '\020'
                    explosionTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 24: // '\030'
                    activeDurationBeforeExplosion = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 34: // '"'
                    explosionRedemptionCode = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (active != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, active.booleanValue());
            }
            j = i;
            if (explosionTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, explosionTimeMillis.longValue());
            }
            i = j;
            if (activeDurationBeforeExplosion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, activeDurationBeforeExplosion.longValue());
            }
            j = i;
            if (explosionRedemptionCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, explosionRedemptionCode);
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
            if (active != null)
            {
                codedoutputbytebuffernano.writeBool(1, active.booleanValue());
            }
            if (explosionTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, explosionTimeMillis.longValue());
            }
            if (activeDurationBeforeExplosion != null)
            {
                codedoutputbytebuffernano.writeInt64(3, activeDurationBeforeExplosion.longValue());
            }
            if (explosionRedemptionCode != null)
            {
                codedoutputbytebuffernano.writeString(4, explosionRedemptionCode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ExplosionDetails()
        {
            clear();
        }
    }


    private static volatile o _emptyArray[];
    public String acquisitionSource;
    public Long archiveTimeMillis;
    public Long clipTimeMillis;
    public o destStore;
    public String discountAmount;
    public dTime expirationDate;
    public ExplosionDetails explosionDetails;
    public OfferTemplateId googleOfferTemplateId;
    public Identifier id;
    public String imageUrl;
    public Boolean isExploding;
    public Boolean isMarketplace;
    public Boolean isRedeemableFromDesktop;
    public Boolean isRedeemableFromMobile;
    public Boolean isRedeemableFromPrint;
    public String longDescription;
    public String merchantOfferCode;
    public String merchantSpecifiedData;
    public Long merchantUniqueId;
    public Metadata metadata;
    public Integer mifareApplicationId;
    public Boolean nfcEligible;
    public String nfcOfferCode;
    public Integer offerType;
    public String offerTypeCode;
    public String progressImageUrl;
    public String progressMessage;
    public String providerLogoUrl;
    public String providerName;
    public Integer redemptionState;
    public String redemptionStateMessage;
    public Integer redemptionStrategy;
    public Long redemptionTimeMillis;
    public String shortDescription;
    public String sourceUrl;
    public dTime startDate;
    public String termsAndConditions;
    public String title;

    private o clear()
    {
        id = null;
        metadata = null;
        imageUrl = null;
        title = null;
        shortDescription = null;
        discountAmount = null;
        longDescription = null;
        termsAndConditions = null;
        sourceUrl = null;
        destStore = null;
        expirationDate = null;
        startDate = null;
        merchantSpecifiedData = null;
        archiveTimeMillis = null;
        clipTimeMillis = null;
        redemptionTimeMillis = null;
        offerType = null;
        offerTypeCode = null;
        redemptionStrategy = null;
        nfcEligible = null;
        redemptionState = null;
        redemptionStateMessage = null;
        googleOfferTemplateId = null;
        mifareApplicationId = null;
        merchantOfferCode = null;
        merchantUniqueId = null;
        isMarketplace = null;
        providerName = null;
        providerLogoUrl = null;
        nfcOfferCode = null;
        progressImageUrl = null;
        progressMessage = null;
        isExploding = null;
        explosionDetails = null;
        isRedeemableFromMobile = null;
        isRedeemableFromDesktop = null;
        isRedeemableFromPrint = null;
        acquisitionSource = null;
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

    private  mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L41:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 39: default 328
    //                   0: 337
    //                   10: 339
    //                   18: 368
    //                   26: 379
    //                   34: 390
    //                   42: 401
    //                   50: 412
    //                   58: 423
    //                   66: 434
    //                   74: 445
    //                   82: 474
    //                   90: 503
    //                   98: 532
    //                   128: 543
    //                   136: 557
    //                   144: 571
    //                   152: 585
    //                   160: 642
    //                   168: 702
    //                   176: 716
    //                   186: 778
    //                   194: 789
    //                   200: 818
    //                   210: 832
    //                   218: 843
    //                   225: 872
    //                   232: 886
    //                   242: 900
    //                   250: 911
    //                   258: 922
    //                   266: 933
    //                   274: 944
    //                   280: 973
    //                   290: 987
    //                   298: 998
    //                   304: 1009
    //                   312: 1023
    //                   320: 1037
    //                   330: 1051;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L41; else goto _L2
_L2:
        return this;
_L3:
        if (id == null)
        {
            id = new Identifier();
        }
        codedinputbytebuffernano.readMessage(id);
          goto _L41
_L4:
        imageUrl = codedinputbytebuffernano.readString();
          goto _L41
_L5:
        title = codedinputbytebuffernano.readString();
          goto _L41
_L6:
        shortDescription = codedinputbytebuffernano.readString();
          goto _L41
_L7:
        discountAmount = codedinputbytebuffernano.readString();
          goto _L41
_L8:
        longDescription = codedinputbytebuffernano.readString();
          goto _L41
_L9:
        termsAndConditions = codedinputbytebuffernano.readString();
          goto _L41
_L10:
        sourceUrl = codedinputbytebuffernano.readString();
          goto _L41
_L11:
        if (destStore == null)
        {
            destStore = new <init>();
        }
        codedinputbytebuffernano.readMessage(destStore);
          goto _L41
_L12:
        if (expirationDate == null)
        {
            expirationDate = new dTime();
        }
        codedinputbytebuffernano.readMessage(expirationDate);
          goto _L41
_L13:
        if (startDate == null)
        {
            startDate = new dTime();
        }
        codedinputbytebuffernano.readMessage(startDate);
          goto _L41
_L14:
        merchantSpecifiedData = codedinputbytebuffernano.readString();
          goto _L41
_L15:
        archiveTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L41
_L16:
        clipTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L41
_L17:
        redemptionTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L41
_L18:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            offerType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            redemptionStrategy = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        nfcEligible = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L21:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            redemptionState = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        redemptionStateMessage = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L23:
        if (googleOfferTemplateId == null)
        {
            googleOfferTemplateId = new OfferTemplateId();
        }
        codedinputbytebuffernano.readMessage(googleOfferTemplateId);
        continue; /* Loop/switch isn't completed */
_L24:
        mifareApplicationId = Integer.valueOf(codedinputbytebuffernano.readUInt32());
        continue; /* Loop/switch isn't completed */
_L25:
        merchantOfferCode = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L26:
        if (metadata == null)
        {
            metadata = new Metadata();
        }
        codedinputbytebuffernano.readMessage(metadata);
        continue; /* Loop/switch isn't completed */
_L27:
        merchantUniqueId = Long.valueOf(codedinputbytebuffernano.readFixed64());
        continue; /* Loop/switch isn't completed */
_L28:
        isMarketplace = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L29:
        providerName = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L30:
        providerLogoUrl = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L31:
        nfcOfferCode = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L32:
        progressImageUrl = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L33:
        if (explosionDetails == null)
        {
            explosionDetails = new ExplosionDetails();
        }
        codedinputbytebuffernano.readMessage(explosionDetails);
        continue; /* Loop/switch isn't completed */
_L34:
        isExploding = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L35:
        offerTypeCode = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L36:
        progressMessage = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L37:
        isRedeemableFromMobile = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L38:
        isRedeemableFromDesktop = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L39:
        isRedeemableFromPrint = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L40:
        acquisitionSource = codedinputbytebuffernano.readString();
        if (true) goto _L41; else goto _L42
_L42:
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
        if (imageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, imageUrl);
        }
        i = j;
        if (title != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, title);
        }
        j = i;
        if (shortDescription != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, shortDescription);
        }
        i = j;
        if (discountAmount != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, discountAmount);
        }
        j = i;
        if (longDescription != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, longDescription);
        }
        i = j;
        if (termsAndConditions != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, termsAndConditions);
        }
        j = i;
        if (sourceUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, sourceUrl);
        }
        i = j;
        if (destStore != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, destStore);
        }
        j = i;
        if (expirationDate != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(10, expirationDate);
        }
        i = j;
        if (startDate != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, startDate);
        }
        j = i;
        if (merchantSpecifiedData != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, merchantSpecifiedData);
        }
        i = j;
        if (archiveTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(16, archiveTimeMillis.longValue());
        }
        j = i;
        if (clipTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(17, clipTimeMillis.longValue());
        }
        i = j;
        if (redemptionTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(18, redemptionTimeMillis.longValue());
        }
        j = i;
        if (offerType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(19, offerType.intValue());
        }
        i = j;
        if (redemptionStrategy != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(20, redemptionStrategy.intValue());
        }
        j = i;
        if (nfcEligible != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(21, nfcEligible.booleanValue());
        }
        i = j;
        if (redemptionState != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(22, redemptionState.intValue());
        }
        j = i;
        if (redemptionStateMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(23, redemptionStateMessage);
        }
        i = j;
        if (googleOfferTemplateId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(24, googleOfferTemplateId);
        }
        j = i;
        if (mifareApplicationId != null)
        {
            j = i + CodedOutputByteBufferNano.computeUInt32Size(25, mifareApplicationId.intValue());
        }
        i = j;
        if (merchantOfferCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(26, merchantOfferCode);
        }
        j = i;
        if (metadata != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(27, metadata);
        }
        i = j;
        if (merchantUniqueId != null)
        {
            i = j + CodedOutputByteBufferNano.computeFixed64Size(28, merchantUniqueId.longValue());
        }
        j = i;
        if (isMarketplace != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(29, isMarketplace.booleanValue());
        }
        i = j;
        if (providerName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(30, providerName);
        }
        j = i;
        if (providerLogoUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(31, providerLogoUrl);
        }
        i = j;
        if (nfcOfferCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(32, nfcOfferCode);
        }
        j = i;
        if (progressImageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(33, progressImageUrl);
        }
        i = j;
        if (explosionDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(34, explosionDetails);
        }
        j = i;
        if (isExploding != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(35, isExploding.booleanValue());
        }
        i = j;
        if (offerTypeCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(36, offerTypeCode);
        }
        j = i;
        if (progressMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(37, progressMessage);
        }
        i = j;
        if (isRedeemableFromMobile != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(38, isRedeemableFromMobile.booleanValue());
        }
        j = i;
        if (isRedeemableFromDesktop != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(39, isRedeemableFromDesktop.booleanValue());
        }
        i = j;
        if (isRedeemableFromPrint != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(40, isRedeemableFromPrint.booleanValue());
        }
        j = i;
        if (acquisitionSource != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(41, acquisitionSource);
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
        if (imageUrl != null)
        {
            codedoutputbytebuffernano.writeString(2, imageUrl);
        }
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(3, title);
        }
        if (shortDescription != null)
        {
            codedoutputbytebuffernano.writeString(4, shortDescription);
        }
        if (discountAmount != null)
        {
            codedoutputbytebuffernano.writeString(5, discountAmount);
        }
        if (longDescription != null)
        {
            codedoutputbytebuffernano.writeString(6, longDescription);
        }
        if (termsAndConditions != null)
        {
            codedoutputbytebuffernano.writeString(7, termsAndConditions);
        }
        if (sourceUrl != null)
        {
            codedoutputbytebuffernano.writeString(8, sourceUrl);
        }
        if (destStore != null)
        {
            codedoutputbytebuffernano.writeMessage(9, destStore);
        }
        if (expirationDate != null)
        {
            codedoutputbytebuffernano.writeMessage(10, expirationDate);
        }
        if (startDate != null)
        {
            codedoutputbytebuffernano.writeMessage(11, startDate);
        }
        if (merchantSpecifiedData != null)
        {
            codedoutputbytebuffernano.writeString(12, merchantSpecifiedData);
        }
        if (archiveTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(16, archiveTimeMillis.longValue());
        }
        if (clipTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(17, clipTimeMillis.longValue());
        }
        if (redemptionTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(18, redemptionTimeMillis.longValue());
        }
        if (offerType != null)
        {
            codedoutputbytebuffernano.writeInt32(19, offerType.intValue());
        }
        if (redemptionStrategy != null)
        {
            codedoutputbytebuffernano.writeInt32(20, redemptionStrategy.intValue());
        }
        if (nfcEligible != null)
        {
            codedoutputbytebuffernano.writeBool(21, nfcEligible.booleanValue());
        }
        if (redemptionState != null)
        {
            codedoutputbytebuffernano.writeInt32(22, redemptionState.intValue());
        }
        if (redemptionStateMessage != null)
        {
            codedoutputbytebuffernano.writeString(23, redemptionStateMessage);
        }
        if (googleOfferTemplateId != null)
        {
            codedoutputbytebuffernano.writeMessage(24, googleOfferTemplateId);
        }
        if (mifareApplicationId != null)
        {
            codedoutputbytebuffernano.writeUInt32(25, mifareApplicationId.intValue());
        }
        if (merchantOfferCode != null)
        {
            codedoutputbytebuffernano.writeString(26, merchantOfferCode);
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(27, metadata);
        }
        if (merchantUniqueId != null)
        {
            codedoutputbytebuffernano.writeFixed64(28, merchantUniqueId.longValue());
        }
        if (isMarketplace != null)
        {
            codedoutputbytebuffernano.writeBool(29, isMarketplace.booleanValue());
        }
        if (providerName != null)
        {
            codedoutputbytebuffernano.writeString(30, providerName);
        }
        if (providerLogoUrl != null)
        {
            codedoutputbytebuffernano.writeString(31, providerLogoUrl);
        }
        if (nfcOfferCode != null)
        {
            codedoutputbytebuffernano.writeString(32, nfcOfferCode);
        }
        if (progressImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(33, progressImageUrl);
        }
        if (explosionDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(34, explosionDetails);
        }
        if (isExploding != null)
        {
            codedoutputbytebuffernano.writeBool(35, isExploding.booleanValue());
        }
        if (offerTypeCode != null)
        {
            codedoutputbytebuffernano.writeString(36, offerTypeCode);
        }
        if (progressMessage != null)
        {
            codedoutputbytebuffernano.writeString(37, progressMessage);
        }
        if (isRedeemableFromMobile != null)
        {
            codedoutputbytebuffernano.writeBool(38, isRedeemableFromMobile.booleanValue());
        }
        if (isRedeemableFromDesktop != null)
        {
            codedoutputbytebuffernano.writeBool(39, isRedeemableFromDesktop.booleanValue());
        }
        if (isRedeemableFromPrint != null)
        {
            codedoutputbytebuffernano.writeBool(40, isRedeemableFromPrint.booleanValue());
        }
        if (acquisitionSource != null)
        {
            codedoutputbytebuffernano.writeString(41, acquisitionSource);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ExplosionDetails.clear()
    {
        clear();
    }
}
