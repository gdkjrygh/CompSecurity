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

    public String colorThemeArgb;
    public String featuredHeader;
    public boolean hasColorThemeArgb;
    public boolean hasFeaturedHeader;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasFeaturedHeader)
            {
                i = j;
                if (featuredHeader.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, featuredHeader);
        }
        int k;
label1:
        {
            if (!hasColorThemeArgb)
            {
                k = i;
                if (colorThemeArgb.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, colorThemeArgb);
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
                featuredHeader = codedinputbytebuffernano.readString();
                hasFeaturedHeader = true;
                break;

            case 18: // '\022'
                colorThemeArgb = codedinputbytebuffernano.readString();
                hasColorThemeArgb = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasFeaturedHeader || !featuredHeader.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, featuredHeader);
        }
        if (hasColorThemeArgb || !colorThemeArgb.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, colorThemeArgb);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        featuredHeader = "";
        hasFeaturedHeader = false;
        colorThemeArgb = "";
        hasColorThemeArgb = false;
        cachedSize = -1;
    }
}
