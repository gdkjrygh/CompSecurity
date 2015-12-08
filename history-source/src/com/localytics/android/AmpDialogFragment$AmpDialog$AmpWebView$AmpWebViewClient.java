// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            AmpDialogFragment, JavaScriptClient

public class mActivity extends WebViewClient
{

    private Activity mActivity;
    final mActivity this$2;

    public void onPageFinished(WebView webview, String s)
    {
        int i;
        int j;
        int k;
        if (((String)AmpDialogFragment.access$200(this._cls2.this.mActivity.mActivity).get("location")).equals("center"))
        {
            i = (int)(10F * this._mth2(_fld2).density + 0.5F) << 1;
        } else
        {
            i = 0;
        }
        j = Math.min(this._mth2(_fld2).widthPixels, this._mth2(_fld2).heightPixels);
        k = Math.max(this._mth2(_fld2).widthPixels, this._mth2(_fld2).heightPixels);
        webview.loadUrl(String.format("javascript:(function() {  var viewportNode = document.createElement('meta');  viewportNode.name    = 'viewport';  viewportNode.content = 'width=%f, height=%f, user-scalable=no, minimum-scale=.25, maximum-scale=1';  viewportNode.id      = 'metatag';  document.getElementsByTagName('head')[0].appendChild(viewportNode);})()", new Object[] {
            Float.valueOf((float)Math.min(j - i, (int)(this._mth2(_fld2) * this._mth2(_fld2).density + 0.5F)) / this._mth2(_fld2).density), Float.valueOf((float)Math.min(k - i, (int)(this._mth2(_fld2) * this._mth2(_fld2).density + 0.5F)) / this._mth2(_fld2).density)
        }));
        webview.loadUrl(AmpDialogFragment.access$500(_fld2).getJsGlueCode());
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return handleUrl(s, mActivity);
    }

    public (Activity activity)
    {
        this$2 = this._cls2.this;
        super();
        mActivity = activity;
    }
}
