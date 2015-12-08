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
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.Session;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.asynctask.BaseAsyncTask;
import com.kohls.mcommerce.opal.wallet.asynctask.GetActivityLinksData;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.TransactionDetailService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ActivityDetailResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.OrderDetails;
import com.kohls.mcommerce.opal.wallet.rest.containers.OrderItems;
import com.kohls.mcommerce.opal.wallet.rest.containers.TransactionDetail;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.CustomTypeFace;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class TransactionDetailActivity extends Activity
    implements ActionListener
{
    class GetTransactionDetailsTask extends BaseAsyncTask
    {

        private Context mContext;
        final TransactionDetailActivity this$0;

        protected transient ActivityDetailResponse doInBackground(Void avoid[])
        {
            avoid = null;
            if (mContext == null)
            {
                return null;
            }
            if (canAccessNetwork())
            {
                ActivityDetailResponse activitydetailresponse = (new TransactionDetailService(new WeakReference(mContext))).getActivityData(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref(), mIdForDetail);
                if (mContext == null)
                {
                    return null;
                }
                if (activitydetailresponse == null)
                {
                    return null;
                }
                if (activitydetailresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR)
                {
                    showSignInPage();
                    return null;
                }
                avoid = activitydetailresponse;
                if (activitydetailresponse.getErrors() != null)
                {
                    avoid = activitydetailresponse;
                    if (activitydetailresponse.getErrors().size() > 0)
                    {
                        int i = ((ErrorResponse)activitydetailresponse.getErrors().get(0)).getErrorCode();
                        if (i == 5)
                        {
                            avoid = activitydetailresponse;
                            if (activitydetailresponse != null)
                            {
                                avoid = activitydetailresponse;
                                if (activitydetailresponse.isSuccess())
                                {
                                    LocalBroadcastManager.getInstance(mContext).sendBroadcast(new Intent("signin_page"));
                                    return null;
                                }
                            }
                        } else
                        {
                            avoid = activitydetailresponse;
                            if (i == 4)
                            {
                                avoid = activitydetailresponse;
                                if (!Appconfig.isSignInShown)
                                {
                                    showSignInPage();
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
            if (avoid != null && !avoid.isSuccess())
            {
                return null;
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

        protected void onPostExecute(ActivityDetailResponse activitydetailresponse)
        {
            super.onPostExecute(activitydetailresponse);
            if (mContext != null && activitydetailresponse != null)
            {
                setUpViewForPage(activitydetailresponse);
            }
            ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(8);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((ActivityDetailResponse)obj);
        }

        protected void onPreExecute()
        {
            if (mContext == null)
            {
                return;
            } else
            {
                ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(0);
                super.onPreExecute();
                return;
            }
        }

        public GetTransactionDetailsTask(Context context)
        {
            this$0 = TransactionDetailActivity.this;
            super(context);
            mContext = context;
        }
    }

    public class OrderItemAdapter extends BaseAdapter
    {

        private Context mContext;
        private List mOrderItems;
        final TransactionDetailActivity this$0;

        public int getCount()
        {
            return mOrderItems.size();
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
        /* block-local class not found */
        class OrderViewHolder {}

            Object obj;
            SpannableString spannablestring;
            if (view == null)
            {
                view = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(0x7f0300bf, null);
                viewgroup = new OrderViewHolder();
                viewgroup.productTitleTxtView = (TextView)view.findViewById(0x7f0d04bf);
                viewgroup.skuTxtView = (TextView)view.findViewById(0x7f0d04c0);
                viewgroup.qtyTxtView = (TextView)view.findViewById(0x7f0d04c1);
                viewgroup.orderPriceTxtView = (TextView)view.findViewById(0x7f0d04c2);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (OrderViewHolder)view.getTag();
            }
            obj = getResources();
            ((OrderViewHolder) (viewgroup)).productTitleTxtView.setText(((OrderItems)mOrderItems.get(i)).getProductTitle());
            ((OrderViewHolder) (viewgroup)).skuTxtView.setText((new StringBuilder()).append(((Resources) (obj)).getString(0x7f0804e1)).append(" ").append(((OrderItems)mOrderItems.get(i)).getSkuCode()).toString());
            ((OrderViewHolder) (viewgroup)).qtyTxtView.setText((new StringBuilder()).append(((Resources) (obj)).getString(0x7f08045b)).append(" ").append(((OrderItems)mOrderItems.get(i)).getQty()).toString());
            obj = (new StringBuilder()).append(getResources().getString(0x7f080447)).append(" ").append("$").append(DateUtils.formatPriceTxt(((OrderItems)mOrderItems.get(i)).getLineCost())).toString();
            i = getResources().getString(0x7f080447).length();
            spannablestring = new SpannableString(((CharSequence) (obj)));
            spannablestring.setSpan(new TextAppearanceSpan(mContext, 0x7f0f001d), 0, i, 0);
            spannablestring.setSpan(new CustomTypeFace(WalletFontCache.getGothamBold(getApplicationContext())), 0, i, 0);
            spannablestring.setSpan(new TextAppearanceSpan(mContext, 0x7f0f001e), i, ((String) (obj)).length(), 0);
            spannablestring.setSpan(new CustomTypeFace(WalletFontCache.getGothamBook(getApplicationContext())), i, ((String) (obj)).length(), 0);
            ((OrderViewHolder) (viewgroup)).orderPriceTxtView.setText(spannablestring);
            return view;
        }

        public OrderItemAdapter(Context context, List list)
        {
            this$0 = TransactionDetailActivity.this;
            super();
            mContext = context;
            mOrderItems = list;
        }
    }


    private View mFooterView;
    private String mIdForDetail;
    private Context mInstance;
    private ListView mOrderItemListView;
    private BroadcastReceiver mUpdateUIReceiver;

    public TransactionDetailActivity()
    {
        mIdForDetail = null;
        mUpdateUIReceiver = new BroadcastReceiver() {

            final TransactionDetailActivity this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (this == null)
                {
                    return;
                }
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref()) && !Appconfig.isSignInShown)
                {
                    (new GetTransactionDetailsTask(mInstance)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    return;
                } else
                {
                    ((Activity)mInstance).finish();
                    return;
                }
            }

            
            {
                this$0 = TransactionDetailActivity.this;
                super();
            }
        };
    }

    private void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(getResources().getString(0x7f080508));
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }

    private void setupExpireView(ActivityDetailResponse activitydetailresponse)
    {
        Object obj = (RelativeLayout)findViewById(0x7f0d0101);
        TextView textview1 = (TextView)findViewById(0x7f0d0234);
        TextView textview2 = (TextView)findViewById(0x7f0d0235);
        TextView textview3 = (TextView)findViewById(0x7f0d0236);
        TextView textview4 = (TextView)findViewById(0x7f0d0237);
        TextView textview5 = (TextView)findViewById(0x7f0d0238);
        TextView textview = (TextView)findViewById(0x7f0d0239);
        mOrderItemListView.addHeaderView(getLayoutInflater().inflate(0x7f030066, null));
        ((RelativeLayout) (obj)).setVisibility(0);
        textview1.setText(activitydetailresponse.getTransaction().getTransactionTitle());
        textview2.setVisibility(0);
        textview2.setText(activitydetailresponse.getTransaction().getTitle());
        textview3.setText(DateUtils.prepareDateWithFormat(activitydetailresponse.getTransaction().getDate()));
        textview4.setText((new StringBuilder()).append(activitydetailresponse.getTransaction().getStoreName()).append(" ").append(activitydetailresponse.getTransaction().getEventType()).toString());
        textview5.setText((new StringBuilder()).append(getResources().getString(0x7f0801d5)).append(" ").append(activitydetailresponse.getTransaction().getPointsEarned()).toString());
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        activitydetailresponse = new ClickableSpan() {

            final TransactionDetailActivity this$0;

            public void onClick(View view)
            {
                (new GetActivityLinksData(mInstance)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }

            
            {
                this$0 = TransactionDetailActivity.this;
                super();
            }
        };
        obj = new SpannableString(getResources().getString(0x7f0801ff));
        ((SpannableString) (obj)).setSpan(activitydetailresponse, 0, getResources().getString(0x7f0801ff).length(), 33);
        textview.append((new StringBuilder()).append(getResources().getString(0x7f0801fa)).append(" ").toString());
        textview.append(((CharSequence) (obj)));
        textview.append((new StringBuilder()).append(" ").append(getResources().getString(0x7f0801fb)).toString());
        mOrderItemListView.setAdapter(new OrderItemAdapter(this, new ArrayList()));
    }

    private void setupTransactionView(ActivityDetailResponse activitydetailresponse)
    {
        Resources resources = getResources();
        Object obj = WalletFontCache.getGothamBook(getApplicationContext());
        android.graphics.Typeface typeface = WalletFontCache.getGothamBold(getApplicationContext());
        mOrderItemListView.addHeaderView(getLayoutInflater().inflate(0x7f03010e, null));
        mFooterView = getLayoutInflater().inflate(0x7f03010d, null);
        mOrderItemListView.addFooterView(mFooterView);
        Object obj2 = (TextView)findViewById(0x7f0d0235);
        Object obj3 = (RelativeLayout)findViewById(0x7f0d0101);
        TextView textview3 = (TextView)findViewById(0x7f0d0236);
        Object obj1 = (TextView)findViewById(0x7f0d06c3);
        TextView textview1 = (TextView)findViewById(0x7f0d0238);
        TextView textview2 = (TextView)findViewById(0x7f0d06c4);
        TextView textview = (TextView)findViewById(0x7f0d06c6);
        ((RelativeLayout) (obj3)).setVisibility(0);
        ((TextView) (obj2)).setText(activitydetailresponse.getTransaction().getTransactionTitle().toUpperCase());
        textview3.setText(DateUtils.prepareDateWithFormat(activitydetailresponse.getTransaction().getDate()));
        obj2 = (new StringBuilder()).append(resources.getString(0x7f080447)).append(" ").append("$").append(DateUtils.formatPriceTxt(activitydetailresponse.getTransaction().getOrderDetails().getQualifyingTotal())).toString();
        int i = resources.getString(0x7f080447).length();
        obj3 = new SpannableString(((CharSequence) (obj2)));
        ((SpannableString) (obj3)).setSpan(new TextAppearanceSpan(this, 0x7f0f001d), 0, i, 0);
        ((SpannableString) (obj3)).setSpan(new CustomTypeFace(typeface), 0, i, 0);
        ((SpannableString) (obj3)).setSpan(new TextAppearanceSpan(this, 0x7f0f001e), i, ((String) (obj2)).length(), 0);
        ((SpannableString) (obj3)).setSpan(new CustomTypeFace(((android.graphics.Typeface) (obj))), i, ((String) (obj2)).length(), 0);
        ((TextView) (obj1)).setText(((CharSequence) (obj3)));
        obj1 = (new StringBuilder()).append(resources.getString(0x7f0801d5)).append(" ").append(activitydetailresponse.getTransaction().getPointsEarned()).toString();
        i = resources.getString(0x7f0801d5).length();
        obj2 = new SpannableString(((CharSequence) (obj1)));
        ((SpannableString) (obj2)).setSpan(new TextAppearanceSpan(this, 0x7f0f001d), 0, i, 0);
        ((SpannableString) (obj2)).setSpan(new CustomTypeFace(typeface), 0, i, 0);
        ((SpannableString) (obj2)).setSpan(new TextAppearanceSpan(this, 0x7f0f001e), i, ((String) (obj1)).length(), 0);
        ((SpannableString) (obj2)).setSpan(new CustomTypeFace(((android.graphics.Typeface) (obj))), i, ((String) (obj1)).length(), 0);
        textview1.setText(((CharSequence) (obj2)));
        textview2.setText((new StringBuilder()).append(resources.getString(0x7f080177)).append(" ").append(activitydetailresponse.getTransaction().getOrderDetails().getBasePoints()).toString());
        ((TextView)findViewById(0x7f0d06c5)).setText((new StringBuilder()).append(resources.getString(0x7f080185)).append(" ").append(activitydetailresponse.getTransaction().getOrderDetails().getBonusPoints()).toString());
        if (activitydetailresponse.getTransaction().getId().length() > 4)
        {
            obj = activitydetailresponse.getTransaction().getId().substring(0, 4);
        } else
        {
            obj = activitydetailresponse.getTransaction().getId();
        }
        textview.setText((new StringBuilder()).append(resources.getString(0x7f0803f0)).append(" ").append("#").append(((String) (obj))).toString());
        mOrderItemListView.setAdapter(new OrderItemAdapter(this, activitydetailresponse.getTransaction().getOrderDetails().getOrderItems()));
        ((TextView)findViewById(0x7f0d06c2)).setText((new StringBuilder()).append("$ ").append(DateUtils.formatPriceTxt(activitydetailresponse.getTransaction().getOrderDetails().getOrderTotal())).toString());
    }

    public void onActionPerformed()
    {
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1)
        {
            Session.getActiveSession().onActivityResult(this, i, j, intent);
            (new GetTransactionDetailsTask(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001d);
        mInstance = this;
        mIdForDetail = getIntent().getStringExtra("detailid");
        setUpActionBar();
        LocalBroadcastManager.getInstance(this).registerReceiver(mUpdateUIReceiver, new IntentFilter("signin_page"));
        ListenerManager.getInstance().registerListener(this, "activitylink");
        (new GetTransactionDetailsTask(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mUpdateUIReceiver);
        ListenerManager.getInstance().unRegisterListener("activitylink");
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    protected void setUpViewForPage(ActivityDetailResponse activitydetailresponse)
    {
        activitydetailresponse.getTransaction().setEventType(getIntent().getStringExtra("eventtype"));
        mOrderItemListView = (ListView)findViewById(0x7f0d0102);
        mOrderItemListView.setHeaderDividersEnabled(false);
        mOrderItemListView.setFooterDividersEnabled(false);
        if (activitydetailresponse.getTransaction().getEventType().equals("Expire"))
        {
            setupExpireView(activitydetailresponse);
        } else
        {
            setupTransactionView(activitydetailresponse);
        }
        OmnitureMeasurement.getInstance().setRewardsActivityDetailsPageEvents();
    }


}
