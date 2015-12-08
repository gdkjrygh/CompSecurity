// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Locale;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class SignUpWebViewClient extends WebViewClient
{

    private static final String TAG = "SignupActivity";
    private boolean mClearHistory;
    private String mCurrentPageURL;
    private boolean mSecurityFailure;
    private final SignupActivity mUi;
    private final NflxHandler nflxHandler = new NflxHandler();

    SignUpWebViewClient(SignupActivity signupactivity)
    {
        mClearHistory = false;
        mCurrentPageURL = null;
        mUi = signupactivity;
    }

    private com.netflix.mediaclient.protocol.nflx.NflxHandler.Response canHandleUri(String s)
    {
        try
        {
            s = nflxHandler.handleUri(mUi, null, null, Uri.parse(s), 0L);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SignupActivity", "Failed to parse nflx url ", s);
            return com.netflix.mediaclient.protocol.nflx.NflxHandler.Response.NOT_HANDLING;
        }
        return s;
    }

    private boolean isImage(String s)
    {
        boolean flag;
        if (s.startsWith("data:image") || s.endsWith(".png") || s.contains(".png?"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || s.endsWith(".jpg") || s.contains(".jpg?"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag || s.endsWith(".gif") || s.contains(".gif?");
    }

    private boolean isRealUrl(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return s.trim().toLowerCase(Locale.US).startsWith("https");
        }
    }

    private void securityCheck(String s)
    {
        if (mSecurityFailure)
        {
            Log.e("SignupActivity", (new StringBuilder()).append("We already failed. Ignoring to prevent multiple dialogs! URL: ").append(s).toString());
            mUi.showToast((new StringBuilder()).append("Loading insecure resource, ERROR:").append(s).toString());
        } else
        {
            Log.d("SignupActivity", (new StringBuilder()).append("Security check for URL: ").append(s).toString());
            if (s != null)
            {
                String s1 = s.toLowerCase(Locale.US).trim();
                if (!isImage(s1) && !s1.startsWith("https"))
                {
                    mSecurityFailure = true;
                    mUi.showToast((new StringBuilder()).append("Loading insecure resource, ERROR:").append(s).toString());
                    Log.e("SignupActivity", (new StringBuilder()).append("Trying to load from unsecure location in release build. Prevent loading, security breach! URL: ").append(s).toString());
                    s = mUi.getString(0x7f0c0199);
                    mUi.provideDialog(s, mUi.mHandleError);
                    return;
                }
            }
        }
    }

    public void clearHistory()
    {
        mClearHistory = true;
    }

    public void onLoadResource(WebView webview, String s)
    {
        if (Log.isLoggable("SignupActivity", 3))
        {
            Log.d("SignupActivity", (new StringBuilder()).append("onLoadResource: disabling security check from ").append(s).toString());
        }
        securityCheck(s);
        super.onLoadResource(webview, s);
    }

    public void onPageFinished(WebView webview, String s)
    {
        String s1 = webview.getOriginalUrl();
        if (mClearHistory && !StringUtils.safeEquals(mCurrentPageURL, s1))
        {
            webview.clearHistory();
            mClearHistory = false;
        }
        mCurrentPageURL = s1;
        super.onPageFinished(webview, s);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        Log.e("SignupActivity", (new StringBuilder()).append("SSL error: ").append(sslerror).toString());
        mUi.showToast((new StringBuilder()).append("SSL Failure loading ERROR: ").append(sslerror.getUrl()).toString());
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (isRealUrl(s))
        {
            webview.loadUrl(s);
        } else
        if (canHandleUri(s) != com.netflix.mediaclient.protocol.nflx.NflxHandler.Response.NOT_HANDLING)
        {
            Log.d("SignupActivity", (new StringBuilder()).append("=========> URL handled by Nflx protocol").append(s).toString());
        } else
        {
            Log.e("SignupActivity", (new StringBuilder()).append("=========> Invalid URL scheme, protocol not handled").append(s).toString());
            mUi.showToast((new StringBuilder()).append("Invalid URL scheme ").append(s).toString());
        }
        return true;
    }
}
