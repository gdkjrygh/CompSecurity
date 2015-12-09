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

    public String applicableVoucherDescription;
    public String attributionHtml;
    public mySubscriptionDetails badgeForContentRating;
    public mySubscriptionDetails badgeForCreator[];
    public mySubscriptionDetails badgeForDoc[];
    public mySubscriptionDetails creatorDoc;
    public etadata detailsPageCluster[];
    public tainer docBadgeContainer[];
    public boolean hasApplicableVoucherDescription;
    public boolean hasAttributionHtml;
    public boolean hasOfferNote;
    public boolean hasPrivacyPolicyUrl;
    public tainer link;
    public iptionDetails mySubscriptionDetails;
    public son oBSOLETEReason;
    public String offerNote;
    public son optimalDeviceClassWarning;
    public  overflowLink[];
    public  plusOneData;
    public String privacyPolicyUrl;
    public Doc promotedDoc[];
    public HistoryDetails purchaseHistoryDetails;
    public etadata sectionBodyOfWork;
    public etadata sectionCoreContent;
    public etadata sectionCrossSell;
    public etadata sectionFeaturedApps;
    public etadata sectionMoreBy;
    public etadata sectionPurchaseCrossSell;
    public etadata sectionPurchaseRelatedTopics;
    public etadata sectionRelated;
    public etadata sectionRelatedDocType;
    public etadata sectionSuggestForRating;
    public etadata subscription[];
    public asons suggestionReasons;
    public asons template;
    public eoAnnotations videoAnnotations;
    public eoAnnotations voucherInfo[];
    public eoAnnotations warning[];

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
                        cachedSize cachedsize = warning[l];
                        j = i;
                        if (cachedsize != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(4, cachedsize);
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
                        cachedSize cachedsize1 = badgeForCreator[j1];
                        i = j;
                        if (cachedsize1 != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(8, cachedsize1);
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
                        cachedSize cachedsize2 = badgeForDoc[k1];
                        j = i;
                        if (cachedsize2 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(9, cachedsize2);
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
                        Doc doc = promotedDoc[l1];
                        j = i;
                        if (doc != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(13, doc);
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
                        Doc doc1 = subscription[i2];
                        k = i;
                        if (doc1 != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(16, doc1);
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
                        tainer tainer = docBadgeContainer[j2];
                        k = i;
                        if (tainer != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(21, tainer);
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
                          = overflowLink[k2];
                        k = i;
                        if ( != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(25, );
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
                         1 = voucherInfo[l2];
                        k = i;
                        if (1 != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(30, 1);
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
                    etadata etadata = detailsPageCluster[i3];
                    k = i;
                    if (etadata != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(34, etadata);
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
                    sectionRelated = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionRelated);
                break;

            case 18: // '\022'
                if (sectionMoreBy == null)
                {
                    sectionMoreBy = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionMoreBy);
                break;

            case 26: // '\032'
                if (plusOneData == null)
                {
                    plusOneData = new <init>();
                }
                codedinputbytebuffernano.readMessage(plusOneData);
                break;

            case 34: // '"'
                int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                mySubscriptionDetails amysubscriptiondetails[];
                int j;
                if (warning == null)
                {
                    j = 0;
                } else
                {
                    j = warning.length;
                }
                amysubscriptiondetails = new warning[k2 + j];
                k2 = j;
                if (j != 0)
                {
                    System.arraycopy(warning, 0, amysubscriptiondetails, 0, j);
                    k2 = j;
                }
                for (; k2 < amysubscriptiondetails.length - 1; k2++)
                {
                    amysubscriptiondetails[k2] = new <init>();
                    codedinputbytebuffernano.readMessage(amysubscriptiondetails[k2]);
                    codedinputbytebuffernano.readTag();
                }

                amysubscriptiondetails[k2] = new <init>();
                codedinputbytebuffernano.readMessage(amysubscriptiondetails[k2]);
                warning = amysubscriptiondetails;
                break;

            case 42: // '*'
                if (sectionBodyOfWork == null)
                {
                    sectionBodyOfWork = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionBodyOfWork);
                break;

            case 50: // '2'
                if (sectionCoreContent == null)
                {
                    sectionCoreContent = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionCoreContent);
                break;

            case 58: // ':'
                if (template == null)
                {
                    template = new it>();
                }
                codedinputbytebuffernano.readMessage(template);
                break;

            case 66: // 'B'
                int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 66);
                mySubscriptionDetails amysubscriptiondetails1[];
                int k;
                if (badgeForCreator == null)
                {
                    k = 0;
                } else
                {
                    k = badgeForCreator.length;
                }
                amysubscriptiondetails1 = new badgeForCreator[l2 + k];
                l2 = k;
                if (k != 0)
                {
                    System.arraycopy(badgeForCreator, 0, amysubscriptiondetails1, 0, k);
                    l2 = k;
                }
                for (; l2 < amysubscriptiondetails1.length - 1; l2++)
                {
                    amysubscriptiondetails1[l2] = new nit>();
                    codedinputbytebuffernano.readMessage(amysubscriptiondetails1[l2]);
                    codedinputbytebuffernano.readTag();
                }

                amysubscriptiondetails1[l2] = new nit>();
                codedinputbytebuffernano.readMessage(amysubscriptiondetails1[l2]);
                badgeForCreator = amysubscriptiondetails1;
                break;

            case 74: // 'J'
                int i3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
                mySubscriptionDetails amysubscriptiondetails2[];
                int l;
                if (badgeForDoc == null)
                {
                    l = 0;
                } else
                {
                    l = badgeForDoc.length;
                }
                amysubscriptiondetails2 = new badgeForDoc[i3 + l];
                i3 = l;
                if (l != 0)
                {
                    System.arraycopy(badgeForDoc, 0, amysubscriptiondetails2, 0, l);
                    i3 = l;
                }
                for (; i3 < amysubscriptiondetails2.length - 1; i3++)
                {
                    amysubscriptiondetails2[i3] = new nit>();
                    codedinputbytebuffernano.readMessage(amysubscriptiondetails2[i3]);
                    codedinputbytebuffernano.readTag();
                }

                amysubscriptiondetails2[i3] = new nit>();
                codedinputbytebuffernano.readMessage(amysubscriptiondetails2[i3]);
                badgeForDoc = amysubscriptiondetails2;
                break;

            case 82: // 'R'
                if (link == null)
                {
                    link = new it>();
                }
                codedinputbytebuffernano.readMessage(link);
                break;

            case 90: // 'Z'
                if (sectionCrossSell == null)
                {
                    sectionCrossSell = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionCrossSell);
                break;

            case 98: // 'b'
                if (sectionRelatedDocType == null)
                {
                    sectionRelatedDocType = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionRelatedDocType);
                break;

            case 106: // 'j'
                int j3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 106);
                Doc adoc[];
                int i1;
                if (promotedDoc == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = promotedDoc.length;
                }
                adoc = new Doc[j3 + i1];
                j3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(promotedDoc, 0, adoc, 0, i1);
                    j3 = i1;
                }
                for (; j3 < adoc.length - 1; j3++)
                {
                    adoc[j3] = new Doc();
                    codedinputbytebuffernano.readMessage(adoc[j3]);
                    codedinputbytebuffernano.readTag();
                }

                adoc[j3] = new Doc();
                codedinputbytebuffernano.readMessage(adoc[j3]);
                promotedDoc = adoc;
                break;

            case 114: // 'r'
                offerNote = codedinputbytebuffernano.readString();
                hasOfferNote = true;
                break;

            case 130: 
                int k3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 130);
                Doc adoc1[];
                int j1;
                if (subscription == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = subscription.length;
                }
                adoc1 = new subscription[k3 + j1];
                k3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(subscription, 0, adoc1, 0, j1);
                    k3 = j1;
                }
                for (; k3 < adoc1.length - 1; k3++)
                {
                    adoc1[k3] = new ();
                    codedinputbytebuffernano.readMessage(adoc1[k3]);
                    codedinputbytebuffernano.readTag();
                }

                adoc1[k3] = new ();
                codedinputbytebuffernano.readMessage(adoc1[k3]);
                subscription = adoc1;
                break;

            case 138: 
                if (oBSOLETEReason == null)
                {
                    oBSOLETEReason = new son();
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
                    suggestionReasons = new asons();
                }
                codedinputbytebuffernano.readMessage(suggestionReasons);
                break;

            case 162: 
                if (optimalDeviceClassWarning == null)
                {
                    optimalDeviceClassWarning = new <init>();
                }
                codedinputbytebuffernano.readMessage(optimalDeviceClassWarning);
                break;

            case 170: 
                int l3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 170);
                tainer atainer[];
                int k1;
                if (docBadgeContainer == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = docBadgeContainer.length;
                }
                atainer = new tainer[l3 + k1];
                l3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(docBadgeContainer, 0, atainer, 0, k1);
                    l3 = k1;
                }
                for (; l3 < atainer.length - 1; l3++)
                {
                    atainer[l3] = new tainer();
                    codedinputbytebuffernano.readMessage(atainer[l3]);
                    codedinputbytebuffernano.readTag();
                }

                atainer[l3] = new tainer();
                codedinputbytebuffernano.readMessage(atainer[l3]);
                docBadgeContainer = atainer;
                break;

            case 178: 
                if (sectionSuggestForRating == null)
                {
                    sectionSuggestForRating = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionSuggestForRating);
                break;

            case 194: 
                if (sectionPurchaseCrossSell == null)
                {
                    sectionPurchaseCrossSell = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionPurchaseCrossSell);
                break;

            case 202: 
                int i4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 202);
                 a[];
                int l1;
                if (overflowLink == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = overflowLink.length;
                }
                a = new [i4 + l1];
                i4 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(overflowLink, 0, a, 0, l1);
                    i4 = l1;
                }
                for (; i4 < a.length - 1; i4++)
                {
                    a[i4] = new ();
                    codedinputbytebuffernano.readMessage(a[i4]);
                    codedinputbytebuffernano.readTag();
                }

                a[i4] = new ();
                codedinputbytebuffernano.readMessage(a[i4]);
                overflowLink = a;
                break;

            case 210: 
                if (creatorDoc == null)
                {
                    creatorDoc = new ();
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
                    purchaseHistoryDetails = new HistoryDetails();
                }
                codedinputbytebuffernano.readMessage(purchaseHistoryDetails);
                break;

            case 234: 
                if (badgeForContentRating == null)
                {
                    badgeForContentRating = new nit>();
                }
                codedinputbytebuffernano.readMessage(badgeForContentRating);
                break;

            case 242: 
                int j4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 242);
                 a1[];
                int i2;
                if (voucherInfo == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = voucherInfo.length;
                }
                a1 = new voucherInfo[j4 + i2];
                j4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(voucherInfo, 0, a1, 0, i2);
                    j4 = i2;
                }
                for (; j4 < a1.length - 1; j4++)
                {
                    a1[j4] = new <init>();
                    codedinputbytebuffernano.readMessage(a1[j4]);
                    codedinputbytebuffernano.readTag();
                }

                a1[j4] = new <init>();
                codedinputbytebuffernano.readMessage(a1[j4]);
                voucherInfo = a1;
                break;

            case 258: 
                if (sectionFeaturedApps == null)
                {
                    sectionFeaturedApps = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionFeaturedApps);
                break;

            case 266: 
                applicableVoucherDescription = codedinputbytebuffernano.readString();
                hasApplicableVoucherDescription = true;
                break;

            case 274: 
                int k4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 274);
                etadata aetadata[];
                int j2;
                if (detailsPageCluster == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = detailsPageCluster.length;
                }
                aetadata = new etadata[k4 + j2];
                k4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(detailsPageCluster, 0, aetadata, 0, j2);
                    k4 = j2;
                }
                for (; k4 < aetadata.length - 1; k4++)
                {
                    aetadata[k4] = new etadata();
                    codedinputbytebuffernano.readMessage(aetadata[k4]);
                    codedinputbytebuffernano.readTag();
                }

                aetadata[k4] = new etadata();
                codedinputbytebuffernano.readMessage(aetadata[k4]);
                detailsPageCluster = aetadata;
                break;

            case 282: 
                if (videoAnnotations == null)
                {
                    videoAnnotations = new eoAnnotations();
                }
                codedinputbytebuffernano.readMessage(videoAnnotations);
                break;

            case 290: 
                if (sectionPurchaseRelatedTopics == null)
                {
                    sectionPurchaseRelatedTopics = new etadata();
                }
                codedinputbytebuffernano.readMessage(sectionPurchaseRelatedTopics);
                break;

            case 298: 
                if (mySubscriptionDetails == null)
                {
                    mySubscriptionDetails = new iptionDetails();
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
                mySubscriptionDetails mysubscriptiondetails = warning[i];
                if (mysubscriptiondetails != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, mysubscriptiondetails);
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
                mySubscriptionDetails mysubscriptiondetails1 = badgeForCreator[j];
                if (mysubscriptiondetails1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(8, mysubscriptiondetails1);
                }
            }

        }
        if (badgeForDoc != null && badgeForDoc.length > 0)
        {
            for (int k = 0; k < badgeForDoc.length; k++)
            {
                mySubscriptionDetails mysubscriptiondetails2 = badgeForDoc[k];
                if (mysubscriptiondetails2 != null)
                {
                    codedoutputbytebuffernano.writeMessage(9, mysubscriptiondetails2);
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
                Doc doc = promotedDoc[l];
                if (doc != null)
                {
                    codedoutputbytebuffernano.writeMessage(13, doc);
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
                Doc doc1 = subscription[i1];
                if (doc1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(16, doc1);
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
                tainer tainer = docBadgeContainer[j1];
                if (tainer != null)
                {
                    codedoutputbytebuffernano.writeMessage(21, tainer);
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
                  = overflowLink[k1];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(25, );
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
                 1 = voucherInfo[l1];
                if (1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(30, 1);
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
                etadata etadata = detailsPageCluster[i2];
                if (etadata != null)
                {
                    codedoutputbytebuffernano.writeMessage(34, etadata);
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

    public eoAnnotations()
    {
        detailsPageCluster = etadata.emptyArray();
        sectionCoreContent = null;
        sectionRelatedDocType = null;
        sectionSuggestForRating = null;
        sectionPurchaseCrossSell = null;
        sectionPurchaseRelatedTopics = null;
        plusOneData = null;
        warning = emptyArray();
        optimalDeviceClassWarning = null;
        link = null;
        template = null;
        badgeForCreator = ptyArray();
        badgeForDoc = ptyArray();
        badgeForContentRating = null;
        docBadgeContainer = tainer.emptyArray();
        promotedDoc = Doc.emptyArray();
        offerNote = "";
        hasOfferNote = false;
        subscription = rray();
        suggestionReasons = null;
        oBSOLETEReason = null;
        privacyPolicyUrl = "";
        hasPrivacyPolicyUrl = false;
        overflowLink = .emptyArray();
        creatorDoc = null;
        attributionHtml = "";
        hasAttributionHtml = false;
        purchaseHistoryDetails = null;
        mySubscriptionDetails = null;
        voucherInfo = emptyArray();
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
