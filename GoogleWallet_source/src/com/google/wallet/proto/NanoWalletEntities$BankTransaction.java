// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public String amount;
    public String authorizationCode;
    public Boolean creditToAccount;
    public String description;
    public String merchantCity;
    public String merchantName;
    public String merchantPhoneNumber;
    public String merchantState;
    public String messageGroupId;
    public totalAmount moneyAmount;
    public String offerId;
    public Long purchaseTimeMillis;
    public Long settlementTimeMillis;
    public totalAmount totalAmount;
    public String transactionId;

    private clear clear()
    {
        description = null;
        amount = null;
        merchantName = null;
        merchantCity = null;
        merchantState = null;
        merchantPhoneNumber = null;
        purchaseTimeMillis = null;
        creditToAccount = null;
        settlementTimeMillis = null;
        moneyAmount = null;
        authorizationCode = null;
        transactionId = null;
        messageGroupId = null;
        offerId = null;
        totalAmount = null;
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
                description = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                amount = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                merchantName = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                merchantCity = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                merchantState = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                merchantPhoneNumber = codedinputbytebuffernano.readString();
                break;

            case 56: // '8'
                purchaseTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 64: // '@'
                creditToAccount = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 72: // 'H'
                settlementTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 82: // 'R'
                if (moneyAmount == null)
                {
                    moneyAmount = new >();
                }
                codedinputbytebuffernano.readMessage(moneyAmount);
                break;

            case 90: // 'Z'
                authorizationCode = codedinputbytebuffernano.readString();
                break;

            case 98: // 'b'
                transactionId = codedinputbytebuffernano.readString();
                break;

            case 106: // 'j'
                messageGroupId = codedinputbytebuffernano.readString();
                break;

            case 114: // 'r'
                offerId = codedinputbytebuffernano.readString();
                break;

            case 122: // 'z'
                if (totalAmount == null)
                {
                    totalAmount = new >();
                }
                codedinputbytebuffernano.readMessage(totalAmount);
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
        if (amount != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, amount);
        }
        i = j;
        if (merchantName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, merchantName);
        }
        j = i;
        if (merchantCity != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, merchantCity);
        }
        i = j;
        if (merchantState != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, merchantState);
        }
        j = i;
        if (merchantPhoneNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, merchantPhoneNumber);
        }
        i = j;
        if (purchaseTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(7, purchaseTimeMillis.longValue());
        }
        j = i;
        if (creditToAccount != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(8, creditToAccount.booleanValue());
        }
        i = j;
        if (settlementTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(9, settlementTimeMillis.longValue());
        }
        j = i;
        if (moneyAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(10, moneyAmount);
        }
        i = j;
        if (authorizationCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(11, authorizationCode);
        }
        j = i;
        if (transactionId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, transactionId);
        }
        i = j;
        if (messageGroupId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(13, messageGroupId);
        }
        j = i;
        if (offerId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(14, offerId);
        }
        i = j;
        if (totalAmount != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(15, totalAmount);
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
        if (amount != null)
        {
            codedoutputbytebuffernano.writeString(2, amount);
        }
        if (merchantName != null)
        {
            codedoutputbytebuffernano.writeString(3, merchantName);
        }
        if (merchantCity != null)
        {
            codedoutputbytebuffernano.writeString(4, merchantCity);
        }
        if (merchantState != null)
        {
            codedoutputbytebuffernano.writeString(5, merchantState);
        }
        if (merchantPhoneNumber != null)
        {
            codedoutputbytebuffernano.writeString(6, merchantPhoneNumber);
        }
        if (purchaseTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(7, purchaseTimeMillis.longValue());
        }
        if (creditToAccount != null)
        {
            codedoutputbytebuffernano.writeBool(8, creditToAccount.booleanValue());
        }
        if (settlementTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(9, settlementTimeMillis.longValue());
        }
        if (moneyAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(10, moneyAmount);
        }
        if (authorizationCode != null)
        {
            codedoutputbytebuffernano.writeString(11, authorizationCode);
        }
        if (transactionId != null)
        {
            codedoutputbytebuffernano.writeString(12, transactionId);
        }
        if (messageGroupId != null)
        {
            codedoutputbytebuffernano.writeString(13, messageGroupId);
        }
        if (offerId != null)
        {
            codedoutputbytebuffernano.writeString(14, offerId);
        }
        if (totalAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(15, totalAmount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
