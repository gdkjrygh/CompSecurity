// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public loyaltyProgramInfo loyaltyForm;
    public altyProgramInfo loyaltyProgramInfo;

    private clear clear()
    {
        loyaltyForm = null;
        loyaltyProgramInfo = null;
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
                if (loyaltyForm == null)
                {
                    loyaltyForm = new init>();
                }
                codedinputbytebuffernano.readMessage(loyaltyForm);
                break;

            case 26: // '\032'
                if (loyaltyProgramInfo == null)
                {
                    loyaltyProgramInfo = new altyProgramInfo();
                }
                codedinputbytebuffernano.readMessage(loyaltyProgramInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (loyaltyForm != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, loyaltyForm);
        }
        j = i;
        if (loyaltyProgramInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(3, loyaltyProgramInfo);
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (loyaltyForm != null)
        {
            codedoutputbytebuffernano.writeMessage(1, loyaltyForm);
        }
        if (loyaltyProgramInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, loyaltyProgramInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public altyProgramInfo()
    {
        clear();
    }
}
