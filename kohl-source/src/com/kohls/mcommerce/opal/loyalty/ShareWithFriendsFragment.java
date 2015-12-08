// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.SharablePoint;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            ConfirmationDialogActivity, SharePointsActivity

public class ShareWithFriendsFragment extends Fragment
    implements TextWatcher, android.view.View.OnFocusChangeListener, android.widget.TextView.OnEditorActionListener, android.view.View.OnClickListener
{

    private EditText mEmailEditTxt;
    private EditText mMessageTxt;
    private EditText mPhoneEditTxt;
    private EditText mPointsEditText;
    private EditText mRewardIdEditTxt;
    private RelativeLayout mRewardsLayout;
    private View mRootView;
    private BroadcastReceiver mUpdateUIReceiver;
    private ProgressBar progressBar;
    private SharablePoint sharablePoint;
    private Button shareBtn;

    public ShareWithFriendsFragment()
    {
        mUpdateUIReceiver = new _cls1();
    }

    private void initiaLizeViews()
    {
        mEmailEditTxt = (EditText)mRootView.findViewById(0x7f0d030a);
        mPhoneEditTxt = (EditText)mRootView.findViewById(0x7f0d030c);
        mRewardIdEditTxt = (EditText)mRootView.findViewById(0x7f0d030e);
        mMessageTxt = (EditText)mRootView.findViewById(0x7f0d0693);
        shareBtn = (Button)mRootView.findViewById(0x7f0d0310);
        progressBar = (ProgressBar)mRootView.findViewById(0x7f0d0118);
        mPointsEditText = (EditText)mRootView.findViewById(0x7f0d0690);
        progressBar.setVisibility(8);
        mEmailEditTxt.setTypeface(WalletFontCache.getGothamBook(getActivity()));
        mPhoneEditTxt.setTypeface(WalletFontCache.getGothamBook(getActivity()));
        mRewardIdEditTxt.setTypeface(WalletFontCache.getGothamBook(getActivity()));
        mMessageTxt.setTypeface(WalletFontCache.getGothamBook(getActivity()));
        shareBtn.setTypeface(WalletFontCache.getGothamBold(getActivity()));
        mEmailEditTxt.setOnFocusChangeListener(this);
        mPhoneEditTxt.setOnFocusChangeListener(this);
        mRewardIdEditTxt.setOnFocusChangeListener(this);
        mMessageTxt.setOnFocusChangeListener(this);
        mPointsEditText.setOnFocusChangeListener(this);
        mEmailEditTxt.setOnEditorActionListener(this);
        mPhoneEditTxt.setOnEditorActionListener(this);
        mRewardIdEditTxt.setOnEditorActionListener(this);
        mMessageTxt.setOnEditorActionListener(this);
        mEmailEditTxt.addTextChangedListener(this);
        mPhoneEditTxt.addTextChangedListener(this);
        mPointsEditText.setOnEditorActionListener(this);
    }

    private boolean isUserInputValid()
    {
        if (TextUtils.isEmpty(mEmailEditTxt.getText().toString()) && TextUtils.isEmpty(mPhoneEditTxt.getText().toString()) && TextUtils.isEmpty(mRewardIdEditTxt.getText().toString()))
        {
            setErrorFieldView(mEmailEditTxt);
            setErrorFieldView(mPhoneEditTxt);
            setRegularFieldView(mRewardIdEditTxt);
            TextView textview = (TextView)mRootView.findViewById(0x7f0d0307);
            textview.setVisibility(0);
            textview.setText("Some information is missing or invalid.");
            mPhoneEditTxt.setEnabled(true);
            mEmailEditTxt.setEnabled(true);
            return false;
        } else
        {
            return true;
        }
    }

    private void setErrorFieldView(EditText edittext)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            edittext.setBackground(getResources().getDrawable(0x7f0200aa));
        } else
        {
            edittext.setBackgroundDrawable(getResources().getDrawable(0x7f0200aa));
        }
        edittext.setPadding(30, 30, 30, 30);
    }

    private void setRegularFieldView(EditText edittext)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            edittext.setBackground(getResources().getDrawable(0x7f0200a6));
        } else
        {
            edittext.setBackgroundDrawable(getResources().getDrawable(0x7f0200a6));
        }
        edittext.setPadding(30, 30, 30, 30);
    }

    private void setUpActionBar()
    {
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(getResources().getString(0x7f080512));
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }

    private void setUpViews()
    {
        String s = "";
        getActivity().getWindow().setSoftInputMode(3);
        if (!TextUtils.isEmpty(getArguments().getString("email")))
        {
            mEmailEditTxt.setText(getArguments().getString("email"));
        }
        if (!TextUtils.isEmpty(getArguments().getString("phone")))
        {
            mPhoneEditTxt.setText(getArguments().getString("phone"));
        }
        if (!TextUtils.isEmpty(getArguments().getString("rewardid")))
        {
            mRewardIdEditTxt.setText(getArguments().getString("rewardid"));
        }
        if (getArguments() != null)
        {
            s = getArguments().getString("points_to_share");
        }
        sharablePoint = new SharablePoint();
        sharablePoint.setMaxLimit(Integer.parseInt(getActivity().getIntent().getExtras().getString("point_balance")));
        sharablePoint.setMinLimit(1);
        sharablePoint.setSelectedPoint(s);
        sharablePoint.prepareView(mRootView, getActivity());
        if (!TextUtils.isEmpty(getArguments().getString("message")))
        {
            mMessageTxt.setText(getArguments().getString("message"));
        }
        shareBtn.setOnClickListener(this);
        if (getActivity().getIntent().getExtras().getBoolean("myrewards", false))
        {
            mRewardIdEditTxt.setVisibility(0);
        }
        disablePhoneAndRewardsText();
        disableEmailAndRewardsText();
        disablePhoneAndEmailText();
    }

    private void showConfirmationDialog()
    {
        OmnitureMeasurement.getInstance().setShareCustFoundEvents();
        Object obj = (TextView)mRootView.findViewById(0x7f0d0690);
        Object obj1 = (EditText)mRootView.findViewById(0x7f0d030e);
        Intent intent = new Intent(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/loyalty/ConfirmationDialogActivity);
        intent.putExtra("sharewith", "frnds");
        intent.putExtra("points_to_share", ((TextView) (obj)).getText().toString());
        intent.putExtra("message", mMessageTxt.getText().toString());
        if (obj1 != null && ((EditText) (obj1)).getVisibility() == 0)
        {
            intent.putExtra("loyaltyid", ((EditText) (obj1)).getText().toString());
        }
        obj = mEmailEditTxt.getText().toString();
        obj1 = mPhoneEditTxt.getText().toString();
        intent.putExtra("email_of_friend", ((String) (obj)));
        intent.putExtra("phone", ((String) (obj1)));
        startActivityForResult(intent, 200);
    }

    private void updateFocus()
    {
        mEmailEditTxt.clearFocus();
        mPhoneEditTxt.clearFocus();
        mRewardIdEditTxt.clearFocus();
        mMessageTxt.clearFocus();
        ((EditText)mRootView.findViewById(0x7f0d0690)).clearFocus();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void disableEmailAndRewardsText()
    {
        mPhoneEditTxt.addTextChangedListener(new _cls3());
    }

    public void disablePhoneAndEmailText()
    {
        mRewardIdEditTxt.addTextChangedListener(new _cls4());
    }

    public void disablePhoneAndRewardsText()
    {
        mEmailEditTxt.addTextChangedListener(new _cls2());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j != 200) goto _L2; else goto _L1
_L1:
        startActivity(intent);
_L4:
        return;
_L2:
        if (j == 3001)
        {
            setErrorFieldView(mEmailEditTxt);
            setRegularFieldView(mRewardIdEditTxt);
            setRegularFieldView(mPhoneEditTxt);
            intent = (TextView)mRootView.findViewById(0x7f0d0307);
            intent.setVisibility(0);
            intent.setText("Please use the correct format for your email address.");
            mEmailEditTxt.setEnabled(true);
            return;
        }
        if (j == 3002)
        {
            setErrorFieldView(mPhoneEditTxt);
            setRegularFieldView(mEmailEditTxt);
            setRegularFieldView(mRewardIdEditTxt);
            intent = (TextView)mRootView.findViewById(0x7f0d0307);
            intent.setVisibility(0);
            intent.setText("Please use the correct format for your phone number.");
            return;
        }
        if (j != 3003)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mRewardIdEditTxt.getVisibility() != 0) goto _L4; else goto _L3
_L3:
        setRegularFieldView(mEmailEditTxt);
        setRegularFieldView(mPhoneEditTxt);
        setErrorFieldView(mRewardIdEditTxt);
        intent = (TextView)mRootView.findViewById(0x7f0d0307);
        intent.setVisibility(0);
        intent.setText("Some information is missing or invalid.");
        return;
        if (j != 3004 || mRewardIdEditTxt.getVisibility() != 0) goto _L4; else goto _L5
_L5:
        setErrorFieldView(mRewardIdEditTxt);
        intent = (TextView)mRootView.findViewById(0x7f0d0307);
        intent.setVisibility(0);
        intent.setText("You can only share points with other Yes2You Rewards member. Please try again!");
        return;
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0d0310)
        {
            ((ScrollView)mRootView.findViewById(0x7f0d0306)).scrollTo(0, 0);
            view = (TextView)mRootView.findViewById(0x7f0d0690);
            mRootView.findViewById(0x7f0d0307).setVisibility(8);
            if (!sharablePoint.validateInput(getActivity(), view.getText().toString()))
            {
                progressBar.setVisibility(8);
            } else
            if (isUserInputValid())
            {
                showConfirmationDialog();
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mRootView = layoutinflater.inflate(0x7f03007f, viewgroup, false);
        initiaLizeViews();
        setUpViews();
        setUpActionBar();
        OmnitureMeasurement.getInstance().setSharePointsEvents();
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(mUpdateUIReceiver, new IntentFilter("46"));
        return mRootView;
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            updateFocus();
            ((ScrollView)mRootView.findViewById(0x7f0d0306)).scrollTo(0, 0);
            ((SharePointsActivity)getActivity()).showHeaderView();
        }
        return false;
    }

    public void onFocusChange(View view, boolean flag)
    {
        int i = view.getId();
        if (i == 0x7f0d030a || i == 0x7f0d030c || i == 0x7f0d030e || i == 0x7f0d0693 || i == 0x7f0d0690)
        {
            ((SharePointsActivity)getActivity()).hideHeaderView();
        }
        if (!flag)
        {
            ((SharePointsActivity)getActivity()).showHeaderView();
            ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void onResume()
    {
        mRootView.findViewById(0x7f0d0310).setEnabled(true);
        mRootView.findViewById(0x7f0d0310).setClickable(true);
        setRegularFieldView(mPhoneEditTxt);
        setRegularFieldView(mEmailEditTxt);
        setRegularFieldView(mRewardIdEditTxt);
        ((SharePointsActivity)getActivity()).showHeaderView();
        super.onResume();
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }




    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls2 {}

}
