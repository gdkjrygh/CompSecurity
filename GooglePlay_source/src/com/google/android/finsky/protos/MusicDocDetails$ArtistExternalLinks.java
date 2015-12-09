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
//            MusicDocDetails

public static final class cachedSize extends MessageNano
{

    public String googlePlusProfileUrl;
    public boolean hasGooglePlusProfileUrl;
    public boolean hasYoutubeChannelUrl;
    public String websiteUrl[];
    public String youtubeChannelUrl;

    protected final int computeSerializedSize()
    {
        int l;
label0:
        {
            int l1 = super.computeSerializedSize();
            int i = l1;
            if (websiteUrl != null)
            {
                i = l1;
                if (websiteUrl.length > 0)
                {
                    int j1 = 0;
                    int k = 0;
                    for (i = 0; i < websiteUrl.length;)
                    {
                        String s = websiteUrl[i];
                        int k1 = j1;
                        int i1 = k;
                        if (s != null)
                        {
                            k1 = j1 + 1;
                            i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        j1 = k1;
                        k = i1;
                    }

                    i = l1 + k + j1 * 1;
                }
            }
            if (!hasGooglePlusProfileUrl)
            {
                l = i;
                if (googlePlusProfileUrl.equals(""))
                {
                    break label0;
                }
            }
            l = i + CodedOutputByteBufferNano.computeStringSize(2, googlePlusProfileUrl);
        }
        int j;
label1:
        {
            if (!hasYoutubeChannelUrl)
            {
                j = l;
                if (youtubeChannelUrl.equals(""))
                {
                    break label1;
                }
            }
            j = l + CodedOutputByteBufferNano.computeStringSize(3, youtubeChannelUrl);
        }
        return j;
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                String as[];
                int j;
                if (websiteUrl == null)
                {
                    j = 0;
                } else
                {
                    j = websiteUrl.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(websiteUrl, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                websiteUrl = as;
                break;

            case 18: // '\022'
                googlePlusProfileUrl = codedinputbytebuffernano.readString();
                hasGooglePlusProfileUrl = true;
                break;

            case 26: // '\032'
                youtubeChannelUrl = codedinputbytebuffernano.readString();
                hasYoutubeChannelUrl = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (websiteUrl != null && websiteUrl.length > 0)
        {
            for (int i = 0; i < websiteUrl.length; i++)
            {
                String s = websiteUrl[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(1, s);
                }
            }

        }
        if (hasGooglePlusProfileUrl || !googlePlusProfileUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, googlePlusProfileUrl);
        }
        if (hasYoutubeChannelUrl || !youtubeChannelUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, youtubeChannelUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        websiteUrl = WireFormatNano.EMPTY_STRING_ARRAY;
        googlePlusProfileUrl = "";
        hasGooglePlusProfileUrl = false;
        youtubeChannelUrl = "";
        hasYoutubeChannelUrl = false;
        cachedSize = -1;
    }
}
