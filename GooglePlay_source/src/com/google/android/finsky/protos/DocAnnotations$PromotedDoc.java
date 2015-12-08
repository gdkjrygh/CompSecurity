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
//            DocAnnotations

public static final class cachedSize extends MessageNano
{

    private static volatile detailsUrl _emptyArray[];
    public String descriptionHtml;
    public String detailsUrl;
    public boolean hasDescriptionHtml;
    public boolean hasDetailsUrl;
    public boolean hasSubtitle;
    public boolean hasTitle;
    public detailsUrl image[];
    public String subtitle;
    public String title;

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
        int k;
label0:
        {
            int i = super.computeSerializedSize();
            if (!hasTitle)
            {
                k = i;
                if (title.equals(""))
                {
                    break label0;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        int j;
label1:
        {
            if (!hasSubtitle)
            {
                j = k;
                if (subtitle.equals(""))
                {
                    break label1;
                }
            }
            j = k + CodedOutputByteBufferNano.computeStringSize(2, subtitle);
        }
label2:
        {
            k = j;
            if (image != null)
            {
                k = j;
                if (image.length > 0)
                {
                    int l = 0;
                    do
                    {
                        k = j;
                        if (l >= image.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray = image[l];
                        k = j;
                        if (_lemptyarray != null)
                        {
                            k = j + CodedOutputByteBufferNano.computeMessageSize(3, _lemptyarray);
                        }
                        l++;
                        j = k;
                    } while (true);
                }
            }
            if (!hasDescriptionHtml)
            {
                j = k;
                if (descriptionHtml.equals(""))
                {
                    break label2;
                }
            }
            j = k + CodedOutputByteBufferNano.computeStringSize(4, descriptionHtml);
        }
label3:
        {
            if (!hasDetailsUrl)
            {
                k = j;
                if (detailsUrl.equals(""))
                {
                    break label3;
                }
            }
            k = j + CodedOutputByteBufferNano.computeStringSize(5, detailsUrl);
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
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 18: // '\022'
                subtitle = codedinputbytebuffernano.readString();
                hasSubtitle = true;
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
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

                adetailsurl[k] = new e();
                codedinputbytebuffernano.readMessage(adetailsurl[k]);
                image = adetailsurl;
                break;

            case 34: // '"'
                descriptionHtml = codedinputbytebuffernano.readString();
                hasDescriptionHtml = true;
                break;

            case 42: // '*'
                detailsUrl = codedinputbytebuffernano.readString();
                hasDetailsUrl = true;
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
        if (image != null && image.length > 0)
        {
            for (int i = 0; i < image.length; i++)
            {
                hasDetailsUrl hasdetailsurl = image[i];
                if (hasdetailsurl != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, hasdetailsurl);
                }
            }

        }
        if (hasDescriptionHtml || !descriptionHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, descriptionHtml);
        }
        if (hasDetailsUrl || !detailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, detailsUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        title = "";
        hasTitle = false;
        subtitle = "";
        hasSubtitle = false;
        image = image();
        descriptionHtml = "";
        hasDescriptionHtml = false;
        detailsUrl = "";
        hasDetailsUrl = false;
        cachedSize = -1;
    }
}
