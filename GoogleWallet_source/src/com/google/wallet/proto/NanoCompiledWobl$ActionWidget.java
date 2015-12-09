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

    public Integer icon;
    public Float iconAlpha;
    public tent inlineTextContent[];
    public utes textBoxAttributes;
    public ibutes textStyleAttributes;
    public tes widgetAttributes;

    private clear clear()
    {
        widgetAttributes = null;
        textBoxAttributes = null;
        textStyleAttributes = null;
        icon = null;
        iconAlpha = null;
        inlineTextContent = tent.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 112
    //                   26: 141
    //                   32: 170
    //                   45: 238
    //                   50: 252;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (widgetAttributes == null)
        {
            widgetAttributes = new tes();
        }
        codedinputbytebuffernano.readMessage(widgetAttributes);
          goto _L9
_L4:
        if (textBoxAttributes == null)
        {
            textBoxAttributes = new utes();
        }
        codedinputbytebuffernano.readMessage(textBoxAttributes);
          goto _L9
_L5:
        if (textStyleAttributes == null)
        {
            textStyleAttributes = new ibutes();
        }
        codedinputbytebuffernano.readMessage(textStyleAttributes);
          goto _L9
_L6:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            icon = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        iconAlpha = Float.valueOf(codedinputbytebuffernano.readFloat());
        continue; /* Loop/switch isn't completed */
_L8:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
        tent atent[];
        int k;
        if (inlineTextContent == null)
        {
            k = 0;
        } else
        {
            k = inlineTextContent.length;
        }
        atent = new tent[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(inlineTextContent, 0, atent, 0, k);
            l = k;
        }
        for (; l < atent.length - 1; l++)
        {
            atent[l] = new tent();
            codedinputbytebuffernano.readMessage(atent[l]);
            codedinputbytebuffernano.readTag();
        }

        atent[l] = new tent();
        codedinputbytebuffernano.readMessage(atent[l]);
        inlineTextContent = atent;
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (widgetAttributes != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
        }
        j = i;
        if (textBoxAttributes != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, textBoxAttributes);
        }
        i = j;
        if (textStyleAttributes != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, textStyleAttributes);
        }
        j = i;
        if (icon != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, icon.intValue());
        }
        i = j;
        if (iconAlpha != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(5, iconAlpha.floatValue());
        }
        int l = i;
        if (inlineTextContent != null)
        {
            l = i;
            if (inlineTextContent.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= inlineTextContent.length)
                    {
                        break;
                    }
                    tent tent = inlineTextContent[k];
                    l = i;
                    if (tent != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(6, tent);
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
        if (widgetAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
        }
        if (textBoxAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(2, textBoxAttributes);
        }
        if (textStyleAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(3, textStyleAttributes);
        }
        if (icon != null)
        {
            codedoutputbytebuffernano.writeInt32(4, icon.intValue());
        }
        if (iconAlpha != null)
        {
            codedoutputbytebuffernano.writeFloat(5, iconAlpha.floatValue());
        }
        if (inlineTextContent != null && inlineTextContent.length > 0)
        {
            for (int i = 0; i < inlineTextContent.length; i++)
            {
                tent tent = inlineTextContent[i];
                if (tent != null)
                {
                    codedoutputbytebuffernano.writeMessage(6, tent);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public tes()
    {
        clear();
    }
}
