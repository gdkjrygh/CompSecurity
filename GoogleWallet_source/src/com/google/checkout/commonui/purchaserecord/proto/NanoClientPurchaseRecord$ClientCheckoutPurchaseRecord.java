// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public com.google.checkout.customer.purchaserecord.definitions.shared.nvoice billingAddress;
    public String digitalContentMessage[];
    public Boolean isSubscription;
    public pcid legalBuyer;
    public pcid legalMerchant;
    public pcid lineItem[];
    public Boolean mayHaveEuVatInvoice;
    public pcid merchant;
    public String merchantSupportUrl;
    public String merchantTaxId;
    public pcid payment[];
    public com.google.checkout.customer.common.definitions.nId pcid[];
    public com.google.checkout.customer.purchaserecord.definitions.shared.nvoice purchaseLocation;
    public String recurrenceId;
    public com.google.checkout.customer.common.definitions.nId refundedTotal;
    public String shipmentTrackingUrl;
    public com.google.checkout.customer.purchaserecord.definitions.shared.nvoice shippingAddress;
    public com.google.checkout.customer.common.definitions.nId shippingTotal;
    public String statementDisplayName;
    public d statusEvent[];
    public com.google.checkout.customer.cart.definitions. taxDescriptor;
    public String taxRegion;
    public com.google.checkout.customer.common.definitions.nId taxTotal;

    private clear clear()
    {
        merchant = null;
        legalMerchant = null;
        legalBuyer = null;
        payment = payment();
        lineItem = lineItem();
        refundedTotal = null;
        taxTotal = null;
        shippingTotal = null;
        purchaseLocation = null;
        shipmentTrackingUrl = null;
        shippingAddress = null;
        billingAddress = null;
        taxDescriptor = null;
        taxRegion = null;
        merchantTaxId = null;
        statementDisplayName = null;
        merchantSupportUrl = null;
        statusEvent = statusEvent();
        recurrenceId = null;
        isSubscription = null;
        digitalContentMessage = WireFormatNano.EMPTY_STRING_ARRAY;
        mayHaveEuVatInvoice = null;
        pcid = com.google.checkout.customer.common.definitions.nId.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                if (merchant == null)
                {
                    merchant = new merchant();
                }
                codedinputbytebuffernano.readMessage(merchant);
                break;

            case 18: // '\022'
                int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize[];
                int j;
                if (payment == null)
                {
                    j = 0;
                } else
                {
                    j = payment.length;
                }
                acachedsize = new payment[j + k1];
                k1 = j;
                if (j != 0)
                {
                    System.arraycopy(payment, 0, acachedsize, 0, j);
                    k1 = j;
                }
                for (; k1 < acachedsize.length - 1; k1++)
                {
                    acachedsize[k1] = new payment();
                    codedinputbytebuffernano.readMessage(acachedsize[k1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k1] = new payment();
                codedinputbytebuffernano.readMessage(acachedsize[k1]);
                payment = acachedsize;
                break;

            case 26: // '\032'
                int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                cachedSize acachedsize1[];
                int k;
                if (lineItem == null)
                {
                    k = 0;
                } else
                {
                    k = lineItem.length;
                }
                acachedsize1 = new lineItem[k + l1];
                l1 = k;
                if (k != 0)
                {
                    System.arraycopy(lineItem, 0, acachedsize1, 0, k);
                    l1 = k;
                }
                for (; l1 < acachedsize1.length - 1; l1++)
                {
                    acachedsize1[l1] = new lineItem();
                    codedinputbytebuffernano.readMessage(acachedsize1[l1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize1[l1] = new lineItem();
                codedinputbytebuffernano.readMessage(acachedsize1[l1]);
                lineItem = acachedsize1;
                break;

            case 42: // '*'
                if (refundedTotal == null)
                {
                    refundedTotal = new com.google.checkout.customer.common.definitions.d.refundedTotal();
                }
                codedinputbytebuffernano.readMessage(refundedTotal);
                break;

            case 50: // '2'
                if (taxTotal == null)
                {
                    taxTotal = new com.google.checkout.customer.common.definitions.d.taxTotal();
                }
                codedinputbytebuffernano.readMessage(taxTotal);
                break;

            case 66: // 'B'
                if (shippingTotal == null)
                {
                    shippingTotal = new com.google.checkout.customer.common.definitions.d.shippingTotal();
                }
                codedinputbytebuffernano.readMessage(shippingTotal);
                break;

            case 90: // 'Z'
                if (purchaseLocation == null)
                {
                    purchaseLocation = new com.google.checkout.customer.purchaserecord.definitions.shared.ion();
                }
                codedinputbytebuffernano.readMessage(purchaseLocation);
                break;

            case 98: // 'b'
                shipmentTrackingUrl = codedinputbytebuffernano.readString();
                break;

            case 106: // 'j'
                if (shippingAddress == null)
                {
                    shippingAddress = new com.google.checkout.customer.purchaserecord.definitions.shared.ss();
                }
                codedinputbytebuffernano.readMessage(shippingAddress);
                break;

            case 114: // 'r'
                if (billingAddress == null)
                {
                    billingAddress = new com.google.checkout.customer.purchaserecord.definitions.shared.s();
                }
                codedinputbytebuffernano.readMessage(billingAddress);
                break;

            case 122: // 'z'
                if (taxDescriptor == null)
                {
                    taxDescriptor = new com.google.checkout.customer.cart.definitions.ord.taxDescriptor();
                }
                codedinputbytebuffernano.readMessage(taxDescriptor);
                break;

            case 130: 
                statementDisplayName = codedinputbytebuffernano.readString();
                break;

            case 138: 
                merchantSupportUrl = codedinputbytebuffernano.readString();
                break;

            case 154: 
                int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 154);
                cachedSize acachedsize2[];
                int l;
                if (statusEvent == null)
                {
                    l = 0;
                } else
                {
                    l = statusEvent.length;
                }
                acachedsize2 = new statusEvent[l + i2];
                i2 = l;
                if (l != 0)
                {
                    System.arraycopy(statusEvent, 0, acachedsize2, 0, l);
                    i2 = l;
                }
                for (; i2 < acachedsize2.length - 1; i2++)
                {
                    acachedsize2[i2] = new statusEvent();
                    codedinputbytebuffernano.readMessage(acachedsize2[i2]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize2[i2] = new statusEvent();
                codedinputbytebuffernano.readMessage(acachedsize2[i2]);
                statusEvent = acachedsize2;
                break;

            case 162: 
                recurrenceId = codedinputbytebuffernano.readString();
                break;

            case 170: 
                taxRegion = codedinputbytebuffernano.readString();
                break;

            case 176: 
                isSubscription = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 186: 
                int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 186);
                String as[];
                int i1;
                if (digitalContentMessage == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = digitalContentMessage.length;
                }
                as = new String[i1 + j2];
                j2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(digitalContentMessage, 0, as, 0, i1);
                    j2 = i1;
                }
                for (; j2 < as.length - 1; j2++)
                {
                    as[j2] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[j2] = codedinputbytebuffernano.readString();
                digitalContentMessage = as;
                break;

            case 194: 
                merchantTaxId = codedinputbytebuffernano.readString();
                break;

            case 202: 
                if (legalMerchant == null)
                {
                    legalMerchant = new legalMerchant();
                }
                codedinputbytebuffernano.readMessage(legalMerchant);
                break;

            case 210: 
                if (legalBuyer == null)
                {
                    legalBuyer = new legalBuyer();
                }
                codedinputbytebuffernano.readMessage(legalBuyer);
                break;

            case 216: 
                mayHaveEuVatInvoice = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 226: 
                int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 226);
                com.google.checkout.customer.common.definitions.nId anid[];
                int j1;
                if (pcid == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = pcid.length;
                }
                anid = new com.google.checkout.customer.common.definitions.nId[j1 + k2];
                k2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(pcid, 0, anid, 0, j1);
                    k2 = j1;
                }
                for (; k2 < anid.length - 1; k2++)
                {
                    anid[k2] = new com.google.checkout.customer.common.definitions.nId();
                    codedinputbytebuffernano.readMessage(anid[k2]);
                    codedinputbytebuffernano.readTag();
                }

                anid[k2] = new com.google.checkout.customer.common.definitions.nId();
                codedinputbytebuffernano.readMessage(anid[k2]);
                pcid = anid;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (merchant != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, merchant);
        }
        i = j;
        if (payment != null)
        {
            i = j;
            if (payment.length > 0)
            {
                int l = 0;
                do
                {
                    i = j;
                    if (l >= payment.length)
                    {
                        break;
                    }
                    pcid pcid1 = payment[l];
                    i = j;
                    if (pcid1 != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(2, pcid1);
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        j = i;
        if (lineItem != null)
        {
            j = i;
            if (lineItem.length > 0)
            {
                int i1 = 0;
                do
                {
                    j = i;
                    if (i1 >= lineItem.length)
                    {
                        break;
                    }
                    pcid pcid2 = lineItem[i1];
                    j = i;
                    if (pcid2 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, pcid2);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (refundedTotal != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, refundedTotal);
        }
        j = i;
        if (taxTotal != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, taxTotal);
        }
        i = j;
        if (shippingTotal != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(8, shippingTotal);
        }
        j = i;
        if (purchaseLocation != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(11, purchaseLocation);
        }
        i = j;
        if (shipmentTrackingUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(12, shipmentTrackingUrl);
        }
        j = i;
        if (shippingAddress != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(13, shippingAddress);
        }
        i = j;
        if (billingAddress != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(14, billingAddress);
        }
        j = i;
        if (taxDescriptor != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(15, taxDescriptor);
        }
        int j1 = j;
        if (statementDisplayName != null)
        {
            j1 = j + CodedOutputByteBufferNano.computeStringSize(16, statementDisplayName);
        }
        i = j1;
        if (merchantSupportUrl != null)
        {
            i = j1 + CodedOutputByteBufferNano.computeStringSize(17, merchantSupportUrl);
        }
        j = i;
        if (statusEvent != null)
        {
            j = i;
            if (statusEvent.length > 0)
            {
                j1 = 0;
                do
                {
                    j = i;
                    if (j1 >= statusEvent.length)
                    {
                        break;
                    }
                    pcid pcid3 = statusEvent[j1];
                    j = i;
                    if (pcid3 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(19, pcid3);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (recurrenceId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(20, recurrenceId);
        }
        j = i;
        if (taxRegion != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(21, taxRegion);
        }
        i = j;
        if (isSubscription != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(22, isSubscription.booleanValue());
        }
        j = i;
        if (digitalContentMessage != null)
        {
            j = i;
            if (digitalContentMessage.length > 0)
            {
                int l1 = 0;
                j1 = 0;
                for (j = 0; j < digitalContentMessage.length;)
                {
                    String s = digitalContentMessage[j];
                    int i2 = l1;
                    int k1 = j1;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        k1 = j1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    l1 = i2;
                    j1 = k1;
                }

                j = i + j1 + l1 * 2;
            }
        }
        i = j;
        if (merchantTaxId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(24, merchantTaxId);
        }
        j = i;
        if (legalMerchant != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(25, legalMerchant);
        }
        j1 = j;
        if (legalBuyer != null)
        {
            j1 = j + CodedOutputByteBufferNano.computeMessageSize(26, legalBuyer);
        }
        i = j1;
        if (mayHaveEuVatInvoice != null)
        {
            i = j1 + CodedOutputByteBufferNano.computeBoolSize(27, mayHaveEuVatInvoice.booleanValue());
        }
        j1 = i;
        if (pcid != null)
        {
            j1 = i;
            if (pcid.length > 0)
            {
                int k = 0;
                do
                {
                    j1 = i;
                    if (k >= pcid.length)
                    {
                        break;
                    }
                    com.google.checkout.customer.common.definitions.nId nid = pcid[k];
                    j1 = i;
                    if (nid != null)
                    {
                        j1 = i + CodedOutputByteBufferNano.computeMessageSize(28, nid);
                    }
                    k++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (merchant != null)
        {
            codedoutputbytebuffernano.writeMessage(1, merchant);
        }
        if (payment != null && payment.length > 0)
        {
            for (int i = 0; i < payment.length; i++)
            {
                mergeFrom mergefrom = payment[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
                }
            }

        }
        if (lineItem != null && lineItem.length > 0)
        {
            for (int j = 0; j < lineItem.length; j++)
            {
                mergeFrom mergefrom1 = lineItem[j];
                if (mergefrom1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, mergefrom1);
                }
            }

        }
        if (refundedTotal != null)
        {
            codedoutputbytebuffernano.writeMessage(5, refundedTotal);
        }
        if (taxTotal != null)
        {
            codedoutputbytebuffernano.writeMessage(6, taxTotal);
        }
        if (shippingTotal != null)
        {
            codedoutputbytebuffernano.writeMessage(8, shippingTotal);
        }
        if (purchaseLocation != null)
        {
            codedoutputbytebuffernano.writeMessage(11, purchaseLocation);
        }
        if (shipmentTrackingUrl != null)
        {
            codedoutputbytebuffernano.writeString(12, shipmentTrackingUrl);
        }
        if (shippingAddress != null)
        {
            codedoutputbytebuffernano.writeMessage(13, shippingAddress);
        }
        if (billingAddress != null)
        {
            codedoutputbytebuffernano.writeMessage(14, billingAddress);
        }
        if (taxDescriptor != null)
        {
            codedoutputbytebuffernano.writeMessage(15, taxDescriptor);
        }
        if (statementDisplayName != null)
        {
            codedoutputbytebuffernano.writeString(16, statementDisplayName);
        }
        if (merchantSupportUrl != null)
        {
            codedoutputbytebuffernano.writeString(17, merchantSupportUrl);
        }
        if (statusEvent != null && statusEvent.length > 0)
        {
            for (int k = 0; k < statusEvent.length; k++)
            {
                mergeFrom mergefrom2 = statusEvent[k];
                if (mergefrom2 != null)
                {
                    codedoutputbytebuffernano.writeMessage(19, mergefrom2);
                }
            }

        }
        if (recurrenceId != null)
        {
            codedoutputbytebuffernano.writeString(20, recurrenceId);
        }
        if (taxRegion != null)
        {
            codedoutputbytebuffernano.writeString(21, taxRegion);
        }
        if (isSubscription != null)
        {
            codedoutputbytebuffernano.writeBool(22, isSubscription.booleanValue());
        }
        if (digitalContentMessage != null && digitalContentMessage.length > 0)
        {
            for (int l = 0; l < digitalContentMessage.length; l++)
            {
                String s = digitalContentMessage[l];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(23, s);
                }
            }

        }
        if (merchantTaxId != null)
        {
            codedoutputbytebuffernano.writeString(24, merchantTaxId);
        }
        if (legalMerchant != null)
        {
            codedoutputbytebuffernano.writeMessage(25, legalMerchant);
        }
        if (legalBuyer != null)
        {
            codedoutputbytebuffernano.writeMessage(26, legalBuyer);
        }
        if (mayHaveEuVatInvoice != null)
        {
            codedoutputbytebuffernano.writeBool(27, mayHaveEuVatInvoice.booleanValue());
        }
        if (pcid != null && pcid.length > 0)
        {
            for (int i1 = 0; i1 < pcid.length; i1++)
            {
                com.google.checkout.customer.common.definitions.nId nid = pcid[i1];
                if (nid != null)
                {
                    codedoutputbytebuffernano.writeMessage(28, nid);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public d()
    {
        clear();
    }
}
