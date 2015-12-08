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

    public String broadcaster;
    public int episodeCount;
    public int expectedEpisodeCount;
    public boolean hasBroadcaster;
    public boolean hasEpisodeCount;
    public boolean hasExpectedEpisodeCount;
    public boolean hasParentDetailsUrl;
    public boolean hasReleaseDate;
    public boolean hasSeasonIndex;
    public String parentDetailsUrl;
    public String releaseDate;
    public int seasonIndex;

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
            if (!hasSeasonIndex)
            {
                k = i;
                if (seasonIndex == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, seasonIndex);
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
label3:
        {
            if (!hasBroadcaster)
            {
                k = i;
                if (broadcaster.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, broadcaster);
        }
label4:
        {
            if (!hasEpisodeCount)
            {
                i = k;
                if (episodeCount == 0)
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(5, episodeCount);
        }
label5:
        {
            if (!hasExpectedEpisodeCount)
            {
                k = i;
                if (expectedEpisodeCount == 0)
                {
                    break label5;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(6, expectedEpisodeCount);
        }
        return k;
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
                seasonIndex = codedinputbytebuffernano.readRawVarint32();
                hasSeasonIndex = true;
                break;

            case 26: // '\032'
                releaseDate = codedinputbytebuffernano.readString();
                hasReleaseDate = true;
                break;

            case 34: // '"'
                broadcaster = codedinputbytebuffernano.readString();
                hasBroadcaster = true;
                break;

            case 40: // '('
                episodeCount = codedinputbytebuffernano.readRawVarint32();
                hasEpisodeCount = true;
                break;

            case 48: // '0'
                expectedEpisodeCount = codedinputbytebuffernano.readRawVarint32();
                hasExpectedEpisodeCount = true;
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
        if (hasSeasonIndex || seasonIndex != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, seasonIndex);
        }
        if (hasReleaseDate || !releaseDate.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, releaseDate);
        }
        if (hasBroadcaster || !broadcaster.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, broadcaster);
        }
        if (hasEpisodeCount || episodeCount != 0)
        {
            codedoutputbytebuffernano.writeInt32(5, episodeCount);
        }
        if (hasExpectedEpisodeCount || expectedEpisodeCount != 0)
        {
            codedoutputbytebuffernano.writeInt32(6, expectedEpisodeCount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        parentDetailsUrl = "";
        hasParentDetailsUrl = false;
        seasonIndex = 0;
        hasSeasonIndex = false;
        releaseDate = "";
        hasReleaseDate = false;
        broadcaster = "";
        hasBroadcaster = false;
        episodeCount = 0;
        hasEpisodeCount = false;
        expectedEpisodeCount = 0;
        hasExpectedEpisodeCount = false;
        cachedSize = -1;
    }
}
