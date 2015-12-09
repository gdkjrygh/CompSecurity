// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoView

public static final class clear extends ExtendableMessageNano
{

    public String altImageText;
    public altImageText dateTime;
    public String imageUrl;
    public String linkUrl;
    public Integer style;
    public String text;

    private clear clear()
    {
        text = null;
        imageUrl = null;
        dateTime = null;
        linkUrl = null;
        style = null;
        altImageText = null;
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
    //                   18: 94
    //                   26: 105
    //                   34: 134
    //                   40: 145
    //                   50: 190;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        text = codedinputbytebuffernano.readString();
          goto _L9
_L4:
        imageUrl = codedinputbytebuffernano.readString();
          goto _L9
_L5:
        if (dateTime == null)
        {
            dateTime = new nit>();
        }
        codedinputbytebuffernano.readMessage(dateTime);
          goto _L9
_L6:
        linkUrl = codedinputbytebuffernano.readString();
          goto _L9
_L7:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            style = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        altImageText = codedinputbytebuffernano.readString();
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (text != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
        }
        j = i;
        if (imageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, imageUrl);
        }
        i = j;
        if (dateTime != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, dateTime);
        }
        j = i;
        if (linkUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, linkUrl);
        }
        i = j;
        if (style != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, style.intValue());
        }
        j = i;
        if (altImageText != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, altImageText);
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
        if (text != null)
        {
            codedoutputbytebuffernano.writeString(1, text);
        }
        if (imageUrl != null)
        {
            codedoutputbytebuffernano.writeString(2, imageUrl);
        }
        if (dateTime != null)
        {
            codedoutputbytebuffernano.writeMessage(3, dateTime);
        }
        if (linkUrl != null)
        {
            codedoutputbytebuffernano.writeString(4, linkUrl);
        }
        if (style != null)
        {
            codedoutputbytebuffernano.writeInt32(5, style.intValue());
        }
        if (altImageText != null)
        {
            codedoutputbytebuffernano.writeString(6, altImageText);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
