// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public feeInfo feeInfo;
    public feeInfo merchant;
    public feeInfo payment;

    private clear clear()
    {
        merchant = null;
        payment = null;
        feeInfo = null;
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
                if (payment == null)
                {
                    payment = new payment();
                }
                codedinputbytebuffernano.readMessage(payment);
                break;

            case 26: // '\032'
                if (feeInfo == null)
                {
                    feeInfo = new feeInfo();
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

    public ()
    {
        clear();
    }
}
