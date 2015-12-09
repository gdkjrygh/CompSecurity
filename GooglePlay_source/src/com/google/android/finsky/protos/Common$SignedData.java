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
//            Common

public static final class cachedSize extends MessageNano
{

    public boolean hasSignature;
    public boolean hasSignedData;
    public String signature;
    public String signedData;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasSignedData)
            {
                i = j;
                if (signedData.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, signedData);
        }
        int k;
label1:
        {
            if (!hasSignature)
            {
                k = i;
                if (signature.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, signature);
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
                signedData = codedinputbytebuffernano.readString();
                hasSignedData = true;
                break;

            case 18: // '\022'
                signature = codedinputbytebuffernano.readString();
                hasSignature = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasSignedData || !signedData.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, signedData);
        }
        if (hasSignature || !signature.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, signature);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        signedData = "";
        hasSignedData = false;
        signature = "";
        hasSignature = false;
        cachedSize = -1;
    }
}
