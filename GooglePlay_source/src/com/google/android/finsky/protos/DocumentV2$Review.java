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

    public tipEnd author;
    public String authorName;
    public String comment;
    public String commentId;
    public String deviceName;
    public String documentVersion;
    public boolean hasAuthorName;
    public boolean hasComment;
    public boolean hasCommentId;
    public boolean hasDeviceName;
    public boolean hasDocumentVersion;
    public boolean hasHelpfulCount;
    public boolean hasReplyText;
    public boolean hasReplyTimestampMsec;
    public boolean hasSource;
    public boolean hasStarRating;
    public boolean hasTimestampMsec;
    public boolean hasTitle;
    public boolean hasUrl;
    public int helpfulCount;
    public PlusProfile oBSOLETEPlusProfile;
    public String replyText;
    public long replyTimestampMsec;
    public PlusProfile sentiment;
    public String source;
    public int starRating;
    public long timestampMsec;
    public int tipEnd[];
    public int tipStart[];
    public String title;
    public String url;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasAuthorName)
            {
                i = j;
                if (authorName.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, authorName);
        }
        int k;
label1:
        {
            if (!hasUrl)
            {
                k = i;
                if (url.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, url);
        }
label2:
        {
            if (!hasSource)
            {
                i = k;
                if (source.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, source);
        }
label3:
        {
            if (!hasDocumentVersion)
            {
                k = i;
                if (documentVersion.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, documentVersion);
        }
label4:
        {
            if (!hasTimestampMsec)
            {
                i = k;
                if (timestampMsec == 0L)
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(5, timestampMsec);
        }
label5:
        {
            if (!hasStarRating)
            {
                k = i;
                if (starRating == 0)
                {
                    break label5;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(6, starRating);
        }
label6:
        {
            if (!hasTitle)
            {
                i = k;
                if (title.equals(""))
                {
                    break label6;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(7, title);
        }
label7:
        {
            if (!hasComment)
            {
                k = i;
                if (comment.equals(""))
                {
                    break label7;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(8, comment);
        }
label8:
        {
            if (!hasCommentId)
            {
                i = k;
                if (commentId.equals(""))
                {
                    break label8;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(9, commentId);
        }
label9:
        {
            if (!hasDeviceName)
            {
                k = i;
                if (deviceName.equals(""))
                {
                    break label9;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(19, deviceName);
        }
label10:
        {
            if (!hasReplyText)
            {
                i = k;
                if (replyText.equals(""))
                {
                    break label10;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(29, replyText);
        }
label11:
        {
            if (!hasReplyTimestampMsec)
            {
                k = i;
                if (replyTimestampMsec == 0L)
                {
                    break label11;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt64Size(30, replyTimestampMsec);
        }
label12:
        {
            i = k;
            if (oBSOLETEPlusProfile != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(31, oBSOLETEPlusProfile);
            }
            k = i;
            if (author != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(33, author);
            }
            int l = k;
            if (sentiment != null)
            {
                l = k + CodedOutputByteBufferNano.computeMessageSize(34, sentiment);
            }
            if (!hasHelpfulCount)
            {
                i = l;
                if (helpfulCount == 0)
                {
                    break label12;
                }
            }
            i = l + CodedOutputByteBufferNano.computeInt32Size(35, helpfulCount);
        }
        k = i;
        if (tipStart != null)
        {
            k = i;
            if (tipStart.length > 0)
            {
                int i1 = 0;
                for (k = 0; k < tipStart.length; k++)
                {
                    i1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(tipStart[k]);
                }

                k = i + i1 + tipStart.length * 2;
            }
        }
        i = k;
        if (tipEnd != null)
        {
            i = k;
            if (tipEnd.length > 0)
            {
                int j1 = 0;
                for (i = 0; i < tipEnd.length; i++)
                {
                    j1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(tipEnd[i]);
                }

                i = k + j1 + tipEnd.length * 2;
            }
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
                authorName = codedinputbytebuffernano.readString();
                hasAuthorName = true;
                break;

            case 18: // '\022'
                url = codedinputbytebuffernano.readString();
                hasUrl = true;
                break;

            case 26: // '\032'
                source = codedinputbytebuffernano.readString();
                hasSource = true;
                break;

            case 34: // '"'
                documentVersion = codedinputbytebuffernano.readString();
                hasDocumentVersion = true;
                break;

            case 40: // '('
                timestampMsec = codedinputbytebuffernano.readRawVarint64();
                hasTimestampMsec = true;
                break;

            case 48: // '0'
                starRating = codedinputbytebuffernano.readRawVarint32();
                hasStarRating = true;
                break;

            case 58: // ':'
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 66: // 'B'
                comment = codedinputbytebuffernano.readString();
                hasComment = true;
                break;

            case 74: // 'J'
                commentId = codedinputbytebuffernano.readString();
                hasCommentId = true;
                break;

            case 154: 
                deviceName = codedinputbytebuffernano.readString();
                hasDeviceName = true;
                break;

            case 234: 
                replyText = codedinputbytebuffernano.readString();
                hasReplyText = true;
                break;

            case 240: 
                replyTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                hasReplyTimestampMsec = true;
                break;

            case 250: 
                if (oBSOLETEPlusProfile == null)
                {
                    oBSOLETEPlusProfile = new PlusProfile();
                }
                codedinputbytebuffernano.readMessage(oBSOLETEPlusProfile);
                break;

            case 266: 
                if (author == null)
                {
                    author = new init>();
                }
                codedinputbytebuffernano.readMessage(author);
                break;

            case 274: 
                if (sentiment == null)
                {
                    sentiment = new >();
                }
                codedinputbytebuffernano.readMessage(sentiment);
                break;

            case 280: 
                helpfulCount = codedinputbytebuffernano.readRawVarint32();
                hasHelpfulCount = true;
                break;

            case 288: 
                int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 288);
                int ai[];
                int j;
                if (tipStart == null)
                {
                    j = 0;
                } else
                {
                    j = tipStart.length;
                }
                ai = new int[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(tipStart, 0, ai, 0, j);
                    j1 = j;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = codedinputbytebuffernano.readRawVarint32();
                    codedinputbytebuffernano.readTag();
                }

                ai[j1] = codedinputbytebuffernano.readRawVarint32();
                tipStart = ai;
                break;

            case 290: 
                int j2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int k = codedinputbytebuffernano.getPosition();
                int k1;
                for (k1 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; k1++)
                {
                    codedinputbytebuffernano.readRawVarint32();
                }

                codedinputbytebuffernano.rewindToPosition(k);
                int ai1[];
                if (tipStart == null)
                {
                    k = 0;
                } else
                {
                    k = tipStart.length;
                }
                ai1 = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(tipStart, 0, ai1, 0, k);
                    k1 = k;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = codedinputbytebuffernano.readRawVarint32();
                }

                tipStart = ai1;
                codedinputbytebuffernano.popLimit(j2);
                break;

            case 296: 
                int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 296);
                int ai2[];
                int l;
                if (tipEnd == null)
                {
                    l = 0;
                } else
                {
                    l = tipEnd.length;
                }
                ai2 = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(tipEnd, 0, ai2, 0, l);
                    l1 = l;
                }
                for (; l1 < ai2.length - 1; l1++)
                {
                    ai2[l1] = codedinputbytebuffernano.readRawVarint32();
                    codedinputbytebuffernano.readTag();
                }

                ai2[l1] = codedinputbytebuffernano.readRawVarint32();
                tipEnd = ai2;
                break;

            case 298: 
                int k2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int i1 = codedinputbytebuffernano.getPosition();
                int i2;
                for (i2 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i2++)
                {
                    codedinputbytebuffernano.readRawVarint32();
                }

                codedinputbytebuffernano.rewindToPosition(i1);
                int ai3[];
                if (tipEnd == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = tipEnd.length;
                }
                ai3 = new int[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(tipEnd, 0, ai3, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai3.length; i2++)
                {
                    ai3[i2] = codedinputbytebuffernano.readRawVarint32();
                }

                tipEnd = ai3;
                codedinputbytebuffernano.popLimit(k2);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasAuthorName || !authorName.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, authorName);
        }
        if (hasUrl || !url.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, url);
        }
        if (hasSource || !source.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, source);
        }
        if (hasDocumentVersion || !documentVersion.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, documentVersion);
        }
        if (hasTimestampMsec || timestampMsec != 0L)
        {
            codedoutputbytebuffernano.writeInt64(5, timestampMsec);
        }
        if (hasStarRating || starRating != 0)
        {
            codedoutputbytebuffernano.writeInt32(6, starRating);
        }
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(7, title);
        }
        if (hasComment || !comment.equals(""))
        {
            codedoutputbytebuffernano.writeString(8, comment);
        }
        if (hasCommentId || !commentId.equals(""))
        {
            codedoutputbytebuffernano.writeString(9, commentId);
        }
        if (hasDeviceName || !deviceName.equals(""))
        {
            codedoutputbytebuffernano.writeString(19, deviceName);
        }
        if (hasReplyText || !replyText.equals(""))
        {
            codedoutputbytebuffernano.writeString(29, replyText);
        }
        if (hasReplyTimestampMsec || replyTimestampMsec != 0L)
        {
            codedoutputbytebuffernano.writeInt64(30, replyTimestampMsec);
        }
        if (oBSOLETEPlusProfile != null)
        {
            codedoutputbytebuffernano.writeMessage(31, oBSOLETEPlusProfile);
        }
        if (author != null)
        {
            codedoutputbytebuffernano.writeMessage(33, author);
        }
        if (sentiment != null)
        {
            codedoutputbytebuffernano.writeMessage(34, sentiment);
        }
        if (hasHelpfulCount || helpfulCount != 0)
        {
            codedoutputbytebuffernano.writeInt32(35, helpfulCount);
        }
        if (tipStart != null && tipStart.length > 0)
        {
            for (int i = 0; i < tipStart.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(36, tipStart[i]);
            }

        }
        if (tipEnd != null && tipEnd.length > 0)
        {
            for (int j = 0; j < tipEnd.length; j++)
            {
                codedoutputbytebuffernano.writeInt32(37, tipEnd[j]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public PlusProfile()
    {
        commentId = "";
        hasCommentId = false;
        author = null;
        starRating = 0;
        hasStarRating = false;
        sentiment = null;
        title = "";
        hasTitle = false;
        comment = "";
        hasComment = false;
        url = "";
        hasUrl = false;
        source = "";
        hasSource = false;
        documentVersion = "";
        hasDocumentVersion = false;
        timestampMsec = 0L;
        hasTimestampMsec = false;
        deviceName = "";
        hasDeviceName = false;
        replyText = "";
        hasReplyText = false;
        replyTimestampMsec = 0L;
        hasReplyTimestampMsec = false;
        helpfulCount = 0;
        hasHelpfulCount = false;
        tipStart = WireFormatNano.EMPTY_INT_ARRAY;
        tipEnd = WireFormatNano.EMPTY_INT_ARRAY;
        oBSOLETEPlusProfile = null;
        authorName = "";
        hasAuthorName = false;
        cachedSize = -1;
    }
}
