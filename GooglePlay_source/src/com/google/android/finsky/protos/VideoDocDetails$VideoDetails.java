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

    public String audioLanguage[];
    public String captionLanguage[];
    public String contentRating;
    public  credit[];
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
    public rm rentalTerm[];
    public rm trailer[];

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
                        cachedSize cachedsize = credit[l];
                        j = i;
                        if (cachedsize != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, cachedsize);
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
                    cachedSize cachedsize1 = trailer[j1];
                    i = k;
                    if (cachedsize1 != null)
                    {
                        i = k + CodedOutputByteBufferNano.computeMessageSize(8, cachedsize1);
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
                    rm rm = rentalTerm[k1];
                    k = i;
                    if (rm != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(9, rm);
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
                ngSizeNoTag angsizenotag[];
                int j;
                if (credit == null)
                {
                    j = 0;
                } else
                {
                    j = credit.length;
                }
                angsizenotag = new credit[l1 + j];
                l1 = j;
                if (j != 0)
                {
                    System.arraycopy(credit, 0, angsizenotag, 0, j);
                    l1 = j;
                }
                for (; l1 < angsizenotag.length - 1; l1++)
                {
                    angsizenotag[l1] = new init>();
                    codedinputbytebuffernano.readMessage(angsizenotag[l1]);
                    codedinputbytebuffernano.readTag();
                }

                angsizenotag[l1] = new init>();
                codedinputbytebuffernano.readMessage(angsizenotag[l1]);
                credit = angsizenotag;
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
                ngSizeNoTag angsizenotag1[];
                int l;
                if (trailer == null)
                {
                    l = 0;
                } else
                {
                    l = trailer.length;
                }
                angsizenotag1 = new trailer[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(trailer, 0, angsizenotag1, 0, l);
                    j2 = l;
                }
                for (; j2 < angsizenotag1.length - 1; j2++)
                {
                    angsizenotag1[j2] = new >();
                    codedinputbytebuffernano.readMessage(angsizenotag1[j2]);
                    codedinputbytebuffernano.readTag();
                }

                angsizenotag1[j2] = new >();
                codedinputbytebuffernano.readMessage(angsizenotag1[j2]);
                trailer = angsizenotag1;
                break;

            case 74: // 'J'
                int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
                rm arm[];
                int i1;
                if (rentalTerm == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = rentalTerm.length;
                }
                arm = new rm[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(rentalTerm, 0, arm, 0, i1);
                    k2 = i1;
                }
                for (; k2 < arm.length - 1; k2++)
                {
                    arm[k2] = new rm();
                    codedinputbytebuffernano.readMessage(arm[k2]);
                    codedinputbytebuffernano.readTag();
                }

                arm[k2] = new rm();
                codedinputbytebuffernano.readMessage(arm[k2]);
                rentalTerm = arm;
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
                captionLanguage captionlanguage = credit[i];
                if (captionlanguage != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, captionlanguage);
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
                captionLanguage captionlanguage1 = trailer[k];
                if (captionlanguage1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(8, captionlanguage1);
                }
            }

        }
        if (rentalTerm != null && rentalTerm.length > 0)
        {
            for (int l = 0; l < rentalTerm.length; l++)
            {
                rm rm = rentalTerm[l];
                if (rm != null)
                {
                    codedoutputbytebuffernano.writeMessage(9, rm);
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

    public rm()
    {
        credit = mptyArray();
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
        trailer = Array();
        rentalTerm = rm.emptyArray();
        audioLanguage = WireFormatNano.EMPTY_STRING_ARRAY;
        captionLanguage = WireFormatNano.EMPTY_STRING_ARRAY;
        cachedSize = -1;
    }
}
