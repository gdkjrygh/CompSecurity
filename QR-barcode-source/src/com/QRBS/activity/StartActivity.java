// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.SearchView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.scannerfire.db.DbAdapter;
import com.scannerfire.fragment.FragmentCrea;
import com.scannerfire.fragment.FragmentCronology;
import com.scannerfire.fragment.FragmentProva;
import com.scannerfire.fragment.TabsAdapter;
import com.scannerfire.model.CustomListAdapter;
import com.scannerfire.utils.SoundControl;
import com.scannerfire.utils.Utils;
import com.splunk.mint.Mint;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.QRBS.activity:
//            QrActivity, About, Opzioni

public class StartActivity extends SherlockFragmentActivity
{

    private AdView adView;
    private AlertDialog alert;
    FragmentCronology fc;
    private boolean firstTime;
    private boolean flag;
    private InterstitialAd mInterstitialAd;
    private TabHost mTabHost;
    private TabsAdapter mTabsAdapter;
    private ViewPager mViewPager;

    public StartActivity()
    {
        firstTime = true;
        flag = false;
    }

    private void loadInterstitial()
    {
        com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
        String s = Utils.md5(android.provider.Settings.Secure.getString(getContentResolver(), "android_id")).toUpperCase(Locale.ENGLISH);
        Log.d("", (new StringBuilder("DEVICE ID -> ")).append(s).toString());
        mInterstitialAd.loadAd(builder.build());
    }

    private void saveToCsv()
    {
        Object obj = getLayoutInflater().inflate(0x7f030028, null);
        final AlertDialog a = new android.app.AlertDialog.Builder(this);
        a.setView(((View) (obj)));
        a = a.create();
        a.show();
        final EditText editName = (EditText)((View) (obj)).findViewById(0x7f0d0091);
        obj = (Button)((View) (obj)).findViewById(0x7f0d0092);
        Date date = new Date();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        editName.setText((new StringBuilder("qrbs_database")).append(simpledateformat.format(date)).append(".csv").toString());
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final StartActivity this$0;
            private final AlertDialog val$a;
            private final EditText val$editName;

            public void onClick(View view)
            {
                view = editName.getText().toString();
                if (view == null || view.length() == 0)
                {
                    Toast.makeText(getParent(), 0x7f08010d, 0).show();
                } else
                {
                    if (!view.endsWith(".csv"))
                    {
                        view = (new StringBuilder(String.valueOf(view))).append(".csv").toString();
                    }
                    if ((new DbAdapter(StartActivity.this)).saveCSV(view))
                    {
                        a.dismiss();
                        Object obj1 = (new android.support.v4.app.NotificationCompat.Builder(StartActivity.this)).setSmallIcon(0x7f0200cd).setContentTitle(view).setContentText("Open Csv File");
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setDataAndType(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), view)), "text/csv");
                        Intent.createChooser(intent, "Open Csv with...");
                        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setContentIntent(PendingIntent.getActivity(StartActivity.this, 0, intent, 0));
                        view = (NotificationManager)getSystemService("notification");
                        obj1 = ((android.support.v4.app.NotificationCompat.Builder) (obj1)).build();
                        obj1.flags = 16;
                        view.notify(1, ((Notification) (obj1)));
                        return;
                    }
                }
            }

            
            {
                this$0 = StartActivity.this;
                editName = edittext;
                a = alertdialog;
                super();
            }
        });
    }

    private void showBackDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(0x7f0800b6));
        builder.setMessage(getResources().getString(0x7f0800b5));
        builder.setPositiveButton(getResources().getString(0x7f0800b8), new android.content.DialogInterface.OnClickListener() {

            final StartActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                Utils.setLastElem(-1);
                if (mInterstitialAd.isLoaded())
                {
                    mInterstitialAd.show();
                    mInterstitialAd.setAdListener(new AdListener() {

                        final _cls3 this$1;

                        public void onAdClosed()
                        {
                            if (SoundControl.isSoundLoaded())
                            {
                                SoundControl.destroySound();
                            }
                            firstTime = true;
                            finish();
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    });
                    return;
                }
                if (SoundControl.isSoundLoaded())
                {
                    SoundControl.destroySound();
                }
                firstTime = true;
                finish();
            }


            
            {
                this$0 = StartActivity.this;
                super();
            }
        });
        builder.setNegativeButton(getResources().getString(0x7f0800b7), new android.content.DialogInterface.OnClickListener() {

            final StartActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                alert.dismiss();
            }

            
            {
                this$0 = StartActivity.this;
                super();
            }
        });
        builder.setNeutralButton(getResources().getString(0x7f080146), new android.content.DialogInterface.OnClickListener() {

            final StartActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse("http://www.qrbarcodescanner.com/redir"));
                try
                {
                    startActivity(dialoginterface);
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    Mint.logException(dialoginterface);
                }
                alert.dismiss();
            }

            
            {
                this$0 = StartActivity.this;
                super();
            }
        });
        alert = builder.create();
        alert.show();
    }

    private void showDeleteDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(0x7f080142));
        builder.setMessage(getResources().getString(0x7f080143));
        builder.setPositiveButton(getResources().getString(0x7f0800b8), new android.content.DialogInterface.OnClickListener() {

            final StartActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = new DbAdapter(StartActivity.this);
                dialoginterface.open();
                dialoginterface.deleteAll();
                java.util.ArrayList arraylist = dialoginterface.getValues();
                fc.updateList(arraylist, StartActivity.this);
                dialoginterface.close();
                alert.dismiss();
            }

            
            {
                this$0 = StartActivity.this;
                super();
            }
        });
        builder.setNegativeButton(getResources().getString(0x7f0800b7), new android.content.DialogInterface.OnClickListener() {

            final StartActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                alert.dismiss();
            }

            
            {
                this$0 = StartActivity.this;
                super();
            }
        });
        alert = builder.create();
        alert.show();
    }

    public void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
    }

    public void onBackPressed()
    {
        if (mTabHost.getCurrentTab() != 0)
        {
            mTabHost.setCurrentTab(0);
            return;
        } else
        {
            showBackDialog();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Mint.initAndStartSession(this, "a0716322");
        setContentView(0x7f030019);
        Object obj = getSupportActionBar();
        ((ActionBar) (obj)).setIcon(0x7f0200d4);
        ((ActionBar) (obj)).setTitle(0x7f0800b1);
        ((ActionBar) (obj)).setHomeButtonEnabled(true);
        ((ActionBar) (obj)).setDisplayHomeAsUpEnabled(false);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7846213809650520/7044404290");
        adView = (AdView)findViewById(0x7f0d0061);
        obj = (new com.google.android.gms.ads.AdRequest.Builder()).build();
        adView.loadAd(((com.google.android.gms.ads.AdRequest) (obj)));
        adView.setAdListener(new AdListener() {

            final StartActivity this$0;

            public void onAdLoaded()
            {
                loadInterstitial();
            }

            
            {
                this$0 = StartActivity.this;
                super();
            }
        });
        mTabHost = (TabHost)findViewById(0x1020012);
        mViewPager = (ViewPager)findViewById(0x7f0d0062);
        mTabHost.setup();
        mTabsAdapter = new TabsAdapter(this, mTabHost, mViewPager);
        obj = mTabHost.newTabSpec("Scan");
        Object obj1 = getWindowManager().getDefaultDisplay();
        int i = ((Display) (obj1)).getWidth();
        int j = ((Display) (obj1)).getHeight();
        obj1 = LayoutInflater.from(this).inflate(0x7f030040, mTabHost.getTabWidget(), false);
        ((TextView)((View) (obj1)).findViewById(0x7f0d00e4)).setText(0x7f0800b9);
        ((ImageView)((View) (obj1)).findViewById(0x7f0d00e3)).setImageResource(0x7f0200c7);
        mTabsAdapter.addTab(((android.widget.TabHost.TabSpec) (obj)).setIndicator(((View) (obj1))), com/scannerfire/fragment/FragmentProva, null, "Scan");
        obj = mTabHost.newTabSpec("History");
        obj1 = LayoutInflater.from(this).inflate(0x7f030040, mTabHost.getTabWidget(), false);
        ((TextView)((View) (obj1)).findViewById(0x7f0d00e4)).setText(0x7f0800ba);
        ((ImageView)((View) (obj1)).findViewById(0x7f0d00e3)).setImageResource(0x7f0200d1);
        mTabsAdapter.addTab(((android.widget.TabHost.TabSpec) (obj)).setIndicator(((View) (obj1))), com/scannerfire/fragment/FragmentCronology, null, "History");
        obj = mTabHost.newTabSpec("Create");
        obj1 = LayoutInflater.from(this).inflate(0x7f030040, mTabHost.getTabWidget(), false);
        ((TextView)((View) (obj1)).findViewById(0x7f0d00e4)).setText(0x7f0800bb);
        ((ImageView)((View) (obj1)).findViewById(0x7f0d00e3)).setImageResource(0x7f0200ca);
        mTabsAdapter.addTab(((android.widget.TabHost.TabSpec) (obj)).setIndicator(((View) (obj1))), com/scannerfire/fragment/FragmentCrea, null, "Create");
        mTabHost.getTabWidget().getChildAt(0).setLayoutParams(new android.widget.LinearLayout.LayoutParams(i / 3, j / 10));
        mTabHost.getTabWidget().getChildAt(1).setLayoutParams(new android.widget.LinearLayout.LayoutParams(i / 3, j / 10));
        mTabHost.getTabWidget().getChildAt(2).setLayoutParams(new android.widget.LinearLayout.LayoutParams(i / 3, j / 10));
        if (bundle != null)
        {
            mTabHost.setCurrentTabByTag(bundle.getString("tab"));
        }
        fc = (FragmentCronology)mTabsAdapter.getItem(1);
        if (firstTime && Utils.getStartScanPref(getApplicationContext()))
        {
            firstTime = false;
            startActivity(new Intent(this, com/QRBS/activity/QrActivity));
            return;
        } else
        {
            mTabHost.setOnTabChangedListener(new android.widget.TabHost.OnTabChangeListener() {

                final StartActivity this$0;

                public void onTabChanged(String s)
                {
                    int k = mTabHost.getCurrentTab();
                    mViewPager.setCurrentItem(k);
                    if (!s.contentEquals("History"))
                    {
                        ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).clearCronology();
                        Utils.setLastElem(-1);
                    }
                }

            
            {
                this$0 = StartActivity.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag1 = true;
        if (mTabHost.getCurrentTab() == 1)
        {
            getSupportMenuInflater().inflate(0x7f0f0001, menu);
            SearchManager searchmanager = (SearchManager)getSystemService("search");
            SearchView searchview = (SearchView)menu.findItem(0x7f0d0087).getActionView();
            MenuItem menuitem = menu.findItem(0x7f0d0087);
            searchview.setSearchableInfo(searchmanager.getSearchableInfo(getComponentName()));
            searchview.setIconifiedByDefault(false);
            searchview.setOnCloseListener(new com.actionbarsherlock.widget.SearchView.OnCloseListener() {

                final StartActivity this$0;

                public boolean onClose()
                {
                    ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter("");
                    return false;
                }

            
            {
                this$0 = StartActivity.this;
                super();
            }
            });
            menuitem.setOnActionExpandListener(new com.actionbarsherlock.view.MenuItem.OnActionExpandListener() {

                final StartActivity this$0;

                public boolean onMenuItemActionCollapse(MenuItem menuitem1)
                {
                    ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter("");
                    Utils.setLastElem(-1);
                    return true;
                }

                public boolean onMenuItemActionExpand(MenuItem menuitem1)
                {
                    flag = true;
                    return true;
                }

            
            {
                this$0 = StartActivity.this;
                super();
            }
            });
            searchview.setOnQueryTextListener(new com.actionbarsherlock.widget.SearchView.OnQueryTextListener() {

                final StartActivity this$0;

                public boolean onQueryTextChange(String s)
                {
                    Utils.setLastElem(-1);
                    ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter(s);
                    return true;
                }

                public boolean onQueryTextSubmit(String s)
                {
                    Utils.setLastElem(-1);
                    ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter(s);
                    return true;
                }

            
            {
                this$0 = StartActivity.this;
                super();
            }
            });
            flag1 = super.onCreateOptionsMenu(menu);
        } else
        {
            getSupportMenuInflater().inflate(0x7f0f0000, menu);
            if (flag)
            {
                ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter("");
                flag = false;
                return true;
            }
        }
        return flag1;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        Log.d("", (new StringBuilder("CLICK ON ")).append(menuitem.toString()).toString());
        ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).clearCronology();
        Utils.setLastElem(-1);
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131558634: 
            startActivity(new Intent(this, com/QRBS/activity/About));
            return true;

        case 2131558636: 
            showDeleteDialog();
            return true;

        case 2131558635: 
            startActivity(new Intent(this, com/QRBS/activity/Opzioni));
            return true;

        case 16908332: 
            mTabHost.setCurrentTab(0);
            return true;

        case 2131558637: 
            saveToCsv();
            break;
        }
        return true;
    }

    public void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (bundle != null)
        {
            bundle.putString("tab", mTabHost.getCurrentTabTag());
        }
    }

    public void onStart()
    {
        super.onStart();
    }

    public void onTabSelected(com.actionbarsherlock.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }







}
