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
//            Rating

public static final class cachedSize extends MessageNano
{

    private static volatile erNano _emptyArray[];
    public boolean hasLanguage;
    public boolean hasPolarity;
    public boolean hasReviewCount;
    public boolean hasText;
    public boolean hasTipId;
    public String language;
    public int polarity;
    public long reviewCount;
    public String text;
    public String tipId;

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
            if (!hasTipId)
            {
                i = j;
                if (tipId.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, tipId);
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
label4:
        {
            if (!hasLanguage)
            {
                i = k;
                if (language.equals(""))
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(5, language);
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
    //                   10: 74
    //                   18: 90
    //                   24: 106
    //                   32: 156
    //                   42: 172;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        tipId = codedinputbytebuffernano.readString();
        hasTipId = true;
          goto _L8
_L4:
        text = codedinputbytebuffernano.readString();
        hasText = true;
          goto _L8
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
        continue; /* Loop/switch isn't completed */
_L7:
        language = codedinputbytebuffernano.readString();
        hasLanguage = true;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTipId || !tipId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, tipId);
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
        if (hasLanguage || !language.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, language);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public erNano()
    {
        tipId = "";
        hasTipId = false;
        text = "";
        hasText = false;
        polarity = 0;
        hasPolarity = false;
        reviewCount = 0L;
        hasReviewCount = false;
        language = "";
        hasLanguage = false;
        cachedSize = -1;
    }
}
