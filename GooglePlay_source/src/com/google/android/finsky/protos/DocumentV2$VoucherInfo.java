// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    private static volatile Message _emptyArray[];
    public Message doc;
    public Message offer[];

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
        if (doc != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, doc);
        }
        int l = i;
        if (offer != null)
        {
            l = i;
            if (offer.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= offer.length)
                    {
                        break;
                    }
                    _emptyArray _lemptyarray = offer[k];
                    l = i;
                    if (_lemptyarray != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(2, _lemptyarray);
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

            case 10: // '\n'
                if (doc == null)
                {
                    doc = new ();
                }
                codedinputbytebuffernano.readMessage(doc);
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                teMessageSize atemessagesize[];
                int j;
                if (offer == null)
                {
                    j = 0;
                } else
                {
                    j = offer.length;
                }
                atemessagesize = new offer[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(offer, 0, atemessagesize, 0, j);
                    k = j;
                }
                for (; k < atemessagesize.length - 1; k++)
                {
                    atemessagesize[k] = new offer();
                    codedinputbytebuffernano.readMessage(atemessagesize[k]);
                    codedinputbytebuffernano.readTag();
                }

                atemessagesize[k] = new g();
                codedinputbytebuffernano.readMessage(atemessagesize[k]);
                offer = atemessagesize;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (doc != null)
        {
            codedoutputbytebuffernano.writeMessage(1, doc);
        }
        if (offer != null && offer.length > 0)
        {
            for (int i = 0; i < offer.length; i++)
            {
                offer offer1 = offer[i];
                if (offer1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, offer1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        doc = null;
        offer = ();
        cachedSize = -1;
    }
}
