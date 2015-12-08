// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.features:
//            NanoWalletKyc

public static final class clear extends ExtendableMessageNano
{

    private static volatile encryptedAnswer _emptyArray[];
    public String answer;
    public com.google.wallet.proto.tedData encryptedAnswer;
    public String questionId;

    private clear clear()
    {
        questionId = null;
        answer = null;
        encryptedAnswer = null;
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
                questionId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                answer = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (encryptedAnswer == null)
                {
                    encryptedAnswer = new com.google.wallet.proto.tedData();
                }
                codedinputbytebuffernano.readMessage(encryptedAnswer);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (questionId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, questionId);
        }
        j = i;
        if (answer != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, answer);
        }
        i = j;
        if (encryptedAnswer != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, encryptedAnswer);
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
        if (questionId != null)
        {
            codedoutputbytebuffernano.writeString(1, questionId);
        }
        if (answer != null)
        {
            codedoutputbytebuffernano.writeString(2, answer);
        }
        if (encryptedAnswer != null)
        {
            codedoutputbytebuffernano.writeMessage(3, encryptedAnswer);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
