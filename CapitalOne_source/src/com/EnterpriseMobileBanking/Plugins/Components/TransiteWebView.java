// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.widget.Toast;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import com.EnterpriseMobileBanking.Utils.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            StdAppWebView

public class TransiteWebView extends StdAppWebView
    implements DownloadListener
{

    private Context appctx;

    public TransiteWebView(Context context)
    {
        super(context);
        setupValues(context);
    }

    public TransiteWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setupValues(context);
    }

    public TransiteWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setupValues(context);
    }

    public TransiteWebView(Context context, WebViewLinker webviewlinker)
    {
        super(context);
        setupValues(context);
    }

    private void setupValues(Context context)
    {
        Log.d("TWV", "Setup Values!");
        appctx = context;
        setAnimationCacheEnabled(true);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setGeolocationEnabled(true);
        getSettings().setCacheMode(2);
        getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        setHorizontalScrollBarEnabled(false);
        setDownloadListener(this);
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        Log.d("TWV", "On Download Started!");
        s2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!s2.canWrite())
        {
            Toast.makeText(appctx, "Disconnect your USB to download eStatements.", 0).show();
            return;
        }
        s1 = new Intent("android.intent.action.VIEW");
        s2 = new File(s2, "estatement.pdf");
        s1.setDataAndType(Uri.fromFile(s2), "application/pdf");
        if (appctx.getPackageManager().queryIntentActivities(s1, 0x10000).size() <= 0)
        {
            Toast.makeText(appctx, "Download or enable a PDF Reader to view your eStatement.", 0).show();
            return;
        }
        s3 = (HttpURLConnection)(new URL(s)).openConnection();
        s3.setRequestProperty("cookie", CookieManager.getInstance().getCookie(s));
        s3.setRequestMethod("GET");
        s3.setDoOutput(true);
        s3.connect();
        s = s3.getInputStream();
        s2 = new FileOutputStream(s2);
        s3 = new byte[1024];
_L1:
        int i = s.read(s3);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                s2.write(s3, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Toast.makeText(appctx, "There's a problem connecting. Check your network or try again in a bit.", 0).show();
                return;
            }
        }
          goto _L1
        s2.close();
        s.close();
        AppHelper.startActivity(s1);
        return;
    }
}
