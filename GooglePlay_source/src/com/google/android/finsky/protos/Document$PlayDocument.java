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
//            Document

public static final class cachedSize extends MessageNano
{

    public String detailsUrl;
    public detailsUrl docid;
    public String docidStr;
    public boolean hasDetailsUrl;
    public boolean hasDocidStr;
    public boolean hasSubtitle;
    public boolean hasTitle;
    public detailsUrl image[];
    public String subtitle;
    public String title;

    protected final int computeSerializedSize()
    {
        int k;
label0:
        {
            k = super.computeSerializedSize();
            int i = k;
            if (docid != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(1, docid);
            }
            if (!hasDocidStr)
            {
                k = i;
                if (docidStr.equals(""))
                {
                    break label0;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, docidStr);
        }
        int i1;
label1:
        {
            if (!hasTitle)
            {
                i1 = k;
                if (title.equals(""))
                {
                    break label1;
                }
            }
            i1 = k + CodedOutputByteBufferNano.computeStringSize(3, title);
        }
        int j;
label2:
        {
            if (!hasSubtitle)
            {
                j = i1;
                if (subtitle.equals(""))
                {
                    break label2;
                }
            }
            j = i1 + CodedOutputByteBufferNano.computeStringSize(4, subtitle);
        }
label3:
        {
            int l = j;
            if (image != null)
            {
                l = j;
                if (image.length > 0)
                {
                    int j1 = 0;
                    do
                    {
                        l = j;
                        if (j1 >= image.length)
                        {
                            break;
                        }
                        cachedSize cachedsize = image[j1];
                        l = j;
                        if (cachedsize != null)
                        {
                            l = j + CodedOutputByteBufferNano.computeMessageSize(5, cachedsize);
                        }
                        j1++;
                        j = l;
                    } while (true);
                }
            }
            if (!hasDetailsUrl)
            {
                j = l;
                if (detailsUrl.equals(""))
                {
                    break label3;
                }
            }
            j = l + CodedOutputByteBufferNano.computeStringSize(6, detailsUrl);
        }
        return j;
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
                if (docid == null)
                {
                    docid = new docid();
                }
                codedinputbytebuffernano.readMessage(docid);
                break;

            case 18: // '\022'
                docidStr = codedinputbytebuffernano.readString();
                hasDocidStr = true;
                break;

            case 26: // '\032'
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 34: // '"'
                subtitle = codedinputbytebuffernano.readString();
                hasSubtitle = true;
                break;

            case 42: // '*'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                detailsUrl adetailsurl[];
                int j;
                if (image == null)
                {
                    j = 0;
                } else
                {
                    j = image.length;
                }
                adetailsurl = new image[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(image, 0, adetailsurl, 0, j);
                    k = j;
                }
                for (; k < adetailsurl.length - 1; k++)
                {
                    adetailsurl[k] = new image();
                    codedinputbytebuffernano.readMessage(adetailsurl[k]);
                    codedinputbytebuffernano.readTag();
                }

                adetailsurl[k] = new ag();
                codedinputbytebuffernano.readMessage(adetailsurl[k]);
                image = adetailsurl;
                break;

            case 50: // '2'
                detailsUrl = codedinputbytebuffernano.readString();
                hasDetailsUrl = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (docid != null)
        {
            codedoutputbytebuffernano.writeMessage(1, docid);
        }
        if (hasDocidStr || !docidStr.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, docidStr);
        }
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, title);
        }
        if (hasSubtitle || !subtitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, subtitle);
        }
        if (image != null && image.length > 0)
        {
            for (int i = 0; i < image.length; i++)
            {
                hasDetailsUrl hasdetailsurl = image[i];
                if (hasdetailsurl != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, hasdetailsurl);
                }
            }

        }
        if (hasDetailsUrl || !detailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, detailsUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        docid = null;
        docidStr = "";
        hasDocidStr = false;
        title = "";
        hasTitle = false;
        subtitle = "";
        hasSubtitle = false;
        image = y();
        detailsUrl = "";
        hasDetailsUrl = false;
        cachedSize = -1;
    }
}
