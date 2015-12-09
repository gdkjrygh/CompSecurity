// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package ly.kite.instagramphotopicker:
//            InstagramPhotoPicker, InstagramGalleryActivity

public class InstagramLoginActivity extends Activity
{

    private static final String EXTRA_CLIENT_ID = "ly.kite.instagramimagepicker.EXTRA_CLIENT_ID";
    private static final String EXTRA_REDIRECT_URI = "ly.kite.instagramimagepicker.EXTRA_REDIRECT_URI";
    private static final String GENERIC_LOGIN_ERROR_MESSAGE = "You need to authorise the application to allow photo picking. Please try again.";
    private static final int REQUEST_CODE_GALLERY = 99;
    private String clientId;
    private String redirectUri;
    private final WebViewClient webViewClient = new WebViewClient() {

        final InstagramLoginActivity this$0;

        public void onLoadResource(WebView webview1, String s)
        {
        }

        public void onPageFinished(WebView webview1, String s)
        {
        }

        public void onPageStarted(WebView webview1, String s, Bitmap bitmap)
        {
        }

        public boolean shouldOverrideUrlLoading(WebView webview1, String s)
        {
            if (s != null && s.startsWith(redirectUri))
            {
                webview1 = Uri.parse(s);
                if (webview1.getQueryParameter("error") != null)
                {
                    webview1 = getLoginErrorMessage(webview1);
                    webview.stopLoading();
                    loadLoginPage();
                    showErrorDialog(webview1);
                } else
                {
                    webview1 = webview1.getFragment().substring("access_token=".length());
                    gotAccessToken(webview1);
                }
                return true;
            } else
            {
                return false;
            }
        }

            
            {
                this$0 = InstagramLoginActivity.this;
                super();
            }
    };
    private WebView webview;

    public InstagramLoginActivity()
    {
    }

    private final String getLoginErrorMessage(Uri uri)
    {
label0:
        {
            String s1 = uri.getQueryParameter("error_reason");
            String s = "An unknown error occurred. Please try again.";
            if (s1 != null)
            {
                if (!s1.equalsIgnoreCase("user_denied"))
                {
                    break label0;
                }
                s = "You need to authorise the application to allow photo picking. Please try again.";
            }
            return s;
        }
        uri = uri.getQueryParameter("error_description");
        if (uri == null)
        {
            return "You need to authorise the application to allow photo picking. Please try again.";
        }
        try
        {
            uri = URLDecoder.decode(uri, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return "You need to authorise the application to allow photo picking. Please try again.";
        }
        return uri;
    }

    private void gotAccessToken(String s)
    {
        InstagramPhotoPicker.saveInstagramPreferences(this, s, clientId, redirectUri);
        InstagramGalleryActivity.startForResult(this, 99);
    }

    private void loadLoginPage()
    {
        String s = (new StringBuilder()).append("https://api.instagram.com/oauth/authorize/?client_id=").append(clientId).append("&redirect_uri=").append(redirectUri).append("&response_type=token").toString();
        webview.loadUrl(s);
    }

    private void showErrorDialog(String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Error");
        builder.setMessage(s);
        builder.setPositiveButton("OK", null);
        builder.show();
    }

    public static void startLoginForResult(Activity activity, String s, String s1, int i)
    {
        Intent intent = new Intent(activity, ly/kite/instagramphotopicker/InstagramLoginActivity);
        intent.putExtra("ly.kite.instagramimagepicker.EXTRA_CLIENT_ID", s);
        intent.putExtra("ly.kite.instagramimagepicker.EXTRA_REDIRECT_URI", s1);
        activity.startActivityForResult(intent, i);
    }

    public static void startLoginForResult(Fragment fragment, String s, String s1, int i)
    {
        Intent intent = new Intent(fragment.getActivity(), ly/kite/instagramphotopicker/InstagramLoginActivity);
        intent.putExtra("ly.kite.instagramimagepicker.EXTRA_CLIENT_ID", s);
        intent.putExtra("ly.kite.instagramimagepicker.EXTRA_REDIRECT_URI", s1);
        fragment.startActivityForResult(intent, i);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        setResult(j, intent);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_instagram_login);
        clientId = getIntent().getStringExtra("ly.kite.instagramimagepicker.EXTRA_CLIENT_ID");
        redirectUri = getIntent().getStringExtra("ly.kite.instagramimagepicker.EXTRA_REDIRECT_URI");
        webview = (WebView)findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(webViewClient);
        loadLoginPage();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        clientId = bundle.getString("ly.kite.instagramimagepicker.EXTRA_CLIENT_ID");
        redirectUri = bundle.getString("ly.kite.instagramimagepicker.EXTRA_REDIRECT_URI");
        webview.restoreState(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("ly.kite.instagramimagepicker.EXTRA_CLIENT_ID", clientId);
        bundle.putString("ly.kite.instagramimagepicker.EXTRA_REDIRECT_URI", redirectUri);
        webview.saveState(bundle);
    }






}
