// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.core.BaseActivity;
import com.nbcsports.liveextra.ui.tve.AuthenticationWebView;
import com.phunware.nbc.sochi.FAQActivity;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            DaggerSelectProviderActivity_Component, ProviderDialogFragment, SelectProviderFragment

public class SelectProviderActivity extends BaseActivity
{
    public static interface Component
    {

        public abstract SelectProviderActivity activity();

        public abstract void inject(ProviderDialogFragment providerdialogfragment);

        public abstract void inject(SelectProviderActivity selectprovideractivity);

        public abstract void inject(SelectProviderFragment selectproviderfragment);
    }

    public class Module
    {

        private final SelectProviderActivity activity;
        final SelectProviderActivity this$0;

        SelectProviderActivity activity()
        {
            return activity;
        }

        public Module(SelectProviderActivity selectprovideractivity1)
        {
            this$0 = SelectProviderActivity.this;
            super();
            activity = selectprovideractivity1;
        }
    }


    public static final String ALLOW_TEMP_PASS = "allow_temp_pass";
    private Component component;
    IAccessEnablerDelegate _flddelegate;
    private boolean longPassEnabled;
    AuthService pass;
    private ProgressBar progressBar;
    private boolean shortPassEnabled;
    private boolean tempPassEnabled;
    TrackingHelper trackingHelper;
    private AuthenticationWebView webView;

    public SelectProviderActivity()
    {
        longPassEnabled = true;
        shortPassEnabled = true;
        _flddelegate = new AuthDelegate() {

            final SelectProviderActivity this$0;

            public void displayProviderDialog(ArrayList arraylist)
            {
                super.displayProviderDialog(arraylist);
                if (isTempPassEnabled())
                {
                    runOnUiThread(new Runnable() {

                        final _cls1 this$1;

                        public void run()
                        {
                            tryTempPass();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return;
                }
                if (getSupportFragmentManager().findFragmentById(0x7f0f006c) == null)
                {
                    getSupportFragmentManager().beginTransaction().replace(0x7f0f006c, SelectProviderFragment.getInstance(arraylist)).commit();
                }
                runOnUiThread(new Runnable() {

                    final _cls1 this$1;

                    public void run()
                    {
                        progressBar.setVisibility(8);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            public void navigateToUrl(String s)
            {
                super.navigateToUrl(s);
                runOnUiThread(s. new Runnable() {

                    final _cls1 this$1;
                    final String val$url;

                    public void run()
                    {
                        webView.setVisibility(0);
                        webView.setCallback(new com.nbcsports.liveextra.ui.tve.AuthenticationWebView.Callback() {

                            final _cls1 this$2;

                            public void onComplete()
                            {
                                if (isFinishing())
                                {
                                    return;
                                } else
                                {
                                    pass.getInstance().getAuthenticationToken();
                                    return;
                                }
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                        webView.loadUrl(url);
                    }

            
            {
                this$1 = final__pcls1;
                url = String.this;
                super();
            }
                });
            }

            public void selectedProvider(Mvpd mvpd)
            {
                super.selectedProvider(mvpd);
            }

            public void setAuthenticationStatus(final int status, String s)
            {
                super.setAuthenticationStatus(status, s);
                runOnUiThread(s. new Runnable() {

                    final _cls1 this$1;
                    final String val$errorCode;
                    final int val$status;

                    public void run()
                    {
                        String s;
                        byte byte0;
                        byte0 = -1;
                        if (status == 1)
                        {
                            setResult(-1, getIntent());
                            finish();
                            return;
                        }
                        if (pass.getSelectedMvpd() != null && isTempPassEnabled())
                        {
                            pass.cancelAuthN();
                            pass.getInstance().getAuthentication();
                            return;
                        }
                        s = errorCode;
                        s.hashCode();
                        JVM INSTR lookupswitch 4: default 152
                    //                                   -1798052747: 253
                    //                                   -1082188897: 267
                    //                                   -560385085: 225
                    //                                   -330798807: 239;
                           goto _L1 _L2 _L3 _L4 _L5
_L1:
                        byte0;
                        JVM INSTR tableswitch 0 2: default 180
                    //                                   0 281
                    //                                   1 281
                    //                                   2 335;
                           goto _L6 _L7 _L7 _L8
_L6:
                        pass.cancelAuthN();
                        setResult(0, getIntent());
                        finish();
                        return;
_L4:
                        if (s.equals("Internal Authentication Error"))
                        {
                            byte0 = 0;
                        }
                          goto _L1
_L5:
                        if (s.equals("Generic Authentication Error"))
                        {
                            byte0 = 1;
                        }
                          goto _L1
_L2:
                        if (s.equals("User Not Authenticated Error"))
                        {
                            byte0 = 2;
                        }
                          goto _L1
_L3:
                        if (s.equals("Provider not Selected Error"))
                        {
                            byte0 = 3;
                        }
                          goto _L1
_L7:
                        pass.cancelAuthN();
                        CookieManager cookiemanager = CookieManager.getInstance();
                        if (android.os.Build.VERSION.SDK_INT >= 21)
                        {
                            cookiemanager.removeAllCookies(null);
                        } else
                        {
                            cookiemanager.removeAllCookie();
                        }
                        pass.getInstance().getAuthentication();
                        return;
_L8:
                        Toast.makeText(getBaseContext(), errorCode, 0).show();
                          goto _L6
                    }

            
            {
                this$1 = final__pcls1;
                status = i;
                errorCode = String.this;
                super();
            }
                });
            }

            
            {
                this$0 = SelectProviderActivity.this;
                super();
            }
        };
    }

    private void inject()
    {
        if (component == null)
        {
            component = DaggerSelectProviderActivity_Component.builder().applicationComponent(NBCSportsApplication.component()).module(new Module(this)).build();
        }
        component.inject(this);
    }

    private boolean isTempPassEnabled()
    {
        return tempPassEnabled;
    }

    public Component component()
    {
        return component;
    }

    public void onBackPressed()
    {
        pass.unregister(_flddelegate);
        pass.getInstance().setSelectedProvider(null);
        setResult(0, getIntent());
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        inject();
        setContentView(0x7f04001e);
        setOrientation();
        getSupportActionBar().setIcon(0x7f030000);
        boolean flag = getIntent().getBooleanExtra("allow_temp_pass", true);
        if (pass.isTempPassEnabled() && flag)
        {
            bundle = (Asset)getIntent().getParcelableExtra("asset");
            if (bundle != null)
            {
                String s = bundle.getChannel();
                boolean flag1 = bundle.isLive();
                if (s.equalsIgnoreCase("nbc_linear") && flag1)
                {
                    tempPassEnabled = true;
                }
            }
        }
        webView = (AuthenticationWebView)findViewById(0x7f0f006f);
        progressBar = (ProgressBar)findViewById(0x7f0f0070);
        bundle = new HashMap();
        bundle.put("nbcs.section", "pass");
        bundle.put("nbcs.passlanding", "true");
        trackingHelper.trackPageEvent(":Pass:Landing Page", bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100000, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0f01fd)
        {
            startActivity(new Intent(this, com/phunware/nbc/sochi/FAQActivity));
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        pass.unregister(_flddelegate);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        pass.cancelAuthN();
        pass.register(_flddelegate);
        pass.getInstance().getAuthentication();
    }

    public void setSelectedMvpd(Mvpd mvpd)
    {
        pass.getInstance().setSelectedProvider(mvpd.getId());
        pass.getInstance().getSelectedProvider();
    }

    public void showProviderList(ArrayList arraylist)
    {
        ProviderDialogFragment.getInstance(arraylist).show(getSupportFragmentManager(), null);
    }

    public void tryTempPass()
    {
        if (longPassEnabled)
        {
            longPassEnabled = false;
            pass.getInstance().setSelectedProvider("TempPass-LongTTL");
            return;
        }
        if (shortPassEnabled)
        {
            shortPassEnabled = false;
            pass.getInstance().setSelectedProvider("TempPass-ShortTTL");
            return;
        } else
        {
            tempPassEnabled = false;
            pass.getInstance().getAuthentication();
            return;
        }
    }



}
