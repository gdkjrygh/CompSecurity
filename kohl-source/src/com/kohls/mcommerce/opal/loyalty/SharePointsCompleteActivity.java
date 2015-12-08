// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.analytics.utils.enums.ScreenNames;
import com.facebook.Session;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.asynctask.PointAdjustmentAsyncTask;
import com.kohls.mcommerce.opal.wallet.manager.DataActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.PointsAdjustmentResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.PointsIndicatorUtil;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            FacebookShareActivity, SharePointsActivity

public class SharePointsCompleteActivity extends Activity
    implements DataActionListener
{

    private boolean IsResponseSuccess;
    private int mAdjustedPoints;
    private BroadcastReceiver mUpdateUIReceiver;

    public SharePointsCompleteActivity()
    {
        mAdjustedPoints = 0;
        IsResponseSuccess = false;
        mUpdateUIReceiver = new BroadcastReceiver() {

            final SharePointsCompleteActivity this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()) && !Appconfig.isSignInShown)
                {
                    context = getIntent().getStringExtra("email_of_friend");
                    (new PointAdjustmentAsyncTask(getApplicationContext())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                        getIntent().getStringExtra("loyaltyid"), getIntent().getStringExtra("points_to_share"), getIntent().getStringExtra("message"), getCharityId(), getIntent().getStringExtra("charityimg"), getIntent().getStringExtra("phone"), context
                    });
                    return;
                } else
                {
                    finish();
                    return;
                }
            }

            
            {
                this$0 = SharePointsCompleteActivity.this;
                super();
            }
        };
    }

    private void callPointAdjustmentTask()
    {
        String s = getIntent().getStringExtra("email_of_friend");
        ListenerManager.getInstance().registerListener(this, "pointadjst");
        String s1 = getIntent().getStringExtra("points_to_share");
        (new PointAdjustmentAsyncTask(getApplicationContext())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
            getIntent().getStringExtra("loyaltyid"), s1, getIntent().getStringExtra("message"), getCharityId(), getIntent().getStringExtra("charityimg"), getIntent().getStringExtra("phone"), s
        });
        LocalBroadcastManager.getInstance(this).registerReceiver(mUpdateUIReceiver, new IntentFilter("signin_page"));
    }

    private void displayDialog(String s, final boolean isMutipleerror)
    {
        s = (new android.app.AlertDialog.Builder(this)).setMessage(s).setTitle(null).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final SharePointsCompleteActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SharePointsCompleteActivity.this;
                super();
            }
        }).create();
        s.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final SharePointsCompleteActivity this$0;
            final boolean val$isMutipleerror;

            public void onDismiss(DialogInterface dialoginterface)
            {
                finish();
                if (isMutipleerror)
                {
                    ListenerManager.getInstance().setDataAvailable(true);
                    dialoginterface = RewardCache.get(KohlsPhoneApplication.getInstance());
                    if (dialoginterface != null && dialoginterface.getProfile() != null)
                    {
                        dialoginterface = dialoginterface.getProfile().getPointBalance();
                        Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/SharePointsActivity);
                        intent.putExtra("point_balance", dialoginterface);
                        intent.putExtra("myrewards", true);
                        startActivity(intent);
                    }
                }
            }

            
            {
                this$0 = SharePointsCompleteActivity.this;
                isMutipleerror = flag;
                super();
            }
        });
        s.show();
        ((TextView)s.findViewById(0x102000b)).setTextAppearance(this, 0x7f0f001c);
        ((TextView)s.findViewById(0x102000b)).setBackgroundColor(getResources().getColor(0x7f0c010a));
        ((TextView)s.findViewById(0x102000b)).setPadding(40, 40, 40, 40);
        int i = getResources().getIdentifier("titleDivider", "id", "android");
        s.getWindow().getDecorView().findViewById(i).setBackgroundColor(getResources().getColor(0x7f0c0040));
    }

    private String getCharityId()
    {
        String s = getIntent().getStringExtra("sharewith");
        if (!TextUtils.isEmpty(s) && s.equalsIgnoreCase("donate"))
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    private void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar == null) goto _L2; else goto _L1
_L1:
        String s = getIntent().getStringExtra("sharewith");
        if (TextUtils.isEmpty(s) || !s.equalsIgnoreCase("donate")) goto _L4; else goto _L3
_L3:
        actionbar.setTitle(getResources().getString(0x7f080507));
_L6:
        actionbar.setDisplayHomeAsUpEnabled(false);
        actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayUseLogoEnabled(false);
        actionbar.show();
_L2:
        return;
_L4:
        if (!TextUtils.isEmpty(s) && s.equalsIgnoreCase("frnds"))
        {
            actionbar.setTitle(getResources().getString(0x7f080513));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void setupDonteToCharityView(Bitmap bitmap)
    {
        Resources resources = getResources();
        TextView textview = (TextView)findViewById(0x7f0d00f8);
        TextView textview1 = (TextView)findViewById(0x7f0d00fa);
        ImageView imageview = (ImageView)findViewById(0x7f0d00f9);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(resources.getString(0x7f0801d0)).append("<br>").append(resources.getString(0x7f0801bb)).append(" ").append("<b>").append(mAdjustedPoints).append(".").append("</b>");
        textview.setText(Html.fromHtml(stringbuilder.toString()));
        textview1.setVisibility(0);
        textview1.setText(getIntent().getStringExtra("charityname"));
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        }
        imageview.setVisibility(0);
        ((TextView)findViewById(0x7f0d00fb)).setVisibility(0);
        OmnitureMeasurement.getInstance().setDonateCompleteEvents();
    }

    private void setupShareWithFriendsView()
    {
        Resources resources;
        TextView textview;
        StringBuilder stringbuilder;
        String s;
        String s1;
        String s2;
        resources = getResources();
        textview = (TextView)findViewById(0x7f0d00f8);
        stringbuilder = new StringBuilder();
        s = getIntent().getStringExtra("email_of_friend");
        s1 = getIntent().getStringExtra("phone");
        s2 = getIntent().getStringExtra("loyaltyid");
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        stringbuilder.append(resources.getString(0x7f0804b9)).append(" ").append("<b>").append(s).append("</b>").append(" ").append(resources.getString(0x7f0801b0)).append("<br>").append(resources.getString(0x7f0801bb)).append(" ").append("<b>").append(mAdjustedPoints).append(".").append("</b>");
_L4:
        textview.setText(Html.fromHtml(stringbuilder.toString()));
        OmnitureMeasurement.getInstance().setShareCompleteEvents();
        return;
_L2:
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(resources.getString(0x7f0804b9)).append(" ").append("<b>").append(s1).append("</b>").append(" ").append(resources.getString(0x7f0801b0)).append("<br>").append(resources.getString(0x7f0801bb)).append(" ").append("<b>").append(mAdjustedPoints).append(".").append("</b>");
        } else
        if (!TextUtils.isEmpty(s2))
        {
            stringbuilder.append(resources.getString(0x7f0804b9)).append(" ").append("<b>").append(s2).append("</b>").append(" ").append(resources.getString(0x7f0801b0)).append("<br>").append(resources.getString(0x7f0801bb)).append(" ").append("<b>").append(mAdjustedPoints).append(".").append("</b>");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setupView(Object obj)
    {
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
        ((RelativeLayout)findViewById(0x7f0d00f5)).setVisibility(0);
        if (obj == null)
        {
            onBackPressed();
            return;
        }
        obj = (PointsAdjustmentResponse)obj;
        if (obj != null && ((PointsAdjustmentResponse) (obj)).getErrors() != null && ((PointsAdjustmentResponse) (obj)).getErrors().size() > 0)
        {
            String s = ((ErrorResponse)((PointsAdjustmentResponse) (obj)).getErrors().get(0)).getMessage();
            ((RelativeLayout)findViewById(0x7f0d00da)).setVisibility(8);
            if (s != null)
            {
                if (((ErrorResponse)((PointsAdjustmentResponse) (obj)).getErrors().get(0)).getErrorCode() == 46)
                {
                    displayDialog(s, true);
                    return;
                } else
                {
                    displayDialog(s, false);
                    return;
                }
            } else
            {
                finish();
                return;
            }
        }
        if (obj == null || !((PointsAdjustmentResponse) (obj)).isSuccess()) goto _L2; else goto _L1
_L1:
        String s1;
        ((RelativeLayout)findViewById(0x7f0d00da)).setVisibility(0);
        if (!TextUtils.isEmpty(((PointsAdjustmentResponse) (obj)).getSourcePointBalance()))
        {
            mAdjustedPoints = Integer.parseInt(((PointsAdjustmentResponse) (obj)).getSourcePointBalance());
            (new PointsIndicatorUtil()).setPointsIndicatorBar(this, Integer.parseInt(((PointsAdjustmentResponse) (obj)).getSourcePointBalance()));
        }
        s1 = getIntent().getStringExtra("sharewith");
        if (TextUtils.isEmpty(s1) || !s1.equalsIgnoreCase("frnds")) goto _L4; else goto _L3
_L3:
        setupShareWithFriendsView();
_L5:
        IsResponseSuccess = true;
        AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_DONATE_SUCCESS);
        invalidateOptionsMenu();
        return;
_L4:
        if (!TextUtils.isEmpty(s1) && s1.equalsIgnoreCase("donate"))
        {
            setupDonteToCharityView(((PointsAdjustmentResponse) (obj)).getImgBitmap());
        }
        if (true) goto _L5; else goto _L2
_L2:
        displayDialog("Connection Error please try again", false);
        return;
    }

    public void onActionPerformed(Object obj)
    {
        setupView(obj);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (Session.getActiveSession() != null)
        {
            Session.getActiveSession().onActivityResult(this, i, j, intent);
        }
    }

    public void onBackPressed()
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        intent.putExtra("open_screen_key", "open_my_loyalty");
        intent.setFlags(0x4000000);
        startActivity(intent);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        callPointAdjustmentTask();
        setUpActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100001, menu);
        String s = getIntent().getStringExtra("sharewith");
        if (!TextUtils.isEmpty(s) && s.equalsIgnoreCase("donate") && IsResponseSuccess)
        {
            menu.findItem(0x7f0d06f0).setVisible(true);
            return true;
        } else
        {
            menu.findItem(0x7f0d06f0).setVisible(false);
            return true;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mUpdateUIReceiver);
        ListenerManager.getInstance().unRegisterListener("pointadjst", this);
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
        if (menuitem.getItemId() == 0x7f0d06f0)
        {
            menuitem = new Bundle();
            menuitem.putString("description", (new StringBuilder("I just donated my Yes2You points to a special cause! Are you in a giving mood too? Go to Kohls.com/rewards and donate points today!")).append("<center></center>").toString());
            menuitem.putString("name", "Donate Points");
            menuitem.putString("picture", "http://d3t1dw6evd1rv7.cloudfront.net/v1/img/y2ylogo.jpg");
            menuitem.putString("display", " ");
            menuitem.putString("link", "http://Kohls.com/rewards");
            menuitem.putString("caption", " ");
            menuitem.putBoolean("register", false);
            Logger.error("CONNECT", "Connect request");
            Intent intent = new Intent(this, com/kohls/mcommerce/opal/loyalty/FacebookShareActivity);
            intent.putExtra("facebook", menuitem);
            startActivity(intent);
        } else
        {
            onBackPressed();
        }
        return true;
    }

}
