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

    private static volatile child _emptyArray[];
    public tionNode child[];
    public tionNode display;
    public String uri;

    private clear clear()
    {
        display = null;
        uri = null;
        child = tionNode.emptyArray();
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
                if (display == null)
                {
                    display = new it>();
                }
                codedinputbytebuffernano.readMessage(display);
                break;

            case 18: // '\022'
                uri = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                tionNode ationnode[];
                int j;
                if (child == null)
                {
                    j = 0;
                } else
                {
                    j = child.length;
                }
                ationnode = new tionNode[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(child, 0, ationnode, 0, j);
                    k = j;
                }
                for (; k < ationnode.length - 1; k++)
                {
                    ationnode[k] = new tionNode();
                    codedinputbytebuffernano.readMessage(ationnode[k]);
                    codedinputbytebuffernano.readTag();
                }

                ationnode[k] = new tionNode();
                codedinputbytebuffernano.readMessage(ationnode[k]);
                child = ationnode;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (display != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, display);
        }
        i = j;
        if (uri != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, uri);
        }
        int l = i;
        if (child != null)
        {
            l = i;
            if (child.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= child.length)
                    {
                        break;
                    }
                    tionNode tionnode = child[k];
                    l = i;
                    if (tionnode != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, tionnode);
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
        if (display != null)
        {
            codedoutputbytebuffernano.writeMessage(1, display);
        }
        if (uri != null)
        {
            codedoutputbytebuffernano.writeString(2, uri);
        }
        if (child != null && child.length > 0)
        {
            for (int i = 0; i < child.length; i++)
            {
                tionNode tionnode = child[i];
                if (tionnode != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, tionnode);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public tionNode()
    {
        clear();
    }
}
