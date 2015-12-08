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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class InlineDescription extends ExtendableMessageNano
    {

        public String listDescriptionText;
        public String selectedDescriptionText;

        private InlineDescription clear()
        {
            selectedDescriptionText = null;
            listDescriptionText = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InlineDescription mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    selectedDescriptionText = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    listDescriptionText = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (selectedDescriptionText != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, selectedDescriptionText);
            }
            j = i;
            if (listDescriptionText != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, listDescriptionText);
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
            if (selectedDescriptionText != null)
            {
                codedoutputbytebuffernano.writeString(1, selectedDescriptionText);
            }
            if (listDescriptionText != null)
            {
                codedoutputbytebuffernano.writeString(2, listDescriptionText);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InlineDescription()
        {
            clear();
        }
    }


    private static volatile inlineDescription _emptyArray[];
    public InlineDescription inlineDescription;
    public String instrumentSubIds[];
    public Boolean isFree;

    private InlineDescription.listDescriptionText clear()
    {
        instrumentSubIds = WireFormatNano.EMPTY_STRING_ARRAY;
        isFree = null;
        inlineDescription = null;
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                String as[];
                int j;
                if (instrumentSubIds == null)
                {
                    j = 0;
                } else
                {
                    j = instrumentSubIds.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(instrumentSubIds, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                instrumentSubIds = as;
                break;

            case 16: // '\020'
                isFree = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 26: // '\032'
                if (inlineDescription == null)
                {
                    inlineDescription = new InlineDescription();
                }
                codedinputbytebuffernano.readMessage(inlineDescription);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int k1 = super.computeSerializedSize();
        int i = k1;
        if (instrumentSubIds != null)
        {
            i = k1;
            if (instrumentSubIds.length > 0)
            {
                int i1 = 0;
                int j = 0;
                for (i = 0; i < instrumentSubIds.length;)
                {
                    String s = instrumentSubIds[i];
                    int j1 = i1;
                    int l = j;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    i1 = j1;
                    j = l;
                }

                i = k1 + j + i1 * 1;
            }
        }
        int k = i;
        if (isFree != null)
        {
            k = i + CodedOutputByteBufferNano.computeBoolSize(2, isFree.booleanValue());
        }
        i = k;
        if (inlineDescription != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(3, inlineDescription);
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
        if (instrumentSubIds != null && instrumentSubIds.length > 0)
        {
            for (int i = 0; i < instrumentSubIds.length; i++)
            {
                String s = instrumentSubIds[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(1, s);
                }
            }

        }
        if (isFree != null)
        {
            codedoutputbytebuffernano.writeBool(2, isFree.booleanValue());
        }
        if (inlineDescription != null)
        {
            codedoutputbytebuffernano.writeMessage(3, inlineDescription);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public InlineDescription.clear()
    {
        clear();
    }
}
