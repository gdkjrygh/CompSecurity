// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.add.ImageInfo;
import com.google.android.apps.wallet.wobs.add.OcrResults;
import com.google.android.apps.wallet.wobs.add.Program;
import com.google.android.apps.wallet.wobs.add.ProgramCardInfo;
import com.google.android.apps.wallet.wobs.add.ProgramCardsHandler;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.android.apps.wallet.wobs.add.UserDataPromptDisplay;
import com.google.android.apps.wallet.wobs.add.api.AddWobsApi;
import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteCheckerUtil;
import com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardInfo, GiftCardsClient, GiftCardProgram, AddGiftCardWarningDialogFragment, 
//            GiftCardHelpDialogFragment

class GiftCardsHandler
    implements ProgramCardsHandler
{

    private final FragmentActivity activity;
    AnalyticsUtil analyticsUtil;
    AppControl appControl;
    GiftCardsClient giftCardsClient;
    ImageCapturePrerequisiteChecker imageCapturePrerequisiteChecker;
    SharedPreferences sharedPreferences;

    GiftCardsHandler(FragmentActivity fragmentactivity, GiftCardsClient giftcardsclient, SharedPreferences sharedpreferences, AppControl appcontrol, PackageManager packagemanager, AnalyticsUtil analyticsutil)
    {
        activity = fragmentactivity;
        giftCardsClient = giftcardsclient;
        sharedPreferences = sharedpreferences;
        appControl = appcontrol;
        imageCapturePrerequisiteChecker = new ImageCapturePrerequisiteChecker(new FeaturePrerequisiteCheckerUtil(packagemanager));
        analyticsUtil = analyticsutil;
    }

    private static GiftCardInfo createProgramCard()
    {
        return new GiftCardInfo();
    }

    private static com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage[] createUserAddedImages(ImageInfo aimageinfo[])
    {
        com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage auseraddedimage[];
        int i;
        auseraddedimage = new com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage[aimageinfo.length];
        i = 0;
_L2:
        if (i >= aimageinfo.length)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        auseraddedimage[i] = new com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage();
        auseraddedimage[i].localSourceUri = aimageinfo[i].getLocalSourceUri();
        auseraddedimage[i].aspectRatio = Float.valueOf(aimageinfo[i].getAspectRatio());
        static final class _cls4
        {

            static final int $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$pub$OcrImageHolder$Side[];

            static 
            {
                $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$pub$OcrImageHolder$Side = new int[com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.values().length];
                try
                {
                    $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$pub$OcrImageHolder$Side[com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$pub$OcrImageHolder$Side[com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side[aimageinfo[i].getSide().ordinal()])
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_108;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        auseraddedimage[i].tag = Integer.valueOf(1);
          goto _L3
        auseraddedimage[i].tag = Integer.valueOf(2);
          goto _L3
        return auseraddedimage;
    }

    private GiftCardProgram fetchProgram(String s)
        throws RpcException, CallErrorException
    {
        s = giftCardsClient.getLinkForm(s);
        return new GiftCardProgram(activity, ((com.google.wallet.proto.api.NanoWalletGiftCards.GetGiftCardFormResponse) (s)).giftCardForm);
    }

    private static void loadCardInfoWithOcrResults(GiftCardInfo giftcardinfo, OcrResults ocrresults)
    {
        Preconditions.checkNotNull(giftcardinfo);
        Preconditions.checkNotNull(ocrresults);
        if (ocrresults.merchantName != null && giftcardinfo.getDiscoverable() == null)
        {
            giftcardinfo.setMerchantName(ocrresults.merchantName);
        }
        if (ocrresults.cardNumber != null && !giftcardinfo.getCardNumber().isPresent())
        {
            giftcardinfo.setPromptValue(-1, ocrresults.cardNumber);
        }
        if (ocrresults.pin != null)
        {
            giftcardinfo.setPromptValue(2, ocrresults.pin);
        }
    }

    private com.google.wallet.proto.NanoWalletObjects.WobInstance makeWobInstance(GiftCardInfo giftcardinfo)
        throws RpcException, CallErrorException
    {
        String s;
        com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage auseraddedimage[];
        ImageInfo aimageinfo[];
        if (giftcardinfo.getDiscoverable() == null)
        {
            s = null;
        } else
        {
            s = giftcardinfo.getDiscoverable().discoverableId;
        }
        aimageinfo = giftcardinfo.getImages();
        auseraddedimage = null;
        if (aimageinfo != null)
        {
            auseraddedimage = createUserAddedImages(aimageinfo);
        }
        if (s != null)
        {
            return giftCardsClient.link(s, giftcardinfo.getAllPrompts(), auseraddedimage).wobInstance;
        } else
        {
            return giftCardsClient.linkAdhoc(giftcardinfo.getAllPrompts(), auseraddedimage).wobInstance;
        }
    }

    private void onEditCardInfoViewInflated(LayoutInflater layoutinflater, View view, int i, final GiftCardInfo cardInfo)
    {
        layoutinflater = (TextView)layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.gift_cards_find_numbers, null);
        Views.setLinkOnClickListener(layoutinflater, new android.view.View.OnClickListener() {

            final GiftCardsHandler this$0;
            final GiftCardInfo val$cardInfo;

            public final void onClick(View view1)
            {
                analyticsUtil.sendLinkTap("GiftCardNumbersHelp", new AnalyticsCustomDimension[0]);
                ((GiftCardHelpDialogFragment)GiftCardHelpDialogFragment.newBuilder().setPrompts(cardInfo.getAllPrompts()).build()).show(activity.getSupportFragmentManager());
            }

            
            {
                this$0 = GiftCardsHandler.this;
                cardInfo = giftcardinfo;
                super();
            }
        });
        ((LinearLayout)view.findViewById(com.google.android.apps.walletnfcrel.R.id.UserDataPrompts).getParent()).addView(layoutinflater);
    }

    private void placeUserDataPrompts(List list, ViewGroup viewgroup, LayoutInflater layoutinflater, GiftCardInfo giftcardinfo)
    {
        layoutinflater = viewgroup.getRootView();
        for (list = list.iterator(); list.hasNext();)
        {
            giftcardinfo = (UserDataPromptDisplay)list.next();
            if (giftcardinfo.getPrompt().getInputType() == com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.MONEY)
            {
                ((ViewGroup)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.BelowCardTitle)).addView(giftcardinfo.getView());
                giftcardinfo = (ImageView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.InfoIcon);
                giftcardinfo.setVisibility(0);
                giftcardinfo.setOnClickListener(new android.view.View.OnClickListener() {

                    final GiftCardsHandler this$0;

                    public final void onClick(View view)
                    {
                        analyticsUtil.sendLinkTap("GiftCardBalanceInfo", new AnalyticsCustomDimension[0]);
                        view = HelpUrls.createAboutGiftCardBalanceHelpUrl();
                        activity.startActivity(UriIntents.create(activity, view));
                    }

            
            {
                this$0 = GiftCardsHandler.this;
                super();
            }
                });
            } else
            {
                viewgroup.addView(giftcardinfo.getView());
            }
        }

    }

    private static boolean processCustomSection(GiftCardInfo giftcardinfo, int i)
    {
        return true;
    }

    private boolean setupProgram(GiftCardInfo giftcardinfo, GiftCardProgram giftcardprogram, String s)
    {
        if (giftcardprogram.getDiscoverable() != null && giftcardprogram.getDiscoverable().externalRedemption != null)
        {
            giftcardprogram = giftcardprogram.getDiscoverable().externalRedemption;
            if (Strings.isNullOrEmpty(s))
            {
                giftcardinfo = ((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard.ExternalRedemption) (giftcardprogram)).redemptionUri;
            } else
            {
                giftcardinfo = String.format(((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard.ExternalRedemption) (giftcardprogram)).redemptionUriCardKnown, new Object[] {
                    s
                });
            }
            AlertDialogFragment.newBuilder().setTitle(((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard.ExternalRedemption) (giftcardprogram)).messageTitle).setMessage(((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard.ExternalRedemption) (giftcardprogram)).messageContent).setNegativeButton(((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard.ExternalRedemption) (giftcardprogram)).abortText).setPositiveButton(((com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard.ExternalRedemption) (giftcardprogram)).redeemText).setPositiveButtonActionUri(Uri.parse(giftcardinfo)).setPositiveButtonAnalyticsLinkTapField("GiftCardExternalRedemption").build().show(activity.getSupportFragmentManager());
            return false;
        } else
        {
            giftcardinfo.setupNewPrompts(giftcardprogram);
            return true;
        }
    }

    private boolean showAddProgramCardWarningDialogIfNecessary(com.google.android.apps.wallet.wobs.add.EditCardInfoFragment.EditCardInfoCallback editcardinfocallback, GiftCardInfo giftcardinfo)
    {
        if (((Boolean)SharedPreference.ADD_GIFT_CARD_WARNING_DIALOG_DISPLAYED.get(sharedPreferences)).booleanValue())
        {
            return false;
        } else
        {
            SharedPreference.ADD_GIFT_CARD_WARNING_DIALOG_DISPLAYED.put(sharedPreferences, Boolean.valueOf(true));
            giftcardinfo = (AddGiftCardWarningDialogFragment)AddGiftCardWarningDialogFragment.newBuilder().build();
            giftcardinfo.setEditCardInfoCallback(editcardinfocallback);
            giftcardinfo.show(activity.getSupportFragmentManager());
            return true;
        }
    }

    public final volatile ProgramCardInfo createProgramCard()
    {
        return createProgramCard();
    }

    public final volatile Program fetchProgram(String s)
        throws RpcException, CallErrorException
    {
        return fetchProgram(s);
    }

    public final Intent getImageCaptureIntent(Context context, int i, com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings imagecaptureanalyticsstrings)
    {
        if (supportsImageCapture())
        {
            return AddWobsApi.createCaptureImagesActivityIntentForRetake(context, i, imagecaptureanalyticsstrings, 1);
        } else
        {
            return null;
        }
    }

    public final int getOcrType()
    {
        return 4;
    }

    public final int getOcrUserEventType()
    {
        return 331;
    }

    public final volatile void loadCardInfoWithOcrResults(ProgramCardInfo programcardinfo, OcrResults ocrresults)
    {
        loadCardInfoWithOcrResults((GiftCardInfo)programcardinfo, ocrresults);
    }

    public final volatile com.google.wallet.proto.NanoWalletObjects.WobInstance makeWobInstance(ProgramCardInfo programcardinfo)
        throws RpcException, CallErrorException
    {
        return makeWobInstance((GiftCardInfo)programcardinfo);
    }

    public final volatile void onEditCardInfoViewInflated(LayoutInflater layoutinflater, View view, int i, ProgramCardInfo programcardinfo)
    {
        onEditCardInfoViewInflated(layoutinflater, view, i, (GiftCardInfo)programcardinfo);
    }

    public final volatile void placeUserDataPrompts(List list, ViewGroup viewgroup, LayoutInflater layoutinflater, ProgramCardInfo programcardinfo)
    {
        placeUserDataPrompts(list, viewgroup, layoutinflater, (GiftCardInfo)programcardinfo);
    }

    public final volatile boolean processCustomSection(ProgramCardInfo programcardinfo, int i)
    {
        return processCustomSection((GiftCardInfo)programcardinfo, i);
    }

    public final List search(String s)
        throws RpcException, CallErrorException
    {
        if (s.isEmpty())
        {
            return ImmutableList.of();
        } else
        {
            return Lists.transform(giftCardsClient.discoverGiftCards(s), new Function() {

                final GiftCardsHandler this$0;

                private GiftCardProgram apply(com.google.wallet.proto.api.NanoWalletGiftCards.GiftCardForm giftcardform)
                {
                    return new GiftCardProgram(activity, giftcardform);
                }

                public final volatile Object apply(Object obj)
                {
                    return apply((com.google.wallet.proto.api.NanoWalletGiftCards.GiftCardForm)obj);
                }

            
            {
                this$0 = GiftCardsHandler.this;
                super();
            }
            });
        }
    }

    public final volatile boolean setupProgram(ProgramCardInfo programcardinfo, Program program, String s)
    {
        return setupProgram((GiftCardInfo)programcardinfo, (GiftCardProgram)program, s);
    }

    public final volatile boolean showAddProgramCardWarningDialogIfNecessary(com.google.android.apps.wallet.wobs.add.EditCardInfoFragment.EditCardInfoCallback editcardinfocallback, ProgramCardInfo programcardinfo)
    {
        return showAddProgramCardWarningDialogIfNecessary(editcardinfocallback, (GiftCardInfo)programcardinfo);
    }

    public final boolean supportsImageCapture()
    {
        return imageCapturePrerequisiteChecker.check();
    }

}
