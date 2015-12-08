// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public Boolean marketingOptInDefault;
    public marketingOptInDefault sharedDataConfigs[];
    public String signupIncentive;

    private clear clear()
    {
        sharedDataConfigs = sharedDataConfigs();
        signupIncentive = null;
        marketingOptInDefault = null;
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                cachedSize acachedsize[];
                int j;
                if (sharedDataConfigs == null)
                {
                    j = 0;
                } else
                {
                    j = sharedDataConfigs.length;
                }
                acachedsize = new sharedDataConfigs[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(sharedDataConfigs, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new sharedDataConfigs();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new sharedDataConfigs();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                sharedDataConfigs = acachedsize;
                break;

            case 18: // '\022'
                signupIncentive = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                marketingOptInDefault = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (sharedDataConfigs != null)
        {
            j = i;
            if (sharedDataConfigs.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= sharedDataConfigs.length)
                    {
                        break;
                    }
                    marketingOptInDefault marketingoptindefault = sharedDataConfigs[k];
                    j = i;
                    if (marketingoptindefault != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, marketingoptindefault);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (signupIncentive != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, signupIncentive);
        }
        j = i;
        if (marketingOptInDefault != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(3, marketingOptInDefault.booleanValue());
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
        if (sharedDataConfigs != null && sharedDataConfigs.length > 0)
        {
            for (int i = 0; i < sharedDataConfigs.length; i++)
            {
                mergeFrom mergefrom = sharedDataConfigs[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        if (signupIncentive != null)
        {
            codedoutputbytebuffernano.writeString(2, signupIncentive);
        }
        if (marketingOptInDefault != null)
        {
            codedoutputbytebuffernano.writeBool(3, marketingOptInDefault.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        clear();
    }
}
