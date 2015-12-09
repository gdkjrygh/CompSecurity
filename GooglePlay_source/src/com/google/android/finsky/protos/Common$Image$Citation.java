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

    public boolean hasTitleLocalized;
    public boolean hasUrl;
    public String titleLocalized;
    public String url;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasTitleLocalized)
            {
                i = j;
                if (titleLocalized.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(11, titleLocalized);
        }
        int k;
label1:
        {
            if (!hasUrl)
            {
                k = i;
                if (url.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(12, url);
        }
        return k;
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

            case 90: // 'Z'
                titleLocalized = codedinputbytebuffernano.readString();
                hasTitleLocalized = true;
                break;

            case 98: // 'b'
                url = codedinputbytebuffernano.readString();
                hasUrl = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTitleLocalized || !titleLocalized.equals(""))
        {
            codedoutputbytebuffernano.writeString(11, titleLocalized);
        }
        if (hasUrl || !url.equals(""))
        {
            codedoutputbytebuffernano.writeString(12, url);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        titleLocalized = "";
        hasTitleLocalized = false;
        url = "";
        hasUrl = false;
        cachedSize = -1;
    }
}
