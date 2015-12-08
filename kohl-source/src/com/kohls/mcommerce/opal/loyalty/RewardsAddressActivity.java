// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.asynctask.GetLoyaltyDataTask;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.Address;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;
import com.kohls.mcommerce.opal.wallet.util.UserInfoUtil;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            EditRewardsAddressActivity, EditRewardsPhoneActivity, AddBirthdayActivity

public class RewardsAddressActivity extends Activity
    implements ActionListener, android.view.View.OnClickListener
{

    public static final int REQUEST_CODE_EDIT_ADDRESS = 100;
    public static final int REQUEST_CODE_EDIT_PHONE = 101;
    private ProfileData mProfileData;
    private LoyaltyProfileResponse mRewardData;

    public RewardsAddressActivity()
    {
    }

    private void setAddressLayout(ProfileData profiledata)
    {
        Object obj1 = (TextView)findViewById(0x7f0d00df);
        Object obj = (TextView)findViewById(0x7f0d00e0);
        TextView textview = (TextView)findViewById(0x7f0d00e1);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0d00dc);
        relativelayout.setClickable(true);
        relativelayout.setOnClickListener(this);
        boolean flag;
        if (!TextUtils.isEmpty(profiledata.getAddress().getAddr1()) && !profiledata.getAddress().getAddr1().equalsIgnoreCase(" "))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !TextUtils.isEmpty(profiledata.getAddress().getCity()) && !profiledata.getAddress().getCity().equalsIgnoreCase(" "))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !TextUtils.isEmpty(profiledata.getAddress().getState()) && !profiledata.getAddress().getState().equalsIgnoreCase(" "))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (profiledata.getAddress() == null || profiledata.getAddress() != null && flag)
        {
            String s = profiledata.getAddress().getAddr1();
            if (!TextUtils.isEmpty(s))
            {
                ((TextView) (obj1)).setText(s);
            }
            obj1 = profiledata.getAddress().getAddr2();
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                ((TextView) (obj)).setText(((CharSequence) (obj1)));
            } else
            {
                ((TextView) (obj)).setVisibility(8);
            }
            obj = profiledata.getAddress().getCity();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = "";
            } else
            {
                obj = (new StringBuilder()).append(((String) (obj))).append(",").append(" ").toString();
            }
            obj1 = profiledata.getAddress().getState();
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1))).append(" ").toString();
            }
            profiledata = profiledata.getAddress().getPostalCode();
            if (!TextUtils.isEmpty(profiledata))
            {
                obj = (new StringBuilder()).append(((String) (obj))).append(profiledata).toString();
            }
            textview.setText(((CharSequence) (obj)));
            return;
        } else
        {
            ((TextView)findViewById(0x7f0d00de)).setVisibility(0);
            ((TextView) (obj1)).setVisibility(8);
            ((TextView) (obj)).setVisibility(8);
            textview.setVisibility(8);
            return;
        }
    }

    private void setBirthDayLayout(ProfileData profiledata)
    {
        profiledata = mRewardData.getProfile().getBirthday();
        TextView textview = (TextView)findViewById(0x7f0d00ed);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0d00ea);
        if (TextUtils.isEmpty(profiledata))
        {
            textview.setText(getResources().getString(0x7f0801e2));
            relativelayout.setClickable(true);
            relativelayout.setOnClickListener(this);
            return;
        } else
        {
            textview.setText(profiledata);
            ((ImageView)findViewById(0x7f0d00ee)).setVisibility(8);
            ((TextView)findViewById(0x7f0d00ec)).setVisibility(8);
            return;
        }
    }

    private void setPhoneLayout(ProfileData profiledata)
    {
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0d00e4);
        TextView textview = (TextView)findViewById(0x7f0d00e7);
        relativelayout.setClickable(true);
        relativelayout.setOnClickListener(this);
        profiledata = profiledata.getPhoneNumber();
        if (!TextUtils.isEmpty(profiledata))
        {
            textview.setText((new StringBuilder()).append("(").append(profiledata.substring(0, 3)).append(")").append(profiledata.substring(3, 6)).append("-").append(profiledata.substring(6)).toString());
            return;
        } else
        {
            textview.setVisibility(8);
            ((TextView)findViewById(0x7f0d00e6)).setVisibility(0);
            return;
        }
    }

    private void setupView()
    {
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(4);
        mRewardData = RewardCache.get(getApplicationContext());
        if (mRewardData == null || !mRewardData.isSuccess())
        {
            return;
        } else
        {
            ((RelativeLayout)findViewById(0x7f0d00da)).setVisibility(0);
            mProfileData = mRewardData.getProfile();
            UserInfoUtil.getUserInfo(this, mProfileData);
            setAddressLayout(mProfileData);
            setPhoneLayout(mProfileData);
            setBirthDayLayout(mProfileData);
            return;
        }
    }

    public void onActionPerformed()
    {
        setupView();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j != -1 || intent == null) goto _L2; else goto _L1
_L1:
        mProfileData = (ProfileData)intent.getExtras().getSerializable("address_data");
        if (mProfileData == null) goto _L2; else goto _L3
_L3:
        i;
        JVM INSTR tableswitch 100 101: default 64
    //                   100 65
    //                   101 74;
           goto _L2 _L4 _L5
_L2:
        return;
_L4:
        setAddressLayout(mProfileData);
        return;
_L5:
        setPhoneLayout(mProfileData);
        return;
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0d00dc)
        {
            view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/EditRewardsAddressActivity);
            Bundle bundle = new Bundle();
            bundle.putSerializable("address_data", mProfileData);
            view.putExtras(bundle);
            startActivityForResult(view, 100);
        } else
        {
            if (view.getId() == 0x7f0d00e4)
            {
                view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/EditRewardsPhoneActivity);
                Bundle bundle1 = new Bundle();
                bundle1.putSerializable("address_data", mProfileData);
                view.putExtras(bundle1);
                startActivityForResult(view, 101);
                return;
            }
            if (view.getId() == 0x7f0d00ea)
            {
                startActivity(new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/AddBirthdayActivity));
                finish();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setUpActionBar();
        setContentView(0x7f030019);
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(0);
        ListenerManager.getInstance().registerListener(this, "onlyreward");
        (new GetLoyaltyDataTask(getApplicationContext(), true, true)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            onBackPressed();
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    protected void onStart()
    {
        super.onStart();
        AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_INFO);
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }
}
