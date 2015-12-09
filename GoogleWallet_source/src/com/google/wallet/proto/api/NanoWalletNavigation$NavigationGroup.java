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
//            NanoWalletNavigation

public static final class clear extends ExtendableMessageNano
{

    private static volatile navigationNode _emptyArray[];
    public navigationNode header;
    public navigationNode navigationNode[];

    private clear clear()
    {
        header = null;
        navigationNode = mptyArray();
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
                if (header == null)
                {
                    header = new t>();
                }
                codedinputbytebuffernano.readMessage(header);
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                _emptyArray a_lemptyarray[];
                int j;
                if (navigationNode == null)
                {
                    j = 0;
                } else
                {
                    j = navigationNode.length;
                }
                a_lemptyarray = new navigationNode[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(navigationNode, 0, a_lemptyarray, 0, j);
                    k = j;
                }
                for (; k < a_lemptyarray.length - 1; k++)
                {
                    a_lemptyarray[k] = new init>();
                    codedinputbytebuffernano.readMessage(a_lemptyarray[k]);
                    codedinputbytebuffernano.readTag();
                }

                a_lemptyarray[k] = new init>();
                codedinputbytebuffernano.readMessage(a_lemptyarray[k]);
                navigationNode = a_lemptyarray;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (header != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, header);
        }
        int l = i;
        if (navigationNode != null)
        {
            l = i;
            if (navigationNode.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= navigationNode.length)
                    {
                        break;
                    }
                    navigationNode navigationnode = navigationNode[k];
                    l = i;
                    if (navigationnode != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(2, navigationnode);
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
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (header != null)
        {
            codedoutputbytebuffernano.writeMessage(1, header);
        }
        if (navigationNode != null && navigationNode.length > 0)
        {
            for (int i = 0; i < navigationNode.length; i++)
            {
                mergeFrom mergefrom = navigationNode[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
