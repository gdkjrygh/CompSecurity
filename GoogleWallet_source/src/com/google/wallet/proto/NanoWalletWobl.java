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

public interface NanoWalletWobl
{
    public static final class Layout extends ExtendableMessageNano
    {

        private static volatile Layout _emptyArray[];
        public NanoCompiledWobl.Layout compiledWobl;
        public byte compiledWoblFingerprint[];
        public LayoutContextParameters contextParameters;
        public String entrypointNames[];
        public String pieceName;
        public NanoWalletAnalytics.GoogleAnalyticsScreen screen;
        public String wobl;

        private Layout clear()
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

        public static Layout[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Layout[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Layout mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        contextParameters = new LayoutContextParameters();
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
                        screen = new NanoWalletAnalytics.GoogleAnalyticsScreen();
                    }
                    codedinputbytebuffernano.readMessage(screen);
                    break;

                case 50: // '2'
                    if (compiledWobl == null)
                    {
                        compiledWobl = new NanoCompiledWobl.Layout();
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

        public Layout()
        {
            clear();
        }
    }

    public static final class LayoutContextParameters extends ExtendableMessageNano
    {

        public Integer minimumDimension;
        public Integer orientation;
        public Integer theme;
        public Integer woblVersion;

        private LayoutContextParameters clear()
        {
            woblVersion = null;
            minimumDimension = null;
            orientation = null;
            theme = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LayoutContextParameters mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       16: 67
        //                       24: 81
        //                       32: 126
        //                       40: 140;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            minimumDimension = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L7
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                orientation = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            woblVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L6:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                theme = Integer.valueOf(k);
                break;
            }
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (minimumDimension != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(2, minimumDimension.intValue());
            }
            j = i;
            if (orientation != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, orientation.intValue());
            }
            i = j;
            if (woblVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, woblVersion.intValue());
            }
            j = i;
            if (theme != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(5, theme.intValue());
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
            if (minimumDimension != null)
            {
                codedoutputbytebuffernano.writeInt32(2, minimumDimension.intValue());
            }
            if (orientation != null)
            {
                codedoutputbytebuffernano.writeInt32(3, orientation.intValue());
            }
            if (woblVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(4, woblVersion.intValue());
            }
            if (theme != null)
            {
                codedoutputbytebuffernano.writeInt32(5, theme.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LayoutContextParameters()
        {
            clear();
        }
    }

    public static final class RenderOutput extends ExtendableMessageNano
    {

        public Layout layouts[];

        private RenderOutput clear()
        {
            layouts = Layout.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RenderOutput mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    Layout alayout[];
                    int j;
                    if (layouts == null)
                    {
                        j = 0;
                    } else
                    {
                        j = layouts.length;
                    }
                    alayout = new Layout[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(layouts, 0, alayout, 0, j);
                        k = j;
                    }
                    for (; k < alayout.length - 1; k++)
                    {
                        alayout[k] = new Layout();
                        codedinputbytebuffernano.readMessage(alayout[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    alayout[k] = new Layout();
                    codedinputbytebuffernano.readMessage(alayout[k]);
                    layouts = alayout;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (layouts != null)
            {
                k = i;
                if (layouts.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= layouts.length)
                        {
                            break;
                        }
                        Layout layout = layouts[j];
                        k = i;
                        if (layout != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, layout);
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
            if (layouts != null && layouts.length > 0)
            {
                for (int i = 0; i < layouts.length; i++)
                {
                    Layout layout = layouts[i];
                    if (layout != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, layout);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RenderOutput()
        {
            clear();
        }
    }

}
