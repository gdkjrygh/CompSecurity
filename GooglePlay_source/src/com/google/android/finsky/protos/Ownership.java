// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface Ownership
{
    public static final class OwnershipInfo extends MessageNano
    {

        public boolean autoRenewing;
        public boolean bonus;
        public Common.Docid bundleDocid;
        public Common.SignedData developerPurchaseInfo;
        public GroupLicense.GroupLicenseInfo groupLicenseInfo;
        public boolean hasAutoRenewing;
        public boolean hasBonus;
        public boolean hasHidden;
        public boolean hasInitiationTimestampMsec;
        public boolean hasLibraryExpirationTimestampMsec;
        public boolean hasPostDeliveryRefundWindowMsec;
        public boolean hasPreordered;
        public boolean hasQuantity;
        public boolean hasRefundTimeoutTimestampMsec;
        public boolean hasStoredValidUntilTimestampMsec;
        public boolean hasValidUntilTimestampMsec;
        public boolean hidden;
        public long initiationTimestampMsec;
        public long libraryExpirationTimestampMsec;
        public Voucher.LibraryVoucher libraryVoucher;
        public Common.LicensedDocumentInfo licensedDocumentInfo;
        public long postDeliveryRefundWindowMsec;
        public boolean preordered;
        public int quantity;
        public long refundTimeoutTimestampMsec;
        public Common.RentalTerms rentalTerms;
        public long storedValidUntilTimestampMsec;
        public long validUntilTimestampMsec;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasInitiationTimestampMsec)
                {
                    i = j;
                    if (initiationTimestampMsec == 0L)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, initiationTimestampMsec);
            }
            int k;
label1:
            {
                if (!hasValidUntilTimestampMsec)
                {
                    k = i;
                    if (validUntilTimestampMsec == 0L)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(2, validUntilTimestampMsec);
            }
label2:
            {
                if (!hasAutoRenewing)
                {
                    i = k;
                    if (!autoRenewing)
                    {
                        break label2;
                    }
                }
                i = k + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
            }
label3:
            {
                if (!hasRefundTimeoutTimestampMsec)
                {
                    k = i;
                    if (refundTimeoutTimestampMsec == 0L)
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(4, refundTimeoutTimestampMsec);
            }
label4:
            {
                if (!hasPostDeliveryRefundWindowMsec)
                {
                    i = k;
                    if (postDeliveryRefundWindowMsec == 0L)
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(5, postDeliveryRefundWindowMsec);
            }
label5:
            {
                k = i;
                if (developerPurchaseInfo != null)
                {
                    k = i + CodedOutputByteBufferNano.computeMessageSize(6, developerPurchaseInfo);
                }
                if (!hasPreordered)
                {
                    i = k;
                    if (!preordered)
                    {
                        break label5;
                    }
                }
                i = k + (CodedOutputByteBufferNano.computeTagSize(7) + 1);
            }
label6:
            {
                if (!hasHidden)
                {
                    k = i;
                    if (!hidden)
                    {
                        break label6;
                    }
                }
                k = i + (CodedOutputByteBufferNano.computeTagSize(8) + 1);
            }
label7:
            {
                i = k;
                if (rentalTerms != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(9, rentalTerms);
                }
                k = i;
                if (groupLicenseInfo != null)
                {
                    k = i + CodedOutputByteBufferNano.computeMessageSize(10, groupLicenseInfo);
                }
                i = k;
                if (licensedDocumentInfo != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(11, licensedDocumentInfo);
                }
                if (!hasQuantity)
                {
                    k = i;
                    if (quantity == 1)
                    {
                        break label7;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(12, quantity);
            }
label8:
            {
                if (!hasLibraryExpirationTimestampMsec)
                {
                    i = k;
                    if (libraryExpirationTimestampMsec == 0L)
                    {
                        break label8;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(14, libraryExpirationTimestampMsec);
            }
label9:
            {
                k = i;
                if (libraryVoucher != null)
                {
                    k = i + CodedOutputByteBufferNano.computeMessageSize(15, libraryVoucher);
                }
                i = k;
                if (bundleDocid != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(16, bundleDocid);
                }
                if (!hasBonus)
                {
                    k = i;
                    if (!bonus)
                    {
                        break label9;
                    }
                }
                k = i + (CodedOutputByteBufferNano.computeTagSize(17) + 1);
            }
label10:
            {
                if (!hasStoredValidUntilTimestampMsec)
                {
                    i = k;
                    if (storedValidUntilTimestampMsec == 0L)
                    {
                        break label10;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(18, storedValidUntilTimestampMsec);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    initiationTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                    hasInitiationTimestampMsec = true;
                    break;

                case 16: // '\020'
                    validUntilTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                    hasValidUntilTimestampMsec = true;
                    break;

                case 24: // '\030'
                    autoRenewing = codedinputbytebuffernano.readBool();
                    hasAutoRenewing = true;
                    break;

                case 32: // ' '
                    refundTimeoutTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                    hasRefundTimeoutTimestampMsec = true;
                    break;

                case 40: // '('
                    postDeliveryRefundWindowMsec = codedinputbytebuffernano.readRawVarint64();
                    hasPostDeliveryRefundWindowMsec = true;
                    break;

                case 50: // '2'
                    if (developerPurchaseInfo == null)
                    {
                        developerPurchaseInfo = new Common.SignedData();
                    }
                    codedinputbytebuffernano.readMessage(developerPurchaseInfo);
                    break;

                case 56: // '8'
                    preordered = codedinputbytebuffernano.readBool();
                    hasPreordered = true;
                    break;

                case 64: // '@'
                    hidden = codedinputbytebuffernano.readBool();
                    hasHidden = true;
                    break;

                case 74: // 'J'
                    if (rentalTerms == null)
                    {
                        rentalTerms = new Common.RentalTerms();
                    }
                    codedinputbytebuffernano.readMessage(rentalTerms);
                    break;

                case 82: // 'R'
                    if (groupLicenseInfo == null)
                    {
                        groupLicenseInfo = new GroupLicense.GroupLicenseInfo();
                    }
                    codedinputbytebuffernano.readMessage(groupLicenseInfo);
                    break;

                case 90: // 'Z'
                    if (licensedDocumentInfo == null)
                    {
                        licensedDocumentInfo = new Common.LicensedDocumentInfo();
                    }
                    codedinputbytebuffernano.readMessage(licensedDocumentInfo);
                    break;

                case 96: // '`'
                    quantity = codedinputbytebuffernano.readRawVarint32();
                    hasQuantity = true;
                    break;

                case 112: // 'p'
                    libraryExpirationTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                    hasLibraryExpirationTimestampMsec = true;
                    break;

                case 122: // 'z'
                    if (libraryVoucher == null)
                    {
                        libraryVoucher = new Voucher.LibraryVoucher();
                    }
                    codedinputbytebuffernano.readMessage(libraryVoucher);
                    break;

                case 130: 
                    if (bundleDocid == null)
                    {
                        bundleDocid = new Common.Docid();
                    }
                    codedinputbytebuffernano.readMessage(bundleDocid);
                    break;

                case 136: 
                    bonus = codedinputbytebuffernano.readBool();
                    hasBonus = true;
                    break;

                case 144: 
                    storedValidUntilTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                    hasStoredValidUntilTimestampMsec = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasInitiationTimestampMsec || initiationTimestampMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, initiationTimestampMsec);
            }
            if (hasValidUntilTimestampMsec || validUntilTimestampMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, validUntilTimestampMsec);
            }
            if (hasAutoRenewing || autoRenewing)
            {
                codedoutputbytebuffernano.writeBool(3, autoRenewing);
            }
            if (hasRefundTimeoutTimestampMsec || refundTimeoutTimestampMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, refundTimeoutTimestampMsec);
            }
            if (hasPostDeliveryRefundWindowMsec || postDeliveryRefundWindowMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(5, postDeliveryRefundWindowMsec);
            }
            if (developerPurchaseInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(6, developerPurchaseInfo);
            }
            if (hasPreordered || preordered)
            {
                codedoutputbytebuffernano.writeBool(7, preordered);
            }
            if (hasHidden || hidden)
            {
                codedoutputbytebuffernano.writeBool(8, hidden);
            }
            if (rentalTerms != null)
            {
                codedoutputbytebuffernano.writeMessage(9, rentalTerms);
            }
            if (groupLicenseInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(10, groupLicenseInfo);
            }
            if (licensedDocumentInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(11, licensedDocumentInfo);
            }
            if (hasQuantity || quantity != 1)
            {
                codedoutputbytebuffernano.writeInt32(12, quantity);
            }
            if (hasLibraryExpirationTimestampMsec || libraryExpirationTimestampMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(14, libraryExpirationTimestampMsec);
            }
            if (libraryVoucher != null)
            {
                codedoutputbytebuffernano.writeMessage(15, libraryVoucher);
            }
            if (bundleDocid != null)
            {
                codedoutputbytebuffernano.writeMessage(16, bundleDocid);
            }
            if (hasBonus || bonus)
            {
                codedoutputbytebuffernano.writeBool(17, bonus);
            }
            if (hasStoredValidUntilTimestampMsec || storedValidUntilTimestampMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(18, storedValidUntilTimestampMsec);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OwnershipInfo()
        {
            initiationTimestampMsec = 0L;
            hasInitiationTimestampMsec = false;
            validUntilTimestampMsec = 0L;
            hasValidUntilTimestampMsec = false;
            storedValidUntilTimestampMsec = 0L;
            hasStoredValidUntilTimestampMsec = false;
            autoRenewing = false;
            hasAutoRenewing = false;
            libraryExpirationTimestampMsec = 0L;
            hasLibraryExpirationTimestampMsec = false;
            refundTimeoutTimestampMsec = 0L;
            hasRefundTimeoutTimestampMsec = false;
            postDeliveryRefundWindowMsec = 0L;
            hasPostDeliveryRefundWindowMsec = false;
            developerPurchaseInfo = null;
            preordered = false;
            hasPreordered = false;
            hidden = false;
            hasHidden = false;
            rentalTerms = null;
            groupLicenseInfo = null;
            licensedDocumentInfo = null;
            quantity = 1;
            hasQuantity = false;
            libraryVoucher = null;
            bundleDocid = null;
            bonus = false;
            hasBonus = false;
            cachedSize = -1;
        }
    }

}
