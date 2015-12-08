// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.loyalty.FilterActivity;
import com.kohls.mcommerce.opal.wallet.asynctask.BaseAsyncTask;
import com.kohls.mcommerce.opal.wallet.rest.ActivityHistoryService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ActivityHistoryResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.KohlsCash;
import com.kohls.mcommerce.opal.wallet.rest.containers.RewardInformation;
import com.kohls.mcommerce.opal.wallet.rest.containers.TransactionInformation;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import com.kohls.mcommerce.opal.wallet.util.KohlsError;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            RewardDetailActivity, TransactionDetailActivity

public class DisplayActivityList extends Activity
    implements android.widget.AdapterView.OnItemClickListener
{
    private class ActivityAdapter extends BaseAdapter
    {

        private List mActivityList;
        private Context mContext;
        private ActivityViewHolder mHolder;
        final DisplayActivityList this$0;

        private void createRewardView(View view, RewardInformation rewardinformation)
        {
        /* block-local class not found */
        class ActivityViewHolder {}

            if (rewardinformation.getKohlsCash() != null)
            {
                ActivityViewHolder.access._mth100(mHolder).setText("REWARDS CASH ISSUED!");
                String s = (new StringBuilder()).append(getResources().getString(0x7f0801bc)).append(" ").append(rewardinformation.getEventType()).toString();
                view = s;
                if (!TextUtils.isEmpty(rewardinformation.getDescription()))
                {
                    view = (new StringBuilder()).append(s).append("\n").append(rewardinformation.getDescription()).toString();
                }
                ActivityViewHolder.access._mth300(mHolder).setText(view);
                ActivityViewHolder.access._mth600(mHolder).setVisibility(8);
                ActivityViewHolder.access._mth1100(mHolder).setImageDrawable(getResources().getDrawable(0x7f0201d2));
                ActivityViewHolder.access._mth1100(mHolder).setVisibility(0);
                if (rewardinformation.getKohlsCash().getEffectiveEndDate() == null)
                {
                    ActivityViewHolder.access._mth1100(mHolder).setImageDrawable(null);
                    ActivityViewHolder.access._mth200(mHolder).setVisibility(8);
                } else
                {
                    view = new SpannableStringBuilder((new StringBuilder()).append("$").append(DateUtils.formatPriceTxt(rewardinformation.getKohlsCash().getBalance())).toString());
                    view.setSpan(new SuperscriptSpan(), 0, 1, 33);
                    view.setSpan(new TextAppearanceSpan(getApplicationContext(), 0x7f0f005e), 0, 1, 33);
                    view.setSpan(new TextAppearanceSpan(getApplicationContext(), 0x7f0f0059), 1, view.length(), 33);
                    ActivityViewHolder.access._mth500(mHolder).setText(view);
                    if (Long.parseLong(rewardinformation.getKohlsCash().getEffectiveEndDate()) + 0x5265c00L < System.currentTimeMillis())
                    {
                        ActivityViewHolder.access._mth900(mHolder).setVisibility(8);
                        ActivityViewHolder.access._mth800(mHolder).setVisibility(0);
                        ActivityViewHolder.access._mth800(mHolder).setText(getResources().getString(0x7f0801fc));
                        ActivityViewHolder.access._mth500(mHolder).setTextColor(getResources().getColor(0x7f0c00cf));
                    } else
                    {
                        ActivityViewHolder.access._mth900(mHolder).setVisibility(0);
        /* block-local class not found */
        class _cls1 {}

                        ActivityViewHolder.access._mth900(mHolder).setOnClickListener(new _cls1());
                        ActivityViewHolder.access._mth800(mHolder).setVisibility(0);
                        ActivityViewHolder.access._mth800(mHolder).setText(getResources().getString(0x7f08012e));
                        ActivityViewHolder.access._mth900(mHolder).setText(getResources().getString(0x7f08053f));
                        ActivityViewHolder.access._mth500(mHolder).setTextColor(getResources().getColor(0x7f0c00d1));
                    }
                    ActivityViewHolder.access._mth1100(mHolder).setImageDrawable(getResources().getDrawable(0x7f0201d2));
                    view = DateUtils.prepareDate(rewardinformation.getKohlsCash().getEffectiveEndDate());
                    view = (new StringBuilder()).append(getResources().getString(0x7f0801f9)).append(" ").append(view).toString();
                    ActivityViewHolder.access._mth200(mHolder).setVisibility(0);
                    ActivityViewHolder.access._mth200(mHolder).setText(view);
                }
                s = (new StringBuilder()).append(getResources().getString(0x7f080526)).append(" ").append(rewardinformation.getEventType()).toString();
                view = s;
                if (!TextUtils.isEmpty(rewardinformation.getDescription()))
                {
                    view = (new StringBuilder()).append(s).append("\n").append(rewardinformation.getDescription()).toString();
                }
                ActivityViewHolder.access._mth300(mHolder).setText(view);
                ActivityViewHolder.access._mth700(mHolder).setFocusable(false);
                return;
            }
            setTitleandPointsText(rewardinformation.getEventType(), rewardinformation.getPointsEarned());
            ActivityViewHolder.access._mth600(mHolder).setVisibility(0);
            String s1 = (new StringBuilder()).append(getResources().getString(0x7f080526)).append(" ").append(rewardinformation.getEventType()).toString();
            view = s1;
            if (!TextUtils.isEmpty(rewardinformation.getDescription()))
            {
                view = (new StringBuilder()).append(s1).append("\n").append(rewardinformation.getDescription()).toString();
            }
            ActivityViewHolder.access._mth300(mHolder).setText(view);
            ActivityViewHolder.access._mth200(mHolder).setText((new StringBuilder()).append(getResources().getString(0x7f0801bc)).append(" ").append(DateUtils.prepareDateWithFormat(rewardinformation.getDate())).toString());
            ActivityViewHolder.access._mth400(mHolder).setVisibility(8);
            ActivityViewHolder.access._mth900(mHolder).setVisibility(8);
            ActivityViewHolder.access._mth1100(mHolder).setImageDrawable(null);
            ActivityViewHolder.access._mth700(mHolder).setFocusable(true);
        }

        private void createTransactionView(TransactionInformation transactioninformation)
        {
            Resources resources;
            resources = getResources();
            ActivityViewHolder.access._mth100(mHolder).setText(transactioninformation.getTitle());
            ActivityViewHolder.access._mth900(mHolder).setVisibility(8);
            ActivityViewHolder.access._mth800(mHolder).setVisibility(8);
            ActivityViewHolder.access._mth600(mHolder).setVisibility(0);
            if (!transactioninformation.getTitle().equals("Purchase")) goto _L2; else goto _L1
_L1:
            ActivityViewHolder.access._mth100(mHolder).setText((new StringBuilder()).append(resources.getString(0x7f080456)).append(" ").append(transactioninformation.getPointsEarned()).append(" ").append(resources.getString(0x7f080440)).toString());
            ActivityViewHolder.access._mth300(mHolder).setText((new StringBuilder()).append(resources.getString(0x7f080526)).append(" ").append(resources.getString(0x7f080269)).append(" ").append(transactioninformation.getEventType()).toString());
            ActivityViewHolder.access._mth500(mHolder).setText(transactioninformation.getPointsEarned());
            ActivityViewHolder.access._mth500(mHolder).setTextColor(getResources().getColor(0x7f0c00d1));
            ActivityViewHolder.access._mth400(mHolder).setVisibility(8);
_L4:
            ActivityViewHolder.access._mth200(mHolder).setText((new StringBuilder()).append(resources.getString(0x7f0801bc)).append(" ").append(DateUtils.prepareDateWithFormat(transactioninformation.getDate())).toString());
            ActivityViewHolder.access._mth1100(mHolder).setImageDrawable(getResources().getDrawable(0x7f0201d2));
            ActivityViewHolder.access._mth700(mHolder).setFocusable(false);
            return;
_L2:
            if (transactioninformation.getTitle().equals("Return"))
            {
                ActivityViewHolder.access._mth100(mHolder).setText(resources.getString(0x7f080482));
                ActivityViewHolder.access._mth300(mHolder).setText((new StringBuilder()).append(resources.getString(0x7f080526)).append(" ").append(transactioninformation.getEventType()).toString());
                ActivityViewHolder.access._mth400(mHolder).setVisibility(0);
                String s = (new StringBuilder()).append(resources.getString(0x7f08043d)).append(" ").append(transactioninformation.getPointsEarned()).toString();
                ActivityViewHolder.access._mth400(mHolder).setText(s);
                ActivityViewHolder.access._mth500(mHolder).setText(transactioninformation.getPointsEarned());
                ActivityViewHolder.access._mth500(mHolder).setTextColor(getResources().getColor(0x7f0c00cf));
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private int formatEarnedPoints(String s)
        {
            int j = 0;
            int i;
            try
            {
                i = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return j;
            }
            j = i;
            if (i >= 0)
            {
                break MISSING_BLOCK_LABEL_24;
            }
            j = i;
            i = Integer.parseInt(s);
            j = i * -1;
            return j;
        }

        private void setTitleandPointsText(String s, String s1)
        {
            if (s.equalsIgnoreCase("Donate"))
            {
                int i = 0;
                if (!TextUtils.isEmpty(s1))
                {
                    i = formatEarnedPoints(s1);
                }
                ActivityViewHolder.access._mth100(mHolder).setText((new StringBuilder()).append(getResources().getString(0x7f0801d2)).append(" ").append(i).append(" ").append(getResources().getString(0x7f080440)).toString());
                ActivityViewHolder.access._mth500(mHolder).setTextColor(getResources().getColor(0x7f0c00cf));
            } else
            if (s.equalsIgnoreCase("Gift"))
            {
                int j = 0;
                if (!TextUtils.isEmpty(s1))
                {
                    j = formatEarnedPoints(s1);
                }
                ActivityViewHolder.access._mth100(mHolder).setText((new StringBuilder()).append(getResources().getString(0x7f080221)).append(" ").append(j).append(" ").append(getResources().getString(0x7f080440)).toString());
                ActivityViewHolder.access._mth500(mHolder).setTextColor(getResources().getColor(0x7f0c00cf));
            } else
            {
                ActivityViewHolder.access._mth100(mHolder).setText((new StringBuilder()).append(getResources().getString(0x7f080456)).append(" ").append(s1).append(" ").append(getResources().getString(0x7f080440)).toString());
                ActivityViewHolder.access._mth500(mHolder).setTextColor(getResources().getColor(0x7f0c00d1));
            }
            ActivityViewHolder.access._mth500(mHolder).setText(s1);
        }

        public int getCount()
        {
            return mActivityList.size();
        }

        public Object getItem(int i)
        {
            return null;
        }

        public long getItemId(int i)
        {
            return 0L;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            LayoutInflater layoutinflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
            if (view == null)
            {
                view = layoutinflater.inflate(0x7f030011, viewgroup, false);
                mHolder = new ActivityViewHolder();
                ActivityViewHolder.access._mth102(mHolder, (TextView)view.findViewById(0x7f0d0065));
                ActivityViewHolder.access._mth202(mHolder, (TextView)view.findViewById(0x7f0d0069));
                ActivityViewHolder.access._mth302(mHolder, (TextView)view.findViewById(0x7f0d006a));
                ActivityViewHolder.access._mth402(mHolder, (TextView)view.findViewById(0x7f0d006b));
                ActivityViewHolder.access._mth502(mHolder, (TextView)view.findViewById(0x7f0d0067));
                ActivityViewHolder.access._mth602(mHolder, (TextView)view.findViewById(0x7f0d0068));
                ActivityViewHolder.access._mth702(mHolder, (LinearLayout)view.findViewById(0x7f0d0062));
                ActivityViewHolder.access._mth802(mHolder, (TextView)view.findViewById(0x7f0d006c));
                ActivityViewHolder.access._mth902(mHolder, (Button)view.findViewById(0x7f0d006d));
                ActivityViewHolder.access._mth1002(mHolder, view.findViewById(0x7f0d006f));
                ActivityViewHolder.access._mth1102(mHolder, (ImageView)view.findViewById(0x7f0d006e));
                view.setTag(mHolder);
            } else
            {
                mHolder = (ActivityViewHolder)view.getTag();
            }
            if (i == mActivityList.size() - 1)
            {
                ActivityViewHolder.access._mth1000(mHolder).setVisibility(8);
            } else
            {
                ActivityViewHolder.access._mth1000(mHolder).setVisibility(0);
            }
            viewgroup = ((ViewGroup) (mActivityList.get(i)));
            ActivityViewHolder.access._mth700(mHolder).setFocusable(true);
            if (viewgroup instanceof TransactionInformation)
            {
                createTransactionView((TransactionInformation)viewgroup);
            } else
            if (viewgroup instanceof RewardInformation)
            {
                createRewardView(view, (RewardInformation)viewgroup);
                return view;
            }
            return view;
        }


        public ActivityAdapter(Context context, List list)
        {
            this$0 = DisplayActivityList.this;
            super();
            mActivityList = list;
            mContext = context;
        }
    }

    protected class GetActivityHistoryData extends BaseAsyncTask
    {

        private Context mContext;
        final DisplayActivityList this$0;

        private void displayErrorDialog(String s)
        {
            Intent intent = (new Intent(mContext, com/kohls/mcommerce/opal/wallet/util/DisplayErrorDialog)).setFlags(0x10020000);
            intent.putExtra("ServerError", s);
            mContext.startActivity(intent);
        }

        protected transient ActivityHistoryResponse doInBackground(Void avoid[])
        {
            avoid = null;
            if (mContext == null)
            {
                return null;
            }
            if (canAccessNetwork())
            {
                Object obj = (new ActivityHistoryService(new WeakReference(mContext))).getActivityHistoryData(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref(), mPeriod, mType);
                if (mContext == null)
                {
                    return null;
                }
                if (obj == null)
                {
                    return null;
                }
                if (((ActivityHistoryResponse) (obj)).getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR)
                {
                    showSignInPage();
                    return null;
                }
                if (((ActivityHistoryResponse) (obj)).getErrors() != null && ((ActivityHistoryResponse) (obj)).getErrors().size() > 0 && ((ErrorResponse)((ActivityHistoryResponse) (obj)).getErrors().get(0)).getErrorCode() == 4 && !Appconfig.isSignInShown)
                {
                    showSignInPage();
                    return null;
                }
                if (((ActivityHistoryResponse) (obj)).getHttpStatusCode() != -1 && ((ActivityHistoryResponse) (obj)).getHttpStatusCode() != 200)
                {
                    obj = KohlsError.getInstance().getErrorMessage(((ActivityHistoryResponse) (obj)).getRequestType(), String.valueOf(((ActivityHistoryResponse) (obj)).getHttpStatusCode()));
                    avoid = ((Void []) (obj));
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        avoid = KohlsError.getInstance().getErrorMessage(String.valueOf("defaultHttpErrorMessage"));
                    }
                    displayErrorDialog(avoid);
                    return null;
                }
                avoid = ((Void []) (obj));
                if (obj != null)
                {
                    avoid = ((Void []) (obj));
                    if (!((ActivityHistoryResponse) (obj)).isSuccess())
                    {
                        displayErrorDialog(KohlsError.getInstance().getErrorMessage(String.valueOf("defaultMessage")));
                        return null;
                    }
                }
            }
            if (mContext == null)
            {
                return null;
            } else
            {
                return avoid;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(ActivityHistoryResponse activityhistoryresponse)
        {
            super.onPostExecute(activityhistoryresponse);
            if (mContext != null)
            {
                setupView(activityhistoryresponse);
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((ActivityHistoryResponse)obj);
        }

        public GetActivityHistoryData(Context context)
        {
            this$0 = DisplayActivityList.this;
            super(context);
            mContext = context;
        }
    }


    private List mActivityList;
    private ActivityAdapter mAdapter;
    private ListView mListView;
    private int mOmniture_count;
    private String mPeriod;
    private String mType;
    private BroadcastReceiver mUpdateUIReceiver;

    public DisplayActivityList()
    {
        mType = "all";
        mPeriod = "1";
        mOmniture_count = 0;
        mUpdateUIReceiver = new BroadcastReceiver() {

            final DisplayActivityList this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()) && !Appconfig.isSignInShown)
                {
                    (new GetActivityHistoryData(DisplayActivityList.this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    return;
                } else
                {
                    finish();
                    return;
                }
            }

            
            {
                this$0 = DisplayActivityList.this;
                super();
            }
        };
    }

    private void getDurationSpinnerData(int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            mPeriod = "1";
            return;

        case 1: // '\001'
            mPeriod = "6";
            return;

        case 2: // '\002'
            mPeriod = "12";
            return;

        case 3: // '\003'
            mPeriod = "12";
            break;
        }
    }

    private void getTypeSpinnerData(int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            mType = "all";
            return;

        case 1: // '\001'
            mType = "purchase";
            return;

        case 2: // '\002'
            mType = "return";
            return;

        case 3: // '\003'
            mType = "reward";
            return;

        case 4: // '\004'
            mType = "others";
            break;
        }
    }

    private void populateActivityListData(ActivityHistoryResponse activityhistoryresponse)
    {
        mActivityList.clear();
        if (activityhistoryresponse.getTransactions() != null && activityhistoryresponse.getTransactions().size() > 0)
        {
            mActivityList.addAll(activityhistoryresponse.getTransactions());
        }
        if (activityhistoryresponse.getRewards() != null && activityhistoryresponse.getRewards().size() > 0)
        {
            mActivityList.addAll(activityhistoryresponse.getRewards());
        }
        if (mActivityList != null && mActivityList.size() > 0)
        {
            Collections.sort(mActivityList, new Comparator() {

                final DisplayActivityList this$0;

                private Long getTimeStamp(Object obj)
                {
                    if (obj instanceof TransactionInformation)
                    {
                        return DateUtils.getDateInMiliSeconds(((TransactionInformation)obj).getDate());
                    }
                    if (obj instanceof RewardInformation)
                    {
                        return DateUtils.getDateInMiliSeconds(((RewardInformation)obj).getDate());
                    } else
                    {
                        return null;
                    }
                }

                public int compare(Object obj, Object obj1)
                {
                    return getTimeStamp(obj1).compareTo(getTimeStamp(obj));
                }

            
            {
                this$0 = DisplayActivityList.this;
                super();
            }
            });
        }
    }

    private void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(getResources().getString(0x7f080130));
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }

    private void setupSpinners()
    {
        getDurationSpinnerData(getIntent().getIntExtra("view", 0));
        getTypeSpinnerData(getIntent().getIntExtra("type", 0));
        (new GetActivityHistoryData(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void setupView(ActivityHistoryResponse activityhistoryresponse)
    {
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
        if (activityhistoryresponse == null || !activityhistoryresponse.isSuccess())
        {
            return;
        }
        TextView textview = (TextView)findViewById(0x7f0d0049);
        TextView textview1 = (TextView)findViewById(0x7f0d0047);
        textview1.setClickable(true);
        mActivityList = new ArrayList();
        populateActivityListData(activityhistoryresponse);
        mAdapter = new ActivityAdapter(this, mActivityList);
        mListView.setAdapter(mAdapter);
        if (mActivityList == null || mActivityList.size() == 0)
        {
            textview.setVisibility(0);
        } else
        {
            mListView.setOnItemClickListener(this);
            textview.setVisibility(8);
        }
        textview1.setOnClickListener(new android.view.View.OnClickListener() {

            final DisplayActivityList this$0;

            public void onClick(View view)
            {
                view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/FilterActivity);
                view.putExtra("filter", "home_filter");
                view.putExtra("view", getIntent().getIntExtra("view", 0));
                view.putExtra("type", getIntent().getIntExtra("type", 0));
                startActivity(view);
                finish();
            }

            
            {
                this$0 = DisplayActivityList.this;
                super();
            }
        });
        findViewById(0x7f0d0118).setVisibility(4);
        if (mOmniture_count > 0)
        {
            OmnitureMeasurement.getInstance().setRewardsActivityPageEvents();
        }
        mOmniture_count = mOmniture_count + 1;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1)
        {
            (new GetActivityHistoryData(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03000c);
        setupSpinners();
        mListView = (ListView)findViewById(0x7f0d0048);
        setUpActionBar();
        LocalBroadcastManager.getInstance(this).registerReceiver(mUpdateUIReceiver, new IntentFilter("signin_page"));
    }

    protected void onDestroy()
    {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mUpdateUIReceiver);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (mAdapter.mActivityList.get(i)));
        if (adapterview instanceof RewardInformation)
        {
            if (((RewardInformation)adapterview).getKohlsCash() != null && ((RewardInformation)adapterview).getKohlsCash().getEffectiveEndDate() != null && ((RewardInformation)adapterview).getKohlsCash().getEffectiveStartDate() != null && ((RewardInformation)adapterview).getKohlsCash().getBalance() != null)
            {
                view = new Intent(this, com/kohls/mcommerce/opal/wallet/fragment/RewardDetailActivity);
                view.putExtra("rewarditem", (RewardInformation)adapterview);
                startActivity(view);
            }
        } else
        if (mAdapter.mActivityList.get(i) instanceof TransactionInformation)
        {
            view = new Intent(this, com/kohls/mcommerce/opal/wallet/fragment/TransactionDetailActivity);
            view.putExtra("detailid", ((TransactionInformation)adapterview).getId());
            view.putExtra("eventtype", ((TransactionInformation)adapterview).getEventType());
            startActivity(view);
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }



}
