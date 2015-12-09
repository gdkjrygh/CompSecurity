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
//            NanoWalletStatement

public static final class clear extends ExtendableMessageNano
{

    private static volatile statementLink _emptyArray[];
    public String statementLink;
    public String statementTitle;

    private clear clear()
    {
        statementTitle = null;
        statementLink = null;
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
                statementTitle = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                statementLink = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (statementTitle != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, statementTitle);
        }
        j = i;
        if (statementLink != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, statementLink);
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
        if (statementTitle != null)
        {
            codedoutputbytebuffernano.writeString(1, statementTitle);
        }
        if (statementLink != null)
        {
            codedoutputbytebuffernano.writeString(2, statementLink);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public a()
    {
        clear();
    }
}
