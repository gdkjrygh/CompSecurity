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

    public To color;
    public To length;
    public Integer orientation;
    public To thickness;
    public butes widgetAttributes;

    private clear clear()
    {
        widgetAttributes = null;
        orientation = null;
        length = null;
        thickness = null;
        color = null;
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
    //                   26: 146
    //                   34: 175
    //                   42: 204;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (widgetAttributes == null)
        {
            widgetAttributes = new butes();
        }
        codedinputbytebuffernano.readMessage(widgetAttributes);
          goto _L8
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            orientation = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (length == null)
        {
            length = new t>();
        }
        codedinputbytebuffernano.readMessage(length);
        continue; /* Loop/switch isn't completed */
_L6:
        if (thickness == null)
        {
            thickness = new t>();
        }
        codedinputbytebuffernano.readMessage(thickness);
        continue; /* Loop/switch isn't completed */
_L7:
        if (color == null)
        {
            color = new >();
        }
        codedinputbytebuffernano.readMessage(color);
        if (true) goto _L8; else goto _L9
_L9:
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
        if (orientation != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, orientation.intValue());
        }
        i = j;
        if (length != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, length);
        }
        j = i;
        if (thickness != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, thickness);
        }
        i = j;
        if (color != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, color);
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
        if (widgetAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
        }
        if (orientation != null)
        {
            codedoutputbytebuffernano.writeInt32(2, orientation.intValue());
        }
        if (length != null)
        {
            codedoutputbytebuffernano.writeMessage(3, length);
        }
        if (thickness != null)
        {
            codedoutputbytebuffernano.writeMessage(4, thickness);
        }
        if (color != null)
        {
            codedoutputbytebuffernano.writeMessage(5, color);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public butes()
    {
        clear();
    }
}
