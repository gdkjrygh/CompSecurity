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

public interface DocDetails
{
    public static final class DocumentDetails extends MessageNano
    {

        public MusicDocDetails.AlbumDetails albumDetails;
        public AppDocDetails.AppDetails appDetails;
        public MusicDocDetails.ArtistDetails artistDetails;
        public BookDocDetails.BookDetails bookDetails;
        public AppDocDetails.DeveloperDetails developerDetails;
        public NewsstandDocDetails.MagazineDetails magazineDetails;
        public PersonDetails personDetails;
        public MusicDocDetails.SongDetails songDetails;
        public AppDocDetails.SubscriptionDetails subscriptionDetails;
        public TalentDetails talentDetails;
        public VideoDocDetails.TvEpisodeDetails tvEpisodeDetails;
        public VideoDocDetails.TvSeasonDetails tvSeasonDetails;
        public VideoDocDetails.TvShowDetails tvShowDetails;
        public VideoDocDetails.VideoDetails videoDetails;

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
                        appDetails = new AppDocDetails.AppDetails();
                    }
                    codedinputbytebuffernano.readMessage(appDetails);
                    break;

                case 18: // '\022'
                    if (albumDetails == null)
                    {
                        albumDetails = new MusicDocDetails.AlbumDetails();
                    }
                    codedinputbytebuffernano.readMessage(albumDetails);
                    break;

                case 26: // '\032'
                    if (artistDetails == null)
                    {
                        artistDetails = new MusicDocDetails.ArtistDetails();
                    }
                    codedinputbytebuffernano.readMessage(artistDetails);
                    break;

                case 34: // '"'
                    if (songDetails == null)
                    {
                        songDetails = new MusicDocDetails.SongDetails();
                    }
                    codedinputbytebuffernano.readMessage(songDetails);
                    break;

                case 42: // '*'
                    if (bookDetails == null)
                    {
                        bookDetails = new BookDocDetails.BookDetails();
                    }
                    codedinputbytebuffernano.readMessage(bookDetails);
                    break;

                case 50: // '2'
                    if (videoDetails == null)
                    {
                        videoDetails = new VideoDocDetails.VideoDetails();
                    }
                    codedinputbytebuffernano.readMessage(videoDetails);
                    break;

                case 58: // ':'
                    if (subscriptionDetails == null)
                    {
                        subscriptionDetails = new AppDocDetails.SubscriptionDetails();
                    }
                    codedinputbytebuffernano.readMessage(subscriptionDetails);
                    break;

                case 66: // 'B'
                    if (magazineDetails == null)
                    {
                        magazineDetails = new NewsstandDocDetails.MagazineDetails();
                    }
                    codedinputbytebuffernano.readMessage(magazineDetails);
                    break;

                case 74: // 'J'
                    if (tvShowDetails == null)
                    {
                        tvShowDetails = new VideoDocDetails.TvShowDetails();
                    }
                    codedinputbytebuffernano.readMessage(tvShowDetails);
                    break;

                case 82: // 'R'
                    if (tvSeasonDetails == null)
                    {
                        tvSeasonDetails = new VideoDocDetails.TvSeasonDetails();
                    }
                    codedinputbytebuffernano.readMessage(tvSeasonDetails);
                    break;

                case 90: // 'Z'
                    if (tvEpisodeDetails == null)
                    {
                        tvEpisodeDetails = new VideoDocDetails.TvEpisodeDetails();
                    }
                    codedinputbytebuffernano.readMessage(tvEpisodeDetails);
                    break;

                case 98: // 'b'
                    if (personDetails == null)
                    {
                        personDetails = new PersonDetails();
                    }
                    codedinputbytebuffernano.readMessage(personDetails);
                    break;

                case 106: // 'j'
                    if (talentDetails == null)
                    {
                        talentDetails = new TalentDetails();
                    }
                    codedinputbytebuffernano.readMessage(talentDetails);
                    break;

                case 114: // 'r'
                    if (developerDetails == null)
                    {
                        developerDetails = new AppDocDetails.DeveloperDetails();
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

        public DocumentDetails()
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

    public static final class PersonDetails extends MessageNano
    {

        public boolean hasPersonIsRequester;
        public boolean personIsRequester;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasPersonIsRequester)
                {
                    i = j;
                    if (!personIsRequester)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
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

                case 8: // '\b'
                    personIsRequester = codedinputbytebuffernano.readBool();
                    hasPersonIsRequester = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasPersonIsRequester || personIsRequester)
            {
                codedoutputbytebuffernano.writeBool(1, personIsRequester);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PersonDetails()
        {
            personIsRequester = false;
            hasPersonIsRequester = false;
            cachedSize = -1;
        }
    }

    public static final class ProductDetails extends MessageNano
    {

        public boolean hasTitle;
        public ProductDetailsSection section[];
        public String title;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasTitle)
                {
                    i = j;
                    if (title.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            int l = i;
            if (section != null)
            {
                l = i;
                if (section.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= section.length)
                        {
                            break;
                        }
                        ProductDetailsSection productdetailssection = section[k];
                        l = i;
                        if (productdetailssection != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, productdetailssection);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
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
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    ProductDetailsSection aproductdetailssection[];
                    int j;
                    if (section == null)
                    {
                        j = 0;
                    } else
                    {
                        j = section.length;
                    }
                    aproductdetailssection = new ProductDetailsSection[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(section, 0, aproductdetailssection, 0, j);
                        k = j;
                    }
                    for (; k < aproductdetailssection.length - 1; k++)
                    {
                        aproductdetailssection[k] = new ProductDetailsSection();
                        codedinputbytebuffernano.readMessage(aproductdetailssection[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aproductdetailssection[k] = new ProductDetailsSection();
                    codedinputbytebuffernano.readMessage(aproductdetailssection[k]);
                    section = aproductdetailssection;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasTitle || !title.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (section != null && section.length > 0)
            {
                for (int i = 0; i < section.length; i++)
                {
                    ProductDetailsSection productdetailssection = section[i];
                    if (productdetailssection != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, productdetailssection);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProductDetails()
        {
            title = "";
            hasTitle = false;
            section = ProductDetailsSection.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class ProductDetailsDescription extends MessageNano
    {

        private static volatile ProductDetailsDescription _emptyArray[];
        public String description;
        public boolean hasDescription;
        public Common.Image image;

        public static ProductDetailsDescription[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ProductDetailsDescription[0];
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
            int j;
label0:
            {
                j = super.computeSerializedSize();
                int i = j;
                if (image != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(1, image);
                }
                if (!hasDescription)
                {
                    j = i;
                    if (description.equals(""))
                    {
                        break label0;
                    }
                }
                j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
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
                    if (image == null)
                    {
                        image = new Common.Image();
                    }
                    codedinputbytebuffernano.readMessage(image);
                    break;

                case 18: // '\022'
                    description = codedinputbytebuffernano.readString();
                    hasDescription = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (image != null)
            {
                codedoutputbytebuffernano.writeMessage(1, image);
            }
            if (hasDescription || !description.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, description);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProductDetailsDescription()
        {
            image = null;
            description = "";
            hasDescription = false;
            cachedSize = -1;
        }
    }

    public static final class ProductDetailsSection extends MessageNano
    {

        private static volatile ProductDetailsSection _emptyArray[];
        public ProductDetailsDescription description[];
        public boolean hasTitle;
        public String title;

        public static ProductDetailsSection[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ProductDetailsSection[0];
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
                if (!hasTitle)
                {
                    i = j;
                    if (title.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            int l = i;
            if (description != null)
            {
                l = i;
                if (description.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= description.length)
                        {
                            break;
                        }
                        ProductDetailsDescription productdetailsdescription = description[k];
                        l = i;
                        if (productdetailsdescription != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, productdetailsdescription);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
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
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    ProductDetailsDescription aproductdetailsdescription[];
                    int j;
                    if (description == null)
                    {
                        j = 0;
                    } else
                    {
                        j = description.length;
                    }
                    aproductdetailsdescription = new ProductDetailsDescription[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(description, 0, aproductdetailsdescription, 0, j);
                        k = j;
                    }
                    for (; k < aproductdetailsdescription.length - 1; k++)
                    {
                        aproductdetailsdescription[k] = new ProductDetailsDescription();
                        codedinputbytebuffernano.readMessage(aproductdetailsdescription[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aproductdetailsdescription[k] = new ProductDetailsDescription();
                    codedinputbytebuffernano.readMessage(aproductdetailsdescription[k]);
                    description = aproductdetailsdescription;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasTitle || !title.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (description != null && description.length > 0)
            {
                for (int i = 0; i < description.length; i++)
                {
                    ProductDetailsDescription productdetailsdescription = description[i];
                    if (productdetailsdescription != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, productdetailsdescription);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProductDetailsSection()
        {
            title = "";
            hasTitle = false;
            description = ProductDetailsDescription.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class TalentDetails extends MessageNano
    {

        public TalentExternalLinks externalLinks;
        public boolean hasPrimaryRoleId;
        public int primaryRoleId;

        protected final int computeSerializedSize()
        {
            int j;
label0:
            {
                j = super.computeSerializedSize();
                int i = j;
                if (externalLinks != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(1, externalLinks);
                }
                if (primaryRoleId == 0)
                {
                    j = i;
                    if (!hasPrimaryRoleId)
                    {
                        break label0;
                    }
                }
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, primaryRoleId);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       10: 50
        //                       16: 79;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            if (externalLinks == null)
            {
                externalLinks = new TalentExternalLinks();
            }
            codedinputbytebuffernano.readMessage(externalLinks);
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                primaryRoleId = j;
                hasPrimaryRoleId = true;
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (externalLinks != null)
            {
                codedoutputbytebuffernano.writeMessage(1, externalLinks);
            }
            if (primaryRoleId != 0 || hasPrimaryRoleId)
            {
                codedoutputbytebuffernano.writeInt32(2, primaryRoleId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TalentDetails()
        {
            externalLinks = null;
            primaryRoleId = 0;
            hasPrimaryRoleId = false;
            cachedSize = -1;
        }
    }

    public static final class TalentExternalLinks extends MessageNano
    {

        public DocAnnotations.Link googlePlusProfileUrl;
        public DocAnnotations.Link websiteUrl[];
        public DocAnnotations.Link youtubeChannelUrl;

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (websiteUrl != null)
            {
                j = i;
                if (websiteUrl.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= websiteUrl.length)
                        {
                            break;
                        }
                        DocAnnotations.Link link = websiteUrl[k];
                        j = i;
                        if (link != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, link);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (googlePlusProfileUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, googlePlusProfileUrl);
            }
            j = i;
            if (youtubeChannelUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, youtubeChannelUrl);
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
                    DocAnnotations.Link alink[];
                    int j;
                    if (websiteUrl == null)
                    {
                        j = 0;
                    } else
                    {
                        j = websiteUrl.length;
                    }
                    alink = new DocAnnotations.Link[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(websiteUrl, 0, alink, 0, j);
                        k = j;
                    }
                    for (; k < alink.length - 1; k++)
                    {
                        alink[k] = new DocAnnotations.Link();
                        codedinputbytebuffernano.readMessage(alink[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    alink[k] = new DocAnnotations.Link();
                    codedinputbytebuffernano.readMessage(alink[k]);
                    websiteUrl = alink;
                    break;

                case 18: // '\022'
                    if (googlePlusProfileUrl == null)
                    {
                        googlePlusProfileUrl = new DocAnnotations.Link();
                    }
                    codedinputbytebuffernano.readMessage(googlePlusProfileUrl);
                    break;

                case 26: // '\032'
                    if (youtubeChannelUrl == null)
                    {
                        youtubeChannelUrl = new DocAnnotations.Link();
                    }
                    codedinputbytebuffernano.readMessage(youtubeChannelUrl);
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
                    DocAnnotations.Link link = websiteUrl[i];
                    if (link != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, link);
                    }
                }

            }
            if (googlePlusProfileUrl != null)
            {
                codedoutputbytebuffernano.writeMessage(2, googlePlusProfileUrl);
            }
            if (youtubeChannelUrl != null)
            {
                codedoutputbytebuffernano.writeMessage(3, youtubeChannelUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TalentExternalLinks()
        {
            websiteUrl = DocAnnotations.Link.emptyArray();
            googlePlusProfileUrl = null;
            youtubeChannelUrl = null;
            cachedSize = -1;
        }
    }

}
