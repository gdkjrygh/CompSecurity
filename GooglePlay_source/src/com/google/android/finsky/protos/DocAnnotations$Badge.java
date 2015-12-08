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

    private static volatile expandedBadgeImage _emptyArray[];
    public String browseUrl;
    public String description;
    public expandedBadgeImage expandedBadgeImage;
    public boolean hasBrowseUrl;
    public boolean hasDescription;
    public boolean hasTextInTitleSection;
    public boolean hasTitle;
    public expandedBadgeImage image[];
    public String textInTitleSection;
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
label1:
        {
            int k = i;
            if (image != null)
            {
                k = i;
                if (image.length > 0)
                {
                    int i1 = 0;
                    do
                    {
                        k = i;
                        if (i1 >= image.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray = image[i1];
                        k = i;
                        if (_lemptyarray != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(2, _lemptyarray);
                        }
                        i1++;
                        i = k;
                    } while (true);
                }
            }
            if (!hasBrowseUrl)
            {
                i = k;
                if (browseUrl.equals(""))
                {
                    break label1;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, browseUrl);
        }
        int l;
label2:
        {
            if (!hasDescription)
            {
                l = i;
                if (description.equals(""))
                {
                    break label2;
                }
            }
            l = i + CodedOutputByteBufferNano.computeStringSize(4, description);
        }
label3:
        {
            if (!hasTextInTitleSection)
            {
                i = l;
                if (textInTitleSection.equals(""))
                {
                    break label3;
                }
            }
            i = l + CodedOutputByteBufferNano.computeStringSize(5, textInTitleSection);
        }
        l = i;
        if (expandedBadgeImage != null)
        {
            l = i + CodedOutputByteBufferNano.computeMessageSize(6, expandedBadgeImage);
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
                expandedBadgeImage aexpandedbadgeimage[];
                int j;
                if (image == null)
                {
                    j = 0;
                } else
                {
                    j = image.length;
                }
                aexpandedbadgeimage = new image[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(image, 0, aexpandedbadgeimage, 0, j);
                    k = j;
                }
                for (; k < aexpandedbadgeimage.length - 1; k++)
                {
                    aexpandedbadgeimage[k] = new image();
                    codedinputbytebuffernano.readMessage(aexpandedbadgeimage[k]);
                    codedinputbytebuffernano.readTag();
                }

                aexpandedbadgeimage[k] = new Tag();
                codedinputbytebuffernano.readMessage(aexpandedbadgeimage[k]);
                image = aexpandedbadgeimage;
                break;

            case 26: // '\032'
                browseUrl = codedinputbytebuffernano.readString();
                hasBrowseUrl = true;
                break;

            case 34: // '"'
                description = codedinputbytebuffernano.readString();
                hasDescription = true;
                break;

            case 42: // '*'
                textInTitleSection = codedinputbytebuffernano.readString();
                hasTextInTitleSection = true;
                break;

            case 50: // '2'
                if (expandedBadgeImage == null)
                {
                    expandedBadgeImage = new expandedBadgeImage();
                }
                codedinputbytebuffernano.readMessage(expandedBadgeImage);
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
        if (image != null && image.length > 0)
        {
            for (int i = 0; i < image.length; i++)
            {
                expandedBadgeImage expandedbadgeimage = image[i];
                if (expandedbadgeimage != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, expandedbadgeimage);
                }
            }

        }
        if (hasBrowseUrl || !browseUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, browseUrl);
        }
        if (hasDescription || !description.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, description);
        }
        if (hasTextInTitleSection || !textInTitleSection.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, textInTitleSection);
        }
        if (expandedBadgeImage != null)
        {
            codedoutputbytebuffernano.writeMessage(6, expandedBadgeImage);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        title = "";
        hasTitle = false;
        description = "";
        hasDescription = false;
        image = ay();
        expandedBadgeImage = null;
        browseUrl = "";
        hasBrowseUrl = false;
        textInTitleSection = "";
        hasTextInTitleSection = false;
        cachedSize = -1;
    }
}
