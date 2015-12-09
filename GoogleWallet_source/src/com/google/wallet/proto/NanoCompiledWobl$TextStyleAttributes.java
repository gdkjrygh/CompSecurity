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

    public Float fontAlpha;
    public fontAlpha fontColor;
    public Integer fontFamily;
    public fontAlpha fontSize;
    public Integer fontStyle;
    public Integer fontWeight;
    public int textDecoration[];
    public Integer textTransform;

    private clear clear()
    {
        fontFamily = null;
        fontStyle = null;
        fontWeight = null;
        fontColor = null;
        fontSize = null;
        textTransform = null;
        textDecoration = WireFormatNano.EMPTY_INT_ARRAY;
        fontAlpha = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 100
    //                   0: 110
    //                   8: 112
    //                   16: 163
    //                   24: 207
    //                   34: 255
    //                   42: 284
    //                   48: 313
    //                   56: 367
    //                   58: 548
    //                   69: 746;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        i = codedinputbytebuffernano.readInt32();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            fontFamily = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = codedinputbytebuffernano.readInt32();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
            fontStyle = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i = codedinputbytebuffernano.readInt32();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            fontWeight = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (fontColor == null)
        {
            fontColor = new fontColor();
        }
        codedinputbytebuffernano.readMessage(fontColor);
        continue; /* Loop/switch isn't completed */
_L7:
        if (fontSize == null)
        {
            fontSize = new fontSize();
        }
        codedinputbytebuffernano.readMessage(fontSize);
        continue; /* Loop/switch isn't completed */
_L8:
        i = codedinputbytebuffernano.readInt32();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            textTransform = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        int ai[];
        int j;
        int i1;
        i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 56);
        ai = new int[i1];
        j = 0;
        i = 0;
_L18:
        if (j >= i1) goto _L14; else goto _L13
_L13:
        int j1;
        if (j != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        j1 = codedinputbytebuffernano.readInt32();
        j1;
        JVM INSTR tableswitch 0 1: default 432
    //                   0 441
    //                   1 441;
           goto _L15 _L16 _L16
_L15:
        j++;
        continue; /* Loop/switch isn't completed */
_L16:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L15; else goto _L14
_L14:
        if (i != 0)
        {
            if (textDecoration == null)
            {
                j = 0;
            } else
            {
                j = textDecoration.length;
            }
            if (j == 0 && i == i1)
            {
                textDecoration = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(textDecoration, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                textDecoration = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L18; else goto _L17
_L17:
_L10:
        int l;
        l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        j = 0;
        i = codedinputbytebuffernano.getPosition();
_L24:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readInt32())
            {
            case 0: // '\0'
            case 1: // '\001'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L20; else goto _L19
_L19:
        codedinputbytebuffernano.rewindToPosition(i);
        if (textDecoration == null)
        {
            i = 0;
        } else
        {
            i = textDecoration.length;
        }
        ai = new int[i + j];
        j = i;
        if (i != 0)
        {
            System.arraycopy(textDecoration, 0, ai, 0, i);
            j = i;
        }
_L22:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        textDecoration = ai;
_L20:
        codedinputbytebuffernano.popLimit(l);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
_L11:
        fontAlpha = Float.valueOf(codedinputbytebuffernano.readFloat());
        if (true) goto _L12; else goto _L25
_L25:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (fontFamily != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, fontFamily.intValue());
        }
        j = i;
        if (fontStyle != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, fontStyle.intValue());
        }
        i = j;
        if (fontWeight != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, fontWeight.intValue());
        }
        j = i;
        if (fontColor != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, fontColor);
        }
        int k = j;
        if (fontSize != null)
        {
            k = j + CodedOutputByteBufferNano.computeMessageSize(5, fontSize);
        }
        i = k;
        if (textTransform != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(6, textTransform.intValue());
        }
        j = i;
        if (textDecoration != null)
        {
            j = i;
            if (textDecoration.length > 0)
            {
                int l = 0;
                for (j = 0; j < textDecoration.length; j++)
                {
                    l += CodedOutputByteBufferNano.computeInt32SizeNoTag(textDecoration[j]);
                }

                j = i + l + textDecoration.length * 1;
            }
        }
        i = j;
        if (fontAlpha != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(8, fontAlpha.floatValue());
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
        if (fontFamily != null)
        {
            codedoutputbytebuffernano.writeInt32(1, fontFamily.intValue());
        }
        if (fontStyle != null)
        {
            codedoutputbytebuffernano.writeInt32(2, fontStyle.intValue());
        }
        if (fontWeight != null)
        {
            codedoutputbytebuffernano.writeInt32(3, fontWeight.intValue());
        }
        if (fontColor != null)
        {
            codedoutputbytebuffernano.writeMessage(4, fontColor);
        }
        if (fontSize != null)
        {
            codedoutputbytebuffernano.writeMessage(5, fontSize);
        }
        if (textTransform != null)
        {
            codedoutputbytebuffernano.writeInt32(6, textTransform.intValue());
        }
        if (textDecoration != null && textDecoration.length > 0)
        {
            for (int i = 0; i < textDecoration.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(7, textDecoration[i]);
            }

        }
        if (fontAlpha != null)
        {
            codedoutputbytebuffernano.writeFloat(8, fontAlpha.floatValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
