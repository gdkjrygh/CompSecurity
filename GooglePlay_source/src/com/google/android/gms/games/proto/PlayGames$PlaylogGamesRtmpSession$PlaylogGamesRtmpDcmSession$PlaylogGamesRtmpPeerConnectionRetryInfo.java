// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    private static volatile reconnectRetrySucessfulCount _emptyArray[];
    public String participantId;
    public int reconnectRetryCount;
    public int reconnectRetrySucessfulCount;

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

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!participantId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, participantId);
        }
        j = i;
        if (reconnectRetryCount != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, reconnectRetryCount);
        }
        i = j;
        if (reconnectRetrySucessfulCount != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, reconnectRetrySucessfulCount);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof reconnectRetrySucessfulCount))
            {
                return false;
            }
            obj = (reconnectRetrySucessfulCount)obj;
            if (participantId == null)
            {
                if (((participantId) (obj)).participantId != null)
                {
                    return false;
                }
            } else
            if (!participantId.equals(((participantId) (obj)).participantId))
            {
                return false;
            }
            if (reconnectRetryCount != ((reconnectRetryCount) (obj)).reconnectRetryCount)
            {
                return false;
            }
            if (reconnectRetrySucessfulCount != ((reconnectRetrySucessfulCount) (obj)).reconnectRetrySucessfulCount)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int i;
        if (participantId == null)
        {
            i = 0;
        } else
        {
            i = participantId.hashCode();
        }
        return (((j + 527) * 31 + i) * 31 + reconnectRetryCount) * 31 + reconnectRetrySucessfulCount;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                participantId = codedinputbytebuffernano.readString();
                break;

            case 16: // '\020'
                reconnectRetryCount = codedinputbytebuffernano.readRawVarint32();
                break;

            case 24: // '\030'
                reconnectRetrySucessfulCount = codedinputbytebuffernano.readRawVarint32();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!participantId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, participantId);
        }
        if (reconnectRetryCount != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, reconnectRetryCount);
        }
        if (reconnectRetrySucessfulCount != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, reconnectRetrySucessfulCount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        participantId = "";
        reconnectRetryCount = 0;
        reconnectRetrySucessfulCount = 0;
        cachedSize = -1;
    }
}
