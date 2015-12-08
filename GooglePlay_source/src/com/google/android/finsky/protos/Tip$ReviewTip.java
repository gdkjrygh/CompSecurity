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
//            Tip

public static final class cachedSize extends MessageNano
{

    private static volatile ano _emptyArray[];
    public boolean hasPolarity;
    public boolean hasReviewCount;
    public boolean hasText;
    public boolean hasTipUrl;
    public int polarity;
    public long reviewCount;
    public String text;
    public String tipUrl;

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
            if (!hasTipUrl)
            {
                i = j;
                if (tipUrl.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, tipUrl);
        }
        int k;
label1:
        {
            if (!hasText)
            {
                k = i;
                if (text.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, text);
        }
label2:
        {
            if (polarity == 0)
            {
                i = k;
                if (!hasPolarity)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, polarity);
        }
label3:
        {
            if (!hasReviewCount)
            {
                k = i;
                if (reviewCount == 0L)
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt64Size(4, reviewCount);
        }
        return k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 64
    //                   10: 66
    //                   18: 82
    //                   24: 98
    //                   32: 148;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        tipUrl = codedinputbytebuffernano.readString();
        hasTipUrl = true;
          goto _L7
_L4:
        text = codedinputbytebuffernano.readString();
        hasText = true;
          goto _L7
_L5:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            polarity = j;
            hasPolarity = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        reviewCount = codedinputbytebuffernano.readRawVarint64();
        hasReviewCount = true;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTipUrl || !tipUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, tipUrl);
        }
        if (hasText || !text.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, text);
        }
        if (polarity != 0 || hasPolarity)
        {
            codedoutputbytebuffernano.writeInt32(3, polarity);
        }
        if (hasReviewCount || reviewCount != 0L)
        {
            codedoutputbytebuffernano.writeInt64(4, reviewCount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ano()
    {
        tipUrl = "";
        hasTipUrl = false;
        text = "";
        hasText = false;
        polarity = 0;
        hasPolarity = false;
        reviewCount = 0L;
        hasReviewCount = false;
        cachedSize = -1;
    }
}
