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

    public String colorThemeArgb;
    public String episodeSubtitle;
    public String episodeTitle;
    public boolean hasColorThemeArgb;
    public boolean hasEpisodeSubtitle;
    public boolean hasEpisodeTitle;
    public boolean hasSeriesSubtitle;
    public boolean hasSeriesTitle;
    public String seriesSubtitle;
    public String seriesTitle;
    public videoSnippet videoSnippet[];

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasSeriesTitle)
            {
                i = j;
                if (seriesTitle.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, seriesTitle);
        }
        int k;
label1:
        {
            if (!hasSeriesSubtitle)
            {
                k = i;
                if (seriesSubtitle.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, seriesSubtitle);
        }
label2:
        {
            if (!hasEpisodeTitle)
            {
                i = k;
                if (episodeTitle.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, episodeTitle);
        }
label3:
        {
            if (!hasEpisodeSubtitle)
            {
                k = i;
                if (episodeSubtitle.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, episodeSubtitle);
        }
label4:
        {
            if (!hasColorThemeArgb)
            {
                i = k;
                if (colorThemeArgb.equals(""))
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(5, colorThemeArgb);
        }
        int i1 = i;
        if (videoSnippet != null)
        {
            i1 = i;
            if (videoSnippet.length > 0)
            {
                int l = 0;
                do
                {
                    i1 = i;
                    if (l >= videoSnippet.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = videoSnippet[l];
                    i1 = i;
                    if (cachedsize != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(6, cachedsize);
                    }
                    l++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                seriesTitle = codedinputbytebuffernano.readString();
                hasSeriesTitle = true;
                break;

            case 18: // '\022'
                seriesSubtitle = codedinputbytebuffernano.readString();
                hasSeriesSubtitle = true;
                break;

            case 26: // '\032'
                episodeTitle = codedinputbytebuffernano.readString();
                hasEpisodeTitle = true;
                break;

            case 34: // '"'
                episodeSubtitle = codedinputbytebuffernano.readString();
                hasEpisodeSubtitle = true;
                break;

            case 42: // '*'
                colorThemeArgb = codedinputbytebuffernano.readString();
                hasColorThemeArgb = true;
                break;

            case 50: // '2'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
                 a[];
                int j;
                if (videoSnippet == null)
                {
                    j = 0;
                } else
                {
                    j = videoSnippet.length;
                }
                a = new videoSnippet[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(videoSnippet, 0, a, 0, j);
                    k = j;
                }
                for (; k < a.length - 1; k++)
                {
                    a[k] = new videoSnippet();
                    codedinputbytebuffernano.readMessage(a[k]);
                    codedinputbytebuffernano.readTag();
                }

                a[k] = new videoSnippet();
                codedinputbytebuffernano.readMessage(a[k]);
                videoSnippet = a;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasSeriesTitle || !seriesTitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, seriesTitle);
        }
        if (hasSeriesSubtitle || !seriesSubtitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, seriesSubtitle);
        }
        if (hasEpisodeTitle || !episodeTitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, episodeTitle);
        }
        if (hasEpisodeSubtitle || !episodeSubtitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, episodeSubtitle);
        }
        if (hasColorThemeArgb || !colorThemeArgb.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, colorThemeArgb);
        }
        if (videoSnippet != null && videoSnippet.length > 0)
        {
            for (int i = 0; i < videoSnippet.length; i++)
            {
                videoSnippet videosnippet = videoSnippet[i];
                if (videosnippet != null)
                {
                    codedoutputbytebuffernano.writeMessage(6, videosnippet);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        seriesTitle = "";
        hasSeriesTitle = false;
        seriesSubtitle = "";
        hasSeriesSubtitle = false;
        episodeTitle = "";
        hasEpisodeTitle = false;
        episodeSubtitle = "";
        hasEpisodeSubtitle = false;
        colorThemeArgb = "";
        hasColorThemeArgb = false;
        videoSnippet = videoSnippet();
        cachedSize = -1;
    }
}
