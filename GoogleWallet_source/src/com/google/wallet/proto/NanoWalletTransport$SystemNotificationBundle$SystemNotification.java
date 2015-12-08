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
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{
    public static final class AndroidSyncParams extends ExtendableMessageNano
    {

        public String entityName;
        public Long timestampMillis;

        private AndroidSyncParams clear()
        {
            entityName = null;
            timestampMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AndroidSyncParams mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    entityName = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    timestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (entityName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, entityName);
            }
            j = i;
            if (timestampMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, timestampMillis.longValue());
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
            if (entityName != null)
            {
                codedoutputbytebuffernano.writeString(1, entityName);
            }
            if (timestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, timestampMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AndroidSyncParams()
        {
            clear();
        }
    }

    public static final class FetchWobsDiffParams extends ExtendableMessageNano
    {

        public Long updateTimeMillis;

        private FetchWobsDiffParams clear()
        {
            updateTimeMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchWobsDiffParams mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    updateTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (updateTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, updateTimeMillis.longValue());
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
            if (updateTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, updateTimeMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchWobsDiffParams()
        {
            clear();
        }
    }


    private static volatile androidSyncParams _emptyArray[];
    public AndroidSyncParams androidSyncParams;
    public FetchWobsDiffParams fetchWobsDiffParams;
    public Integer type;

    private FetchWobsDiffParams.updateTimeMillis clear()
    {
        type = null;
        fetchWobsDiffParams = null;
        androidSyncParams = null;
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
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   34: 130
    //                   42: 159;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            type = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (fetchWobsDiffParams == null)
        {
            fetchWobsDiffParams = new FetchWobsDiffParams();
        }
        codedinputbytebuffernano.readMessage(fetchWobsDiffParams);
        continue; /* Loop/switch isn't completed */
_L5:
        if (androidSyncParams == null)
        {
            androidSyncParams = new AndroidSyncParams();
        }
        codedinputbytebuffernano.readMessage(androidSyncParams);
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (type != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
        }
        j = i;
        if (fetchWobsDiffParams != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, fetchWobsDiffParams);
        }
        i = j;
        if (androidSyncParams != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, androidSyncParams);
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
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(1, type.intValue());
        }
        if (fetchWobsDiffParams != null)
        {
            codedoutputbytebuffernano.writeMessage(4, fetchWobsDiffParams);
        }
        if (androidSyncParams != null)
        {
            codedoutputbytebuffernano.writeMessage(5, androidSyncParams);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public FetchWobsDiffParams.clear()
    {
        clear();
    }
}
