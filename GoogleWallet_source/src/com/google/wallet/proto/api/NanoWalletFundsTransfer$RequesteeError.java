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

    private static volatile callError _emptyArray[];
    public com.google.wallet.proto.ror accountIdentifier;
    public com.google.wallet.proto.ror callError;

    private clear clear()
    {
        accountIdentifier = null;
        callError = null;
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
                    accountIdentifier = new com.google.wallet.proto.nit>();
                }
                codedinputbytebuffernano.readMessage(accountIdentifier);
                break;

            case 18: // '\022'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.ror.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
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
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
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
        if (accountIdentifier != null)
        {
            codedoutputbytebuffernano.writeMessage(1, accountIdentifier);
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
