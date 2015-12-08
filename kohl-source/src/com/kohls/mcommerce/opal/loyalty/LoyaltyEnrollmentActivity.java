// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.TokenRegisrationPO;
import com.kohls.mcommerce.opal.common.util.ServerLogger;
import com.kohls.mcommerce.opal.common.util.StatesWithCode;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.common.value.ConstantValues;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenListener;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ScanActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ScanHelpActivity;
import com.kohls.mcommerce.opal.framework.view.adapter.ArrayAdapterWithHint;
import com.kohls.mcommerce.opal.framework.view.adapter.StateSpinnerAdapter;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.vo.CityAndState;
import com.kohls.mcommerce.opal.framework.vo.ErrorVO;
import com.kohls.mcommerce.opal.framework.vo.GeoCoderVO;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO;
import com.kohls.mcommerce.opal.framework.vo.UpdateAccountVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.error.AppException;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wallet.asynctask.AccountLookupTask;
import com.kohls.mcommerce.opal.wallet.asynctask.CreateLoyaltyProfileTask;
import com.kohls.mcommerce.opal.wallet.asynctask.UpdateLoyaltyProfileTask;
import com.kohls.mcommerce.opal.wallet.fragment.LinkActivity;
import com.kohls.mcommerce.opal.wallet.manager.DataActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.AccountLookupResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.Address;
import com.kohls.mcommerce.opal.wallet.rest.containers.Customer;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            CMSDataRetriver

public class LoyaltyEnrollmentActivity extends BaseFragment
    implements android.view.View.OnClickListener, LocationListener, DataActionListener, IAdapterListener, IRefreshTokenListener
{
    private class ArmedForcesStatesSpinnerItemSelectionListener
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final LoyaltyEnrollmentActivity this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            mSelectedArmedForcesStatesCategory = mArmedForcesStatesCategoryAdapter.getItem(i);
            setStatusCreateAcccountButton();
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        private ArmedForcesStatesSpinnerItemSelectionListener()
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
        }

    }

    private class CustomScannerListener
        implements ScannerListener
    {

        final LoyaltyEnrollmentActivity this$0;

        public void scanDone(String s)
        {
            mRewardNumberEditText.setText(s);
        }

        private CustomScannerListener()
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
        }

    }

    private class EditTextWatcher
        implements TextWatcher
    {

        final LoyaltyEnrollmentActivity this$0;

        public void afterTextChanged(Editable editable)
        {
            setStatusCreateAcccountButton();
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        private EditTextWatcher()
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
        }

    }

    private class GeocodeTask extends AsyncTask
    {

        final LoyaltyEnrollmentActivity this$0;

        protected transient CityAndState doInBackground(Double adouble[])
        {
            return getCity(adouble[0], adouble[1]);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Double[])aobj);
        }

        protected void onPostExecute(CityAndState cityandstate)
        {
            UtilityMethods.dismissDialog(4002);
            if (cityandstate == null || TextUtils.isEmpty(cityandstate.getCity()) && TextUtils.isEmpty(cityandstate.getState()))
            {
                UtilityMethods.showToast(getActivity(), getResources().getString(0x7f08019b), 1);
            } else
            {
                mCityEditText.setText(cityandstate.getCity());
                int i;
                if (mSelectedStateType == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES)
                {
                    i = Arrays.binarySearch(ConstantValues.STATES_CODE, cityandstate.getState());
                } else
                {
                    i = Arrays.binarySearch(ConstantValues.ARMED_FORCE_STATES_CODE, cityandstate.getState());
                }
                mStateSpinner.setSelection(Math.abs(i), true);
            }
            super.onPostExecute(cityandstate);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((CityAndState)obj);
        }

        private GeocodeTask()
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
        }

    }

    class MyClickableSpan extends ClickableSpan
    {

        final LoyaltyEnrollmentActivity this$0;
        private int type;

        public void onClick(View view)
        {
            type;
            JVM INSTR tableswitch 3 3: default 24
        //                       3 25;
               goto _L1 _L2
_L1:
            return;
_L2:
            if ((view = mCmsDataRetriver.getPropertiesFromLoyaltyHelpVO()) != null)
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("linkurl", view.getTerms_and_conditions());
                intent.putExtra("pagetitle", getResources().getString(0x7f08051a));
                intent.setClass(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/LinkActivity);
                startActivity(intent);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void updateDrawState(TextPaint textpaint)
        {
            textpaint.setColor(getActivity().getResources().getColor(0x7f0c0040));
            textpaint.setUnderlineText(true);
        }

        public MyClickableSpan(String s, int i)
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
            type = i;
        }
    }

    private class RadioGroupListener
        implements android.widget.RadioGroup.OnCheckedChangeListener
    {

        final LoyaltyEnrollmentActivity this$0;

        public void onCheckedChanged(RadioGroup radiogroup, int i)
        {
            switch (i)
            {
            default:
                return;

            case 2131558540: 
                setAdapterAndListener(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES);
                mSelectedStateType = com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES;
                mAddr1EditText.setHint(getString(0x7f0804f3));
                mAddr2EditText.setHint(getString(0x7f08016a));
                mCityEditText.setVisibility(0);
                mTapLocateOrEnterTextView.setVisibility(0);
                mArmedForcesStatesCategorySpinner.setVisibility(8);
                setStatusCreateAcccountButton();
                return;

            case 2131558541: 
                setAdapterAndListener(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES);
                break;
            }
            mSelectedStateType = com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES;
            mAddr1EditText.setHint(getString(0x7f08015a));
            mAddr2EditText.setHint(getString(0x7f08015c));
            mCityEditText.setVisibility(8);
            mTapLocateOrEnterTextView.setVisibility(8);
            setArmedForcesCategoryAdapter();
            mArmedForcesStatesCategorySpinner.setVisibility(0);
            mSelectedStateCode = "STATE";
            setStatusCreateAcccountButton();
        }

        private RadioGroupListener()
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
        }

    }

    public static interface ScannerListener
    {

        public abstract void scanDone(String s);
    }

    private class SpinnerItemSelectionListener
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final LoyaltyEnrollmentActivity this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            if (mSelectedStateType != com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES) goto _L2; else goto _L1
_L1:
            mSelectedStateCode = ConstantValues.STATES_CODE[i];
_L4:
            setStatusCreateAcccountButton();
            return;
_L2:
            if (mSelectedStateType == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES)
            {
                mSelectedStateCode = ConstantValues.ARMED_FORCE_STATES_CODE[i];
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        private SpinnerItemSelectionListener()
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
        }

    }

    private class UsPhoneNumberFormatter
        implements TextWatcher
    {

        private boolean clearFlag;
        private boolean mFormatting;
        private String mLastBeforeText;
        private int mLastStartLocation;
        private WeakReference mWeakEditText;
        final LoyaltyEnrollmentActivity this$0;

        private String formatUsNumber(Editable editable)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (int i = 0; i < editable.length();)
            {
                if (!Character.isDigit(editable.charAt(i)))
                {
                    editable.delete(i, i + 1);
                } else
                {
                    i++;
                }
            }

            String s = editable.toString();
            int l = s.length();
            if (l == 0 || l > 10 && !s.startsWith("1") || l > 11)
            {
                editable.clear();
                editable.append(s);
                return s;
            }
            int j = 0;
            if (s.equals("1") && clearFlag)
            {
                editable.clear();
                clearFlag = false;
                return "";
            }
            if (l - 0 > 3)
            {
                stringbuilder.append((new StringBuilder()).append("(").append(s.substring(0, 3)).append(") ").toString());
                j = 0 + 3;
            }
            int k = j;
            if (l - j > 3)
            {
                stringbuilder.append((new StringBuilder()).append(s.substring(j, j + 3)).append("-").toString());
                k = j + 3;
            }
            if (l > k)
            {
                stringbuilder.append(s.substring(k));
            }
            editable.clear();
            editable.append(stringbuilder.toString());
            return stringbuilder.toString();
        }

        public void afterTextChanged(Editable editable)
        {
            if (!mFormatting)
            {
                mFormatting = true;
                int i = mLastStartLocation;
                String s = mLastBeforeText;
                String s1 = editable.toString();
                editable = formatUsNumber(editable);
                if (s1.length() > s.length())
                {
                    i = editable.length() - (s.length() - i);
                    editable = (EditText)mWeakEditText.get();
                    if (i < 0)
                    {
                        i = 0;
                    }
                    editable.setSelection(i);
                } else
                {
                    int j = editable.length() - (s1.length() - i);
                    i = j;
                    if (j > 0)
                    {
                        i = j;
                        if (!Character.isDigit(editable.charAt(j - 1)))
                        {
                            i = j - 1;
                        }
                    }
                    editable = (EditText)mWeakEditText.get();
                    if (i < 0)
                    {
                        i = 0;
                    }
                    editable.setSelection(i);
                }
                mFormatting = false;
            }
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (k == 0 && charsequence.toString().equals("1 "))
            {
                clearFlag = true;
            }
            mLastStartLocation = i;
            mLastBeforeText = charsequence.toString();
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public UsPhoneNumberFormatter(WeakReference weakreference)
        {
            this$0 = LoyaltyEnrollmentActivity.this;
            super();
            mWeakEditText = weakreference;
        }
    }


    private static final String DATE_PICKER = "DatePicker";
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 0L;
    private static final long MIN_TIME_BW_UPDATES = 0L;
    public static final int RESULT_OK = -1;
    private static final int SCAN_ICON_HEIGHT = 40;
    private static final int SCAN_ICON_WIDTH = 40;
    private static final int TERMS_AND_CONDITIONS = 3;
    protected final String TAG = getClass().getSimpleName();
    ArrayAdapter armedForcesStateAdapter;
    private int counter401;
    EditTextWatcher editTextWatcher;
    private String loyaltyId;
    private EditText mAddr1EditText;
    private EditText mAddr2EditText;
    private TextView mAgreementTextView;
    ArrayAdapter mArmedForcesStateAdapter;
    private ArrayAdapterWithHint mArmedForcesStatesCategoryAdapter;
    private Spinner mArmedForcesStatesCategorySpinner;
    private EditText mCityEditText;
    private CMSDataRetriver mCmsDataRetriver;
    private Button mCreateAccountButton;
    private LinearLayout mEmailParent;
    private EditText mJoinInStoreBirthday;
    private ImageView mJoinInStoreBirthdayHelp;
    private RadioButton mJoinInStoreRadioButton;
    private LinearLayout mJoinedInStoreSection;
    private LinearLayout mLayoutPhysicalCard;
    Location mLocation;
    LocationManager mLocationManager;
    private EditText mLoyaltyEmailId;
    private LinearLayout mLoyaltyParent;
    private Button mLoyaltySave;
    private EditText mPhoneNumber;
    private TextView mPhoneNumberEditTextError;
    private CheckBox mPhysicalCardCheckBox;
    private LinearLayout mPhysicalCardSubLayout;
    private int mRetryCount;
    private EditText mRewardNumberEditText;
    private TextView mRewardNumberEditTextError;
    private ScannerListener mScannerListener;
    private String mSelectedArmedForcesStatesCategory;
    private String mSelectedStateCode;
    private com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType mSelectedStateType;
    private EditText mSignMeUpBirthday;
    private ImageView mSignMeUpBirthdayHelp;
    private RadioButton mSignMeUpRadioButton;
    ArrayAdapter mStateAdapter;
    private Spinner mStateSpinner;
    private RadioGroup mStateTypeRadioGroup;
    private TextView mTapLocateOrEnterTextView;
    private String mUserPhoneNumber;
    private EditText mZipEditText;
    ArrayAdapter stateAdapter;
    private RadioButton stateArmedForcesRadioButton;
    private RadioButton stateNormalRadioButton;

    public LoyaltyEnrollmentActivity()
    {
        editTextWatcher = new EditTextWatcher();
        mSelectedStateCode = "AL";
        mSelectedStateType = com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES;
        mRetryCount = 0;
        mSelectedArmedForcesStatesCategory = "SELECT_CATEGORY";
    }

    private void displayToolTip(String s)
    {
        s = (new android.app.AlertDialog.Builder(getActivity())).setMessage(s).create();
        s.setCanceledOnTouchOutside(true);
        s.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final LoyaltyEnrollmentActivity this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                super();
            }
        });
        s.show();
        ((TextView)s.findViewById(0x102000b)).setPadding(40, 40, 40, 40);
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
            return cityandstate;
        }
        return cityandstate;
    }

    private Location getLocation()
    {
        return mLocation;
    }

    private String getPhoneNumberNumerals(String s)
    {
        return s.replaceAll("[^\\d]", "");
    }

    private void hideVirtualKeyboard()
    {
        View view = getActivity().getCurrentFocus();
        if (view != null)
        {
            ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void processError(final Error kohlsError)
    {
        if (!kohlsError.getErrorCode().equals("PROF9163"));
        if (getActivity() != null)
        {
            getActivity().runOnUiThread(new Runnable() {

                final LoyaltyEnrollmentActivity this$0;
                final Error val$kohlsError;

                public void run()
                {
                    UtilityMethods.dismissDialog(4002);
                    if (!ErrorHelper.isApplicationManagable(kohlsError))
                    {
                        ArrayList arraylist = new ArrayList();
                        arraylist.add(kohlsError.getMessage());
                        showError(arraylist);
                        getActivity().setResult(0);
                    }
                }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                kohlsError = error;
                super();
            }
            });
        }
    }

    private void sendRefreshTokenRequest()
    {
        String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getRefreshTokenFromPref();
        TokenRegisrationPO tokenregisrationpo = new TokenRegisrationPO();
        tokenregisrationpo.setGrant_type("refresh_token");
        tokenregisrationpo.setRefresh_token(s);
        tokenregisrationpo.setEmail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        tokenregisrationpo.setFname(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
        tokenregisrationpo.setLname(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref());
        if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId()))
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().generateWalletId();
        }
        tokenregisrationpo.setWalletId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId());
        tokenregisrationpo.setUid(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID());
        (new AdapterHelper(AdapterProcedure.TOKEN_REGISRATION, tokenregisrationpo, this)).performTask();
    }

    private void setAdapterAndListener(Spinner spinner, com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType statetype)
    {
        if (statetype == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES)
        {
            if (stateAdapter == null)
            {
                stateAdapter = new StateSpinnerAdapter(getActivity(), 0x1090008, StatesWithCode.getStateList(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES));
            }
            mStateSpinner.setAdapter(stateAdapter);
            mStateSpinner.setSelection(stateAdapter.getCount());
        } else
        if (statetype == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES)
        {
            if (armedForcesStateAdapter == null)
            {
                armedForcesStateAdapter = new StateSpinnerAdapter(getActivity(), 0x1090008, StatesWithCode.getStateList(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES));
            }
            mStateSpinner.setAdapter(armedForcesStateAdapter);
            mStateSpinner.setSelection(armedForcesStateAdapter.getCount());
            return;
        }
    }

    private void setAdapterAndListener(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType statetype)
    {
        if (statetype == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES)
        {
            if (mStateAdapter == null)
            {
                mStateAdapter = new StateSpinnerAdapter(getActivity(), 0x1090008, StatesWithCode.getStateList(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES));
            }
            mStateSpinner.setAdapter(mStateAdapter);
            mStateSpinner.setSelection(mStateAdapter.getCount());
        } else
        if (statetype == com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES)
        {
            if (mArmedForcesStateAdapter == null)
            {
                mArmedForcesStateAdapter = new StateSpinnerAdapter(getActivity(), 0x1090008, StatesWithCode.getStateList(com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.ARMED_FORCE_STATES));
            }
            mStateSpinner.setAdapter(mArmedForcesStateAdapter);
            mStateSpinner.setSelection(mArmedForcesStateAdapter.getCount());
            return;
        }
    }

    private void setAgreementTermsAndConditionsText(TextView textview)
    {
        Object obj = getActivity().getResources();
        textview.setText("By signing up for the Yes2You Rewards, you are agreeing to the ");
        obj = UtilityMethods.getColorSpanable("Terms and Conditions", ((Resources) (obj)).getColor(0x7f0c0040));
        ((Spannable) (obj)).setSpan(new MyClickableSpan("Terms and Conditions", 3), 0, "Terms and Conditions".length(), 33);
        textview.append(((CharSequence) (obj)));
        textview.append(" of the program and certify that you are over 13 years old.");
        textview.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setArmedForcesCategoryAdapter()
    {
        mArmedForcesStatesCategoryAdapter = new ArrayAdapterWithHint(getActivity(), 0x1090008, getResources().getStringArray(0x7f0a0002));
        mArmedForcesStatesCategorySpinner.setAdapter(mArmedForcesStatesCategoryAdapter);
        mArmedForcesStatesCategorySpinner.setSelection(mArmedForcesStatesCategoryAdapter.getCount());
    }

    private void setEditTextRightIconListener(final EditText view, int i, int j, int k)
    {
        final Drawable editTextLeftIcon = getResources().getDrawable(k);
        editTextLeftIcon.setBounds(0, 0, Math.round(i), Math.round(j));
        view.setCompoundDrawablesWithIntrinsicBounds(null, null, editTextLeftIcon, null);
        view.setOnTouchListener(new android.view.View.OnTouchListener() {

            final LoyaltyEnrollmentActivity this$0;
            final Drawable val$editTextLeftIcon;
            final EditText val$view;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                while (view.getCompoundDrawables() == null || motionevent.getAction() != 1 || motionevent.getX() <= (float)(view.getWidth() - view.getPaddingRight() - editTextLeftIcon.getIntrinsicWidth())) 
                {
                    return false;
                }
                if (view.getId() != 0x7f0d0092) goto _L2; else goto _L1
_L1:
                if (UtilityMethods.canGetLocation(getActivity()))
                {
                    view1 = getLocation();
                    if (view1 != null)
                    {
                        if (UtilityMethods.isNetworkConnected(getActivity()))
                        {
                            UtilityMethods.showKohlsProgressDialog(4002, null, getString(0x7f080436), null, true, false, false, 0, getActivity());
                            (new GeocodeTask()).execute(new Double[] {
                                Double.valueOf(view1.getLatitude()), Double.valueOf(view1.getLongitude())
                            });
                        } else
                        {
                            Toast.makeText(getActivity(), 0x7f0803cd, 0).show();
                        }
                    } else
                    {
                        UtilityMethods.showKohlsProgressDialog(4002, null, getString(0x7f080436), null, true, false, false, 0, getActivity());
                        startLocationUpdates();
                    }
                } else
                {
                    UtilityMethods.showSettingsAlert(getActivity());
                }
_L4:
                return true;
_L2:
                if (view.getId() == 0x7f0d007d)
                {
                    setScannerListener(new CustomScannerListener());
                    startScan(1002);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                view = edittext;
                editTextLeftIcon = drawable;
                super();
            }
        });
    }

    private void setStatusCreateAcccountButton()
    {
        if (mJoinInStoreRadioButton.isChecked())
        {
            String s = mRewardNumberEditText.getText().toString();
            String s3 = mJoinInStoreBirthday.getText().toString();
            if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s3))
            {
                mCreateAccountButton.setEnabled(false);
                return;
            }
        } else
        if (mSignMeUpRadioButton.isChecked())
        {
            String s1 = getPhoneNumberNumerals(mPhoneNumber.getText().toString());
            String s4 = mSignMeUpBirthday.getText().toString();
            if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s4))
            {
                mCreateAccountButton.setEnabled(false);
                return;
            }
            if (mPhysicalCardCheckBox.isChecked())
            {
                String s2 = mAddr1EditText.getText().toString();
                String s5 = mCityEditText.getText().toString();
                String s6 = mZipEditText.getText().toString();
                if (TextUtils.isEmpty(s2) || TextUtils.isEmpty(s6))
                {
                    mCreateAccountButton.setEnabled(false);
                    return;
                }
                if (stateNormalRadioButton.isChecked() && (mSelectedStateCode.equals("STATE") || TextUtils.isEmpty(s5)))
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
        mCreateAccountButton.setEnabled(true);
    }

    private void showDatePickerDialog(EditText edittext)
    {
        (new com.kohls.mcommerce.opal.framework.controller.impl.CreateProfileControllerImpl.SelectDateFragment(edittext)).show(getFragmentManager(), "DatePicker");
    }

    private void showEditTextUserEntryError(TextView textview, int i)
    {
        textview.setText(getResources().getString(i));
        textview.setVisibility(0);
    }

    private void startLocationUpdates()
    {
        mLocationManager = (LocationManager)getActivity().getSystemService("location");
        if (mLocationManager.isProviderEnabled("network"))
        {
            mLocationManager.requestLocationUpdates("network", 0L, 0.0F, this);
            if (mLocationManager != null)
            {
                updateLocation(mLocationManager.getLastKnownLocation("network"));
            }
        }
        if (mLocationManager.isProviderEnabled("gps") && mLocation == null)
        {
            mLocationManager.requestLocationUpdates("gps", 0L, 0.0F, this);
            if (mLocationManager != null)
            {
                updateLocation(mLocationManager.getLastKnownLocation("gps"));
            }
        }
    }

    private void updateLocation(Location location)
    {
        mLocation = location;
    }

    private void updateLoyaltyInfo(boolean flag, String s)
    {
        ProfileData profiledata = new ProfileData();
        profiledata.setLoyaltyId(s);
        profiledata.setBirthday(mJoinInStoreBirthday.getText().toString());
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
            (new UpdateLoyaltyProfileTask(getActivity(), flag)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ProfileData[] {
                profiledata
            });
        }
    }

    public Error getPayloadError(IValueObject ivalueobject)
    {
        if (ivalueobject instanceof SignInAndProfileVO)
        {
            ivalueobject = (SignInAndProfileVO)ivalueobject;
            if (ivalueobject.getErrors() != null)
            {
                Object obj = ivalueobject.getErrors();
                if (((List) (obj)).size() > 0)
                {
                    obj = (com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO.Errors)((List) (obj)).get(0);
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
                return new Error(ivalueobject.getPayload().getErrorCode(), ivalueobject.getPayload().getError(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
            }
        }
        return null;
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
    }

    protected int intializaLayoutId()
    {
        return 0x7f030012;
    }

    protected void loadContent()
    {
        setupview();
    }

    public void onActionPerformed(Object obj)
    {
        if (obj == null)
        {
            UtilityMethods.dismissDialog(4002);
        } else
        {
            if (obj instanceof AccountLookupResponse)
            {
                AccountLookupResponse accountlookupresponse = (AccountLookupResponse)obj;
                if (!accountlookupresponse.isSuccess() && accountlookupresponse.getErrors() != null && accountlookupresponse.getErrors().size() > 0 && !TextUtils.isEmpty(((ErrorResponse)accountlookupresponse.getErrors().get(0)).getMessage()) && getActivity() != null)
                {
                    obj = (new Intent(getActivity(), com/kohls/mcommerce/opal/wallet/util/DisplayErrorDialog)).setFlags(0x20000);
                    ((Intent) (obj)).putExtra("ServerError", ((ErrorResponse)accountlookupresponse.getErrors().get(0)).getMessage());
                    getActivity().startActivity(((Intent) (obj)));
                    UtilityMethods.dismissDialog(4002);
                    return;
                }
                if (TextUtils.isEmpty(((AccountLookupResponse)obj).getEmailId()) || ((AccountLookupResponse)obj).getEmailId().equalsIgnoreCase(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref()))
                {
                    updateLoyaltyInfo(true, accountlookupresponse.getLoyaltyId());
                    return;
                } else
                {
                    UtilityMethods.dismissDialog(4002);
                    mEmailParent.setVisibility(0);
                    mLoyaltyEmailId.setTag(((AccountLookupResponse)obj).getEmailId());
                    mLoyaltyParent.setVisibility(8);
                    return;
                }
            }
            if (obj instanceof LoyaltyProfileResponse)
            {
                obj = (LoyaltyProfileResponse)obj;
                if (obj != null && ((LoyaltyProfileResponse) (obj)).isSuccess())
                {
                    loyaltyId = ((LoyaltyProfileResponse) (obj)).getProfile().getLoyaltyId();
                    ControllerFactory.getRefreshTokenController().checkAndRefreshToken(this);
                }
                UtilityMethods.dismissDialog(4002);
                return;
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 2) goto _L2; else goto _L1
_L1:
        if (j != -1 || !intent.hasExtra("SCAN_DATA")) goto _L4; else goto _L3
_L3:
        if (!UtilityMethods.isNetworkConnected(getActivity())) goto _L6; else goto _L5
_L5:
        intent = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
        if (intent.size() > 0 && mScannerListener != null)
        {
            mScannerListener.scanDone((String)intent.get("SCAN_LOYALTY_ID"));
            setScannerListener(null);
        }
_L8:
        return;
_L6:
        showScanErrorDialog(getString(0x7f0803be));
        return;
_L4:
        if (j == 2)
        {
            showScanErrorDialog(getString(0x7f0804a7));
            AnalyticsHelper.sendAnalyticsOnScanFail();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i == 3 || i == 4) && j == 2)
        {
            showScanErrorDialog(getString(0x7f08044c));
            AnalyticsHelper.sendAnalyticsOnScanFail();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 7: default 72
    //                   2131558525: 72
    //                   2131558527: 664
    //                   2131558528: 694
    //                   2131558535: 673
    //                   2131558536: 682
    //                   2131558551: 73
    //                   2131559025: 706;
           goto _L1 _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L6:
        ProfileData profiledata;
        if (mSignMeUpRadioButton.isChecked())
        {
            if (getPhoneNumberNumerals(mPhoneNumber.getText().toString()).length() < 10)
            {
                showEditTextUserEntryError(mPhoneNumberEditTextError, 0x7f08024f);
                return;
            }
        } else
        if (mJoinInStoreRadioButton.isChecked() && mRewardNumberEditText.getText().toString().length() < 10)
        {
            showEditTextUserEntryError(mRewardNumberEditTextError, 0x7f080251);
            return;
        }
        profiledata = new ProfileData();
        if (!((TextView)view.findViewById(0x7f0d0097)).getText().toString().equals(getString(0x7f0804a1))) goto _L9; else goto _L8
_L8:
        ListenerManager.getInstance().registerListener(this, "account_data");
        if (mRewardNumberEditText.getText().toString().length() != 11) goto _L11; else goto _L10
_L10:
        (new AccountLookupTask(getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
            mRewardNumberEditText.getText().toString(), null, null
        });
_L13:
        UtilityMethods.showKohlsProgressDialog(4002, null, getString(0x7f0801b6), null, true, false, false, 0, getActivity());
        hideVirtualKeyboard();
        return;
_L11:
        if (mRewardNumberEditText.getText().toString().length() == 10)
        {
            mUserPhoneNumber = mRewardNumberEditText.getText().toString();
            (new AccountLookupTask(getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                null, null, mRewardNumberEditText.getText().toString()
            });
        }
        continue; /* Loop/switch isn't completed */
_L9:
        profiledata.setPhoneNumber(getPhoneNumberNumerals(mPhoneNumber.getText().toString()));
        profiledata.setEmail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        profiledata.setBirthday(mSignMeUpBirthday.getText().toString());
        view = new Customer();
        view.setFirstName(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
        view.setLastName(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref());
        profiledata.setCustomerName(view);
        ListenerManager.getInstance().registerListener(this, "updateloyaltydata");
        profiledata.setBirthday(mSignMeUpBirthday.getText().toString());
        if (mPhysicalCardCheckBox.isChecked())
        {
            view = new Address();
            view.setAddr1(mAddr1EditText.getText().toString().trim());
            if (!TextUtils.isEmpty(mAddr2EditText.getText().toString()))
            {
                view.setAddr2(mAddr2EditText.getText().toString().trim());
            }
            view.setPostalCode(mZipEditText.getText().toString());
            profiledata.setPostalCode(mZipEditText.getText().toString());
            if (stateNormalRadioButton.isChecked())
            {
                view.setCity(mCityEditText.getText().toString());
            } else
            if (stateArmedForcesRadioButton.isChecked())
            {
                view.setCity(mSelectedArmedForcesStatesCategory);
            }
            view.setState(mSelectedStateCode);
            profiledata.setAddress(view);
        }
        (new CreateLoyaltyProfileTask(getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ProfileData[] {
            profiledata
        });
        continue; /* Loop/switch isn't completed */
_L2:
        showDatePickerDialog(mJoinInStoreBirthday);
        return;
_L4:
        showDatePickerDialog(mSignMeUpBirthday);
        return;
_L5:
        displayToolTip(getString(0x7f080180));
        return;
_L3:
        displayToolTip(getString(0x7f080180));
        return;
_L7:
        if (mRetryCount < 3)
        {
            mRetryCount = mRetryCount + 1;
            view = mLoyaltyEmailId.getTag().toString();
            if (Patterns.EMAIL_ADDRESS.matcher(view).matches())
            {
                if (mLoyaltyEmailId.getText().toString().equalsIgnoreCase(view))
                {
                    UtilityMethods.showKohlsProgressDialog(4002, null, getString(0x7f080436), null, true, false, false, 0, getActivity());
                    hideVirtualKeyboard();
                    updateLoyaltyInfo(true, mRewardNumberEditText.getText().toString());
                    return;
                } else
                {
                    Toast.makeText(getActivity(), getString(0x7f0801e7), 1).show();
                    return;
                }
            } else
            {
                Toast.makeText(getActivity(), "Please use the correct format for your email address.", 1).show();
                return;
            }
        }
        Toast.makeText(getActivity(), "We're having trouble creating your Rewards account. Please try again or Call Kohl's Customer Service at 855-564-5751 for assistance", 1).show();
        mEmailParent.setVisibility(8);
        mLoyaltyParent.setVisibility(0);
        hideVirtualKeyboard();
        mRetryCount = 0;
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void onDestroy()
    {
        ListenerManager.getInstance().unRegisterListener("updateloyaltydata", this);
        ListenerManager.getInstance().unRegisterListener("account_data", this);
        super.onDestroy();
    }

    public void onFailure(Error error)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setLoyaltyID("");
        processError(error);
    }

    public void onLocationChanged(Location location)
    {
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onRefreshTokenFailure()
    {
    }

    public void onRefreshTokenSuccess()
    {
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().updateProfile(loyaltyId, this);
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    public void onSuccess(final IValueObject valueObject)
    {
        if (getActivity() != null)
        {
            getActivity().runOnUiThread(new Runnable() {

                final LoyaltyEnrollmentActivity this$0;
                final IValueObject val$valueObject;

                public void run()
                {
                    if (valueObject != null && isAdded() && (valueObject instanceof UpdateAccountVO))
                    {
                        UpdateAccountVO updateaccountvo = (UpdateAccountVO)valueObject;
                        if (updateaccountvo.getErrors() != null && updateaccountvo.getErrors().size() > 0)
                        {
                            if (UtilityMethods.isAuthError(((ErrorVO)updateaccountvo.getErrors().get(0)).getCode()) || ((ErrorVO)updateaccountvo.getErrors().get(0)).getCode().equals("401") || ((ErrorVO)updateaccountvo.getErrors().get(0)).getCode().contains("access_token_expired"))
                            {
                                ServerLogger.errorSignedOut(TAG, AdapterProcedure.GET_CUSTOMER_PROFILE.getProcedureName(), "due to error in success of ");
                                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setUserSignInStatus(false);
                                if (getActivity() != null)
                                {
                                    UtilityMethods.openAccountActivity(getActivity(), true, true);
                                }
                            }
                        } else
                        {
                            Bundle bundle = new Bundle();
                            bundle.putString("info_bundle", getString(0x7f08039a));
                            ((HomeActivity)getActivity()).attachLoyaltyConfirmationFragment(bundle);
                        }
                    }
                    UtilityMethods.dismissDialog(4002);
                }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                valueObject = ivalueobject;
                super();
            }
            });
        }
    }

    public void setScannerListener(ScannerListener scannerlistener)
    {
        mScannerListener = scannerlistener;
    }

    void setupview()
    {
        mSignMeUpRadioButton = (RadioButton)getView().findViewById(0x7f0d0081);
        mJoinInStoreRadioButton = (RadioButton)getView().findViewById(0x7f0d007b);
        mLayoutPhysicalCard = (LinearLayout)getView().findViewById(0x7f0d0083);
        mRewardNumberEditText = (EditText)getView().findViewById(0x7f0d007d);
        mEmailParent = (LinearLayout)getView().findViewById(0x7f0d0070);
        mEmailParent.setOnClickListener(this);
        mLoyaltyEmailId = (EditText)getView().findViewById(0x7f0d0270);
        mLoyaltySave = (Button)getView().findViewById(0x7f0d0271);
        mLoyaltySave.setOnClickListener(this);
        mLoyaltyParent = (LinearLayout)getView().findViewById(0x7f0d0071);
        mAgreementTextView = (TextView)getView().findViewById(0x7f0d0096);
        mRewardNumberEditText.addTextChangedListener(editTextWatcher);
        mJoinedInStoreSection = (LinearLayout)getView().findViewById(0x7f0d007c);
        mPhysicalCardCheckBox = (CheckBox)getView().findViewById(0x7f0d0089);
        mPhysicalCardSubLayout = (LinearLayout)getView().findViewById(0x7f0d008a);
        setEditTextRightIconListener(mRewardNumberEditText, 40, 40, 0x7f0201a8);
        mCityEditText = (EditText)getView().findViewById(0x7f0d0092);
        setEditTextRightIconListener(mCityEditText, 40, 40, 0x7f020052);
        mTapLocateOrEnterTextView = (TextView)getView().findViewById(0x7f0d0090);
        mAddr1EditText = (EditText)getView().findViewById(0x7f0d008e);
        mAddr1EditText.addTextChangedListener(editTextWatcher);
        mAddr2EditText = (EditText)getView().findViewById(0x7f0d008f);
        mAddr2EditText.addTextChangedListener(editTextWatcher);
        mCityEditText = (EditText)getView().findViewById(0x7f0d0092);
        mCityEditText.addTextChangedListener(editTextWatcher);
        mZipEditText = (EditText)getView().findViewById(0x7f0d0094);
        mZipEditText.addTextChangedListener(editTextWatcher);
        stateNormalRadioButton = (RadioButton)getView().findViewById(0x7f0d008c);
        stateArmedForcesRadioButton = (RadioButton)getView().findViewById(0x7f0d008d);
        mPhoneNumberEditTextError = (TextView)getView().findViewById(0x7f0d0086);
        mRewardNumberEditTextError = (TextView)getView().findViewById(0x7f0d007e);
        mJoinInStoreBirthday = (EditText)getView().findViewById(0x7f0d007f);
        mJoinInStoreBirthday.setOnClickListener(this);
        mJoinInStoreBirthday.addTextChangedListener(editTextWatcher);
        mSignMeUpBirthday = (EditText)getView().findViewById(0x7f0d0087);
        mSignMeUpBirthday.setOnClickListener(this);
        mSignMeUpBirthday.addTextChangedListener(editTextWatcher);
        mSignMeUpBirthdayHelp = (ImageView)getView().findViewById(0x7f0d0088);
        mSignMeUpBirthdayHelp.setOnClickListener(this);
        mJoinInStoreBirthdayHelp = (ImageView)getView().findViewById(0x7f0d0080);
        mJoinInStoreBirthdayHelp.setOnClickListener(this);
        mStateSpinner = (Spinner)getView().findViewById(0x7f0d0093);
        setAdapterAndListener(mStateSpinner, com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType.STATES);
        mStateSpinner.setOnItemSelectedListener(new SpinnerItemSelectionListener());
        mCreateAccountButton = (Button)getView().findViewById(0x7f0d0097);
        mCreateAccountButton.setOnClickListener(this);
        mStateTypeRadioGroup = (RadioGroup)getView().findViewById(0x7f0d008b);
        mStateTypeRadioGroup.setOnCheckedChangeListener(new RadioGroupListener());
        mPhoneNumber = (EditText)getView().findViewById(0x7f0d0085);
        UsPhoneNumberFormatter usphonenumberformatter = new UsPhoneNumberFormatter(new WeakReference(mPhoneNumber));
        mPhoneNumber.addTextChangedListener(usphonenumberformatter);
        mPhoneNumber.addTextChangedListener(editTextWatcher);
        mArmedForcesStatesCategorySpinner = (Spinner)getView().findViewById(0x7f0d0091);
        mArmedForcesStatesCategorySpinner.setVisibility(8);
        mArmedForcesStatesCategorySpinner.setOnItemSelectedListener(new ArmedForcesStatesSpinnerItemSelectionListener());
        mCreateAccountButton.setText(getString(0x7f0804a1));
        mJoinInStoreRadioButton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final LoyaltyEnrollmentActivity this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    mSignMeUpRadioButton.setChecked(false);
                    mJoinedInStoreSection.setVisibility(0);
                    mCreateAccountButton.setText(getString(0x7f0804a1));
                } else
                {
                    mSignMeUpRadioButton.setChecked(true);
                    mJoinedInStoreSection.setVisibility(8);
                    mCreateAccountButton.setText(getString(0x7f08039b));
                }
                setStatusCreateAcccountButton();
            }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                super();
            }
        });
        mSignMeUpRadioButton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final LoyaltyEnrollmentActivity this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    mJoinInStoreRadioButton.setChecked(false);
                    mLayoutPhysicalCard.setVisibility(0);
                    mCreateAccountButton.setText(getString(0x7f08039b));
                } else
                {
                    mJoinInStoreRadioButton.setChecked(true);
                    mLayoutPhysicalCard.setVisibility(8);
                    mCreateAccountButton.setText(getString(0x7f0804a1));
                }
                setStatusCreateAcccountButton();
            }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                super();
            }
        });
        mPhysicalCardCheckBox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final LoyaltyEnrollmentActivity this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    mPhysicalCardSubLayout.setVisibility(0);
                    if (UtilityMethods.canGetLocation(getActivity()))
                    {
                        startLocationUpdates();
                    }
                } else
                {
                    mPhysicalCardSubLayout.setVisibility(8);
                }
                setStatusCreateAcccountButton();
            }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                super();
            }
        });
        mCmsDataRetriver = new CMSDataRetriver(getActivity());
        mCmsDataRetriver.getCMSAdapterValues();
        setAgreementTermsAndConditionsText(mAgreementTextView);
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

            UtilityMethods.showAlertDialog(4001, null, "", stringbuilder.toString(), 0, "", getString(0x7f0803e5), "", false, true, getActivity());
        }
    }

    public void showScanErrorDialog(String s)
    {
        UtilityMethods.getAlertDialog(getActivity(), s, getString(0x7f0804a3), getString(0x7f0800c7), new android.content.DialogInterface.OnClickListener() {

            final LoyaltyEnrollmentActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    startScan(1002);
                }
            }

            
            {
                this$0 = LoyaltyEnrollmentActivity.this;
                super();
            }
        }).show();
    }

    public void startScan(int i)
    {
        Intent intent;
        if (KohlsPhoneApplication.getInstance().getKohlsPref().isFirstScan())
        {
            intent = new Intent(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity);
            intent.putExtra("scan_request", i);
        } else
        {
            intent = new Intent(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/ScanActivity);
            intent.setAction("com.google.zxing.client.android.SCAN");
            intent.putExtra("SCAN_FORMATS", getActivity().getResources().getStringArray(0x7f0a0018));
            intent.putExtra("SAVE_HISTORY", false);
            intent.putExtra("scan_request", i);
            DisplayMetrics displaymetrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            i = displaymetrics.heightPixels;
            int j = displaymetrics.widthPixels;
            intent.putExtra("SCAN_WIDTH", (double)i * 0.59999999999999998D);
            intent.putExtra("SCAN_HEIGHT", (double)j * 0.59999999999999998D);
        }
        startActivityForResult(intent, 2);
    }

    public void stopLocationUpdates()
    {
        if (mLocationManager != null)
        {
            mLocationManager.removeUpdates(this);
            mLocationManager = null;
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }









/*
    static com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType access$1802(LoyaltyEnrollmentActivity loyaltyenrollmentactivity, com.kohls.mcommerce.opal.common.util.StatesWithCode.StateType statetype)
    {
        loyaltyenrollmentactivity.mSelectedStateType = statetype;
        return statetype;
    }

*/



/*
    static String access$2002(LoyaltyEnrollmentActivity loyaltyenrollmentactivity, String s)
    {
        loyaltyenrollmentactivity.mSelectedStateCode = s;
        return s;
    }

*/


/*
    static String access$2102(LoyaltyEnrollmentActivity loyaltyenrollmentactivity, String s)
    {
        loyaltyenrollmentactivity.mSelectedArmedForcesStatesCategory = s;
        return s;
    }

*/














}
