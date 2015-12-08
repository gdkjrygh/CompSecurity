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

    public com.google.checkout.customer.common.definitions.d.requestInfo autoRejectTime;
    public Boolean canClaim;
    public Boolean canReturn;
    public requestInfo counterParty;
    public String description;
    public requestInfo feeInfo;
    public requestInfo party;
    public requestInfo payment[];
    public com.google.checkout.customer.purchaserecord.definitions.tInfo requestInfo;
    public String senderMessage;
    public String themeImageUrl;

    private clear clear()
    {
        counterParty = null;
        party = null;
        payment = payment();
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
                if (counterParty == null)
                {
                    counterParty = new counterParty();
                }
                codedinputbytebuffernano.readMessage(counterParty);
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize[];
                int j;
                if (payment == null)
                {
                    j = 0;
                } else
                {
                    j = payment.length;
                }
                acachedsize = new payment[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(payment, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new payment();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new payment();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                payment = acachedsize;
                break;

            case 26: // '\032'
                senderMessage = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                if (autoRejectTime == null)
                {
                    autoRejectTime = new com.google.checkout.customer.common.definitions.d.autoRejectTime();
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
                    party = new party();
                }
                codedinputbytebuffernano.readMessage(party);
                break;

            case 130: 
                description = codedinputbytebuffernano.readString();
                break;

            case 138: 
                if (feeInfo == null)
                {
                    feeInfo = new feeInfo();
                }
                codedinputbytebuffernano.readMessage(feeInfo);
                break;

            case 146: 
                themeImageUrl = codedinputbytebuffernano.readString();
                break;

            case 162: 
                if (requestInfo == null)
                {
                    requestInfo = new com.google.checkout.customer.purchaserecord.definitions.it>();
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
                    requestInfo requestinfo = payment[k];
                    j = i;
                    if (requestinfo != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, requestinfo);
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
                mergeFrom mergefrom = payment[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
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

    public fo()
    {
        clear();
    }
}
