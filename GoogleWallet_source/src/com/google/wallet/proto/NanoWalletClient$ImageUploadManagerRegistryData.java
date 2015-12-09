// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletClient

public static final class clear extends ExtendableMessageNano
{
    public static final class Entry extends ExtendableMessageNano
    {

        private static volatile Entry _emptyArray[];
        public String identifier;
        public String sessionMaterial;
        public Long timestamp;
        public String wobInstanceId;

        private Entry clear()
        {
            identifier = null;
            wobInstanceId = null;
            timestamp = null;
            sessionMaterial = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Entry[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Entry[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Entry mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public Entry()
        {
            clear();
        }
    }


    public Entry entries[];

    private Entry clear()
    {
        entries = Entry.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                Entry aentry[];
                int j;
                if (entries == null)
                {
                    j = 0;
                } else
                {
                    j = entries.length;
                }
                aentry = new Entry[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(entries, 0, aentry, 0, j);
                    k = j;
                }
                for (; k < aentry.length - 1; k++)
                {
                    aentry[k] = new Entry();
                    codedinputbytebuffernano.readMessage(aentry[k]);
                    codedinputbytebuffernano.readTag();
                }

                aentry[k] = new Entry();
                codedinputbytebuffernano.readMessage(aentry[k]);
                entries = aentry;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (entries != null)
        {
            k = i;
            if (entries.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= entries.length)
                    {
                        break;
                    }
                    Entry entry = entries[j];
                    k = i;
                    if (entry != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, entry);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (entries != null && entries.length > 0)
        {
            for (int i = 0; i < entries.length; i++)
            {
                Entry entry = entries[i];
                if (entry != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, entry);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Entry.clear()
    {
        clear();
    }
}
