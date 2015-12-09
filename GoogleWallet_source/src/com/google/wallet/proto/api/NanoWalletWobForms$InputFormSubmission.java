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
//            NanoWalletWobForms

public static final class clear extends ExtendableMessageNano
{

    public userAddedImage linkValues[];
    public userAddedImage userAddedImage[];

    private clear clear()
    {
        linkValues = ();
        userAddedImage = yArray();
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
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                cachedSize acachedsize[];
                int j;
                if (linkValues == null)
                {
                    j = 0;
                } else
                {
                    j = linkValues.length;
                }
                acachedsize = new linkValues[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(linkValues, 0, acachedsize, 0, j);
                    l = j;
                }
                for (; l < acachedsize.length - 1; l++)
                {
                    acachedsize[l] = new linkValues();
                    codedinputbytebuffernano.readMessage(acachedsize[l]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[l] = new linkValues();
                codedinputbytebuffernano.readMessage(acachedsize[l]);
                linkValues = acachedsize;
                break;

            case 18: // '\022'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize1[];
                int k;
                if (userAddedImage == null)
                {
                    k = 0;
                } else
                {
                    k = userAddedImage.length;
                }
                acachedsize1 = new userAddedImage[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(userAddedImage, 0, acachedsize1, 0, k);
                    i1 = k;
                }
                for (; i1 < acachedsize1.length - 1; i1++)
                {
                    acachedsize1[i1] = new t>();
                    codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize1[i1] = new t>();
                codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                userAddedImage = acachedsize1;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (linkValues != null)
        {
            i = j;
            if (linkValues.length > 0)
            {
                int l = 0;
                do
                {
                    i = j;
                    if (l >= linkValues.length)
                    {
                        break;
                    }
                    userAddedImage useraddedimage = linkValues[l];
                    i = j;
                    if (useraddedimage != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(1, useraddedimage);
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        int i1 = i;
        if (userAddedImage != null)
        {
            i1 = i;
            if (userAddedImage.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= userAddedImage.length)
                    {
                        break;
                    }
                    userAddedImage useraddedimage1 = userAddedImage[k];
                    i1 = i;
                    if (useraddedimage1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(2, useraddedimage1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (linkValues != null && linkValues.length > 0)
        {
            for (int i = 0; i < linkValues.length; i++)
            {
                mergeFrom mergefrom = linkValues[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        if (userAddedImage != null && userAddedImage.length > 0)
        {
            for (int j = 0; j < userAddedImage.length; j++)
            {
                mergeFrom mergefrom1 = userAddedImage[j];
                if (mergefrom1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom1);
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
