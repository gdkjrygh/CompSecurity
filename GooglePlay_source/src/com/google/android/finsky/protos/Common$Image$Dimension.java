// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    public int aspectRatio;
    public boolean hasAspectRatio;
    public boolean hasHeight;
    public boolean hasWidth;
    public int height;
    public int width;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasWidth)
            {
                i = j;
                if (width == 0)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, width);
        }
        int k;
label1:
        {
            if (!hasHeight)
            {
                k = i;
                if (height == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(4, height);
        }
label2:
        {
            if (aspectRatio == 0)
            {
                i = k;
                if (!hasAspectRatio)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(18, aspectRatio);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   24: 58
    //                   32: 74
    //                   144: 90;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        width = codedinputbytebuffernano.readRawVarint32();
        hasWidth = true;
          goto _L6
_L4:
        height = codedinputbytebuffernano.readRawVarint32();
        hasHeight = true;
          goto _L6
_L5:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            aspectRatio = j;
            hasAspectRatio = true;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasWidth || width != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, width);
        }
        if (hasHeight || height != 0)
        {
            codedoutputbytebuffernano.writeInt32(4, height);
        }
        if (aspectRatio != 0 || hasAspectRatio)
        {
            codedoutputbytebuffernano.writeInt32(18, aspectRatio);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        width = 0;
        hasWidth = false;
        height = 0;
        hasHeight = false;
        aspectRatio = 0;
        hasAspectRatio = false;
        cachedSize = -1;
    }
}
