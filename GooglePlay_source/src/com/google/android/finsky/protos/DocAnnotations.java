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

public interface DocAnnotations
{
    public static final class Badge extends MessageNano
    {

        private static volatile Badge _emptyArray[];
        public String browseUrl;
        public String description;
        public Common.Image expandedBadgeImage;
        public boolean hasBrowseUrl;
        public boolean hasDescription;
        public boolean hasTextInTitleSection;
        public boolean hasTitle;
        public Common.Image image[];
        public String textInTitleSection;
        public String title;

        public static Badge[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Badge[0];
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
label1:
            {
                int k = i;
                if (image != null)
                {
                    k = i;
                    if (image.length > 0)
                    {
                        int i1 = 0;
                        do
                        {
                            k = i;
                            if (i1 >= image.length)
                            {
                                break;
                            }
                            Common.Image image1 = image[i1];
                            k = i;
                            if (image1 != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(2, image1);
                            }
                            i1++;
                            i = k;
                        } while (true);
                    }
                }
                if (!hasBrowseUrl)
                {
                    i = k;
                    if (browseUrl.equals(""))
                    {
                        break label1;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, browseUrl);
            }
            int l;
label2:
            {
                if (!hasDescription)
                {
                    l = i;
                    if (description.equals(""))
                    {
                        break label2;
                    }
                }
                l = i + CodedOutputByteBufferNano.computeStringSize(4, description);
            }
label3:
            {
                if (!hasTextInTitleSection)
                {
                    i = l;
                    if (textInTitleSection.equals(""))
                    {
                        break label3;
                    }
                }
                i = l + CodedOutputByteBufferNano.computeStringSize(5, textInTitleSection);
            }
            l = i;
            if (expandedBadgeImage != null)
            {
                l = i + CodedOutputByteBufferNano.computeMessageSize(6, expandedBadgeImage);
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
                    Common.Image aimage[];
                    int j;
                    if (image == null)
                    {
                        j = 0;
                    } else
                    {
                        j = image.length;
                    }
                    aimage = new Common.Image[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(image, 0, aimage, 0, j);
                        k = j;
                    }
                    for (; k < aimage.length - 1; k++)
                    {
                        aimage[k] = new Common.Image();
                        codedinputbytebuffernano.readMessage(aimage[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aimage[k] = new Common.Image();
                    codedinputbytebuffernano.readMessage(aimage[k]);
                    image = aimage;
                    break;

                case 26: // '\032'
                    browseUrl = codedinputbytebuffernano.readString();
                    hasBrowseUrl = true;
                    break;

                case 34: // '"'
                    description = codedinputbytebuffernano.readString();
                    hasDescription = true;
                    break;

                case 42: // '*'
                    textInTitleSection = codedinputbytebuffernano.readString();
                    hasTextInTitleSection = true;
                    break;

                case 50: // '2'
                    if (expandedBadgeImage == null)
                    {
                        expandedBadgeImage = new Common.Image();
                    }
                    codedinputbytebuffernano.readMessage(expandedBadgeImage);
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
            if (image != null && image.length > 0)
            {
                for (int i = 0; i < image.length; i++)
                {
                    Common.Image image1 = image[i];
                    if (image1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, image1);
                    }
                }

            }
            if (hasBrowseUrl || !browseUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, browseUrl);
            }
            if (hasDescription || !description.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, description);
            }
            if (hasTextInTitleSection || !textInTitleSection.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, textInTitleSection);
            }
            if (expandedBadgeImage != null)
            {
                codedoutputbytebuffernano.writeMessage(6, expandedBadgeImage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Badge()
        {
            title = "";
            hasTitle = false;
            description = "";
            hasDescription = false;
            image = Common.Image.emptyArray();
            expandedBadgeImage = null;
            browseUrl = "";
            hasBrowseUrl = false;
            textInTitleSection = "";
            hasTextInTitleSection = false;
            cachedSize = -1;
        }
    }

    public static final class BadgeContainer extends MessageNano
    {

        private static volatile BadgeContainer _emptyArray[];
        public Badge badge[];
        public boolean hasTitle;
        public Common.Image image[];
        public String title;

        public static BadgeContainer[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new BadgeContainer[0];
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
                if (!hasTitle)
                {
                    k = i;
                    if (title.equals(""))
                    {
                        break label0;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            int j = k;
            if (image != null)
            {
                j = k;
                if (image.length > 0)
                {
                    int i1 = 0;
                    do
                    {
                        j = k;
                        if (i1 >= image.length)
                        {
                            break;
                        }
                        Common.Image image1 = image[i1];
                        j = k;
                        if (image1 != null)
                        {
                            j = k + CodedOutputByteBufferNano.computeMessageSize(2, image1);
                        }
                        i1++;
                        k = j;
                    } while (true);
                }
            }
            int j1 = j;
            if (badge != null)
            {
                j1 = j;
                if (badge.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j1 = j;
                        if (l >= badge.length)
                        {
                            break;
                        }
                        Badge badge1 = badge[l];
                        j1 = j;
                        if (badge1 != null)
                        {
                            j1 = j + CodedOutputByteBufferNano.computeMessageSize(3, badge1);
                        }
                        l++;
                        j = j1;
                    } while (true);
                }
            }
            return j1;
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
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    Common.Image aimage[];
                    int j;
                    if (image == null)
                    {
                        j = 0;
                    } else
                    {
                        j = image.length;
                    }
                    aimage = new Common.Image[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(image, 0, aimage, 0, j);
                        l = j;
                    }
                    for (; l < aimage.length - 1; l++)
                    {
                        aimage[l] = new Common.Image();
                        codedinputbytebuffernano.readMessage(aimage[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    aimage[l] = new Common.Image();
                    codedinputbytebuffernano.readMessage(aimage[l]);
                    image = aimage;
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    Badge abadge[];
                    int k;
                    if (badge == null)
                    {
                        k = 0;
                    } else
                    {
                        k = badge.length;
                    }
                    abadge = new Badge[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(badge, 0, abadge, 0, k);
                        i1 = k;
                    }
                    for (; i1 < abadge.length - 1; i1++)
                    {
                        abadge[i1] = new Badge();
                        codedinputbytebuffernano.readMessage(abadge[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    abadge[i1] = new Badge();
                    codedinputbytebuffernano.readMessage(abadge[i1]);
                    badge = abadge;
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
            if (image != null && image.length > 0)
            {
                for (int i = 0; i < image.length; i++)
                {
                    Common.Image image1 = image[i];
                    if (image1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, image1);
                    }
                }

            }
            if (badge != null && badge.length > 0)
            {
                for (int j = 0; j < badge.length; j++)
                {
                    Badge badge1 = badge[j];
                    if (badge1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, badge1);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BadgeContainer()
        {
            title = "";
            hasTitle = false;
            image = Common.Image.emptyArray();
            badge = Badge.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class Link extends MessageNano
    {

        private static volatile Link _emptyArray[];
        public boolean hasUri;
        public boolean hasUriBackend;
        public ResolveLink.ResolvedLink resolvedLink;
        public String uri;
        public int uriBackend;

        public static Link[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Link[0];
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
                if (!hasUri)
                {
                    i = j;
                    if (uri.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, uri);
            }
label1:
            {
                int k = i;
                if (resolvedLink != null)
                {
                    k = i + CodedOutputByteBufferNano.computeMessageSize(2, resolvedLink);
                }
                if (uriBackend == 0)
                {
                    i = k;
                    if (!hasUriBackend)
                    {
                        break label1;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(3, uriBackend);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       10: 58
        //                       18: 74
        //                       24: 103;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            uri = codedinputbytebuffernano.readString();
            hasUri = true;
              goto _L6
_L4:
            if (resolvedLink == null)
            {
                resolvedLink = new ResolveLink.ResolvedLink();
            }
            codedinputbytebuffernano.readMessage(resolvedLink);
              goto _L6
_L5:
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
            case 7: // '\007'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                uriBackend = j;
                hasUriBackend = true;
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasUri || !uri.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, uri);
            }
            if (resolvedLink != null)
            {
                codedoutputbytebuffernano.writeMessage(2, resolvedLink);
            }
            if (uriBackend != 0 || hasUriBackend)
            {
                codedoutputbytebuffernano.writeInt32(3, uriBackend);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Link()
        {
            uri = "";
            hasUri = false;
            uriBackend = 0;
            hasUriBackend = false;
            resolvedLink = null;
            cachedSize = -1;
        }
    }

    public static final class MySubscriptionDetails extends MessageNano
    {

        public boolean cancelSubscription;
        public String formattedPrice;
        public boolean hasCancelSubscription;
        public boolean hasFormattedPrice;
        public boolean hasPriceBylineHtml;
        public boolean hasSubscriptionStatusHtml;
        public boolean hasTitle;
        public boolean hasTitleBylineHtml;
        public Link paymentDeclinedLearnMoreLink;
        public String priceBylineHtml;
        public String subscriptionStatusHtml;
        public String title;
        public String titleBylineHtml;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasSubscriptionStatusHtml)
                {
                    i = j;
                    if (subscriptionStatusHtml.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, subscriptionStatusHtml);
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
                if (!hasTitleBylineHtml)
                {
                    i = k;
                    if (titleBylineHtml.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, titleBylineHtml);
            }
label3:
            {
                if (!hasFormattedPrice)
                {
                    k = i;
                    if (formattedPrice.equals(""))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, formattedPrice);
            }
label4:
            {
                if (!hasPriceBylineHtml)
                {
                    i = k;
                    if (priceBylineHtml.equals(""))
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(5, priceBylineHtml);
            }
label5:
            {
                if (!hasCancelSubscription)
                {
                    k = i;
                    if (!cancelSubscription)
                    {
                        break label5;
                    }
                }
                k = i + (CodedOutputByteBufferNano.computeTagSize(6) + 1);
            }
            i = k;
            if (paymentDeclinedLearnMoreLink != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(7, paymentDeclinedLearnMoreLink);
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
                    subscriptionStatusHtml = codedinputbytebuffernano.readString();
                    hasSubscriptionStatusHtml = true;
                    break;

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 26: // '\032'
                    titleBylineHtml = codedinputbytebuffernano.readString();
                    hasTitleBylineHtml = true;
                    break;

                case 34: // '"'
                    formattedPrice = codedinputbytebuffernano.readString();
                    hasFormattedPrice = true;
                    break;

                case 42: // '*'
                    priceBylineHtml = codedinputbytebuffernano.readString();
                    hasPriceBylineHtml = true;
                    break;

                case 48: // '0'
                    cancelSubscription = codedinputbytebuffernano.readBool();
                    hasCancelSubscription = true;
                    break;

                case 58: // ':'
                    if (paymentDeclinedLearnMoreLink == null)
                    {
                        paymentDeclinedLearnMoreLink = new Link();
                    }
                    codedinputbytebuffernano.readMessage(paymentDeclinedLearnMoreLink);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSubscriptionStatusHtml || !subscriptionStatusHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, subscriptionStatusHtml);
            }
            if (hasTitle || !title.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            if (hasTitleBylineHtml || !titleBylineHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, titleBylineHtml);
            }
            if (hasFormattedPrice || !formattedPrice.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, formattedPrice);
            }
            if (hasPriceBylineHtml || !priceBylineHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, priceBylineHtml);
            }
            if (hasCancelSubscription || cancelSubscription)
            {
                codedoutputbytebuffernano.writeBool(6, cancelSubscription);
            }
            if (paymentDeclinedLearnMoreLink != null)
            {
                codedoutputbytebuffernano.writeMessage(7, paymentDeclinedLearnMoreLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MySubscriptionDetails()
        {
            subscriptionStatusHtml = "";
            hasSubscriptionStatusHtml = false;
            title = "";
            hasTitle = false;
            titleBylineHtml = "";
            hasTitleBylineHtml = false;
            formattedPrice = "";
            hasFormattedPrice = false;
            priceBylineHtml = "";
            hasPriceBylineHtml = false;
            cancelSubscription = false;
            hasCancelSubscription = false;
            paymentDeclinedLearnMoreLink = null;
            cachedSize = -1;
        }
    }

    public static final class PromotedDoc extends MessageNano
    {

        private static volatile PromotedDoc _emptyArray[];
        public String descriptionHtml;
        public String detailsUrl;
        public boolean hasDescriptionHtml;
        public boolean hasDetailsUrl;
        public boolean hasSubtitle;
        public boolean hasTitle;
        public Common.Image image[];
        public String subtitle;
        public String title;

        public static PromotedDoc[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PromotedDoc[0];
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
                if (!hasTitle)
                {
                    k = i;
                    if (title.equals(""))
                    {
                        break label0;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            int j;
label1:
            {
                if (!hasSubtitle)
                {
                    j = k;
                    if (subtitle.equals(""))
                    {
                        break label1;
                    }
                }
                j = k + CodedOutputByteBufferNano.computeStringSize(2, subtitle);
            }
label2:
            {
                k = j;
                if (image != null)
                {
                    k = j;
                    if (image.length > 0)
                    {
                        int l = 0;
                        do
                        {
                            k = j;
                            if (l >= image.length)
                            {
                                break;
                            }
                            Common.Image image1 = image[l];
                            k = j;
                            if (image1 != null)
                            {
                                k = j + CodedOutputByteBufferNano.computeMessageSize(3, image1);
                            }
                            l++;
                            j = k;
                        } while (true);
                    }
                }
                if (!hasDescriptionHtml)
                {
                    j = k;
                    if (descriptionHtml.equals(""))
                    {
                        break label2;
                    }
                }
                j = k + CodedOutputByteBufferNano.computeStringSize(4, descriptionHtml);
            }
label3:
            {
                if (!hasDetailsUrl)
                {
                    k = j;
                    if (detailsUrl.equals(""))
                    {
                        break label3;
                    }
                }
                k = j + CodedOutputByteBufferNano.computeStringSize(5, detailsUrl);
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
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 18: // '\022'
                    subtitle = codedinputbytebuffernano.readString();
                    hasSubtitle = true;
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    Common.Image aimage[];
                    int j;
                    if (image == null)
                    {
                        j = 0;
                    } else
                    {
                        j = image.length;
                    }
                    aimage = new Common.Image[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(image, 0, aimage, 0, j);
                        k = j;
                    }
                    for (; k < aimage.length - 1; k++)
                    {
                        aimage[k] = new Common.Image();
                        codedinputbytebuffernano.readMessage(aimage[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aimage[k] = new Common.Image();
                    codedinputbytebuffernano.readMessage(aimage[k]);
                    image = aimage;
                    break;

                case 34: // '"'
                    descriptionHtml = codedinputbytebuffernano.readString();
                    hasDescriptionHtml = true;
                    break;

                case 42: // '*'
                    detailsUrl = codedinputbytebuffernano.readString();
                    hasDetailsUrl = true;
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
            if (hasSubtitle || !subtitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, subtitle);
            }
            if (image != null && image.length > 0)
            {
                for (int i = 0; i < image.length; i++)
                {
                    Common.Image image1 = image[i];
                    if (image1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, image1);
                    }
                }

            }
            if (hasDescriptionHtml || !descriptionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, descriptionHtml);
            }
            if (hasDetailsUrl || !detailsUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, detailsUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PromotedDoc()
        {
            title = "";
            hasTitle = false;
            subtitle = "";
            hasSubtitle = false;
            image = Common.Image.emptyArray();
            descriptionHtml = "";
            hasDescriptionHtml = false;
            detailsUrl = "";
            hasDetailsUrl = false;
            cachedSize = -1;
        }
    }

    public static final class PurchaseHistoryDetails extends MessageNano
    {

        public boolean hasPurchaseDetailsHtml;
        public boolean hasPurchaseStatus;
        public boolean hasPurchaseTimestampMsec;
        public Common.Offer offer;
        public String purchaseDetailsHtml;
        public String purchaseStatus;
        public long purchaseTimestampMsec;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int k = super.computeSerializedSize();
                if (!hasPurchaseTimestampMsec)
                {
                    i = k;
                    if (purchaseTimestampMsec == 0L)
                    {
                        break label0;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(2, purchaseTimestampMsec);
            }
            int l;
label1:
            {
                if (!hasPurchaseDetailsHtml)
                {
                    l = i;
                    if (purchaseDetailsHtml.equals(""))
                    {
                        break label1;
                    }
                }
                l = i + CodedOutputByteBufferNano.computeStringSize(3, purchaseDetailsHtml);
            }
label2:
            {
                int j = l;
                if (offer != null)
                {
                    j = l + CodedOutputByteBufferNano.computeMessageSize(5, offer);
                }
                if (!hasPurchaseStatus)
                {
                    l = j;
                    if (purchaseStatus.equals(""))
                    {
                        break label2;
                    }
                }
                l = j + CodedOutputByteBufferNano.computeStringSize(6, purchaseStatus);
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

                case 16: // '\020'
                    purchaseTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                    hasPurchaseTimestampMsec = true;
                    break;

                case 26: // '\032'
                    purchaseDetailsHtml = codedinputbytebuffernano.readString();
                    hasPurchaseDetailsHtml = true;
                    break;

                case 42: // '*'
                    if (offer == null)
                    {
                        offer = new Common.Offer();
                    }
                    codedinputbytebuffernano.readMessage(offer);
                    break;

                case 50: // '2'
                    purchaseStatus = codedinputbytebuffernano.readString();
                    hasPurchaseStatus = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasPurchaseTimestampMsec || purchaseTimestampMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, purchaseTimestampMsec);
            }
            if (hasPurchaseDetailsHtml || !purchaseDetailsHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, purchaseDetailsHtml);
            }
            if (offer != null)
            {
                codedoutputbytebuffernano.writeMessage(5, offer);
            }
            if (hasPurchaseStatus || !purchaseStatus.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, purchaseStatus);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PurchaseHistoryDetails()
        {
            purchaseTimestampMsec = 0L;
            hasPurchaseTimestampMsec = false;
            purchaseDetailsHtml = "";
            hasPurchaseDetailsHtml = false;
            offer = null;
            purchaseStatus = "";
            hasPurchaseStatus = false;
            cachedSize = -1;
        }
    }

    public static final class SectionMetadata extends MessageNano
    {

        private static volatile SectionMetadata _emptyArray[];
        public String browseUrl;
        public String descriptionHtml;
        public boolean hasBrowseUrl;
        public boolean hasDescriptionHtml;
        public boolean hasHeader;
        public boolean hasListUrl;
        public String header;
        public String listUrl;

        public static SectionMetadata[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SectionMetadata[0];
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
                i = j + CodedOutputByteBufferNano.computeStringSize(1, header);
            }
            int k;
label1:
            {
                if (!hasListUrl)
                {
                    k = i;
                    if (listUrl.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, listUrl);
            }
label2:
            {
                if (!hasBrowseUrl)
                {
                    i = k;
                    if (browseUrl.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, browseUrl);
            }
label3:
            {
                if (!hasDescriptionHtml)
                {
                    k = i;
                    if (descriptionHtml.equals(""))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, descriptionHtml);
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
                    header = codedinputbytebuffernano.readString();
                    hasHeader = true;
                    break;

                case 18: // '\022'
                    listUrl = codedinputbytebuffernano.readString();
                    hasListUrl = true;
                    break;

                case 26: // '\032'
                    browseUrl = codedinputbytebuffernano.readString();
                    hasBrowseUrl = true;
                    break;

                case 34: // '"'
                    descriptionHtml = codedinputbytebuffernano.readString();
                    hasDescriptionHtml = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasHeader || !header.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, header);
            }
            if (hasListUrl || !listUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, listUrl);
            }
            if (hasBrowseUrl || !browseUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, browseUrl);
            }
            if (hasDescriptionHtml || !descriptionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, descriptionHtml);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SectionMetadata()
        {
            header = "";
            hasHeader = false;
            descriptionHtml = "";
            hasDescriptionHtml = false;
            listUrl = "";
            hasListUrl = false;
            browseUrl = "";
            hasBrowseUrl = false;
            cachedSize = -1;
        }
    }

    public static final class Warning extends MessageNano
    {

        private static volatile Warning _emptyArray[];
        public boolean hasLocalizedMessage;
        public String localizedMessage;

        public static Warning[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Warning[0];
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
                if (!hasLocalizedMessage)
                {
                    i = j;
                    if (localizedMessage.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, localizedMessage);
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
                    localizedMessage = codedinputbytebuffernano.readString();
                    hasLocalizedMessage = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasLocalizedMessage || !localizedMessage.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, localizedMessage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Warning()
        {
            localizedMessage = "";
            hasLocalizedMessage = false;
            cachedSize = -1;
        }
    }

}
