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
//            MusicDocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile externalLinks _emptyArray[];
    public String detailsUrl;
    public Links externalLinks;
    public boolean hasDetailsUrl;
    public boolean hasName;
    public String name;

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
            if (!hasDetailsUrl)
            {
                i = j;
                if (detailsUrl.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, detailsUrl);
        }
        int k;
label1:
        {
            if (!hasName)
            {
                k = i;
                if (name.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, name);
        }
        i = k;
        if (externalLinks != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(3, externalLinks);
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
                detailsUrl = codedinputbytebuffernano.readString();
                hasDetailsUrl = true;
                break;

            case 18: // '\022'
                name = codedinputbytebuffernano.readString();
                hasName = true;
                break;

            case 26: // '\032'
                if (externalLinks == null)
                {
                    externalLinks = new Links();
                }
                codedinputbytebuffernano.readMessage(externalLinks);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDetailsUrl || !detailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, detailsUrl);
        }
        if (hasName || !name.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, name);
        }
        if (externalLinks != null)
        {
            codedoutputbytebuffernano.writeMessage(3, externalLinks);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Links()
    {
        detailsUrl = "";
        hasDetailsUrl = false;
        name = "";
        hasName = false;
        externalLinks = null;
        cachedSize = -1;
    }
}
