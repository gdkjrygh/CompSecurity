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
//            Rating

public static final class cachedSize extends MessageNano
{

    public double bayesianMeanRating;
    public long commentCount;
    public long fiveStarRatings;
    public long fourStarRatings;
    public boolean hasBayesianMeanRating;
    public boolean hasCommentCount;
    public boolean hasFiveStarRatings;
    public boolean hasFourStarRatings;
    public boolean hasOneStarRatings;
    public boolean hasRatingsCount;
    public boolean hasStarRating;
    public boolean hasThreeStarRatings;
    public boolean hasThumbsDownCount;
    public boolean hasThumbsUpCount;
    public boolean hasTwoStarRatings;
    public boolean hasType;
    public long oneStarRatings;
    public long ratingsCount;
    public float starRating;
    public long threeStarRatings;
    public long thumbsDownCount;
    public long thumbsUpCount;
    public Message tip[];
    public long twoStarRatings;
    public int type;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (type == 1)
            {
                i = j;
                if (!hasType)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
        }
        int k;
label1:
        {
            if (!hasStarRating)
            {
                k = i;
                if (Float.floatToIntBits(starRating) == Float.floatToIntBits(0.0F))
                {
                    break label1;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(2) + 4);
        }
label2:
        {
            if (!hasRatingsCount)
            {
                i = k;
                if (ratingsCount == 0L)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeUInt64Size(3, ratingsCount);
        }
label3:
        {
            if (!hasOneStarRatings)
            {
                k = i;
                if (oneStarRatings == 0L)
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeUInt64Size(4, oneStarRatings);
        }
label4:
        {
            if (!hasTwoStarRatings)
            {
                i = k;
                if (twoStarRatings == 0L)
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeUInt64Size(5, twoStarRatings);
        }
label5:
        {
            if (!hasThreeStarRatings)
            {
                k = i;
                if (threeStarRatings == 0L)
                {
                    break label5;
                }
            }
            k = i + CodedOutputByteBufferNano.computeUInt64Size(6, threeStarRatings);
        }
label6:
        {
            if (!hasFourStarRatings)
            {
                i = k;
                if (fourStarRatings == 0L)
                {
                    break label6;
                }
            }
            i = k + CodedOutputByteBufferNano.computeUInt64Size(7, fourStarRatings);
        }
label7:
        {
            if (!hasFiveStarRatings)
            {
                k = i;
                if (fiveStarRatings == 0L)
                {
                    break label7;
                }
            }
            k = i + CodedOutputByteBufferNano.computeUInt64Size(8, fiveStarRatings);
        }
label8:
        {
            if (!hasThumbsUpCount)
            {
                i = k;
                if (thumbsUpCount == 0L)
                {
                    break label8;
                }
            }
            i = k + CodedOutputByteBufferNano.computeUInt64Size(9, thumbsUpCount);
        }
label9:
        {
            if (!hasThumbsDownCount)
            {
                k = i;
                if (thumbsDownCount == 0L)
                {
                    break label9;
                }
            }
            k = i + CodedOutputByteBufferNano.computeUInt64Size(10, thumbsDownCount);
        }
        int i1;
label10:
        {
            if (!hasCommentCount)
            {
                i1 = k;
                if (commentCount == 0L)
                {
                    break label10;
                }
            }
            i1 = k + CodedOutputByteBufferNano.computeUInt64Size(11, commentCount);
        }
label11:
        {
            if (!hasBayesianMeanRating)
            {
                i = i1;
                if (Double.doubleToLongBits(bayesianMeanRating) == Double.doubleToLongBits(0.0D))
                {
                    break label11;
                }
            }
            i = i1 + (CodedOutputByteBufferNano.computeTagSize(12) + 8);
        }
        i1 = i;
        if (tip != null)
        {
            i1 = i;
            if (tip.length > 0)
            {
                int l = 0;
                do
                {
                    i1 = i;
                    if (l >= tip.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = tip[l];
                    i1 = i;
                    if (cachedsize != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(13, cachedsize);
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
_L16:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 136
    //                   8: 138
    //                   21: 188
    //                   24: 207
    //                   32: 223
    //                   40: 239
    //                   48: 255
    //                   56: 271
    //                   64: 287
    //                   72: 303
    //                   80: 319
    //                   88: 335
    //                   97: 351
    //                   106: 370;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            type = j;
            hasType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        starRating = Float.intBitsToFloat(codedinputbytebuffernano.readRawLittleEndian32());
        hasStarRating = true;
        continue; /* Loop/switch isn't completed */
_L5:
        ratingsCount = codedinputbytebuffernano.readRawVarint64();
        hasRatingsCount = true;
        continue; /* Loop/switch isn't completed */
_L6:
        oneStarRatings = codedinputbytebuffernano.readRawVarint64();
        hasOneStarRatings = true;
        continue; /* Loop/switch isn't completed */
_L7:
        twoStarRatings = codedinputbytebuffernano.readRawVarint64();
        hasTwoStarRatings = true;
        continue; /* Loop/switch isn't completed */
_L8:
        threeStarRatings = codedinputbytebuffernano.readRawVarint64();
        hasThreeStarRatings = true;
        continue; /* Loop/switch isn't completed */
_L9:
        fourStarRatings = codedinputbytebuffernano.readRawVarint64();
        hasFourStarRatings = true;
        continue; /* Loop/switch isn't completed */
_L10:
        fiveStarRatings = codedinputbytebuffernano.readRawVarint64();
        hasFiveStarRatings = true;
        continue; /* Loop/switch isn't completed */
_L11:
        thumbsUpCount = codedinputbytebuffernano.readRawVarint64();
        hasThumbsUpCount = true;
        continue; /* Loop/switch isn't completed */
_L12:
        thumbsDownCount = codedinputbytebuffernano.readRawVarint64();
        hasThumbsDownCount = true;
        continue; /* Loop/switch isn't completed */
_L13:
        commentCount = codedinputbytebuffernano.readRawVarint64();
        hasCommentCount = true;
        continue; /* Loop/switch isn't completed */
_L14:
        bayesianMeanRating = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
        hasBayesianMeanRating = true;
        continue; /* Loop/switch isn't completed */
_L15:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 106);
        teMessageSize atemessagesize[];
        int k;
        if (tip == null)
        {
            k = 0;
        } else
        {
            k = tip.length;
        }
        atemessagesize = new tip[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(tip, 0, atemessagesize, 0, k);
            l = k;
        }
        for (; l < atemessagesize.length - 1; l++)
        {
            atemessagesize[l] = new tip();
            codedinputbytebuffernano.readMessage(atemessagesize[l]);
            codedinputbytebuffernano.readTag();
        }

        atemessagesize[l] = new g();
        codedinputbytebuffernano.readMessage(atemessagesize[l]);
        tip = atemessagesize;
        if (true) goto _L16; else goto _L17
_L17:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (type != 1 || hasType)
        {
            codedoutputbytebuffernano.writeInt32(1, type);
        }
        if (hasStarRating || Float.floatToIntBits(starRating) != Float.floatToIntBits(0.0F))
        {
            codedoutputbytebuffernano.writeFloat(2, starRating);
        }
        if (hasRatingsCount || ratingsCount != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(3, ratingsCount);
        }
        if (hasOneStarRatings || oneStarRatings != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(4, oneStarRatings);
        }
        if (hasTwoStarRatings || twoStarRatings != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(5, twoStarRatings);
        }
        if (hasThreeStarRatings || threeStarRatings != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(6, threeStarRatings);
        }
        if (hasFourStarRatings || fourStarRatings != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(7, fourStarRatings);
        }
        if (hasFiveStarRatings || fiveStarRatings != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(8, fiveStarRatings);
        }
        if (hasThumbsUpCount || thumbsUpCount != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(9, thumbsUpCount);
        }
        if (hasThumbsDownCount || thumbsDownCount != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(10, thumbsDownCount);
        }
        if (hasCommentCount || commentCount != 0L)
        {
            codedoutputbytebuffernano.writeUInt64(11, commentCount);
        }
        if (hasBayesianMeanRating || Double.doubleToLongBits(bayesianMeanRating) != Double.doubleToLongBits(0.0D))
        {
            codedoutputbytebuffernano.writeDouble(12, bayesianMeanRating);
        }
        if (tip != null && tip.length > 0)
        {
            for (int i = 0; i < tip.length; i++)
            {
                tip tip1 = tip[i];
                if (tip1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(13, tip1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        type = 1;
        hasType = false;
        starRating = 0.0F;
        hasStarRating = false;
        ratingsCount = 0L;
        hasRatingsCount = false;
        commentCount = 0L;
        hasCommentCount = false;
        oneStarRatings = 0L;
        hasOneStarRatings = false;
        twoStarRatings = 0L;
        hasTwoStarRatings = false;
        threeStarRatings = 0L;
        hasThreeStarRatings = false;
        fourStarRatings = 0L;
        hasFourStarRatings = false;
        fiveStarRatings = 0L;
        hasFiveStarRatings = false;
        bayesianMeanRating = 0.0D;
        hasBayesianMeanRating = false;
        thumbsUpCount = 0L;
        hasThumbsUpCount = false;
        thumbsDownCount = 0L;
        hasThumbsDownCount = false;
        tip = tip();
        cachedSize = -1;
    }
}
