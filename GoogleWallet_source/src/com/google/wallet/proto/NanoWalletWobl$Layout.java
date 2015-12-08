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
//            NanoWalletWobl

public static final class clear extends ExtendableMessageNano
{

    private static volatile Nano _emptyArray[];
    public t compiledWobl;
    public byte compiledWoblFingerprint[];
    public ontextParameters contextParameters;
    public String entrypointNames[];
    public String pieceName;
    public ogleAnalyticsScreen screen;
    public String wobl;

    private  clear()
    {
        pieceName = null;
        wobl = null;
        contextParameters = null;
        entrypointNames = WireFormatNano.EMPTY_STRING_ARRAY;
        screen = null;
        compiledWobl = null;
        compiledWoblFingerprint = null;
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

    private ano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                pieceName = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                wobl = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (contextParameters == null)
                {
                    contextParameters = new ontextParameters();
                }
                codedinputbytebuffernano.readMessage(contextParameters);
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                String as[];
                int j;
                if (entrypointNames == null)
                {
                    j = 0;
                } else
                {
                    j = entrypointNames.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(entrypointNames, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                entrypointNames = as;
                break;

            case 42: // '*'
                if (screen == null)
                {
                    screen = new ogleAnalyticsScreen();
                }
                codedinputbytebuffernano.readMessage(screen);
                break;

            case 50: // '2'
                if (compiledWobl == null)
                {
                    compiledWobl = new t();
                }
                codedinputbytebuffernano.readMessage(compiledWobl);
                break;

            case 58: // ':'
                compiledWoblFingerprint = codedinputbytebuffernano.readBytes();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (pieceName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, pieceName);
        }
        j = i;
        if (wobl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, wobl);
        }
        i = j;
        if (contextParameters != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, contextParameters);
        }
        j = i;
        if (entrypointNames != null)
        {
            j = i;
            if (entrypointNames.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < entrypointNames.length;)
                {
                    String s = entrypointNames[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (screen != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, screen);
        }
        j = i;
        if (compiledWobl != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, compiledWobl);
        }
        i = j;
        if (compiledWoblFingerprint != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(7, compiledWoblFingerprint);
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
        if (pieceName != null)
        {
            codedoutputbytebuffernano.writeString(1, pieceName);
        }
        if (wobl != null)
        {
            codedoutputbytebuffernano.writeString(2, wobl);
        }
        if (contextParameters != null)
        {
            codedoutputbytebuffernano.writeMessage(3, contextParameters);
        }
        if (entrypointNames != null && entrypointNames.length > 0)
        {
            for (int i = 0; i < entrypointNames.length; i++)
            {
                String s = entrypointNames[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(4, s);
                }
            }

        }
        if (screen != null)
        {
            codedoutputbytebuffernano.writeMessage(5, screen);
        }
        if (compiledWobl != null)
        {
            codedoutputbytebuffernano.writeMessage(6, compiledWobl);
        }
        if (compiledWoblFingerprint != null)
        {
            codedoutputbytebuffernano.writeBytes(7, compiledWoblFingerprint);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Nano()
    {
        clear();
    }
}
