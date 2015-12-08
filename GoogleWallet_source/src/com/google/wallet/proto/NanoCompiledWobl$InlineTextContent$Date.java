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

    public String absoluteTemplate;
    public Long millisSinceEpoch;
    public Integer style;
    public timeZone textStyleAttributes;
    public String timeZone;

    private clear clear()
    {
        textStyleAttributes = null;
        millisSinceEpoch = null;
        style = null;
        absoluteTemplate = null;
        timeZone = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   16: 104
    //                   24: 118
    //                   34: 166
    //                   42: 177;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (textStyleAttributes == null)
        {
            textStyleAttributes = new it>();
        }
        codedinputbytebuffernano.readMessage(textStyleAttributes);
          goto _L8
_L4:
        millisSinceEpoch = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L8
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            style = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        absoluteTemplate = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        timeZone = codedinputbytebuffernano.readString();
        if (true) goto _L8; else goto _L9
_L9:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (textStyleAttributes != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, textStyleAttributes);
        }
        j = i;
        if (millisSinceEpoch != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, millisSinceEpoch.longValue());
        }
        i = j;
        if (style != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, style.intValue());
        }
        j = i;
        if (absoluteTemplate != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, absoluteTemplate);
        }
        i = j;
        if (timeZone != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, timeZone);
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
        if (textStyleAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, textStyleAttributes);
        }
        if (millisSinceEpoch != null)
        {
            codedoutputbytebuffernano.writeInt64(2, millisSinceEpoch.longValue());
        }
        if (style != null)
        {
            codedoutputbytebuffernano.writeInt32(3, style.intValue());
        }
        if (absoluteTemplate != null)
        {
            codedoutputbytebuffernano.writeString(4, absoluteTemplate);
        }
        if (timeZone != null)
        {
            codedoutputbytebuffernano.writeString(5, timeZone);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
