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
    public adata sectionAlbums;
    public adata sectionTracks;
    public String seriesSubtitle;
    public String seriesTitle;

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
        k = i;
        if (sectionTracks != null)
        {
            k = i + CodedOutputByteBufferNano.computeMessageSize(6, sectionTracks);
        }
        i = k;
        if (sectionAlbums != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(7, sectionAlbums);
        }
        return i;
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
                if (sectionTracks == null)
                {
                    sectionTracks = new adata();
                }
                codedinputbytebuffernano.readMessage(sectionTracks);
                break;

            case 58: // ':'
                if (sectionAlbums == null)
                {
                    sectionAlbums = new adata();
                }
                codedinputbytebuffernano.readMessage(sectionAlbums);
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
        if (sectionTracks != null)
        {
            codedoutputbytebuffernano.writeMessage(6, sectionTracks);
        }
        if (sectionAlbums != null)
        {
            codedoutputbytebuffernano.writeMessage(7, sectionAlbums);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public adata()
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
        sectionTracks = null;
        sectionAlbums = null;
        cachedSize = -1;
    }
}
