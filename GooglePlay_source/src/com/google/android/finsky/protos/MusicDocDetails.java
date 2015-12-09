// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface MusicDocDetails
{
    public static final class AlbumDetails extends MessageNano
    {

        public MusicDetails details;
        public ArtistDetails displayArtist;
        public boolean hasName;
        public String name;

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
            int k = i;
            if (details != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(2, details);
            }
            i = k;
            if (displayArtist != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(3, displayArtist);
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
                        details = new MusicDetails();
                    }
                    codedinputbytebuffernano.readMessage(details);
                    break;

                case 26: // '\032'
                    if (displayArtist == null)
                    {
                        displayArtist = new ArtistDetails();
                    }
                    codedinputbytebuffernano.readMessage(displayArtist);
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
            if (displayArtist != null)
            {
                codedoutputbytebuffernano.writeMessage(3, displayArtist);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AlbumDetails()
        {
            name = "";
            hasName = false;
            details = null;
            displayArtist = null;
            cachedSize = -1;
        }
    }

    public static final class ArtistDetails extends MessageNano
    {

        private static volatile ArtistDetails _emptyArray[];
        public String detailsUrl;
        public ArtistExternalLinks externalLinks;
        public boolean hasDetailsUrl;
        public boolean hasName;
        public String name;

        public static ArtistDetails[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ArtistDetails[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasDetailsUrl)
                {
                    i = j;
                    if (detailsUrl.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, detailsUrl);
            }
            int k;
label1:
            {
                if (!hasName)
                {
                    k = i;
                    if (name.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, name);
            }
            i = k;
            if (externalLinks != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(3, externalLinks);
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
                    detailsUrl = codedinputbytebuffernano.readString();
                    hasDetailsUrl = true;
                    break;

                case 18: // '\022'
                    name = codedinputbytebuffernano.readString();
                    hasName = true;
                    break;

                case 26: // '\032'
                    if (externalLinks == null)
                    {
                        externalLinks = new ArtistExternalLinks();
                    }
                    codedinputbytebuffernano.readMessage(externalLinks);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasDetailsUrl || !detailsUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, detailsUrl);
            }
            if (hasName || !name.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, name);
            }
            if (externalLinks != null)
            {
                codedoutputbytebuffernano.writeMessage(3, externalLinks);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ArtistDetails()
        {
            detailsUrl = "";
            hasDetailsUrl = false;
            name = "";
            hasName = false;
            externalLinks = null;
            cachedSize = -1;
        }
    }

    public static final class ArtistExternalLinks extends MessageNano
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

        public ArtistExternalLinks()
        {
            websiteUrl = WireFormatNano.EMPTY_STRING_ARRAY;
            googlePlusProfileUrl = "";
            hasGooglePlusProfileUrl = false;
            youtubeChannelUrl = "";
            hasYoutubeChannelUrl = false;
            cachedSize = -1;
        }
    }

    public static final class MusicDetails extends MessageNano
    {

        public ArtistDetails artist[];
        public int censoring;
        public int durationSec;
        public String genre[];
        public boolean hasCensoring;
        public boolean hasDurationSec;
        public boolean hasLabel;
        public boolean hasOriginalReleaseDate;
        public boolean hasReleaseDate;
        public String label;
        public String originalReleaseDate;
        public String releaseDate;
        public int releaseType[];

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (censoring == 0)
                {
                    i = j;
                    if (!hasCensoring)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, censoring);
            }
            int k;
label1:
            {
                if (!hasDurationSec)
                {
                    k = i;
                    if (durationSec == 0)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, durationSec);
            }
            int l;
label2:
            {
                if (!hasOriginalReleaseDate)
                {
                    l = k;
                    if (originalReleaseDate.equals(""))
                    {
                        break label2;
                    }
                }
                l = k + CodedOutputByteBufferNano.computeStringSize(3, originalReleaseDate);
            }
label3:
            {
                if (!hasLabel)
                {
                    i = l;
                    if (label.equals(""))
                    {
                        break label3;
                    }
                }
                i = l + CodedOutputByteBufferNano.computeStringSize(4, label);
            }
label4:
            {
                k = i;
                if (artist != null)
                {
                    k = i;
                    if (artist.length > 0)
                    {
                        int i1 = 0;
                        do
                        {
                            k = i;
                            if (i1 >= artist.length)
                            {
                                break;
                            }
                            ArtistDetails artistdetails = artist[i1];
                            k = i;
                            if (artistdetails != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(5, artistdetails);
                            }
                            i1++;
                            i = k;
                        } while (true);
                    }
                }
                int j1 = k;
                if (genre != null)
                {
                    j1 = k;
                    if (genre.length > 0)
                    {
                        int i2 = 0;
                        j1 = 0;
                        for (i = 0; i < genre.length;)
                        {
                            String s = genre[i];
                            int j2 = i2;
                            int l1 = j1;
                            if (s != null)
                            {
                                j2 = i2 + 1;
                                l1 = j1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                            }
                            i++;
                            i2 = j2;
                            j1 = l1;
                        }

                        j1 = k + j1 + i2 * 1;
                    }
                }
                if (!hasReleaseDate)
                {
                    i = j1;
                    if (releaseDate.equals(""))
                    {
                        break label4;
                    }
                }
                i = j1 + CodedOutputByteBufferNano.computeStringSize(7, releaseDate);
            }
            k = i;
            if (releaseType != null)
            {
                k = i;
                if (releaseType.length > 0)
                {
                    int k1 = 0;
                    for (k = 0; k < releaseType.length; k++)
                    {
                        k1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(releaseType[k]);
                    }

                    k = i + k1 + releaseType.length * 1;
                }
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 100
        //                       0: 109
        //                       8: 111
        //                       16: 161
        //                       26: 177
        //                       34: 193
        //                       42: 209
        //                       50: 340
        //                       58: 449
        //                       64: 465
        //                       66: 652;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            i = codedinputbytebuffernano.readRawVarint32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                censoring = i;
                hasCensoring = true;
                break;
            }
              goto _L13
_L4:
            durationSec = codedinputbytebuffernano.readRawVarint32();
            hasDurationSec = true;
              goto _L13
_L5:
            originalReleaseDate = codedinputbytebuffernano.readString();
            hasOriginalReleaseDate = true;
              goto _L13
_L6:
            label = codedinputbytebuffernano.readString();
            hasLabel = true;
              goto _L13
_L7:
            int j = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
            ArtistDetails aartistdetails[];
            if (artist == null)
            {
                i = 0;
            } else
            {
                i = artist.length;
            }
            aartistdetails = new ArtistDetails[j + i];
            j = i;
            if (i != 0)
            {
                System.arraycopy(artist, 0, aartistdetails, 0, i);
                j = i;
            }
            for (; j < aartistdetails.length - 1; j++)
            {
                aartistdetails[j] = new ArtistDetails();
                codedinputbytebuffernano.readMessage(aartistdetails[j]);
                codedinputbytebuffernano.readTag();
            }

            aartistdetails[j] = new ArtistDetails();
            codedinputbytebuffernano.readMessage(aartistdetails[j]);
            artist = aartistdetails;
              goto _L13
_L8:
            int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
            String as[];
            if (genre == null)
            {
                i = 0;
            } else
            {
                i = genre.length;
            }
            as = new String[k + i];
            k = i;
            if (i != 0)
            {
                System.arraycopy(genre, 0, as, 0, i);
                k = i;
            }
            for (; k < as.length - 1; k++)
            {
                as[k] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[k] = codedinputbytebuffernano.readString();
            genre = as;
              goto _L13
_L9:
            releaseDate = codedinputbytebuffernano.readString();
            hasReleaseDate = true;
              goto _L13
_L10:
            int ai[];
            int l;
            int k1;
            k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 64);
            ai = new int[k1];
            l = 0;
            i = 0;
_L20:
            if (l >= k1) goto _L15; else goto _L14
_L14:
            int l1;
            if (l != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            l1 = codedinputbytebuffernano.readRawVarint32();
            l1;
            JVM INSTR tableswitch 0 2: default 536
        //                       0 545
        //                       1 545
        //                       2 545;
               goto _L16 _L17 _L17 _L17
_L16:
            l++;
              goto _L18
_L17:
            int i1 = i + 1;
            ai[i] = l1;
            i = i1;
            if (true) goto _L16; else goto _L15
_L15:
            if (i != 0)
            {
                if (releaseType == null)
                {
                    l = 0;
                } else
                {
                    l = releaseType.length;
                }
                if (l == 0 && i == ai.length)
                {
                    releaseType = ai;
                } else
                {
                    int ai1[] = new int[l + i];
                    if (l != 0)
                    {
                        System.arraycopy(releaseType, 0, ai1, 0, l);
                    }
                    System.arraycopy(ai, 0, ai1, l, i);
                    releaseType = ai1;
                }
            }
              goto _L13
_L18:
            if (true) goto _L20; else goto _L19
_L19:
_L11:
            int j1;
            j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            i = codedinputbytebuffernano.getPosition();
            l = 0;
_L29:
            if (codedinputbytebuffernano.getBytesUntilLimit() <= 0) goto _L22; else goto _L21
_L21:
            switch (codedinputbytebuffernano.readRawVarint32())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                l++;
                break;
            }
              goto _L23
_L22:
            if (l == 0) goto _L25; else goto _L24
_L24:
            codedinputbytebuffernano.rewindToPosition(i);
            if (releaseType == null)
            {
                i = 0;
            } else
            {
                i = releaseType.length;
            }
            ai = new int[l + i];
            l = i;
            if (i != 0)
            {
                System.arraycopy(releaseType, 0, ai, 0, i);
                l = i;
            }
_L27:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readRawVarint32();
                switch (i)
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                    ai[l] = i;
                    l++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            releaseType = ai;
_L25:
            codedinputbytebuffernano.popLimit(j1);
            continue; /* Loop/switch isn't completed */
            if (true) goto _L27; else goto _L26
_L26:
_L23:
            if (true) goto _L29; else goto _L28
_L28:
_L13:
            if (true) goto _L12; else goto _L30
_L30:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (censoring != 0 || hasCensoring)
            {
                codedoutputbytebuffernano.writeInt32(1, censoring);
            }
            if (hasDurationSec || durationSec != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, durationSec);
            }
            if (hasOriginalReleaseDate || !originalReleaseDate.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, originalReleaseDate);
            }
            if (hasLabel || !label.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, label);
            }
            if (artist != null && artist.length > 0)
            {
                for (int i = 0; i < artist.length; i++)
                {
                    ArtistDetails artistdetails = artist[i];
                    if (artistdetails != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, artistdetails);
                    }
                }

            }
            if (genre != null && genre.length > 0)
            {
                for (int j = 0; j < genre.length; j++)
                {
                    String s = genre[j];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(6, s);
                    }
                }

            }
            if (hasReleaseDate || !releaseDate.equals(""))
            {
                codedoutputbytebuffernano.writeString(7, releaseDate);
            }
            if (releaseType != null && releaseType.length > 0)
            {
                for (int k = 0; k < releaseType.length; k++)
                {
                    codedoutputbytebuffernano.writeInt32(8, releaseType[k]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MusicDetails()
        {
            censoring = 0;
            hasCensoring = false;
            releaseType = WireFormatNano.EMPTY_INT_ARRAY;
            durationSec = 0;
            hasDurationSec = false;
            originalReleaseDate = "";
            hasOriginalReleaseDate = false;
            releaseDate = "";
            hasReleaseDate = false;
            label = "";
            hasLabel = false;
            artist = ArtistDetails.emptyArray();
            genre = WireFormatNano.EMPTY_STRING_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class SongDetails extends MessageNano
    {

        public String albumName;
        public DocAnnotations.Badge badge;
        public MusicDetails details;
        public ArtistDetails displayArtist;
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
                        details = new MusicDetails();
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
                        displayArtist = new ArtistDetails();
                    }
                    codedinputbytebuffernano.readMessage(displayArtist);
                    break;

                case 58: // ':'
                    if (badge == null)
                    {
                        badge = new DocAnnotations.Badge();
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

        public SongDetails()
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

}
