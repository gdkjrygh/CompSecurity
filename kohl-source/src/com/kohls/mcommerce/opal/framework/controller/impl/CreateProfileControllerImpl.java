// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.impl;

import android.app.ActionBar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.CMSAdapterPO;
import com.kohls.mcommerce.opal.common.po.CreateProfilePO;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.ServerLogger;
import com.kohls.mcommerce.opal.common.util.StatesWithCode;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ServiceFacade;
import com.kohls.mcommerce.opal.framework.controller.iface.IGeoLocation;
import com.kohls.mcommerce.opal.framework.view.activity.AccountActivity;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.helper.GeoLocationHelper;
import com.kohls.mcommerce.opal.framework.view.adapter.ArrayAdapterWithHint;
import com.kohls.mcommerce.opal.framework.view.adapter.StateSpinnerAdapter;
import com.kohls.mcommerce.opal.framework.view.fragment.AccountFragment;
import com.kohls.mcommerce.opal.framework.vo.CityAndState;
import com.kohls.mcommerce.opal.framework.vo.CreateProfileVO;
import com.kohls.mcommerce.opal.framework.vo.ErrorVO;
import com.kohls.mcommerce.opal.framework.vo.GeoCoderVO;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.framework.vo.ProfileInfo;
import com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO;
import com.kohls.mcommerce.opal.framework.vo.UpdateAccountVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.error.AppException;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.wallet.asynctask.AccountLookupTask;
import com.kohls.mcommerce.opal.wallet.asynctask.CreateLoyaltyProfileTask;
import com.kohls.mcommerce.opal.wallet.asynctask.UpdateLoyaltyProfileTask;
import com.kohls.mcommerce.opal.wallet.fragment.ProgramDetailLinkActivity;
import com.kohls.mcommerce.opal.wallet.manager.DataActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.AccountLookupResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.Address;
import com.kohls.mcommerce.opal.wallet.rest.containers.Customer;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.kohls.mcommerce.opal.framework.controller.impl:
//            BaseControllerImpl

public class CreateProfileControllerImpl extends BaseControllerImpl
    implements android.view.View.OnClickListener, DataActionListener
{
    public static interface ScannerListener
    {

        public abstract void scanDone(String s);
    }

    public static class SelectDateFragment extends DialogFragment
        implements android.app.DatePickerDialog.OnDateSetListener
    {

        private EditText mEditText;

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = Calendar.getInstance();
            bundle.add(1, -13);
            int i = bundle.get(1);
            int j = bundle.get(2);
            int k = bundle.get(5);
            DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(), this, i, j, k);
            datepickerdialog.getDatePicker().setMaxDate(bundle.getTimeInMillis());
            return datepickerdialog;
        }

        public void onDateSet(DatePicker datepicker, int i, int j, int k)
        {
            j++;
            datepicker = (new StringBuilder()).append("").append(j).toString();
            String s = (new StringBuilder()).append("").append(k).toString();
            if (j < 10)
            {
                datepicker = (new StringBuilder()).append("0").append(j).toString();
            }
            if (k < 10)
            {
                s = (new StringBuilder()).append("0").append(k).toString();
            }
            mEditText.setText((new StringBuilder()).append(i).append("-").append(datepicker).append("-").append(s).toString());
        }

        public SelectDateFragment(EditText edittext)
        {
            mEditText = edittext;
        }
    }


    public static final int AUTHENTICATE_USER = 3;
    public static final int CREATE_PROFILE = 1;
    private static final String DATE_PICKER = "DatePicker";
    private static final int EMAIL_EXIST_ERROR = 0;
    private static final int EMAIL_INVALID_ERROR = 2;
    private static final int KOHLS_SECURITY_AND_PRIVACY_POLICY = 0;
    private static final int LEGAL_NOTICES = 2;
    public static final int MIN_LENGTH_NAME = 2;
    public static final int MIN_LENGTH_PASSWORD = 5;
    private static final int SCAN_ICON_HEIGHT = 40;
    private static final int SCAN_ICON_WIDTH = 40;
    private static final int TERMS_AND_CONDITIONS = 3;
    private boolean isCMSAdapterAlreadyCalled;
    private EditText mAddr1EditText;
    private EditText mAddr2EditText;
    ArrayAdapter mArmedForcesStateAdapter;
    private ArrayAdapterWithHint mArmedForcesStatesCategoryAdapter;
    private Spinner mArmedForcesStatesCategorySpinner;
    private Bundle mBundle;
    private EditText mCityEditText;
    private Button mCreateAccountButton;
    private WeakReference mCreateProfileView;
    private final android.widget.TextView.OnEditorActionListener mEditActionListener = new _cls10();
    private String mEmail;
    private EditText mEmailEditText;
    private TextView mEmailEditTextError;
    private LinearLayout mEmailEditTextErrorLayout;
    private LinearLayout mEmailParent;
    private TextView mErrorTextView;
    private EditText mFirstNameEditText;
    private TextView mFirstNameEditTextError;
    private WeakReference mFragment;
    private GeoLocationHelper mGeoHelper;
    private EditText mJoinInStoreBirthday;
    private RadioButton mJoinInStoreRadioButton;
    private LinearLayout mJoinedInStoreSection;
    private EditText mLastNameEditText;
    private TextView mLastNameEditTextError;
    private LinearLayout mLayoutPhysicalCard;
    IGeoLocation mListener;
    private EditText mLoyaltyEmailId;
    private String mLoyaltyId;
    private LinearLayout mLoyaltyParent;
    private Button mLoyaltySave;
    private String mPassword;
    private EditText mPasswordEditText;
    private TextView mPasswordEditTextError;
    private EditText mPhoneNumber;
    private TextView mPhoneNumberEditTextError;
    private String mPhoneNumberType;
    private Spinner mPhoneNumberTypeSpinner;
    private CheckBox mPhysicalCardCheckBox;
    private LinearLayout mPhysicalCardSubLayout;
    private Resources mRes;
    private int mRetryCount;
    private EditText mRetypeEmailEditText;
    private TextView mRetypeEmailEditTextError;
    private EditText mRetypePasswordEditText;
    private TextView mRetypePasswordEditTextError;
    private TextView mRewardIdHelp;
    private EditText mRewardNumberEditText;
    private TextView mRewardNumberError;
    private LinearLayout mRewardPointsLayout;
    private ScrollView mScrollView;
    private String mSelectedArmedForcesStatesCategory;
    private String mSelectedStateCode;
    private com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType mSelectedStateType;
    private TextView mSignInLinkText;
    private EditText mSignMeUpBirthday;
    private CheckBox mSignMeUpForRewardCheckBox;
    private RadioButton mSignMeUpRadioButton;
    ArrayAdapter mStateAdapter;
    private Spinner mStateSpinner;
    private TextView mTapLocateOrEnterTextView;
    private String mUserPhoneNumber;
    private TextView mZipCodeEditTextError;
    private EditText mZipEditText;
    private RadioButton stateArmedForcesRadioButton;
    private RadioButton stateNormalRadioButton;

    public CreateProfileControllerImpl(WeakReference weakreference, WeakReference weakreference1)
    {
        mPhoneNumberType = "MOBILE";
        mSelectedStateCode = "STATE";
        mSelectedArmedForcesStatesCategory = "SELECT_CATEGORY";
        mSelectedStateType = com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES;
        isCMSAdapterAlreadyCalled = false;
        mRetryCount = 0;
        mListener = new _cls11();
        mFragment = weakreference;
        mCreateProfileView = weakreference1;
        mRes = ((AccountFragment)mFragment.get()).getResources();
    }

    private CityAndState getCity(Double double1, Double double2)
    {
        JSONArray jsonarray = new JSONArray();
        CityAndState cityandstate = new CityAndState();
        try
        {
            jsonarray.put(0, String.valueOf(double1));
            jsonarray.put(1, String.valueOf(double2));
            double2 = UtilityMethods.getGeocodeFromAddress(jsonarray.getString(0).concat(",").concat(jsonarray.getString(1)));
            double1 = new WeakHashMap();
            for (double2 = ((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult)double2.getResults().get(0)).getAddress_components().iterator(); double2.hasNext();)
            {
                com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult.AddressComponent addresscomponent = (com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult.AddressComponent)double2.next();
                Iterator iterator = addresscomponent.getTypes().iterator();
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    if (s.equalsIgnoreCase("locality"))
                    {
                        double1.put("locality", addresscomponent.getShort_name());
                        cityandstate.setCity(addresscomponent.getShort_name());
                    }
                    if (s.equalsIgnoreCase("administrative_area_level_1"))
                    {
                        double1.put("administrative_area_level_1", addresscomponent.getShort_name());
                        cityandstate.setState(addresscomponent.getShort_name());
                    }
                }
            }

        }
        // Misplaced declaration of an exception variable
        catch (Double double1)
        {
            double1.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Double double1)
        {
            double1.printStackTrace();
            return cityandstate;
        }
        return cityandstate;
    }

    private String getEmailidFromEditText()
    {
        if (mEmailEditText != null)
        {
            android.text.Editable editable = mEmailEditText.getText();
            if (!TextUtils.isEmpty(editable))
            {
                return editable.toString();
            }
        }
        return "";
    }

    private String getPhoneNumberNumerals(String s)
    {
        return s.replaceAll("[^\\d]", "");
    }

    private View getView()
    {
        return (View)mCreateProfileView.get();
    }

    private void hideErrorTextMessages()
    {
        mFirstNameEditTextError.setVisibility(8);
        mLastNameEditTextError.setVisibility(8);
        mRetypeEmailEditTextError.setVisibility(8);
        mEmailEditTextErrorLayout.setVisibility(8);
        mPasswordEditTextError.setVisibility(8);
        mRetypePasswordEditTextError.setVisibility(8);
        mPhoneNumberEditTextError.setVisibility(8);
        mZipCodeEditTextError.setVisibility(8);
    }

    private void hideGenericErrorMessage()
    {
        mErrorTextView.setVisibility(8);
    }

    private void hideVirtualKeyboard(View view)
    {
        if (view != null)
        {
            ((InputMethodManager)((AccountFragment)mFragment.get()).getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void managePasswordHintTextTypeFace()
    {
        mPasswordEditText.setTypeface(Typeface.DEFAULT);
        mPasswordEditText.setTransformationMethod(new PasswordTransformationMethod());
        mRetypePasswordEditText.setTypeface(Typeface.DEFAULT);
        mRetypePasswordEditText.setTransformationMethod(new PasswordTransformationMethod());
    }

    private void openProgramDetails()
    {
        com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.Properties properties = ((AccountFragment)mFragment.get()).getPropertiesFromLoyaltyHelpVO();
        ((TextView)((AccountFragment)mFragment.get()).getView().findViewById(0x7f0d0217)).setClickable(false);
        if (properties != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(properties.getProgram_details_image()))
            {
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setProgramDetailsHeader(properties.getProgram_details_image());
            }
            if (!TextUtils.isEmpty(properties.getProgram_details_content()))
            {
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setProgramDetailsContent(properties.getProgram_details_content());
            }
            intent.putExtra("pagetitle", ((AccountFragment)mFragment.get()).getString(0x7f080452));
            intent.setClass(((AccountFragment)mFragment.get()).getActivity(), com/kohls/mcommerce/opal/wallet/fragment/ProgramDetailLinkActivity);
            ((AccountFragment)mFragment.get()).getActivity().startActivity(intent);
        }
        ((TextView)((AccountFragment)mFragment.get()).getView().findViewById(0x7f0d0217)).setClickable(true);
    }

    private void processError(Error error)
    {
        if (UtilityMethods.isFragmentVisible(mFragment))
        {
            ((AccountFragment)mFragment.get()).getActivity().runOnUiThread(new _cls7(error));
        }
        if (UtilityMethods.isFragmentVisible(mFragment))
        {
            ((AccountFragment)mFragment.get()).getActivity().runOnUiThread(new _cls8(error));
        }
    }

    private void scrollToBottom()
    {
        mScrollView.fullScroll(130);
    }

    private void scrollToTop()
    {
        mScrollView.fullScroll(33);
        mScrollView.scrollTo(0, 0);
    }

    private void setAdapterAndListener(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType statetype)
    {
        if (statetype == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES)
        {
            if (mStateAdapter == null)
            {
                mStateAdapter = new StateSpinnerAdapter(((AccountFragment)mFragment.get()).getActivity(), 0x1090008, StatesWithCode.getStateList(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES));
            }
            mStateSpinner.setAdapter(mStateAdapter);
            mStateSpinner.setSelection(mStateAdapter.getCount());
        } else
        if (statetype == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES)
        {
            if (mArmedForcesStateAdapter == null)
            {
                mArmedForcesStateAdapter = new StateSpinnerAdapter(((AccountFragment)mFragment.get()).getActivity(), 0x1090008, StatesWithCode.getStateList(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES));
            }
            mStateSpinner.setAdapter(mArmedForcesStateAdapter);
            mStateSpinner.setSelection(mArmedForcesStateAdapter.getCount());
            return;
        }
    }

    private void setAgreementTermsAndConditionsText(TextView textview)
    {
        Object obj = ((AccountFragment)mFragment.get()).getActivity().getResources();
        textview.setText("By signing up for Yes2You Rewards, you are agreeing to the ");
        obj = UtilityMethods.getColorSpanable("Terms and Conditions", ((Resources) (obj)).getColor(0x7f0c0040));
    /* block-local class not found */
    class MyClickableSpan {}

        ((Spannable) (obj)).setSpan(new MyClickableSpan("Terms and Conditions", 3), 0, "Terms and Conditions".length(), 33);
        textview.append(((CharSequence) (obj)));
        textview.append(" of the program and certify that you are over 13 years old.");
        textview.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setArmedForcesCategoryAdapter()
    {
        mArmedForcesStatesCategoryAdapter = new ArrayAdapterWithHint(((AccountFragment)mFragment.get()).getActivity(), 0x1090008, mRes.getStringArray(0x7f0a0002));
        mArmedForcesStatesCategorySpinner.setAdapter(mArmedForcesStatesCategoryAdapter);
        mArmedForcesStatesCategorySpinner.setSelection(mArmedForcesStatesCategoryAdapter.getCount());
    }

    private void setEditTextRightIconListener(EditText edittext, int i, int j, int k)
    {
        Drawable drawable = ((AccountFragment)mFragment.get()).getActivity().getResources().getDrawable(k);
        drawable.setBounds(0, 0, Math.round(i), Math.round(j));
        edittext.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
        edittext.setOnTouchListener(new _cls9(edittext, drawable));
    }

    private void setFormattedText(TextView textview)
    {
        Object obj = ((AccountFragment)mFragment.get()).getActivity().getResources();
        textview.append(" ");
        Spannable spannable = UtilityMethods.getColorSpanable("Kohl's Security & Privacy Policy", ((Resources) (obj)).getColor(0x7f0c0040));
        spannable.setSpan(new MyClickableSpan("Kohl's Security & Privacy Policy", 0), 0, "Kohl's Security & Privacy Policy".length(), 33);
        textview.append(spannable);
        textview.append(" and ");
        obj = UtilityMethods.getColorSpanable("Legal Notices", ((Resources) (obj)).getColor(0x7f0c0040));
        ((Spannable) (obj)).setSpan(new MyClickableSpan("Legal Notices", 2), 0, "Legal Notices".length(), 33);
        textview.append(((CharSequence) (obj)));
        textview.append(".");
        textview.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setStatusCreateAcccountButton()
    {
        String s = mFirstNameEditText.getText().toString();
        String s4 = mLastNameEditText.getText().toString();
        String s8 = mEmailEditText.getText().toString();
        String s10 = mPasswordEditText.getText().toString();
        String s11 = mRetypeEmailEditText.getText().toString();
        String s12 = mRetypePasswordEditText.getText().toString();
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s4) && !TextUtils.isEmpty(s8) && !TextUtils.isEmpty(s10) && !TextUtils.isEmpty(s11) && !TextUtils.isEmpty(s12))
        {
            if (mSignMeUpForRewardCheckBox.isChecked())
            {
                if (mJoinInStoreRadioButton.isChecked())
                {
                    String s1 = mRewardNumberEditText.getText().toString();
                    String s5 = mJoinInStoreBirthday.getText().toString();
                    if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s5))
                    {
                        mCreateAccountButton.setEnabled(false);
                        return;
                    }
                } else
                if (mSignMeUpRadioButton.isChecked())
                {
                    String s2 = mPhoneNumber.getText().toString();
                    String s6 = mSignMeUpBirthday.getText().toString();
                    if (TextUtils.isEmpty(s2) || TextUtils.isEmpty(s6))
                    {
                        mCreateAccountButton.setEnabled(false);
                        return;
                    }
                    if (mPhysicalCardCheckBox.isChecked())
                    {
                        String s3 = mAddr1EditText.getText().toString();
                        String s7 = mCityEditText.getText().toString();
                        String s9 = mZipEditText.getText().toString();
                        if (TextUtils.isEmpty(s3) || TextUtils.isEmpty(s9))
                        {
                            mCreateAccountButton.setEnabled(false);
                            return;
                        }
                        if (stateNormalRadioButton.isChecked() && (mSelectedStateCode.equals("STATE") || TextUtils.isEmpty(s7)))
                        {
                            mCreateAccountButton.setEnabled(false);
                            return;
                        }
                        if (stateArmedForcesRadioButton.isChecked() && (mSelectedArmedForcesStatesCategory.equals("SELECT_CATEGORY") || mSelectedStateCode.equals("STATE")))
                        {
                            mCreateAccountButton.setEnabled(false);
                            return;
                        }
                    }
                }
            }
            mCreateAccountButton.setEnabled(true);
            return;
        } else
        {
            mCreateAccountButton.setEnabled(false);
            return;
        }
    }

    private void showDatePickerDialog(EditText edittext)
    {
        (new SelectDateFragment(edittext)).show(((AccountFragment)mFragment.get()).getFragmentManager(), "DatePicker");
    }

    private void showEditTextUserEntryError(TextView textview, int i)
    {
        textview.setText(mRes.getString(i));
        textview.setVisibility(0);
    }

    private void showEmailEditTextUserEntryErrorMessage(int i, int j)
    {
        mEmailEditTextError.setText(mRes.getString(j));
        mEmailEditTextErrorLayout.setVisibility(0);
        if (i == 2)
        {
            mSignInLinkText.setVisibility(8);
        } else
        if (i == 0)
        {
            mSignInLinkText.setVisibility(0);
            return;
        }
    }

    private void showGenericErrorMessage(String s)
    {
        mErrorTextView.setText(s);
        mErrorTextView.setVisibility(0);
    }

    private void updateLoyaltyInfo(boolean flag, String s)
    {
        ProfileData profiledata;
        profiledata = new ProfileData();
        profiledata.setLoyaltyId(s);
        profiledata.setEmail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        s = new Customer();
        s.setFirstName(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
        s.setLastName(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref());
        profiledata.setCustomerName(s);
        if (!TextUtils.isEmpty(mUserPhoneNumber))
        {
            profiledata.setPhoneNumber(mUserPhoneNumber);
        }
        ListenerManager.getInstance().registerListener(this, "updateloyaltydata");
        if (flag)
        {
            profiledata.setBirthday(mJoinInStoreBirthday.getText().toString());
            (new UpdateLoyaltyProfileTask(((AccountFragment)mFragment.get()).getActivity(), flag)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ProfileData[] {
                profiledata
            });
            return;
        }
        profiledata.setPhoneNumber(getPhoneNumberNumerals(mPhoneNumber.getText().toString()));
        profiledata.setPhoneNumberType(mPhoneNumberType);
        profiledata.setBirthday(mSignMeUpBirthday.getText().toString());
        if (!mPhysicalCardCheckBox.isChecked()) goto _L2; else goto _L1
_L1:
        profiledata.setPostalCode(mZipEditText.getText().toString());
        s = new Address();
        s.setAddr1(mAddr1EditText.getText().toString().trim());
        if (!TextUtils.isEmpty(mAddr2EditText.getText().toString()))
        {
            s.setAddr2(mAddr2EditText.getText().toString().trim());
        }
        if (!stateNormalRadioButton.isChecked()) goto _L4; else goto _L3
_L3:
        s.setCity(mCityEditText.getText().toString());
_L6:
        s.setState(mSelectedStateCode);
        s.setPostalCode(mZipEditText.getText().toString());
        profiledata.setAddress(s);
_L2:
        (new CreateLoyaltyProfileTask(((AccountFragment)mFragment.get()).getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ProfileData[] {
            profiledata
        });
        return;
_L4:
        if (stateArmedForcesRadioButton.isChecked())
        {
            s.setCity(mSelectedArmedForcesStatesCategory);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void createProfile()
    {
        hideGenericErrorMessage();
        hideErrorTextMessages();
        String s = mFirstNameEditText.getText().toString();
        String s1 = mLastNameEditText.getText().toString();
        String s2 = mEmailEditText.getText().toString();
        String s3 = mPasswordEditText.getText().toString();
        String s4 = mRetypeEmailEditText.getText().toString();
        String s5 = mRetypePasswordEditText.getText().toString();
        if (isInputFieldsValidated(s, s1, s2, s4, s3, s5, mRewardNumberEditText.getText().toString()))
        {
            Bundle bundle = new Bundle();
            bundle.putString("key_first_name", s);
            bundle.putString("key_last_name", s1);
            bundle.putString("key_email", s2);
            bundle.putString("key_retype_email", s4);
            bundle.putString("key_password", s3);
            bundle.putString("key_retype_password", s5);
            mErrorTextView.setVisibility(8);
            createProfile(bundle);
        }
    }

    public boolean createProfile(Object obj)
    {
        Object obj1;
        UtilityMethods.hideKeyboard(((AccountFragment)mFragment.get()).getActivity(), ((AccountFragment)mFragment.get()).getActivity().getWindow().getDecorView());
        if (!UtilityMethods.isNetworkConnected(((AccountFragment)mFragment.get()).getActivity().getApplicationContext()))
        {
            ToastUtility.showCustomToastBottom(((AccountFragment)mFragment.get()).getActivity().getResources().getString(0x7f0803cd));
            return true;
        }
        obj = (Bundle)obj;
        obj1 = ((Bundle) (obj)).getString("key_first_name");
        String s = ((Bundle) (obj)).getString("key_last_name");
        obj1 = ((String) (obj1)).trim();
        s = s.trim();
        mEmail = ((Bundle) (obj)).getString("key_email");
        mPassword = ((Bundle) (obj)).getString("key_password");
        obj = new CreateProfilePO();
        com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload.Profile.CustomerName customername = new com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload.Profile.CustomerName();
        customername.setFirstName(((String) (obj1)));
        customername.setLastName(s);
        obj1 = new com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload.Profile();
        ((com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload.Profile) (obj1)).setCustomerName(customername);
        ((com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload.Profile) (obj1)).setEmail(mEmail);
        ((com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload.Profile) (obj1)).setPassword(mPassword);
        if (!mSignMeUpForRewardCheckBox.isChecked() || !mJoinInStoreRadioButton.isChecked()) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(mRewardNumberEditText.getText().toString()))
        {
            Toast.makeText(getView().getContext(), mRes.getString(0x7f080399), 1).show();
            return true;
        }
        if (mRewardNumberEditText.getText().toString().length() != 11) goto _L4; else goto _L3
_L3:
        mLoyaltyId = mRewardNumberEditText.getText().toString();
_L2:
        com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload payload = new com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload();
        payload.setProfile(((com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params.Payload.Profile) (obj1)));
        obj1 = new com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params();
        ((com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params) (obj1)).setPayload(payload);
        ((CreateProfilePO) (obj)).setParams(((com.kohls.mcommerce.opal.common.po.CreateProfilePO.Params) (obj1)));
        UtilityMethods.showKohlsProgressDialog(4002, null, ((AccountFragment)mFragment.get()).getActivity().getString(0x7f0801b6), null, true, false, false, 0, ((AccountFragment)mFragment.get()).getActivity());
        ServiceFacade.executeCreateProfile(((CreateProfilePO) (obj)), this);
        return true;
_L4:
        if (mRewardNumberEditText.getText().toString().length() == 10)
        {
            mUserPhoneNumber = mRewardNumberEditText.getText().toString();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void getCMSAdapterValues()
    {
        if (isCMSAdapterAlreadyCalled)
        {
            return;
        }
    /* block-local class not found */
    class CMSAdapterListener {}

        CMSAdapterPO cmsadapterpo;
        if (UtilityMethods.isNetworkConnected(((AccountFragment)mFragment.get()).getActivity()))
        {
            UtilityMethods.showKohlsProgressDialog(4002, null, ((AccountFragment)mFragment.get()).getActivity().getString(0x7f080436), null, true, false, false, 0, ((AccountFragment)mFragment.get()).getActivity());
        } else
        {
            ToastUtility.showCustomToastBottom(((AccountFragment)mFragment.get()).getActivity().getResources().getString(0x7f0803cd));
        }
        cmsadapterpo = new CMSAdapterPO();
        cmsadapterpo.setCampaignName("miscCampaign");
        cmsadapterpo.setPageName("loyaltyhelp");
        (new AdapterHelper(AdapterProcedure.CMS_LOYALTY_HELP, cmsadapterpo, new CMSAdapterListener(null))).performTask();
        cmsadapterpo = new CMSAdapterPO();
        cmsadapterpo.setCampaignName("miscCampaign");
        cmsadapterpo.setPageName("helpcontactus");
        (new AdapterHelper(AdapterProcedure.CMS_HELP_AND_CONTACT_US, cmsadapterpo, new CMSAdapterListener(null))).performTask();
    }

    public Error getPayloadError(IValueObject ivalueobject)
    {
        if (ivalueobject instanceof CreateProfileVO)
        {
            ivalueobject = (CreateProfileVO)ivalueobject;
            if (ivalueobject.getErrors() != null && ivalueobject.getErrors().size() > 0)
            {
                return new Error(((com.kohls.mcommerce.opal.framework.vo.CreateProfileVO.Errors)ivalueobject.getErrors().get(0)).getCode(), ((com.kohls.mcommerce.opal.framework.vo.CreateProfileVO.Errors)ivalueobject.getErrors().get(0)).getMessage(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
            }
        } else
        if (ivalueobject instanceof SignInAndProfileVO)
        {
            ivalueobject = (SignInAndProfileVO)ivalueobject;
            if (ivalueobject.getErrors() != null)
            {
                Object obj = ivalueobject.getErrors();
                if (((List) (obj)).size() > 0)
                {
                    obj = (com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors)((List) (obj)).get(0);
                    ServerLogger.error(AdapterProcedure.SIGNIN_AND_PROFILE.getProcedureName(), UtilityMethods.getSinInProfileLoggerReuest(getEmailidFromEditText()), ((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors)ivalueobject.getErrors().get(0)).getCode());
                    if (((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors) (obj)).getCode() != null)
                    {
                        ivalueobject = ((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors) (obj)).getCode();
                    } else
                    {
                        ivalueobject = ((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors) (obj)).getErrorCode();
                    }
                    if (((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors) (obj)).getMessage() != null)
                    {
                        obj = ((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors) (obj)).getMessage();
                    } else
                    {
                        obj = ((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors) (obj)).getError();
                    }
                    return new Error(ivalueobject, ((String) (obj)), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
                }
            }
            if (ivalueobject.getPayload() != null && ivalueobject.getPayload().getErrorCode() != null && ivalueobject.getPayload().getError() != null)
            {
                ServerLogger.error(AdapterProcedure.SIGNIN_AND_PROFILE.getProcedureName(), UtilityMethods.getSinInProfileLoggerReuest(getEmailidFromEditText()), ((com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors)ivalueobject.getErrors().get(0)).getCode());
                return new Error(ivalueobject.getPayload().getErrorCode(), ivalueobject.getPayload().getError(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
            }
        }
        return null;
    }

    public void initializeViews(Bundle bundle)
    {
        mBundle = bundle;
        bundle = (TextView)((AccountFragment)mFragment.get()).getView().findViewById(0x7f0d0208);
        Object obj = (TextView)((AccountFragment)mFragment.get()).getView().findViewById(0x7f0d0096);
        setFormattedText(bundle);
        setAgreementTermsAndConditionsText(((TextView) (obj)));
        ((TextView)getView().findViewById(0x7f0d0217)).setOnClickListener(this);
        mFirstNameEditText = (EditText)getView().findViewById(0x7f0d0209);
        mLastNameEditText = (EditText)getView().findViewById(0x7f0d020b);
        mEmailEditText = (EditText)getView().findViewById(0x7f0d020d);
        mRetypeEmailEditText = (EditText)getView().findViewById(0x7f0d0211);
        mPasswordEditText = (EditText)getView().findViewById(0x7f0d0213);
        mRetypePasswordEditText = (EditText)getView().findViewById(0x7f0d0215);
        mCreateAccountButton = (Button)getView().findViewById(0x7f0d0097);
        mCreateAccountButton.setOnClickListener(this);
        mJoinedInStoreSection = (LinearLayout)getView().findViewById(0x7f0d007c);
        mErrorTextView = (TextView)getView().findViewById(0x7f0d0207);
    /* block-local class not found */
    class EditTextWatcher {}

        bundle = new EditTextWatcher(null);
        mFirstNameEditText.addTextChangedListener(bundle);
        mLastNameEditText.addTextChangedListener(bundle);
        mEmailEditText.addTextChangedListener(bundle);
        mRetypeEmailEditText.addTextChangedListener(bundle);
        mPasswordEditText.addTextChangedListener(bundle);
        mRetypePasswordEditText.addTextChangedListener(bundle);
        mRetypePasswordEditText.setOnEditorActionListener(mEditActionListener);
        mCreateAccountButton.setEnabled(false);
        mJoinInStoreBirthday = (EditText)getView().findViewById(0x7f0d007f);
        mJoinInStoreBirthday.setOnClickListener(this);
        mJoinInStoreBirthday.addTextChangedListener(bundle);
        mSignMeUpBirthday = (EditText)getView().findViewById(0x7f0d0087);
        mSignMeUpBirthday.setOnClickListener(this);
        mSignMeUpBirthday.addTextChangedListener(bundle);
        mPhoneNumber = (EditText)getView().findViewById(0x7f0d0085);
        mScrollView = (ScrollView)getView().findViewById(0x7f0d0206);
    /* block-local class not found */
    class UsPhoneNumberFormatter {}

        obj = new UsPhoneNumberFormatter(new WeakReference(mPhoneNumber));
        mPhoneNumber.addTextChangedListener(((android.text.TextWatcher) (obj)));
        mPhoneNumber.addTextChangedListener(bundle);
        mArmedForcesStatesCategorySpinner = (Spinner)getView().findViewById(0x7f0d0091);
        mArmedForcesStatesCategorySpinner.setVisibility(8);
    /* block-local class not found */
    class ArmedForcesStatesSpinnerItemSelectionListener {}

        mArmedForcesStatesCategorySpinner.setOnItemSelectedListener(new ArmedForcesStatesSpinnerItemSelectionListener(null));
        mStateSpinner = (Spinner)getView().findViewById(0x7f0d0093);
        setAdapterAndListener(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES);
    /* block-local class not found */
    class SpinnerItemSelectionListener {}

        mStateSpinner.setOnItemSelectedListener(new SpinnerItemSelectionListener(null));
    /* block-local class not found */
    class RadioGroupListener {}

        ((RadioGroup)getView().findViewById(0x7f0d008b)).setOnCheckedChangeListener(new RadioGroupListener(null));
        stateNormalRadioButton = (RadioButton)getView().findViewById(0x7f0d008c);
        stateArmedForcesRadioButton = (RadioButton)getView().findViewById(0x7f0d008d);
        ((ImageView)getView().findViewById(0x7f0d0088)).setOnClickListener(this);
        ((ImageView)getView().findViewById(0x7f0d0080)).setOnClickListener(this);
        mEmailEditTextErrorLayout = (LinearLayout)getView().findViewById(0x7f0d020e);
        mEmailEditTextError = (TextView)getView().findViewById(0x7f0d020f);
        mSignInLinkText = (TextView)getView().findViewById(0x7f0d0210);
        mSignInLinkText.setOnClickListener(this);
        mSignMeUpForRewardCheckBox = (CheckBox)getView().findViewById(0x7f0d0218);
        mRewardPointsLayout = (LinearLayout)getView().findViewById(0x7f0d007a);
        mRewardPointsLayout.setVisibility(8);
        mSignMeUpRadioButton = (RadioButton)getView().findViewById(0x7f0d0081);
        mJoinInStoreRadioButton = (RadioButton)getView().findViewById(0x7f0d007b);
        mLayoutPhysicalCard = (LinearLayout)getView().findViewById(0x7f0d0083);
        mRewardNumberEditText = (EditText)getView().findViewById(0x7f0d007d);
        mRewardNumberEditText.addTextChangedListener(bundle);
        mEmailParent = (LinearLayout)getView().findViewById(0x7f0d0070);
        mEmailParent.setOnClickListener(this);
        mLoyaltyEmailId = (EditText)getView().findViewById(0x7f0d0270);
        mLoyaltySave = (Button)getView().findViewById(0x7f0d0271);
        mLoyaltySave.setOnClickListener(this);
        mLoyaltyParent = (LinearLayout)getView().findViewById(0x7f0d0071);
        mPhysicalCardCheckBox = (CheckBox)getView().findViewById(0x7f0d0089);
        mPhysicalCardSubLayout = (LinearLayout)getView().findViewById(0x7f0d008a);
        setEditTextRightIconListener(mRewardNumberEditText, 40, 40, 0x7f0201a8);
        mTapLocateOrEnterTextView = (TextView)getView().findViewById(0x7f0d0090);
        mCityEditText = (EditText)getView().findViewById(0x7f0d0092);
        setEditTextRightIconListener(mCityEditText, 40, 40, 0x7f020052);
        mAddr1EditText = (EditText)getView().findViewById(0x7f0d008e);
        mAddr1EditText.addTextChangedListener(bundle);
        mAddr2EditText = (EditText)getView().findViewById(0x7f0d008f);
        mAddr2EditText.addTextChangedListener(bundle);
        mCityEditText = (EditText)getView().findViewById(0x7f0d0092);
        mCityEditText.addTextChangedListener(bundle);
        mZipEditText = (EditText)getView().findViewById(0x7f0d0094);
        mZipEditText.addTextChangedListener(bundle);
        mFirstNameEditTextError = (TextView)getView().findViewById(0x7f0d020a);
        mLastNameEditTextError = (TextView)getView().findViewById(0x7f0d020c);
        mRetypeEmailEditTextError = (TextView)getView().findViewById(0x7f0d0212);
        mPasswordEditTextError = (TextView)getView().findViewById(0x7f0d0214);
        mRetypePasswordEditTextError = (TextView)getView().findViewById(0x7f0d0216);
        mPhoneNumberEditTextError = (TextView)getView().findViewById(0x7f0d0086);
        mRewardIdHelp = (TextView)getView().findViewById(0x7f0d021a);
        mZipCodeEditTextError = (TextView)getView().findViewById(0x7f0d0095);
        mRewardNumberError = (TextView)getView().findViewById(0x7f0d0219);
        mRewardIdHelp.setOnClickListener(new _cls1());
        mSignMeUpForRewardCheckBox.setOnCheckedChangeListener(new _cls2());
        mJoinInStoreRadioButton.setOnCheckedChangeListener(new _cls3());
        mSignMeUpRadioButton.setOnCheckedChangeListener(new _cls4());
        mPhysicalCardCheckBox.setOnCheckedChangeListener(new _cls5());
        mPhoneNumberTypeSpinner = (Spinner)getView().findViewById(0x7f0d0084);
        mPhoneNumberTypeSpinner.setOnItemSelectedListener(new _cls6());
        managePasswordHintTextTypeFace();
        ((AccountFragment)mFragment.get()).getActivity().getWindow().setSoftInputMode(3);
    }

    public boolean isInputFieldsValidated(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        ArrayList arraylist = new ArrayList();
        if (s.length() < 2)
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080205));
            showEditTextUserEntryError(mFirstNameEditTextError, 0x7f080205);
        }
        if (s1.length() < 2)
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080205));
            showEditTextUserEntryError(mLastNameEditTextError, 0x7f080205);
        }
        if (!UtilityMethods.isValidUserName(s))
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080205));
            showEditTextUserEntryError(mFirstNameEditTextError, 0x7f080205);
        }
        if (!UtilityMethods.isValidUserName(s1))
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f08024b));
            showEditTextUserEntryError(mLastNameEditTextError, 0x7f08024b);
        }
        if (!s2.equals(s3))
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080204));
            showEditTextUserEntryError(mRetypeEmailEditTextError, 0x7f080204);
        }
        if (!UtilityMethods.isEmailValid(s2))
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080203));
            showEmailEditTextUserEntryErrorMessage(2, 0x7f080203);
        }
        if (!UtilityMethods.isEmailValid(s3))
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080202));
            showEditTextUserEntryError(mRetypeEmailEditTextError, 0x7f080202);
        }
        if (!s4.equals(s5))
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080206));
            showEditTextUserEntryError(mRetypePasswordEditTextError, 0x7f080206);
        }
        if (s4.length() < 5)
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080207));
            showEditTextUserEntryError(mPasswordEditTextError, 0x7f080207);
        }
        if (s5.length() < 5)
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080207));
            showEditTextUserEntryError(mRetypePasswordEditTextError, 0x7f080207);
        }
        if (mSignMeUpForRewardCheckBox.isChecked())
        {
            if (mSignMeUpRadioButton.isChecked() && getPhoneNumberNumerals(mPhoneNumber.getText().toString()).length() < 10)
            {
                arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080208));
                showEditTextUserEntryError(mPhoneNumberEditTextError, 0x7f080208);
            }
            if (mPhysicalCardCheckBox.isChecked() && mZipEditText.getText().toString().length() != 5)
            {
                arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f08020a));
                showEditTextUserEntryError(mZipCodeEditTextError, 0x7f08020a);
            }
        }
        if (mSignMeUpForRewardCheckBox.isChecked() && mJoinInStoreRadioButton.isChecked() && (s6.length() < 10 || s6.length() > 11))
        {
            arraylist.add(((AccountFragment)mFragment.get()).getActivity().getString(0x7f080484));
            showEditTextUserEntryError(mRewardNumberError, 0x7f080484);
        }
        if (!arraylist.isEmpty())
        {
            showGenericErrorMessage(mRes.getString(0x7f080244));
            scrollToTop();
            return false;
        } else
        {
            return true;
        }
    }

    public void onActionPerformed(Object obj)
    {
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        if (!(obj instanceof AccountLookupResponse)) goto _L2; else goto _L1
_L1:
        AccountLookupResponse accountlookupresponse = (AccountLookupResponse)obj;
        if (accountlookupresponse.isSuccess() || accountlookupresponse.getErrors() == null || accountlookupresponse.getErrors().size() <= 0 || TextUtils.isEmpty(((ErrorResponse)accountlookupresponse.getErrors().get(0)).getMessage())) goto _L4; else goto _L3
_L3:
        Toast.makeText(KohlsPhoneApplication.getInstance(), ((ErrorResponse)accountlookupresponse.getErrors().get(0)).getMessage(), 3500).show();
_L6:
        return;
_L4:
        if (TextUtils.isEmpty(((AccountLookupResponse)obj).getEmailId()) || ((AccountLookupResponse)obj).getEmailId().equalsIgnoreCase(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref()))
        {
            updateLoyaltyInfo(true, accountlookupresponse.getLoyaltyId());
            return;
        } else
        {
            UtilityMethods.dismissDialog(4002);
            mEmailParent.setVisibility(0);
            mLoyaltyParent.setTag(((AccountLookupResponse)obj).getEmailId());
            mLoyaltyParent.setVisibility(8);
            mLoyaltyId = ((AccountLookupResponse)obj).getLoyaltyId();
            UtilityMethods.dismissDialog(4002);
            mEmailParent.setVisibility(0);
            mLoyaltyEmailId.setTag(((AccountLookupResponse)obj).getEmailId());
            mLoyaltyParent.setVisibility(8);
            return;
        }
_L2:
        if (!(obj instanceof LoyaltyProfileResponse)) goto _L6; else goto _L5
_L5:
        obj = (LoyaltyProfileResponse)obj;
        if (obj != null && ((LoyaltyProfileResponse) (obj)).isSuccess())
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().updateProfile(((LoyaltyProfileResponse) (obj)).getProfile().getLoyaltyId(), this);
        }
        showConfirmationPage(((LoyaltyProfileResponse) (obj)).getProfile().getLoyaltyId());
        return;
        showConfirmationPage(null);
        return;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131558551: 
            createProfile();
            return;

        case 2131558527: 
            showDatePickerDialog(mJoinInStoreBirthday);
            return;

        case 2131558535: 
            showDatePickerDialog(mSignMeUpBirthday);
            return;

        case 2131558536: 
            Toast.makeText(getView().getContext(), mRes.getString(0x7f080180), 1).show();
            return;

        case 2131558528: 
            Toast.makeText(getView().getContext(), mRes.getString(0x7f080180), 1).show();
            return;

        case 2131558928: 
            ((AccountFragment)mFragment.get()).setViewPagerIndex(AccountFragment.TAB_SIGN_IN_INDEX);
            return;

        case 2131558935: 
            openProgramDetails();
            return;

        case 2131559025: 
            break;
        }
        if (mRetryCount < 3)
        {
            mRetryCount = mRetryCount + 1;
            view = mLoyaltyEmailId.getTag().toString();
            if (Patterns.EMAIL_ADDRESS.matcher(view).matches())
            {
                if (mLoyaltyEmailId.getText().toString().equalsIgnoreCase(view))
                {
                    UtilityMethods.showKohlsProgressDialog(4002, null, ((AccountFragment)mFragment.get()).getString(0x7f080436), null, true, false, false, 0, ((AccountFragment)mFragment.get()).getActivity());
                    hideVirtualKeyboard(mLoyaltyEmailId);
                    updateLoyaltyInfo(true, mLoyaltyId);
                    return;
                } else
                {
                    Toast.makeText(((AccountFragment)mFragment.get()).getActivity(), ((AccountFragment)mFragment.get()).getString(0x7f0801e7), 1).show();
                    return;
                }
            } else
            {
                Toast.makeText(((AccountFragment)mFragment.get()).getActivity(), "Please use the correct format for your email address.", 1).show();
                return;
            }
        } else
        {
            Toast.makeText(((AccountFragment)mFragment.get()).getActivity(), "Your Kohls.com account has been created (yay!) but we're having trouble with Rewards. Please try again or Call Kohl's Customer Service at 855-564-5751 for assistance", 1).show();
            mEmailParent.setVisibility(8);
            mLoyaltyParent.setVisibility(0);
            hideVirtualKeyboard(mLoyaltyEmailId);
            mRetryCount = 0;
            return;
        }
    }

    public void onFailure(Error error)
    {
        processError(error);
    }

    public void onSuccess(IValueObject ivalueobject)
    {
        if (ivalueobject == null || !(ivalueobject instanceof UpdateAccountVO)) goto _L2; else goto _L1
_L1:
        ivalueobject = (UpdateAccountVO)ivalueobject;
        if (ivalueobject.getErrors() == null || ivalueobject.getErrors().isEmpty() || mFragment == null || mFragment.get() == null || ((AccountFragment)mFragment.get()).getActivity() == null || ((AccountFragment)mFragment.get()).getActivity().getActionBar() == null) goto _L4; else goto _L3
_L3:
        ToastUtility.showCustomToast(((AccountFragment)mFragment.get()).getActivity().getActionBar().getHeight(), ((ErrorVO)ivalueobject.getErrors().get(0)).getMessage());
_L6:
        return;
_L4:
        showConfirmationPage(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref());
        return;
_L2:
        if (ivalueobject != null && (ivalueobject instanceof CreateProfileVO))
        {
            ivalueobject = (CreateProfileVO)ivalueobject;
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().authenticateUser(mEmail, mPassword, this);
            return;
        }
        if (ivalueobject == null || !(ivalueobject instanceof SignInAndProfileVO)) goto _L6; else goto _L5
_L5:
        ivalueobject = (SignInAndProfileVO)ivalueobject;
        if (ivalueobject.getPayload() == null || ivalueobject.getPayload().getResponse() == null) goto _L6; else goto _L7
_L7:
        ProfileInfo profileinfo;
        com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Payload.Response.SignIn signin = ivalueobject.getPayload().getResponse().getSignIn();
        profileinfo = ivalueobject.getPayload().getResponse().getProfileInfo();
        String s = profileinfo.getCustomerName().getFirstName();
        String s1 = profileinfo.getCustomerName().getLastName();
        com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Payload.Response.WalletInfo walletinfo = ivalueobject.getPayload().getResponse().getWallet();
        long l = Long.parseLong(signin.getExpires_in());
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().setUserSignInStatus(true);
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().saveUserCredentialsAndInfo(signin.getAccess_token(), signin.getRefresh_token(), s, l, profileinfo.getEmail(), profileinfo, UtilityMethods.getMD5HexString(UtilityMethods.getUserTokenString(profileinfo.getCustomerName().getFirstName(), profileinfo.getCustomerName().getLastName(), profileinfo.getEmail(), ivalueobject.getExpiryTime())), ivalueobject.getExpiryTime(), profileinfo.getId(), s1, profileinfo.getLoyaltyId(), walletinfo.getHash(), walletinfo.getTimestamp());
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().setUserName(s);
        UtilityMethods.startGetCart();
        if (!mSignMeUpForRewardCheckBox.isChecked())
        {
            break MISSING_BLOCK_LABEL_574;
        }
        if (!mJoinInStoreRadioButton.isChecked())
        {
            continue; /* Loop/switch isn't completed */
        }
        ListenerManager.getInstance().registerListener(this, "account_data");
        if (mRewardNumberEditText.getText().toString().length() == 11)
        {
            (new AccountLookupTask(((AccountFragment)mFragment.get()).getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                mRewardNumberEditText.getText().toString(), null, null
            });
            return;
        }
        if (mRewardNumberEditText.getText().toString().length() != 10) goto _L6; else goto _L8
_L8:
        (new AccountLookupTask(((AccountFragment)mFragment.get()).getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
            null, null, mRewardNumberEditText.getText().toString()
        });
        return;
        if (!mSignMeUpRadioButton.isChecked()) goto _L6; else goto _L9
_L9:
        mUserPhoneNumber = getPhoneNumberNumerals(mPhoneNumber.getText().toString());
        updateLoyaltyInfo(false, null);
        return;
        showConfirmationPage(profileinfo.getLoyaltyId());
        return;
    }

    void showConfirmationPage(String s)
    {
label0:
        {
            UtilityMethods.dismissDialog(4002);
            if (mFragment.get() != null && ((AccountFragment)mFragment.get()).getActivity() != null && !((AccountFragment)mFragment.get()).isRemoving())
            {
                if (!mBundle.getBoolean("show_create_account_with_no_tab"))
                {
                    break label0;
                }
                s = new Intent();
                s.setClass(((AccountFragment)mFragment.get()).getActivity(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                s.setFlags(0x4000000);
                ((AccountFragment)mFragment.get()).startActivity(s);
                ((AccountFragment)mFragment.get()).getActivity().finish();
            }
            return;
        }
        Bundle bundle = ((AccountFragment)mFragment.get()).getArguments();
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("enrolled", flag);
        ((AccountActivity)((AccountFragment)mFragment.get()).getActivity()).attachCreateProfileConfirmationFragment(bundle);
    }

    public void showError(List list)
    {
        if (list != null && !list.isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder();
            String s;
            for (list = list.iterator(); list.hasNext(); stringbuilder.append(s))
            {
                s = (String)list.next();
                if (!TextUtils.isEmpty(stringbuilder.toString()))
                {
                    stringbuilder.append("\n");
                }
            }

            showGenericErrorMessage(stringbuilder.toString());
        }
    }





/*
    static String access$1302(CreateProfileControllerImpl createprofilecontrollerimpl, String s)
    {
        createprofilecontrollerimpl.mPhoneNumberType = s;
        return s;
    }

*/


/*
    static boolean access$1502(CreateProfileControllerImpl createprofilecontrollerimpl, boolean flag)
    {
        createprofilecontrollerimpl.isCMSAdapterAlreadyCalled = flag;
        return flag;
    }

*/








/*
    static GeoLocationHelper access$2102(CreateProfileControllerImpl createprofilecontrollerimpl, GeoLocationHelper geolocationhelper)
    {
        createprofilecontrollerimpl.mGeoHelper = geolocationhelper;
        return geolocationhelper;
    }

*/




/*
    static com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType access$2402(CreateProfileControllerImpl createprofilecontrollerimpl, com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType statetype)
    {
        createprofilecontrollerimpl.mSelectedStateType = statetype;
        return statetype;
    }

*/





/*
    static String access$2802(CreateProfileControllerImpl createprofilecontrollerimpl, String s)
    {
        createprofilecontrollerimpl.mSelectedStateCode = s;
        return s;
    }

*/


/*
    static String access$2902(CreateProfileControllerImpl createprofilecontrollerimpl, String s)
    {
        createprofilecontrollerimpl.mSelectedArmedForcesStatesCategory = s;
        return s;
    }

*/















    // Unreferenced inner class com/kohls/mcommerce/opal/framework/controller/impl/CreateProfileControllerImpl$CustomScannerListener
    /* block-local class not found */
    class CustomScannerListener {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/controller/impl/CreateProfileControllerImpl$GeocodeTask
    /* block-local class not found */
    class GeocodeTask {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}

}
