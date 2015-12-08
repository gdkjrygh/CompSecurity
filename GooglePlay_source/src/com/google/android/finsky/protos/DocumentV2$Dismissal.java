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

    public String descriptionHtml;
    public boolean hasDescriptionHtml;
    public boolean hasUrl;
    public String url;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasUrl)
            {
                i = j;
                if (url.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, url);
        }
        int k;
label1:
        {
            if (!hasDescriptionHtml)
            {
                k = i;
                if (descriptionHtml.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, descriptionHtml);
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

            case 10: // '\n'
                url = codedinputbytebuffernano.readString();
                hasUrl = true;
                break;

            case 18: // '\022'
                descriptionHtml = codedinputbytebuffernano.readString();
                hasDescriptionHtml = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasUrl || !url.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, url);
        }
        if (hasDescriptionHtml || !descriptionHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, descriptionHtml);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        url = "";
        hasUrl = false;
        descriptionHtml = "";
        hasDescriptionHtml = false;
        cachedSize = -1;
    }
}
