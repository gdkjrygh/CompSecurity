// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.skype.SkyLib;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.res.Urls;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.SignInDurationReporter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.app.signin:
//            AbstractSignInActivity, SignInConstants, LinkingSkypeNamesFoundActivity, LinkingSkypeNamesNotFoundActivity, 
//            LinkingGetAccounts, TokenPair, LinkingTermsOfUseActivity

public class SignInLiveIdActivity extends AbstractSignInActivity
    implements LinkingGetAccounts.LinkingCallback, SignInConstants
{
    public static class ConnectionErrorDialog extends h
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.support.v7.app.AlertDialog.a(getActivity(), 0x7f0900cd);
            bundle.a(0x7f080281);
            bundle.b(0x7f08039f);
            android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

                final ConnectionErrorDialog this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == -1)
                    {
                        ((SignInLiveIdActivity)getActivity()).webView.goBack();
                    } else
                    if (i == -2)
                    {
                        getActivity().finish();
                        return;
                    }
                }

            
            {
                this$0 = ConnectionErrorDialog.this;
                super();
            }
            };
            bundle.a(0x7f080340, onclicklistener);
            bundle.b(0x7f080120, onclicklistener);
            bundle.a(false);
            return bundle.c();
        }

        public ConnectionErrorDialog()
        {
        }
    }


    private static final Pattern ALLOWED_HOSTS = Pattern.compile(".*\\.(live|live-int)\\.com");
    private static final String MSA_PARAM_USERNAME = "username";
    ActionBarCustomizer actionBarCustomizer;
    LinkingGetAccounts linkingGetAccounts;
    private ArrayList microsoftAccounts;
    ProgressBar progressBar;
    SignInDurationReporter signInDurationReporter;
    private boolean skypeInfoChecked;
    private ArrayList suggestedAccounts;
    Urls urls;
    WebView webView;

    public SignInLiveIdActivity()
    {
        microsoftAccounts = new ArrayList();
        suggestedAccounts = new ArrayList();
    }

    private void accountsLinking(boolean flag)
    {
        Intent intent;
        if (suggestedAccounts.size() > 0)
        {
            intent = new Intent(this, com/skype/android/app/signin/LinkingSkypeNamesFoundActivity);
            intent.putParcelableArrayListExtra("suggestedAccounts", suggestedAccounts);
        } else
        {
            intent = new Intent(this, com/skype/android/app/signin/LinkingSkypeNamesNotFoundActivity);
        }
        intent.putParcelableArrayListExtra("microsoftAccounts", microsoftAccounts);
        intent.putExtra("accessToken", skypeAccessToken);
        intent.putExtra("refreshToken", refreshToken);
        intent.putExtra("marketing", flag);
        startActivity(intent);
        finish();
    }

    private void dealWithGenericError()
    {
        showConnectionErrorDialog();
        AccountUtil.a(getApplicationContext());
    }

    private void doLiveIdSignin()
    {
        signInWithMsa();
    }

    private void getMsaLinkingAccounts(com.skype.android.gen.SkyLibListener.OnSuggestedAccountsResult onsuggestedaccountsresult)
    {
        linkingGetAccounts.setEvent(onsuggestedaccountsresult);
        linkingGetAccounts.getMsaInfo(skypeAccessToken, refreshToken, configuration.getMSALoginScope(), this);
    }

    private void handleCallbackUrl(String s)
    {
        s = TokenPair.parseTokensFromCallbackUrlFragment(s);
        skypeAccessToken = s.getAccessToken();
        refreshToken = s.getRefreshToken();
        if (lib.getSkypeLinkInfo(MS_PARTNER_ID, skypeAccessToken))
        {
            showProgress();
            return;
        }
        try
        {
            showConnectionErrorDialog();
            webView.goBack();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        showConnectionErrorDialog();
        return;
    }

    private void handleSkypeLinkInfoResult(com.skype.android.gen.SkyLibListener.OnPartnerLinkInfoResult onpartnerlinkinforesult)
    {
        com.skype.SkyLib.AUTH_RESULT auth_result = onpartnerlinkinforesult.getCode();
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$SkyLib$AUTH_RESULT[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$AUTH_RESULT = new int[com.skype.SkyLib.AUTH_RESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_ANOTHER_MAPPING_EXISTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_OK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.skype.SkyLib.AUTH_RESULT[auth_result.ordinal()])
        {
        default:
            dealWithGenericError();
            return;

        case 1: // '\001'
            doLiveIdSignin();
            return;

        case 2: // '\002'
            break;
        }
        if (TextUtils.isEmpty(onpartnerlinkinforesult.getSkypename()))
        {
            log.info("no merged account found");
            lib.getSuggestedAccounts(MS_PARTNER_ID, skypeAccessToken);
            return;
        } else
        {
            log.info("account already merged");
            doLiveIdSignin();
            return;
        }
    }

    private void setupWebView()
    {
        WebSettings websettings = webView.getSettings();
        websettings.setSavePassword(false);
        websettings.setJavaScriptEnabled(true);
        websettings.setSupportZoom(true);
        webView.clearHistory();
        webView.clearFormData();
        webView.clearCache(true);
        AccountUtil.a(getApplicationContext());
        websettings.setSavePassword(false);
        websettings.setJavaScriptEnabled(true);
        websettings.setAllowFileAccess(false);
        websettings.setPluginState(android.webkit.WebSettings.PluginState.OFF);
        websettings.setSaveFormData(false);
        websettings.setAppCacheEnabled(false);
        webView.setWebViewClient(new WebViewClient() {

            final SignInLiveIdActivity this$0;

            public final void onPageFinished(WebView webview, String s)
            {
                webview = createSignInTelemetryEvent(LogEvent.w, SignInConstants.AccountType.MSA, false);
                analytics.a(webview);
                signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.c, String.valueOf(SignInConstants.AccountType.MSA), false);
                progressBar.setVisibility(4);
                if (s.startsWith(getString(0x7f080565)))
                {
                    handleCallbackUrl(s);
                }
            }

            public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
            {
                progressBar.setVisibility(0);
                progressBar.setProgress(0);
            }

            public final void onReceivedError(WebView webview, int i, String s, String s1)
            {
                SignInLiveIdActivity.access$300.info((new StringBuilder("onReceivedError code:")).append(i).append(" description:").append(s).append(" url:").append(s1).toString());
                showConnectionDialog();
            }

            public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
            {
                SignInLiveIdActivity.access$300.info((new StringBuilder("onReceivedSslError: ")).append(sslerror.getPrimaryError()).toString());
                progressBar.setVisibility(4);
            }

            public final boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                webview = Uri.parse(s);
                if (webview != null && webview.getHost() != null && SignInLiveIdActivity.ALLOWED_HOSTS.matcher(webview.getHost()).matches())
                {
                    return false;
                } else
                {
                    showConnectionDialog();
                    return true;
                }
            }

            
            {
                this$0 = SignInLiveIdActivity.this;
                super();
            }
        });
        webView.setWebChromeClient(new WebChromeClient() );
        webView.requestFocus(130);
        webView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final SignInLiveIdActivity this$0;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 28
            //                           0 30
            //                           1 30;
                   goto _L1 _L2 _L2
_L1:
                return false;
_L2:
                if (!view.hasFocus())
                {
                    view.requestFocus();
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = SignInLiveIdActivity.this;
                super();
            }
        });
    }

    private void showConnectionDialog()
    {
        webView.loadData("", "", "");
        (new ConnectionErrorDialog()).show(getSupportFragmentManager(), null);
    }

    public void microsoftAccounts(String s, String s1, ArrayList arraylist, ArrayList arraylist1)
    {
        skypeAccessToken = s;
        refreshToken = s1;
        microsoftAccounts = arraylist;
        suggestedAccounts = arraylist1;
        Intent intent = new Intent(this, com/skype/android/app/signin/LinkingTermsOfUseActivity);
        intent.putExtra("marketing", true);
        intent.putExtra("accessToken", s);
        intent.putExtra("refreshToken", s1);
        intent.putParcelableArrayListExtra("suggestedAccounts", arraylist1);
        intent.putParcelableArrayListExtra("microsoftAccounts", arraylist);
        startActivityForResult(intent, 0);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        onActivityResult(i, j, intent);
        if (j == -1)
        {
            boolean flag = intent.getBooleanExtra("marketing", false);
            skypeAccessToken = intent.getStringExtra("accessToken");
            refreshToken = intent.getStringExtra("refreshToken");
            suggestedAccounts = intent.getParcelableArrayListExtra("suggestedAccounts");
            microsoftAccounts = intent.getParcelableArrayListExtra("microsoftAccounts");
            showProgress();
            accountsLinking(flag);
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        if (webView.canGoBack())
        {
            webView.goBack();
            return;
        } else
        {
            onBackPressed();
            finish();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        setTitle(null);
        getSupportActionBar().b(true);
        getSupportActionBar().a();
        actionBarCustomizer.makeLogoBig();
        progressBar.setMax(100);
        setupWebView();
    }

    public void onDestroy()
    {
        webView.destroy();
        onDestroy();
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAccountPartnerLinkResult onaccountpartnerlinkresult)
    {
        if (onaccountpartnerlinkresult.getCode() == com.skype.SkyLib.AUTH_RESULT.AUTH_OK)
        {
            navigation.home();
            finish();
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnPartnerLinkInfoResult onpartnerlinkinforesult)
    {
        if (!skypeInfoChecked)
        {
            handleSkypeLinkInfoResult(onpartnerlinkinforesult);
            skypeInfoChecked = true;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnSuggestedAccountsResult onsuggestedaccountsresult)
    {
        if (onsuggestedaccountsresult.getCode() == com.skype.SkyLib.AUTH_RESULT.AUTH_OK)
        {
            getMsaLinkingAccounts(onsuggestedaccountsresult);
        }
    }

    public void onLinkingError(String s)
    {
        dealWithGenericError();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    public void onResume()
    {
        onResume();
        String s1 = urls.a(com.skype.android.res.Urls.Type.r);
        String s2 = getIntent().getStringExtra("username");
        String s = s1;
        if (s2 != null)
        {
            try
            {
                s = (new StringBuilder()).append(s1).append(String.format("&%s=%s", new Object[] {
                    "username", URLEncoder.encode(s2, "utf-8")
                })).toString();
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception);
            }
        }
        webView.loadUrl(s);
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.j, String.valueOf(SignInConstants.AccountType.MSA), false, String.valueOf(SignInConstants.ScreenName.MSA_SIGN_IN_SCREEN));
    }







}
