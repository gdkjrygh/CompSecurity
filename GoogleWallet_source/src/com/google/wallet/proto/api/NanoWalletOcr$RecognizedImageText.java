// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    private static volatile boundingBox _emptyArray[];
    public com.google.wallet.proto.ext attribution[];
    public boundingBox boundingBox;
    public Integer promptId;
    public Float score;
    public String value;

    private clear clear()
    {
        value = null;
        score = null;
        attribution = com.google.wallet.proto.ptyArray();
        promptId = null;
        boundingBox = null;
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
                value = codedinputbytebuffernano.readString();
                break;

            case 21: // '\025'
                score = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                com.google.wallet.proto.ext aext[];
                int j;
                if (attribution == null)
                {
                    j = 0;
                } else
                {
                    j = attribution.length;
                }
                aext = new com.google.wallet.proto.ext.attribution[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(attribution, 0, aext, 0, j);
                    k = j;
                }
                for (; k < aext.length - 1; k++)
                {
                    aext[k] = new com.google.wallet.proto.nit>();
                    codedinputbytebuffernano.readMessage(aext[k]);
                    codedinputbytebuffernano.readTag();
                }

                aext[k] = new com.google.wallet.proto.nit>();
                codedinputbytebuffernano.readMessage(aext[k]);
                attribution = aext;
                break;

            case 32: // ' '
                promptId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 42: // '*'
                if (boundingBox == null)
                {
                    boundingBox = new boundingBox();
                }
                codedinputbytebuffernano.readMessage(boundingBox);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (value != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(1, value);
        }
        i = j;
        if (score != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(2, score.floatValue());
        }
        j = i;
        if (attribution != null)
        {
            j = i;
            if (attribution.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= attribution.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.ext ext = attribution[k];
                    j = i;
                    if (ext != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, ext);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (promptId != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(4, promptId.intValue());
        }
        j = i;
        if (boundingBox != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(5, boundingBox);
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
        if (value != null)
        {
            codedoutputbytebuffernano.writeString(1, value);
        }
        if (score != null)
        {
            codedoutputbytebuffernano.writeFloat(2, score.floatValue());
        }
        if (attribution != null && attribution.length > 0)
        {
            for (int i = 0; i < attribution.length; i++)
            {
                com.google.wallet.proto.ext ext = attribution[i];
                if (ext != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, ext);
                }
            }

        }
        if (promptId != null)
        {
            codedoutputbytebuffernano.writeInt32(4, promptId.intValue());
        }
        if (boundingBox != null)
        {
            codedoutputbytebuffernano.writeMessage(5, boundingBox);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
