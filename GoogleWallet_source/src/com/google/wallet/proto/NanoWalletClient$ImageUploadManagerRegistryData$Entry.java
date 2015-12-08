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
//            NanoWalletClient

public static final class clear extends ExtendableMessageNano
{

    private static volatile sessionMaterial _emptyArray[];
    public String identifier;
    public String sessionMaterial;
    public Long timestamp;
    public String wobInstanceId;

    private clear clear()
    {
        identifier = null;
        wobInstanceId = null;
        timestamp = null;
        sessionMaterial = null;
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
                identifier = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                wobInstanceId = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                timestamp = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 34: // '"'
                sessionMaterial = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (identifier != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, identifier);
        }
        j = i;
        if (wobInstanceId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, wobInstanceId);
        }
        i = j;
        if (timestamp != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, timestamp.longValue());
        }
        j = i;
        if (sessionMaterial != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, sessionMaterial);
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
        if (identifier != null)
        {
            codedoutputbytebuffernano.writeString(1, identifier);
        }
        if (wobInstanceId != null)
        {
            codedoutputbytebuffernano.writeString(2, wobInstanceId);
        }
        if (timestamp != null)
        {
            codedoutputbytebuffernano.writeInt64(3, timestamp.longValue());
        }
        if (sessionMaterial != null)
        {
            codedoutputbytebuffernano.writeString(4, sessionMaterial);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
