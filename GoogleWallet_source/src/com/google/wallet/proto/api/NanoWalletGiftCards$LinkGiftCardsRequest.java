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
//            NanoWalletGiftCards

public static final class clear extends ExtendableMessageNano
{

    public String discoverableId;
    public userAddedImage formSubmission;
    public com.google.wallet.proto.n renderInfo;
    public userAddedImage userAddedImage[];

    private clear clear()
    {
        discoverableId = null;
        renderInfo = null;
        formSubmission = null;
        userAddedImage = rray();
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
                discoverableId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.it>();
                }
                codedinputbytebuffernano.readMessage(renderInfo);
                break;

            case 26: // '\032'
                if (formSubmission == null)
                {
                    formSubmission = new nit>();
                }
                codedinputbytebuffernano.readMessage(formSubmission);
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                cachedSize acachedsize[];
                int j;
                if (userAddedImage == null)
                {
                    j = 0;
                } else
                {
                    j = userAddedImage.length;
                }
                acachedsize = new userAddedImage[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(userAddedImage, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new ();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new ();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                userAddedImage = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (discoverableId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, discoverableId);
        }
        j = i;
        if (renderInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
        }
        i = j;
        if (formSubmission != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, formSubmission);
        }
        int l = i;
        if (userAddedImage != null)
        {
            l = i;
            if (userAddedImage.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= userAddedImage.length)
                    {
                        break;
                    }
                    userAddedImage useraddedimage = userAddedImage[k];
                    l = i;
                    if (useraddedimage != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(4, useraddedimage);
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
        if (discoverableId != null)
        {
            codedoutputbytebuffernano.writeString(1, discoverableId);
        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, renderInfo);
        }
        if (formSubmission != null)
        {
            codedoutputbytebuffernano.writeMessage(3, formSubmission);
        }
        if (userAddedImage != null && userAddedImage.length > 0)
        {
            for (int i = 0; i < userAddedImage.length; i++)
            {
                mergeFrom mergefrom = userAddedImage[i];
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
