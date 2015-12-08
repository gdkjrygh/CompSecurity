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
import java.util.Arrays;

// Referenced classes of package com.google.android.finsky.protos:
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    private static volatile  _emptyArray[];
    public ating aggregateRating;
    public tions annotations;
    public ability availability;
    public boolean availableForPreregistration;
    public String backendDocid;
    public int backendId;
    public String backendUrl;
    public ability child[];
    public nerMetadata containerMetadata;
    public String creator;
    public String descriptionHtml;
    public ntDetails details;
    public boolean detailsReusable;
    public String detailsUrl;
    public int docType;
    public String docid;
    public boolean hasAvailableForPreregistration;
    public boolean hasBackendDocid;
    public boolean hasBackendId;
    public boolean hasBackendUrl;
    public boolean hasCreator;
    public boolean hasDescriptionHtml;
    public boolean hasDetailsReusable;
    public boolean hasDetailsUrl;
    public boolean hasDocType;
    public boolean hasDocid;
    public boolean hasMature;
    public boolean hasPromotionalDescription;
    public boolean hasPurchaseDetailsUrl;
    public boolean hasReviewsUrl;
    public boolean hasServerLogsCookie;
    public boolean hasShareUrl;
    public boolean hasSubtitle;
    public boolean hasTitle;
    public boolean hasTranslatedDescriptionHtml;
    public ntDetails image[];
    public boolean mature;
    public ntDetails offer[];
    public tDetails productDetails;
    public String promotionalDescription;
    public String purchaseDetailsUrl;
    public String reviewsUrl;
    public byte serverLogsCookie[];
    public String shareUrl;
    public String subtitle;
    public tDetails tip[];
    public String title;
    public String translatedDescriptionHtml;

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
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
            if (!hasDocid)
            {
                i = j;
                if (docid.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, docid);
        }
        int k;
label1:
        {
            if (!hasBackendDocid)
            {
                k = i;
                if (backendDocid.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, backendDocid);
        }
label2:
        {
            if (docType == 1)
            {
                i = k;
                if (!hasDocType)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, docType);
        }
label3:
        {
            if (backendId == 0)
            {
                k = i;
                if (!hasBackendId)
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(4, backendId);
        }
label4:
        {
            if (!hasTitle)
            {
                i = k;
                if (title.equals(""))
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(5, title);
        }
label5:
        {
            if (!hasCreator)
            {
                k = i;
                if (creator.equals(""))
                {
                    break label5;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(6, creator);
        }
label6:
        {
            if (!hasDescriptionHtml)
            {
                i = k;
                if (descriptionHtml.equals(""))
                {
                    break label6;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(7, descriptionHtml);
        }
label7:
        {
            int i1 = i;
            if (offer != null)
            {
                i1 = i;
                if (offer.length > 0)
                {
                    k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= offer.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray = offer[k];
                        i1 = i;
                        if (_lemptyarray != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(8, _lemptyarray);
                        }
                        k++;
                        i = i1;
                    } while (true);
                }
            }
            k = i1;
            if (availability != null)
            {
                k = i1 + CodedOutputByteBufferNano.computeMessageSize(9, availability);
            }
            i = k;
            if (image != null)
            {
                i = k;
                if (image.length > 0)
                {
                    int j1 = 0;
                    do
                    {
                        i = k;
                        if (j1 >= image.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray1 = image[j1];
                        i = k;
                        if (_lemptyarray1 != null)
                        {
                            i = k + CodedOutputByteBufferNano.computeMessageSize(10, _lemptyarray1);
                        }
                        j1++;
                        k = i;
                    } while (true);
                }
            }
            k = i;
            if (child != null)
            {
                k = i;
                if (child.length > 0)
                {
                    int k1 = 0;
                    do
                    {
                        k = i;
                        if (k1 >= child.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray2 = child[k1];
                        k = i;
                        if (_lemptyarray2 != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(11, _lemptyarray2);
                        }
                        k1++;
                        i = k;
                    } while (true);
                }
            }
            i = k;
            if (containerMetadata != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(12, containerMetadata);
            }
            k = i;
            if (details != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(13, details);
            }
            i = k;
            if (aggregateRating != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(14, aggregateRating);
            }
            k = i;
            if (annotations != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(15, annotations);
            }
            if (!hasDetailsUrl)
            {
                i = k;
                if (detailsUrl.equals(""))
                {
                    break label7;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(16, detailsUrl);
        }
label8:
        {
            if (!hasShareUrl)
            {
                k = i;
                if (shareUrl.equals(""))
                {
                    break label8;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(17, shareUrl);
        }
label9:
        {
            if (!hasReviewsUrl)
            {
                i = k;
                if (reviewsUrl.equals(""))
                {
                    break label9;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(18, reviewsUrl);
        }
label10:
        {
            if (!hasBackendUrl)
            {
                k = i;
                if (backendUrl.equals(""))
                {
                    break label10;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(19, backendUrl);
        }
label11:
        {
            if (!hasPurchaseDetailsUrl)
            {
                i = k;
                if (purchaseDetailsUrl.equals(""))
                {
                    break label11;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(20, purchaseDetailsUrl);
        }
label12:
        {
            if (!hasDetailsReusable)
            {
                k = i;
                if (!detailsReusable)
                {
                    break label12;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(21) + 1);
        }
label13:
        {
            if (!hasSubtitle)
            {
                i = k;
                if (subtitle.equals(""))
                {
                    break label13;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(22, subtitle);
        }
label14:
        {
            if (!hasTranslatedDescriptionHtml)
            {
                k = i;
                if (translatedDescriptionHtml.equals(""))
                {
                    break label14;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(23, translatedDescriptionHtml);
        }
label15:
        {
            if (!hasServerLogsCookie)
            {
                i = k;
                if (Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
                {
                    break label15;
                }
            }
            i = k + CodedOutputByteBufferNano.computeBytesSize(24, serverLogsCookie);
        }
label16:
        {
            k = i;
            if (productDetails != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(25, productDetails);
            }
            if (!hasMature)
            {
                i = k;
                if (!mature)
                {
                    break label16;
                }
            }
            i = k + (CodedOutputByteBufferNano.computeTagSize(26) + 1);
        }
label17:
        {
            if (!hasPromotionalDescription)
            {
                k = i;
                if (promotionalDescription.equals(""))
                {
                    break label17;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(27, promotionalDescription);
        }
label18:
        {
            if (!hasAvailableForPreregistration)
            {
                i = k;
                if (!availableForPreregistration)
                {
                    break label18;
                }
            }
            i = k + (CodedOutputByteBufferNano.computeTagSize(29) + 1);
        }
        int l1 = i;
        if (tip != null)
        {
            l1 = i;
            if (tip.length > 0)
            {
                int l = 0;
                do
                {
                    l1 = i;
                    if (l >= tip.length)
                    {
                        break;
                    }
                    _emptyArray _lemptyarray3 = tip[l];
                    l1 = i;
                    if (_lemptyarray3 != null)
                    {
                        l1 = i + CodedOutputByteBufferNano.computeMessageSize(30, _lemptyarray3);
                    }
                    l++;
                    i = l1;
                } while (true);
            }
        }
        return l1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L32:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 30: default 256
    //                   0: 264
    //                   10: 266
    //                   18: 282
    //                   24: 298
    //                   32: 500
    //                   42: 588
    //                   50: 604
    //                   58: 620
    //                   66: 636
    //                   74: 760
    //                   82: 789
    //                   90: 913
    //                   98: 1037
    //                   106: 1066
    //                   114: 1095
    //                   122: 1124
    //                   130: 1153
    //                   138: 1169
    //                   146: 1185
    //                   154: 1201
    //                   162: 1217
    //                   168: 1233
    //                   178: 1249
    //                   186: 1265
    //                   194: 1281
    //                   202: 1297
    //                   208: 1326
    //                   218: 1342
    //                   232: 1358
    //                   242: 1374;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L32; else goto _L2
_L2:
        return this;
_L3:
        docid = codedinputbytebuffernano.readString();
        hasDocid = true;
          goto _L32
_L4:
        backendDocid = codedinputbytebuffernano.readString();
        hasBackendDocid = true;
          goto _L32
_L5:
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
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
            docType = j;
            hasDocType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            backendId = k;
            hasBackendId = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        title = codedinputbytebuffernano.readString();
        hasTitle = true;
        continue; /* Loop/switch isn't completed */
_L8:
        creator = codedinputbytebuffernano.readString();
        hasCreator = true;
        continue; /* Loop/switch isn't completed */
_L9:
        descriptionHtml = codedinputbytebuffernano.readString();
        hasDescriptionHtml = true;
        continue; /* Loop/switch isn't completed */
_L10:
        int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 66);
        .computeMessageSize acomputemessagesize[];
        int l;
        if (offer == null)
        {
            l = 0;
        } else
        {
            l = offer.length;
        }
        acomputemessagesize = new offer[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(offer, 0, acomputemessagesize, 0, l);
            l1 = l;
        }
        for (; l1 < acomputemessagesize.length - 1; l1++)
        {
            acomputemessagesize[l1] = new t>();
            codedinputbytebuffernano.readMessage(acomputemessagesize[l1]);
            codedinputbytebuffernano.readTag();
        }

        acomputemessagesize[l1] = new t>();
        codedinputbytebuffernano.readMessage(acomputemessagesize[l1]);
        offer = acomputemessagesize;
        continue; /* Loop/switch isn't completed */
_L11:
        if (availability == null)
        {
            availability = new ability();
        }
        codedinputbytebuffernano.readMessage(availability);
        continue; /* Loop/switch isn't completed */
_L12:
        int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
        .computeMessageSize acomputemessagesize1[];
        int i1;
        if (image == null)
        {
            i1 = 0;
        } else
        {
            i1 = image.length;
        }
        acomputemessagesize1 = new image[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(image, 0, acomputemessagesize1, 0, i1);
            i2 = i1;
        }
        for (; i2 < acomputemessagesize1.length - 1; i2++)
        {
            acomputemessagesize1[i2] = new t>();
            codedinputbytebuffernano.readMessage(acomputemessagesize1[i2]);
            codedinputbytebuffernano.readTag();
        }

        acomputemessagesize1[i2] = new t>();
        codedinputbytebuffernano.readMessage(acomputemessagesize1[i2]);
        image = acomputemessagesize1;
        continue; /* Loop/switch isn't completed */
_L13:
        int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
        .computeMessageSize acomputemessagesize2[];
        int j1;
        if (child == null)
        {
            j1 = 0;
        } else
        {
            j1 = child.length;
        }
        acomputemessagesize2 = new child[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(child, 0, acomputemessagesize2, 0, j1);
            j2 = j1;
        }
        for (; j2 < acomputemessagesize2.length - 1; j2++)
        {
            acomputemessagesize2[j2] = new <init>();
            codedinputbytebuffernano.readMessage(acomputemessagesize2[j2]);
            codedinputbytebuffernano.readTag();
        }

        acomputemessagesize2[j2] = new <init>();
        codedinputbytebuffernano.readMessage(acomputemessagesize2[j2]);
        child = acomputemessagesize2;
        continue; /* Loop/switch isn't completed */
_L14:
        if (containerMetadata == null)
        {
            containerMetadata = new nerMetadata();
        }
        codedinputbytebuffernano.readMessage(containerMetadata);
        continue; /* Loop/switch isn't completed */
_L15:
        if (details == null)
        {
            details = new ntDetails();
        }
        codedinputbytebuffernano.readMessage(details);
        continue; /* Loop/switch isn't completed */
_L16:
        if (aggregateRating == null)
        {
            aggregateRating = new ating();
        }
        codedinputbytebuffernano.readMessage(aggregateRating);
        continue; /* Loop/switch isn't completed */
_L17:
        if (annotations == null)
        {
            annotations = new tions();
        }
        codedinputbytebuffernano.readMessage(annotations);
        continue; /* Loop/switch isn't completed */
_L18:
        detailsUrl = codedinputbytebuffernano.readString();
        hasDetailsUrl = true;
        continue; /* Loop/switch isn't completed */
_L19:
        shareUrl = codedinputbytebuffernano.readString();
        hasShareUrl = true;
        continue; /* Loop/switch isn't completed */
_L20:
        reviewsUrl = codedinputbytebuffernano.readString();
        hasReviewsUrl = true;
        continue; /* Loop/switch isn't completed */
_L21:
        backendUrl = codedinputbytebuffernano.readString();
        hasBackendUrl = true;
        continue; /* Loop/switch isn't completed */
_L22:
        purchaseDetailsUrl = codedinputbytebuffernano.readString();
        hasPurchaseDetailsUrl = true;
        continue; /* Loop/switch isn't completed */
_L23:
        detailsReusable = codedinputbytebuffernano.readBool();
        hasDetailsReusable = true;
        continue; /* Loop/switch isn't completed */
_L24:
        subtitle = codedinputbytebuffernano.readString();
        hasSubtitle = true;
        continue; /* Loop/switch isn't completed */
_L25:
        translatedDescriptionHtml = codedinputbytebuffernano.readString();
        hasTranslatedDescriptionHtml = true;
        continue; /* Loop/switch isn't completed */
_L26:
        serverLogsCookie = codedinputbytebuffernano.readBytes();
        hasServerLogsCookie = true;
        continue; /* Loop/switch isn't completed */
_L27:
        if (productDetails == null)
        {
            productDetails = new tDetails();
        }
        codedinputbytebuffernano.readMessage(productDetails);
        continue; /* Loop/switch isn't completed */
_L28:
        mature = codedinputbytebuffernano.readBool();
        hasMature = true;
        continue; /* Loop/switch isn't completed */
_L29:
        promotionalDescription = codedinputbytebuffernano.readString();
        hasPromotionalDescription = true;
        continue; /* Loop/switch isn't completed */
_L30:
        availableForPreregistration = codedinputbytebuffernano.readBool();
        hasAvailableForPreregistration = true;
        continue; /* Loop/switch isn't completed */
_L31:
        int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 242);
        .computeMessageSize acomputemessagesize3[];
        int k1;
        if (tip == null)
        {
            k1 = 0;
        } else
        {
            k1 = tip.length;
        }
        acomputemessagesize3 = new tip[k2 + k1];
        k2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(tip, 0, acomputemessagesize3, 0, k1);
            k2 = k1;
        }
        for (; k2 < acomputemessagesize3.length - 1; k2++)
        {
            acomputemessagesize3[k2] = new it>();
            codedinputbytebuffernano.readMessage(acomputemessagesize3[k2]);
            codedinputbytebuffernano.readTag();
        }

        acomputemessagesize3[k2] = new it>();
        codedinputbytebuffernano.readMessage(acomputemessagesize3[k2]);
        tip = acomputemessagesize3;
        if (true) goto _L32; else goto _L33
_L33:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDocid || !docid.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, docid);
        }
        if (hasBackendDocid || !backendDocid.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, backendDocid);
        }
        if (docType != 1 || hasDocType)
        {
            codedoutputbytebuffernano.writeInt32(3, docType);
        }
        if (backendId != 0 || hasBackendId)
        {
            codedoutputbytebuffernano.writeInt32(4, backendId);
        }
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, title);
        }
        if (hasCreator || !creator.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, creator);
        }
        if (hasDescriptionHtml || !descriptionHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(7, descriptionHtml);
        }
        if (offer != null && offer.length > 0)
        {
            for (int i = 0; i < offer.length; i++)
            {
                  = offer[i];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(8, );
                }
            }

        }
        if (availability != null)
        {
            codedoutputbytebuffernano.writeMessage(9, availability);
        }
        if (image != null && image.length > 0)
        {
            for (int j = 0; j < image.length; j++)
            {
                 1 = image[j];
                if (1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(10, 1);
                }
            }

        }
        if (child != null && child.length > 0)
        {
            for (int k = 0; k < child.length; k++)
            {
                 2 = child[k];
                if (2 != null)
                {
                    codedoutputbytebuffernano.writeMessage(11, 2);
                }
            }

        }
        if (containerMetadata != null)
        {
            codedoutputbytebuffernano.writeMessage(12, containerMetadata);
        }
        if (details != null)
        {
            codedoutputbytebuffernano.writeMessage(13, details);
        }
        if (aggregateRating != null)
        {
            codedoutputbytebuffernano.writeMessage(14, aggregateRating);
        }
        if (annotations != null)
        {
            codedoutputbytebuffernano.writeMessage(15, annotations);
        }
        if (hasDetailsUrl || !detailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(16, detailsUrl);
        }
        if (hasShareUrl || !shareUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(17, shareUrl);
        }
        if (hasReviewsUrl || !reviewsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(18, reviewsUrl);
        }
        if (hasBackendUrl || !backendUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(19, backendUrl);
        }
        if (hasPurchaseDetailsUrl || !purchaseDetailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(20, purchaseDetailsUrl);
        }
        if (hasDetailsReusable || detailsReusable)
        {
            codedoutputbytebuffernano.writeBool(21, detailsReusable);
        }
        if (hasSubtitle || !subtitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(22, subtitle);
        }
        if (hasTranslatedDescriptionHtml || !translatedDescriptionHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(23, translatedDescriptionHtml);
        }
        if (hasServerLogsCookie || !Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(24, serverLogsCookie);
        }
        if (productDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(25, productDetails);
        }
        if (hasMature || mature)
        {
            codedoutputbytebuffernano.writeBool(26, mature);
        }
        if (hasPromotionalDescription || !promotionalDescription.equals(""))
        {
            codedoutputbytebuffernano.writeString(27, promotionalDescription);
        }
        if (hasAvailableForPreregistration || availableForPreregistration)
        {
            codedoutputbytebuffernano.writeBool(29, availableForPreregistration);
        }
        if (tip != null && tip.length > 0)
        {
            for (int l = 0; l < tip.length; l++)
            {
                 3 = tip[l];
                if (3 != null)
                {
                    codedoutputbytebuffernano.writeMessage(30, 3);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        docid = "";
        hasDocid = false;
        backendDocid = "";
        hasBackendDocid = false;
        docType = 1;
        hasDocType = false;
        backendId = 0;
        hasBackendId = false;
        title = "";
        hasTitle = false;
        subtitle = "";
        hasSubtitle = false;
        creator = "";
        hasCreator = false;
        descriptionHtml = "";
        hasDescriptionHtml = false;
        translatedDescriptionHtml = "";
        hasTranslatedDescriptionHtml = false;
        promotionalDescription = "";
        hasPromotionalDescription = false;
        offer = yArray();
        availability = null;
        image = yArray();
        child = emptyArray();
        containerMetadata = null;
        details = null;
        productDetails = null;
        aggregateRating = null;
        annotations = null;
        detailsUrl = "";
        hasDetailsUrl = false;
        shareUrl = "";
        hasShareUrl = false;
        reviewsUrl = "";
        hasReviewsUrl = false;
        backendUrl = "";
        hasBackendUrl = false;
        purchaseDetailsUrl = "";
        hasPurchaseDetailsUrl = false;
        detailsReusable = false;
        hasDetailsReusable = false;
        serverLogsCookie = WireFormatNano.EMPTY_BYTES;
        hasServerLogsCookie = false;
        mature = false;
        hasMature = false;
        availableForPreregistration = false;
        hasAvailableForPreregistration = false;
        tip = tyArray();
        cachedSize = -1;
    }
}
