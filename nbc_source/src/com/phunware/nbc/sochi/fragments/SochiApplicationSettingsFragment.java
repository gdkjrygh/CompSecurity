// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.core.BaseFragment;
import com.nbcsports.liveextra.ui.tve.AuthenticationWebView;
import com.phunware.nbc.sochi.CaptionStylingActivity;
import com.phunware.nbc.sochi.DisclosureActivity;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.accessenable.SelectProviderActivity;
import com.phunware.nbc.sochi.accessenable.TempPassResetActivity;
import com.phunware.nbc.sochi.system.AppSharedPreferences;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import dagger.Lazy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NBCAttributionsFragment

public class SochiApplicationSettingsFragment extends BaseFragment
{

    AppPreferences appPreferences;
    Lazy clientLazy;
    Configuration config;
    IAccessEnablerDelegate _flddelegate;
    CheckBox enableClosedCaptions;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean isAuthenticated;
    private boolean mLoginButtonEnabled;
    AuthService pass;
    SharedPreferences preferences;
    private int secretHitClick;
    private boolean shouldAuthenticate;
    List tempPassViews;
    private TextView tvAlerts;
    private TextView tvTelevisionProvider;

    public SochiApplicationSettingsFragment()
    {
        secretHitClick = 0;
        _flddelegate = new AuthDelegate() {

            final SochiApplicationSettingsFragment this$0;

            public void displayProviderDialog(ArrayList arraylist)
            {
                super.displayProviderDialog(arraylist);
            }

            public void navigateToUrl(String s)
            {
                super.navigateToUrl(s);
                final AuthenticationWebView webView = getView();
                if (webView == null)
                {
                    return;
                } else
                {
                    webView = (AuthenticationWebView)webView.findViewById(0x7f0f006f);
                    webView.setCallback(new com.nbcsports.liveextra.ui.tve.AuthenticationWebView.Callback() {

                        final _cls12 this$1;

                        public void onComplete()
                        {
                            CookieManager cookiemanager = CookieManager.getInstance();
                            if (cookiemanager != null)
                            {
                                if (android.os.Build.VERSION.SDK_INT >= 21)
                                {
                                    cookiemanager.removeAllCookies(null);
                                } else
                                {
                                    cookiemanager.removeAllCookie();
                                }
                            }
                            if (isActivityDead())
                            {
                                return;
                            } else
                            {
                                pass.getInstance().checkAuthentication();
                                pass.getInstance().getSelectedProvider();
                                return;
                            }
                        }

            
            {
                this$1 = _cls12.this;
                super();
            }
                    });
                    handler.post(s. new Runnable() {

                        final _cls12 this$1;
                        final String val$url;
                        final AuthenticationWebView val$webView;

                        public void run()
                        {
                            webView.loadUrl(url);
                        }

            
            {
                this$1 = final__pcls12;
                webView = authenticationwebview;
                url = String.this;
                super();
            }
                    });
                    return;
                }
            }

            public void selectedProvider(Mvpd mvpd)
            {
                super.selectedProvider(mvpd);
                setLoginText(mvpd);
            }

            public void setAuthenticationStatus(int i, String s)
            {
                super.setAuthenticationStatus(i, s);
                if (i == 1)
                {
                    isAuthenticated = true;
                    pass.getInstance().getSelectedProvider();
                    return;
                } else
                {
                    isAuthenticated = false;
                    setLoginText(null);
                    return;
                }
            }

            public void setRequestorComplete(int i)
            {
                super.setRequestorComplete(i);
                if (shouldAuthenticate)
                {
                    pass.getInstance().getAuthentication();
                    shouldAuthenticate = false;
                }
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
        };
    }

    private String getDeviceId()
    {
        return android.provider.Settings.Secure.getString(getActivity().getApplication().getContentResolver(), "android_id");
    }

    private void onShowHelp()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(config.getHelpURL())));
    }

    private void setAlertReminderSetting()
    {
        String as[];
        String s;
        as = getActivity().getResources().getStringArray(0x7f0d0000);
        s = AppSharedPreferences.getSetting(getActivity().getBaseContext(), "event_alert_interval");
        if (tvAlerts == null || s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        int i = Integer.parseInt(s);
        AppSharedPreferences.addSetting(getActivity().getBaseContext(), "event_alert_interval", (new StringBuilder()).append("").append(i).toString());
        tvAlerts.setText(as[i]);
_L1:
        return;
        if (tvAlerts != null)
        {
            tvAlerts.setText(as[2]);
            AppSharedPreferences.addSetting(getActivity().getBaseContext(), "event_alert_interval", "2");
            return;
        }
          goto _L1
        Exception exception;
        exception;
    }

    private void setLoginText(final Mvpd mvpd)
    {
        handler.post(new Runnable() {

            final SochiApplicationSettingsFragment this$0;
            final Mvpd val$mvpd;

            public void run()
            {
                if (tvTelevisionProvider == null || isActivityDead())
                {
                    return;
                }
                if (mvpd != null)
                {
                    tvTelevisionProvider.setText((new StringBuilder()).append(mvpd.getDisplayName()).append(" (").append(getString(0x7f070124)).append(")").toString());
                } else
                {
                    tvTelevisionProvider.setText(getString(0x7f070197));
                }
                mLoginButtonEnabled = true;
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                mvpd = mvpd1;
                super();
            }
        });
    }

    private void showEventIntervalDialog()
    {
        Object obj = AppSharedPreferences.getSetting(getActivity().getBaseContext(), "event_alert_interval");
        int i;
        if (obj == null)
        {
            i = 2;
        } else
        {
            try
            {
                i = Integer.parseInt(((String) (obj)));
            }
            catch (Exception exception)
            {
                NBCSystem.debugLog("SettingsFragment", exception.toString());
                i = 0;
            }
        }
        obj = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setTitle(0x7f07005d);
        ((android.app.AlertDialog.Builder) (obj)).setSingleChoiceItems(0x7f0d0000, i, new android.content.DialogInterface.OnClickListener() {

            final SochiApplicationSettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                AppSharedPreferences.addSetting(getActivity().getBaseContext(), "event_alert_interval", (new StringBuilder()).append("").append(j).toString());
                setAlertReminderSetting();
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final SochiApplicationSettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).create().show();
    }

    private void showLastKnownError()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle("Error Tail Log");
        builder.setMessage(NBCSystem.getLastKnownErrorTail());
        builder.setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final SochiApplicationSettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
        });
        builder.create().show();
    }

    private void showOpenSourceTerms()
    {
        (new NBCAttributionsFragment()).show(getActivity().getSupportFragmentManager(), null);
    }

    private void showSecretOptions()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle("Data Source Toggle");
        String s = (new StringBuilder()).append(getString(0x7f0700ad)).append("\r\n Active:\r\n").append(getString(0x7f0700b5)).toString();
        builder.setMessage((new StringBuilder()).append(s).append("\r\n minApplicationVersionAndroid: ").append(config.getMinApplicationVersionAndroid()).toString());
        builder.setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final SochiApplicationSettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                Intent intent = new Intent(getActivity(), com/phunware/nbc/sochi/accessenable/TempPassResetActivity);
                String s1 = config.getAdobePassRequestorId();
                String s2 = config.getAdobePassSignedRequestorId();
                intent.putExtra("requestorId", s1);
                intent.putExtra("apiKey", s2);
                startActivity(intent);
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final SochiApplicationSettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
        });
        builder.create().show();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        MainNavigationContentActivity.component().inject(this);
        pass.setDefaultRequestor();
        enableClosedCaptions.setChecked(appPreferences.enableClosedCaptions());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        pass.register(_flddelegate);
        if (i == 100 && j == 0)
        {
            pass.getInstance().setSelectedProvider(null);
        }
    }

    public void onClickClosedCaptioning(boolean flag)
    {
        appPreferences.enableClosedCaptions(flag);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04009c, viewgroup, false);
        ButterKnife.bind(this, layoutinflater);
        bundle = NBCSystem.getVersion();
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0f01dd);
        viewgroup.setText(bundle);
        bundle = (TextView)layoutinflater.findViewById(0x7f0f01e3);
        tvAlerts = (TextView)layoutinflater.findViewById(0x7f0f01d8);
        setAlertReminderSetting();
        if (bundle != null)
        {
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    showOpenSourceTerms();
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
        }
        bundle = (TextView)layoutinflater.findViewById(0x7f0f01e4);
        if (bundle != null)
        {
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    onShowHelp();
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
        }
        if (tvAlerts != null)
        {
            tvAlerts.setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    showEventIntervalDialog();
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
        }
        tvTelevisionProvider = (TextView)layoutinflater.findViewById(0x7f0f01d9);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() );
        if (tvTelevisionProvider != null)
        {
            try
            {
                tvTelevisionProvider.setOnClickListener(new android.view.View.OnClickListener() {

                    final SochiApplicationSettingsFragment this$0;

                    public void onClick(View view)
                    {
                        if (!mLoginButtonEnabled)
                        {
                            return;
                        }
                        mLoginButtonEnabled = false;
                        if (isAuthenticated)
                        {
                            pass.getInstance().logout();
                            handler.post(new Runnable() {

                                final _cls6 this$1;

                                public void run()
                                {
                                    tvTelevisionProvider.setText(getString(0x7f070123));
                                }

            
            {
                this$1 = _cls6.this;
                super();
            }
                            });
                            return;
                        } else
                        {
                            view = new Intent(getActivity(), com/phunware/nbc/sochi/accessenable/SelectProviderActivity);
                            view.putExtra("allow_temp_pass", false);
                            startActivityForResult(view, 100);
                            return;
                        }
                    }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
                });
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                NBCSystem.debugLog("SochiApplicationSettingsFragment", viewgroup.toString());
            }
            ((TextView)layoutinflater.findViewById(0x7f0f01df)).setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    view = new Intent(getActivity(), com/phunware/nbc/sochi/CaptionStylingActivity);
                    startActivity(view);
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
            ((TextView)layoutinflater.findViewById(0x7f0f01e0)).setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    view = new Intent(getActivity(), com/phunware/nbc/sochi/DisclosureActivity);
                    startActivity(view);
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
            ((TextView)layoutinflater.findViewById(0x7f0f01e1)).setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    view = new Intent("android.intent.action.VIEW");
                    view.setData(Uri.parse(getString(0x7f070168)));
                    startActivity(view);
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
            ((TextView)layoutinflater.findViewById(0x7f0f01e2)).setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    view = new Intent("android.intent.action.VIEW");
                    if ("nbclive".equals("golf"))
                    {
                        view.setData(Uri.parse("http://www.golfchannel.com/about/terms-of-use/"));
                    } else
                    if ("nbclive".equals("telemundo"))
                    {
                        view.setData(Uri.parse("http://msnlatino.telemundo.com/legal_terms/"));
                    } else
                    {
                        view.setData(Uri.parse("http://m.nbcsports.com/content/terms-and-conditions"));
                    }
                    startActivity(view);
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
        }
        viewgroup = (LinearLayout)layoutinflater.findViewById(0x7f0f01d6);
        bundle = (TextView)layoutinflater.findViewById(0x7f0f01d7);
        if ("nbclive".equals("nbclive"))
        {
            viewgroup.setVisibility(0);
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final SochiApplicationSettingsFragment this$0;

                public void onClick(View view)
                {
                    view = new Intent(getActivity(), air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity);
                    startActivity(view);
                }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
            });
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        onDestroyView();
        ButterKnife.unbind(this);
    }

    public void onPause()
    {
        onPause();
        pass.unregister(_flddelegate);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.clear();
        onPrepareOptionsMenu(menu);
    }

    void onReenableTempPass()
    {
        preferences.edit().putBoolean("TempPassEnabled", true).apply();
        Toast.makeText(getActivity(), "Temp Pass Reenabled", 0).show();
    }

    void onResetTempPass(View view)
    {
        view = (String)view.getTag();
        view = Uri.parse("https://mgmt.auth.adobe.com").buildUpon().appendEncodedPath("/reset-tempass/v2/reset").appendQueryParameter("device_id", getDeviceId()).appendQueryParameter("requestor_id", "nbcentertainment").appendQueryParameter("mvpd_id", view).build();
        view = (new Builder()).url(view.toString()).header("apiKey", "WEwV2lPkLvFCSBF83D5viGGwa2mI8y4s").delete().build();
        ((OkHttpClient)clientLazy.get()).clone().newCall(view).enqueue(new Callback() {

            final SochiApplicationSettingsFragment this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                handler.post(new Runnable() {

                    final _cls19 this$1;

                    public void run()
                    {
                        Toast.makeText(getActivity(), "NETWORK FAILURE", 0).show();
                    }

            
            {
                this$1 = _cls19.this;
                super();
            }
                });
            }

            public void onResponse(Response response)
                throws IOException
            {
                handler.post(response. new Runnable() {

                    final _cls19 this$1;
                    final Response val$response;

                    public void run()
                    {
                        FragmentActivity fragmentactivity = getActivity();
                        String s;
                        if (response.isSuccessful())
                        {
                            s = "SUCCESS";
                        } else
                        {
                            s = "REQUEST FAILURE";
                        }
                        Toast.makeText(fragmentactivity, s, 0).show();
                    }

            
            {
                this$1 = final__pcls19;
                response = Response.this;
                super();
            }
                });
            }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }
        });
    }

    public void onResume()
    {
        onResume();
        pass.register(_flddelegate);
        pass.getInstance().checkAuthentication();
    }








/*
    static int access$302(SochiApplicationSettingsFragment sochiapplicationsettingsfragment, int i)
    {
        sochiapplicationsettingsfragment.secretHitClick = i;
        return i;
    }

*/


/*
    static int access$308(SochiApplicationSettingsFragment sochiapplicationsettingsfragment)
    {
        int i = sochiapplicationsettingsfragment.secretHitClick;
        sochiapplicationsettingsfragment.secretHitClick = i + 1;
        return i;
    }

*/




/*
    static boolean access$502(SochiApplicationSettingsFragment sochiapplicationsettingsfragment, boolean flag)
    {
        sochiapplicationsettingsfragment.mLoginButtonEnabled = flag;
        return flag;
    }

*/



/*
    static boolean access$602(SochiApplicationSettingsFragment sochiapplicationsettingsfragment, boolean flag)
    {
        sochiapplicationsettingsfragment.isAuthenticated = flag;
        return flag;
    }

*/





/*
    static boolean access$902(SochiApplicationSettingsFragment sochiapplicationsettingsfragment, boolean flag)
    {
        sochiapplicationsettingsfragment.shouldAuthenticate = flag;
        return flag;
    }

*/
}
