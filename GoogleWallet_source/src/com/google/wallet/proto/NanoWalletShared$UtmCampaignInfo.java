// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletShared

public static final class clear extends ExtendableMessageNano
{

    public String utmCampaign;
    public String utmContent;
    public String utmMedium;
    public String utmSource;
    public String utmTerm;

    private clear clear()
    {
        utmCampaign = null;
        utmSource = null;
        utmMedium = null;
        utmTerm = null;
        utmContent = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                utmCampaign = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                utmSource = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                utmMedium = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                utmTerm = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                utmContent = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (utmCampaign != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, utmCampaign);
        }
        j = i;
        if (utmSource != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, utmSource);
        }
        i = j;
        if (utmMedium != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, utmMedium);
        }
        j = i;
        if (utmTerm != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, utmTerm);
        }
        i = j;
        if (utmContent != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, utmContent);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (utmCampaign != null)
        {
            codedoutputbytebuffernano.writeString(1, utmCampaign);
        }
        if (utmSource != null)
        {
            codedoutputbytebuffernano.writeString(2, utmSource);
        }
        if (utmMedium != null)
        {
            codedoutputbytebuffernano.writeString(3, utmMedium);
        }
        if (utmTerm != null)
        {
            codedoutputbytebuffernano.writeString(4, utmTerm);
        }
        if (utmContent != null)
        {
            codedoutputbytebuffernano.writeString(5, utmContent);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
