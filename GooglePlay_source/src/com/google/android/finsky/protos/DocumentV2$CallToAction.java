// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    private static volatile link _emptyArray[];
    public link buttonIcon;
    public String buttonText;
    public String dismissalUrl;
    public boolean hasButtonText;
    public boolean hasDismissalUrl;
    public boolean hasType;
    public link link;
    public int type;

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

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (type == 1)
            {
                i = j;
                if (!hasType)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
        }
        int k;
label1:
        {
            if (!hasButtonText)
            {
                k = i;
                if (buttonText.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, buttonText);
        }
label2:
        {
            i = k;
            if (buttonIcon != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(3, buttonIcon);
            }
            if (!hasDismissalUrl)
            {
                k = i;
                if (dismissalUrl.equals(""))
                {
                    break label2;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, dismissalUrl);
        }
        i = k;
        if (link != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(5, link);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 72
    //                   8: 74
    //                   18: 124
    //                   26: 140
    //                   34: 169
    //                   42: 185;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            type = j;
            hasType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        buttonText = codedinputbytebuffernano.readString();
        hasButtonText = true;
        continue; /* Loop/switch isn't completed */
_L5:
        if (buttonIcon == null)
        {
            buttonIcon = new buttonIcon();
        }
        codedinputbytebuffernano.readMessage(buttonIcon);
        continue; /* Loop/switch isn't completed */
_L6:
        dismissalUrl = codedinputbytebuffernano.readString();
        hasDismissalUrl = true;
        continue; /* Loop/switch isn't completed */
_L7:
        if (link == null)
        {
            link = new t>();
        }
        codedinputbytebuffernano.readMessage(link);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (type != 1 || hasType)
        {
            codedoutputbytebuffernano.writeInt32(1, type);
        }
        if (hasButtonText || !buttonText.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, buttonText);
        }
        if (buttonIcon != null)
        {
            codedoutputbytebuffernano.writeMessage(3, buttonIcon);
        }
        if (hasDismissalUrl || !dismissalUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, dismissalUrl);
        }
        if (link != null)
        {
            codedoutputbytebuffernano.writeMessage(5, link);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        type = 1;
        hasType = false;
        buttonText = "";
        hasButtonText = false;
        buttonIcon = null;
        dismissalUrl = "";
        hasDismissalUrl = false;
        link = null;
        cachedSize = -1;
    }
}
