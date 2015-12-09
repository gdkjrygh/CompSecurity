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
//            DocDetails

public static final class cachedSize extends MessageNano
{

    public boolean hasTitle;
    public ection section[];
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
        int l = i;
        if (section != null)
        {
            l = i;
            if (section.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= section.length)
                    {
                        break;
                    }
                    ection ection = section[k];
                    l = i;
                    if (ection != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(2, ection);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                ection aection[];
                int j;
                if (section == null)
                {
                    j = 0;
                } else
                {
                    j = section.length;
                }
                aection = new ection[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(section, 0, aection, 0, j);
                    k = j;
                }
                for (; k < aection.length - 1; k++)
                {
                    aection[k] = new ection();
                    codedinputbytebuffernano.readMessage(aection[k]);
                    codedinputbytebuffernano.readTag();
                }

                aection[k] = new ection();
                codedinputbytebuffernano.readMessage(aection[k]);
                section = aection;
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
        if (section != null && section.length > 0)
        {
            for (int i = 0; i < section.length; i++)
            {
                ection ection = section[i];
                if (ection != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, ection);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ection()
    {
        title = "";
        hasTitle = false;
        section = ection.emptyArray();
        cachedSize = -1;
    }
}
