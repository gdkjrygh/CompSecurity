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

    public formSubmission formSubmission;
    public com.google.wallet.proto.est.formSubmission renderInfo;
    public formSubmission userAddedImage[];

    private clear clear()
    {
        renderInfo = null;
        userAddedImage = userAddedImage();
        formSubmission = null;
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

            case 42: // '*'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.est.renderInfo();
                }
                codedinputbytebuffernano.readMessage(renderInfo);
                break;

            case 50: // '2'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
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
                    acachedsize[k] = new userAddedImage();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new userAddedImage();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                userAddedImage = acachedsize;
                break;

            case 58: // ':'
                if (formSubmission == null)
                {
                    formSubmission = new formSubmission();
                }
                codedinputbytebuffernano.readMessage(formSubmission);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (renderInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, renderInfo);
        }
        j = i;
        if (userAddedImage != null)
        {
            j = i;
            if (userAddedImage.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= userAddedImage.length)
                    {
                        break;
                    }
                    formSubmission formsubmission = userAddedImage[k];
                    j = i;
                    if (formsubmission != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(6, formsubmission);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (formSubmission != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, formSubmission);
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
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(5, renderInfo);
        }
        if (userAddedImage != null && userAddedImage.length > 0)
        {
            for (int i = 0; i < userAddedImage.length; i++)
            {
                mergeFrom mergefrom = userAddedImage[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(6, mergefrom);
                }
            }

        }
        if (formSubmission != null)
        {
            codedoutputbytebuffernano.writeMessage(7, formSubmission);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
