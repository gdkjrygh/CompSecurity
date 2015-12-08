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

    public String albumName;
    public badge badge;
    public  details;
    public s displayArtist;
    public boolean hasAlbumName;
    public boolean hasName;
    public boolean hasPreviewUrl;
    public boolean hasTrackNumber;
    public String name;
    public String previewUrl;
    public int trackNumber;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasName)
            {
                i = j;
                if (name.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, name);
        }
label1:
        {
            int k = i;
            if (details != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(2, details);
            }
            if (!hasAlbumName)
            {
                i = k;
                if (albumName.equals(""))
                {
                    break label1;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, albumName);
        }
        int l;
label2:
        {
            if (!hasTrackNumber)
            {
                l = i;
                if (trackNumber == 0)
                {
                    break label2;
                }
            }
            l = i + CodedOutputByteBufferNano.computeInt32Size(4, trackNumber);
        }
label3:
        {
            if (!hasPreviewUrl)
            {
                i = l;
                if (previewUrl.equals(""))
                {
                    break label3;
                }
            }
            i = l + CodedOutputByteBufferNano.computeStringSize(5, previewUrl);
        }
        l = i;
        if (displayArtist != null)
        {
            l = i + CodedOutputByteBufferNano.computeMessageSize(6, displayArtist);
        }
        i = l;
        if (badge != null)
        {
            i = l + CodedOutputByteBufferNano.computeMessageSize(7, badge);
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
                name = codedinputbytebuffernano.readString();
                hasName = true;
                break;

            case 18: // '\022'
                if (details == null)
                {
                    details = new ();
                }
                codedinputbytebuffernano.readMessage(details);
                break;

            case 26: // '\032'
                albumName = codedinputbytebuffernano.readString();
                hasAlbumName = true;
                break;

            case 32: // ' '
                trackNumber = codedinputbytebuffernano.readRawVarint32();
                hasTrackNumber = true;
                break;

            case 42: // '*'
                previewUrl = codedinputbytebuffernano.readString();
                hasPreviewUrl = true;
                break;

            case 50: // '2'
                if (displayArtist == null)
                {
                    displayArtist = new s();
                }
                codedinputbytebuffernano.readMessage(displayArtist);
                break;

            case 58: // ':'
                if (badge == null)
                {
                    badge = new badge();
                }
                codedinputbytebuffernano.readMessage(badge);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasName || !name.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, name);
        }
        if (details != null)
        {
            codedoutputbytebuffernano.writeMessage(2, details);
        }
        if (hasAlbumName || !albumName.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, albumName);
        }
        if (hasTrackNumber || trackNumber != 0)
        {
            codedoutputbytebuffernano.writeInt32(4, trackNumber);
        }
        if (hasPreviewUrl || !previewUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, previewUrl);
        }
        if (displayArtist != null)
        {
            codedoutputbytebuffernano.writeMessage(6, displayArtist);
        }
        if (badge != null)
        {
            codedoutputbytebuffernano.writeMessage(7, badge);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public s()
    {
        name = "";
        hasName = false;
        details = null;
        albumName = "";
        hasAlbumName = false;
        trackNumber = 0;
        hasTrackNumber = false;
        previewUrl = "";
        hasPreviewUrl = false;
        displayArtist = null;
        badge = null;
        cachedSize = -1;
    }
}
