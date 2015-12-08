// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{
    public static final class Padding extends ExtendableMessageNano
    {

        public NanoCompiledWobl.Length bottom;
        public NanoCompiledWobl.Length left;
        public NanoCompiledWobl.Length right;
        public NanoCompiledWobl.Length top;

        private Padding clear()
        {
            top = null;
            right = null;
            bottom = null;
            left = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Padding mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (top == null)
                    {
                        top = new NanoCompiledWobl.Length();
                    }
                    codedinputbytebuffernano.readMessage(top);
                    break;

                case 18: // '\022'
                    if (right == null)
                    {
                        right = new NanoCompiledWobl.Length();
                    }
                    codedinputbytebuffernano.readMessage(right);
                    break;

                case 26: // '\032'
                    if (bottom == null)
                    {
                        bottom = new NanoCompiledWobl.Length();
                    }
                    codedinputbytebuffernano.readMessage(bottom);
                    break;

                case 34: // '"'
                    if (left == null)
                    {
                        left = new NanoCompiledWobl.Length();
                    }
                    codedinputbytebuffernano.readMessage(left);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (top != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, top);
            }
            j = i;
            if (right != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, right);
            }
            i = j;
            if (bottom != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, bottom);
            }
            j = i;
            if (left != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, left);
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
            if (top != null)
            {
                codedoutputbytebuffernano.writeMessage(1, top);
            }
            if (right != null)
            {
                codedoutputbytebuffernano.writeMessage(2, right);
            }
            if (bottom != null)
            {
                codedoutputbytebuffernano.writeMessage(3, bottom);
            }
            if (left != null)
            {
                codedoutputbytebuffernano.writeMessage(4, left);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Padding()
        {
            clear();
        }
    }


    public layoutAttributes backgroundColor;
    public Integer horizontalAlign;
    public layoutAttributes layoutAttributes;
    public Padding padding;
    public Padding tapUri[];
    public Integer verticalAlign;
    public Float zDepthInDps;

    private Padding.left clear()
    {
        backgroundColor = null;
        padding = null;
        horizontalAlign = null;
        verticalAlign = null;
        tapUri = ();
        zDepthInDps = null;
        layoutAttributes = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L10:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 120
    //                   24: 149
    //                   32: 202
    //                   42: 250
    //                   53: 374
    //                   58: 388;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (backgroundColor == null)
        {
            backgroundColor = new backgroundColor();
        }
        codedinputbytebuffernano.readMessage(backgroundColor);
          goto _L10
_L4:
        if (padding == null)
        {
            padding = new Padding();
        }
        codedinputbytebuffernano.readMessage(padding);
          goto _L10
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            horizontalAlign = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            verticalAlign = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
        cachedSize acachedsize[];
        int l;
        if (tapUri == null)
        {
            l = 0;
        } else
        {
            l = tapUri.length;
        }
        acachedsize = new tapUri[l + i1];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(tapUri, 0, acachedsize, 0, l);
            i1 = l;
        }
        for (; i1 < acachedsize.length - 1; i1++)
        {
            acachedsize[i1] = new tapUri();
            codedinputbytebuffernano.readMessage(acachedsize[i1]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[i1] = new age();
        codedinputbytebuffernano.readMessage(acachedsize[i1]);
        tapUri = acachedsize;
        continue; /* Loop/switch isn't completed */
_L8:
        zDepthInDps = Float.valueOf(codedinputbytebuffernano.readFloat());
        continue; /* Loop/switch isn't completed */
_L9:
        if (layoutAttributes == null)
        {
            layoutAttributes = new <init>();
        }
        codedinputbytebuffernano.readMessage(layoutAttributes);
        if (true) goto _L10; else goto _L11
_L11:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (backgroundColor != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, backgroundColor);
        }
        j = i;
        if (padding != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, padding);
        }
        int k = j;
        if (horizontalAlign != null)
        {
            k = j + CodedOutputByteBufferNano.computeInt32Size(3, horizontalAlign.intValue());
        }
        i = k;
        if (verticalAlign != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(4, verticalAlign.intValue());
        }
        j = i;
        if (tapUri != null)
        {
            j = i;
            if (tapUri.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= tapUri.length)
                    {
                        break;
                    }
                    layoutAttributes layoutattributes = tapUri[l];
                    j = i;
                    if (layoutattributes != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(5, layoutattributes);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zDepthInDps != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(6, zDepthInDps.floatValue());
        }
        j = i;
        if (layoutAttributes != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(7, layoutAttributes);
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
        if (backgroundColor != null)
        {
            codedoutputbytebuffernano.writeMessage(1, backgroundColor);
        }
        if (padding != null)
        {
            codedoutputbytebuffernano.writeMessage(2, padding);
        }
        if (horizontalAlign != null)
        {
            codedoutputbytebuffernano.writeInt32(3, horizontalAlign.intValue());
        }
        if (verticalAlign != null)
        {
            codedoutputbytebuffernano.writeInt32(4, verticalAlign.intValue());
        }
        if (tapUri != null && tapUri.length > 0)
        {
            for (int i = 0; i < tapUri.length; i++)
            {
                mergeFrom mergefrom = tapUri[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, mergefrom);
                }
            }

        }
        if (zDepthInDps != null)
        {
            codedoutputbytebuffernano.writeFloat(6, zDepthInDps.floatValue());
        }
        if (layoutAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(7, layoutAttributes);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Padding.clear()
    {
        clear();
    }
}
