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
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    public boolean hasLocalizedDescriptionHtml;
    public String localizedDescriptionHtml;
    public file oBSOLETEPlusProfile[];
    public file person[];

    protected final int computeSerializedSize()
    {
        int k;
label0:
        {
            int i = super.computeSerializedSize();
            if (!hasLocalizedDescriptionHtml)
            {
                k = i;
                if (localizedDescriptionHtml.equals(""))
                {
                    break label0;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(1, localizedDescriptionHtml);
        }
        int j = k;
        if (oBSOLETEPlusProfile != null)
        {
            j = k;
            if (oBSOLETEPlusProfile.length > 0)
            {
                int i1 = 0;
                do
                {
                    j = k;
                    if (i1 >= oBSOLETEPlusProfile.length)
                    {
                        break;
                    }
                    file file = oBSOLETEPlusProfile[i1];
                    j = k;
                    if (file != null)
                    {
                        j = k + CodedOutputByteBufferNano.computeMessageSize(2, file);
                    }
                    i1++;
                    k = j;
                } while (true);
            }
        }
        int j1 = j;
        if (person != null)
        {
            j1 = j;
            if (person.length > 0)
            {
                int l = 0;
                do
                {
                    j1 = j;
                    if (l >= person.length)
                    {
                        break;
                    }
                    file file1 = person[l];
                    j1 = j;
                    if (file1 != null)
                    {
                        j1 = j + CodedOutputByteBufferNano.computeMessageSize(3, file1);
                    }
                    l++;
                    j = j1;
                } while (true);
            }
        }
        return j1;
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
                localizedDescriptionHtml = codedinputbytebuffernano.readString();
                hasLocalizedDescriptionHtml = true;
                break;

            case 18: // '\022'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                file afile[];
                int j;
                if (oBSOLETEPlusProfile == null)
                {
                    j = 0;
                } else
                {
                    j = oBSOLETEPlusProfile.length;
                }
                afile = new file[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(oBSOLETEPlusProfile, 0, afile, 0, j);
                    l = j;
                }
                for (; l < afile.length - 1; l++)
                {
                    afile[l] = new file();
                    codedinputbytebuffernano.readMessage(afile[l]);
                    codedinputbytebuffernano.readTag();
                }

                afile[l] = new file();
                codedinputbytebuffernano.readMessage(afile[l]);
                oBSOLETEPlusProfile = afile;
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                file afile1[];
                int k;
                if (person == null)
                {
                    k = 0;
                } else
                {
                    k = person.length;
                }
                afile1 = new person[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(person, 0, afile1, 0, k);
                    i1 = k;
                }
                for (; i1 < afile1.length - 1; i1++)
                {
                    afile1[i1] = new person();
                    codedinputbytebuffernano.readMessage(afile1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                afile1[i1] = new age();
                codedinputbytebuffernano.readMessage(afile1[i1]);
                person = afile1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasLocalizedDescriptionHtml || !localizedDescriptionHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, localizedDescriptionHtml);
        }
        if (oBSOLETEPlusProfile != null && oBSOLETEPlusProfile.length > 0)
        {
            for (int i = 0; i < oBSOLETEPlusProfile.length; i++)
            {
                file file = oBSOLETEPlusProfile[i];
                if (file != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, file);
                }
            }

        }
        if (person != null && person.length > 0)
        {
            for (int j = 0; j < person.length; j++)
            {
                file file1 = person[j];
                if (file1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, file1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public file()
    {
        localizedDescriptionHtml = "";
        hasLocalizedDescriptionHtml = false;
        person = ay();
        oBSOLETEPlusProfile = file.emptyArray();
        cachedSize = -1;
    }
}
