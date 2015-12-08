// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface Document
{
    public static final class PlayDocument extends MessageNano
    {

        public String detailsUrl;
        public Common.Docid docid;
        public String docidStr;
        public boolean hasDetailsUrl;
        public boolean hasDocidStr;
        public boolean hasSubtitle;
        public boolean hasTitle;
        public Common.Image image[];
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
                            Common.Image image1 = image[j1];
                            l = j;
                            if (image1 != null)
                            {
                                l = j + CodedOutputByteBufferNano.computeMessageSize(5, image1);
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
                        docid = new Common.Docid();
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
                    Common.Image aimage[];
                    int j;
                    if (image == null)
                    {
                        j = 0;
                    } else
                    {
                        j = image.length;
                    }
                    aimage = new Common.Image[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(image, 0, aimage, 0, j);
                        k = j;
                    }
                    for (; k < aimage.length - 1; k++)
                    {
                        aimage[k] = new Common.Image();
                        codedinputbytebuffernano.readMessage(aimage[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aimage[k] = new Common.Image();
                    codedinputbytebuffernano.readMessage(aimage[k]);
                    image = aimage;
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
                    Common.Image image1 = image[i];
                    if (image1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, image1);
                    }
                }

            }
            if (hasDetailsUrl || !detailsUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, detailsUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlayDocument()
        {
            docid = null;
            docidStr = "";
            hasDocidStr = false;
            title = "";
            hasTitle = false;
            subtitle = "";
            hasSubtitle = false;
            image = Common.Image.emptyArray();
            detailsUrl = "";
            hasDetailsUrl = false;
            cachedSize = -1;
        }
    }

}
