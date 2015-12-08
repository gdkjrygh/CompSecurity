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

public interface DocumentV2
{
    public static final class ActionBanner extends MessageNano
    {

        public CallToAction action[];
        public DocV2 primaryFace;
        public DocV2 secondaryFace[];

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (action != null)
            {
                j = i;
                if (action.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= action.length)
                        {
                            break;
                        }
                        CallToAction calltoaction = action[l];
                        j = i;
                        if (calltoaction != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, calltoaction);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (primaryFace != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, primaryFace);
            }
            int i1 = i;
            if (secondaryFace != null)
            {
                i1 = i;
                if (secondaryFace.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= secondaryFace.length)
                        {
                            break;
                        }
                        DocV2 docv2 = secondaryFace[k];
                        i1 = i;
                        if (docv2 != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, docv2);
                        }
                        k++;
                        i = i1;
                    } while (true);
                }
            }
            return i1;
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
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    CallToAction acalltoaction[];
                    int j;
                    if (action == null)
                    {
                        j = 0;
                    } else
                    {
                        j = action.length;
                    }
                    acalltoaction = new CallToAction[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(action, 0, acalltoaction, 0, j);
                        l = j;
                    }
                    for (; l < acalltoaction.length - 1; l++)
                    {
                        acalltoaction[l] = new CallToAction();
                        codedinputbytebuffernano.readMessage(acalltoaction[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    acalltoaction[l] = new CallToAction();
                    codedinputbytebuffernano.readMessage(acalltoaction[l]);
                    action = acalltoaction;
                    break;

                case 18: // '\022'
                    if (primaryFace == null)
                    {
                        primaryFace = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(primaryFace);
                    break;

                case 34: // '"'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    DocV2 adocv2[];
                    int k;
                    if (secondaryFace == null)
                    {
                        k = 0;
                    } else
                    {
                        k = secondaryFace.length;
                    }
                    adocv2 = new DocV2[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(secondaryFace, 0, adocv2, 0, k);
                        i1 = k;
                    }
                    for (; i1 < adocv2.length - 1; i1++)
                    {
                        adocv2[i1] = new DocV2();
                        codedinputbytebuffernano.readMessage(adocv2[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocv2[i1] = new DocV2();
                    codedinputbytebuffernano.readMessage(adocv2[i1]);
                    secondaryFace = adocv2;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (action != null && action.length > 0)
            {
                for (int i = 0; i < action.length; i++)
                {
                    CallToAction calltoaction = action[i];
                    if (calltoaction != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, calltoaction);
                    }
                }

            }
            if (primaryFace != null)
            {
                codedoutputbytebuffernano.writeMessage(2, primaryFace);
            }
            if (secondaryFace != null && secondaryFace.length > 0)
            {
                for (int j = 0; j < secondaryFace.length; j++)
                {
                    DocV2 docv2 = secondaryFace[j];
                    if (docv2 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, docv2);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ActionBanner()
        {
            action = CallToAction.emptyArray();
            primaryFace = null;
            secondaryFace = DocV2.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class AddToCirclesContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public AddToCirclesContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class Annotations extends MessageNano
    {

        public String applicableVoucherDescription;
        public String attributionHtml;
        public DocAnnotations.Badge badgeForContentRating;
        public DocAnnotations.Badge badgeForCreator[];
        public DocAnnotations.Badge badgeForDoc[];
        public DocV2 creatorDoc;
        public DocAnnotations.SectionMetadata detailsPageCluster[];
        public DocAnnotations.BadgeContainer docBadgeContainer[];
        public boolean hasApplicableVoucherDescription;
        public boolean hasAttributionHtml;
        public boolean hasOfferNote;
        public boolean hasPrivacyPolicyUrl;
        public DocAnnotations.Link link;
        public DocAnnotations.MySubscriptionDetails mySubscriptionDetails;
        public OBSOLETE_Reason oBSOLETEReason;
        public String offerNote;
        public DocAnnotations.Warning optimalDeviceClassWarning;
        public OverflowLink overflowLink[];
        public PlusOneData plusOneData;
        public String privacyPolicyUrl;
        public DocAnnotations.PromotedDoc promotedDoc[];
        public DocAnnotations.PurchaseHistoryDetails purchaseHistoryDetails;
        public DocAnnotations.SectionMetadata sectionBodyOfWork;
        public DocAnnotations.SectionMetadata sectionCoreContent;
        public DocAnnotations.SectionMetadata sectionCrossSell;
        public DocAnnotations.SectionMetadata sectionFeaturedApps;
        public DocAnnotations.SectionMetadata sectionMoreBy;
        public DocAnnotations.SectionMetadata sectionPurchaseCrossSell;
        public DocAnnotations.SectionMetadata sectionPurchaseRelatedTopics;
        public DocAnnotations.SectionMetadata sectionRelated;
        public DocAnnotations.SectionMetadata sectionRelatedDocType;
        public DocAnnotations.SectionMetadata sectionSuggestForRating;
        public DocV2 subscription[];
        public SuggestionReasons suggestionReasons;
        public Template template;
        public VideoDocAnnotations.VideoAnnotations videoAnnotations;
        public VoucherInfo voucherInfo[];
        public DocAnnotations.Warning warning[];

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                i = j;
                if (sectionRelated != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(1, sectionRelated);
                }
                j = i;
                if (sectionMoreBy != null)
                {
                    j = i + CodedOutputByteBufferNano.computeMessageSize(2, sectionMoreBy);
                }
                i = j;
                if (plusOneData != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(3, plusOneData);
                }
                j = i;
                if (warning != null)
                {
                    j = i;
                    if (warning.length > 0)
                    {
                        int l = 0;
                        do
                        {
                            j = i;
                            if (l >= warning.length)
                            {
                                break;
                            }
                            DocAnnotations.Warning warning1 = warning[l];
                            j = i;
                            if (warning1 != null)
                            {
                                j = i + CodedOutputByteBufferNano.computeMessageSize(4, warning1);
                            }
                            l++;
                            i = j;
                        } while (true);
                    }
                }
                i = j;
                if (sectionBodyOfWork != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(5, sectionBodyOfWork);
                }
                int i1 = i;
                if (sectionCoreContent != null)
                {
                    i1 = i + CodedOutputByteBufferNano.computeMessageSize(6, sectionCoreContent);
                }
                j = i1;
                if (template != null)
                {
                    j = i1 + CodedOutputByteBufferNano.computeMessageSize(7, template);
                }
                i = j;
                if (badgeForCreator != null)
                {
                    i = j;
                    if (badgeForCreator.length > 0)
                    {
                        int j1 = 0;
                        do
                        {
                            i = j;
                            if (j1 >= badgeForCreator.length)
                            {
                                break;
                            }
                            DocAnnotations.Badge badge = badgeForCreator[j1];
                            i = j;
                            if (badge != null)
                            {
                                i = j + CodedOutputByteBufferNano.computeMessageSize(8, badge);
                            }
                            j1++;
                            j = i;
                        } while (true);
                    }
                }
                j = i;
                if (badgeForDoc != null)
                {
                    j = i;
                    if (badgeForDoc.length > 0)
                    {
                        int k1 = 0;
                        do
                        {
                            j = i;
                            if (k1 >= badgeForDoc.length)
                            {
                                break;
                            }
                            DocAnnotations.Badge badge1 = badgeForDoc[k1];
                            j = i;
                            if (badge1 != null)
                            {
                                j = i + CodedOutputByteBufferNano.computeMessageSize(9, badge1);
                            }
                            k1++;
                            i = j;
                        } while (true);
                    }
                }
                i = j;
                if (link != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(10, link);
                }
                j = i;
                if (sectionCrossSell != null)
                {
                    j = i + CodedOutputByteBufferNano.computeMessageSize(11, sectionCrossSell);
                }
                i = j;
                if (sectionRelatedDocType != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(12, sectionRelatedDocType);
                }
                j = i;
                if (promotedDoc != null)
                {
                    j = i;
                    if (promotedDoc.length > 0)
                    {
                        int l1 = 0;
                        do
                        {
                            j = i;
                            if (l1 >= promotedDoc.length)
                            {
                                break;
                            }
                            DocAnnotations.PromotedDoc promoteddoc = promotedDoc[l1];
                            j = i;
                            if (promoteddoc != null)
                            {
                                j = i + CodedOutputByteBufferNano.computeMessageSize(13, promoteddoc);
                            }
                            l1++;
                            i = j;
                        } while (true);
                    }
                }
                if (!hasOfferNote)
                {
                    i = j;
                    if (offerNote.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(14, offerNote);
            }
            int k;
label1:
            {
                k = i;
                if (subscription != null)
                {
                    k = i;
                    if (subscription.length > 0)
                    {
                        int i2 = 0;
                        do
                        {
                            k = i;
                            if (i2 >= subscription.length)
                            {
                                break;
                            }
                            DocV2 docv2 = subscription[i2];
                            k = i;
                            if (docv2 != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(16, docv2);
                            }
                            i2++;
                            i = k;
                        } while (true);
                    }
                }
                i = k;
                if (oBSOLETEReason != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(17, oBSOLETEReason);
                }
                if (!hasPrivacyPolicyUrl)
                {
                    k = i;
                    if (privacyPolicyUrl.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(18, privacyPolicyUrl);
            }
label2:
            {
                int j2 = k;
                if (suggestionReasons != null)
                {
                    j2 = k + CodedOutputByteBufferNano.computeMessageSize(19, suggestionReasons);
                }
                i = j2;
                if (optimalDeviceClassWarning != null)
                {
                    i = j2 + CodedOutputByteBufferNano.computeMessageSize(20, optimalDeviceClassWarning);
                }
                k = i;
                if (docBadgeContainer != null)
                {
                    k = i;
                    if (docBadgeContainer.length > 0)
                    {
                        j2 = 0;
                        do
                        {
                            k = i;
                            if (j2 >= docBadgeContainer.length)
                            {
                                break;
                            }
                            DocAnnotations.BadgeContainer badgecontainer = docBadgeContainer[j2];
                            k = i;
                            if (badgecontainer != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(21, badgecontainer);
                            }
                            j2++;
                            i = k;
                        } while (true);
                    }
                }
                j2 = k;
                if (sectionSuggestForRating != null)
                {
                    j2 = k + CodedOutputByteBufferNano.computeMessageSize(22, sectionSuggestForRating);
                }
                i = j2;
                if (sectionPurchaseCrossSell != null)
                {
                    i = j2 + CodedOutputByteBufferNano.computeMessageSize(24, sectionPurchaseCrossSell);
                }
                k = i;
                if (overflowLink != null)
                {
                    k = i;
                    if (overflowLink.length > 0)
                    {
                        int k2 = 0;
                        do
                        {
                            k = i;
                            if (k2 >= overflowLink.length)
                            {
                                break;
                            }
                            OverflowLink overflowlink = overflowLink[k2];
                            k = i;
                            if (overflowlink != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(25, overflowlink);
                            }
                            k2++;
                            i = k;
                        } while (true);
                    }
                }
                i = k;
                if (creatorDoc != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(26, creatorDoc);
                }
                if (!hasAttributionHtml)
                {
                    k = i;
                    if (attributionHtml.equals(""))
                    {
                        break label2;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(27, attributionHtml);
            }
label3:
            {
                int l2 = k;
                if (purchaseHistoryDetails != null)
                {
                    l2 = k + CodedOutputByteBufferNano.computeMessageSize(28, purchaseHistoryDetails);
                }
                i = l2;
                if (badgeForContentRating != null)
                {
                    i = l2 + CodedOutputByteBufferNano.computeMessageSize(29, badgeForContentRating);
                }
                k = i;
                if (voucherInfo != null)
                {
                    k = i;
                    if (voucherInfo.length > 0)
                    {
                        l2 = 0;
                        do
                        {
                            k = i;
                            if (l2 >= voucherInfo.length)
                            {
                                break;
                            }
                            VoucherInfo voucherinfo = voucherInfo[l2];
                            k = i;
                            if (voucherinfo != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(30, voucherinfo);
                            }
                            l2++;
                            i = k;
                        } while (true);
                    }
                }
                l2 = k;
                if (sectionFeaturedApps != null)
                {
                    l2 = k + CodedOutputByteBufferNano.computeMessageSize(32, sectionFeaturedApps);
                }
                if (!hasApplicableVoucherDescription)
                {
                    i = l2;
                    if (applicableVoucherDescription.equals(""))
                    {
                        break label3;
                    }
                }
                i = l2 + CodedOutputByteBufferNano.computeStringSize(33, applicableVoucherDescription);
            }
            k = i;
            if (detailsPageCluster != null)
            {
                k = i;
                if (detailsPageCluster.length > 0)
                {
                    int i3 = 0;
                    do
                    {
                        k = i;
                        if (i3 >= detailsPageCluster.length)
                        {
                            break;
                        }
                        DocAnnotations.SectionMetadata sectionmetadata = detailsPageCluster[i3];
                        k = i;
                        if (sectionmetadata != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(34, sectionmetadata);
                        }
                        i3++;
                        i = k;
                    } while (true);
                }
            }
            i = k;
            if (videoAnnotations != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(35, videoAnnotations);
            }
            k = i;
            if (sectionPurchaseRelatedTopics != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(36, sectionPurchaseRelatedTopics);
            }
            i = k;
            if (mySubscriptionDetails != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(37, mySubscriptionDetails);
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
                    if (sectionRelated == null)
                    {
                        sectionRelated = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionRelated);
                    break;

                case 18: // '\022'
                    if (sectionMoreBy == null)
                    {
                        sectionMoreBy = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionMoreBy);
                    break;

                case 26: // '\032'
                    if (plusOneData == null)
                    {
                        plusOneData = new PlusOneData();
                    }
                    codedinputbytebuffernano.readMessage(plusOneData);
                    break;

                case 34: // '"'
                    int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    DocAnnotations.Warning awarning[];
                    int j;
                    if (warning == null)
                    {
                        j = 0;
                    } else
                    {
                        j = warning.length;
                    }
                    awarning = new DocAnnotations.Warning[k2 + j];
                    k2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(warning, 0, awarning, 0, j);
                        k2 = j;
                    }
                    for (; k2 < awarning.length - 1; k2++)
                    {
                        awarning[k2] = new DocAnnotations.Warning();
                        codedinputbytebuffernano.readMessage(awarning[k2]);
                        codedinputbytebuffernano.readTag();
                    }

                    awarning[k2] = new DocAnnotations.Warning();
                    codedinputbytebuffernano.readMessage(awarning[k2]);
                    warning = awarning;
                    break;

                case 42: // '*'
                    if (sectionBodyOfWork == null)
                    {
                        sectionBodyOfWork = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionBodyOfWork);
                    break;

                case 50: // '2'
                    if (sectionCoreContent == null)
                    {
                        sectionCoreContent = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionCoreContent);
                    break;

                case 58: // ':'
                    if (template == null)
                    {
                        template = new Template();
                    }
                    codedinputbytebuffernano.readMessage(template);
                    break;

                case 66: // 'B'
                    int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 66);
                    DocAnnotations.Badge abadge[];
                    int k;
                    if (badgeForCreator == null)
                    {
                        k = 0;
                    } else
                    {
                        k = badgeForCreator.length;
                    }
                    abadge = new DocAnnotations.Badge[l2 + k];
                    l2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(badgeForCreator, 0, abadge, 0, k);
                        l2 = k;
                    }
                    for (; l2 < abadge.length - 1; l2++)
                    {
                        abadge[l2] = new DocAnnotations.Badge();
                        codedinputbytebuffernano.readMessage(abadge[l2]);
                        codedinputbytebuffernano.readTag();
                    }

                    abadge[l2] = new DocAnnotations.Badge();
                    codedinputbytebuffernano.readMessage(abadge[l2]);
                    badgeForCreator = abadge;
                    break;

                case 74: // 'J'
                    int i3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
                    DocAnnotations.Badge abadge1[];
                    int l;
                    if (badgeForDoc == null)
                    {
                        l = 0;
                    } else
                    {
                        l = badgeForDoc.length;
                    }
                    abadge1 = new DocAnnotations.Badge[i3 + l];
                    i3 = l;
                    if (l != 0)
                    {
                        System.arraycopy(badgeForDoc, 0, abadge1, 0, l);
                        i3 = l;
                    }
                    for (; i3 < abadge1.length - 1; i3++)
                    {
                        abadge1[i3] = new DocAnnotations.Badge();
                        codedinputbytebuffernano.readMessage(abadge1[i3]);
                        codedinputbytebuffernano.readTag();
                    }

                    abadge1[i3] = new DocAnnotations.Badge();
                    codedinputbytebuffernano.readMessage(abadge1[i3]);
                    badgeForDoc = abadge1;
                    break;

                case 82: // 'R'
                    if (link == null)
                    {
                        link = new DocAnnotations.Link();
                    }
                    codedinputbytebuffernano.readMessage(link);
                    break;

                case 90: // 'Z'
                    if (sectionCrossSell == null)
                    {
                        sectionCrossSell = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionCrossSell);
                    break;

                case 98: // 'b'
                    if (sectionRelatedDocType == null)
                    {
                        sectionRelatedDocType = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionRelatedDocType);
                    break;

                case 106: // 'j'
                    int j3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 106);
                    DocAnnotations.PromotedDoc apromoteddoc[];
                    int i1;
                    if (promotedDoc == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = promotedDoc.length;
                    }
                    apromoteddoc = new DocAnnotations.PromotedDoc[j3 + i1];
                    j3 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(promotedDoc, 0, apromoteddoc, 0, i1);
                        j3 = i1;
                    }
                    for (; j3 < apromoteddoc.length - 1; j3++)
                    {
                        apromoteddoc[j3] = new DocAnnotations.PromotedDoc();
                        codedinputbytebuffernano.readMessage(apromoteddoc[j3]);
                        codedinputbytebuffernano.readTag();
                    }

                    apromoteddoc[j3] = new DocAnnotations.PromotedDoc();
                    codedinputbytebuffernano.readMessage(apromoteddoc[j3]);
                    promotedDoc = apromoteddoc;
                    break;

                case 114: // 'r'
                    offerNote = codedinputbytebuffernano.readString();
                    hasOfferNote = true;
                    break;

                case 130: 
                    int k3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 130);
                    DocV2 adocv2[];
                    int j1;
                    if (subscription == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = subscription.length;
                    }
                    adocv2 = new DocV2[k3 + j1];
                    k3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(subscription, 0, adocv2, 0, j1);
                        k3 = j1;
                    }
                    for (; k3 < adocv2.length - 1; k3++)
                    {
                        adocv2[k3] = new DocV2();
                        codedinputbytebuffernano.readMessage(adocv2[k3]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocv2[k3] = new DocV2();
                    codedinputbytebuffernano.readMessage(adocv2[k3]);
                    subscription = adocv2;
                    break;

                case 138: 
                    if (oBSOLETEReason == null)
                    {
                        oBSOLETEReason = new OBSOLETE_Reason();
                    }
                    codedinputbytebuffernano.readMessage(oBSOLETEReason);
                    break;

                case 146: 
                    privacyPolicyUrl = codedinputbytebuffernano.readString();
                    hasPrivacyPolicyUrl = true;
                    break;

                case 154: 
                    if (suggestionReasons == null)
                    {
                        suggestionReasons = new SuggestionReasons();
                    }
                    codedinputbytebuffernano.readMessage(suggestionReasons);
                    break;

                case 162: 
                    if (optimalDeviceClassWarning == null)
                    {
                        optimalDeviceClassWarning = new DocAnnotations.Warning();
                    }
                    codedinputbytebuffernano.readMessage(optimalDeviceClassWarning);
                    break;

                case 170: 
                    int l3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 170);
                    DocAnnotations.BadgeContainer abadgecontainer[];
                    int k1;
                    if (docBadgeContainer == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = docBadgeContainer.length;
                    }
                    abadgecontainer = new DocAnnotations.BadgeContainer[l3 + k1];
                    l3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(docBadgeContainer, 0, abadgecontainer, 0, k1);
                        l3 = k1;
                    }
                    for (; l3 < abadgecontainer.length - 1; l3++)
                    {
                        abadgecontainer[l3] = new DocAnnotations.BadgeContainer();
                        codedinputbytebuffernano.readMessage(abadgecontainer[l3]);
                        codedinputbytebuffernano.readTag();
                    }

                    abadgecontainer[l3] = new DocAnnotations.BadgeContainer();
                    codedinputbytebuffernano.readMessage(abadgecontainer[l3]);
                    docBadgeContainer = abadgecontainer;
                    break;

                case 178: 
                    if (sectionSuggestForRating == null)
                    {
                        sectionSuggestForRating = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionSuggestForRating);
                    break;

                case 194: 
                    if (sectionPurchaseCrossSell == null)
                    {
                        sectionPurchaseCrossSell = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionPurchaseCrossSell);
                    break;

                case 202: 
                    int i4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 202);
                    OverflowLink aoverflowlink[];
                    int l1;
                    if (overflowLink == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = overflowLink.length;
                    }
                    aoverflowlink = new OverflowLink[i4 + l1];
                    i4 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(overflowLink, 0, aoverflowlink, 0, l1);
                        i4 = l1;
                    }
                    for (; i4 < aoverflowlink.length - 1; i4++)
                    {
                        aoverflowlink[i4] = new OverflowLink();
                        codedinputbytebuffernano.readMessage(aoverflowlink[i4]);
                        codedinputbytebuffernano.readTag();
                    }

                    aoverflowlink[i4] = new OverflowLink();
                    codedinputbytebuffernano.readMessage(aoverflowlink[i4]);
                    overflowLink = aoverflowlink;
                    break;

                case 210: 
                    if (creatorDoc == null)
                    {
                        creatorDoc = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(creatorDoc);
                    break;

                case 218: 
                    attributionHtml = codedinputbytebuffernano.readString();
                    hasAttributionHtml = true;
                    break;

                case 226: 
                    if (purchaseHistoryDetails == null)
                    {
                        purchaseHistoryDetails = new DocAnnotations.PurchaseHistoryDetails();
                    }
                    codedinputbytebuffernano.readMessage(purchaseHistoryDetails);
                    break;

                case 234: 
                    if (badgeForContentRating == null)
                    {
                        badgeForContentRating = new DocAnnotations.Badge();
                    }
                    codedinputbytebuffernano.readMessage(badgeForContentRating);
                    break;

                case 242: 
                    int j4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 242);
                    VoucherInfo avoucherinfo[];
                    int i2;
                    if (voucherInfo == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = voucherInfo.length;
                    }
                    avoucherinfo = new VoucherInfo[j4 + i2];
                    j4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(voucherInfo, 0, avoucherinfo, 0, i2);
                        j4 = i2;
                    }
                    for (; j4 < avoucherinfo.length - 1; j4++)
                    {
                        avoucherinfo[j4] = new VoucherInfo();
                        codedinputbytebuffernano.readMessage(avoucherinfo[j4]);
                        codedinputbytebuffernano.readTag();
                    }

                    avoucherinfo[j4] = new VoucherInfo();
                    codedinputbytebuffernano.readMessage(avoucherinfo[j4]);
                    voucherInfo = avoucherinfo;
                    break;

                case 258: 
                    if (sectionFeaturedApps == null)
                    {
                        sectionFeaturedApps = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionFeaturedApps);
                    break;

                case 266: 
                    applicableVoucherDescription = codedinputbytebuffernano.readString();
                    hasApplicableVoucherDescription = true;
                    break;

                case 274: 
                    int k4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 274);
                    DocAnnotations.SectionMetadata asectionmetadata[];
                    int j2;
                    if (detailsPageCluster == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = detailsPageCluster.length;
                    }
                    asectionmetadata = new DocAnnotations.SectionMetadata[k4 + j2];
                    k4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(detailsPageCluster, 0, asectionmetadata, 0, j2);
                        k4 = j2;
                    }
                    for (; k4 < asectionmetadata.length - 1; k4++)
                    {
                        asectionmetadata[k4] = new DocAnnotations.SectionMetadata();
                        codedinputbytebuffernano.readMessage(asectionmetadata[k4]);
                        codedinputbytebuffernano.readTag();
                    }

                    asectionmetadata[k4] = new DocAnnotations.SectionMetadata();
                    codedinputbytebuffernano.readMessage(asectionmetadata[k4]);
                    detailsPageCluster = asectionmetadata;
                    break;

                case 282: 
                    if (videoAnnotations == null)
                    {
                        videoAnnotations = new VideoDocAnnotations.VideoAnnotations();
                    }
                    codedinputbytebuffernano.readMessage(videoAnnotations);
                    break;

                case 290: 
                    if (sectionPurchaseRelatedTopics == null)
                    {
                        sectionPurchaseRelatedTopics = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionPurchaseRelatedTopics);
                    break;

                case 298: 
                    if (mySubscriptionDetails == null)
                    {
                        mySubscriptionDetails = new DocAnnotations.MySubscriptionDetails();
                    }
                    codedinputbytebuffernano.readMessage(mySubscriptionDetails);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (sectionRelated != null)
            {
                codedoutputbytebuffernano.writeMessage(1, sectionRelated);
            }
            if (sectionMoreBy != null)
            {
                codedoutputbytebuffernano.writeMessage(2, sectionMoreBy);
            }
            if (plusOneData != null)
            {
                codedoutputbytebuffernano.writeMessage(3, plusOneData);
            }
            if (warning != null && warning.length > 0)
            {
                for (int i = 0; i < warning.length; i++)
                {
                    DocAnnotations.Warning warning1 = warning[i];
                    if (warning1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, warning1);
                    }
                }

            }
            if (sectionBodyOfWork != null)
            {
                codedoutputbytebuffernano.writeMessage(5, sectionBodyOfWork);
            }
            if (sectionCoreContent != null)
            {
                codedoutputbytebuffernano.writeMessage(6, sectionCoreContent);
            }
            if (template != null)
            {
                codedoutputbytebuffernano.writeMessage(7, template);
            }
            if (badgeForCreator != null && badgeForCreator.length > 0)
            {
                for (int j = 0; j < badgeForCreator.length; j++)
                {
                    DocAnnotations.Badge badge = badgeForCreator[j];
                    if (badge != null)
                    {
                        codedoutputbytebuffernano.writeMessage(8, badge);
                    }
                }

            }
            if (badgeForDoc != null && badgeForDoc.length > 0)
            {
                for (int k = 0; k < badgeForDoc.length; k++)
                {
                    DocAnnotations.Badge badge1 = badgeForDoc[k];
                    if (badge1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(9, badge1);
                    }
                }

            }
            if (link != null)
            {
                codedoutputbytebuffernano.writeMessage(10, link);
            }
            if (sectionCrossSell != null)
            {
                codedoutputbytebuffernano.writeMessage(11, sectionCrossSell);
            }
            if (sectionRelatedDocType != null)
            {
                codedoutputbytebuffernano.writeMessage(12, sectionRelatedDocType);
            }
            if (promotedDoc != null && promotedDoc.length > 0)
            {
                for (int l = 0; l < promotedDoc.length; l++)
                {
                    DocAnnotations.PromotedDoc promoteddoc = promotedDoc[l];
                    if (promoteddoc != null)
                    {
                        codedoutputbytebuffernano.writeMessage(13, promoteddoc);
                    }
                }

            }
            if (hasOfferNote || !offerNote.equals(""))
            {
                codedoutputbytebuffernano.writeString(14, offerNote);
            }
            if (subscription != null && subscription.length > 0)
            {
                for (int i1 = 0; i1 < subscription.length; i1++)
                {
                    DocV2 docv2 = subscription[i1];
                    if (docv2 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(16, docv2);
                    }
                }

            }
            if (oBSOLETEReason != null)
            {
                codedoutputbytebuffernano.writeMessage(17, oBSOLETEReason);
            }
            if (hasPrivacyPolicyUrl || !privacyPolicyUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(18, privacyPolicyUrl);
            }
            if (suggestionReasons != null)
            {
                codedoutputbytebuffernano.writeMessage(19, suggestionReasons);
            }
            if (optimalDeviceClassWarning != null)
            {
                codedoutputbytebuffernano.writeMessage(20, optimalDeviceClassWarning);
            }
            if (docBadgeContainer != null && docBadgeContainer.length > 0)
            {
                for (int j1 = 0; j1 < docBadgeContainer.length; j1++)
                {
                    DocAnnotations.BadgeContainer badgecontainer = docBadgeContainer[j1];
                    if (badgecontainer != null)
                    {
                        codedoutputbytebuffernano.writeMessage(21, badgecontainer);
                    }
                }

            }
            if (sectionSuggestForRating != null)
            {
                codedoutputbytebuffernano.writeMessage(22, sectionSuggestForRating);
            }
            if (sectionPurchaseCrossSell != null)
            {
                codedoutputbytebuffernano.writeMessage(24, sectionPurchaseCrossSell);
            }
            if (overflowLink != null && overflowLink.length > 0)
            {
                for (int k1 = 0; k1 < overflowLink.length; k1++)
                {
                    OverflowLink overflowlink = overflowLink[k1];
                    if (overflowlink != null)
                    {
                        codedoutputbytebuffernano.writeMessage(25, overflowlink);
                    }
                }

            }
            if (creatorDoc != null)
            {
                codedoutputbytebuffernano.writeMessage(26, creatorDoc);
            }
            if (hasAttributionHtml || !attributionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(27, attributionHtml);
            }
            if (purchaseHistoryDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(28, purchaseHistoryDetails);
            }
            if (badgeForContentRating != null)
            {
                codedoutputbytebuffernano.writeMessage(29, badgeForContentRating);
            }
            if (voucherInfo != null && voucherInfo.length > 0)
            {
                for (int l1 = 0; l1 < voucherInfo.length; l1++)
                {
                    VoucherInfo voucherinfo = voucherInfo[l1];
                    if (voucherinfo != null)
                    {
                        codedoutputbytebuffernano.writeMessage(30, voucherinfo);
                    }
                }

            }
            if (sectionFeaturedApps != null)
            {
                codedoutputbytebuffernano.writeMessage(32, sectionFeaturedApps);
            }
            if (hasApplicableVoucherDescription || !applicableVoucherDescription.equals(""))
            {
                codedoutputbytebuffernano.writeString(33, applicableVoucherDescription);
            }
            if (detailsPageCluster != null && detailsPageCluster.length > 0)
            {
                for (int i2 = 0; i2 < detailsPageCluster.length; i2++)
                {
                    DocAnnotations.SectionMetadata sectionmetadata = detailsPageCluster[i2];
                    if (sectionmetadata != null)
                    {
                        codedoutputbytebuffernano.writeMessage(34, sectionmetadata);
                    }
                }

            }
            if (videoAnnotations != null)
            {
                codedoutputbytebuffernano.writeMessage(35, videoAnnotations);
            }
            if (sectionPurchaseRelatedTopics != null)
            {
                codedoutputbytebuffernano.writeMessage(36, sectionPurchaseRelatedTopics);
            }
            if (mySubscriptionDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(37, mySubscriptionDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Annotations()
        {
            detailsPageCluster = DocAnnotations.SectionMetadata.emptyArray();
            sectionCoreContent = null;
            sectionRelatedDocType = null;
            sectionSuggestForRating = null;
            sectionPurchaseCrossSell = null;
            sectionPurchaseRelatedTopics = null;
            plusOneData = null;
            warning = DocAnnotations.Warning.emptyArray();
            optimalDeviceClassWarning = null;
            link = null;
            template = null;
            badgeForCreator = DocAnnotations.Badge.emptyArray();
            badgeForDoc = DocAnnotations.Badge.emptyArray();
            badgeForContentRating = null;
            docBadgeContainer = DocAnnotations.BadgeContainer.emptyArray();
            promotedDoc = DocAnnotations.PromotedDoc.emptyArray();
            offerNote = "";
            hasOfferNote = false;
            subscription = DocV2.emptyArray();
            suggestionReasons = null;
            oBSOLETEReason = null;
            privacyPolicyUrl = "";
            hasPrivacyPolicyUrl = false;
            overflowLink = OverflowLink.emptyArray();
            creatorDoc = null;
            attributionHtml = "";
            hasAttributionHtml = false;
            purchaseHistoryDetails = null;
            mySubscriptionDetails = null;
            voucherInfo = VoucherInfo.emptyArray();
            applicableVoucherDescription = "";
            hasApplicableVoucherDescription = false;
            sectionRelated = null;
            sectionMoreBy = null;
            sectionBodyOfWork = null;
            sectionCrossSell = null;
            sectionFeaturedApps = null;
            videoAnnotations = null;
            cachedSize = -1;
        }
    }

    public static final class ArtistClusterContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public ArtistClusterContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class AvatarCardContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public AvatarCardContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class BannerWithContentContainer extends MessageNano
    {

        public DocV2 content[];

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (content != null)
            {
                k = i;
                if (content.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= content.length)
                        {
                            break;
                        }
                        DocV2 docv2 = content[j];
                        k = i;
                        if (docv2 != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, docv2);
                        }
                        j++;
                        i = k;
                    } while (true);
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    DocV2 adocv2[];
                    int j;
                    if (content == null)
                    {
                        j = 0;
                    } else
                    {
                        j = content.length;
                    }
                    adocv2 = new DocV2[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(content, 0, adocv2, 0, j);
                        k = j;
                    }
                    for (; k < adocv2.length - 1; k++)
                    {
                        adocv2[k] = new DocV2();
                        codedinputbytebuffernano.readMessage(adocv2[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocv2[k] = new DocV2();
                    codedinputbytebuffernano.readMessage(adocv2[k]);
                    content = adocv2;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (content != null && content.length > 0)
            {
                for (int i = 0; i < content.length; i++)
                {
                    DocV2 docv2 = content[i];
                    if (docv2 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, docv2);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BannerWithContentContainer()
        {
            content = DocV2.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class BundleBanner extends MessageNano
    {

        public CallToAction action[];

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (action != null)
            {
                k = i;
                if (action.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= action.length)
                        {
                            break;
                        }
                        CallToAction calltoaction = action[j];
                        k = i;
                        if (calltoaction != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, calltoaction);
                        }
                        j++;
                        i = k;
                    } while (true);
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    CallToAction acalltoaction[];
                    int j;
                    if (action == null)
                    {
                        j = 0;
                    } else
                    {
                        j = action.length;
                    }
                    acalltoaction = new CallToAction[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(action, 0, acalltoaction, 0, j);
                        k = j;
                    }
                    for (; k < acalltoaction.length - 1; k++)
                    {
                        acalltoaction[k] = new CallToAction();
                        codedinputbytebuffernano.readMessage(acalltoaction[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    acalltoaction[k] = new CallToAction();
                    codedinputbytebuffernano.readMessage(acalltoaction[k]);
                    action = acalltoaction;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (action != null && action.length > 0)
            {
                for (int i = 0; i < action.length; i++)
                {
                    CallToAction calltoaction = action[i];
                    if (calltoaction != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, calltoaction);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BundleBanner()
        {
            action = CallToAction.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class BundleContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public BundleContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class CallToAction extends MessageNano
    {

        private static volatile CallToAction _emptyArray[];
        public Common.Image buttonIcon;
        public String buttonText;
        public String dismissalUrl;
        public boolean hasButtonText;
        public boolean hasDismissalUrl;
        public boolean hasType;
        public DocAnnotations.Link link;
        public int type;

        public static CallToAction[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new CallToAction[0];
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
                if (!hasButtonText)
                {
                    k = i;
                    if (buttonText.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, buttonText);
            }
label2:
            {
                i = k;
                if (buttonIcon != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(3, buttonIcon);
                }
                if (!hasDismissalUrl)
                {
                    k = i;
                    if (dismissalUrl.equals(""))
                    {
                        break label2;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, dismissalUrl);
            }
            i = k;
            if (link != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(5, link);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 72
        //                       8: 74
        //                       18: 124
        //                       26: 140
        //                       34: 169
        //                       42: 185;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
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
            buttonText = codedinputbytebuffernano.readString();
            hasButtonText = true;
            continue; /* Loop/switch isn't completed */
_L5:
            if (buttonIcon == null)
            {
                buttonIcon = new Common.Image();
            }
            codedinputbytebuffernano.readMessage(buttonIcon);
            continue; /* Loop/switch isn't completed */
_L6:
            dismissalUrl = codedinputbytebuffernano.readString();
            hasDismissalUrl = true;
            continue; /* Loop/switch isn't completed */
_L7:
            if (link == null)
            {
                link = new DocAnnotations.Link();
            }
            codedinputbytebuffernano.readMessage(link);
            if (true) goto _L8; else goto _L9
_L9:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (type != 1 || hasType)
            {
                codedoutputbytebuffernano.writeInt32(1, type);
            }
            if (hasButtonText || !buttonText.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, buttonText);
            }
            if (buttonIcon != null)
            {
                codedoutputbytebuffernano.writeMessage(3, buttonIcon);
            }
            if (hasDismissalUrl || !dismissalUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, dismissalUrl);
            }
            if (link != null)
            {
                codedoutputbytebuffernano.writeMessage(5, link);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CallToAction()
        {
            type = 1;
            hasType = false;
            buttonText = "";
            hasButtonText = false;
            buttonIcon = null;
            dismissalUrl = "";
            hasDismissalUrl = false;
            link = null;
            cachedSize = -1;
        }
    }

    public static final class ContainerWithBanner extends MessageNano
    {

        public String colorThemeArgb;
        public boolean hasColorThemeArgb;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasColorThemeArgb)
                {
                    i = j;
                    if (colorThemeArgb.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, colorThemeArgb);
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
                    colorThemeArgb = codedinputbytebuffernano.readString();
                    hasColorThemeArgb = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasColorThemeArgb || !colorThemeArgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, colorThemeArgb);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ContainerWithBanner()
        {
            colorThemeArgb = "";
            hasColorThemeArgb = false;
            cachedSize = -1;
        }
    }

    public static final class DealOfTheDay extends MessageNano
    {

        public String colorThemeArgb;
        public String featuredHeader;
        public boolean hasColorThemeArgb;
        public boolean hasFeaturedHeader;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasFeaturedHeader)
                {
                    i = j;
                    if (featuredHeader.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, featuredHeader);
            }
            int k;
label1:
            {
                if (!hasColorThemeArgb)
                {
                    k = i;
                    if (colorThemeArgb.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, colorThemeArgb);
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
                    featuredHeader = codedinputbytebuffernano.readString();
                    hasFeaturedHeader = true;
                    break;

                case 18: // '\022'
                    colorThemeArgb = codedinputbytebuffernano.readString();
                    hasColorThemeArgb = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasFeaturedHeader || !featuredHeader.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, featuredHeader);
            }
            if (hasColorThemeArgb || !colorThemeArgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, colorThemeArgb);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DealOfTheDay()
        {
            featuredHeader = "";
            hasFeaturedHeader = false;
            colorThemeArgb = "";
            hasColorThemeArgb = false;
            cachedSize = -1;
        }
    }

    public static final class Dismissal extends MessageNano
    {

        public String descriptionHtml;
        public boolean hasDescriptionHtml;
        public boolean hasUrl;
        public String url;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasUrl)
                {
                    i = j;
                    if (url.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, url);
            }
            int k;
label1:
            {
                if (!hasDescriptionHtml)
                {
                    k = i;
                    if (descriptionHtml.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, descriptionHtml);
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
                    url = codedinputbytebuffernano.readString();
                    hasUrl = true;
                    break;

                case 18: // '\022'
                    descriptionHtml = codedinputbytebuffernano.readString();
                    hasDescriptionHtml = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasUrl || !url.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, url);
            }
            if (hasDescriptionHtml || !descriptionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, descriptionHtml);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Dismissal()
        {
            url = "";
            hasUrl = false;
            descriptionHtml = "";
            hasDescriptionHtml = false;
            cachedSize = -1;
        }
    }

    public static final class DocV2 extends MessageNano
    {

        private static volatile DocV2 _emptyArray[];
        public Rating.AggregateRating aggregateRating;
        public Annotations annotations;
        public FilterRules.Availability availability;
        public boolean availableForPreregistration;
        public String backendDocid;
        public int backendId;
        public String backendUrl;
        public DocV2 child[];
        public Containers.ContainerMetadata containerMetadata;
        public String creator;
        public String descriptionHtml;
        public DocDetails.DocumentDetails details;
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
        public Common.Image image[];
        public boolean mature;
        public Common.Offer offer[];
        public DocDetails.ProductDetails productDetails;
        public String promotionalDescription;
        public String purchaseDetailsUrl;
        public String reviewsUrl;
        public byte serverLogsCookie[];
        public String shareUrl;
        public String subtitle;
        public Tip.ReviewTip tip[];
        public String title;
        public String translatedDescriptionHtml;

        public static DocV2[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new DocV2[0];
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
                            Common.Offer offer1 = offer[k];
                            i1 = i;
                            if (offer1 != null)
                            {
                                i1 = i + CodedOutputByteBufferNano.computeMessageSize(8, offer1);
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
                            Common.Image image1 = image[j1];
                            i = k;
                            if (image1 != null)
                            {
                                i = k + CodedOutputByteBufferNano.computeMessageSize(10, image1);
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
                            DocV2 docv2 = child[k1];
                            k = i;
                            if (docv2 != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(11, docv2);
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
                        Tip.ReviewTip reviewtip = tip[l];
                        l1 = i;
                        if (reviewtip != null)
                        {
                            l1 = i + CodedOutputByteBufferNano.computeMessageSize(30, reviewtip);
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
        //                       0: 264
        //                       10: 266
        //                       18: 282
        //                       24: 298
        //                       32: 500
        //                       42: 588
        //                       50: 604
        //                       58: 620
        //                       66: 636
        //                       74: 760
        //                       82: 789
        //                       90: 913
        //                       98: 1037
        //                       106: 1066
        //                       114: 1095
        //                       122: 1124
        //                       130: 1153
        //                       138: 1169
        //                       146: 1185
        //                       154: 1201
        //                       162: 1217
        //                       168: 1233
        //                       178: 1249
        //                       186: 1265
        //                       194: 1281
        //                       202: 1297
        //                       208: 1326
        //                       218: 1342
        //                       232: 1358
        //                       242: 1374;
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
            Common.Offer aoffer[];
            int l;
            if (offer == null)
            {
                l = 0;
            } else
            {
                l = offer.length;
            }
            aoffer = new Common.Offer[l1 + l];
            l1 = l;
            if (l != 0)
            {
                System.arraycopy(offer, 0, aoffer, 0, l);
                l1 = l;
            }
            for (; l1 < aoffer.length - 1; l1++)
            {
                aoffer[l1] = new Common.Offer();
                codedinputbytebuffernano.readMessage(aoffer[l1]);
                codedinputbytebuffernano.readTag();
            }

            aoffer[l1] = new Common.Offer();
            codedinputbytebuffernano.readMessage(aoffer[l1]);
            offer = aoffer;
            continue; /* Loop/switch isn't completed */
_L11:
            if (availability == null)
            {
                availability = new FilterRules.Availability();
            }
            codedinputbytebuffernano.readMessage(availability);
            continue; /* Loop/switch isn't completed */
_L12:
            int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
            Common.Image aimage[];
            int i1;
            if (image == null)
            {
                i1 = 0;
            } else
            {
                i1 = image.length;
            }
            aimage = new Common.Image[i2 + i1];
            i2 = i1;
            if (i1 != 0)
            {
                System.arraycopy(image, 0, aimage, 0, i1);
                i2 = i1;
            }
            for (; i2 < aimage.length - 1; i2++)
            {
                aimage[i2] = new Common.Image();
                codedinputbytebuffernano.readMessage(aimage[i2]);
                codedinputbytebuffernano.readTag();
            }

            aimage[i2] = new Common.Image();
            codedinputbytebuffernano.readMessage(aimage[i2]);
            image = aimage;
            continue; /* Loop/switch isn't completed */
_L13:
            int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
            DocV2 adocv2[];
            int j1;
            if (child == null)
            {
                j1 = 0;
            } else
            {
                j1 = child.length;
            }
            adocv2 = new DocV2[j2 + j1];
            j2 = j1;
            if (j1 != 0)
            {
                System.arraycopy(child, 0, adocv2, 0, j1);
                j2 = j1;
            }
            for (; j2 < adocv2.length - 1; j2++)
            {
                adocv2[j2] = new DocV2();
                codedinputbytebuffernano.readMessage(adocv2[j2]);
                codedinputbytebuffernano.readTag();
            }

            adocv2[j2] = new DocV2();
            codedinputbytebuffernano.readMessage(adocv2[j2]);
            child = adocv2;
            continue; /* Loop/switch isn't completed */
_L14:
            if (containerMetadata == null)
            {
                containerMetadata = new Containers.ContainerMetadata();
            }
            codedinputbytebuffernano.readMessage(containerMetadata);
            continue; /* Loop/switch isn't completed */
_L15:
            if (details == null)
            {
                details = new DocDetails.DocumentDetails();
            }
            codedinputbytebuffernano.readMessage(details);
            continue; /* Loop/switch isn't completed */
_L16:
            if (aggregateRating == null)
            {
                aggregateRating = new Rating.AggregateRating();
            }
            codedinputbytebuffernano.readMessage(aggregateRating);
            continue; /* Loop/switch isn't completed */
_L17:
            if (annotations == null)
            {
                annotations = new Annotations();
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
                productDetails = new DocDetails.ProductDetails();
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
            Tip.ReviewTip areviewtip[];
            int k1;
            if (tip == null)
            {
                k1 = 0;
            } else
            {
                k1 = tip.length;
            }
            areviewtip = new Tip.ReviewTip[k2 + k1];
            k2 = k1;
            if (k1 != 0)
            {
                System.arraycopy(tip, 0, areviewtip, 0, k1);
                k2 = k1;
            }
            for (; k2 < areviewtip.length - 1; k2++)
            {
                areviewtip[k2] = new Tip.ReviewTip();
                codedinputbytebuffernano.readMessage(areviewtip[k2]);
                codedinputbytebuffernano.readTag();
            }

            areviewtip[k2] = new Tip.ReviewTip();
            codedinputbytebuffernano.readMessage(areviewtip[k2]);
            tip = areviewtip;
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
                    Common.Offer offer1 = offer[i];
                    if (offer1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(8, offer1);
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
                    Common.Image image1 = image[j];
                    if (image1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(10, image1);
                    }
                }

            }
            if (child != null && child.length > 0)
            {
                for (int k = 0; k < child.length; k++)
                {
                    DocV2 docv2 = child[k];
                    if (docv2 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(11, docv2);
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
                    Tip.ReviewTip reviewtip = tip[l];
                    if (reviewtip != null)
                    {
                        codedoutputbytebuffernano.writeMessage(30, reviewtip);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DocV2()
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
            offer = Common.Offer.emptyArray();
            availability = null;
            image = Common.Image.emptyArray();
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
            tip = Tip.ReviewTip.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class EditorialSeriesContainer extends MessageNano
    {

        public String colorThemeArgb;
        public String episodeSubtitle;
        public String episodeTitle;
        public boolean hasColorThemeArgb;
        public boolean hasEpisodeSubtitle;
        public boolean hasEpisodeTitle;
        public boolean hasSeriesSubtitle;
        public boolean hasSeriesTitle;
        public String seriesSubtitle;
        public String seriesTitle;
        public VideoSnippet videoSnippet[];

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasSeriesTitle)
                {
                    i = j;
                    if (seriesTitle.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, seriesTitle);
            }
            int k;
label1:
            {
                if (!hasSeriesSubtitle)
                {
                    k = i;
                    if (seriesSubtitle.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, seriesSubtitle);
            }
label2:
            {
                if (!hasEpisodeTitle)
                {
                    i = k;
                    if (episodeTitle.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, episodeTitle);
            }
label3:
            {
                if (!hasEpisodeSubtitle)
                {
                    k = i;
                    if (episodeSubtitle.equals(""))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, episodeSubtitle);
            }
label4:
            {
                if (!hasColorThemeArgb)
                {
                    i = k;
                    if (colorThemeArgb.equals(""))
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(5, colorThemeArgb);
            }
            int i1 = i;
            if (videoSnippet != null)
            {
                i1 = i;
                if (videoSnippet.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i1 = i;
                        if (l >= videoSnippet.length)
                        {
                            break;
                        }
                        VideoSnippet videosnippet = videoSnippet[l];
                        i1 = i;
                        if (videosnippet != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(6, videosnippet);
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
                    seriesTitle = codedinputbytebuffernano.readString();
                    hasSeriesTitle = true;
                    break;

                case 18: // '\022'
                    seriesSubtitle = codedinputbytebuffernano.readString();
                    hasSeriesSubtitle = true;
                    break;

                case 26: // '\032'
                    episodeTitle = codedinputbytebuffernano.readString();
                    hasEpisodeTitle = true;
                    break;

                case 34: // '"'
                    episodeSubtitle = codedinputbytebuffernano.readString();
                    hasEpisodeSubtitle = true;
                    break;

                case 42: // '*'
                    colorThemeArgb = codedinputbytebuffernano.readString();
                    hasColorThemeArgb = true;
                    break;

                case 50: // '2'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
                    VideoSnippet avideosnippet[];
                    int j;
                    if (videoSnippet == null)
                    {
                        j = 0;
                    } else
                    {
                        j = videoSnippet.length;
                    }
                    avideosnippet = new VideoSnippet[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(videoSnippet, 0, avideosnippet, 0, j);
                        k = j;
                    }
                    for (; k < avideosnippet.length - 1; k++)
                    {
                        avideosnippet[k] = new VideoSnippet();
                        codedinputbytebuffernano.readMessage(avideosnippet[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    avideosnippet[k] = new VideoSnippet();
                    codedinputbytebuffernano.readMessage(avideosnippet[k]);
                    videoSnippet = avideosnippet;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSeriesTitle || !seriesTitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, seriesTitle);
            }
            if (hasSeriesSubtitle || !seriesSubtitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, seriesSubtitle);
            }
            if (hasEpisodeTitle || !episodeTitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, episodeTitle);
            }
            if (hasEpisodeSubtitle || !episodeSubtitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, episodeSubtitle);
            }
            if (hasColorThemeArgb || !colorThemeArgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, colorThemeArgb);
            }
            if (videoSnippet != null && videoSnippet.length > 0)
            {
                for (int i = 0; i < videoSnippet.length; i++)
                {
                    VideoSnippet videosnippet = videoSnippet[i];
                    if (videosnippet != null)
                    {
                        codedoutputbytebuffernano.writeMessage(6, videosnippet);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EditorialSeriesContainer()
        {
            seriesTitle = "";
            hasSeriesTitle = false;
            seriesSubtitle = "";
            hasSeriesSubtitle = false;
            episodeTitle = "";
            hasEpisodeTitle = false;
            episodeSubtitle = "";
            hasEpisodeSubtitle = false;
            colorThemeArgb = "";
            hasColorThemeArgb = false;
            videoSnippet = VideoSnippet.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class EmptyContainer extends MessageNano
    {

        public String emptyMessage;
        public boolean hasEmptyMessage;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasEmptyMessage)
                {
                    i = j;
                    if (emptyMessage.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, emptyMessage);
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
                    emptyMessage = codedinputbytebuffernano.readString();
                    hasEmptyMessage = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasEmptyMessage || !emptyMessage.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, emptyMessage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EmptyContainer()
        {
            emptyMessage = "";
            hasEmptyMessage = false;
            cachedSize = -1;
        }
    }

    public static final class FeaturedAppsContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public FeaturedAppsContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class MoreByCreatorContainer extends MessageNano
    {

        public DocV2 creatorInformation;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (creatorInformation != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, creatorInformation);
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
                    if (creatorInformation == null)
                    {
                        creatorInformation = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(creatorInformation);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (creatorInformation != null)
            {
                codedoutputbytebuffernano.writeMessage(1, creatorInformation);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MoreByCreatorContainer()
        {
            creatorInformation = null;
            cachedSize = -1;
        }
    }

    public static final class MultiRowContainer extends MessageNano
    {

        public boolean hasRowCount;
        public int rowCount;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasRowCount)
                {
                    i = j;
                    if (rowCount == 1)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, rowCount);
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
                    rowCount = codedinputbytebuffernano.readRawVarint32();
                    hasRowCount = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasRowCount || rowCount != 1)
            {
                codedoutputbytebuffernano.writeInt32(1, rowCount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MultiRowContainer()
        {
            rowCount = 1;
            hasRowCount = false;
            cachedSize = -1;
        }
    }

    public static final class MyCirclesContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public MyCirclesContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class NextBanner extends MessageNano
    {

        public String colorTextArgb;
        public boolean hasColorTextArgb;
        public boolean hasSubtitle;
        public boolean hasTitle;
        public String subtitle;
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
            int k;
label1:
            {
                if (!hasSubtitle)
                {
                    k = i;
                    if (subtitle.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, subtitle);
            }
label2:
            {
                if (!hasColorTextArgb)
                {
                    i = k;
                    if (colorTextArgb.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, colorTextArgb);
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
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 18: // '\022'
                    subtitle = codedinputbytebuffernano.readString();
                    hasSubtitle = true;
                    break;

                case 26: // '\032'
                    colorTextArgb = codedinputbytebuffernano.readString();
                    hasColorTextArgb = true;
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
            if (hasColorTextArgb || !colorTextArgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, colorTextArgb);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NextBanner()
        {
            title = "";
            hasTitle = false;
            subtitle = "";
            hasSubtitle = false;
            colorTextArgb = "";
            hasColorTextArgb = false;
            cachedSize = -1;
        }
    }

    public static final class OBSOLETE_Reason extends MessageNano
    {

        public String briefReason;
        public boolean hasBriefReason;
        public boolean hasOBSOLETEDetailedReason;
        public boolean hasUniqueId;
        public String oBSOLETEDetailedReason;
        public String uniqueId;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasBriefReason)
                {
                    i = j;
                    if (briefReason.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, briefReason);
            }
            int k;
label1:
            {
                if (!hasOBSOLETEDetailedReason)
                {
                    k = i;
                    if (oBSOLETEDetailedReason.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, oBSOLETEDetailedReason);
            }
label2:
            {
                if (!hasUniqueId)
                {
                    i = k;
                    if (uniqueId.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, uniqueId);
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
                    briefReason = codedinputbytebuffernano.readString();
                    hasBriefReason = true;
                    break;

                case 18: // '\022'
                    oBSOLETEDetailedReason = codedinputbytebuffernano.readString();
                    hasOBSOLETEDetailedReason = true;
                    break;

                case 26: // '\032'
                    uniqueId = codedinputbytebuffernano.readString();
                    hasUniqueId = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasBriefReason || !briefReason.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, briefReason);
            }
            if (hasOBSOLETEDetailedReason || !oBSOLETEDetailedReason.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, oBSOLETEDetailedReason);
            }
            if (hasUniqueId || !uniqueId.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, uniqueId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OBSOLETE_Reason()
        {
            briefReason = "";
            hasBriefReason = false;
            oBSOLETEDetailedReason = "";
            hasOBSOLETEDetailedReason = false;
            uniqueId = "";
            hasUniqueId = false;
            cachedSize = -1;
        }
    }

    public static final class OverflowLink extends MessageNano
    {

        private static volatile OverflowLink _emptyArray[];
        public boolean hasTitle;
        public DocAnnotations.Link link;
        public String title;

        public static OverflowLink[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new OverflowLink[0];
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
            int k = i;
            if (link != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(2, link);
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
                    if (link == null)
                    {
                        link = new DocAnnotations.Link();
                    }
                    codedinputbytebuffernano.readMessage(link);
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
            if (link != null)
            {
                codedoutputbytebuffernano.writeMessage(2, link);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OverflowLink()
        {
            title = "";
            hasTitle = false;
            link = null;
            cachedSize = -1;
        }
    }

    public static final class PlusOneData extends MessageNano
    {

        public DocV2 circlePerson[];
        public long circlesTotal;
        public boolean hasCirclesTotal;
        public boolean hasSetByUser;
        public boolean hasTotal;
        public PlusData.OBSOLETE_PlusProfile oBSOLETECirclesProfiles[];
        public boolean setByUser;
        public long total;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasSetByUser)
                {
                    i = j;
                    if (!setByUser)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
            }
            int i1;
label1:
            {
                if (!hasTotal)
                {
                    i1 = i;
                    if (total == 0L)
                    {
                        break label1;
                    }
                }
                i1 = i + CodedOutputByteBufferNano.computeInt64Size(2, total);
            }
            int k;
label2:
            {
                if (!hasCirclesTotal)
                {
                    k = i1;
                    if (circlesTotal == 0L)
                    {
                        break label2;
                    }
                }
                k = i1 + CodedOutputByteBufferNano.computeInt64Size(3, circlesTotal);
            }
            i = k;
            if (oBSOLETECirclesProfiles != null)
            {
                i = k;
                if (oBSOLETECirclesProfiles.length > 0)
                {
                    i1 = 0;
                    do
                    {
                        i = k;
                        if (i1 >= oBSOLETECirclesProfiles.length)
                        {
                            break;
                        }
                        PlusData.OBSOLETE_PlusProfile obsolete_plusprofile = oBSOLETECirclesProfiles[i1];
                        i = k;
                        if (obsolete_plusprofile != null)
                        {
                            i = k + CodedOutputByteBufferNano.computeMessageSize(4, obsolete_plusprofile);
                        }
                        i1++;
                        k = i;
                    } while (true);
                }
            }
            i1 = i;
            if (circlePerson != null)
            {
                i1 = i;
                if (circlePerson.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i1 = i;
                        if (l >= circlePerson.length)
                        {
                            break;
                        }
                        DocV2 docv2 = circlePerson[l];
                        i1 = i;
                        if (docv2 != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(5, docv2);
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
                    setByUser = codedinputbytebuffernano.readBool();
                    hasSetByUser = true;
                    break;

                case 16: // '\020'
                    total = codedinputbytebuffernano.readRawVarint64();
                    hasTotal = true;
                    break;

                case 24: // '\030'
                    circlesTotal = codedinputbytebuffernano.readRawVarint64();
                    hasCirclesTotal = true;
                    break;

                case 34: // '"'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    PlusData.OBSOLETE_PlusProfile aobsolete_plusprofile[];
                    int j;
                    if (oBSOLETECirclesProfiles == null)
                    {
                        j = 0;
                    } else
                    {
                        j = oBSOLETECirclesProfiles.length;
                    }
                    aobsolete_plusprofile = new PlusData.OBSOLETE_PlusProfile[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(oBSOLETECirclesProfiles, 0, aobsolete_plusprofile, 0, j);
                        l = j;
                    }
                    for (; l < aobsolete_plusprofile.length - 1; l++)
                    {
                        aobsolete_plusprofile[l] = new PlusData.OBSOLETE_PlusProfile();
                        codedinputbytebuffernano.readMessage(aobsolete_plusprofile[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    aobsolete_plusprofile[l] = new PlusData.OBSOLETE_PlusProfile();
                    codedinputbytebuffernano.readMessage(aobsolete_plusprofile[l]);
                    oBSOLETECirclesProfiles = aobsolete_plusprofile;
                    break;

                case 42: // '*'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    DocV2 adocv2[];
                    int k;
                    if (circlePerson == null)
                    {
                        k = 0;
                    } else
                    {
                        k = circlePerson.length;
                    }
                    adocv2 = new DocV2[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(circlePerson, 0, adocv2, 0, k);
                        i1 = k;
                    }
                    for (; i1 < adocv2.length - 1; i1++)
                    {
                        adocv2[i1] = new DocV2();
                        codedinputbytebuffernano.readMessage(adocv2[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocv2[i1] = new DocV2();
                    codedinputbytebuffernano.readMessage(adocv2[i1]);
                    circlePerson = adocv2;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSetByUser || setByUser)
            {
                codedoutputbytebuffernano.writeBool(1, setByUser);
            }
            if (hasTotal || total != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, total);
            }
            if (hasCirclesTotal || circlesTotal != 0L)
            {
                codedoutputbytebuffernano.writeInt64(3, circlesTotal);
            }
            if (oBSOLETECirclesProfiles != null && oBSOLETECirclesProfiles.length > 0)
            {
                for (int i = 0; i < oBSOLETECirclesProfiles.length; i++)
                {
                    PlusData.OBSOLETE_PlusProfile obsolete_plusprofile = oBSOLETECirclesProfiles[i];
                    if (obsolete_plusprofile != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, obsolete_plusprofile);
                    }
                }

            }
            if (circlePerson != null && circlePerson.length > 0)
            {
                for (int j = 0; j < circlePerson.length; j++)
                {
                    DocV2 docv2 = circlePerson[j];
                    if (docv2 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, docv2);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlusOneData()
        {
            setByUser = false;
            hasSetByUser = false;
            total = 0L;
            hasTotal = false;
            circlesTotal = 0L;
            hasCirclesTotal = false;
            circlePerson = DocV2.emptyArray();
            oBSOLETECirclesProfiles = PlusData.OBSOLETE_PlusProfile.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PurchaseHistoryContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public PurchaseHistoryContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class RateAndSuggestContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public RateAndSuggestContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class RateContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public RateContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class Reason extends MessageNano
    {

        private static volatile Reason _emptyArray[];
        public String descriptionHtml;
        public Dismissal dismissal;
        public boolean hasDescriptionHtml;
        public ReasonPlusOne reasonPlusOne;
        public ReasonReview reasonReview;
        public ReasonUserAction reasonUserAction;

        public static Reason[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Reason[0];
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
                if (!hasDescriptionHtml)
                {
                    i = j;
                    if (descriptionHtml.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(3, descriptionHtml);
            }
            int k = i;
            if (reasonPlusOne != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(4, reasonPlusOne);
            }
            i = k;
            if (reasonReview != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(5, reasonReview);
            }
            k = i;
            if (dismissal != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(7, dismissal);
            }
            i = k;
            if (reasonUserAction != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(9, reasonUserAction);
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

                case 26: // '\032'
                    descriptionHtml = codedinputbytebuffernano.readString();
                    hasDescriptionHtml = true;
                    break;

                case 34: // '"'
                    if (reasonPlusOne == null)
                    {
                        reasonPlusOne = new ReasonPlusOne();
                    }
                    codedinputbytebuffernano.readMessage(reasonPlusOne);
                    break;

                case 42: // '*'
                    if (reasonReview == null)
                    {
                        reasonReview = new ReasonReview();
                    }
                    codedinputbytebuffernano.readMessage(reasonReview);
                    break;

                case 58: // ':'
                    if (dismissal == null)
                    {
                        dismissal = new Dismissal();
                    }
                    codedinputbytebuffernano.readMessage(dismissal);
                    break;

                case 74: // 'J'
                    if (reasonUserAction == null)
                    {
                        reasonUserAction = new ReasonUserAction();
                    }
                    codedinputbytebuffernano.readMessage(reasonUserAction);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasDescriptionHtml || !descriptionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, descriptionHtml);
            }
            if (reasonPlusOne != null)
            {
                codedoutputbytebuffernano.writeMessage(4, reasonPlusOne);
            }
            if (reasonReview != null)
            {
                codedoutputbytebuffernano.writeMessage(5, reasonReview);
            }
            if (dismissal != null)
            {
                codedoutputbytebuffernano.writeMessage(7, dismissal);
            }
            if (reasonUserAction != null)
            {
                codedoutputbytebuffernano.writeMessage(9, reasonUserAction);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Reason()
        {
            dismissal = null;
            descriptionHtml = "";
            hasDescriptionHtml = false;
            reasonPlusOne = null;
            reasonReview = null;
            reasonUserAction = null;
            cachedSize = -1;
        }
    }

    public static final class ReasonPlusOne extends MessageNano
    {

        public boolean hasLocalizedDescriptionHtml;
        public String localizedDescriptionHtml;
        public PlusData.OBSOLETE_PlusProfile oBSOLETEPlusProfile[];
        public DocV2 person[];

        protected final int computeSerializedSize()
        {
            int k;
label0:
            {
                int i = super.computeSerializedSize();
                if (!hasLocalizedDescriptionHtml)
                {
                    k = i;
                    if (localizedDescriptionHtml.equals(""))
                    {
                        break label0;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(1, localizedDescriptionHtml);
            }
            int j = k;
            if (oBSOLETEPlusProfile != null)
            {
                j = k;
                if (oBSOLETEPlusProfile.length > 0)
                {
                    int i1 = 0;
                    do
                    {
                        j = k;
                        if (i1 >= oBSOLETEPlusProfile.length)
                        {
                            break;
                        }
                        PlusData.OBSOLETE_PlusProfile obsolete_plusprofile = oBSOLETEPlusProfile[i1];
                        j = k;
                        if (obsolete_plusprofile != null)
                        {
                            j = k + CodedOutputByteBufferNano.computeMessageSize(2, obsolete_plusprofile);
                        }
                        i1++;
                        k = j;
                    } while (true);
                }
            }
            int j1 = j;
            if (person != null)
            {
                j1 = j;
                if (person.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j1 = j;
                        if (l >= person.length)
                        {
                            break;
                        }
                        DocV2 docv2 = person[l];
                        j1 = j;
                        if (docv2 != null)
                        {
                            j1 = j + CodedOutputByteBufferNano.computeMessageSize(3, docv2);
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
                    localizedDescriptionHtml = codedinputbytebuffernano.readString();
                    hasLocalizedDescriptionHtml = true;
                    break;

                case 18: // '\022'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    PlusData.OBSOLETE_PlusProfile aobsolete_plusprofile[];
                    int j;
                    if (oBSOLETEPlusProfile == null)
                    {
                        j = 0;
                    } else
                    {
                        j = oBSOLETEPlusProfile.length;
                    }
                    aobsolete_plusprofile = new PlusData.OBSOLETE_PlusProfile[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(oBSOLETEPlusProfile, 0, aobsolete_plusprofile, 0, j);
                        l = j;
                    }
                    for (; l < aobsolete_plusprofile.length - 1; l++)
                    {
                        aobsolete_plusprofile[l] = new PlusData.OBSOLETE_PlusProfile();
                        codedinputbytebuffernano.readMessage(aobsolete_plusprofile[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    aobsolete_plusprofile[l] = new PlusData.OBSOLETE_PlusProfile();
                    codedinputbytebuffernano.readMessage(aobsolete_plusprofile[l]);
                    oBSOLETEPlusProfile = aobsolete_plusprofile;
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    DocV2 adocv2[];
                    int k;
                    if (person == null)
                    {
                        k = 0;
                    } else
                    {
                        k = person.length;
                    }
                    adocv2 = new DocV2[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(person, 0, adocv2, 0, k);
                        i1 = k;
                    }
                    for (; i1 < adocv2.length - 1; i1++)
                    {
                        adocv2[i1] = new DocV2();
                        codedinputbytebuffernano.readMessage(adocv2[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocv2[i1] = new DocV2();
                    codedinputbytebuffernano.readMessage(adocv2[i1]);
                    person = adocv2;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasLocalizedDescriptionHtml || !localizedDescriptionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, localizedDescriptionHtml);
            }
            if (oBSOLETEPlusProfile != null && oBSOLETEPlusProfile.length > 0)
            {
                for (int i = 0; i < oBSOLETEPlusProfile.length; i++)
                {
                    PlusData.OBSOLETE_PlusProfile obsolete_plusprofile = oBSOLETEPlusProfile[i];
                    if (obsolete_plusprofile != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, obsolete_plusprofile);
                    }
                }

            }
            if (person != null && person.length > 0)
            {
                for (int j = 0; j < person.length; j++)
                {
                    DocV2 docv2 = person[j];
                    if (docv2 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, docv2);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ReasonPlusOne()
        {
            localizedDescriptionHtml = "";
            hasLocalizedDescriptionHtml = false;
            person = DocV2.emptyArray();
            oBSOLETEPlusProfile = PlusData.OBSOLETE_PlusProfile.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class ReasonReview extends MessageNano
    {

        public Review review;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (review != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, review);
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
                    if (review == null)
                    {
                        review = new Review();
                    }
                    codedinputbytebuffernano.readMessage(review);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (review != null)
            {
                codedoutputbytebuffernano.writeMessage(1, review);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ReasonReview()
        {
            review = null;
            cachedSize = -1;
        }
    }

    public static final class ReasonUserAction extends MessageNano
    {

        public boolean hasLocalizedDescriptionHtml;
        public String localizedDescriptionHtml;
        public DocV2 person;

        protected final int computeSerializedSize()
        {
            int j;
label0:
            {
                j = super.computeSerializedSize();
                int i = j;
                if (person != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(1, person);
                }
                if (!hasLocalizedDescriptionHtml)
                {
                    j = i;
                    if (localizedDescriptionHtml.equals(""))
                    {
                        break label0;
                    }
                }
                j = i + CodedOutputByteBufferNano.computeStringSize(2, localizedDescriptionHtml);
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
                    if (person == null)
                    {
                        person = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(person);
                    break;

                case 18: // '\022'
                    localizedDescriptionHtml = codedinputbytebuffernano.readString();
                    hasLocalizedDescriptionHtml = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (person != null)
            {
                codedoutputbytebuffernano.writeMessage(1, person);
            }
            if (hasLocalizedDescriptionHtml || !localizedDescriptionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, localizedDescriptionHtml);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ReasonUserAction()
        {
            person = null;
            localizedDescriptionHtml = "";
            hasLocalizedDescriptionHtml = false;
            cachedSize = -1;
        }
    }

    public static final class RecommendationsContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public RecommendationsContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class RecommendationsContainerWithHeader extends MessageNano
    {

        public DocV2 primaryFace;
        public DocV2 secondaryFace[];

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (primaryFace != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, primaryFace);
            }
            int l = i;
            if (secondaryFace != null)
            {
                l = i;
                if (secondaryFace.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= secondaryFace.length)
                        {
                            break;
                        }
                        DocV2 docv2 = secondaryFace[k];
                        l = i;
                        if (docv2 != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, docv2);
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
                    if (primaryFace == null)
                    {
                        primaryFace = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(primaryFace);
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    DocV2 adocv2[];
                    int j;
                    if (secondaryFace == null)
                    {
                        j = 0;
                    } else
                    {
                        j = secondaryFace.length;
                    }
                    adocv2 = new DocV2[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(secondaryFace, 0, adocv2, 0, j);
                        k = j;
                    }
                    for (; k < adocv2.length - 1; k++)
                    {
                        adocv2[k] = new DocV2();
                        codedinputbytebuffernano.readMessage(adocv2[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocv2[k] = new DocV2();
                    codedinputbytebuffernano.readMessage(adocv2[k]);
                    secondaryFace = adocv2;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (primaryFace != null)
            {
                codedoutputbytebuffernano.writeMessage(1, primaryFace);
            }
            if (secondaryFace != null && secondaryFace.length > 0)
            {
                for (int i = 0; i < secondaryFace.length; i++)
                {
                    DocV2 docv2 = secondaryFace[i];
                    if (docv2 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, docv2);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RecommendationsContainerWithHeader()
        {
            primaryFace = null;
            secondaryFace = DocV2.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class Review extends MessageNano
    {

        public DocV2 author;
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
        public PlusData.OBSOLETE_PlusProfile oBSOLETEPlusProfile;
        public String replyText;
        public long replyTimestampMsec;
        public Common.Image sentiment;
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
                        oBSOLETEPlusProfile = new PlusData.OBSOLETE_PlusProfile();
                    }
                    codedinputbytebuffernano.readMessage(oBSOLETEPlusProfile);
                    break;

                case 266: 
                    if (author == null)
                    {
                        author = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(author);
                    break;

                case 274: 
                    if (sentiment == null)
                    {
                        sentiment = new Common.Image();
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

        public Review()
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

    public static final class SeriesAntenna extends MessageNano
    {

        public String colorThemeArgb;
        public String episodeSubtitle;
        public String episodeTitle;
        public boolean hasColorThemeArgb;
        public boolean hasEpisodeSubtitle;
        public boolean hasEpisodeTitle;
        public boolean hasSeriesSubtitle;
        public boolean hasSeriesTitle;
        public DocAnnotations.SectionMetadata sectionAlbums;
        public DocAnnotations.SectionMetadata sectionTracks;
        public String seriesSubtitle;
        public String seriesTitle;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasSeriesTitle)
                {
                    i = j;
                    if (seriesTitle.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, seriesTitle);
            }
            int k;
label1:
            {
                if (!hasSeriesSubtitle)
                {
                    k = i;
                    if (seriesSubtitle.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, seriesSubtitle);
            }
label2:
            {
                if (!hasEpisodeTitle)
                {
                    i = k;
                    if (episodeTitle.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, episodeTitle);
            }
label3:
            {
                if (!hasEpisodeSubtitle)
                {
                    k = i;
                    if (episodeSubtitle.equals(""))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, episodeSubtitle);
            }
label4:
            {
                if (!hasColorThemeArgb)
                {
                    i = k;
                    if (colorThemeArgb.equals(""))
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(5, colorThemeArgb);
            }
            k = i;
            if (sectionTracks != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(6, sectionTracks);
            }
            i = k;
            if (sectionAlbums != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(7, sectionAlbums);
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
                    seriesTitle = codedinputbytebuffernano.readString();
                    hasSeriesTitle = true;
                    break;

                case 18: // '\022'
                    seriesSubtitle = codedinputbytebuffernano.readString();
                    hasSeriesSubtitle = true;
                    break;

                case 26: // '\032'
                    episodeTitle = codedinputbytebuffernano.readString();
                    hasEpisodeTitle = true;
                    break;

                case 34: // '"'
                    episodeSubtitle = codedinputbytebuffernano.readString();
                    hasEpisodeSubtitle = true;
                    break;

                case 42: // '*'
                    colorThemeArgb = codedinputbytebuffernano.readString();
                    hasColorThemeArgb = true;
                    break;

                case 50: // '2'
                    if (sectionTracks == null)
                    {
                        sectionTracks = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionTracks);
                    break;

                case 58: // ':'
                    if (sectionAlbums == null)
                    {
                        sectionAlbums = new DocAnnotations.SectionMetadata();
                    }
                    codedinputbytebuffernano.readMessage(sectionAlbums);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSeriesTitle || !seriesTitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, seriesTitle);
            }
            if (hasSeriesSubtitle || !seriesSubtitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, seriesSubtitle);
            }
            if (hasEpisodeTitle || !episodeTitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, episodeTitle);
            }
            if (hasEpisodeSubtitle || !episodeSubtitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, episodeSubtitle);
            }
            if (hasColorThemeArgb || !colorThemeArgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, colorThemeArgb);
            }
            if (sectionTracks != null)
            {
                codedoutputbytebuffernano.writeMessage(6, sectionTracks);
            }
            if (sectionAlbums != null)
            {
                codedoutputbytebuffernano.writeMessage(7, sectionAlbums);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SeriesAntenna()
        {
            seriesTitle = "";
            hasSeriesTitle = false;
            seriesSubtitle = "";
            hasSeriesSubtitle = false;
            episodeTitle = "";
            hasEpisodeTitle = false;
            episodeSubtitle = "";
            hasEpisodeSubtitle = false;
            colorThemeArgb = "";
            hasColorThemeArgb = false;
            sectionTracks = null;
            sectionAlbums = null;
            cachedSize = -1;
        }
    }

    public static final class SingleCardContainer extends MessageNano
    {

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public SingleCardContainer()
        {
            cachedSize = -1;
        }
    }

    public static final class Snow extends MessageNano
    {

        public String clickUrl;
        public boolean hasClickUrl;
        public boolean hasSnowBadgeText;
        public boolean hasSnowText;
        public String snowBadgeText;
        public String snowText;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasClickUrl)
                {
                    i = j;
                    if (clickUrl.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, clickUrl);
            }
            int k;
label1:
            {
                if (!hasSnowText)
                {
                    k = i;
                    if (snowText.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, snowText);
            }
label2:
            {
                if (!hasSnowBadgeText)
                {
                    i = k;
                    if (snowBadgeText.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, snowBadgeText);
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
                    clickUrl = codedinputbytebuffernano.readString();
                    hasClickUrl = true;
                    break;

                case 18: // '\022'
                    snowText = codedinputbytebuffernano.readString();
                    hasSnowText = true;
                    break;

                case 26: // '\032'
                    snowBadgeText = codedinputbytebuffernano.readString();
                    hasSnowBadgeText = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasClickUrl || !clickUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, clickUrl);
            }
            if (hasSnowText || !snowText.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, snowText);
            }
            if (hasSnowBadgeText || !snowBadgeText.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, snowBadgeText);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Snow()
        {
            clickUrl = "";
            hasClickUrl = false;
            snowText = "";
            hasSnowText = false;
            snowBadgeText = "";
            hasSnowBadgeText = false;
            cachedSize = -1;
        }
    }

    public static final class SuggestionReasons extends MessageNano
    {

        public Dismissal neutralDismissal;
        public Dismissal positiveDismissal;
        public Reason reason[];

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (reason != null)
            {
                j = i;
                if (reason.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= reason.length)
                        {
                            break;
                        }
                        Reason reason1 = reason[k];
                        j = i;
                        if (reason1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, reason1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (neutralDismissal != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, neutralDismissal);
            }
            j = i;
            if (positiveDismissal != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(5, positiveDismissal);
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

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    Reason areason[];
                    int j;
                    if (reason == null)
                    {
                        j = 0;
                    } else
                    {
                        j = reason.length;
                    }
                    areason = new Reason[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(reason, 0, areason, 0, j);
                        k = j;
                    }
                    for (; k < areason.length - 1; k++)
                    {
                        areason[k] = new Reason();
                        codedinputbytebuffernano.readMessage(areason[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    areason[k] = new Reason();
                    codedinputbytebuffernano.readMessage(areason[k]);
                    reason = areason;
                    break;

                case 34: // '"'
                    if (neutralDismissal == null)
                    {
                        neutralDismissal = new Dismissal();
                    }
                    codedinputbytebuffernano.readMessage(neutralDismissal);
                    break;

                case 42: // '*'
                    if (positiveDismissal == null)
                    {
                        positiveDismissal = new Dismissal();
                    }
                    codedinputbytebuffernano.readMessage(positiveDismissal);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (reason != null && reason.length > 0)
            {
                for (int i = 0; i < reason.length; i++)
                {
                    Reason reason1 = reason[i];
                    if (reason1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, reason1);
                    }
                }

            }
            if (neutralDismissal != null)
            {
                codedoutputbytebuffernano.writeMessage(4, neutralDismissal);
            }
            if (positiveDismissal != null)
            {
                codedoutputbytebuffernano.writeMessage(5, positiveDismissal);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SuggestionReasons()
        {
            neutralDismissal = null;
            positiveDismissal = null;
            reason = Reason.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class Template extends MessageNano
    {

        public ActionBanner actionBanner;
        public AddToCirclesContainer addToCirclesContainer;
        public ArtistClusterContainer artistClusterContainer;
        public AvatarCardContainer avatarCardContainer;
        public BannerWithContentContainer bannerWithContentContainer;
        public BundleBanner bundleBanner;
        public BundleContainer bundleContainer;
        public ContainerWithBanner containerWithBanner;
        public DealOfTheDay dealOfTheDay;
        public EditorialSeriesContainer editorialSeriesContainer;
        public EmptyContainer emptyContainer;
        public FeaturedAppsContainer featuredAppsContainer;
        public MoreByCreatorContainer moreByCreatorContainer;
        public MultiRowContainer multiRowContainer;
        public MyCirclesContainer myCirclesContainer;
        public NextBanner nextBanner;
        public PurchaseHistoryContainer purchaseHistoryContainer;
        public RateAndSuggestContainer rateAndSuggestContainer;
        public RateContainer rateContainer;
        public RecommendationsContainer recommendationsContainer;
        public RecommendationsContainerWithHeader recommendationsContainerWithHeader;
        public SeriesAntenna seriesAntenna;
        public SingleCardContainer singleCardContainer;
        public Snow snow;
        public TileTemplate tileDetailsReflectedGraphic2X2;
        public TileTemplate tileFourBlock4X2;
        public TileTemplate tileGraphic2X1;
        public TileTemplate tileGraphic4X2;
        public TileTemplate tileGraphicColoredTitle2X1;
        public TileTemplate tileGraphicColoredTitle4X2;
        public TileTemplate tileGraphicUpperLeftTitle2X1;
        public TrustedSourceContainer trustedSourceContainer;
        public WarmWelcome warmWelcome;
        public WideCardContainer wideCardContainer;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (seriesAntenna != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, seriesAntenna);
            }
            j = i;
            if (tileGraphic2X1 != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, tileGraphic2X1);
            }
            i = j;
            if (tileGraphic4X2 != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, tileGraphic4X2);
            }
            j = i;
            if (tileGraphicColoredTitle2X1 != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, tileGraphicColoredTitle2X1);
            }
            i = j;
            if (tileGraphicUpperLeftTitle2X1 != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, tileGraphicUpperLeftTitle2X1);
            }
            j = i;
            if (tileDetailsReflectedGraphic2X2 != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, tileDetailsReflectedGraphic2X2);
            }
            i = j;
            if (tileFourBlock4X2 != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, tileFourBlock4X2);
            }
            j = i;
            if (containerWithBanner != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(8, containerWithBanner);
            }
            i = j;
            if (dealOfTheDay != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, dealOfTheDay);
            }
            j = i;
            if (tileGraphicColoredTitle4X2 != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(10, tileGraphicColoredTitle4X2);
            }
            i = j;
            if (editorialSeriesContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(11, editorialSeriesContainer);
            }
            j = i;
            if (recommendationsContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(12, recommendationsContainer);
            }
            i = j;
            if (nextBanner != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(13, nextBanner);
            }
            j = i;
            if (rateContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(14, rateContainer);
            }
            i = j;
            if (addToCirclesContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(15, addToCirclesContainer);
            }
            j = i;
            if (trustedSourceContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(16, trustedSourceContainer);
            }
            i = j;
            if (rateAndSuggestContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(17, rateAndSuggestContainer);
            }
            j = i;
            if (actionBanner != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(18, actionBanner);
            }
            i = j;
            if (warmWelcome != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(19, warmWelcome);
            }
            j = i;
            if (recommendationsContainerWithHeader != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(20, recommendationsContainerWithHeader);
            }
            i = j;
            if (emptyContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(21, emptyContainer);
            }
            j = i;
            if (myCirclesContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(22, myCirclesContainer);
            }
            i = j;
            if (singleCardContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(23, singleCardContainer);
            }
            j = i;
            if (moreByCreatorContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(24, moreByCreatorContainer);
            }
            i = j;
            if (purchaseHistoryContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(25, purchaseHistoryContainer);
            }
            j = i;
            if (snow != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(26, snow);
            }
            i = j;
            if (multiRowContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(28, multiRowContainer);
            }
            j = i;
            if (wideCardContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(29, wideCardContainer);
            }
            i = j;
            if (avatarCardContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(30, avatarCardContainer);
            }
            j = i;
            if (bundleBanner != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(31, bundleBanner);
            }
            i = j;
            if (bundleContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(32, bundleContainer);
            }
            j = i;
            if (featuredAppsContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(33, featuredAppsContainer);
            }
            i = j;
            if (artistClusterContainer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(34, artistClusterContainer);
            }
            j = i;
            if (bannerWithContentContainer != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(35, bannerWithContentContainer);
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
                    if (seriesAntenna == null)
                    {
                        seriesAntenna = new SeriesAntenna();
                    }
                    codedinputbytebuffernano.readMessage(seriesAntenna);
                    break;

                case 18: // '\022'
                    if (tileGraphic2X1 == null)
                    {
                        tileGraphic2X1 = new TileTemplate();
                    }
                    codedinputbytebuffernano.readMessage(tileGraphic2X1);
                    break;

                case 26: // '\032'
                    if (tileGraphic4X2 == null)
                    {
                        tileGraphic4X2 = new TileTemplate();
                    }
                    codedinputbytebuffernano.readMessage(tileGraphic4X2);
                    break;

                case 34: // '"'
                    if (tileGraphicColoredTitle2X1 == null)
                    {
                        tileGraphicColoredTitle2X1 = new TileTemplate();
                    }
                    codedinputbytebuffernano.readMessage(tileGraphicColoredTitle2X1);
                    break;

                case 42: // '*'
                    if (tileGraphicUpperLeftTitle2X1 == null)
                    {
                        tileGraphicUpperLeftTitle2X1 = new TileTemplate();
                    }
                    codedinputbytebuffernano.readMessage(tileGraphicUpperLeftTitle2X1);
                    break;

                case 50: // '2'
                    if (tileDetailsReflectedGraphic2X2 == null)
                    {
                        tileDetailsReflectedGraphic2X2 = new TileTemplate();
                    }
                    codedinputbytebuffernano.readMessage(tileDetailsReflectedGraphic2X2);
                    break;

                case 58: // ':'
                    if (tileFourBlock4X2 == null)
                    {
                        tileFourBlock4X2 = new TileTemplate();
                    }
                    codedinputbytebuffernano.readMessage(tileFourBlock4X2);
                    break;

                case 66: // 'B'
                    if (containerWithBanner == null)
                    {
                        containerWithBanner = new ContainerWithBanner();
                    }
                    codedinputbytebuffernano.readMessage(containerWithBanner);
                    break;

                case 74: // 'J'
                    if (dealOfTheDay == null)
                    {
                        dealOfTheDay = new DealOfTheDay();
                    }
                    codedinputbytebuffernano.readMessage(dealOfTheDay);
                    break;

                case 82: // 'R'
                    if (tileGraphicColoredTitle4X2 == null)
                    {
                        tileGraphicColoredTitle4X2 = new TileTemplate();
                    }
                    codedinputbytebuffernano.readMessage(tileGraphicColoredTitle4X2);
                    break;

                case 90: // 'Z'
                    if (editorialSeriesContainer == null)
                    {
                        editorialSeriesContainer = new EditorialSeriesContainer();
                    }
                    codedinputbytebuffernano.readMessage(editorialSeriesContainer);
                    break;

                case 98: // 'b'
                    if (recommendationsContainer == null)
                    {
                        recommendationsContainer = new RecommendationsContainer();
                    }
                    codedinputbytebuffernano.readMessage(recommendationsContainer);
                    break;

                case 106: // 'j'
                    if (nextBanner == null)
                    {
                        nextBanner = new NextBanner();
                    }
                    codedinputbytebuffernano.readMessage(nextBanner);
                    break;

                case 114: // 'r'
                    if (rateContainer == null)
                    {
                        rateContainer = new RateContainer();
                    }
                    codedinputbytebuffernano.readMessage(rateContainer);
                    break;

                case 122: // 'z'
                    if (addToCirclesContainer == null)
                    {
                        addToCirclesContainer = new AddToCirclesContainer();
                    }
                    codedinputbytebuffernano.readMessage(addToCirclesContainer);
                    break;

                case 130: 
                    if (trustedSourceContainer == null)
                    {
                        trustedSourceContainer = new TrustedSourceContainer();
                    }
                    codedinputbytebuffernano.readMessage(trustedSourceContainer);
                    break;

                case 138: 
                    if (rateAndSuggestContainer == null)
                    {
                        rateAndSuggestContainer = new RateAndSuggestContainer();
                    }
                    codedinputbytebuffernano.readMessage(rateAndSuggestContainer);
                    break;

                case 146: 
                    if (actionBanner == null)
                    {
                        actionBanner = new ActionBanner();
                    }
                    codedinputbytebuffernano.readMessage(actionBanner);
                    break;

                case 154: 
                    if (warmWelcome == null)
                    {
                        warmWelcome = new WarmWelcome();
                    }
                    codedinputbytebuffernano.readMessage(warmWelcome);
                    break;

                case 162: 
                    if (recommendationsContainerWithHeader == null)
                    {
                        recommendationsContainerWithHeader = new RecommendationsContainerWithHeader();
                    }
                    codedinputbytebuffernano.readMessage(recommendationsContainerWithHeader);
                    break;

                case 170: 
                    if (emptyContainer == null)
                    {
                        emptyContainer = new EmptyContainer();
                    }
                    codedinputbytebuffernano.readMessage(emptyContainer);
                    break;

                case 178: 
                    if (myCirclesContainer == null)
                    {
                        myCirclesContainer = new MyCirclesContainer();
                    }
                    codedinputbytebuffernano.readMessage(myCirclesContainer);
                    break;

                case 186: 
                    if (singleCardContainer == null)
                    {
                        singleCardContainer = new SingleCardContainer();
                    }
                    codedinputbytebuffernano.readMessage(singleCardContainer);
                    break;

                case 194: 
                    if (moreByCreatorContainer == null)
                    {
                        moreByCreatorContainer = new MoreByCreatorContainer();
                    }
                    codedinputbytebuffernano.readMessage(moreByCreatorContainer);
                    break;

                case 202: 
                    if (purchaseHistoryContainer == null)
                    {
                        purchaseHistoryContainer = new PurchaseHistoryContainer();
                    }
                    codedinputbytebuffernano.readMessage(purchaseHistoryContainer);
                    break;

                case 210: 
                    if (snow == null)
                    {
                        snow = new Snow();
                    }
                    codedinputbytebuffernano.readMessage(snow);
                    break;

                case 226: 
                    if (multiRowContainer == null)
                    {
                        multiRowContainer = new MultiRowContainer();
                    }
                    codedinputbytebuffernano.readMessage(multiRowContainer);
                    break;

                case 234: 
                    if (wideCardContainer == null)
                    {
                        wideCardContainer = new WideCardContainer();
                    }
                    codedinputbytebuffernano.readMessage(wideCardContainer);
                    break;

                case 242: 
                    if (avatarCardContainer == null)
                    {
                        avatarCardContainer = new AvatarCardContainer();
                    }
                    codedinputbytebuffernano.readMessage(avatarCardContainer);
                    break;

                case 250: 
                    if (bundleBanner == null)
                    {
                        bundleBanner = new BundleBanner();
                    }
                    codedinputbytebuffernano.readMessage(bundleBanner);
                    break;

                case 258: 
                    if (bundleContainer == null)
                    {
                        bundleContainer = new BundleContainer();
                    }
                    codedinputbytebuffernano.readMessage(bundleContainer);
                    break;

                case 266: 
                    if (featuredAppsContainer == null)
                    {
                        featuredAppsContainer = new FeaturedAppsContainer();
                    }
                    codedinputbytebuffernano.readMessage(featuredAppsContainer);
                    break;

                case 274: 
                    if (artistClusterContainer == null)
                    {
                        artistClusterContainer = new ArtistClusterContainer();
                    }
                    codedinputbytebuffernano.readMessage(artistClusterContainer);
                    break;

                case 282: 
                    if (bannerWithContentContainer == null)
                    {
                        bannerWithContentContainer = new BannerWithContentContainer();
                    }
                    codedinputbytebuffernano.readMessage(bannerWithContentContainer);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (seriesAntenna != null)
            {
                codedoutputbytebuffernano.writeMessage(1, seriesAntenna);
            }
            if (tileGraphic2X1 != null)
            {
                codedoutputbytebuffernano.writeMessage(2, tileGraphic2X1);
            }
            if (tileGraphic4X2 != null)
            {
                codedoutputbytebuffernano.writeMessage(3, tileGraphic4X2);
            }
            if (tileGraphicColoredTitle2X1 != null)
            {
                codedoutputbytebuffernano.writeMessage(4, tileGraphicColoredTitle2X1);
            }
            if (tileGraphicUpperLeftTitle2X1 != null)
            {
                codedoutputbytebuffernano.writeMessage(5, tileGraphicUpperLeftTitle2X1);
            }
            if (tileDetailsReflectedGraphic2X2 != null)
            {
                codedoutputbytebuffernano.writeMessage(6, tileDetailsReflectedGraphic2X2);
            }
            if (tileFourBlock4X2 != null)
            {
                codedoutputbytebuffernano.writeMessage(7, tileFourBlock4X2);
            }
            if (containerWithBanner != null)
            {
                codedoutputbytebuffernano.writeMessage(8, containerWithBanner);
            }
            if (dealOfTheDay != null)
            {
                codedoutputbytebuffernano.writeMessage(9, dealOfTheDay);
            }
            if (tileGraphicColoredTitle4X2 != null)
            {
                codedoutputbytebuffernano.writeMessage(10, tileGraphicColoredTitle4X2);
            }
            if (editorialSeriesContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(11, editorialSeriesContainer);
            }
            if (recommendationsContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(12, recommendationsContainer);
            }
            if (nextBanner != null)
            {
                codedoutputbytebuffernano.writeMessage(13, nextBanner);
            }
            if (rateContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(14, rateContainer);
            }
            if (addToCirclesContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(15, addToCirclesContainer);
            }
            if (trustedSourceContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(16, trustedSourceContainer);
            }
            if (rateAndSuggestContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(17, rateAndSuggestContainer);
            }
            if (actionBanner != null)
            {
                codedoutputbytebuffernano.writeMessage(18, actionBanner);
            }
            if (warmWelcome != null)
            {
                codedoutputbytebuffernano.writeMessage(19, warmWelcome);
            }
            if (recommendationsContainerWithHeader != null)
            {
                codedoutputbytebuffernano.writeMessage(20, recommendationsContainerWithHeader);
            }
            if (emptyContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(21, emptyContainer);
            }
            if (myCirclesContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(22, myCirclesContainer);
            }
            if (singleCardContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(23, singleCardContainer);
            }
            if (moreByCreatorContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(24, moreByCreatorContainer);
            }
            if (purchaseHistoryContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(25, purchaseHistoryContainer);
            }
            if (snow != null)
            {
                codedoutputbytebuffernano.writeMessage(26, snow);
            }
            if (multiRowContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(28, multiRowContainer);
            }
            if (wideCardContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(29, wideCardContainer);
            }
            if (avatarCardContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(30, avatarCardContainer);
            }
            if (bundleBanner != null)
            {
                codedoutputbytebuffernano.writeMessage(31, bundleBanner);
            }
            if (bundleContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(32, bundleContainer);
            }
            if (featuredAppsContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(33, featuredAppsContainer);
            }
            if (artistClusterContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(34, artistClusterContainer);
            }
            if (bannerWithContentContainer != null)
            {
                codedoutputbytebuffernano.writeMessage(35, bannerWithContentContainer);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Template()
        {
            seriesAntenna = null;
            tileGraphic2X1 = null;
            tileGraphic4X2 = null;
            tileGraphicColoredTitle2X1 = null;
            tileGraphicUpperLeftTitle2X1 = null;
            tileDetailsReflectedGraphic2X2 = null;
            tileFourBlock4X2 = null;
            tileGraphicColoredTitle4X2 = null;
            containerWithBanner = null;
            dealOfTheDay = null;
            editorialSeriesContainer = null;
            recommendationsContainer = null;
            recommendationsContainerWithHeader = null;
            nextBanner = null;
            rateContainer = null;
            rateAndSuggestContainer = null;
            addToCirclesContainer = null;
            myCirclesContainer = null;
            trustedSourceContainer = null;
            actionBanner = null;
            bundleBanner = null;
            bundleContainer = null;
            warmWelcome = null;
            moreByCreatorContainer = null;
            emptyContainer = null;
            singleCardContainer = null;
            purchaseHistoryContainer = null;
            snow = null;
            avatarCardContainer = null;
            multiRowContainer = null;
            wideCardContainer = null;
            featuredAppsContainer = null;
            artistClusterContainer = null;
            bannerWithContentContainer = null;
            cachedSize = -1;
        }
    }

    public static final class TileTemplate extends MessageNano
    {

        public String colorTextArgb;
        public String colorThemeArgb;
        public boolean hasColorTextArgb;
        public boolean hasColorThemeArgb;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasColorThemeArgb)
                {
                    i = j;
                    if (colorThemeArgb.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, colorThemeArgb);
            }
            int k;
label1:
            {
                if (!hasColorTextArgb)
                {
                    k = i;
                    if (colorTextArgb.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, colorTextArgb);
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
                    colorThemeArgb = codedinputbytebuffernano.readString();
                    hasColorThemeArgb = true;
                    break;

                case 18: // '\022'
                    colorTextArgb = codedinputbytebuffernano.readString();
                    hasColorTextArgb = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasColorThemeArgb || !colorThemeArgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, colorThemeArgb);
            }
            if (hasColorTextArgb || !colorTextArgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, colorTextArgb);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TileTemplate()
        {
            colorThemeArgb = "";
            hasColorThemeArgb = false;
            colorTextArgb = "";
            hasColorTextArgb = false;
            cachedSize = -1;
        }
    }

    public static final class TrustedSourceContainer extends MessageNano
    {

        public DocV2 source;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (source != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, source);
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
                    if (source == null)
                    {
                        source = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(source);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (source != null)
            {
                codedoutputbytebuffernano.writeMessage(1, source);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TrustedSourceContainer()
        {
            source = null;
            cachedSize = -1;
        }
    }

    public static final class VideoSnippet extends MessageNano
    {

        private static volatile VideoSnippet _emptyArray[];
        public String description;
        public boolean hasDescription;
        public boolean hasTitle;
        public Common.Image image[];
        public String title;

        public static VideoSnippet[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new VideoSnippet[0];
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
                i = super.computeSerializedSize();
                int j = i;
                if (image != null)
                {
                    j = i;
                    if (image.length > 0)
                    {
                        int l = 0;
                        do
                        {
                            j = i;
                            if (l >= image.length)
                            {
                                break;
                            }
                            Common.Image image1 = image[l];
                            j = i;
                            if (image1 != null)
                            {
                                j = i + CodedOutputByteBufferNano.computeMessageSize(1, image1);
                            }
                            l++;
                            i = j;
                        } while (true);
                    }
                }
                if (!hasTitle)
                {
                    i = j;
                    if (title.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(2, title);
            }
            int k;
label1:
            {
                if (!hasDescription)
                {
                    k = i;
                    if (description.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(3, description);
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
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

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 26: // '\032'
                    description = codedinputbytebuffernano.readString();
                    hasDescription = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (image != null && image.length > 0)
            {
                for (int i = 0; i < image.length; i++)
                {
                    Common.Image image1 = image[i];
                    if (image1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, image1);
                    }
                }

            }
            if (hasTitle || !title.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            if (hasDescription || !description.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, description);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VideoSnippet()
        {
            image = Common.Image.emptyArray();
            title = "";
            hasTitle = false;
            description = "";
            hasDescription = false;
            cachedSize = -1;
        }
    }

    public static final class VoucherInfo extends MessageNano
    {

        private static volatile VoucherInfo _emptyArray[];
        public DocV2 doc;
        public Common.Offer offer[];

        public static VoucherInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new VoucherInfo[0];
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
            int j = super.computeSerializedSize();
            int i = j;
            if (doc != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, doc);
            }
            int l = i;
            if (offer != null)
            {
                l = i;
                if (offer.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= offer.length)
                        {
                            break;
                        }
                        Common.Offer offer1 = offer[k];
                        l = i;
                        if (offer1 != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, offer1);
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
                    if (doc == null)
                    {
                        doc = new DocV2();
                    }
                    codedinputbytebuffernano.readMessage(doc);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    Common.Offer aoffer[];
                    int j;
                    if (offer == null)
                    {
                        j = 0;
                    } else
                    {
                        j = offer.length;
                    }
                    aoffer = new Common.Offer[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(offer, 0, aoffer, 0, j);
                        k = j;
                    }
                    for (; k < aoffer.length - 1; k++)
                    {
                        aoffer[k] = new Common.Offer();
                        codedinputbytebuffernano.readMessage(aoffer[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aoffer[k] = new Common.Offer();
                    codedinputbytebuffernano.readMessage(aoffer[k]);
                    offer = aoffer;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (doc != null)
            {
                codedoutputbytebuffernano.writeMessage(1, doc);
            }
            if (offer != null && offer.length > 0)
            {
                for (int i = 0; i < offer.length; i++)
                {
                    Common.Offer offer1 = offer[i];
                    if (offer1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, offer1);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VoucherInfo()
        {
            doc = null;
            offer = Common.Offer.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class WarmWelcome extends MessageNano
    {

        public CallToAction action[];

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (action != null)
            {
                k = i;
                if (action.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= action.length)
                        {
                            break;
                        }
                        CallToAction calltoaction = action[j];
                        k = i;
                        if (calltoaction != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, calltoaction);
                        }
                        j++;
                        i = k;
                    } while (true);
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    CallToAction acalltoaction[];
                    int j;
                    if (action == null)
                    {
                        j = 0;
                    } else
                    {
                        j = action.length;
                    }
                    acalltoaction = new CallToAction[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(action, 0, acalltoaction, 0, j);
                        k = j;
                    }
                    for (; k < acalltoaction.length - 1; k++)
                    {
                        acalltoaction[k] = new CallToAction();
                        codedinputbytebuffernano.readMessage(acalltoaction[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    acalltoaction[k] = new CallToAction();
                    codedinputbytebuffernano.readMessage(acalltoaction[k]);
                    action = acalltoaction;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (action != null && action.length > 0)
            {
                for (int i = 0; i < action.length; i++)
                {
                    CallToAction calltoaction = action[i];
                    if (calltoaction != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, calltoaction);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WarmWelcome()
        {
            action = CallToAction.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class WideCardContainer extends MessageNano
    {

        public boolean hasRowCount;
        public boolean hasShowOrdinals;
        public int rowCount;
        public boolean showOrdinals;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasRowCount)
                {
                    i = j;
                    if (rowCount == 2)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, rowCount);
            }
            int k;
label1:
            {
                if (!hasShowOrdinals)
                {
                    k = i;
                    if (!showOrdinals)
                    {
                        break label1;
                    }
                }
                k = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
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
                    rowCount = codedinputbytebuffernano.readRawVarint32();
                    hasRowCount = true;
                    break;

                case 16: // '\020'
                    showOrdinals = codedinputbytebuffernano.readBool();
                    hasShowOrdinals = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasRowCount || rowCount != 2)
            {
                codedoutputbytebuffernano.writeInt32(1, rowCount);
            }
            if (hasShowOrdinals || showOrdinals)
            {
                codedoutputbytebuffernano.writeBool(2, showOrdinals);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WideCardContainer()
        {
            rowCount = 2;
            hasRowCount = false;
            showOrdinals = false;
            hasShowOrdinals = false;
            cachedSize = -1;
        }
    }

}
