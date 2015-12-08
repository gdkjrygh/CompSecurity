// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.asynctask.BaseAsyncTask;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.KohlsCash;
import com.kohls.mcommerce.opal.wallet.rest.containers.RewardInformation;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.BarcodeCreator;
import com.kohls.mcommerce.opal.wallet.util.CustomTypeFace;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.lang.ref.WeakReference;
import java.util.List;

public class RewardDetailActivity extends Activity
{
    public class GetBarcodeStatusAsyncTask extends BaseAsyncTask
    {

        private Context mContext;
        final RewardDetailActivity this$0;

        protected transient RewardInformation doInBackground(RewardInformation arewardinformation[])
        {
            arewardinformation = arewardinformation[0];
            WalletResponse walletresponse = (new WalletService(new WeakReference(mContext))).getWallentByLookup(arewardinformation.getKohlsCash().getKohlsCashNumber());
            if (arewardinformation.getKohlsCash() != null)
            {
                if (Long.parseLong(arewardinformation.getKohlsCash().getEffectiveEndDate()) + 0x5265c00L < System.currentTimeMillis())
                {
                    arewardinformation.getKohlsCash().setBarcodeStatus(7);
                } else
                if (walletresponse != null && walletresponse.isSuccess() && walletresponse.getWalletItems().size() > 0)
                {
                    if (Double.parseDouble(((WalletItemResponse)walletresponse.getWalletItems().get(0)).getValue()) <= 0.0D)
                    {
                        arewardinformation.getKohlsCash().setBarcodeStatus(6);
                        return arewardinformation;
                    } else
                    {
                        arewardinformation.getKohlsCash().setBarcodeStatus(4);
                        return arewardinformation;
                    }
                }
            }
            return arewardinformation;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((RewardInformation[])aobj);
        }

        protected void onPostExecute(RewardInformation rewardinformation)
        {
            super.onPostExecute(rewardinformation);
            setUpViewForPage(rewardinformation);
            ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(8);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((RewardInformation)obj);
        }

        protected void onPreExecute()
        {
            ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(0);
            super.onPreExecute();
        }

        public GetBarcodeStatusAsyncTask(Context context)
        {
            this$0 = RewardDetailActivity.this;
            super(context);
            mContext = context;
        }
    }


    public RewardDetailActivity()
    {
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

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030018);
        setUpActionBar();
        bundle = (RewardInformation)getIntent().getSerializableExtra("rewarditem");
        if (bundle.getKohlsCash() != null && bundle.getKohlsCash().getEffectiveEndDate() != null)
        {
            (new GetBarcodeStatusAsyncTask(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new RewardInformation[] {
                bundle
            });
            return;
        } else
        {
            bundle.getKohlsCash().setBarcodeStatus(4);
            setUpViewForPage(bundle);
            ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    protected void setUpViewForPage(RewardInformation rewardinformation)
    {
        Resources resources;
        Object obj2;
        Object obj3;
        TextView textview3;
        TextView textview4;
        TextView textview5;
        TextView textview6;
        Object obj4;
        android.graphics.Typeface typeface = WalletFontCache.getGothamBook(getApplicationContext());
        android.graphics.Typeface typeface1 = WalletFontCache.getGothamBold(getApplicationContext());
        resources = getResources();
        obj4 = (RelativeLayout)findViewById(0x7f0d00cc);
        obj2 = (TextView)findViewById(0x7f0d00cd);
        obj3 = (ImageView)findViewById(0x7f0d00d3);
        textview3 = (TextView)findViewById(0x7f0d00d4);
        textview4 = (TextView)findViewById(0x7f0d00d5);
        textview5 = (TextView)findViewById(0x7f0d00d9);
        textview6 = (TextView)findViewById(0x7f0d00d7);
        Object obj = (TextView)findViewById(0x7f0d00ce);
        Object obj1 = (TextView)findViewById(0x7f0d00cf);
        TextView textview = (TextView)findViewById(0x7f0d00d0);
        TextView textview1 = (TextView)findViewById(0x7f0d00d2);
        TextView textview2 = (TextView)findViewById(0x7f0d00d6);
        ((RelativeLayout) (obj4)).setVisibility(0);
        obj4 = rewardinformation.getKohlsCash().getEffectiveEndDate();
        int i;
        if (TextUtils.isEmpty(((CharSequence) (obj4))))
        {
            textview4.setVisibility(8);
            textview6.setVisibility(8);
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            textview4.setVisibility(0);
            textview6.setVisibility(0);
            ((TextView) (obj)).setVisibility(0);
        }
        if (rewardinformation.getKohlsCash().getBarcodeStatus() != 7) goto _L2; else goto _L1
_L1:
        ((TextView) (obj2)).setText("REWARDS ISSUED - EXPIRED");
        textview4.setText((new StringBuilder()).append(resources.getString(0x7f080488)).append(" ").append(DateUtils.prepareDate(((String) (obj4)))).toString());
        ((ImageView) (obj3)).setVisibility(8);
        textview3.setVisibility(8);
        textview5.setVisibility(8);
        textview6.setVisibility(8);
_L4:
        obj2 = (new StringBuilder()).append(resources.getString(0x7f0801f9)).append(" ").append(DateUtils.prepareDate(((String) (obj4)))).toString();
        i = resources.getString(0x7f0801f9).length();
        obj3 = new SpannableString(((CharSequence) (obj2)));
        ((SpannableString) (obj3)).setSpan(new TextAppearanceSpan(this, 0x7f0f001d), 0, i, 0);
        ((SpannableString) (obj3)).setSpan(new CustomTypeFace(typeface1), 0, i, 0);
        ((SpannableString) (obj3)).setSpan(new TextAppearanceSpan(this, 0x7f0f001e), i, ((String) (obj2)).length(), 0);
        ((SpannableString) (obj3)).setSpan(new CustomTypeFace(typeface), i, ((String) (obj2)).length(), 0);
        ((TextView) (obj)).setText(((CharSequence) (obj3)));
        obj = "";
        if (rewardinformation.getKohlsCash().getBalance() != null)
        {
            obj = (new StringBuilder()).append("$").append(rewardinformation.getKohlsCash().getBalance()).toString();
        }
        ((TextView) (obj1)).setText((new StringBuilder()).append(((String) (obj))).append(" ").append(resources.getString(0x7f080487)).toString());
        obj1 = (new StringBuilder()).append(resources.getString(0x7f0801d5)).append(" ").append(rewardinformation.getPointsEarned()).toString();
        i = resources.getString(0x7f0801d5).length();
        obj2 = new SpannableString(((CharSequence) (obj1)));
        ((SpannableString) (obj2)).setSpan(new TextAppearanceSpan(this, 0x7f0f001d), 0, i, 0);
        ((SpannableString) (obj2)).setSpan(new CustomTypeFace(typeface1), 0, i, 0);
        ((SpannableString) (obj2)).setSpan(new TextAppearanceSpan(this, 0x7f0f001e), i, ((String) (obj1)).length(), 0);
        ((SpannableString) (obj2)).setSpan(new CustomTypeFace(typeface), i, ((String) (obj1)).length(), 0);
        textview.setText(((CharSequence) (obj2)));
        textview1.setText((new StringBuilder()).append(((String) (obj))).append(" ").append(resources.getString(0x7f080486)).toString());
        textview2.setText((new StringBuilder()).append(resources.getString(0x7f080176)).append(" ").append(rewardinformation.getKohlsCash().getKohlsCashNumber()).toString());
        OmnitureMeasurement.getInstance().setRewardsActivityDetailsPageEvents();
        return;
_L2:
        if (rewardinformation.getKohlsCash().getBarcodeStatus() == 6)
        {
            ((TextView) (obj2)).setText("REWARDS ISSUED - USED");
            textview4.setText(resources.getString(0x7f080492));
            ((ImageView) (obj3)).setVisibility(8);
            textview3.setVisibility(8);
            textview5.setVisibility(8);
            textview6.setVisibility(8);
        } else
        if (rewardinformation.getKohlsCash().getBarcodeStatus() == 4)
        {
            ((ImageView) (obj3)).setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(rewardinformation.getKohlsCash().getKohlsCashNumber(), 600, 350, 0xff000000).get());
            ((TextView) (obj2)).setVisibility(0);
            textview4.setVisibility(8);
            ((ImageView) (obj3)).setVisibility(0);
            textview3.setText(rewardinformation.getKohlsCash().getKohlsCashNumber());
            textview3.setVisibility(0);
            textview5.setVisibility(0);
            textview5.setText(Html.fromHtml(resources.getString(0x7f080489)));
            textview6.setText((new StringBuilder()).append(resources.getString(0x7f08042c)).append(" ").append(Appconfig.generatePinWithBarcodeNumber(rewardinformation.getKohlsCash().getKohlsCashNumber())).append(" ").append(resources.getString(0x7f0801f8)).append(" ").append(DateUtils.prepareDate(((String) (obj4)))).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
