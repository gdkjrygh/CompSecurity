// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoClientPurchaseRecord
{
    public static final class ClientAdjustmentPurchaseRecord extends ExtendableMessageNano
    {

        public String description;
        public Payment instrument[];

        private ClientAdjustmentPurchaseRecord clear()
        {
            description = null;
            instrument = Payment.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientAdjustmentPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    description = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    Payment apayment[];
                    int j;
                    if (instrument == null)
                    {
                        j = 0;
                    } else
                    {
                        j = instrument.length;
                    }
                    apayment = new Payment[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(instrument, 0, apayment, 0, j);
                        k = j;
                    }
                    for (; k < apayment.length - 1; k++)
                    {
                        apayment[k] = new Payment();
                        codedinputbytebuffernano.readMessage(apayment[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    apayment[k] = new Payment();
                    codedinputbytebuffernano.readMessage(apayment[k]);
                    instrument = apayment;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
            }
            int l = i;
            if (instrument != null)
            {
                l = i;
                if (instrument.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= instrument.length)
                        {
                            break;
                        }
                        Payment payment = instrument[k];
                        l = i;
                        if (payment != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, payment);
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            if (instrument != null && instrument.length > 0)
            {
                for (int i = 0; i < instrument.length; i++)
                {
                    Payment payment = instrument[i];
                    if (payment != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, payment);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientAdjustmentPurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientBillingPaymentPurchaseRecord extends ExtendableMessageNano
    {

        public String description;
        public Payment instrument;
        public String internalAccountId;
        public LineItem lineItem[];
        public ClientEvent paymentEvent[];

        private ClientBillingPaymentPurchaseRecord clear()
        {
            internalAccountId = null;
            description = null;
            instrument = null;
            lineItem = LineItem.emptyArray();
            paymentEvent = ClientEvent.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientBillingPaymentPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    internalAccountId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (instrument == null)
                    {
                        instrument = new Payment();
                    }
                    codedinputbytebuffernano.readMessage(instrument);
                    break;

                case 34: // '"'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    LineItem alineitem[];
                    int j;
                    if (lineItem == null)
                    {
                        j = 0;
                    } else
                    {
                        j = lineItem.length;
                    }
                    alineitem = new LineItem[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(lineItem, 0, alineitem, 0, j);
                        l = j;
                    }
                    for (; l < alineitem.length - 1; l++)
                    {
                        alineitem[l] = new LineItem();
                        codedinputbytebuffernano.readMessage(alineitem[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    alineitem[l] = new LineItem();
                    codedinputbytebuffernano.readMessage(alineitem[l]);
                    lineItem = alineitem;
                    break;

                case 42: // '*'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    ClientEvent aclientevent[];
                    int k;
                    if (paymentEvent == null)
                    {
                        k = 0;
                    } else
                    {
                        k = paymentEvent.length;
                    }
                    aclientevent = new ClientEvent[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(paymentEvent, 0, aclientevent, 0, k);
                        i1 = k;
                    }
                    for (; i1 < aclientevent.length - 1; i1++)
                    {
                        aclientevent[i1] = new ClientEvent();
                        codedinputbytebuffernano.readMessage(aclientevent[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    aclientevent[i1] = new ClientEvent();
                    codedinputbytebuffernano.readMessage(aclientevent[i1]);
                    paymentEvent = aclientevent;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (internalAccountId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, internalAccountId);
            }
            int l = i;
            if (description != null)
            {
                l = i + CodedOutputByteBufferNano.computeStringSize(2, description);
            }
            j = l;
            if (instrument != null)
            {
                j = l + CodedOutputByteBufferNano.computeMessageSize(3, instrument);
            }
            i = j;
            if (lineItem != null)
            {
                i = j;
                if (lineItem.length > 0)
                {
                    l = 0;
                    do
                    {
                        i = j;
                        if (l >= lineItem.length)
                        {
                            break;
                        }
                        LineItem lineitem = lineItem[l];
                        i = j;
                        if (lineitem != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(4, lineitem);
                        }
                        l++;
                        j = i;
                    } while (true);
                }
            }
            l = i;
            if (paymentEvent != null)
            {
                l = i;
                if (paymentEvent.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= paymentEvent.length)
                        {
                            break;
                        }
                        ClientEvent clientevent = paymentEvent[k];
                        l = i;
                        if (clientevent != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(5, clientevent);
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
            if (internalAccountId != null)
            {
                codedoutputbytebuffernano.writeString(1, internalAccountId);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(2, description);
            }
            if (instrument != null)
            {
                codedoutputbytebuffernano.writeMessage(3, instrument);
            }
            if (lineItem != null && lineItem.length > 0)
            {
                for (int i = 0; i < lineItem.length; i++)
                {
                    LineItem lineitem = lineItem[i];
                    if (lineitem != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, lineitem);
                    }
                }

            }
            if (paymentEvent != null && paymentEvent.length > 0)
            {
                for (int j = 0; j < paymentEvent.length; j++)
                {
                    ClientEvent clientevent = paymentEvent[j];
                    if (clientevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, clientevent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientBillingPaymentPurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientCashWithdrawalPurchaseRecord extends ExtendableMessageNano
    {

        public FeeInfo feeInfo;
        public Party merchant;
        public Payment payment;

        private ClientCashWithdrawalPurchaseRecord clear()
        {
            merchant = null;
            payment = null;
            feeInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientCashWithdrawalPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        merchant = new Party();
                    }
                    codedinputbytebuffernano.readMessage(merchant);
                    break;

                case 18: // '\022'
                    if (payment == null)
                    {
                        payment = new Payment();
                    }
                    codedinputbytebuffernano.readMessage(payment);
                    break;

                case 26: // '\032'
                    if (feeInfo == null)
                    {
                        feeInfo = new FeeInfo();
                    }
                    codedinputbytebuffernano.readMessage(feeInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (merchant != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, merchant);
            }
            j = i;
            if (payment != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, payment);
            }
            i = j;
            if (feeInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, feeInfo);
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
            if (merchant != null)
            {
                codedoutputbytebuffernano.writeMessage(1, merchant);
            }
            if (payment != null)
            {
                codedoutputbytebuffernano.writeMessage(2, payment);
            }
            if (feeInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, feeInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientCashWithdrawalPurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientCheckoutPurchaseRecord extends ExtendableMessageNano
    {

        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address billingAddress;
        public String digitalContentMessage[];
        public Boolean isSubscription;
        public Party legalBuyer;
        public Party legalMerchant;
        public LineItem lineItem[];
        public Boolean mayHaveEuVatInvoice;
        public Party merchant;
        public String merchantSupportUrl;
        public String merchantTaxId;
        public Payment payment[];
        public com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId pcid[];
        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseLocation.PurchaseLocation purchaseLocation;
        public String recurrenceId;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money refundedTotal;
        public String shipmentTrackingUrl;
        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address shippingAddress;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money shippingTotal;
        public String statementDisplayName;
        public ClientEvent statusEvent[];
        public com.google.checkout.customer.cart.definitions.NanoTaxDescriptor.TaxDescriptor taxDescriptor;
        public String taxRegion;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money taxTotal;

        private ClientCheckoutPurchaseRecord clear()
        {
            merchant = null;
            legalMerchant = null;
            legalBuyer = null;
            payment = Payment.emptyArray();
            lineItem = LineItem.emptyArray();
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
            statusEvent = ClientEvent.emptyArray();
            recurrenceId = null;
            isSubscription = null;
            digitalContentMessage = WireFormatNano.EMPTY_STRING_ARRAY;
            mayHaveEuVatInvoice = null;
            pcid = com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientCheckoutPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        merchant = new Party();
                    }
                    codedinputbytebuffernano.readMessage(merchant);
                    break;

                case 18: // '\022'
                    int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    Payment apayment[];
                    int j;
                    if (payment == null)
                    {
                        j = 0;
                    } else
                    {
                        j = payment.length;
                    }
                    apayment = new Payment[j + k1];
                    k1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(payment, 0, apayment, 0, j);
                        k1 = j;
                    }
                    for (; k1 < apayment.length - 1; k1++)
                    {
                        apayment[k1] = new Payment();
                        codedinputbytebuffernano.readMessage(apayment[k1]);
                        codedinputbytebuffernano.readTag();
                    }

                    apayment[k1] = new Payment();
                    codedinputbytebuffernano.readMessage(apayment[k1]);
                    payment = apayment;
                    break;

                case 26: // '\032'
                    int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    LineItem alineitem[];
                    int k;
                    if (lineItem == null)
                    {
                        k = 0;
                    } else
                    {
                        k = lineItem.length;
                    }
                    alineitem = new LineItem[k + l1];
                    l1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(lineItem, 0, alineitem, 0, k);
                        l1 = k;
                    }
                    for (; l1 < alineitem.length - 1; l1++)
                    {
                        alineitem[l1] = new LineItem();
                        codedinputbytebuffernano.readMessage(alineitem[l1]);
                        codedinputbytebuffernano.readTag();
                    }

                    alineitem[l1] = new LineItem();
                    codedinputbytebuffernano.readMessage(alineitem[l1]);
                    lineItem = alineitem;
                    break;

                case 42: // '*'
                    if (refundedTotal == null)
                    {
                        refundedTotal = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(refundedTotal);
                    break;

                case 50: // '2'
                    if (taxTotal == null)
                    {
                        taxTotal = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(taxTotal);
                    break;

                case 66: // 'B'
                    if (shippingTotal == null)
                    {
                        shippingTotal = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(shippingTotal);
                    break;

                case 90: // 'Z'
                    if (purchaseLocation == null)
                    {
                        purchaseLocation = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseLocation.PurchaseLocation();
                    }
                    codedinputbytebuffernano.readMessage(purchaseLocation);
                    break;

                case 98: // 'b'
                    shipmentTrackingUrl = codedinputbytebuffernano.readString();
                    break;

                case 106: // 'j'
                    if (shippingAddress == null)
                    {
                        shippingAddress = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address();
                    }
                    codedinputbytebuffernano.readMessage(shippingAddress);
                    break;

                case 114: // 'r'
                    if (billingAddress == null)
                    {
                        billingAddress = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address();
                    }
                    codedinputbytebuffernano.readMessage(billingAddress);
                    break;

                case 122: // 'z'
                    if (taxDescriptor == null)
                    {
                        taxDescriptor = new com.google.checkout.customer.cart.definitions.NanoTaxDescriptor.TaxDescriptor();
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
                    ClientEvent aclientevent[];
                    int l;
                    if (statusEvent == null)
                    {
                        l = 0;
                    } else
                    {
                        l = statusEvent.length;
                    }
                    aclientevent = new ClientEvent[l + i2];
                    i2 = l;
                    if (l != 0)
                    {
                        System.arraycopy(statusEvent, 0, aclientevent, 0, l);
                        i2 = l;
                    }
                    for (; i2 < aclientevent.length - 1; i2++)
                    {
                        aclientevent[i2] = new ClientEvent();
                        codedinputbytebuffernano.readMessage(aclientevent[i2]);
                        codedinputbytebuffernano.readTag();
                    }

                    aclientevent[i2] = new ClientEvent();
                    codedinputbytebuffernano.readMessage(aclientevent[i2]);
                    statusEvent = aclientevent;
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
                        legalMerchant = new Party();
                    }
                    codedinputbytebuffernano.readMessage(legalMerchant);
                    break;

                case 210: 
                    if (legalBuyer == null)
                    {
                        legalBuyer = new Party();
                    }
                    codedinputbytebuffernano.readMessage(legalBuyer);
                    break;

                case 216: 
                    mayHaveEuVatInvoice = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 226: 
                    int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 226);
                    com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId acommonproductcorrelationid[];
                    int j1;
                    if (pcid == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = pcid.length;
                    }
                    acommonproductcorrelationid = new com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId[j1 + k2];
                    k2 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(pcid, 0, acommonproductcorrelationid, 0, j1);
                        k2 = j1;
                    }
                    for (; k2 < acommonproductcorrelationid.length - 1; k2++)
                    {
                        acommonproductcorrelationid[k2] = new com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId();
                        codedinputbytebuffernano.readMessage(acommonproductcorrelationid[k2]);
                        codedinputbytebuffernano.readTag();
                    }

                    acommonproductcorrelationid[k2] = new com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId();
                    codedinputbytebuffernano.readMessage(acommonproductcorrelationid[k2]);
                    pcid = acommonproductcorrelationid;
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
                        Payment payment1 = payment[l];
                        i = j;
                        if (payment1 != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(2, payment1);
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
                        LineItem lineitem = lineItem[i1];
                        j = i;
                        if (lineitem != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, lineitem);
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
                        ClientEvent clientevent = statusEvent[j1];
                        j = i;
                        if (clientevent != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(19, clientevent);
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
                        com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId commonproductcorrelationid = pcid[k];
                        j1 = i;
                        if (commonproductcorrelationid != null)
                        {
                            j1 = i + CodedOutputByteBufferNano.computeMessageSize(28, commonproductcorrelationid);
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
                    Payment payment1 = payment[i];
                    if (payment1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, payment1);
                    }
                }

            }
            if (lineItem != null && lineItem.length > 0)
            {
                for (int j = 0; j < lineItem.length; j++)
                {
                    LineItem lineitem = lineItem[j];
                    if (lineitem != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, lineitem);
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
                    ClientEvent clientevent = statusEvent[k];
                    if (clientevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(19, clientevent);
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
                    com.google.checkout.customer.common.definitions.NanoCommonProductCorrelationId.CommonProductCorrelationId commonproductcorrelationid = pcid[i1];
                    if (commonproductcorrelationid != null)
                    {
                        codedoutputbytebuffernano.writeMessage(28, commonproductcorrelationid);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientCheckoutPurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientEvent extends ExtendableMessageNano
    {

        private static volatile ClientEvent _emptyArray[];
        public String detail[];
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime eventTime;
        public Shipment shipment;

        private ClientEvent clear()
        {
            eventTime = null;
            detail = WireFormatNano.EMPTY_STRING_ARRAY;
            shipment = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ClientEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ClientEvent[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ClientEvent mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (eventTime == null)
                    {
                        eventTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
                    }
                    codedinputbytebuffernano.readMessage(eventTime);
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    String as[];
                    int j;
                    if (detail == null)
                    {
                        j = 0;
                    } else
                    {
                        j = detail.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(detail, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    detail = as;
                    break;

                case 42: // '*'
                    if (shipment == null)
                    {
                        shipment = new Shipment();
                    }
                    codedinputbytebuffernano.readMessage(shipment);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (eventTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, eventTime);
            }
            j = i;
            if (detail != null)
            {
                j = i;
                if (detail.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < detail.length;)
                    {
                        String s = detail[j];
                        int j1 = i1;
                        int l = k;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        i1 = j1;
                        k = l;
                    }

                    j = i + k + i1 * 1;
                }
            }
            i = j;
            if (shipment != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, shipment);
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
            if (eventTime != null)
            {
                codedoutputbytebuffernano.writeMessage(1, eventTime);
            }
            if (detail != null && detail.length > 0)
            {
                for (int i = 0; i < detail.length; i++)
                {
                    String s = detail[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(4, s);
                    }
                }

            }
            if (shipment != null)
            {
                codedoutputbytebuffernano.writeMessage(5, shipment);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientEvent()
        {
            clear();
        }
    }

    public static final class ClientIncentivePaymentPurchaseRecord extends ExtendableMessageNano
    {

        public String description;
        public Payment destination;
        public String title;

        private ClientIncentivePaymentPurchaseRecord clear()
        {
            title = null;
            description = null;
            destination = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientIncentivePaymentPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    title = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (destination == null)
                    {
                        destination = new Payment();
                    }
                    codedinputbytebuffernano.readMessage(destination);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (title != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
            }
            i = j;
            if (destination != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, destination);
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
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(2, description);
            }
            if (destination != null)
            {
                codedoutputbytebuffernano.writeMessage(3, destination);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientIncentivePaymentPurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientP2pMoneyRequestRecord extends ExtendableMessageNano
    {

        public String description;
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime lastReminderTime;
        public Party requestee;
        public Party requester;
        public String requesterMessage;
        public String themeImageUrl;

        private ClientP2pMoneyRequestRecord clear()
        {
            requester = null;
            requestee = null;
            requesterMessage = null;
            description = null;
            lastReminderTime = null;
            themeImageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientP2pMoneyRequestRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (requester == null)
                    {
                        requester = new Party();
                    }
                    codedinputbytebuffernano.readMessage(requester);
                    break;

                case 18: // '\022'
                    if (requestee == null)
                    {
                        requestee = new Party();
                    }
                    codedinputbytebuffernano.readMessage(requestee);
                    break;

                case 26: // '\032'
                    requesterMessage = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    if (lastReminderTime == null)
                    {
                        lastReminderTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
                    }
                    codedinputbytebuffernano.readMessage(lastReminderTime);
                    break;

                case 50: // '2'
                    themeImageUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (requester != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, requester);
            }
            j = i;
            if (requestee != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, requestee);
            }
            i = j;
            if (requesterMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, requesterMessage);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, description);
            }
            i = j;
            if (lastReminderTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, lastReminderTime);
            }
            j = i;
            if (themeImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, themeImageUrl);
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
            if (requester != null)
            {
                codedoutputbytebuffernano.writeMessage(1, requester);
            }
            if (requestee != null)
            {
                codedoutputbytebuffernano.writeMessage(2, requestee);
            }
            if (requesterMessage != null)
            {
                codedoutputbytebuffernano.writeString(3, requesterMessage);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(4, description);
            }
            if (lastReminderTime != null)
            {
                codedoutputbytebuffernano.writeMessage(5, lastReminderTime);
            }
            if (themeImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(6, themeImageUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientP2pMoneyRequestRecord()
        {
            clear();
        }
    }

    public static final class ClientP2pPurchaseRecord extends ExtendableMessageNano
    {

        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime autoRejectTime;
        public Boolean canClaim;
        public Boolean canReturn;
        public Party counterParty;
        public String description;
        public FeeInfo feeInfo;
        public Party party;
        public Payment payment[];
        public com.google.checkout.customer.purchaserecord.definitions.NanoP2pDetails.P2pDetails.P2pMoneyRequestInfo requestInfo;
        public String senderMessage;
        public String themeImageUrl;

        private ClientP2pPurchaseRecord clear()
        {
            counterParty = null;
            party = null;
            payment = Payment.emptyArray();
            description = null;
            senderMessage = null;
            autoRejectTime = null;
            canReturn = null;
            canClaim = null;
            feeInfo = null;
            themeImageUrl = null;
            requestInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientP2pPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (counterParty == null)
                    {
                        counterParty = new Party();
                    }
                    codedinputbytebuffernano.readMessage(counterParty);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    Payment apayment[];
                    int j;
                    if (payment == null)
                    {
                        j = 0;
                    } else
                    {
                        j = payment.length;
                    }
                    apayment = new Payment[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(payment, 0, apayment, 0, j);
                        k = j;
                    }
                    for (; k < apayment.length - 1; k++)
                    {
                        apayment[k] = new Payment();
                        codedinputbytebuffernano.readMessage(apayment[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    apayment[k] = new Payment();
                    codedinputbytebuffernano.readMessage(apayment[k]);
                    payment = apayment;
                    break;

                case 26: // '\032'
                    senderMessage = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    if (autoRejectTime == null)
                    {
                        autoRejectTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
                    }
                    codedinputbytebuffernano.readMessage(autoRejectTime);
                    break;

                case 104: // 'h'
                    canReturn = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 112: // 'p'
                    canClaim = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 122: // 'z'
                    if (party == null)
                    {
                        party = new Party();
                    }
                    codedinputbytebuffernano.readMessage(party);
                    break;

                case 130: 
                    description = codedinputbytebuffernano.readString();
                    break;

                case 138: 
                    if (feeInfo == null)
                    {
                        feeInfo = new FeeInfo();
                    }
                    codedinputbytebuffernano.readMessage(feeInfo);
                    break;

                case 146: 
                    themeImageUrl = codedinputbytebuffernano.readString();
                    break;

                case 162: 
                    if (requestInfo == null)
                    {
                        requestInfo = new com.google.checkout.customer.purchaserecord.definitions.NanoP2pDetails.P2pDetails.P2pMoneyRequestInfo();
                    }
                    codedinputbytebuffernano.readMessage(requestInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (counterParty != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, counterParty);
            }
            j = i;
            if (payment != null)
            {
                j = i;
                if (payment.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= payment.length)
                        {
                            break;
                        }
                        Payment payment1 = payment[k];
                        j = i;
                        if (payment1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, payment1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (senderMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, senderMessage);
            }
            j = i;
            if (autoRejectTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, autoRejectTime);
            }
            i = j;
            if (canReturn != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(13, canReturn.booleanValue());
            }
            j = i;
            if (canClaim != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(14, canClaim.booleanValue());
            }
            i = j;
            if (party != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(15, party);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(16, description);
            }
            i = j;
            if (feeInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(17, feeInfo);
            }
            j = i;
            if (themeImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(18, themeImageUrl);
            }
            i = j;
            if (requestInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(20, requestInfo);
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
            if (counterParty != null)
            {
                codedoutputbytebuffernano.writeMessage(1, counterParty);
            }
            if (payment != null && payment.length > 0)
            {
                for (int i = 0; i < payment.length; i++)
                {
                    Payment payment1 = payment[i];
                    if (payment1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, payment1);
                    }
                }

            }
            if (senderMessage != null)
            {
                codedoutputbytebuffernano.writeString(3, senderMessage);
            }
            if (autoRejectTime != null)
            {
                codedoutputbytebuffernano.writeMessage(6, autoRejectTime);
            }
            if (canReturn != null)
            {
                codedoutputbytebuffernano.writeBool(13, canReturn.booleanValue());
            }
            if (canClaim != null)
            {
                codedoutputbytebuffernano.writeBool(14, canClaim.booleanValue());
            }
            if (party != null)
            {
                codedoutputbytebuffernano.writeMessage(15, party);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(16, description);
            }
            if (feeInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(17, feeInfo);
            }
            if (themeImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(18, themeImageUrl);
            }
            if (requestInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(20, requestInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientP2pPurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientPurchaseRecord extends ExtendableMessageNano
    {

        private static volatile ClientPurchaseRecord _emptyArray[];
        public NanoCommon.ActionRenderable actionRenderable[];
        public ClientAdjustmentPurchaseRecord adjustmentDetails;
        public NanoView.BasicView basicView;
        public ClientBillingPaymentPurchaseRecord billingPaymentDetails;
        public ClientCashWithdrawalPurchaseRecord cashWithdrawalDetails;
        public ClientCheckoutPurchaseRecord checkoutDetails;
        public Integer creditDebit;
        public Long generationId;
        public String id;
        public ClientIncentivePaymentPurchaseRecord incentivePaymentDetails;
        public ClientP2pMoneyRequestRecord moneyRequestDetails;
        public ClientP2pPurchaseRecord p2PDetails;
        public Boolean pending;
        public String purchaseRecordLookupId;
        public com.google.wallet.proto.NanoWalletWobl.RenderOutput renderOutput;
        public RenderedStatus renderedStatus;
        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseRecordStatus.PurchaseRecordStatus status;
        public ClientStoredValuePurchaseRecord storedValueDetails;
        public ClientTorinoPurchaseRecord torinoDetails;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money totalAmount;
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime transactionTime;
        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseRecordType.PurchaseRecordType type;
        public String typeDetails;
        public String typeName;
        public String typeStatusSummary;
        public String userEnteredNotes;
        public String userVisibleTransactionId;
        public Long version;

        private ClientPurchaseRecord clear()
        {
            version = null;
            purchaseRecordLookupId = null;
            generationId = null;
            type = null;
            typeName = null;
            typeStatusSummary = null;
            typeDetails = null;
            transactionTime = null;
            totalAmount = null;
            creditDebit = null;
            pending = null;
            status = null;
            renderedStatus = null;
            basicView = null;
            renderOutput = null;
            actionRenderable = NanoCommon.ActionRenderable.emptyArray();
            userEnteredNotes = null;
            userVisibleTransactionId = null;
            id = null;
            torinoDetails = null;
            p2PDetails = null;
            checkoutDetails = null;
            storedValueDetails = null;
            adjustmentDetails = null;
            cashWithdrawalDetails = null;
            moneyRequestDetails = null;
            billingPaymentDetails = null;
            incentivePaymentDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ClientPurchaseRecord[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ClientPurchaseRecord[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ClientPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L31:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 29: default 248
        //                       0: 257
        //                       8: 259
        //                       18: 273
        //                       24: 284
        //                       34: 298
        //                       42: 327
        //                       50: 356
        //                       58: 385
        //                       74: 414
        //                       82: 425
        //                       88: 436
        //                       96: 478
        //                       106: 492
        //                       122: 503
        //                       130: 532
        //                       138: 543
        //                       146: 572
        //                       154: 601
        //                       162: 726
        //                       170: 737
        //                       8002: 748
        //                       8010: 777
        //                       8018: 806
        //                       8026: 835
        //                       8034: 864
        //                       8042: 893
        //                       8058: 922
        //                       8066: 951
        //                       8074: 980;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L31; else goto _L2
_L2:
            return this;
_L3:
            version = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L31
_L4:
            purchaseRecordLookupId = codedinputbytebuffernano.readString();
              goto _L31
_L5:
            generationId = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L31
_L6:
            if (type == null)
            {
                type = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseRecordType.PurchaseRecordType();
            }
            codedinputbytebuffernano.readMessage(type);
              goto _L31
_L7:
            if (transactionTime == null)
            {
                transactionTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
            }
            codedinputbytebuffernano.readMessage(transactionTime);
              goto _L31
_L8:
            if (totalAmount == null)
            {
                totalAmount = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
            }
            codedinputbytebuffernano.readMessage(totalAmount);
              goto _L31
_L9:
            if (basicView == null)
            {
                basicView = new NanoView.BasicView();
            }
            codedinputbytebuffernano.readMessage(basicView);
              goto _L31
_L10:
            userEnteredNotes = codedinputbytebuffernano.readString();
              goto _L31
_L11:
            userVisibleTransactionId = codedinputbytebuffernano.readString();
              goto _L31
_L12:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                creditDebit = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L13:
            pending = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L14:
            typeName = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L15:
            if (status == null)
            {
                status = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseRecordStatus.PurchaseRecordStatus();
            }
            codedinputbytebuffernano.readMessage(status);
            continue; /* Loop/switch isn't completed */
_L16:
            typeStatusSummary = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L17:
            if (renderedStatus == null)
            {
                renderedStatus = new RenderedStatus();
            }
            codedinputbytebuffernano.readMessage(renderedStatus);
            continue; /* Loop/switch isn't completed */
_L18:
            if (renderOutput == null)
            {
                renderOutput = new com.google.wallet.proto.NanoWalletWobl.RenderOutput();
            }
            codedinputbytebuffernano.readMessage(renderOutput);
            continue; /* Loop/switch isn't completed */
_L19:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 154);
            NanoCommon.ActionRenderable aactionrenderable[];
            int k;
            if (actionRenderable == null)
            {
                k = 0;
            } else
            {
                k = actionRenderable.length;
            }
            aactionrenderable = new NanoCommon.ActionRenderable[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(actionRenderable, 0, aactionrenderable, 0, k);
                l = k;
            }
            for (; l < aactionrenderable.length - 1; l++)
            {
                aactionrenderable[l] = new NanoCommon.ActionRenderable();
                codedinputbytebuffernano.readMessage(aactionrenderable[l]);
                codedinputbytebuffernano.readTag();
            }

            aactionrenderable[l] = new NanoCommon.ActionRenderable();
            codedinputbytebuffernano.readMessage(aactionrenderable[l]);
            actionRenderable = aactionrenderable;
            continue; /* Loop/switch isn't completed */
_L20:
            typeDetails = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L21:
            id = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L22:
            if (torinoDetails == null)
            {
                torinoDetails = new ClientTorinoPurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(torinoDetails);
            continue; /* Loop/switch isn't completed */
_L23:
            if (p2PDetails == null)
            {
                p2PDetails = new ClientP2pPurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(p2PDetails);
            continue; /* Loop/switch isn't completed */
_L24:
            if (checkoutDetails == null)
            {
                checkoutDetails = new ClientCheckoutPurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(checkoutDetails);
            continue; /* Loop/switch isn't completed */
_L25:
            if (storedValueDetails == null)
            {
                storedValueDetails = new ClientStoredValuePurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(storedValueDetails);
            continue; /* Loop/switch isn't completed */
_L26:
            if (adjustmentDetails == null)
            {
                adjustmentDetails = new ClientAdjustmentPurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(adjustmentDetails);
            continue; /* Loop/switch isn't completed */
_L27:
            if (cashWithdrawalDetails == null)
            {
                cashWithdrawalDetails = new ClientCashWithdrawalPurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(cashWithdrawalDetails);
            continue; /* Loop/switch isn't completed */
_L28:
            if (moneyRequestDetails == null)
            {
                moneyRequestDetails = new ClientP2pMoneyRequestRecord();
            }
            codedinputbytebuffernano.readMessage(moneyRequestDetails);
            continue; /* Loop/switch isn't completed */
_L29:
            if (billingPaymentDetails == null)
            {
                billingPaymentDetails = new ClientBillingPaymentPurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(billingPaymentDetails);
            continue; /* Loop/switch isn't completed */
_L30:
            if (incentivePaymentDetails == null)
            {
                incentivePaymentDetails = new ClientIncentivePaymentPurchaseRecord();
            }
            codedinputbytebuffernano.readMessage(incentivePaymentDetails);
            if (true) goto _L31; else goto _L32
_L32:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (version != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, version.longValue());
            }
            j = i;
            if (purchaseRecordLookupId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, purchaseRecordLookupId);
            }
            i = j;
            if (generationId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, generationId.longValue());
            }
            j = i;
            if (type != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, type);
            }
            i = j;
            if (transactionTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, transactionTime);
            }
            j = i;
            if (totalAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, totalAmount);
            }
            i = j;
            if (basicView != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, basicView);
            }
            j = i;
            if (userEnteredNotes != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(9, userEnteredNotes);
            }
            i = j;
            if (userVisibleTransactionId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(10, userVisibleTransactionId);
            }
            j = i;
            if (creditDebit != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(11, creditDebit.intValue());
            }
            i = j;
            if (pending != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(12, pending.booleanValue());
            }
            j = i;
            if (typeName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(13, typeName);
            }
            i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(15, status);
            }
            j = i;
            if (typeStatusSummary != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(16, typeStatusSummary);
            }
            int k = j;
            if (renderedStatus != null)
            {
                k = j + CodedOutputByteBufferNano.computeMessageSize(17, renderedStatus);
            }
            i = k;
            if (renderOutput != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(18, renderOutput);
            }
            j = i;
            if (actionRenderable != null)
            {
                j = i;
                if (actionRenderable.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= actionRenderable.length)
                        {
                            break;
                        }
                        NanoCommon.ActionRenderable actionrenderable = actionRenderable[l];
                        j = i;
                        if (actionrenderable != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(19, actionrenderable);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (typeDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(20, typeDetails);
            }
            j = i;
            if (id != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(21, id);
            }
            i = j;
            if (torinoDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1000, torinoDetails);
            }
            j = i;
            if (p2PDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1001, p2PDetails);
            }
            i = j;
            if (checkoutDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1002, checkoutDetails);
            }
            j = i;
            if (storedValueDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1003, storedValueDetails);
            }
            i = j;
            if (adjustmentDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1004, adjustmentDetails);
            }
            j = i;
            if (cashWithdrawalDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1005, cashWithdrawalDetails);
            }
            i = j;
            if (moneyRequestDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1007, moneyRequestDetails);
            }
            j = i;
            if (billingPaymentDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1008, billingPaymentDetails);
            }
            i = j;
            if (incentivePaymentDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1009, incentivePaymentDetails);
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
            if (version != null)
            {
                codedoutputbytebuffernano.writeInt64(1, version.longValue());
            }
            if (purchaseRecordLookupId != null)
            {
                codedoutputbytebuffernano.writeString(2, purchaseRecordLookupId);
            }
            if (generationId != null)
            {
                codedoutputbytebuffernano.writeInt64(3, generationId.longValue());
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeMessage(4, type);
            }
            if (transactionTime != null)
            {
                codedoutputbytebuffernano.writeMessage(5, transactionTime);
            }
            if (totalAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(6, totalAmount);
            }
            if (basicView != null)
            {
                codedoutputbytebuffernano.writeMessage(7, basicView);
            }
            if (userEnteredNotes != null)
            {
                codedoutputbytebuffernano.writeString(9, userEnteredNotes);
            }
            if (userVisibleTransactionId != null)
            {
                codedoutputbytebuffernano.writeString(10, userVisibleTransactionId);
            }
            if (creditDebit != null)
            {
                codedoutputbytebuffernano.writeInt32(11, creditDebit.intValue());
            }
            if (pending != null)
            {
                codedoutputbytebuffernano.writeBool(12, pending.booleanValue());
            }
            if (typeName != null)
            {
                codedoutputbytebuffernano.writeString(13, typeName);
            }
            if (status != null)
            {
                codedoutputbytebuffernano.writeMessage(15, status);
            }
            if (typeStatusSummary != null)
            {
                codedoutputbytebuffernano.writeString(16, typeStatusSummary);
            }
            if (renderedStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(17, renderedStatus);
            }
            if (renderOutput != null)
            {
                codedoutputbytebuffernano.writeMessage(18, renderOutput);
            }
            if (actionRenderable != null && actionRenderable.length > 0)
            {
                for (int i = 0; i < actionRenderable.length; i++)
                {
                    NanoCommon.ActionRenderable actionrenderable = actionRenderable[i];
                    if (actionrenderable != null)
                    {
                        codedoutputbytebuffernano.writeMessage(19, actionrenderable);
                    }
                }

            }
            if (typeDetails != null)
            {
                codedoutputbytebuffernano.writeString(20, typeDetails);
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(21, id);
            }
            if (torinoDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1000, torinoDetails);
            }
            if (p2PDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1001, p2PDetails);
            }
            if (checkoutDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1002, checkoutDetails);
            }
            if (storedValueDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1003, storedValueDetails);
            }
            if (adjustmentDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1004, adjustmentDetails);
            }
            if (cashWithdrawalDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1005, cashWithdrawalDetails);
            }
            if (moneyRequestDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1007, moneyRequestDetails);
            }
            if (billingPaymentDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1008, billingPaymentDetails);
            }
            if (incentivePaymentDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1009, incentivePaymentDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientPurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientStoredValuePurchaseRecord extends ExtendableMessageNano
    {

        public String description;
        public Payment destination;
        public FeeInfo feeInfo;
        public Payment source;

        private ClientStoredValuePurchaseRecord clear()
        {
            source = null;
            destination = null;
            description = null;
            feeInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientStoredValuePurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (source == null)
                    {
                        source = new Payment();
                    }
                    codedinputbytebuffernano.readMessage(source);
                    break;

                case 18: // '\022'
                    if (destination == null)
                    {
                        destination = new Payment();
                    }
                    codedinputbytebuffernano.readMessage(destination);
                    break;

                case 26: // '\032'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    if (feeInfo == null)
                    {
                        feeInfo = new FeeInfo();
                    }
                    codedinputbytebuffernano.readMessage(feeInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (source != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, source);
            }
            j = i;
            if (destination != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, destination);
            }
            i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, description);
            }
            j = i;
            if (feeInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(7, feeInfo);
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
            if (source != null)
            {
                codedoutputbytebuffernano.writeMessage(1, source);
            }
            if (destination != null)
            {
                codedoutputbytebuffernano.writeMessage(2, destination);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(3, description);
            }
            if (feeInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(7, feeInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientStoredValuePurchaseRecord()
        {
            clear();
        }
    }

    public static final class ClientTorinoPurchaseRecord extends ExtendableMessageNano
    {

        public String authorizationCode;
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime completionTime;
        public Link fundingHelpLink;
        public LineItem lineItem[];
        public LoyaltyCard loyaltyCard;
        public Party merchant;
        public String merchantOrderNumber;
        public String nfcAuthorizationCode;
        public Offer offer[];
        public Payment payment[];
        public ProxyCard proxyCard;
        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseLocation.PurchaseLocation purchaseLocation;
        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address shippingAddress;

        private ClientTorinoPurchaseRecord clear()
        {
            merchant = null;
            merchantOrderNumber = null;
            payment = Payment.emptyArray();
            loyaltyCard = null;
            offer = Offer.emptyArray();
            purchaseLocation = null;
            authorizationCode = null;
            proxyCard = null;
            lineItem = LineItem.emptyArray();
            shippingAddress = null;
            nfcAuthorizationCode = null;
            completionTime = null;
            fundingHelpLink = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientTorinoPurchaseRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        merchant = new Party();
                    }
                    codedinputbytebuffernano.readMessage(merchant);
                    break;

                case 18: // '\022'
                    merchantOrderNumber = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    Payment apayment[];
                    int j;
                    if (payment == null)
                    {
                        j = 0;
                    } else
                    {
                        j = payment.length;
                    }
                    apayment = new Payment[j + i1];
                    i1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(payment, 0, apayment, 0, j);
                        i1 = j;
                    }
                    for (; i1 < apayment.length - 1; i1++)
                    {
                        apayment[i1] = new Payment();
                        codedinputbytebuffernano.readMessage(apayment[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    apayment[i1] = new Payment();
                    codedinputbytebuffernano.readMessage(apayment[i1]);
                    payment = apayment;
                    break;

                case 34: // '"'
                    if (loyaltyCard == null)
                    {
                        loyaltyCard = new LoyaltyCard();
                    }
                    codedinputbytebuffernano.readMessage(loyaltyCard);
                    break;

                case 42: // '*'
                    int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    Offer aoffer[];
                    int k;
                    if (offer == null)
                    {
                        k = 0;
                    } else
                    {
                        k = offer.length;
                    }
                    aoffer = new Offer[k + j1];
                    j1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(offer, 0, aoffer, 0, k);
                        j1 = k;
                    }
                    for (; j1 < aoffer.length - 1; j1++)
                    {
                        aoffer[j1] = new Offer();
                        codedinputbytebuffernano.readMessage(aoffer[j1]);
                        codedinputbytebuffernano.readTag();
                    }

                    aoffer[j1] = new Offer();
                    codedinputbytebuffernano.readMessage(aoffer[j1]);
                    offer = aoffer;
                    break;

                case 58: // ':'
                    if (purchaseLocation == null)
                    {
                        purchaseLocation = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoPurchaseLocation.PurchaseLocation();
                    }
                    codedinputbytebuffernano.readMessage(purchaseLocation);
                    break;

                case 90: // 'Z'
                    authorizationCode = codedinputbytebuffernano.readString();
                    break;

                case 98: // 'b'
                    if (proxyCard == null)
                    {
                        proxyCard = new ProxyCard();
                    }
                    codedinputbytebuffernano.readMessage(proxyCard);
                    break;

                case 114: // 'r'
                    int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 114);
                    LineItem alineitem[];
                    int l;
                    if (lineItem == null)
                    {
                        l = 0;
                    } else
                    {
                        l = lineItem.length;
                    }
                    alineitem = new LineItem[l + k1];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(lineItem, 0, alineitem, 0, l);
                        k1 = l;
                    }
                    for (; k1 < alineitem.length - 1; k1++)
                    {
                        alineitem[k1] = new LineItem();
                        codedinputbytebuffernano.readMessage(alineitem[k1]);
                        codedinputbytebuffernano.readTag();
                    }

                    alineitem[k1] = new LineItem();
                    codedinputbytebuffernano.readMessage(alineitem[k1]);
                    lineItem = alineitem;
                    break;

                case 122: // 'z'
                    if (shippingAddress == null)
                    {
                        shippingAddress = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address();
                    }
                    codedinputbytebuffernano.readMessage(shippingAddress);
                    break;

                case 146: 
                    nfcAuthorizationCode = codedinputbytebuffernano.readString();
                    break;

                case 154: 
                    if (completionTime == null)
                    {
                        completionTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
                    }
                    codedinputbytebuffernano.readMessage(completionTime);
                    break;

                case 178: 
                    if (fundingHelpLink == null)
                    {
                        fundingHelpLink = new Link();
                    }
                    codedinputbytebuffernano.readMessage(fundingHelpLink);
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
            if (merchantOrderNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, merchantOrderNumber);
            }
            j = i;
            if (payment != null)
            {
                j = i;
                if (payment.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= payment.length)
                        {
                            break;
                        }
                        Payment payment1 = payment[k];
                        j = i;
                        if (payment1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, payment1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (loyaltyCard != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, loyaltyCard);
            }
            j = i;
            if (offer != null)
            {
                j = i;
                if (offer.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= offer.length)
                        {
                            break;
                        }
                        Offer offer1 = offer[l];
                        j = i;
                        if (offer1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(5, offer1);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (purchaseLocation != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, purchaseLocation);
            }
            j = i;
            if (authorizationCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(11, authorizationCode);
            }
            i = j;
            if (proxyCard != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(12, proxyCard);
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
                        LineItem lineitem = lineItem[i1];
                        j = i;
                        if (lineitem != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(14, lineitem);
                        }
                        i1++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (shippingAddress != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(15, shippingAddress);
            }
            j = i;
            if (nfcAuthorizationCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(18, nfcAuthorizationCode);
            }
            i = j;
            if (completionTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(19, completionTime);
            }
            j = i;
            if (fundingHelpLink != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(22, fundingHelpLink);
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
            if (merchant != null)
            {
                codedoutputbytebuffernano.writeMessage(1, merchant);
            }
            if (merchantOrderNumber != null)
            {
                codedoutputbytebuffernano.writeString(2, merchantOrderNumber);
            }
            if (payment != null && payment.length > 0)
            {
                for (int i = 0; i < payment.length; i++)
                {
                    Payment payment1 = payment[i];
                    if (payment1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, payment1);
                    }
                }

            }
            if (loyaltyCard != null)
            {
                codedoutputbytebuffernano.writeMessage(4, loyaltyCard);
            }
            if (offer != null && offer.length > 0)
            {
                for (int j = 0; j < offer.length; j++)
                {
                    Offer offer1 = offer[j];
                    if (offer1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, offer1);
                    }
                }

            }
            if (purchaseLocation != null)
            {
                codedoutputbytebuffernano.writeMessage(7, purchaseLocation);
            }
            if (authorizationCode != null)
            {
                codedoutputbytebuffernano.writeString(11, authorizationCode);
            }
            if (proxyCard != null)
            {
                codedoutputbytebuffernano.writeMessage(12, proxyCard);
            }
            if (lineItem != null && lineItem.length > 0)
            {
                for (int k = 0; k < lineItem.length; k++)
                {
                    LineItem lineitem = lineItem[k];
                    if (lineitem != null)
                    {
                        codedoutputbytebuffernano.writeMessage(14, lineitem);
                    }
                }

            }
            if (shippingAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(15, shippingAddress);
            }
            if (nfcAuthorizationCode != null)
            {
                codedoutputbytebuffernano.writeString(18, nfcAuthorizationCode);
            }
            if (completionTime != null)
            {
                codedoutputbytebuffernano.writeMessage(19, completionTime);
            }
            if (fundingHelpLink != null)
            {
                codedoutputbytebuffernano.writeMessage(22, fundingHelpLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientTorinoPurchaseRecord()
        {
            clear();
        }
    }

    public static final class FeeInfo extends ExtendableMessageNano
    {

        public com.google.checkout.customer.common.definitions.NanoMoney.Money fee;
        public String feeDescription;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money totalAmountWithFees;
        public Boolean waived;

        private FeeInfo clear()
        {
            fee = null;
            feeDescription = null;
            totalAmountWithFees = null;
            waived = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FeeInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (fee == null)
                    {
                        fee = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(fee);
                    break;

                case 18: // '\022'
                    feeDescription = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (totalAmountWithFees == null)
                    {
                        totalAmountWithFees = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(totalAmountWithFees);
                    break;

                case 32: // ' '
                    waived = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (fee != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, fee);
            }
            j = i;
            if (feeDescription != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, feeDescription);
            }
            i = j;
            if (totalAmountWithFees != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, totalAmountWithFees);
            }
            j = i;
            if (waived != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, waived.booleanValue());
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
            if (fee != null)
            {
                codedoutputbytebuffernano.writeMessage(1, fee);
            }
            if (feeDescription != null)
            {
                codedoutputbytebuffernano.writeString(2, feeDescription);
            }
            if (totalAmountWithFees != null)
            {
                codedoutputbytebuffernano.writeMessage(3, totalAmountWithFees);
            }
            if (waived != null)
            {
                codedoutputbytebuffernano.writeBool(4, waived.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FeeInfo()
        {
            clear();
        }
    }

    public static final class LineItem extends ExtendableMessageNano
    {

        private static volatile LineItem _emptyArray[];
        public String digitalFulfillmentUrl;
        public String id;
        public Integer lineItemState;
        public String longDescription;
        public String name;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money netCost;
        public String quantity;
        public String recurrenceId;
        public Shipment shipment[];
        public com.google.checkout.customer.common.definitions.NanoMoney.Money unitPrice;

        private LineItem clear()
        {
            name = null;
            id = null;
            quantity = null;
            unitPrice = null;
            netCost = null;
            shipment = Shipment.emptyArray();
            digitalFulfillmentUrl = null;
            longDescription = null;
            recurrenceId = null;
            lineItemState = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static LineItem[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new LineItem[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private LineItem mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L13:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 11: default 104
        //                       0: 113
        //                       10: 115
        //                       26: 126
        //                       34: 155
        //                       50: 184
        //                       58: 308
        //                       66: 319
        //                       74: 330
        //                       82: 341
        //                       88: 352
        //                       98: 402;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L13; else goto _L2
_L2:
            return this;
_L3:
            name = codedinputbytebuffernano.readString();
              goto _L13
_L4:
            if (unitPrice == null)
            {
                unitPrice = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
            }
            codedinputbytebuffernano.readMessage(unitPrice);
              goto _L13
_L5:
            if (netCost == null)
            {
                netCost = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
            }
            codedinputbytebuffernano.readMessage(netCost);
              goto _L13
_L6:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
            Shipment ashipment[];
            int j;
            if (shipment == null)
            {
                j = 0;
            } else
            {
                j = shipment.length;
            }
            ashipment = new Shipment[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(shipment, 0, ashipment, 0, j);
                l = j;
            }
            for (; l < ashipment.length - 1; l++)
            {
                ashipment[l] = new Shipment();
                codedinputbytebuffernano.readMessage(ashipment[l]);
                codedinputbytebuffernano.readTag();
            }

            ashipment[l] = new Shipment();
            codedinputbytebuffernano.readMessage(ashipment[l]);
            shipment = ashipment;
              goto _L13
_L7:
            digitalFulfillmentUrl = codedinputbytebuffernano.readString();
              goto _L13
_L8:
            longDescription = codedinputbytebuffernano.readString();
              goto _L13
_L9:
            recurrenceId = codedinputbytebuffernano.readString();
              goto _L13
_L10:
            quantity = codedinputbytebuffernano.readString();
              goto _L13
_L11:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                lineItemState = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L12:
            id = codedinputbytebuffernano.readString();
            if (true) goto _L13; else goto _L14
_L14:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (name != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, name);
            }
            j = i;
            if (unitPrice != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, unitPrice);
            }
            i = j;
            if (netCost != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, netCost);
            }
            j = i;
            if (shipment != null)
            {
                j = i;
                if (shipment.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= shipment.length)
                        {
                            break;
                        }
                        Shipment shipment1 = shipment[k];
                        j = i;
                        if (shipment1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(6, shipment1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (digitalFulfillmentUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, digitalFulfillmentUrl);
            }
            j = i;
            if (longDescription != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, longDescription);
            }
            i = j;
            if (recurrenceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, recurrenceId);
            }
            j = i;
            if (quantity != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, quantity);
            }
            i = j;
            if (lineItemState != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(11, lineItemState.intValue());
            }
            j = i;
            if (id != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, id);
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
            if (name != null)
            {
                codedoutputbytebuffernano.writeString(1, name);
            }
            if (unitPrice != null)
            {
                codedoutputbytebuffernano.writeMessage(3, unitPrice);
            }
            if (netCost != null)
            {
                codedoutputbytebuffernano.writeMessage(4, netCost);
            }
            if (shipment != null && shipment.length > 0)
            {
                for (int i = 0; i < shipment.length; i++)
                {
                    Shipment shipment1 = shipment[i];
                    if (shipment1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(6, shipment1);
                    }
                }

            }
            if (digitalFulfillmentUrl != null)
            {
                codedoutputbytebuffernano.writeString(7, digitalFulfillmentUrl);
            }
            if (longDescription != null)
            {
                codedoutputbytebuffernano.writeString(8, longDescription);
            }
            if (recurrenceId != null)
            {
                codedoutputbytebuffernano.writeString(9, recurrenceId);
            }
            if (quantity != null)
            {
                codedoutputbytebuffernano.writeString(10, quantity);
            }
            if (lineItemState != null)
            {
                codedoutputbytebuffernano.writeInt32(11, lineItemState.intValue());
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(12, id);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LineItem()
        {
            clear();
        }
    }

    public static final class Link extends ExtendableMessageNano
    {

        public String text;
        public String url;

        private Link clear()
        {
            text = null;
            url = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Link mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    text = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    url = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (text != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
            }
            j = i;
            if (url != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, url);
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
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(1, text);
            }
            if (url != null)
            {
                codedoutputbytebuffernano.writeString(2, url);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Link()
        {
            clear();
        }
    }

    public static final class LoyaltyCard extends ExtendableMessageNano
    {

        public String cardImageUrl;
        public String description;

        private LoyaltyCard clear()
        {
            description = null;
            cardImageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LoyaltyCard mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    description = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    cardImageUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
            }
            j = i;
            if (cardImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(3, cardImageUrl);
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            if (cardImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(3, cardImageUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LoyaltyCard()
        {
            clear();
        }
    }

    public static final class Offer extends ExtendableMessageNano
    {

        private static volatile Offer _emptyArray[];
        public String aboStatus;
        public String description;
        public String offerImageUrl;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money totalSavings;

        private Offer clear()
        {
            description = null;
            totalSavings = null;
            offerImageUrl = null;
            aboStatus = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Offer[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Offer[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Offer mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    description = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (totalSavings == null)
                    {
                        totalSavings = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(totalSavings);
                    break;

                case 26: // '\032'
                    offerImageUrl = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    aboStatus = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
            }
            j = i;
            if (totalSavings != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, totalSavings);
            }
            i = j;
            if (offerImageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, offerImageUrl);
            }
            j = i;
            if (aboStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, aboStatus);
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            if (totalSavings != null)
            {
                codedoutputbytebuffernano.writeMessage(2, totalSavings);
            }
            if (offerImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(3, offerImageUrl);
            }
            if (aboStatus != null)
            {
                codedoutputbytebuffernano.writeString(4, aboStatus);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Offer()
        {
            clear();
        }
    }

    public static final class Party extends ExtendableMessageNano
    {

        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address address;
        public String displayName;
        public String email;
        public String phone;
        public Integer role;
        public String taxIdInfoString;
        public String thumbnailUrl;
        public String url;

        private Party clear()
        {
            displayName = null;
            email = null;
            phone = null;
            address = null;
            url = null;
            thumbnailUrl = null;
            role = null;
            taxIdInfoString = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Party mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L11:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 9: default 88
        //                       0: 97
        //                       10: 99
        //                       18: 110
        //                       26: 121
        //                       34: 132
        //                       42: 161
        //                       50: 172
        //                       56: 183
        //                       66: 226;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
            return this;
_L3:
            displayName = codedinputbytebuffernano.readString();
              goto _L11
_L4:
            email = codedinputbytebuffernano.readString();
              goto _L11
_L5:
            phone = codedinputbytebuffernano.readString();
              goto _L11
_L6:
            if (address == null)
            {
                address = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoAddress.Address();
            }
            codedinputbytebuffernano.readMessage(address);
              goto _L11
_L7:
            url = codedinputbytebuffernano.readString();
              goto _L11
_L8:
            thumbnailUrl = codedinputbytebuffernano.readString();
              goto _L11
_L9:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                role = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L10:
            taxIdInfoString = codedinputbytebuffernano.readString();
            if (true) goto _L11; else goto _L12
_L12:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (displayName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, displayName);
            }
            j = i;
            if (email != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, email);
            }
            i = j;
            if (phone != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, phone);
            }
            j = i;
            if (address != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, address);
            }
            i = j;
            if (url != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, url);
            }
            j = i;
            if (thumbnailUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, thumbnailUrl);
            }
            i = j;
            if (role != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(7, role.intValue());
            }
            j = i;
            if (taxIdInfoString != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, taxIdInfoString);
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
            if (displayName != null)
            {
                codedoutputbytebuffernano.writeString(1, displayName);
            }
            if (email != null)
            {
                codedoutputbytebuffernano.writeString(2, email);
            }
            if (phone != null)
            {
                codedoutputbytebuffernano.writeString(3, phone);
            }
            if (address != null)
            {
                codedoutputbytebuffernano.writeMessage(4, address);
            }
            if (url != null)
            {
                codedoutputbytebuffernano.writeString(5, url);
            }
            if (thumbnailUrl != null)
            {
                codedoutputbytebuffernano.writeString(6, thumbnailUrl);
            }
            if (role != null)
            {
                codedoutputbytebuffernano.writeInt32(7, role.intValue());
            }
            if (taxIdInfoString != null)
            {
                codedoutputbytebuffernano.writeString(8, taxIdInfoString);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Party()
        {
            clear();
        }
    }

    public static final class Payment extends ExtendableMessageNano
    {

        private static volatile Payment _emptyArray[];
        public com.google.checkout.customer.common.definitions.NanoMoney.Money amount;
        public String descriptiveName;
        public com.google.checkout.customer.profile.definitions.NanoFop.Fop fop;
        public String paymentImageUrl;
        public String paymentNickname;
        public com.google.checkout.customer.purchaserecord.definitions.shared.NanoProcessingStatus.ProcessingStatus processingStatus;
        public String statusLabel;

        private Payment clear()
        {
            amount = null;
            fop = null;
            paymentNickname = null;
            descriptiveName = null;
            paymentImageUrl = null;
            processingStatus = null;
            statusLabel = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Payment[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Payment[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Payment mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (amount == null)
                    {
                        amount = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 18: // '\022'
                    if (fop == null)
                    {
                        fop = new com.google.checkout.customer.profile.definitions.NanoFop.Fop();
                    }
                    codedinputbytebuffernano.readMessage(fop);
                    break;

                case 34: // '"'
                    paymentNickname = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    descriptiveName = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    paymentImageUrl = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    if (processingStatus == null)
                    {
                        processingStatus = new com.google.checkout.customer.purchaserecord.definitions.shared.NanoProcessingStatus.ProcessingStatus();
                    }
                    codedinputbytebuffernano.readMessage(processingStatus);
                    break;

                case 66: // 'B'
                    statusLabel = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (amount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, amount);
            }
            j = i;
            if (fop != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, fop);
            }
            i = j;
            if (paymentNickname != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(4, paymentNickname);
            }
            j = i;
            if (descriptiveName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, descriptiveName);
            }
            i = j;
            if (paymentImageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(6, paymentImageUrl);
            }
            j = i;
            if (processingStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(7, processingStatus);
            }
            i = j;
            if (statusLabel != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(8, statusLabel);
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
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(1, amount);
            }
            if (fop != null)
            {
                codedoutputbytebuffernano.writeMessage(2, fop);
            }
            if (paymentNickname != null)
            {
                codedoutputbytebuffernano.writeString(4, paymentNickname);
            }
            if (descriptiveName != null)
            {
                codedoutputbytebuffernano.writeString(5, descriptiveName);
            }
            if (paymentImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(6, paymentImageUrl);
            }
            if (processingStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(7, processingStatus);
            }
            if (statusLabel != null)
            {
                codedoutputbytebuffernano.writeString(8, statusLabel);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Payment()
        {
            clear();
        }
    }

    public static final class ProxyCard extends ExtendableMessageNano
    {

        public String description;
        public String helpUrl;
        public Boolean secureElementCard;

        private ProxyCard clear()
        {
            description = null;
            helpUrl = null;
            secureElementCard = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProxyCard mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    description = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    helpUrl = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    secureElementCard = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
            }
            j = i;
            if (helpUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, helpUrl);
            }
            i = j;
            if (secureElementCard != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, secureElementCard.booleanValue());
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            if (helpUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, helpUrl);
            }
            if (secureElementCard != null)
            {
                codedoutputbytebuffernano.writeBool(3, secureElementCard.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProxyCard()
        {
            clear();
        }
    }

    public static final class RenderedStatus extends ExtendableMessageNano
    {

        public Integer status;
        public String statusDetails;
        public Link statusHelpLink;
        public String statusSummary;

        private RenderedStatus clear()
        {
            statusSummary = null;
            statusDetails = null;
            status = null;
            statusHelpLink = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RenderedStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       18: 78
        //                       24: 89
        //                       34: 166;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            statusSummary = codedinputbytebuffernano.readString();
              goto _L7
_L4:
            statusDetails = codedinputbytebuffernano.readString();
              goto _L7
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
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
                status = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (statusHelpLink == null)
            {
                statusHelpLink = new Link();
            }
            codedinputbytebuffernano.readMessage(statusHelpLink);
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (statusSummary != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, statusSummary);
            }
            j = i;
            if (statusDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, statusDetails);
            }
            i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, status.intValue());
            }
            j = i;
            if (statusHelpLink != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, statusHelpLink);
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
            if (statusSummary != null)
            {
                codedoutputbytebuffernano.writeString(1, statusSummary);
            }
            if (statusDetails != null)
            {
                codedoutputbytebuffernano.writeString(2, statusDetails);
            }
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(3, status.intValue());
            }
            if (statusHelpLink != null)
            {
                codedoutputbytebuffernano.writeMessage(4, statusHelpLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RenderedStatus()
        {
            clear();
        }
    }

    public static final class Shipment extends ExtendableMessageNano
    {

        private static volatile Shipment _emptyArray[];
        public String trackingDescription;
        public String trackingUrl;

        private Shipment clear()
        {
            trackingDescription = null;
            trackingUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Shipment[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Shipment[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Shipment mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    trackingDescription = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    trackingUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (trackingDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, trackingDescription);
            }
            j = i;
            if (trackingUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, trackingUrl);
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
            if (trackingDescription != null)
            {
                codedoutputbytebuffernano.writeString(1, trackingDescription);
            }
            if (trackingUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, trackingUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Shipment()
        {
            clear();
        }
    }

}
