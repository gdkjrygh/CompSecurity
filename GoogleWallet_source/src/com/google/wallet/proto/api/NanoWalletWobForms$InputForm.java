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

    public essage introMessage;
    public  linkPrompts[];
    public ImagePrefill userAddedImagePrefill[];

    private clear clear()
    {
        introMessage = null;
        linkPrompts = .emptyArray();
        userAddedImagePrefill = ImagePrefill.emptyArray();
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
                if (introMessage == null)
                {
                    introMessage = new nit>();
                }
                codedinputbytebuffernano.readMessage(introMessage);
                break;

            case 18: // '\022'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                 a[];
                int j;
                if (linkPrompts == null)
                {
                    j = 0;
                } else
                {
                    j = linkPrompts.length;
                }
                a = new [j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(linkPrompts, 0, a, 0, j);
                    l = j;
                }
                for (; l < a.length - 1; l++)
                {
                    a[l] = new ();
                    codedinputbytebuffernano.readMessage(a[l]);
                    codedinputbytebuffernano.readTag();
                }

                a[l] = new ();
                codedinputbytebuffernano.readMessage(a[l]);
                linkPrompts = a;
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                ImagePrefill aimageprefill[];
                int k;
                if (userAddedImagePrefill == null)
                {
                    k = 0;
                } else
                {
                    k = userAddedImagePrefill.length;
                }
                aimageprefill = new ImagePrefill[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(userAddedImagePrefill, 0, aimageprefill, 0, k);
                    i1 = k;
                }
                for (; i1 < aimageprefill.length - 1; i1++)
                {
                    aimageprefill[i1] = new ImagePrefill();
                    codedinputbytebuffernano.readMessage(aimageprefill[i1]);
                    codedinputbytebuffernano.readTag();
                }

                aimageprefill[i1] = new ImagePrefill();
                codedinputbytebuffernano.readMessage(aimageprefill[i1]);
                userAddedImagePrefill = aimageprefill;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (introMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, introMessage);
        }
        i = j;
        if (linkPrompts != null)
        {
            i = j;
            if (linkPrompts.length > 0)
            {
                int l = 0;
                do
                {
                    i = j;
                    if (l >= linkPrompts.length)
                    {
                        break;
                    }
                      = linkPrompts[l];
                    i = j;
                    if ( != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(2, );
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        int i1 = i;
        if (userAddedImagePrefill != null)
        {
            i1 = i;
            if (userAddedImagePrefill.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= userAddedImagePrefill.length)
                    {
                        break;
                    }
                    ImagePrefill imageprefill = userAddedImagePrefill[k];
                    i1 = i;
                    if (imageprefill != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, imageprefill);
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
        if (introMessage != null)
        {
            codedoutputbytebuffernano.writeMessage(1, introMessage);
        }
        if (linkPrompts != null && linkPrompts.length > 0)
        {
            for (int i = 0; i < linkPrompts.length; i++)
            {
                  = linkPrompts[i];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, );
                }
            }

        }
        if (userAddedImagePrefill != null && userAddedImagePrefill.length > 0)
        {
            for (int j = 0; j < userAddedImagePrefill.length; j++)
            {
                ImagePrefill imageprefill = userAddedImagePrefill[j];
                if (imageprefill != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, imageprefill);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ImagePrefill()
    {
        clear();
    }
}
