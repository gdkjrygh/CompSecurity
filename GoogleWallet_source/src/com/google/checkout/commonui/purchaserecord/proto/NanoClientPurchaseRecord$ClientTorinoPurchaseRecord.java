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

    public String authorizationCode;
    public com.google.checkout.customer.common.definitions.d.fundingHelpLink completionTime;
    public fundingHelpLink fundingHelpLink;
    public fundingHelpLink lineItem[];
    public fundingHelpLink loyaltyCard;
    public fundingHelpLink merchant;
    public String merchantOrderNumber;
    public String nfcAuthorizationCode;
    public fundingHelpLink offer[];
    public fundingHelpLink payment[];
    public fundingHelpLink proxyCard;
    public com.google.checkout.customer.purchaserecord.definitions.shared.nk purchaseLocation;
    public com.google.checkout.customer.purchaserecord.definitions.shared.nk shippingAddress;

    private clear clear()
    {
        merchant = null;
        merchantOrderNumber = null;
        payment = payment();
        loyaltyCard = null;
        offer = offer();
        purchaseLocation = null;
        authorizationCode = null;
        proxyCard = null;
        lineItem = lineItem();
        shippingAddress = null;
        nfcAuthorizationCode = null;
        completionTime = null;
        fundingHelpLink = null;
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
                merchantOrderNumber = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                cachedSize acachedsize[];
                int j;
                if (payment == null)
                {
                    j = 0;
                } else
                {
                    j = payment.length;
                }
                acachedsize = new payment[j + i1];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(payment, 0, acachedsize, 0, j);
                    i1 = j;
                }
                for (; i1 < acachedsize.length - 1; i1++)
                {
                    acachedsize[i1] = new payment();
                    codedinputbytebuffernano.readMessage(acachedsize[i1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[i1] = new payment();
                codedinputbytebuffernano.readMessage(acachedsize[i1]);
                payment = acachedsize;
                break;

            case 34: // '"'
                if (loyaltyCard == null)
                {
                    loyaltyCard = new loyaltyCard();
                }
                codedinputbytebuffernano.readMessage(loyaltyCard);
                break;

            case 42: // '*'
                int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                cachedSize acachedsize1[];
                int k;
                if (offer == null)
                {
                    k = 0;
                } else
                {
                    k = offer.length;
                }
                acachedsize1 = new offer[k + j1];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(offer, 0, acachedsize1, 0, k);
                    j1 = k;
                }
                for (; j1 < acachedsize1.length - 1; j1++)
                {
                    acachedsize1[j1] = new offer();
                    codedinputbytebuffernano.readMessage(acachedsize1[j1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize1[j1] = new offer();
                codedinputbytebuffernano.readMessage(acachedsize1[j1]);
                offer = acachedsize1;
                break;

            case 58: // ':'
                if (purchaseLocation == null)
                {
                    purchaseLocation = new com.google.checkout.customer.purchaserecord.definitions.shared.ion();
                }
                codedinputbytebuffernano.readMessage(purchaseLocation);
                break;

            case 90: // 'Z'
                authorizationCode = codedinputbytebuffernano.readString();
                break;

            case 98: // 'b'
                if (proxyCard == null)
                {
                    proxyCard = new proxyCard();
                }
                codedinputbytebuffernano.readMessage(proxyCard);
                break;

            case 114: // 'r'
                int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 114);
                cachedSize acachedsize2[];
                int l;
                if (lineItem == null)
                {
                    l = 0;
                } else
                {
                    l = lineItem.length;
                }
                acachedsize2 = new lineItem[l + k1];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(lineItem, 0, acachedsize2, 0, l);
                    k1 = l;
                }
                for (; k1 < acachedsize2.length - 1; k1++)
                {
                    acachedsize2[k1] = new lineItem();
                    codedinputbytebuffernano.readMessage(acachedsize2[k1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize2[k1] = new lineItem();
                codedinputbytebuffernano.readMessage(acachedsize2[k1]);
                lineItem = acachedsize2;
                break;

            case 122: // 'z'
                if (shippingAddress == null)
                {
                    shippingAddress = new com.google.checkout.customer.purchaserecord.definitions.shared.ss();
                }
                codedinputbytebuffernano.readMessage(shippingAddress);
                break;

            case 146: 
                nfcAuthorizationCode = codedinputbytebuffernano.readString();
                break;

            case 154: 
                if (completionTime == null)
                {
                    completionTime = new com.google.checkout.customer.common.definitions.d.completionTime();
                }
                codedinputbytebuffernano.readMessage(completionTime);
                break;

            case 178: 
                if (fundingHelpLink == null)
                {
                    fundingHelpLink = new fundingHelpLink();
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
                    fundingHelpLink fundinghelplink = payment[k];
                    j = i;
                    if (fundinghelplink != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, fundinghelplink);
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
                    fundingHelpLink fundinghelplink1 = offer[l];
                    j = i;
                    if (fundinghelplink1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(5, fundinghelplink1);
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
                    fundingHelpLink fundinghelplink2 = lineItem[i1];
                    j = i;
                    if (fundinghelplink2 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(14, fundinghelplink2);
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
                mergeFrom mergefrom = payment[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, mergefrom);
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
                mergeFrom mergefrom1 = offer[j];
                if (mergefrom1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, mergefrom1);
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
                mergeFrom mergefrom2 = lineItem[k];
                if (mergefrom2 != null)
                {
                    codedoutputbytebuffernano.writeMessage(14, mergefrom2);
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

    public ()
    {
        clear();
    }
}
