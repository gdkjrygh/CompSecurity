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
//            DocAnnotations

public static final class cachedSize extends MessageNano
{

    public boolean hasPurchaseDetailsHtml;
    public boolean hasPurchaseStatus;
    public boolean hasPurchaseTimestampMsec;
    public purchaseStatus offer;
    public String purchaseDetailsHtml;
    public String purchaseStatus;
    public long purchaseTimestampMsec;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int k = super.computeSerializedSize();
            if (!hasPurchaseTimestampMsec)
            {
                i = k;
                if (purchaseTimestampMsec == 0L)
                {
                    break label0;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(2, purchaseTimestampMsec);
        }
        int l;
label1:
        {
            if (!hasPurchaseDetailsHtml)
            {
                l = i;
                if (purchaseDetailsHtml.equals(""))
                {
                    break label1;
                }
            }
            l = i + CodedOutputByteBufferNano.computeStringSize(3, purchaseDetailsHtml);
        }
label2:
        {
            int j = l;
            if (offer != null)
            {
                j = l + CodedOutputByteBufferNano.computeMessageSize(5, offer);
            }
            if (!hasPurchaseStatus)
            {
                l = j;
                if (purchaseStatus.equals(""))
                {
                    break label2;
                }
            }
            l = j + CodedOutputByteBufferNano.computeStringSize(6, purchaseStatus);
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

            case 16: // '\020'
                purchaseTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                hasPurchaseTimestampMsec = true;
                break;

            case 26: // '\032'
                purchaseDetailsHtml = codedinputbytebuffernano.readString();
                hasPurchaseDetailsHtml = true;
                break;

            case 42: // '*'
                if (offer == null)
                {
                    offer = new offer();
                }
                codedinputbytebuffernano.readMessage(offer);
                break;

            case 50: // '2'
                purchaseStatus = codedinputbytebuffernano.readString();
                hasPurchaseStatus = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasPurchaseTimestampMsec || purchaseTimestampMsec != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, purchaseTimestampMsec);
        }
        if (hasPurchaseDetailsHtml || !purchaseDetailsHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, purchaseDetailsHtml);
        }
        if (offer != null)
        {
            codedoutputbytebuffernano.writeMessage(5, offer);
        }
        if (hasPurchaseStatus || !purchaseStatus.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, purchaseStatus);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        purchaseTimestampMsec = 0L;
        hasPurchaseTimestampMsec = false;
        purchaseDetailsHtml = "";
        hasPurchaseDetailsHtml = false;
        offer = null;
        purchaseStatus = "";
        hasPurchaseStatus = false;
        cachedSize = -1;
    }
}
