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

    public Boolean enableCamera;
    public String identifierLabel;
    public Integer identifierTypeOrdinal;
    public sharedDataConfigs sharedDataConfigs[];

    private clear clear()
    {
        identifierTypeOrdinal = null;
        identifierLabel = null;
        enableCamera = null;
        sharedDataConfigs = sharedDataConfigs();
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

            case 8: // '\b'
                identifierTypeOrdinal = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 18: // '\022'
                identifierLabel = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                enableCamera = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
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
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (identifierTypeOrdinal != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, identifierTypeOrdinal.intValue());
        }
        j = i;
        if (identifierLabel != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, identifierLabel);
        }
        i = j;
        if (enableCamera != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, enableCamera.booleanValue());
        }
        int l = i;
        if (sharedDataConfigs != null)
        {
            l = i;
            if (sharedDataConfigs.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= sharedDataConfigs.length)
                    {
                        break;
                    }
                    sharedDataConfigs shareddataconfigs = sharedDataConfigs[k];
                    l = i;
                    if (shareddataconfigs != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(4, shareddataconfigs);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (identifierTypeOrdinal != null)
        {
            codedoutputbytebuffernano.writeInt32(1, identifierTypeOrdinal.intValue());
        }
        if (identifierLabel != null)
        {
            codedoutputbytebuffernano.writeString(2, identifierLabel);
        }
        if (enableCamera != null)
        {
            codedoutputbytebuffernano.writeBool(3, enableCamera.booleanValue());
        }
        if (sharedDataConfigs != null && sharedDataConfigs.length > 0)
        {
            for (int i = 0; i < sharedDataConfigs.length; i++)
            {
                mergeFrom mergefrom = sharedDataConfigs[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, mergefrom);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
