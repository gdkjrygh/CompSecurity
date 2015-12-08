// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.localytics.android:
//            AmpDialogFragment, DatapointHelper, JavaScriptClient

class AmpWebView.loadUrl extends Dialog
{
    class AmpWebView extends WebView
    {

        private AmpWebViewClient mClient;
        final AmpDialogFragment.AmpDialog this$1;

        public AmpWebView(Context context, AttributeSet attributeset)
        {
            this$1 = AmpDialogFragment.AmpDialog.this;
            super(context, attributeset);
            if (DatapointHelper.getApiLevel() >= 19)
            {
                setLayerType(1, null);
            }
            context = new android.widget.LinearLayout.LayoutParams(-1, -1);
            context.gravity = 17;
            setLayoutParams(context);
            setBackgroundColor(0);
            setInitialScale(1);
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
            context = new AmpWebViewClient(getActivity());
            mClient = context;
            setWebViewClient(context);
            context = getSettings();
            context.setJavaScriptEnabled(true);
            addJavascriptInterface(AmpDialogFragment.access$500(this$0), "localytics");
            context.setUseWideViewPort(true);
        }
    }

    public class AmpWebView.AmpWebViewClient extends WebViewClient
    {

        private Activity mActivity;
        final AmpWebView this$2;

        public void onPageFinished(WebView webview, String s)
        {
            int i;
            int j;
            int k;
            if (((String)AmpDialogFragment.access$200(this$0).get("location")).equals("center"))
            {
                i = (int)(10F * mMetrics.density + 0.5F) << 1;
            } else
            {
                i = 0;
            }
            j = Math.min(mMetrics.widthPixels, mMetrics.heightPixels);
            k = Math.max(mMetrics.widthPixels, mMetrics.heightPixels);
            webview.loadUrl(String.format("javascript:(function() {  var viewportNode = document.createElement('meta');  viewportNode.name    = 'viewport';  viewportNode.content = 'width=%f, height=%f, user-scalable=no, minimum-scale=.25, maximum-scale=1';  viewportNode.id      = 'metatag';  document.getElementsByTagName('head')[0].appendChild(viewportNode);})()", new Object[] {
                Float.valueOf((float)Math.min(j - i, (int)(mWidth * mMetrics.density + 0.5F)) / mMetrics.density), Float.valueOf((float)Math.min(k - i, (int)(mHeight * mMetrics.density + 0.5F)) / mMetrics.density)
            }));
            webview.loadUrl(AmpDialogFragment.access$500(this$0).getJsGlueCode());
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            return handleUrl(s, mActivity);
        }

        public AmpWebView.AmpWebViewClient(Activity activity)
        {
            this$2 = AmpWebView.this;
            super();
            mActivity = activity;
        }
    }

    class CloseButton extends View
    {
