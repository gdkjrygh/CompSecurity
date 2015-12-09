// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile generationNumber _emptyArray[];
    public Long generationNumber;
    public String localId;
    public String originatorId;

    private clear clear()
    {
        originatorId = null;
        localId = null;
        generationNumber = null;
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
                originatorId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                localId = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                generationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (originatorId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, originatorId);
        }
        j = i;
        if (localId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, localId);
        }
        i = j;
        if (generationNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, generationNumber.longValue());
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
        if (originatorId != null)
        {
            codedoutputbytebuffernano.writeString(1, originatorId);
        }
        if (localId != null)
        {
            codedoutputbytebuffernano.writeString(2, localId);
        }
        if (generationNumber != null)
        {
            codedoutputbytebuffernano.writeInt64(3, generationNumber.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        clear();
    }
}
