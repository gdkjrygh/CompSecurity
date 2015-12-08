// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.vending.billing.IInAppBillingService;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.widget.WebDialog;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Tracker;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.LikeShareList;
import com.hmobile.quickaction.ActionItem;
import com.hmobile.quickaction.QuickAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.grantland.twitter.Tweeter;
import me.grantland.twitter.Twitter;
import me.grantland.twitter.TwitterError;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.hmobile.biblekjv:
//            HolyBibleApplication, WidgetSelectorActivity

public class BaseActivity extends Activity
{
    class SaveShareData extends AsyncTask
    {

        int book_count;
        int chap_count;
        ArrayList m_verse_number_list;
        final BaseActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            avoid = "";
            if (m_verse_number_list.size() <= 0) goto _L2; else goto _L1
_L1:
            Iterator iterator = m_verse_number_list.iterator();
_L6:
            if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
            avoid.substring(0, avoid.length() - 1);
            BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count))).replace(" ", "%20").trim();
            (new StringBuilder(String.valueOf(getString(0x7f070097)))).append(getString(0x7f070099)).toString();
_L2:
            return null;
_L4:
            int i = ((Integer)iterator.next()).intValue();
            avoid = (new StringBuilder(String.valueOf(avoid))).append(String.valueOf(i)).append(",").toString();
            if (true) goto _L6; else goto _L5
_L5:
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            super.onPostExecute(void1);
        }

        public SaveShareData(ArrayList arraylist, int i, int j)
        {
            this$0 = BaseActivity.this;
            super();
            m_verse_number_list = new ArrayList();
            book_count = 1;
            chap_count = 1;
            m_verse_number_list = arraylist;
            book_count = i;
            chap_count = j;
        }
    }


    private static final int BUTTON_NEGATIVE = 2;
    private static final int BUTTON_NEUTRAL = 1;
    private static final int BUTTON_POSITIVE = 0;
    private static String fbid = "";
    String CONSUMER_KEY;
    String CONSUMER_SECRET;
    AdView adView;
    private ActionItem aiEmailUpdates;
    private ActionItem aiFeedback;
    private ActionItem aiMoreApps;
    private ActionItem aiRate;
    private ActionItem aiRemoveAds;
    private ActionItem aiSurvey;
    String applicationId;
    ImageView imgActionMenu;
    boolean is_finished;
    private Twitter mTwitter;
    ProgressDialog m_pd;
    int screenHeight;
    int screenWidth;
    Session session;
    String share_text;
    Tweeter tweet;
    private UiLifecycleHelper uiHelper;

    public BaseActivity()
    {
        m_pd = null;
        applicationId = "";
        share_text = "";
        CONSUMER_KEY = "";
        CONSUMER_SECRET = "";
    }

    private static Session openActiveSession(Activity activity, boolean flag, List list, com.facebook.Session.StatusCallback statuscallback)
    {
        list = (new com.facebook.Session.OpenRequest(activity)).setPermissions(list).setCallback(statuscallback);
        activity = (new com.facebook.Session.Builder(activity)).setApplicationId(fbid).build();
        if (SessionState.CREATED_TOKEN_LOADED.equals(activity.getState()) || flag)
        {
            Session.setActiveSession(activity);
            activity.openForPublish(list);
            return activity;
        } else
        {
            return null;
        }
    }

    private void publishFeedDialog(String s, String s1)
    {
        showProgress();
        if (Session.getActiveSession() != null && Session.getActiveSession().isOpened())
        {
            Bundle bundle = new Bundle();
            bundle.putString("name", s);
            bundle.putString("description", (new StringBuilder(String.valueOf(s1))).append(" \nhttps://bit.ly/kjvbibleapp").toString());
            bundle.putString("picture", "https://lh6.ggpht.com/YLfaM2iuhlHKMQPkNq9AvCkO3wo8qPQdZnl_2lk-NXUeUEElpzAfWY3qQgGHjmxjNbjx=w300");
            ((com.facebook.widget.WebDialog.FeedDialogBuilder)(new com.facebook.widget.WebDialog.FeedDialogBuilder(this, Session.getActiveSession(), bundle)).setOnCompleteListener(new com.facebook.widget.WebDialog.OnCompleteListener() {

                final BaseActivity this$0;

                public void onComplete(Bundle bundle1, FacebookException facebookexception)
                {
                    if (facebookexception == null)
                    {
                        bundle1 = bundle1.getString("post_id");
                        if (bundle1 != null)
                        {
                            hideProgress();
                            Toast.makeText(BaseActivity.this, (new StringBuilder("Posted story, id: ")).append(bundle1).toString(), 0).show();
                            if (is_finished)
                            {
                                bundle1 = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
                                bundle1.addFlags(0x4000000);
                                startActivity(bundle1);
                                finish();
                            }
                            return;
                        } else
                        {
                            hideProgress();
                            Toast.makeText(getApplicationContext(), "Publish cancelled", 0).show();
                            finish();
                            return;
                        }
                    }
                    if (facebookexception instanceof FacebookOperationCanceledException)
                    {
                        hideProgress();
                        Toast.makeText(getApplicationContext(), "Publish cancelled", 0).show();
                        return;
                    } else
                    {
                        hideProgress();
                        Toast.makeText(getApplicationContext(), "Error posting story", 0).show();
                        return;
                    }
                }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
            })).build().show();
            return;
        } else
        {
            openActiveSession(this, true, Arrays.asList(new String[] {
                "email", "user_birthday", "user_hometown", "user_location", "publish_actions"
            }), new com.facebook.Session.StatusCallback() {

                final BaseActivity this$0;

                public void call(Session session1, SessionState sessionstate, Exception exception)
                {
                }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
            });
            return;
        }
    }

    public void PostShare(ArrayList arraylist, int i, int j)
    {
    }

    public void addAdView()
    {
        adView = (AdView)findViewById(0x7f0e0022);
        com.google.android.gms.ads.AdRequest adrequest = (new com.google.android.gms.ads.AdRequest.Builder()).build();
        adView.loadAd(adrequest);
        adView.setAdListener(new AdListener() {

            final BaseActivity this$0;

            public void onAdFailedToLoad(int i)
            {
                super.onAdFailedToLoad(i);
                adView.setVisibility(8);
            }

            public void onAdLoaded()
            {
                super.onAdLoaded();
                adView.setVisibility(0);
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
    }

    public void addQuickActionMenu()
    {
        imgActionMenu = (ImageView)findViewById(0x7f0e002e);
        imgActionMenu.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(View view)
            {
                view = new QuickAction(view);
                if (!HolyBibleApplication.isPurchased)
                {
                    view.addActionItem(aiRemoveAds);
                }
                view.addActionItem(aiEmailUpdates);
                view.addActionItem(aiSurvey);
                view.addActionItem(aiFeedback);
                view.addActionItem(aiMoreApps);
                view.addActionItem(aiRate);
                view.show();
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
    }

    public void hideActionMenuIcon()
    {
        imgActionMenu.setVisibility(8);
    }

    public void hideAdView()
    {
        adView = (AdView)findViewById(0x7f0e0022);
        adView.setVisibility(8);
    }

    public void hideProgress()
    {
        if (m_pd == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        m_pd.dismiss();
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    public boolean isTwitterLogedin()
    {
        boolean flag1 = false;
        Object obj = PreferenceManager.getDefaultSharedPreferences(this);
        String s = ((SharedPreferences) (obj)).getString("accessKey", "");
        obj = ((SharedPreferences) (obj)).getString("accessSecret", "");
        boolean flag = flag1;
        if (s.length() > 1)
        {
            flag = flag1;
            if (((String) (obj)).length() > 1)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void loadData(final String title, final String desc)
    {
        Session.restoreSession(getApplicationContext(), null, new com.facebook.Session.StatusCallback() {

            final BaseActivity this$0;
            private final String val$desc;
            private final String val$title;

            public void call(Session session1, SessionState sessionstate, Exception exception)
            {
                if (session1.isOpened())
                {
                    publishFeedDialog(title, desc);
                    Session.saveSession(session1, null);
                    return;
                } else
                {
                    BaseActivity.openActiveSession(BaseActivity.this, true, Arrays.asList(new String[] {
                        "email", "user_birthday", "user_hometown", "user_location", "publish_actions"
                    }), desc. new com.facebook.Session.StatusCallback() {

                        final _cls4 this$1;
                        private final String val$desc;
                        private final String val$title;

                        public void call(Session session1, SessionState sessionstate, Exception exception)
                        {
                            if (session1.isOpened())
                            {
                                publishFeedDialog(title, desc);
                                Session.saveSession(session1, null);
                            }
                        }

            
            {
                this$1 = final__pcls4;
                title = s;
                desc = String.this;
                super();
            }
                    });
                    return;
                }
            }


            
            {
                this$0 = BaseActivity.this;
                title = s;
                desc = s1;
                super();
            }
        }, null);
    }

    public void menuDialogDisplay()
    {
        aiRemoveAds = new ActionItem();
        aiRemoveAds.setTitle(getString(0x7f0700a6));
        aiRemoveAds.setIcon(getResources().getDrawable(0x7f020065));
        aiRemoveAds.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(View view)
            {
                removeAds();
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
        aiEmailUpdates = new ActionItem();
        aiEmailUpdates.setTitle(getString(0x7f0700a7));
        aiEmailUpdates.setIcon(getResources().getDrawable(0x7f020065));
        aiEmailUpdates.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse(getString(0x7f07008c)));
                startActivity(view);
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
        aiSurvey = new ActionItem();
        aiSurvey.setTitle(getString(0x7f0700a8));
        aiSurvey.setIcon(getResources().getDrawable(0x7f020065));
        aiSurvey.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse(getString(0x7f07008d)));
                startActivity(view);
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
        aiFeedback = new ActionItem();
        aiFeedback.setTitle(getString(0x7f0700a9));
        aiFeedback.setIcon(getResources().getDrawable(0x7f020065));
        aiFeedback.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse(getString(0x7f07008f)));
                startActivity(view);
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
        aiMoreApps = new ActionItem();
        aiMoreApps.setTitle(getString(0x7f0700aa));
        aiMoreApps.setIcon(getResources().getDrawable(0x7f020065));
        aiMoreApps.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse(getString(0x7f070090)));
                startActivity(view);
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
        aiRate = new ActionItem();
        aiRate.setTitle(getString(0x7f0700ab));
        aiRate.setIcon(getResources().getDrawable(0x7f020065));
        aiRate.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse((new StringBuilder("market://details?id=")).append(getResources().getString(0x7f07004a)).toString()));
                startActivity(view);
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Session.getActiveSession().onActivityResult(this, i, j, intent);
        if (i == 1001 && j == -1)
        {
            intent.getIntExtra("RESPONSE_CODE", 0);
            String s = intent.getStringExtra("INAPP_PURCHASE_DATA");
            HolyBibleApplication.isItemPurchased();
            try
            {
                s = (new JSONObject(s)).getString("productId");
                Toast.makeText(getApplicationContext(), (new StringBuilder(String.valueOf(getString(0x7f0700c8)))).append(s).toString(), 1).show();
                hideAdView();
            }
            catch (JSONException jsonexception)
            {
                Toast.makeText(getApplicationContext(), getString(0x7f0700c9), 1).show();
                jsonexception.printStackTrace();
            }
        }
        mTwitter.authorizeCallback(i, j, intent);
    }

    public void onBackPressed()
    {
        Iterator iterator = ((ActivityManager)getSystemService("activity")).getRunningTasks(10).iterator();
        int i = 0;
        do
        {
            do
            {
                android.app.ActivityManager.RunningTaskInfo runningtaskinfo;
                int j;
                if (!iterator.hasNext())
                {
                    if (i > 1)
                    {
                        super.onBackPressed();
                        return;
                    } else
                    {
                        LikeShareList.Instance().clearList();
                        final android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
                        final AlertDialog dialog = new android.app.AlertDialog.Builder(this);
                        Object obj = getLayoutInflater().inflate(0x7f03001a, null);
                        dialog.setView(((View) (obj)));
                        dialog.setTitle(getString(0x7f07009a));
                        dialog = dialog.create();
                        Object obj1 = (TextView)((View) (obj)).findViewById(0x7f0e008f);
                        Object obj2 = (TextView)((View) (obj)).findViewById(0x7f0e0094);
                        ((TextView) (obj1)).setText(getString(0x7f0700a3));
                        ((TextView) (obj2)).setText(getString(0x7f07009d));
                        obj1 = (Button)((View) (obj)).findViewById(0x7f0e0091);
                        obj2 = (Button)((View) (obj)).findViewById(0x7f0e0092);
                        Button button = (Button)((View) (obj)).findViewById(0x7f0e0095);
                        Button button1 = (Button)((View) (obj)).findViewById(0x7f0e0096);
                        Button button2 = (Button)((View) (obj)).findViewById(0x7f0e0097);
                        final RelativeLayout rlRate = (RelativeLayout)((View) (obj)).findViewById(0x7f0e0093);
                        obj = (RelativeLayout)((View) (obj)).findViewById(0x7f0e0090);
                        ((Button) (obj2)).setOnClickListener(new android.view.View.OnClickListener() {

                            final BaseActivity this$0;
                            private final AlertDialog val$dialog;

                            public void onClick(View view)
                            {
                                dialog.dismiss();
                            }

            
            {
                this$0 = BaseActivity.this;
                dialog = alertdialog;
                super();
            }
                        });
                        ((Button) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

                            final BaseActivity this$0;
                            private final AlertDialog val$dialog;
                            private final RelativeLayout val$rlRate;

                            public void onClick(View view)
                            {
                                if (PreferenceManager.getDefaultSharedPreferences(BaseActivity.this).getInt("exit_alert", 1) == 1)
                                {
                                    rlRate.setVisibility(0);
                                } else
                                {
                                    dialog.dismiss();
                                    finish();
                                }
                                HolyBibleApplication.stopBilllingService();
                            }

            
            {
                this$0 = BaseActivity.this;
                rlRate = relativelayout;
                dialog = alertdialog;
                super();
            }
                        });
                        button.setOnClickListener(new android.view.View.OnClickListener() {

                            final BaseActivity this$0;
                            private final android.content.SharedPreferences.Editor val$editor;

                            public void onClick(View view)
                            {
                                editor.putInt("exit_alert", 0);
                                editor.commit();
                                finish();
                                view = new Intent("android.intent.action.VIEW");
                                view.setData(Uri.parse((new StringBuilder("market://details?id=")).append(getPackageName()).toString()));
                                startActivity(view);
                                finish();
                            }

            
            {
                this$0 = BaseActivity.this;
                editor = editor1;
                super();
            }
                        });
                        button1.setOnClickListener(new android.view.View.OnClickListener() {

                            final BaseActivity this$0;
                            private final android.content.SharedPreferences.Editor val$editor;

                            public void onClick(View view)
                            {
                                editor.putInt("exit_alert", 1);
                                editor.commit();
                                finish();
                            }

            
            {
                this$0 = BaseActivity.this;
                editor = editor1;
                super();
            }
                        });
                        button2.setOnClickListener(new android.view.View.OnClickListener() {

                            final BaseActivity this$0;
                            private final android.content.SharedPreferences.Editor val$editor;

                            public void onClick(View view)
                            {
                                editor.putInt("exit_alert", 2);
                                editor.commit();
                                finish();
                            }

            
            {
                this$0 = BaseActivity.this;
                editor = editor1;
                super();
            }
                        });
                        dialog.show();
                        return;
                    }
                }
                runningtaskinfo = (android.app.ActivityManager.RunningTaskInfo)iterator.next();
                j = runningtaskinfo.id;
            } while (!runningtaskinfo.baseActivity.getPackageName().equalsIgnoreCase(getApplicationContext().getPackageName()));
            i = runningtaskinfo.numActivities;
        } while (true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        applicationId = getResources().getString(0x7f070094);
        CONSUMER_KEY = getResources().getString(0x7f070095);
        CONSUMER_SECRET = getResources().getString(0x7f070096);
        EasyTracker.getInstance().activityStart(this);
        fbid = getString(0x7f070094);
        uiHelper = new UiLifecycleHelper(this, null);
        uiHelper.onCreate(bundle);
        bundle = getWindowManager().getDefaultDisplay();
        screenWidth = bundle.getWidth();
        screenHeight = bundle.getHeight();
        m_pd = new ProgressDialog(this, 0x7f0a0008);
        m_pd.setMessage(Html.fromHtml((new StringBuilder("<font color='white'>")).append(getString(0x7f0700c7)).append("</font>").toString()));
        mTwitter = new Twitter(CONSUMER_KEY, CONSUMER_SECRET);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        if (!HolyBibleApplication.isPurchased)
        {
            menu.add(0, 1, 0, getString(0x7f0700a6)).setIcon(0x1080038);
        }
        menu.add(1, 2, 0, getString(0x7f0700a7)).setIcon(0x108008f);
        menu.add(3, 4, 0, getString(0x7f0700a9)).setIcon(0x108003e);
        menu.add(4, 5, 0, getString(0x7f0700ad)).setIcon(0x1080049);
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        EasyTracker.getInstance().activityStop(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 1: // '\001'
            removeAds();
            return true;

        case 2: // '\002'
            menuitem = new Intent("android.intent.action.VIEW");
            menuitem.setData(Uri.parse(getString(0x7f07008c)));
            startActivity(menuitem);
            return true;

        case 3: // '\003'
            menuitem = new Intent("android.intent.action.VIEW");
            menuitem.setData(Uri.parse(getString(0x7f07008e)));
            startActivity(menuitem);
            return true;

        case 4: // '\004'
            menuitem = new Intent("android.intent.action.VIEW");
            menuitem.setData(Uri.parse(getString(0x7f07008f)));
            startActivity(menuitem);
            return true;

        case 5: // '\005'
            menuitem = new Intent(this, com/hmobile/biblekjv/WidgetSelectorActivity);
            break;
        }
        menuitem.putExtra("FromApp", true);
        startActivity(menuitem);
        return true;
    }

    public void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        AppEventsLogger.activateApp(getApplicationContext(), getString(0x7f070094));
        super.onResume();
    }

    protected void onStop()
    {
        EasyTracker.getInstance().activityStop(this);
        super.onStop();
    }

    public void removeAds()
    {
        try
        {
            startIntentSenderForResult(((PendingIntent)HolyBibleApplication.mService.getBuyIntent(3, getPackageName(), getString(0x7f0700b9), "inapp", "").getParcelable("BUY_INTENT")).getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void sendAnalyticsevent(String s, String s1, String s2)
    {
        EasyTracker.getTracker().sendEvent(s, s1, s2, Long.valueOf(10L));
    }

    public void setFontStyleRoboto(Button button, String s)
    {
        button.setTypeface(Typeface.createFromAsset(getAssets(), s));
    }

    public void setFontStyleRoboto(TextView textview, String s)
    {
        textview.setTypeface(Typeface.createFromAsset(getAssets(), s));
    }

    public void showActionMenuIcon()
    {
        imgActionMenu.setVisibility(0);
    }

    public void showAlertForTwitterShare(final String sharetext, final com.hmobile.model.LikeShareInfo.LikeShareDelegate delegate)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Alert").setMessage(getString(0x7f07008b)).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final BaseActivity this$0;
            private final com.hmobile.model.LikeShareInfo.LikeShareDelegate val$delegate;
            private final String val$sharetext;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                String s = (new StringBuilder(String.valueOf(sharetext.substring(0, 136)))).append("...").toString();
                signInwithTwitter(s, delegate);
                dialoginterface.dismiss();
            }

            
            {
                this$0 = BaseActivity.this;
                sharetext = s;
                delegate = likesharedelegate;
                super();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final BaseActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
        });
        builder.create().show();
    }

    public void showProgress()
    {
        try
        {
            if (m_pd != null)
            {
                m_pd.show();
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void showProgress(String s)
    {
        try
        {
            if (m_pd != null)
            {
                m_pd.setMessage(s);
                m_pd.show();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void showToast(String s)
    {
        s = Toast.makeText(getApplicationContext(), s, 1);
        s.setGravity(81, 0, screenHeight / 2);
        s.show();
    }

    public void signInWithFb(final String title, final String desc, boolean flag)
    {
        if (Session.getActiveSession() != null && Session.getActiveSession().isOpened())
        {
            showProgress();
            Session.getActiveSession().getAccessToken();
            is_finished = flag;
            publishFeedDialog(title, desc);
            return;
        }
        try
        {
            session = Session.getActiveSession();
            session = Session.openActiveSessionFromCache(getApplicationContext());
            if (session != null && Session.getActiveSession() != null && session.isOpened())
            {
                showProgress();
                Session.getActiveSession().getAccessToken();
                is_finished = flag;
                publishFeedDialog(title, desc);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (final String title)
        {
            title.printStackTrace();
            return;
        }
        openActiveSession(this, true, Arrays.asList(new String[] {
            "email", "user_birthday", "user_hometown", "user_location", "publish_actions"
        }), new com.facebook.Session.StatusCallback() {

            final BaseActivity this$0;
            private final String val$desc;
            private final String val$title;

            public void call(Session session1, SessionState sessionstate, Exception exception)
            {
                if (session1.isOpened())
                {
                    publishFeedDialog(title, desc);
                    Session.saveSession(session1, null);
                }
            }

            
            {
                this$0 = BaseActivity.this;
                title = s;
                desc = s1;
                super();
            }
        });
        return;
    }

    public void signInwithTwitter(final String share_text, final com.hmobile.model.LikeShareInfo.LikeShareDelegate delegate)
    {
        if (!isTwitterLogedin())
        {
            mTwitter.authorize(this, new me.grantland.twitter.Twitter.DialogListener() {

                final BaseActivity this$0;
                private final com.hmobile.model.LikeShareInfo.LikeShareDelegate val$delegate;
                private final String val$share_text;

                public void onCancel()
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(BaseActivity.this);
                    builder.setTitle("Canceled").setMessage("Twitter Login Canceled").setPositiveButton("Ok", null);
                    builder.create().show();
                }

                public void onComplete(String s, String s1)
                {
                    android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(BaseActivity.this).edit();
                    editor.putString("accessKey", s);
                    editor.putString("accessSecret", s1);
                    editor.commit();
                    tweet = new Tweeter(s, s1, CONSUMER_KEY, CONSUMER_SECRET);
                    try
                    {
                        tweet.upload(share_text, false, delegate. new me.grantland.twitter.Tweeter.TwitterUploadDelegate() {

                            final _cls1 this$1;
                            private final com.hmobile.model.LikeShareInfo.LikeShareDelegate val$delegate;

                            public void UploadFailed()
                            {
                                if (delegate != null)
                                {
                                    delegate.Failed();
                                }
                                hideProgress();
                                Toast.makeText(getApplicationContext(), "error occured please try again.", 1).show();
                            }

                            public void UploadSuccessFully()
                            {
                                if (delegate != null)
                                {
                                    delegate.SuccessFully();
                                }
                                hideProgress();
                                Toast toast = Toast.makeText(getApplicationContext(), "Twitter share successfully.", 1);
                                toast.setGravity(81, 0, screenHeight / 2);
                                toast.show();
                            }

            
            {
                this$1 = final__pcls1;
                delegate = com.hmobile.model.LikeShareInfo.LikeShareDelegate.this;
                super();
            }
                        });
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        hideProgress();
                    }
                    s.printStackTrace();
                }

                public void onError(TwitterError twittererror)
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(BaseActivity.this);
                    builder.setTitle("Error").setMessage(twittererror.getMessage()).setPositiveButton("Ok", null);
                    builder.create().show();
                }


            
            {
                this$0 = BaseActivity.this;
                share_text = s;
                delegate = likesharedelegate;
                super();
            }
            });
            return;
        }
        showProgress();
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
        tweet = new Tweeter(sharedpreferences.getString("accessKey", ""), sharedpreferences.getString("accessSecret", ""), CONSUMER_KEY, CONSUMER_SECRET);
        try
        {
            tweet.upload(share_text, false, new me.grantland.twitter.Tweeter.TwitterUploadDelegate() {

                final BaseActivity this$0;
                private final com.hmobile.model.LikeShareInfo.LikeShareDelegate val$delegate;

                public void UploadFailed()
                {
                    delegate.Failed();
                    hideProgress();
                    Toast.makeText(getApplicationContext(), "error occured please try again.", 1).show();
                }

                public void UploadSuccessFully()
                {
                    delegate.SuccessFully();
                    hideProgress();
                    Toast toast = Toast.makeText(getApplicationContext(), "Twitter share successfully.", 1);
                    toast.setGravity(81, 0, screenHeight / 2);
                    toast.show();
                }

            
            {
                this$0 = BaseActivity.this;
                delegate = likesharedelegate;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final String share_text)
        {
            hideProgress();
        }
        share_text.printStackTrace();
    }

    public void startIntent(Activity activity, Class class1)
    {
        startActivity(new Intent(activity, class1));
        activity.overridePendingTransition(0x7f040001, 0x7f040002);
        finish();
        EasyTracker.getInstance().activityStart(this);
    }









}
