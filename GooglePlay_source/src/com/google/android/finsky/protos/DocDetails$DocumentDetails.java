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
//            DocDetails

public static final class cachedSize extends MessageNano
{

    public s albumDetails;
    public s appDetails;
    public ls artistDetails;
    public ls bookDetails;
    public ils developerDetails;
    public eDetails magazineDetails;
    public eDetails personDetails;
    public  songDetails;
    public etails subscriptionDetails;
    public etails talentDetails;
    public tails tvEpisodeDetails;
    public ails tvSeasonDetails;
    public ls tvShowDetails;
    public s videoDetails;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (appDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, appDetails);
        }
        j = i;
        if (albumDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, albumDetails);
        }
        i = j;
        if (artistDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, artistDetails);
        }
        j = i;
        if (songDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, songDetails);
        }
        i = j;
        if (bookDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, bookDetails);
        }
        j = i;
        if (videoDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, videoDetails);
        }
        i = j;
        if (subscriptionDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, subscriptionDetails);
        }
        j = i;
        if (magazineDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(8, magazineDetails);
        }
        i = j;
        if (tvShowDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, tvShowDetails);
        }
        j = i;
        if (tvSeasonDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(10, tvSeasonDetails);
        }
        i = j;
        if (tvEpisodeDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, tvEpisodeDetails);
        }
        j = i;
        if (personDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(12, personDetails);
        }
        i = j;
        if (talentDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(13, talentDetails);
        }
        j = i;
        if (developerDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(14, developerDetails);
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
                if (appDetails == null)
                {
                    appDetails = new nit>();
                }
                codedinputbytebuffernano.readMessage(appDetails);
                break;

            case 18: // '\022'
                if (albumDetails == null)
                {
                    albumDetails = new s();
                }
                codedinputbytebuffernano.readMessage(albumDetails);
                break;

            case 26: // '\032'
                if (artistDetails == null)
                {
                    artistDetails = new ls();
                }
                codedinputbytebuffernano.readMessage(artistDetails);
                break;

            case 34: // '"'
                if (songDetails == null)
                {
                    songDetails = new ();
                }
                codedinputbytebuffernano.readMessage(songDetails);
                break;

            case 42: // '*'
                if (bookDetails == null)
                {
                    bookDetails = new <init>();
                }
                codedinputbytebuffernano.readMessage(bookDetails);
                break;

            case 50: // '2'
                if (videoDetails == null)
                {
                    videoDetails = new s();
                }
                codedinputbytebuffernano.readMessage(videoDetails);
                break;

            case 58: // ':'
                if (subscriptionDetails == null)
                {
                    subscriptionDetails = new etails();
                }
                codedinputbytebuffernano.readMessage(subscriptionDetails);
                break;

            case 66: // 'B'
                if (magazineDetails == null)
                {
                    magazineDetails = new eDetails();
                }
                codedinputbytebuffernano.readMessage(magazineDetails);
                break;

            case 74: // 'J'
                if (tvShowDetails == null)
                {
                    tvShowDetails = new ls();
                }
                codedinputbytebuffernano.readMessage(tvShowDetails);
                break;

            case 82: // 'R'
                if (tvSeasonDetails == null)
                {
                    tvSeasonDetails = new ails();
                }
                codedinputbytebuffernano.readMessage(tvSeasonDetails);
                break;

            case 90: // 'Z'
                if (tvEpisodeDetails == null)
                {
                    tvEpisodeDetails = new tails();
                }
                codedinputbytebuffernano.readMessage(tvEpisodeDetails);
                break;

            case 98: // 'b'
                if (personDetails == null)
                {
                    personDetails = new nit>();
                }
                codedinputbytebuffernano.readMessage(personDetails);
                break;

            case 106: // 'j'
                if (talentDetails == null)
                {
                    talentDetails = new nit>();
                }
                codedinputbytebuffernano.readMessage(talentDetails);
                break;

            case 114: // 'r'
                if (developerDetails == null)
                {
                    developerDetails = new ils();
                }
                codedinputbytebuffernano.readMessage(developerDetails);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (appDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(1, appDetails);
        }
        if (albumDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(2, albumDetails);
        }
        if (artistDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(3, artistDetails);
        }
        if (songDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(4, songDetails);
        }
        if (bookDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(5, bookDetails);
        }
        if (videoDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(6, videoDetails);
        }
        if (subscriptionDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(7, subscriptionDetails);
        }
        if (magazineDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(8, magazineDetails);
        }
        if (tvShowDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(9, tvShowDetails);
        }
        if (tvSeasonDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(10, tvSeasonDetails);
        }
        if (tvEpisodeDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(11, tvEpisodeDetails);
        }
        if (personDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(12, personDetails);
        }
        if (talentDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(13, talentDetails);
        }
        if (developerDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(14, developerDetails);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public s()
    {
        appDetails = null;
        albumDetails = null;
        artistDetails = null;
        songDetails = null;
        bookDetails = null;
        videoDetails = null;
        subscriptionDetails = null;
        magazineDetails = null;
        tvShowDetails = null;
        tvSeasonDetails = null;
        tvEpisodeDetails = null;
        personDetails = null;
        talentDetails = null;
        developerDetails = null;
        cachedSize = -1;
    }
}
