// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    public Float alpha;
    public String code;
    public String readableCode;
    public butes textStyleAttributes;
    public Integer type;
    public es widgetAttributes;

    private clear clear()
    {
        widgetAttributes = null;
        textStyleAttributes = null;
        type = null;
        code = null;
        readableCode = null;
        alpha = null;
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
    //                   24: 141
    //                   34: 226
    //                   42: 237
    //                   53: 248;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (widgetAttributes == null)
        {
            widgetAttributes = new es();
        }
        codedinputbytebuffernano.readMessage(widgetAttributes);
          goto _L9
_L4:
        if (textStyleAttributes == null)
        {
            textStyleAttributes = new butes();
        }
        codedinputbytebuffernano.readMessage(textStyleAttributes);
          goto _L9
_L5:
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
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            type = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        code = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        readableCode = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L8:
        alpha = Float.valueOf(codedinputbytebuffernano.readFloat());
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
        if (textStyleAttributes != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, textStyleAttributes);
        }
        i = j;
        if (type != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, type.intValue());
        }
        j = i;
        if (code != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, code);
        }
        i = j;
        if (readableCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, readableCode);
        }
        j = i;
        if (alpha != null)
        {
            j = i + CodedOutputByteBufferNano.computeFloatSize(6, alpha.floatValue());
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
        if (widgetAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
        }
        if (textStyleAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(2, textStyleAttributes);
        }
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(3, type.intValue());
        }
        if (code != null)
        {
            codedoutputbytebuffernano.writeString(4, code);
        }
        if (readableCode != null)
        {
            codedoutputbytebuffernano.writeString(5, readableCode);
        }
        if (alpha != null)
        {
            codedoutputbytebuffernano.writeFloat(6, alpha.floatValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public es()
    {
        clear();
    }
}
