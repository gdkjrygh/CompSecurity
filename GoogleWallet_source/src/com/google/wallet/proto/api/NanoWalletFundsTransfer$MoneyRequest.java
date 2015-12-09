// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletFundsTransfer

public static final class clear extends ExtendableMessageNano
{

    private static volatile replayId _emptyArray[];
    public com.google.wallet.proto.est accountIdentifier;
    public com.google.wallet.proto.est amount;
    public String replayId;

    private clear clear()
    {
        accountIdentifier = null;
        amount = null;
        replayId = null;
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
                if (accountIdentifier == null)
                {
                    accountIdentifier = new com.google.wallet.proto.<init>();
                }
                codedinputbytebuffernano.readMessage(accountIdentifier);
                break;

            case 18: // '\022'
                if (amount == null)
                {
                    amount = new com.google.wallet.proto.est.amount();
                }
                codedinputbytebuffernano.readMessage(amount);
                break;

            case 26: // '\032'
                replayId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (accountIdentifier != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, accountIdentifier);
        }
        j = i;
        if (amount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, amount);
        }
        i = j;
        if (replayId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, replayId);
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
        if (accountIdentifier != null)
        {
            codedoutputbytebuffernano.writeMessage(1, accountIdentifier);
        }
        if (amount != null)
        {
            codedoutputbytebuffernano.writeMessage(2, amount);
        }
        if (replayId != null)
        {
            codedoutputbytebuffernano.writeString(3, replayId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
