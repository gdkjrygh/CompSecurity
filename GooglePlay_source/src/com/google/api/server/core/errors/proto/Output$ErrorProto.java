// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.server.core.errors.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.api.server.core.errors.proto:
//            Output

public static final class cachedSize extends MessageNano
{

    public Integer code;
    public rror errors[];
    public String message;

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (code != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(1, code.intValue());
        }
        i = j;
        if (message != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, message);
        }
        int l = i;
        if (errors != null)
        {
            l = i;
            if (errors.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= errors.length)
                    {
                        break;
                    }
                    rror rror = errors[k];
                    l = i;
                    if (rror != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, rror);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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

            case 8: // '\b'
                code = Integer.valueOf(codedinputbytebuffernano.readRawVarint32());
                break;

            case 18: // '\022'
                message = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                rror arror[];
                int j;
                if (errors == null)
                {
                    j = 0;
                } else
                {
                    j = errors.length;
                }
                arror = new rror[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(errors, 0, arror, 0, j);
                    k = j;
                }
                for (; k < arror.length - 1; k++)
                {
                    arror[k] = new rror();
                    codedinputbytebuffernano.readMessage(arror[k]);
                    codedinputbytebuffernano.readTag();
                }

                arror[k] = new rror();
                codedinputbytebuffernano.readMessage(arror[k]);
                errors = arror;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (code != null)
        {
            codedoutputbytebuffernano.writeInt32(1, code.intValue());
        }
        if (message != null)
        {
            codedoutputbytebuffernano.writeString(2, message);
        }
        if (errors != null && errors.length > 0)
        {
            for (int i = 0; i < errors.length; i++)
            {
                rror rror = errors[i];
                if (rror != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, rror);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public rror()
    {
        code = null;
        message = null;
        errors = rror.emptyArray();
        cachedSize = -1;
    }
}
