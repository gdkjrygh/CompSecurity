// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.component.views.GothamBookTextView;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.loyalty.CMSDataRetriver;
import com.kohls.mcommerce.opal.wallet.fragment.LinkActivity;
import com.kohls.mcommerce.opal.wallet.rest.RewardService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ReferFriendResponse;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class Yes2YouInviteFriendActivity extends BaseActivityWithoutSlider
{
    private class BackgroundTask extends AsyncTask
    {

        final Yes2YouInviteFriendActivity this$0;

        protected transient ReferFriendResponse doInBackground(String as[])
        {
            Logger.debug("Yes2YouInviteFriendsActivity", "doInBackGround() START");
            Object obj = null;
            if (as != null && as.length > 0)
            {
                as = (new RewardService(new WeakReference(Yes2YouInviteFriendActivity.this))).postReferFriend(as[0]);
            } else
            {
                Logger.debug("Yes2YouInviteFriendsActivity", "Input is NULL, DEBUG it.");
                as = obj;
            }
            Logger.debug("Yes2YouInviteFriendsActivity", "doInBackGround() END");
            return as;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        public boolean hasError(ReferFriendResponse referfriendresponse)
        {
            boolean flag = false;
            if (referfriendresponse == null)
            {
                mErrorTextView.setText(0x7f080135);
                flag = true;
            } else
            {
                List list = referfriendresponse.getErrors();
                String s = referfriendresponse.getSuccess();
                if (list == null || s == null)
                {
                    mErrorTextView.setText(0x7f080135);
                    mErrorCode = referfriendresponse.getErrorType().toString();
                    return true;
                }
                if (list.size() != 0 && !s.equalsIgnoreCase("true"))
                {
                    mErrorTextView.setText(0x7f080135);
                    mErrorCode = ((com.kohls.mcommerce.opal.wallet.rest.responses.ResponseBase.Error)list.get(0)).getCode();
                    return true;
                }
                referfriendresponse = ((com.kohls.mcommerce.opal.wallet.rest.containers.ReferFriendResponse.Referee)referfriendresponse.getReferres().get(0)).getRefereeError();
                if (referfriendresponse != null)
                {
                    if (referfriendresponse.getErrorMessage() != null && !referfriendresponse.getErrorMessage().isEmpty())
                    {
                        mEmailEditText.setBackground(getResources().getDrawable(0x7f020005));
                        mErrorTextView.setText(referfriendresponse.getErrorMessage());
                    } else
                    {
                        mErrorTextView.setText(0x7f080135);
                    }
                    mErrorCode = referfriendresponse.getErrorCode();
                    return true;
                }
            }
            return flag;
        }

        protected void onPostExecute(ReferFriendResponse referfriendresponse)
        {
            super.onPostExecute(referfriendresponse);
            Logger.debug("Yes2YouInviteFriendsActivity", "onPostExecute() START");
            if (hasError(referfriendresponse))
            {
                updateUserInterfaceOnError();
                referfriendresponse = new HashMap();
                referfriendresponse.put("error.code", mErrorCode);
                AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_LANDING_PAGE, referfriendresponse);
            } else
            {
                updateUserInterfaceOnSuccess();
                referfriendresponse = new HashMap();
                referfriendresponse.put("actions.loyaltyinvite", "1");
                AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_INVITE_FRIEND_SUCCESS, referfriendresponse);
            }
            mEmailEditText.setEnabled(true);
            findViewById(0x7f0d012c).setEnabled(true);
            UtilityMethods.dismissDialog(4002);
            Logger.debug("Yes2YouInviteFriendsActivity", "onPostExecute() END");
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((ReferFriendResponse)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            UtilityMethods.showKohlsProgressDialog(4002, null, "Sending Invite", null, true, false, false, 0, Yes2YouInviteFriendActivity.this);
            findViewById(0x7f0d012c).setEnabled(false);
            mEmailEditText.setEnabled(false);
        }

        private BackgroundTask()
        {
            this$0 = Yes2YouInviteFriendActivity.this;
            super();
        }

    }

    private class CustomClickableSpan extends ClickableSpan
    {

        final Yes2YouInviteFriendActivity this$0;

        public void onClick(View view)
        {
            findViewById(0x7f0d012e).setClickable(false);
            view = mCmsDataRetriver.getPropertiesFromLoyaltyHelpVO();
            if (view != null)
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("linkurl", view.getTerms_and_conditions());
                intent.putExtra("pagetitle", getResources().getString(0x7f08051a));
                intent.setClass(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/LinkActivity);
                startActivity(intent);
                AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_TERMS_CONDITIONS);
            }
            findViewById(0x7f0d012e).setClickable(true);
        }

        public void updateDrawState(TextPaint textpaint)
        {
            textpaint.setColor(0xff000000);
            textpaint.setFlags(textpaint.getFlags() | 8);
        }

        private CustomClickableSpan()
        {
            this$0 = Yes2YouInviteFriendActivity.this;
            super();
        }

    }


    private static final String LOG_TAG = "Yes2YouInviteFriendsActivity";
    public static final String LOLALTY_ERR_ALREADY_INVITED = "LOYAL2000-12";
    public static final String LOLALTY_ERR_ALREADY_SHOPPER = "LOYAL2000-11";
    private static final String SPACE = " ";
    private CMSDataRetriver mCmsDataRetriver;
    private final android.widget.TextView.OnEditorActionListener mEditActionListener = new android.widget.TextView.OnEditorActionListener() {

        final Yes2YouInviteFriendActivity this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6 && findViewById(0x7f0d012c).isEnabled())
            {
                inviteFriend();
            }
            return false;
        }

            
            {
                this$0 = Yes2YouInviteFriendActivity.this;
                super();
            }
    };
    private EditText mEmailEditText;
    private String mErrorCode;
    private TextView mErrorTextView;
    private boolean mKillSwitchWithRewards;

    public Yes2YouInviteFriendActivity()
    {
        mKillSwitchWithRewards = false;
        mErrorCode = "";
    }

    private void inviteFriend()
    {
        String s = mEmailEditText.getText().toString();
        if (TextUtils.isEmpty(s))
        {
            mEmailEditText.setBackground(getResources().getDrawable(0x7f020005));
            s = getString(0x7f080136);
            mErrorTextView.setText(s);
            HashMap hashmap = new HashMap();
            hashmap.put("error.code", s);
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_LANDING_PAGE, hashmap);
            updateUserInterfaceOnError();
            return;
        }
        if (!UtilityMethods.isEmailValid(s))
        {
            mEmailEditText.setBackground(getResources().getDrawable(0x7f020005));
            s = getString(0x7f08014e);
            mErrorTextView.setText(s);
            HashMap hashmap1 = new HashMap();
            hashmap1.put("error.code", s);
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_LANDING_PAGE, hashmap1);
            updateUserInterfaceOnError();
            return;
        } else
        {
            (new BackgroundTask()).executeOnExecutor(BackgroundTask.THREAD_POOL_EXECUTOR, new String[] {
                s
            });
            return;
        }
    }

    private void updateUserInterfaceOnError()
    {
        Logger.debug("Yes2YouInviteFriendsActivity", "updateUserInterfaceOnError() START");
        findViewById(0x7f0d0128).setVisibility(0);
        findViewById(0x7f0d012f).setVisibility(8);
        findViewById(0x7f0d0120).setVisibility(0);
        findViewById(0x7f0d012a).setVisibility(0);
        findViewById(0x7f0d012b).setVisibility(8);
        Logger.debug("Yes2YouInviteFriendsActivity", "updateUserInterfaceOnError() END");
    }

    private void updateUserInterfaceOnSuccess()
    {
        Logger.debug("Yes2YouInviteFriendsActivity", "updateUserInterfaceOnSuccess() START");
        mEmailEditText.setBackground(getResources().getDrawable(0x7f0200a5));
        findViewById(0x7f0d0120).setVisibility(8);
        findViewById(0x7f0d012a).setVisibility(8);
        if (!mKillSwitchWithRewards)
        {
            final Handler resetUIHandler = new Handler();
            final Runnable resetDefault = new Runnable() {

                final Yes2YouInviteFriendActivity this$0;

                public void run()
                {
                    updateUserInterfaceToDefault();
                }

            
            {
                this$0 = Yes2YouInviteFriendActivity.this;
                super();
            }
            };
            findViewById(0x7f0d0128).setVisibility(8);
            findViewById(0x7f0d012f).setVisibility(0);
            String s = getString(0x7f08013b);
            Object obj = getString(0x7f08013c);
            obj = new SpannableString((new StringBuilder()).append(s).append(" ").append(((String) (obj))).toString());
            ((SpannableString) (obj)).setSpan(new StyleSpan(1), 0, s.length(), 33);
            ((GothamBookTextView)findViewById(0x7f0d0130)).setText(((CharSequence) (obj)));
            findViewById(0x7f0d0131).setOnClickListener(new android.view.View.OnClickListener() {

                final Yes2YouInviteFriendActivity this$0;
                final Runnable val$resetDefault;
                final Handler val$resetUIHandler;

                public void onClick(View view)
                {
                    if (resetUIHandler != null && resetDefault != null)
                    {
                        resetUIHandler.removeCallbacks(resetDefault);
                    }
                    updateUserInterfaceToDefault();
                }

            
            {
                this$0 = Yes2YouInviteFriendActivity.this;
                resetUIHandler = handler;
                resetDefault = runnable;
                super();
            }
            });
            resetUIHandler.postDelayed(resetDefault, 8000L);
        } else
        {
            mEmailEditText.getText().clear();
            findViewById(0x7f0d0122).setVisibility(8);
            findViewById(0x7f0d012d).setVisibility(8);
            findViewById(0x7f0d0127).setVisibility(0);
            findViewById(0x7f0d012b).setVisibility(0);
        }
        Logger.debug("Yes2YouInviteFriendsActivity", "updateUserInterfaceOnSuccess() END");
    }

    private void updateUserInterfaceToDefault()
    {
        Logger.debug("Yes2YouInviteFriendsActivity", "updateUserInterfaceToDefault() START");
        mEmailEditText = (EditText)findViewById(0x7f0d0129);
        mErrorTextView = (TextView)findViewById(0x7f0d012a);
        mEmailEditText.getText().clear();
        mEmailEditText.setImeOptions(6);
        mEmailEditText.setOnEditorActionListener(mEditActionListener);
        findViewById(0x7f0d0128).setVisibility(0);
        if (!mKillSwitchWithRewards)
        {
            findViewById(0x7f0d012f).setVisibility(8);
            findViewById(0x7f0d0120).setVisibility(8);
            findViewById(0x7f0d012a).setVisibility(8);
        } else
        {
            findViewById(0x7f0d0122).setVisibility(8);
            findViewById(0x7f0d012d).setVisibility(8);
            findViewById(0x7f0d0127).setVisibility(0);
            findViewById(0x7f0d012b).setVisibility(8);
        }
        findViewById(0x7f0d012c).setOnClickListener(new android.view.View.OnClickListener() {

            final Yes2YouInviteFriendActivity this$0;

            public void onClick(View view)
            {
                inviteFriend();
            }

            
            {
                this$0 = Yes2YouInviteFriendActivity.this;
                super();
            }
        });
        Logger.debug("Yes2YouInviteFriendsActivity", "updateUserInterfaceToDefault() END");
    }

    protected int getLayoutId()
    {
        return 0x7f030022;
    }

    protected void initializeViews(Bundle bundle)
    {
        Object obj1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig();
        Object obj = "5";
        bundle = ((Bundle) (obj));
        if (obj1 != null)
        {
            mKillSwitchWithRewards = false;
            if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj1)).getKillSwitchWithRewards() != null)
            {
                mKillSwitchWithRewards = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj1)).getKillSwitchWithRewards());
            }
            bundle = ((Bundle) (obj));
            if (!mKillSwitchWithRewards)
            {
                bundle = ((Bundle) (obj));
                if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj1)).getLoyaltyFriendInviteRewardAmt() != null)
                {
                    obj = (TextView)findViewById(0x7f0d0126);
                    bundle = ((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj1)).getLoyaltyFriendInviteRewardAmt();
                    if (bundle.length() > 1)
                    {
                        obj1 = bundle.substring(1, bundle.length());
                        float f = ((TextView) (obj)).getPaint().measureText(((String) (obj1)));
                        Logger.debug("Yes2YouInviteFriendsActivity", (new StringBuilder()).append("extraDigits = ").append(((String) (obj1))).toString());
                        Logger.debug("Yes2YouInviteFriendsActivity", (new StringBuilder()).append("extraPadding = ").append(f).toString());
                        obj1 = (TextView)findViewById(0x7f0d0125);
                        ((TextView) (obj1)).setX(((TextView) (obj1)).getX() - f);
                        ((TextView) (obj)).setX(((TextView) (obj)).getX() - f);
                        obj1 = (ImageView)findViewById(0x7f0d0123);
                    }
                    ((TextView) (obj)).setText(bundle);
                }
            }
        }
        updateUserInterfaceToDefault();
        obj = (TextView)findViewById(0x7f0d0124);
        obj1 = String.format(getString(0x7f08013d), new Object[] {
            bundle
        });
        bundle = String.format(getString(0x7f08013e), new Object[] {
            bundle
        });
        bundle = new SpannableString((new StringBuilder()).append(((String) (obj1))).append(" ").append(bundle).toString());
        bundle.setSpan(new StyleSpan(1), 0, ((String) (obj1)).length(), 33);
        ((TextView) (obj)).setText(bundle);
        bundle = (TextView)findViewById(0x7f0d012e);
        obj1 = getString(0x7f080140);
        obj = getString(0x7f080141);
        obj1 = (new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString();
        SpannableString spannablestring = new SpannableString(((CharSequence) (obj1)));
        spannablestring.setSpan(new CustomClickableSpan(), ((String) (obj1)).indexOf(((String) (obj))), ((String) (obj1)).length(), 33);
        bundle.setText(spannablestring);
        bundle.setMovementMethod(LinkMovementMethod.getInstance());
        mCmsDataRetriver = new CMSDataRetriver(this);
        mCmsDataRetriver.getCMSAdapterValues();
        AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_INVITE_FRIEND);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarForYes2YouInviteFriendScreen(getString(0x7f080137));
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }







/*
    static String access$602(Yes2YouInviteFriendActivity yes2youinvitefriendactivity, String s)
    {
        yes2youinvitefriendactivity.mErrorCode = s;
        return s;
    }

*/



}
