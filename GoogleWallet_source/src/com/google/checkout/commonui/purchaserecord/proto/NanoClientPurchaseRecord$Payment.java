// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    private static volatile statusLabel _emptyArray[];
    public com.google.checkout.customer.common.definitions.t amount;
    public String descriptiveName;
    public com.google.checkout.customer.profile.definitions. fop;
    public String paymentImageUrl;
    public String paymentNickname;
    public com.google.checkout.customer.purchaserecord.definitions.shared.atus processingStatus;
    public String statusLabel;

    private clear clear()
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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    amount = new com.google.checkout.customer.common.definitions.t.amount();
                }
                codedinputbytebuffernano.readMessage(amount);
                break;

            case 18: // '\022'
                if (fop == null)
                {
                    fop = new com.google.checkout.customer.profile.definitions..fop();
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
                    processingStatus = new com.google.checkout.customer.purchaserecord.definitions.shared.atus();
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

    public .ProcessingStatus()
    {
        clear();
    }
}
