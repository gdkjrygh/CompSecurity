// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.add.ImageInfo;
import com.google.android.apps.wallet.wobs.add.InvalidUserDataEvent;
import com.google.android.apps.wallet.wobs.add.OcrResults;
import com.google.android.apps.wallet.wobs.add.Program;
import com.google.android.apps.wallet.wobs.add.ProgramCardInfo;
import com.google.android.apps.wallet.wobs.add.ProgramCardsHandler;
import com.google.android.apps.wallet.wobs.add.PromptValueSerialization;
import com.google.android.apps.wallet.wobs.add.SharedDataPromptConverter;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.android.apps.wallet.wobs.add.UserDataWidgetFactory;
import com.google.android.apps.wallet.wobs.add.api.AddWobsApi;
import com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardInfo, LoyaltyProgram, LoyaltyFactory, LoyaltyApiClient, 
//            NewLoyaltyCardActivity, LoyaltyViewHelper, LoyaltyIntentFactory

public class LoyaltyCardsHandler
    implements ProgramCardsHandler
{

    private final FragmentActivity activity;
    private CheckBox agreeToMerchantPrivacyPolicyCheckBox;
    private CheckBox agreeToMerchantTosCheckBox;
    private final ImageCapturePrerequisiteChecker imageCapturePrerequisiteChecker;
    private CheckBox isForOtherUser;
    private final LoyaltyApiClient loyaltyApiClient;
    private final LoyaltyFactory loyaltyFactory;
    private final LoyaltyViewHelper loyaltyViewHelper;
    private View scanBarcodeAction;
    private View scanBarcodeSuccess;
    private ScrollView scrollView;
    private CheckBox subscribeToPromoOffers;
    private View tosHeadedSection;
    private View tosSection;

    LoyaltyCardsHandler(FragmentActivity fragmentactivity, LoyaltyFactory loyaltyfactory, LoyaltyApiClient loyaltyapiclient, LoyaltyViewHelper loyaltyviewhelper, ImageCapturePrerequisiteChecker imagecaptureprerequisitechecker)
    {
        activity = fragmentactivity;
        loyaltyFactory = loyaltyfactory;
        loyaltyApiClient = loyaltyapiclient;
        loyaltyViewHelper = loyaltyviewhelper;
        imageCapturePrerequisiteChecker = imagecaptureprerequisitechecker;
    }

    private void configFriendsAndFamilySection(LayoutInflater layoutinflater, View view, LoyaltyCardInfo loyaltycardinfo, boolean flag)
    {
        LinearLayout linearlayout = (LinearLayout)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.CustomSection);
        linearlayout.setVisibility(0);
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.loyalty_add_program_custom_section, linearlayout, false);
        linearlayout.addView(layoutinflater);
        loyaltycardinfo = loyaltycardinfo.getProgram();
        configureTextAreaForCheckboxUse(layoutinflater, com.google.android.apps.walletnfcrel.R.id.FriendOrFamilyMemberCheckBoxText, com.google.android.apps.walletnfcrel.R.id.FriendOrFamilyMemberCheckBox);
        if (flag)
        {
            Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ReceivePromoEmailsFromMerchantLayout).setVisibility(0);
            ((CheckBox)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ReceivePromoEmailsFromMerchantCheckBox)).setChecked(loyaltycardinfo.getMarketingOptInDefault());
            configureTextAreaForCheckboxUse(view, com.google.android.apps.walletnfcrel.R.id.ReceivePromoEmailsFromMerchantCheckBoxText, com.google.android.apps.walletnfcrel.R.id.ReceivePromoEmailsFromMerchantCheckBox);
        }
        isForOtherUser = (CheckBox)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.FriendOrFamilyMemberCheckBox);
        subscribeToPromoOffers = (CheckBox)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.ReceivePromoEmailsFromMerchantCheckBox);
    }

    private void configTosSection(LayoutInflater layoutinflater, View view, LoyaltyCardInfo loyaltycardinfo)
    {
        loyaltycardinfo = loyaltycardinfo.getProgram();
        boolean flag;
        boolean flag1;
        if (!Strings.isNullOrEmpty(loyaltycardinfo.getTosUrl()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!Strings.isNullOrEmpty(loyaltycardinfo.getPrivacyUrl()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag && !flag1)
        {
            return;
        }
        scrollView = (ScrollView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.RootScrollView);
        tosHeadedSection = Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.TosHeadedSection);
        tosHeadedSection.setVisibility(0);
        view = (LinearLayout)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.TosSection);
        tosSection = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.loyalty_add_program_tos_section, view, false);
        view.addView(tosSection);
        agreeToMerchantTosCheckBox = (CheckBox)Views.findViewById(tosSection, com.google.android.apps.walletnfcrel.R.id.AgreeToMerchantTosCheckBox);
        agreeToMerchantPrivacyPolicyCheckBox = (CheckBox)Views.findViewById(tosSection, com.google.android.apps.walletnfcrel.R.id.AgreeToMerchantPrivacyPolicyCheckBox);
        if (flag)
        {
            Views.findViewById(tosSection, com.google.android.apps.walletnfcrel.R.id.AgreeToMerchantTosLayout).setVisibility(0);
            Views.setLink((TextView)Views.findViewById(tosSection, com.google.android.apps.walletnfcrel.R.id.AgreeToMerchantTosText), activity.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_join_program_accept_merchant_tos, new Object[] {
                loyaltycardinfo.getTosUrl()
            }));
            agreeToMerchantTosCheckBox.setChecked(false);
        } else
        {
            agreeToMerchantTosCheckBox.setChecked(true);
        }
        if (flag1)
        {
            Views.findViewById(tosSection, com.google.android.apps.walletnfcrel.R.id.AgreeToMerchantPrivacyPolicyLayout).setVisibility(0);
            Views.setLink((TextView)Views.findViewById(tosSection, com.google.android.apps.walletnfcrel.R.id.AgreeToMerchantPrivacyPolicyText), activity.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_join_program_accept_merchant_privacy_policy, new Object[] {
                loyaltycardinfo.getPrivacyUrl()
            }));
            agreeToMerchantPrivacyPolicyCheckBox.setChecked(false);
            return;
        } else
        {
            agreeToMerchantPrivacyPolicyCheckBox.setChecked(true);
            return;
        }
    }

    private static void configureTextAreaForCheckboxUse(final View view, int i, final int checkboxId)
    {
        TextView textview = (TextView)Views.findViewById(view, i);
        textview.setOnClickListener(new android.view.View.OnClickListener() {

            final int val$checkboxId;
            final View val$view;

            public final void onClick(View view1)
            {
                ((CheckBox)Views.findViewById(view, checkboxId)).toggle();
            }

            
            {
                view = view1;
                checkboxId = i;
                super();
            }
        });
        textview.setAccessibilityDelegate(new android.view.View.AccessibilityDelegate() {

            final int val$checkboxId;
            final View val$view;

            public final void onInitializeAccessibilityEvent(View view1, AccessibilityEvent accessibilityevent)
            {
                Views.findViewById(view, checkboxId).onInitializeAccessibilityEvent(accessibilityevent);
            }

            public final void onInitializeAccessibilityNodeInfo(View view1, AccessibilityNodeInfo accessibilitynodeinfo)
            {
                Views.findViewById(view, checkboxId).onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            }

            
            {
                view = view1;
                checkboxId = i;
                super();
            }
        });
    }

    private static LoyaltyCardInfo createProgramCard()
    {
        return new LoyaltyCardInfo();
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
        static final class _cls6
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

        switch (_cls6..SwitchMap.com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side[aimageinfo[i].getSide().ordinal()])
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

    private LoyaltyProgram fetchProgram(String s)
        throws RpcException, CallErrorException
    {
        if (s == null)
        {
            return loyaltyFactory.createAdhocFormProgram();
        } else
        {
            return loyaltyApiClient.getSingleLoyaltyProgram(activity, isSignup(), s);
        }
    }

    private boolean isSignup()
    {
        return (activity instanceof NewLoyaltyCardActivity) && ((NewLoyaltyCardActivity)activity).isSignup();
    }

    private void loadCardInfoWithOcrResults(LoyaltyCardInfo loyaltycardinfo, OcrResults ocrresults)
    {
        Preconditions.checkNotNull(loyaltycardinfo);
        Preconditions.checkNotNull(ocrresults);
        if (ocrresults.merchantName != null && loyaltycardinfo.getProgram() == null)
        {
            loyaltycardinfo.setMerchantName(ocrresults.merchantName);
        }
        if (ocrresults.programName != null)
        {
            loyaltycardinfo.setPromptValue(-9, ocrresults.programName);
        }
        loadMemberIdAndBarcodeFromOcrResults(loyaltycardinfo, ocrresults);
    }

    private com.google.wallet.proto.NanoWalletObjects.WobInstance makeWobInstance(LoyaltyCardInfo loyaltycardinfo)
        throws RpcException, CallErrorException
    {
        Object obj = loyaltycardinfo.getAllPrompts();
        Object obj1 = Iterables.filter(((Iterable) (obj)), Predicates.not(UserDataPrompt.withId(-8)));
        UserDataPrompt userdataprompt = (UserDataPrompt)Iterables.find(((Iterable) (obj)), UserDataPrompt.withId(-8), null);
        com.google.wallet.proto.api.NanoUserAddedImages.UserAddedImage auseraddedimage[] = null;
        com.google.wallet.proto.NanoWalletEntities.Barcode barcode = auseraddedimage;
        if (userdataprompt != null)
        {
            barcode = auseraddedimage;
            if (userdataprompt.hasValue())
            {
                barcode = PromptValueSerialization.deserializeBarcode(userdataprompt.getValue());
            }
        }
        obj1 = SharedDataPromptConverter.createValues(((Iterable) (obj1)));
        auseraddedimage = null;
        if (loyaltycardinfo.getImages() != null)
        {
            auseraddedimage = createUserAddedImages(loyaltycardinfo.getImages());
        }
        if (loyaltycardinfo.getProgram().getDiscoverableId() == null)
        {
            com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue shareddatavalue;
            boolean flag;
            if (((List) (obj1)).size() == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            loyaltycardinfo = (com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue)Iterables.find(((Iterable) (obj1)), sharedDataValueWithId(-1));
            shareddatavalue = (com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue)Iterables.find(((Iterable) (obj1)), sharedDataValueWithId(-7));
            obj1 = (com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue)Iterables.find(((Iterable) (obj1)), sharedDataValueWithId(-9));
            obj = PromptValueSerialization.deserializeLogoInfo(((UserDataPrompt)Iterables.find(((Iterable) (obj)), UserDataPrompt.withId(-6))).getValue());
            loyaltycardinfo = loyaltyApiClient.linkUserAddedProgram(shareddatavalue.value, Strings.emptyToNull(((com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue) (obj1)).value), ((com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue) (loyaltycardinfo)).value, barcode, ((com.google.android.apps.wallet.wobs.add.PromptValueSerialization.LogoInfo) (obj)).programIcon.intValue(), ((com.google.android.apps.wallet.wobs.add.PromptValueSerialization.LogoInfo) (obj)).colorHex, auseraddedimage);
            if (((com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramResponse) (loyaltycardinfo)).callError != null)
            {
                throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramResponse) (loyaltycardinfo)).callError);
            } else
            {
                return ((com.google.wallet.proto.api.NanoWalletLoyalty.LinkAdhocLoyaltyProgramResponse) (loyaltycardinfo)).wobInstance;
            }
        }
        if (isSignup())
        {
            loyaltycardinfo = loyaltyApiClient.signup(loyaltycardinfo.getProgram().getDiscoverableId(), Integer.valueOf(loyaltycardinfo.getProgram().getDiscoverableStatus()), ((Iterable) (obj1)), loyaltycardinfo.getSubscribeToPromoOffers(), loyaltycardinfo.getIsForOtherUser());
            if (((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (loyaltycardinfo)).callError != null)
            {
                if (((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (loyaltycardinfo)).invalidDataIds != null && ((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (loyaltycardinfo)).invalidDataIds.length > 0)
                {
                    throw new InvalidUserDataEvent(((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (loyaltycardinfo)).callError, ((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (loyaltycardinfo)).invalidDataIds);
                } else
                {
                    throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (loyaltycardinfo)).callError);
                }
            } else
            {
                return ((com.google.wallet.proto.api.NanoWalletLoyalty.SignupLoyaltyProgramResponse) (loyaltycardinfo)).wobInstance;
            }
        }
        obj = (com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue)Iterables.find(((Iterable) (obj1)), sharedDataValueWithId(-1));
        obj1 = Iterables.filter(((Iterable) (obj1)), Predicates.not(sharedDataValueWithId(-1)));
        loyaltycardinfo = loyaltyApiClient.link(loyaltycardinfo.getProgram().getDiscoverableId(), Integer.valueOf(loyaltycardinfo.getProgram().getDiscoverableStatus()), ((com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue) (obj)).value, barcode, ((Iterable) (obj1)), loyaltycardinfo.getIsForOtherUser(), auseraddedimage);
        if (((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (loyaltycardinfo)).callError != null)
        {
            if (((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (loyaltycardinfo)).invalidDataIds != null && ((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (loyaltycardinfo)).invalidDataIds.length > 0)
            {
                throw new InvalidUserDataEvent(((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (loyaltycardinfo)).callError, ((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (loyaltycardinfo)).invalidDataIds);
            } else
            {
                throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (loyaltycardinfo)).callError);
            }
        } else
        {
            return ((com.google.wallet.proto.api.NanoWalletLoyalty.LinkLoyaltyProgramResponse) (loyaltycardinfo)).wobInstance;
        }
    }

    private void onEditCardInfoViewInflated(LayoutInflater layoutinflater, View view, int i, LoyaltyCardInfo loyaltycardinfo)
    {
        LoyaltyViewHelper loyaltyviewhelper = loyaltyViewHelper;
        LoyaltyViewHelper.placeProgramNameFromCardInfo(view, loyaltycardinfo);
        if (i == 1)
        {
            boolean flag = isSignup();
            configFriendsAndFamilySection(layoutinflater, view, loyaltycardinfo, flag);
            if (flag)
            {
                configTosSection(layoutinflater, view, loyaltycardinfo);
            }
        }
    }

    private void placeUserDataPrompts(List list, ViewGroup viewgroup, LayoutInflater layoutinflater, LoyaltyCardInfo loyaltycardinfo)
    {
        loyaltyViewHelper.placeUserDataPrompts(list, viewgroup, layoutinflater, activity.getResources(), new UserDataWidgetFactory(activity, layoutinflater));
        list = (UserDataPrompt)Iterables.find(loyaltycardinfo.getFormPrompts(), UserDataPrompt.withId(-1), null);
        if (list != null)
        {
            int i = viewgroup.indexOfChild(viewgroup.findViewById(list.calculateViewId()));
            scanBarcodeAction = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.loyalty_scan_barcode_action, viewgroup, false);
            scanBarcodeAction.setOnClickListener(new android.view.View.OnClickListener() {

                final LoyaltyCardsHandler this$0;

                public final void onClick(View view)
                {
                    activity.startActivityForResult(LoyaltyIntentFactory.createScanBarcodeActivity(activity), 1337);
                }

            
            {
                this$0 = LoyaltyCardsHandler.this;
                super();
            }
            });
            scanBarcodeSuccess = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.loyalty_scan_barcode_success, viewgroup, false);
            viewgroup.addView(scanBarcodeAction, i + 1);
            viewgroup.addView(scanBarcodeSuccess, i + 2);
            updateScanBarcodeMessage(loyaltycardinfo);
        }
    }

    private boolean processCustomSection(LoyaltyCardInfo loyaltycardinfo, int i)
    {
        if (i != 1)
        {
            return true;
        }
        if (agreeToMerchantTosCheckBox != null && !agreeToMerchantTosCheckBox.isChecked())
        {
            scrollToTosSection();
            AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.error_dialog_check_input_message).setMessage(com.google.android.apps.walletnfcrel.R.string.loyalty_join_program_warning_please_accept_tos).build().show(activity.getSupportFragmentManager());
            return false;
        }
        if (agreeToMerchantPrivacyPolicyCheckBox != null && !agreeToMerchantPrivacyPolicyCheckBox.isChecked())
        {
            scrollToTosSection();
            AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.error_dialog_check_input_message).setMessage(com.google.android.apps.walletnfcrel.R.string.loyalty_join_program_warning_please_accept_privacy_policy).build().show(activity.getSupportFragmentManager());
            return false;
        } else
        {
            loyaltycardinfo.setIsForOtherUser(isForOtherUser.isChecked());
            loyaltycardinfo.setSubscribeToPromoOffers(subscribeToPromoOffers.isChecked());
            return true;
        }
    }

    private void scrollToTosSection()
    {
        scrollView.post(new Runnable() {

            final LoyaltyCardsHandler this$0;

            public final void run()
            {
                scrollView.scrollTo(0, tosHeadedSection.getTop() + tosSection.getTop());
            }

            
            {
                this$0 = LoyaltyCardsHandler.this;
                super();
            }
        });
    }

    private static boolean setupProgram(LoyaltyCardInfo loyaltycardinfo, LoyaltyProgram loyaltyprogram, String s)
    {
        loyaltycardinfo.setupNewPrompts(loyaltyprogram);
        return true;
    }

    private static Predicate sharedDataValueWithId(final int id)
    {
        return new Predicate() {

            final int val$id;

            private boolean apply(com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue shareddatavalue)
            {
                return shareddatavalue.sharedDataId.intValue() == id;
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue)obj);
            }

            
            {
                id = i;
                super();
            }
        };
    }

    private boolean showAddProgramCardWarningDialogIfNecessary(com.google.android.apps.wallet.wobs.add.EditCardInfoFragment.EditCardInfoCallback editcardinfocallback, LoyaltyCardInfo loyaltycardinfo)
    {
        if (loyaltycardinfo.nameWasModifiedByUser() && loyaltycardinfo.includesBirthYear() && !loyaltycardinfo.getIsForOtherUser())
        {
            AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.loyalty_coppa_dialog_title).setMessage(com.google.android.apps.walletnfcrel.R.string.loyalty_coppa_dialog_content).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.loyalty_coppa_negative_button_text).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.loyalty_coppa_positive_button_text).build().show(activity.getSupportFragmentManager(), "TAG_FOR_OTHER_USER_DIALOG");
            return true;
        } else
        {
            return false;
        }
    }

    private void updateScanBarcodeMessage(LoyaltyCardInfo loyaltycardinfo)
    {
        if (scanBarcodeAction == null) goto _L2; else goto _L1
_L1:
        scanBarcodeAction.setVisibility(8);
        scanBarcodeSuccess.setVisibility(8);
        loyaltycardinfo.getScanBarcodeState();
        JVM INSTR tableswitch 1 2: default 52
    //                   1 53
    //                   2 62;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        scanBarcodeAction.setVisibility(0);
        return;
_L4:
        scanBarcodeSuccess.setVisibility(0);
        return;
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
            return AddWobsApi.createCaptureImagesActivityIntentForRetake(context, i, imagecaptureanalyticsstrings, 2);
        } else
        {
            return null;
        }
    }

    public final int getOcrType()
    {
        return 3;
    }

    public final int getOcrUserEventType()
    {
        return 303;
    }

    public final volatile void loadCardInfoWithOcrResults(ProgramCardInfo programcardinfo, OcrResults ocrresults)
    {
        loadCardInfoWithOcrResults((LoyaltyCardInfo)programcardinfo, ocrresults);
    }

    final void loadMemberIdAndBarcodeFromOcrResults(LoyaltyCardInfo loyaltycardinfo, OcrResults ocrresults)
    {
        Preconditions.checkNotNull(loyaltycardinfo);
        Preconditions.checkNotNull(ocrresults);
        if ((ocrresults.cardNumber != null || ocrresults.barcode != null) && !loyaltycardinfo.getCardNumber().isPresent())
        {
            String s;
            if (ocrresults.cardNumber != null)
            {
                s = ocrresults.cardNumber;
            } else
            {
                s = ocrresults.barcode.value;
            }
            loyaltycardinfo.setPromptValue(-1, s);
        }
        if (ocrresults.barcode != null)
        {
            loyaltycardinfo.setBarcode(ocrresults.barcode);
        }
        updateScanBarcodeMessage(loyaltycardinfo);
    }

    public final volatile com.google.wallet.proto.NanoWalletObjects.WobInstance makeWobInstance(ProgramCardInfo programcardinfo)
        throws RpcException, CallErrorException
    {
        return makeWobInstance((LoyaltyCardInfo)programcardinfo);
    }

    public final volatile void onEditCardInfoViewInflated(LayoutInflater layoutinflater, View view, int i, ProgramCardInfo programcardinfo)
    {
        onEditCardInfoViewInflated(layoutinflater, view, i, (LoyaltyCardInfo)programcardinfo);
    }

    public final volatile void placeUserDataPrompts(List list, ViewGroup viewgroup, LayoutInflater layoutinflater, ProgramCardInfo programcardinfo)
    {
        placeUserDataPrompts(list, viewgroup, layoutinflater, (LoyaltyCardInfo)programcardinfo);
    }

    public final volatile boolean processCustomSection(ProgramCardInfo programcardinfo, int i)
    {
        return processCustomSection((LoyaltyCardInfo)programcardinfo, i);
    }

    public final List search(String s)
        throws RpcException, CallErrorException
    {
        if (s.isEmpty())
        {
            return ImmutableList.of();
        }
        s = loyaltyApiClient.getLoyaltyProgramSuggestions(s);
        String as[] = new String[s.length];
        for (int i = 0; i < s.length; i++)
        {
            as[i] = ((com.google.wallet.proto.api.NanoWalletLoyalty.SuggestedLoyaltyProgramInfo) (s[i])).discoverableProgramId;
        }

        return loyaltyApiClient.getLoyaltyPrograms(activity, false, as);
    }

    public final void setIsForOtherUser(boolean flag, LoyaltyCardInfo loyaltycardinfo)
    {
        isForOtherUser.setChecked(flag);
        loyaltycardinfo.setIsForOtherUser(flag);
    }

    public final volatile boolean setupProgram(ProgramCardInfo programcardinfo, Program program, String s)
    {
        return setupProgram((LoyaltyCardInfo)programcardinfo, (LoyaltyProgram)program, s);
    }

    public final volatile boolean showAddProgramCardWarningDialogIfNecessary(com.google.android.apps.wallet.wobs.add.EditCardInfoFragment.EditCardInfoCallback editcardinfocallback, ProgramCardInfo programcardinfo)
    {
        return showAddProgramCardWarningDialogIfNecessary(editcardinfocallback, (LoyaltyCardInfo)programcardinfo);
    }

    public final boolean supportsImageCapture()
    {
        return imageCapturePrerequisiteChecker.check() && !isSignup();
    }




}
