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
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    public String clickUrl;
    public boolean hasClickUrl;
    public boolean hasSnowBadgeText;
    public boolean hasSnowText;
    public String snowBadgeText;
    public String snowText;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasClickUrl)
            {
                i = j;
                if (clickUrl.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, clickUrl);
        }
        int k;
label1:
        {
            if (!hasSnowText)
            {
                k = i;
                if (snowText.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, snowText);
        }
label2:
        {
            if (!hasSnowBadgeText)
            {
                i = k;
                if (snowBadgeText.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, snowBadgeText);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                clickUrl = codedinputbytebuffernano.readString();
                hasClickUrl = true;
                break;

            case 18: // '\022'
                snowText = codedinputbytebuffernano.readString();
                hasSnowText = true;
                break;

            case 26: // '\032'
                snowBadgeText = codedinputbytebuffernano.readString();
                hasSnowBadgeText = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasClickUrl || !clickUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, clickUrl);
        }
        if (hasSnowText || !snowText.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, snowText);
        }
        if (hasSnowBadgeText || !snowBadgeText.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, snowBadgeText);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public o()
    {
        clickUrl = "";
        hasClickUrl = false;
        snowText = "";
        hasSnowText = false;
        snowBadgeText = "";
        hasSnowBadgeText = false;
        cachedSize = -1;
    }
}
