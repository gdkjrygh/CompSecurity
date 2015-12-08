// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.player.PlayerActivity;
import com.nbcsports.liveextra.ui.tve.AuthenticationWebView;
import com.phunware.nbc.sochi.FAQActivity;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import timber.log.Timber;

public class TempPassDialogFragment extends DialogFragment
{
    public static interface Callback
    {

        public abstract void pause();

        public abstract void play();

        public abstract void stop();
    }


    private static final String ARG_EXPIRED = "expired";
    private Callback callback;
    private IAccessEnablerDelegate _flddelegate;
    private Handler handler;
    private boolean hasExpired;
    TextView mTempPassCountdown;
    AuthService pass;
    private CountDownTimer timer;

    public TempPassDialogFragment()
    {
        handler = new Handler(Looper.getMainLooper());
        callback = new Callback() {

            final TempPassDialogFragment this$0;

            public void pause()
            {
            }

            public void play()
            {
            }

            public void stop()
            {
            }

            
            {
                this$0 = TempPassDialogFragment.this;
                super();
            }
        };
        _flddelegate = new AuthDelegate() {

            final TempPassDialogFragment this$0;

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

                        final _cls4 this$1;

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
                            if (getActivity() == null || getActivity().isFinishing())
                            {
                                return;
                            } else
                            {
                                callback.stop();
                                getDialog().dismiss();
                                return;
                            }
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    handler.post(s. new Runnable() {

                        final _cls4 this$1;
                        final String val$url;
                        final AuthenticationWebView val$webView;

                        public void run()
                        {
                            webView.loadUrl(url);
                        }

            
            {
                this$1 = final__pcls4;
                webView = authenticationwebview;
                url = String.this;
                super();
            }
                    });
                    return;
                }
            }

            public void setMetadataStatus(MetadataKey metadatakey, MetadataStatus metadatastatus)
            {
                super.setMetadataStatus(metadatakey, metadatastatus);
                if (metadatakey == null) goto _L2; else goto _L1
_L1:
                metadatakey.getKey();
                JVM INSTR tableswitch 0 0: default 32
            //                           0 33;
                   goto _L2 _L3
_L2:
                return;
_L3:
                metadatakey = metadatastatus.getSimpleResult();
                if (!TextUtils.isEmpty(metadatakey))
                {
                    Timber.d((new StringBuilder()).append("TempPass Dialog Expiration: ").append(metadatakey).toString(), new Object[0]);
                    handler.post(metadatakey. new Runnable() {

                        final _cls4 this$1;
                        final String val$authNResult;

                        public void run()
                        {
                            startTimer(authNResult);
                        }

            
            {
                this$1 = final__pcls4;
                authNResult = String.this;
                super();
            }
                    });
                    return;
                } else
                {
                    pass.getInstance().logout();
                    return;
                }
            }

            
            {
                this$0 = TempPassDialogFragment.this;
                super();
            }
        };
    }

    public static TempPassDialogFragment newInstance(boolean flag)
    {
        TempPassDialogFragment temppassdialogfragment = new TempPassDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expired", flag);
        temppassdialogfragment.setArguments(bundle);
        return temppassdialogfragment;
    }

    private void setTime(long l)
    {
        if (mTempPassCountdown == null)
        {
            return;
        } else
        {
            Period period = new Period(l);
            PeriodFormatter periodformatter = (new PeriodFormatterBuilder()).printZeroIfSupported().minimumPrintedDigits(2).appendMinutes().appendLiteral(" : ").printZeroIfSupported().appendSeconds().toFormatter();
            mTempPassCountdown.setText(periodformatter.print(period));
            return;
        }
    }

    private void startTimer(String s)
    {
        if (timer != null)
        {
            return;
        } else
        {
            long l = DateTime.parse(s.replaceAll("/", "-").replaceFirst(" ", "T").replaceFirst(" GMT ", ""), ISODateTimeFormat.dateTimeNoMillis().withZone(DateTimeZone.getDefault())).getMillis() - DateTime.now().getMillis();
            setTime(l);
            timer = (new CountDownTimer(l, 1000L) {

                final TempPassDialogFragment this$0;

                public void onFinish()
                {
                    if (getDialog() == null)
                    {
                        return;
                    } else
                    {
                        dismiss();
                        return;
                    }
                }

                public void onTick(long l1)
                {
                    setTime(l1);
                }

            
            {
                this$0 = TempPassDialogFragment.this;
                super(l, l1);
            }
            }).start();
            return;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        PlayerActivity.component().inject(this);
    }

    void onContinue()
    {
        if (hasExpired)
        {
            Timber.d("Logging out of temp pass", new Object[0]);
            pass.getInstance().logout();
        } else
        {
            Timber.d("Canceling dialog", new Object[0]);
            callback.play();
        }
        getDialog().dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(2, getTheme());
        hasExpired = getArguments().getBoolean("expired");
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Object obj = new android.app.AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 0x7f0a0083));
        bundle = getActivity().getLayoutInflater();
        android.view.WindowManager.LayoutParams layoutparams;
        if (!hasExpired)
        {
            bundle = bundle.inflate(0x7f040047, null);
            ((android.app.AlertDialog.Builder) (obj)).setCancelable(true);
        } else
        {
            bundle = bundle.inflate(0x7f040048, null);
            ((android.app.AlertDialog.Builder) (obj)).setCancelable(false);
        }
        ButterKnife.bind(this, bundle);
        ((android.app.AlertDialog.Builder) (obj)).setView(bundle);
        ((android.app.AlertDialog.Builder) (obj)).setCancelable(true);
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        if (hasExpired)
        {
            ((AlertDialog) (obj)).setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

                final TempPassDialogFragment this$0;

                public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
                {
                    if (i == 4)
                    {
                        pass.getInstance().logout();
                    }
                    return true;
                }

            
            {
                this$0 = TempPassDialogFragment.this;
                super();
            }
            });
        }
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
        ((AlertDialog) (obj)).requestWindowFeature(1);
        layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.copyFrom(((AlertDialog) (obj)).getWindow().getAttributes());
        layoutparams.width = -1;
        layoutparams.height = -2;
        ((AlertDialog) (obj)).getWindow().setAttributes(layoutparams);
        ((AlertDialog) (obj)).setView(bundle, 0, 0, 0, 0);
        return ((Dialog) (obj));
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    void onFaq()
    {
        startActivity(new Intent(getActivity().getApplicationContext(), com/phunware/nbc/sochi/FAQActivity));
    }

    void onHelp()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.nbcsports.com/content/help")));
    }

    public void onPause()
    {
        super.onPause();
        if (timer != null)
        {
            timer.cancel();
        }
        pass.unregister(_flddelegate);
    }

    public void onResume()
    {
        super.onResume();
        pass.register(_flddelegate);
        if (!hasExpired)
        {
            pass.getAuthNTTL();
        }
        callback.pause();
    }

    public void onVerify()
    {
        if (getActivity() == null || getActivity().isFinishing())
        {
            return;
        } else
        {
            pass.getInstance().logout();
            callback.stop();
            hasExpired = true;
            getDialog().dismiss();
            return;
        }
    }

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }




}
