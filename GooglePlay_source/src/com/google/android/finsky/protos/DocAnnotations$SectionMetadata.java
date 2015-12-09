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

    private static volatile descriptionHtml _emptyArray[];
    public String browseUrl;
    public String descriptionHtml;
    public boolean hasBrowseUrl;
    public boolean hasDescriptionHtml;
    public boolean hasHeader;
    public boolean hasListUrl;
    public String header;
    public String listUrl;

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
            if (!hasHeader)
            {
                i = j;
                if (header.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, header);
        }
        int k;
label1:
        {
            if (!hasListUrl)
            {
                k = i;
                if (listUrl.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, listUrl);
        }
label2:
        {
            if (!hasBrowseUrl)
            {
                i = k;
                if (browseUrl.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, browseUrl);
        }
label3:
        {
            if (!hasDescriptionHtml)
            {
                k = i;
                if (descriptionHtml.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, descriptionHtml);
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
                header = codedinputbytebuffernano.readString();
                hasHeader = true;
                break;

            case 18: // '\022'
                listUrl = codedinputbytebuffernano.readString();
                hasListUrl = true;
                break;

            case 26: // '\032'
                browseUrl = codedinputbytebuffernano.readString();
                hasBrowseUrl = true;
                break;

            case 34: // '"'
                descriptionHtml = codedinputbytebuffernano.readString();
                hasDescriptionHtml = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasHeader || !header.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, header);
        }
        if (hasListUrl || !listUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, listUrl);
        }
        if (hasBrowseUrl || !browseUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, browseUrl);
        }
        if (hasDescriptionHtml || !descriptionHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, descriptionHtml);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        header = "";
        hasHeader = false;
        descriptionHtml = "";
        hasDescriptionHtml = false;
        listUrl = "";
        hasListUrl = false;
        browseUrl = "";
        hasBrowseUrl = false;
        cachedSize = -1;
    }
}
