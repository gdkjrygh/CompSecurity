// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            bp, bq

public final class bo
{

    public bo()
    {
    }

    public final void a(Activity activity, String s)
    {
        Object obj = activity.getResources().getConfiguration().locale;
        String s2 = ((Locale) (obj)).getLanguage();
        String s1 = ((Locale) (obj)).getCountry();
        Object obj1 = "";
        obj = obj1;
        if (s2 != null)
        {
            obj = obj1;
            if (!s2.equals(""))
            {
                obj = (new StringBuilder()).append("").append(s2).toString();
            }
        }
        obj1 = obj;
        if (s1 != null)
        {
            obj1 = obj;
            if (!s1.equals(""))
            {
                obj = (new StringBuilder()).append(((String) (obj))).append("_").toString();
                obj1 = (new StringBuilder()).append(((String) (obj))).append(s1).toString();
            }
        }
        s = (new StringBuilder()).append(s).append("?lang=").append(((String) (obj1))).toString();
        obj = (new android.app.AlertDialog.Builder(activity)).create();
        ((AlertDialog) (obj)).setOnDismissListener(new bp(this));
        ((AlertDialog) (obj)).show();
        try
        {
            ((AlertDialog) (obj)).getWindow().setContentView(0x7f0300a4);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.getStackTrace();
            ((AlertDialog) (obj)).dismiss();
            return;
        }
        obj1 = (ProgressBar)((AlertDialog) (obj)).findViewById(0x7f0d019e);
        obj = (WebView)((AlertDialog) (obj)).findViewById(0x7f0d027f);
        ((WebView) (obj)).loadUrl(s);
        ((WebView) (obj)).getSettings().setJavaScriptEnabled(true);
        ((WebView) (obj)).setWebChromeClient(new bq(this, ((ProgressBar) (obj1))));
        ((WebView) (obj)).setWebViewClient(new ForceUpdate._cls3(this, activity));
    }
}
