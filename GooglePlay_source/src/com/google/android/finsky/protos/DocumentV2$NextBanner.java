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
    public boolean hasColorTextArgb;
    public boolean hasSubtitle;
    public boolean hasTitle;
    public String subtitle;
    public String title;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasTitle)
            {
                i = j;
                if (title.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        int k;
label1:
        {
            if (!hasSubtitle)
            {
                k = i;
                if (subtitle.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, subtitle);
        }
label2:
        {
            if (!hasColorTextArgb)
            {
                i = k;
                if (colorTextArgb.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, colorTextArgb);
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
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 18: // '\022'
                subtitle = codedinputbytebuffernano.readString();
                hasSubtitle = true;
                break;

            case 26: // '\032'
                colorTextArgb = codedinputbytebuffernano.readString();
                hasColorTextArgb = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, title);
        }
        if (hasSubtitle || !subtitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, subtitle);
        }
        if (hasColorTextArgb || !colorTextArgb.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, colorTextArgb);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        title = "";
        hasTitle = false;
        subtitle = "";
        hasSubtitle = false;
        colorTextArgb = "";
        hasColorTextArgb = false;
        cachedSize = -1;
    }
}
