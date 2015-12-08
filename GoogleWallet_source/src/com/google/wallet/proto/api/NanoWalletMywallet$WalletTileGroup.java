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
//            NanoWalletMywallet

public static final class clear extends ExtendableMessageNano
{

    private static volatile anchor _emptyArray[];
    public String anchor;
    public anchor tile[];
    public String title;

    private clear clear()
    {
        title = null;
        tile = Array();
        anchor = null;
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
                title = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                _emptyArray a_lemptyarray[];
                int j;
                if (tile == null)
                {
                    j = 0;
                } else
                {
                    j = tile.length;
                }
                a_lemptyarray = new tile[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(tile, 0, a_lemptyarray, 0, j);
                    k = j;
                }
                for (; k < a_lemptyarray.length - 1; k++)
                {
                    a_lemptyarray[k] = new >();
                    codedinputbytebuffernano.readMessage(a_lemptyarray[k]);
                    codedinputbytebuffernano.readTag();
                }

                a_lemptyarray[k] = new >();
                codedinputbytebuffernano.readMessage(a_lemptyarray[k]);
                tile = a_lemptyarray;
                break;

            case 26: // '\032'
                anchor = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (title != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        j = i;
        if (tile != null)
        {
            j = i;
            if (tile.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= tile.length)
                    {
                        break;
                    }
                    anchor anchor1 = tile[k];
                    j = i;
                    if (anchor1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, anchor1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (anchor != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, anchor);
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
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(1, title);
        }
        if (tile != null && tile.length > 0)
        {
            for (int i = 0; i < tile.length; i++)
            {
                mergeFrom mergefrom = tile[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
                }
            }

        }
        if (anchor != null)
        {
            codedoutputbytebuffernano.writeString(3, anchor);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
