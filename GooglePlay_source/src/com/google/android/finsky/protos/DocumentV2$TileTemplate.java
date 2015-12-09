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

    public String colorTextArgb;
    public String colorThemeArgb;
    public boolean hasColorTextArgb;
    public boolean hasColorThemeArgb;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasColorThemeArgb)
            {
                i = j;
                if (colorThemeArgb.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, colorThemeArgb);
        }
        int k;
label1:
        {
            if (!hasColorTextArgb)
            {
                k = i;
                if (colorTextArgb.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, colorTextArgb);
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
                colorThemeArgb = codedinputbytebuffernano.readString();
                hasColorThemeArgb = true;
                break;

            case 18: // '\022'
                colorTextArgb = codedinputbytebuffernano.readString();
                hasColorTextArgb = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasColorThemeArgb || !colorThemeArgb.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, colorThemeArgb);
        }
        if (hasColorTextArgb || !colorTextArgb.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, colorTextArgb);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        colorThemeArgb = "";
        hasColorThemeArgb = false;
        colorTextArgb = "";
        hasColorTextArgb = false;
        cachedSize = -1;
    }
}
