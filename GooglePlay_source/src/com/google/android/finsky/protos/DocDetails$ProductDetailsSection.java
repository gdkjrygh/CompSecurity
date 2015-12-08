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
//            DocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile description _emptyArray[];
    public ion description[];
    public boolean hasTitle;
    public String title;

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
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasTitle)
            {
                i = j;
                if (title.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        int l = i;
        if (description != null)
        {
            l = i;
            if (description.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= description.length)
                    {
                        break;
                    }
                    ion ion = description[k];
                    l = i;
                    if (ion != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, ion);
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
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                ion aion[];
                int j;
                if (description == null)
                {
                    j = 0;
                } else
                {
                    j = description.length;
                }
                aion = new ion[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(description, 0, aion, 0, j);
                    k = j;
                }
                for (; k < aion.length - 1; k++)
                {
                    aion[k] = new ion();
                    codedinputbytebuffernano.readMessage(aion[k]);
                    codedinputbytebuffernano.readTag();
                }

                aion[k] = new ion();
                codedinputbytebuffernano.readMessage(aion[k]);
                description = aion;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, title);
        }
        if (description != null && description.length > 0)
        {
            for (int i = 0; i < description.length; i++)
            {
                ion ion = description[i];
                if (ion != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, ion);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ion()
    {
        title = "";
        hasTitle = false;
        description = ion.emptyArray();
        cachedSize = -1;
    }
}
