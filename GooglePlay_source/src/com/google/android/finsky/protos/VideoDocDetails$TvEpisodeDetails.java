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
//            VideoDocDetails

public static final class cachedSize extends MessageNano
{

    public int episodeIndex;
    public boolean hasEpisodeIndex;
    public boolean hasParentDetailsUrl;
    public boolean hasReleaseDate;
    public String parentDetailsUrl;
    public String releaseDate;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasParentDetailsUrl)
            {
                i = j;
                if (parentDetailsUrl.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, parentDetailsUrl);
        }
        int k;
label1:
        {
            if (!hasEpisodeIndex)
            {
                k = i;
                if (episodeIndex == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, episodeIndex);
        }
label2:
        {
            if (!hasReleaseDate)
            {
                i = k;
                if (releaseDate.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, releaseDate);
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
                parentDetailsUrl = codedinputbytebuffernano.readString();
                hasParentDetailsUrl = true;
                break;

            case 16: // '\020'
                episodeIndex = codedinputbytebuffernano.readRawVarint32();
                hasEpisodeIndex = true;
                break;

            case 26: // '\032'
                releaseDate = codedinputbytebuffernano.readString();
                hasReleaseDate = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasParentDetailsUrl || !parentDetailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, parentDetailsUrl);
        }
        if (hasEpisodeIndex || episodeIndex != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, episodeIndex);
        }
        if (hasReleaseDate || !releaseDate.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, releaseDate);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        parentDetailsUrl = "";
        hasParentDetailsUrl = false;
        episodeIndex = 0;
        hasEpisodeIndex = false;
        releaseDate = "";
        hasReleaseDate = false;
        cachedSize = -1;
    }
}
