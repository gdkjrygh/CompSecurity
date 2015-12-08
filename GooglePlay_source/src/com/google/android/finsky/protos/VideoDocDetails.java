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

public interface VideoDocDetails
{
    public static final class Trailer extends MessageNano
    {

        private static volatile Trailer _emptyArray[];
        public String duration;
        public boolean hasDuration;
        public boolean hasThumbnailUrl;
        public boolean hasTitle;
        public boolean hasTrailerId;
        public boolean hasWatchUrl;
        public String thumbnailUrl;
        public String title;
        public String trailerId;
        public String watchUrl;

        public static Trailer[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Trailer[0];
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
                if (!hasTrailerId)
                {
                    i = j;
                    if (trailerId.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, trailerId);
            }
            int k;
label1:
            {
                if (!hasTitle)
                {
                    k = i;
                    if (title.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, title);
            }
label2:
            {
                if (!hasThumbnailUrl)
                {
                    i = k;
                    if (thumbnailUrl.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, thumbnailUrl);
            }
label3:
            {
                if (!hasWatchUrl)
                {
                    k = i;
                    if (watchUrl.equals(""))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, watchUrl);
            }
label4:
            {
                if (!hasDuration)
                {
                    i = k;
                    if (duration.equals(""))
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(5, duration);
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
                    trailerId = codedinputbytebuffernano.readString();
                    hasTrailerId = true;
                    break;

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 26: // '\032'
                    thumbnailUrl = codedinputbytebuffernano.readString();
                    hasThumbnailUrl = true;
                    break;

                case 34: // '"'
                    watchUrl = codedinputbytebuffernano.readString();
                    hasWatchUrl = true;
                    break;

                case 42: // '*'
                    duration = codedinputbytebuffernano.readString();
                    hasDuration = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasTrailerId || !trailerId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, trailerId);
            }
            if (hasTitle || !title.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            if (hasThumbnailUrl || !thumbnailUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, thumbnailUrl);
            }
            if (hasWatchUrl || !watchUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, watchUrl);
            }
            if (hasDuration || !duration.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, duration);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Trailer()
        {
            trailerId = "";
            hasTrailerId = false;
            title = "";
            hasTitle = false;
            thumbnailUrl = "";
            hasThumbnailUrl = false;
            watchUrl = "";
            hasWatchUrl = false;
            duration = "";
            hasDuration = false;
            cachedSize = -1;
        }
    }

    public static final class TvEpisodeDetails extends MessageNano
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

        public TvEpisodeDetails()
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

    public static final class TvSeasonDetails extends MessageNano
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

        public TvSeasonDetails()
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

    public static final class TvShowDetails extends MessageNano
    {

        public String broadcaster;
        public int endYear;
        public boolean hasBroadcaster;
        public boolean hasEndYear;
        public boolean hasSeasonCount;
        public boolean hasStartYear;
        public int seasonCount;
        public int startYear;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasSeasonCount)
                {
                    i = j;
                    if (seasonCount == 0)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, seasonCount);
            }
            int k;
label1:
            {
                if (!hasStartYear)
                {
                    k = i;
                    if (startYear == 0)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, startYear);
            }
label2:
            {
                if (!hasEndYear)
                {
                    i = k;
                    if (endYear == 0)
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(3, endYear);
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

                case 8: // '\b'
                    seasonCount = codedinputbytebuffernano.readRawVarint32();
                    hasSeasonCount = true;
                    break;

                case 16: // '\020'
                    startYear = codedinputbytebuffernano.readRawVarint32();
                    hasStartYear = true;
                    break;

                case 24: // '\030'
                    endYear = codedinputbytebuffernano.readRawVarint32();
                    hasEndYear = true;
                    break;

                case 34: // '"'
                    broadcaster = codedinputbytebuffernano.readString();
                    hasBroadcaster = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSeasonCount || seasonCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, seasonCount);
            }
            if (hasStartYear || startYear != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, startYear);
            }
            if (hasEndYear || endYear != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, endYear);
            }
            if (hasBroadcaster || !broadcaster.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, broadcaster);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TvShowDetails()
        {
            seasonCount = 0;
            hasSeasonCount = false;
            startYear = 0;
            hasStartYear = false;
            endYear = 0;
            hasEndYear = false;
            broadcaster = "";
            hasBroadcaster = false;
            cachedSize = -1;
        }
    }

    public static final class VideoCredit extends MessageNano
    {

        private static volatile VideoCredit _emptyArray[];
        public String credit;
        public int creditType;
        public boolean hasCredit;
        public boolean hasCreditType;
        public String name[];

        public static VideoCredit[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new VideoCredit[0];
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
            int k;
label0:
            {
                int i = super.computeSerializedSize();
                if (creditType == 0)
                {
                    k = i;
                    if (!hasCreditType)
                    {
                        break label0;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(1, creditType);
            }
            int j;
label1:
            {
                if (!hasCredit)
                {
                    j = k;
                    if (credit.equals(""))
                    {
                        break label1;
                    }
                }
                j = k + CodedOutputByteBufferNano.computeStringSize(2, credit);
            }
            k = j;
            if (name != null)
            {
                k = j;
                if (name.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (k = 0; k < name.length;)
                    {
                        String s = name[k];
                        int k1 = j1;
                        int i1 = l;
                        if (s != null)
                        {
                            k1 = j1 + 1;
                            i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        k++;
                        j1 = k1;
                        l = i1;
                    }

                    k = j + l + j1 * 1;
                }
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       8: 58
        //                       18: 112
        //                       26: 128;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                creditType = j;
                hasCreditType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            credit = codedinputbytebuffernano.readString();
            hasCredit = true;
            continue; /* Loop/switch isn't completed */
_L5:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            String as[];
            int k;
            if (name == null)
            {
                k = 0;
            } else
            {
                k = name.length;
            }
            as = new String[l + k];
            l = k;
            if (k != 0)
            {
                System.arraycopy(name, 0, as, 0, k);
                l = k;
            }
            for (; l < as.length - 1; l++)
            {
                as[l] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[l] = codedinputbytebuffernano.readString();
            name = as;
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (creditType != 0 || hasCreditType)
            {
                codedoutputbytebuffernano.writeInt32(1, creditType);
            }
            if (hasCredit || !credit.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, credit);
            }
            if (name != null && name.length > 0)
            {
                for (int i = 0; i < name.length; i++)
                {
                    String s = name[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VideoCredit()
        {
            creditType = 0;
            hasCreditType = false;
            credit = "";
            hasCredit = false;
            name = WireFormatNano.EMPTY_STRING_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class VideoDetails extends MessageNano
    {

        public String audioLanguage[];
        public String captionLanguage[];
        public String contentRating;
        public VideoCredit credit[];
        public long dislikes;
        public String duration;
        public String genre[];
        public boolean hasContentRating;
        public boolean hasDislikes;
        public boolean hasDuration;
        public boolean hasLikes;
        public boolean hasReleaseDate;
        public long likes;
        public String releaseDate;
        public VideoRentalTerm rentalTerm[];
        public Trailer trailer[];

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                i = super.computeSerializedSize();
                int j = i;
                if (credit != null)
                {
                    j = i;
                    if (credit.length > 0)
                    {
                        int l = 0;
                        do
                        {
                            j = i;
                            if (l >= credit.length)
                            {
                                break;
                            }
                            VideoCredit videocredit = credit[l];
                            j = i;
                            if (videocredit != null)
                            {
                                j = i + CodedOutputByteBufferNano.computeMessageSize(1, videocredit);
                            }
                            l++;
                            i = j;
                        } while (true);
                    }
                }
                if (!hasDuration)
                {
                    i = j;
                    if (duration.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(2, duration);
            }
            int k;
label1:
            {
                if (!hasReleaseDate)
                {
                    k = i;
                    if (releaseDate.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(3, releaseDate);
            }
label2:
            {
                if (!hasContentRating)
                {
                    i = k;
                    if (contentRating.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(4, contentRating);
            }
label3:
            {
                if (!hasLikes)
                {
                    k = i;
                    if (likes == 0L)
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(5, likes);
            }
label4:
            {
                if (!hasDislikes)
                {
                    i = k;
                    if (dislikes == 0L)
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(6, dislikes);
            }
            k = i;
            if (genre != null)
            {
                k = i;
                if (genre.length > 0)
                {
                    int i3 = 0;
                    int i1 = 0;
                    for (k = 0; k < genre.length;)
                    {
                        String s = genre[k];
                        int l3 = i3;
                        int j2 = i1;
                        if (s != null)
                        {
                            l3 = i3 + 1;
                            j2 = i1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        k++;
                        i3 = l3;
                        i1 = j2;
                    }

                    k = i + i1 + i3 * 1;
                }
            }
            i = k;
            if (trailer != null)
            {
                i = k;
                if (trailer.length > 0)
                {
                    int j1 = 0;
                    do
                    {
                        i = k;
                        if (j1 >= trailer.length)
                        {
                            break;
                        }
                        Trailer trailer1 = trailer[j1];
                        i = k;
                        if (trailer1 != null)
                        {
                            i = k + CodedOutputByteBufferNano.computeMessageSize(8, trailer1);
                        }
                        j1++;
                        k = i;
                    } while (true);
                }
            }
            k = i;
            if (rentalTerm != null)
            {
                k = i;
                if (rentalTerm.length > 0)
                {
                    int k1 = 0;
                    do
                    {
                        k = i;
                        if (k1 >= rentalTerm.length)
                        {
                            break;
                        }
                        VideoRentalTerm videorentalterm = rentalTerm[k1];
                        k = i;
                        if (videorentalterm != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(9, videorentalterm);
                        }
                        k1++;
                        i = k;
                    } while (true);
                }
            }
            i = k;
            if (audioLanguage != null)
            {
                i = k;
                if (audioLanguage.length > 0)
                {
                    int j3 = 0;
                    int l1 = 0;
                    for (i = 0; i < audioLanguage.length;)
                    {
                        String s1 = audioLanguage[i];
                        int i4 = j3;
                        int k2 = l1;
                        if (s1 != null)
                        {
                            i4 = j3 + 1;
                            k2 = l1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s1);
                        }
                        i++;
                        j3 = i4;
                        l1 = k2;
                    }

                    i = k + l1 + j3 * 1;
                }
            }
            k = i;
            if (captionLanguage != null)
            {
                k = i;
                if (captionLanguage.length > 0)
                {
                    int k3 = 0;
                    int i2 = 0;
                    for (k = 0; k < captionLanguage.length;)
                    {
                        String s2 = captionLanguage[k];
                        int j4 = k3;
                        int l2 = i2;
                        if (s2 != null)
                        {
                            j4 = k3 + 1;
                            l2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(s2);
                        }
                        k++;
                        k3 = j4;
                        i2 = l2;
                    }

                    k = i + i2 + k3 * 1;
                }
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
                    int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    VideoCredit avideocredit[];
                    int j;
                    if (credit == null)
                    {
                        j = 0;
                    } else
                    {
                        j = credit.length;
                    }
                    avideocredit = new VideoCredit[l1 + j];
                    l1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(credit, 0, avideocredit, 0, j);
                        l1 = j;
                    }
                    for (; l1 < avideocredit.length - 1; l1++)
                    {
                        avideocredit[l1] = new VideoCredit();
                        codedinputbytebuffernano.readMessage(avideocredit[l1]);
                        codedinputbytebuffernano.readTag();
                    }

                    avideocredit[l1] = new VideoCredit();
                    codedinputbytebuffernano.readMessage(avideocredit[l1]);
                    credit = avideocredit;
                    break;

                case 18: // '\022'
                    duration = codedinputbytebuffernano.readString();
                    hasDuration = true;
                    break;

                case 26: // '\032'
                    releaseDate = codedinputbytebuffernano.readString();
                    hasReleaseDate = true;
                    break;

                case 34: // '"'
                    contentRating = codedinputbytebuffernano.readString();
                    hasContentRating = true;
                    break;

                case 40: // '('
                    likes = codedinputbytebuffernano.readRawVarint64();
                    hasLikes = true;
                    break;

                case 48: // '0'
                    dislikes = codedinputbytebuffernano.readRawVarint64();
                    hasDislikes = true;
                    break;

                case 58: // ':'
                    int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
                    String as[];
                    int k;
                    if (genre == null)
                    {
                        k = 0;
                    } else
                    {
                        k = genre.length;
                    }
                    as = new String[i2 + k];
                    i2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(genre, 0, as, 0, k);
                        i2 = k;
                    }
                    for (; i2 < as.length - 1; i2++)
                    {
                        as[i2] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[i2] = codedinputbytebuffernano.readString();
                    genre = as;
                    break;

                case 66: // 'B'
                    int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 66);
                    Trailer atrailer[];
                    int l;
                    if (trailer == null)
                    {
                        l = 0;
                    } else
                    {
                        l = trailer.length;
                    }
                    atrailer = new Trailer[j2 + l];
                    j2 = l;
                    if (l != 0)
                    {
                        System.arraycopy(trailer, 0, atrailer, 0, l);
                        j2 = l;
                    }
                    for (; j2 < atrailer.length - 1; j2++)
                    {
                        atrailer[j2] = new Trailer();
                        codedinputbytebuffernano.readMessage(atrailer[j2]);
                        codedinputbytebuffernano.readTag();
                    }

                    atrailer[j2] = new Trailer();
                    codedinputbytebuffernano.readMessage(atrailer[j2]);
                    trailer = atrailer;
                    break;

                case 74: // 'J'
                    int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
                    VideoRentalTerm avideorentalterm[];
                    int i1;
                    if (rentalTerm == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = rentalTerm.length;
                    }
                    avideorentalterm = new VideoRentalTerm[k2 + i1];
                    k2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(rentalTerm, 0, avideorentalterm, 0, i1);
                        k2 = i1;
                    }
                    for (; k2 < avideorentalterm.length - 1; k2++)
                    {
                        avideorentalterm[k2] = new VideoRentalTerm();
                        codedinputbytebuffernano.readMessage(avideorentalterm[k2]);
                        codedinputbytebuffernano.readTag();
                    }

                    avideorentalterm[k2] = new VideoRentalTerm();
                    codedinputbytebuffernano.readMessage(avideorentalterm[k2]);
                    rentalTerm = avideorentalterm;
                    break;

                case 82: // 'R'
                    int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
                    String as1[];
                    int j1;
                    if (audioLanguage == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = audioLanguage.length;
                    }
                    as1 = new String[l2 + j1];
                    l2 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(audioLanguage, 0, as1, 0, j1);
                        l2 = j1;
                    }
                    for (; l2 < as1.length - 1; l2++)
                    {
                        as1[l2] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as1[l2] = codedinputbytebuffernano.readString();
                    audioLanguage = as1;
                    break;

                case 90: // 'Z'
                    int i3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
                    String as2[];
                    int k1;
                    if (captionLanguage == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = captionLanguage.length;
                    }
                    as2 = new String[i3 + k1];
                    i3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(captionLanguage, 0, as2, 0, k1);
                        i3 = k1;
                    }
                    for (; i3 < as2.length - 1; i3++)
                    {
                        as2[i3] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as2[i3] = codedinputbytebuffernano.readString();
                    captionLanguage = as2;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (credit != null && credit.length > 0)
            {
                for (int i = 0; i < credit.length; i++)
                {
                    VideoCredit videocredit = credit[i];
                    if (videocredit != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, videocredit);
                    }
                }

            }
            if (hasDuration || !duration.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, duration);
            }
            if (hasReleaseDate || !releaseDate.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, releaseDate);
            }
            if (hasContentRating || !contentRating.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, contentRating);
            }
            if (hasLikes || likes != 0L)
            {
                codedoutputbytebuffernano.writeInt64(5, likes);
            }
            if (hasDislikes || dislikes != 0L)
            {
                codedoutputbytebuffernano.writeInt64(6, dislikes);
            }
            if (genre != null && genre.length > 0)
            {
                for (int j = 0; j < genre.length; j++)
                {
                    String s = genre[j];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(7, s);
                    }
                }

            }
            if (trailer != null && trailer.length > 0)
            {
                for (int k = 0; k < trailer.length; k++)
                {
                    Trailer trailer1 = trailer[k];
                    if (trailer1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(8, trailer1);
                    }
                }

            }
            if (rentalTerm != null && rentalTerm.length > 0)
            {
                for (int l = 0; l < rentalTerm.length; l++)
                {
                    VideoRentalTerm videorentalterm = rentalTerm[l];
                    if (videorentalterm != null)
                    {
                        codedoutputbytebuffernano.writeMessage(9, videorentalterm);
                    }
                }

            }
            if (audioLanguage != null && audioLanguage.length > 0)
            {
                for (int i1 = 0; i1 < audioLanguage.length; i1++)
                {
                    String s1 = audioLanguage[i1];
                    if (s1 != null)
                    {
                        codedoutputbytebuffernano.writeString(10, s1);
                    }
                }

            }
            if (captionLanguage != null && captionLanguage.length > 0)
            {
                for (int j1 = 0; j1 < captionLanguage.length; j1++)
                {
                    String s2 = captionLanguage[j1];
                    if (s2 != null)
                    {
                        codedoutputbytebuffernano.writeString(11, s2);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VideoDetails()
        {
            credit = VideoCredit.emptyArray();
            duration = "";
            hasDuration = false;
            releaseDate = "";
            hasReleaseDate = false;
            contentRating = "";
            hasContentRating = false;
            likes = 0L;
            hasLikes = false;
            dislikes = 0L;
            hasDislikes = false;
            genre = WireFormatNano.EMPTY_STRING_ARRAY;
            trailer = Trailer.emptyArray();
            rentalTerm = VideoRentalTerm.emptyArray();
            audioLanguage = WireFormatNano.EMPTY_STRING_ARRAY;
            captionLanguage = WireFormatNano.EMPTY_STRING_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class VideoRentalTerm extends MessageNano
    {

        private static volatile VideoRentalTerm _emptyArray[];
        public boolean hasOfferAbbreviation;
        public boolean hasOfferType;
        public boolean hasRentalHeader;
        public String offerAbbreviation;
        public int offerType;
        public String rentalHeader;
        public Term term[];

        public static VideoRentalTerm[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new VideoRentalTerm[0];
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
                if (offerType == 1)
                {
                    i = j;
                    if (!hasOfferType)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, offerType);
            }
            int k;
label1:
            {
                if (!hasOfferAbbreviation)
                {
                    k = i;
                    if (offerAbbreviation.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, offerAbbreviation);
            }
label2:
            {
                if (!hasRentalHeader)
                {
                    i = k;
                    if (rentalHeader.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, rentalHeader);
            }
            int i1 = i;
            if (term != null)
            {
                i1 = i;
                if (term.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i1 = i;
                        if (l >= term.length)
                        {
                            break;
                        }
                        Term term1 = term[l];
                        i1 = i;
                        if (term1 != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeGroupSize(4, term1);
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
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 64
        //                       8: 66
        //                       18: 152
        //                       26: 168
        //                       35: 184;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                offerType = j;
                hasOfferType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            offerAbbreviation = codedinputbytebuffernano.readString();
            hasOfferAbbreviation = true;
            continue; /* Loop/switch isn't completed */
_L5:
            rentalHeader = codedinputbytebuffernano.readString();
            hasRentalHeader = true;
            continue; /* Loop/switch isn't completed */
_L6:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 35);
            Term aterm[];
            int k;
            if (term == null)
            {
                k = 0;
            } else
            {
                k = term.length;
            }
            aterm = new Term[l + k];
            l = k;
            if (k != 0)
            {
                System.arraycopy(term, 0, aterm, 0, k);
                l = k;
            }
            for (; l < aterm.length - 1; l++)
            {
                aterm[l] = new Term();
                codedinputbytebuffernano.readGroup(aterm[l], 4);
                codedinputbytebuffernano.readTag();
            }

            aterm[l] = new Term();
            codedinputbytebuffernano.readGroup(aterm[l], 4);
            term = aterm;
            if (true) goto _L7; else goto _L8
_L8:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (offerType != 1 || hasOfferType)
            {
                codedoutputbytebuffernano.writeInt32(1, offerType);
            }
            if (hasOfferAbbreviation || !offerAbbreviation.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, offerAbbreviation);
            }
            if (hasRentalHeader || !rentalHeader.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, rentalHeader);
            }
            if (term != null && term.length > 0)
            {
                for (int i = 0; i < term.length; i++)
                {
                    Term term1 = term[i];
                    if (term1 != null)
                    {
                        codedoutputbytebuffernano.writeGroup(4, term1);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VideoRentalTerm()
        {
            offerType = 1;
            hasOfferType = false;
            offerAbbreviation = "";
            hasOfferAbbreviation = false;
            rentalHeader = "";
            hasRentalHeader = false;
            term = Term.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class VideoRentalTerm.Term extends MessageNano
    {

        private static volatile VideoRentalTerm.Term _emptyArray[];
        public String body;
        public boolean hasBody;
        public boolean hasHeader;
        public String header;

        public static VideoRentalTerm.Term[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new VideoRentalTerm.Term[0];
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
                if (!hasHeader)
                {
                    i = j;
                    if (header.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(5, header);
            }
            int k;
label1:
            {
                if (!hasBody)
                {
                    k = i;
                    if (body.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(6, body);
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

                case 42: // '*'
                    header = codedinputbytebuffernano.readString();
                    hasHeader = true;
                    break;

                case 50: // '2'
                    body = codedinputbytebuffernano.readString();
                    hasBody = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasHeader || !header.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, header);
            }
            if (hasBody || !body.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, body);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VideoRentalTerm.Term()
        {
            header = "";
            hasHeader = false;
            body = "";
            hasBody = false;
            cachedSize = -1;
        }
    }

}
