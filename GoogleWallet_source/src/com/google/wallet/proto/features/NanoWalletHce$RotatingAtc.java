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
//            NanoWalletHce

public static final class clear extends ExtendableMessageNano
{

    private static volatile readerAtc _emptyArray[];
    public Integer readerAtc;
    public Integer secretAtc;

    private clear clear()
    {
        secretAtc = null;
        readerAtc = null;
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

            case 16: // '\020'
                secretAtc = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 24: // '\030'
                readerAtc = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (secretAtc != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(2, secretAtc.intValue());
        }
        j = i;
        if (readerAtc != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(3, readerAtc.intValue());
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
        if (secretAtc != null)
        {
            codedoutputbytebuffernano.writeInt32(2, secretAtc.intValue());
        }
        if (readerAtc != null)
        {
            codedoutputbytebuffernano.writeInt32(3, readerAtc.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
