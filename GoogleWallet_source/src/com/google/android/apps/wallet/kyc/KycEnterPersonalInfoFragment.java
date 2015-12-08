// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.analytics.CsiManager;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.data.DateValidators;
import com.google.android.apps.wallet.data.StringValidators;
import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.preferences.PreferenceClient;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.android.apps.wallet.widgets.address.AddressView;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.widgets.validation.ValidatedDatePicker;
import com.google.android.apps.wallet.widgets.validation.ValidatedEditText;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinner;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinnerAdapterWrapper;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import com.google.common.base.Strings;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFragmentInterface, KycUiModel, KycNavListener, KycAddressAdapter, 
//            KycTosDialogFragment

public class KycEnterPersonalInfoFragment extends WalletFragment
    implements KycFragmentInterface
{
    public static final class P2bCategory
    {

        private final com.google.wallet.proto.NanoWalletEntities.DisplayableP2pCommercialUses.DisplayableP2pCommercialUse displayableP2pCommercialUse;

        public final Integer getP2pCommercialUseType()
        {
            return displayableP2pCommercialUse.p2PCommercialUseType;
        }

        public final String toString()
        {
            return displayableP2pCommercialUse.displayName;
        }

        public P2bCategory(com.google.wallet.proto.NanoWalletEntities.DisplayableP2pCommercialUses.DisplayableP2pCommercialUse displayablep2pcommercialuse)
        {
            displayableP2pCommercialUse = displayablep2pcommercialuse;
        }
    }


    KycAddressAdapter addressAdapter;
    private Spinner addressSpinner;
    private AddressView addressView;
    CsiManager csi;
    private ValidatedDatePicker dateOfBirth;
    EncryptionService encryptionService;
    private ValidatedEditText firstName;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private View fullSsnSection;
    private TextView homeAddressInstruction;
    private ImageView imageBadge;
    private ImageView imageCaution;
    private TextView instruction;
    private View instructionDivider;
    KycClient kycClient;
    KycStatusPublisher kycStatusPublisher;
    Provider kycTosDialogFragmentProvider;
    private ValidatedEditText lastName;
    private TextView legalNameInstruction;
    private KycUiModel model;
    private KycNavListener navListener;
    NetworkAccessChecker networkAccessChecker;
    private P2bCategory p2bCategories[];
    private CheckBox p2bCheckbox;
    private TextView p2bDescription;
    private ProgressBar p2bProgressBar;
    private ValidatedSpinner p2bSpinner;
    PreferenceClient preferenceClient;
    private TextView ssnInstruction;
    private ValidatedEditText ssnLast4;
    private View ssnLast4Section;
    private View ssnSectionBody;
    private TextView ssnSectionHeader;
    private ValidatedEditText ssnSegment1;
    private ValidatedEditText ssnSegment2;
    private ValidatedEditText ssnSegment3;
    ValidationGroup validationGroup;
    private Button verifyButton;

    public KycEnterPersonalInfoFragment()
    {
        setArguments(new Bundle());
    }

    private void acceptTos()
    {
        analyticsUtil.sendButtonTap("AcceptTermsOfService", new AnalyticsCustomDimension[0]);
        fullScreenProgressSpinnerManager.showImmediately();
        csi.startTiming("user_kyc");
        csi.start("user_kyc", "ka");
        executeAction("accept_tos", createAcceptTosAction());
    }

    private Callable createAcceptTosAction()
    {
        return new Callable() {

            final KycEnterPersonalInfoFragment this$0;

            private com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosRequest acceptkyctosrequest = new com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosRequest();
                acceptkyctosrequest.acceptedTosId = (new String[] {
                    model.getWalletLegalDocument().documentId, model.getEsignLegalDocument().documentId
                });
                return kycClient.acceptKycTos(acceptkyctosrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
        };
    }

    private static String createKycInstructionMarkup(Context context)
    {
        return context.getString(com.google.android.apps.walletnfcrel.R.string.kyc_instruction, new Object[] {
            HelpUrls.createKycHelpUrl().toString()
        });
    }

    private void handleAcceptTosSuccess(com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse acceptkyctosresponse)
    {
        if (acceptkyctosresponse.callError != null)
        {
            fullScreenProgressSpinnerManager.hide();
            CallErrorDialogs.createBuilderWithGenericTitle(acceptkyctosresponse.callError, com.google.android.apps.walletnfcrel.R.string.kyc_error_accept_tos).build().show(getFragmentManager());
            return;
        } else
        {
            model.setIsAllLegalDocumentsAccepted(true);
            csi.finish("user_kyc", "ka");
            verifyIdentity();
            return;
        }
    }

    private void handleVerifyIdentitySuccess(com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityResponse verifyidentityresponse)
    {
        fullScreenProgressSpinnerManager.hide();
        if (verifyidentityresponse.callError != null)
        {
            CallErrorDialogs.createBuilderWithGenericTitle(verifyidentityresponse.callError, com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again).build().show(getFragmentManager());
            return;
        }
        int i = KycClient.getKycStatus(verifyidentityresponse.kycStatus);
        kycStatusPublisher.setKycStatus(i);
        csi.endTiming("user_kyc");
        switch (i)
        {
        default:
            AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).build().show(getActivity().getSupportFragmentManager());
            return;

        case 1: // '\001'
            navListener.onRequestNav(KycNavListener.NavState.PASSED);
            return;

        case 4: // '\004'
            model.setIsRetryMode(true);
            render();
            navListener.onRequestNav(KycNavListener.NavState.ENTER_PERSONAL_INFO_RETRY);
            return;

        case 2: // '\002'
            model.populateModel(verifyidentityresponse);
            if (model.hasReferralQuestions())
            {
                navListener.onRequestNav(KycNavListener.NavState.OOW_INTRO);
                return;
            } else
            {
                navListener.onRequestNav(KycNavListener.NavState.REFERRED);
                return;
            }

        case 3: // '\003'
            navListener.onRequestNav(KycNavListener.NavState.FAILED);
            return;
        }
    }

    private void render()
    {
        boolean flag = model.hasMultipleAddresses();
        boolean flag1 = model.getAddress().countryCode.equals("US");
        setConfiguration(model, flag, flag1);
        if (!Strings.isNullOrEmpty(model.getFirstName()))
        {
            firstName.setValue(model.getFirstName());
        }
        if (!Strings.isNullOrEmpty(model.getLastName()))
        {
            lastName.setValue(model.getLastName());
        }
        if (model.getDateOfBirth() != null)
        {
            Integer integer = model.getDateOfBirth().year;
            Integer integer1 = model.getDateOfBirth().month;
            Integer integer2 = model.getDateOfBirth().day;
            if (integer != null && integer1 != null && integer2 != null)
            {
                dateOfBirth.setValue(new GregorianCalendar(integer.intValue(), integer1.intValue() - 1, integer2.intValue()));
            }
        }
        if (flag)
        {
            addressAdapter.setAddresses(model.getAddressList());
            addressSpinner.setAdapter(addressAdapter);
            addressSpinner.setSelection(model.getSelectedAddressIndex());
        } else
        if (model.getAddress() != null)
        {
            addressView.setAddress(model.getAddress());
            return;
        }
    }

    private void saveUserInputsToModel()
    {
        model.setFirstName(firstName.getValue());
        model.setLastName(lastName.getValue());
        if (!model.hasMultipleAddresses())
        {
            model.setAddress(addressView.getAddress());
        }
        if (dateOfBirth.getValue() != null)
        {
            com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth dateofbirth = new com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth();
            dateofbirth.year = Integer.valueOf(dateOfBirth.getValue().get(1));
            dateofbirth.month = Integer.valueOf(dateOfBirth.getValue().get(2) + 1);
            dateofbirth.day = Integer.valueOf(dateOfBirth.getValue().get(5));
            model.setDateOfBirth(dateofbirth);
        }
        if (model.isRetryMode())
        {
            model.setSsnFull9(ssnSegment1.getValue() + ssnSegment2.getValue() + ssnSegment3.getValue());
            return;
        } else
        {
            model.setSsnLast4(ssnLast4.getValue());
            return;
        }
    }

    private void setConfiguration(KycUiModel kycuimodel, boolean flag, boolean flag1)
    {
label0:
        {
            byte byte0 = 8;
            Object obj;
            int i;
            if (kycuimodel.isRetryMode())
            {
                instruction.setText(getActivity().getString(com.google.android.apps.walletnfcrel.R.string.kyc_retry_instruction));
                imageBadge.setVisibility(8);
                imageCaution.setVisibility(0);
                instructionDivider.setVisibility(0);
                legalNameInstruction.setVisibility(0);
                homeAddressInstruction.setText(getActivity().getString(com.google.android.apps.walletnfcrel.R.string.kyc_retry_home_address_instruction));
            } else
            {
                Views.setLink(instruction, createKycInstructionMarkup(getActivity()));
                imageBadge.setVisibility(0);
                imageCaution.setVisibility(8);
                instructionDivider.setVisibility(8);
                legalNameInstruction.setVisibility(8);
                homeAddressInstruction.setText(getActivity().getString(com.google.android.apps.walletnfcrel.R.string.kyc_home_address_instruction));
            }
            obj = ssnSectionHeader;
            if (flag1)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
            obj = ssnSectionBody;
            if (flag1)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
            if (flag1)
            {
                if (kycuimodel.isRetryMode())
                {
                    ssnSectionHeader.setText(getActivity().getString(com.google.android.apps.walletnfcrel.R.string.kyc_retry_full_ssn));
                    ssnInstruction.setVisibility(0);
                    ssnLast4Section.setVisibility(8);
                    fullSsnSection.setVisibility(0);
                    dateOfBirth.setNextFocusForwardId(com.google.android.apps.walletnfcrel.R.id.KycSsnSegment1);
                    if (!Strings.isNullOrEmpty(model.getSsnLast4()))
                    {
                        ssnSegment3.setValue(model.getSsnLast4());
                    }
                } else
                {
                    ssnSectionHeader.setText(getActivity().getString(com.google.android.apps.walletnfcrel.R.string.kyc_ssn_last_four));
                    ssnInstruction.setVisibility(8);
                    ssnLast4Section.setVisibility(0);
                    fullSsnSection.setVisibility(8);
                    dateOfBirth.setNextFocusForwardId(com.google.android.apps.walletnfcrel.R.id.KycSsnSegment3);
                    if (!Strings.isNullOrEmpty(model.getSsnLast4()))
                    {
                        ssnSegment3.setValue(model.getSsnLast4());
                    }
                }
            }
            obj = addressSpinner;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((Spinner) (obj)).setVisibility(i);
            obj = addressView;
            if (flag)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            ((AddressView) (obj)).setVisibility(i);
            validationGroup.clearInputs();
            validationGroup.addInput(firstName);
            validationGroup.addInput(lastName);
            if (!flag)
            {
                addressView.addValidator(validationGroup);
            }
            validationGroup.addInput(dateOfBirth);
            if (flag1)
            {
                if (!kycuimodel.isRetryMode())
                {
                    break label0;
                }
                validationGroup.addInput(ssnSegment1);
                validationGroup.addInput(ssnSegment2);
                validationGroup.addInput(ssnSegment3);
            }
            return;
        }
        validationGroup.addInput(ssnLast4);
    }

    private void setP2bCategories(P2bCategory ap2bcategory[])
    {
        p2bProgressBar.setVisibility(8);
        ap2bcategory = new ArrayAdapter(getActivity(), 0x1090009, ap2bcategory);
        ap2bcategory = new ValidatedSpinnerAdapterWrapper(ap2bcategory, 0x1090009, ap2bcategory) {

            final KycEnterPersonalInfoFragment this$0;
            final ArrayAdapter val$arrayAdapter;

            private P2bCategory getItemValue(int i)
            {
                return (P2bCategory)arrayAdapter.getItem(i);
            }

            protected final String getHintText()
            {
                return getActivity().getString(com.google.android.apps.walletnfcrel.R.string.p2b_spinner_title);
            }

            protected final volatile Object getItemValue(int i)
            {
                return getItemValue(i);
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                arrayAdapter = arrayadapter;
                super(final_context, spinneradapter, i);
            }
        };
        p2bSpinner.setAdapter(ap2bcategory);
        p2bSpinner.setValidator(new DataValidator() {

            final KycEnterPersonalInfoFragment this$0;

            private static boolean isValid(P2bCategory p2bcategory, Resources resources)
            {
                return p2bcategory != null;
            }

            private String validate(P2bCategory p2bcategory, Resources resources)
            {
                if (p2bcategory == null)
                {
                    return getActivity().getString(com.google.android.apps.walletnfcrel.R.string.validated_spinner_no_selection_error);
                } else
                {
                    return "";
                }
            }

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((P2bCategory)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((P2bCategory)obj, resources);
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
        });
        validationGroup.addInput(p2bSpinner);
        p2bSpinner.setVisibility(0);
    }

    private void showTosDialog()
    {
        KycTosDialogFragment kyctosdialogfragment = (KycTosDialogFragment)kycTosDialogFragmentProvider.get();
        kyctosdialogfragment.setLegalDocuments(model.getWalletLegalDocument(), model.getEsignLegalDocument());
        kyctosdialogfragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final KycEnterPersonalInfoFragment this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case -1: 
                    acceptTos();
                    break;
                }
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
        });
        kyctosdialogfragment.show(getFragmentManager(), Fragments.getTransactionTag(com/google/android/apps/wallet/kyc/KycTosDialogFragment));
    }

    private void verifyIdentity()
    {
        if (p2bCheckbox.isChecked() && p2bSpinner != null && p2bSpinner.getValue() != null)
        {
            executeAction("update_commercial_use", new Callable() {

                final KycEnterPersonalInfoFragment this$0;

                private Void call()
                    throws Exception
                {
                    preferenceClient.updateCommercialUse(true, ((P2bCategory)p2bSpinner.getValue()).getP2pCommercialUseType());
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
            });
        }
        executeAction("verify_identity", new Callable() {

            final KycEnterPersonalInfoFragment this$0;

            private com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityResponse call()
                throws Exception
            {
                com.google.wallet.proto.NanoWalletEntities.Address address;
                com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest verifyidentityrequest;
                boolean flag;
                com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession encryptionsession = encryptionService.newSession();
                if (model.hasMultipleAddresses())
                {
                    address = (com.google.wallet.proto.NanoWalletEntities.Address)model.getAddressList().get(model.getSelectedAddressIndex());
                } else
                {
                    address = model.getAddress();
                }
                if (address.line2 != null && address.line2.isEmpty())
                {
                    address.line2 = null;
                }
                flag = model.isRetryMode();
                verifyidentityrequest = new com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest();
                if (!"US".equals(address.countryCode)) goto _L2; else goto _L1
_L1:
                verifyidentityrequest.country = Integer.valueOf(1);
                verifyidentityrequest.usKycData = createUsKycData(encryptionsession, address, flag);
_L4:
                return kycClient.verifyIdentity(verifyidentityrequest);
_L2:
                if ("GB".equals(address.countryCode))
                {
                    verifyidentityrequest.country = Integer.valueOf(1);
                    verifyidentityrequest.gbKycData = createGbKycData(address, flag);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            private com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest.GbKycData createGbKycData(com.google.wallet.proto.NanoWalletEntities.Address address, boolean flag)
            {
                com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest.GbKycData gbkycdata = new com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest.GbKycData();
                gbkycdata.firstName = model.getFirstName();
                gbkycdata.lastName = model.getLastName();
                gbkycdata.address = address;
                gbkycdata.dateOfBirth = model.getDateOfBirth();
                byte byte0;
                if (flag)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 1;
                }
                gbkycdata.kycStep = Integer.valueOf(byte0);
                return gbkycdata;
            }

            private com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest.UsKycData createUsKycData(com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession encryptionsession, com.google.wallet.proto.NanoWalletEntities.Address address, boolean flag)
            {
                com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest.UsKycData uskycdata = new com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest.UsKycData();
                uskycdata.firstName = model.getFirstName();
                uskycdata.lastName = model.getLastName();
                uskycdata.address = address;
                uskycdata.dateOfBirth = model.getDateOfBirth();
                byte byte0;
                if (flag)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 1;
                }
                uskycdata.kycStep = Integer.valueOf(byte0);
                address = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                address.sessionMaterial = (String)encryptionsession.getSessionMaterial();
                if (flag)
                {
                    address.payload = (String)encryptionsession.encrypt(model.getSsnFull9());
                    uskycdata.fullSsn = address;
                    return uskycdata;
                } else
                {
                    address.payload = (String)encryptionsession.encrypt(model.getSsnLast4());
                    uskycdata.lastFourSsn = address;
                    return uskycdata;
                }
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
        });
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (!super.onActionFailure(s, callable, exception))
        {
            fullScreenProgressSpinnerManager.hide();
            if ("accept_tos".equals(s))
            {
                AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_accept_tos)).build().show(getActivity().getSupportFragmentManager());
                return true;
            }
            if ("verify_identity".equals(s))
            {
                AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).build().show(getActivity().getSupportFragmentManager());
                return true;
            }
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("accept_tos".equals(s))
        {
            handleAcceptTosSuccess((com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse)obj);
        } else
        {
            if ("verify_identity".equals(s))
            {
                handleVerifyIdentitySuccess((com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityResponse)obj);
                return;
            }
            if ("fetch_preferences".equals(s))
            {
                setP2bCategories(p2bCategories);
                return;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_enter_personal_info_fragment, null);
        instruction = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycInstruction);
        imageBadge = (ImageView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycImageBadge);
        imageCaution = (ImageView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycImageCaution);
        instructionDivider = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycInstructionDivider);
        legalNameInstruction = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycLegalNameInstruction);
        firstName = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycFirstName);
        lastName = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycLastName);
        homeAddressInstruction = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycHomeAddressInstruction);
        addressView = (AddressView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycAddressView);
        addressSpinner = (Spinner)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycAddressSpinner);
        addressView.setNextFocus(com.google.android.apps.walletnfcrel.R.id.KycDateOfBirth);
        dateOfBirth = (ValidatedDatePicker)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycDateOfBirth);
        dateOfBirth.setValidator(DateValidators.NON_NULL);
        dateOfBirth.setHint(getActivity().getString(com.google.android.apps.walletnfcrel.R.string.kyc_hint_birth_day));
        viewgroup = Calendar.getInstance();
        viewgroup.set(viewgroup.get(1) - 30, 0, 1);
        dateOfBirth.setValue(viewgroup);
        ssnSectionHeader = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnSectionHeader);
        ssnSectionBody = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnSectionBody);
        ssnInstruction = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnInstruction);
        fullSsnSection = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycFullSsnSection);
        ssnLast4Section = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnLast4Section);
        ssnSegment1 = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnSegment1);
        ssnSegment2 = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnSegment2);
        ssnSegment3 = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnSegment3);
        ssnLast4 = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycSsnLast4);
        p2bCheckbox = (CheckBox)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.CheckboxP2b);
        p2bProgressBar = (ProgressBar)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.CategoryProgressP2b);
        p2bSpinner = (ValidatedSpinner)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.CategorySpinnerP2b);
        p2bDescription = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.DescriptionP2b);
        verifyButton = (Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.VerifyButton);
        Views.setLink(p2bDescription, getActivity().getString(com.google.android.apps.walletnfcrel.R.string.p2b_description, new Object[] {
            HelpUrls.createP2pBusinessHelpUrl()
        }));
        firstName.setInputType(97);
        lastName.setInputType(97);
        firstName.setValidator(StringValidators.KYC_LEGAL_NAME);
        lastName.setValidator(StringValidators.KYC_LEGAL_NAME);
        dateOfBirth.setValidator(DateValidators.BIRTHDATE);
        ssnSegment1.setValidator(StringValidators.SSN_SEGMENT_1);
        ssnSegment2.setValidator(StringValidators.SSN_SEGMENT_2);
        ssnSegment3.setValidator(StringValidators.SSN_SEGMENT_3);
        ssnLast4.setValidator(StringValidators.SSN_SEGMENT_3);
        verifyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final KycEnterPersonalInfoFragment this$0;

            public final void onClick(View view)
            {
                if (validationGroup.checkForErrors())
                {
                    validationGroup.focusOnFirstError();
                } else
                if (networkAccessChecker.check())
                {
                    saveUserInputsToModel();
                    if (!model.isAllLegalDocumentsAccepted())
                    {
                        showTosDialog();
                        return;
                    } else
                    {
                        fullScreenProgressSpinnerManager.show();
                        verifyIdentity();
                        return;
                    }
                }
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
        });
        addressSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final KycEnterPersonalInfoFragment this$0;

            public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                if (addressAdapter.isAddAddressSelected(i))
                {
                    System.out.println("about to click 1");
                    saveUserInputsToModel();
                    navListener.onRequestNav(KycNavListener.NavState.ENTER_ADDRESS);
                    return;
                } else
                {
                    System.out.println("about to click 2");
                    model.setSelectedAddressIndex(i);
                    return;
                }
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
        });
        p2bCheckbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final KycEnterPersonalInfoFragment this$0;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_82;
                }
                if (p2bCategories == null) goto _L2; else goto _L1
_L1:
                setP2bCategories(p2bCategories);
_L4:
                return;
_L2:
                p2bProgressBar.setVisibility(0);
                p2bSpinner.setVisibility(8);
                if (isActionRunning("fetch_preferences")) goto _L4; else goto _L3
_L3:
                executeAction("fetch_preferences", new Callable() {

                    final _cls3 this$1;

                    private Void call()
                        throws Exception
                    {
                        com.google.wallet.proto.NanoWalletEntities.DisplayableP2pCommercialUses.DisplayableP2pCommercialUse adisplayablep2pcommercialuse[] = preferenceClient.getDisplayableCommercialUses().displaybleP2PCommercialUses;
                        P2bCategory ap2bcategory[] = new P2bCategory[adisplayablep2pcommercialuse.length];
                        for (int i = 0; i < adisplayablep2pcommercialuse.length; i++)
                        {
                            ap2bcategory[i] = new P2bCategory(adisplayablep2pcommercialuse[i]);
                        }

                        p2bCategories = ap2bcategory;
                        return null;
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
                return;
                p2bProgressBar.setVisibility(8);
                p2bSpinner.setVisibility(8);
                validationGroup.removeInput(p2bSpinner);
                return;
            }

            
            {
                this$0 = KycEnterPersonalInfoFragment.this;
                super();
            }
        });
        render();
        return layoutinflater;
    }

    public final void onResume()
    {
        super.onResume();
        if (isActionRunning("accept_tos") || isActionRunning("verify_identity"))
        {
            fullScreenProgressSpinnerManager.showImmediately();
        }
    }

    public final void setKycNavListener(KycNavListener kycnavlistener)
    {
        navListener = kycnavlistener;
    }

    public final void setKycUiModel(KycUiModel kycuimodel)
    {
        model = kycuimodel;
    }









/*
    static P2bCategory[] access$502(KycEnterPersonalInfoFragment kycenterpersonalinfofragment, P2bCategory ap2bcategory[])
    {
        kycenterpersonalinfofragment.p2bCategories = ap2bcategory;
        return ap2bcategory;
    }

*/




}
