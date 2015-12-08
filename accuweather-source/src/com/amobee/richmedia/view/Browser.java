// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.IAmobeeListener;
import com.amobee.adsdk.Log;
import com.amobee.richmedia.controller.OrmmaAssetController;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.jar.JarFile;

public final class Browser extends Activity
{
    class API7WebSettings
    {

        final Browser this$0;

        public API7WebSettings(WebSettings websettings)
        {
            this$0 = Browser.this;
            super();
            try
            {
                websettings.setLoadWithOverviewMode(true);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Browser browser)
            {
                return;
            }
        }
    }


    private static final int BackwardId = 103;
    private static final int ButtonId = 100;
    private static final int ForwardId = 102;
    public static final String SHOW_BACK_EXTRA = "open_show_back";
    public static final String SHOW_FORWARD_EXTRA = "open_show_forward";
    public static final String SHOW_REFRESH_EXTRA = "open_show_refresh";
    public static final String URL_EXTRA = "extra_url";
    private static final int WebViewId = 101;
    private int mDensityDpi;
    WebView mWebview;

    public Browser()
    {
    }

    public static Bitmap bitmapFromJar(String s)
    {
        Object obj2 = null;
        Object obj1 = null;
        String s1 = obj1;
        String s2 = obj2;
        Object obj;
        String s3;
        int i;
        try
        {
            s3 = com/amobee/richmedia/controller/OrmmaAssetController.getClassLoader().getResource(s).getFile();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s1 != null)
            {
                try
                {
                    s1.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            return null;
        }
        finally
        {
            if (s2 == null) goto _L0; else goto _L0
        }
        obj = s3;
        s1 = obj1;
        s2 = obj2;
        if (!s3.startsWith("file:"))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s1 = obj1;
        s2 = obj2;
        obj = s3.substring(5);
        s1 = obj1;
        s2 = obj2;
        i = ((String) (obj)).indexOf("!");
        s3 = ((String) (obj));
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s1 = obj1;
        s2 = obj2;
        s3 = ((String) (obj)).substring(0, i);
        s1 = obj1;
        s2 = obj2;
        obj = new JarFile(s3);
        s1 = obj1;
        s2 = obj2;
        s = ((JarFile) (obj)).getInputStream(((JarFile) (obj)).getJarEntry(s));
        s1 = s;
        s2 = s;
        obj = BitmapFactory.decodeStream(s);
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return ((Bitmap) (obj));
        try
        {
            s2.close();
        }
        catch (Exception exception) { }
        throw s;
    }

    static String getUrlForScreenWithUrl(String s, int i)
    {
        s = s.toLowerCase();
        if (i > 320 && s.contains(".png"))
        {
            return s.replace(".png", "3.png");
        }
        if (i > 240 && s.contains(".png"))
        {
            return s.replace(".png", "2.png");
        } else
        {
            return s;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(4);
        bundle = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(bundle);
        mDensityDpi = ((DisplayMetrics) (bundle)).densityDpi;
        bundle = new RelativeLayout(this);
        mWebview = new WebView(this);
        mWebview.getSettings().setBuiltInZoomControls(true);
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        Intent intent = getIntent();
        Object obj = new LinearLayout(this);
        ((LinearLayout) (obj)).setOrientation(0);
        ((LinearLayout) (obj)).setId(100);
        ((LinearLayout) (obj)).setGravity(16);
        ((LinearLayout) (obj)).setWeightSum(100F);
        Object obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(2, 100);
        ((LinearLayout) (obj)).setBackgroundDrawable(new BitmapDrawable(bitmapFromJar("bitmaps/amobee_bkgrnd.png")));
        bundle.addView(mWebview, ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        bundle.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj1.weight = 25F;
        obj1.gravity = 16;
        obj1.topMargin = 5;
        Object obj2 = new ImageButton(this);
        ((ImageButton) (obj2)).setBackgroundColor(0);
        ((ImageButton) (obj2)).setId(103);
        ((LinearLayout) (obj)).addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        if (!intent.getBooleanExtra("open_show_back", true))
        {
            ((ImageButton) (obj2)).setVisibility(8);
        }
        ((ImageButton) (obj2)).setImageBitmap(bitmapFromJar(getUrlForScreenWithUrl("bitmaps/amobee_leftarrow.png", mDensityDpi)));
        ((ImageButton) (obj2)).setOnClickListener(new android.view.View.OnClickListener() {

            final Browser this$0;

            public void onClick(View view)
            {
                view = (WebView)findViewById(101);
                if (view.canGoBack())
                {
                    view.goBack();
                    return;
                } else
                {
                    finish();
                    return;
                }
            }

            
            {
                this$0 = Browser.this;
                super();
            }
        });
        obj1 = new ImageButton(this);
        ((ImageButton) (obj1)).setBackgroundColor(0);
        ((ImageButton) (obj1)).setId(102);
        obj2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj2.weight = 25F;
        obj2.gravity = 16;
        obj2.topMargin = 5;
        ((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
        if (!intent.getBooleanExtra("open_show_forward", true))
        {
            ((ImageButton) (obj1)).setVisibility(8);
        }
        ((ImageButton) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final Browser this$0;

            public void onClick(View view)
            {
                ((WebView)findViewById(101)).goForward();
            }

            
            {
                this$0 = Browser.this;
                super();
            }
        });
        obj1 = new ImageButton(this);
        ((ImageButton) (obj1)).setImageBitmap(bitmapFromJar(getUrlForScreenWithUrl("bitmaps/amobee_refresh.png", mDensityDpi)));
        ((ImageButton) (obj1)).setBackgroundColor(0);
        obj2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj2.weight = 25F;
        obj2.gravity = 16;
        obj2.topMargin = 5;
        ((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
        if (!intent.getBooleanExtra("open_show_refresh", true))
        {
            ((ImageButton) (obj1)).setVisibility(8);
        }
        ((ImageButton) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final Browser this$0;

            public void onClick(View view)
            {
                ((WebView)findViewById(101)).reload();
            }

            
            {
                this$0 = Browser.this;
                super();
            }
        });
        obj1 = new ImageButton(this);
        ((ImageButton) (obj1)).setImageBitmap(bitmapFromJar(getUrlForScreenWithUrl("bitmaps/amobee_close.png", mDensityDpi)));
        ((ImageButton) (obj1)).setBackgroundColor(0);
        obj2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj2.weight = 25F;
        obj2.gravity = 16;
        obj2.topMargin = 5;
        ((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
        ((ImageButton) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final Browser this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = Browser.this;
                super();
            }
        });
        getWindow().requestFeature(2);
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
        mWebview.setDownloadListener(new DownloadListener() {

            final Browser this$0;

            public void onDownloadStart(String s, String s1, String s2, String s3, long l)
            {
                s1 = new Intent("android.intent.action.VIEW");
                s1.setData(Uri.parse(s));
                startActivity(s1);
                finish();
            }

            
            {
                this$0 = Browser.this;
                super();
            }
        });
        obj = mWebview.getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setUseWideViewPort(true);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ((WebSettings) (obj)).setMediaPlaybackRequiresUserGesture(false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            new API7WebSettings(((WebSettings) (obj)));
        }
        mWebview.setId(101);
        mWebview.setWebViewClient(new WebViewClient() {

            final Browser this$0;

            public void onPageFinished(WebView webview, String s)
            {
                ImageButton imagebutton;
                Activity activity;
label0:
                {
                    super.onPageFinished(webview, s);
                    imagebutton = (ImageButton)findViewById(102);
                    activity = (Activity)webview.getContext();
                    String s1 = webview.getTitle();
                    if (s1 != null)
                    {
                        s = s1;
                        if (!s1.equals(""))
                        {
                            break label0;
                        }
                    }
                    s = webview.getUrl();
                }
                activity.setTitle(s);
                if (webview.canGoForward())
                {
                    imagebutton.setImageBitmap(Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_rightarrow.png", mDensityDpi)));
                    return;
                } else
                {
                    imagebutton.setImageBitmap(Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_unrightarrow.png", mDensityDpi)));
                    return;
                }
            }

            public void onPageStarted(WebView webview, String s, Bitmap bitmap)
            {
                super.onPageStarted(webview, s, bitmap);
                ((ImageButton)findViewById(102)).setImageBitmap(Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_unrightarrow.png", mDensityDpi)));
            }

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
                Log.d("Amobee internal browser Error: ", (new StringBuilder(String.valueOf(s))).append(" :").append(s1).toString());
                finish();
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                String s1;
                String s2;
                IAmobeeListener iamobeelistener;
                iamobeelistener = AdManager.getInstance(null).getAmobeeListener();
                s2 = s.toLowerCase();
                s1 = s2;
                if (s2.startsWith("wtai://wp/mc;"))
                {
                    s1 = s2.replace("wtai://wp/mc;", "tel:");
                }
                if (!s1.startsWith("tel:"))
                {
                    break MISSING_BLOCK_LABEL_96;
                }
                webview = new Intent("android.intent.action.DIAL");
                webview.setData(Uri.parse(s1));
                if (iamobeelistener == null)
                {
                    break MISSING_BLOCK_LABEL_79;
                }
                iamobeelistener.amobeeOnLeavingApplication(null);
                startActivity(webview);
                finish();
                return true;
                if (!s1.startsWith("sms:"))
                {
                    break MISSING_BLOCK_LABEL_171;
                }
                webview = new Intent("android.intent.action.VIEW");
                if (iamobeelistener == null)
                {
                    break MISSING_BLOCK_LABEL_128;
                }
                iamobeelistener.amobeeOnLeavingApplication(null);
                webview.setData(Uri.parse(s));
                startActivity(webview);
                finish();
                return true;
                if (!s1.startsWith("mailto:"))
                {
                    break MISSING_BLOCK_LABEL_229;
                }
                webview = new Intent("android.intent.action.VIEW");
                webview.setData(Uri.parse(s));
                startActivity(webview);
                finish();
                if (iamobeelistener != null)
                {
                    try
                    {
                        iamobeelistener.amobeeOnLeavingApplication(null);
                    }
                    // Misplaced declaration of an exception variable
                    catch (WebView webview)
                    {
                        Log.d("OrmmaBrowser Error: ", "click interaction is not supported ");
                        finish();
                        return true;
                    }
                    return true;
                }
                break MISSING_BLOCK_LABEL_318;
                if (!s1.startsWith("market://") && !s1.contains("play.google.com/store/apps/details?id="))
                {
                    break MISSING_BLOCK_LABEL_313;
                }
                webview = new Intent("android.intent.action.VIEW");
                webview.setData(Uri.parse(s));
                startActivity(webview);
                finish();
                if (iamobeelistener == null)
                {
                    break MISSING_BLOCK_LABEL_318;
                }
                iamobeelistener.amobeeOnLeavingApplication(null);
                return true;
                webview;
                Log.d("OrmmaBrowser Error", "");
                finish();
                return true;
                webview.loadUrl(s);
                return true;
            }

            
            {
                this$0 = Browser.this;
                super();
            }
        });
        mWebview.loadUrl(intent.getStringExtra("extra_url"));
        setContentView(bundle);
        mWebview.setWebChromeClient(new WebChromeClient() {

            FrameLayout mCustomViewContainer;
            VideoView mVideoView;
            final Browser this$0;
            ImageButton videoCloseButton;

            void closeVideo()
            {
                if (videoCloseButton != null)
                {
                    videoCloseButton.setVisibility(8);
                    videoCloseButton = null;
                }
                if (mVideoView != null)
                {
                    mVideoView.setVisibility(8);
                    if ((ViewGroup)mVideoView.getParent() != null)
                    {
                        mVideoView = null;
                    }
                    mCustomViewContainer.setVisibility(8);
                }
                if (mWebview != null)
                {
                    mWebview.setVisibility(0);
                }
            }

            public void onProgressChanged(WebView webview, int i)
            {
                Activity activity = (Activity)webview.getContext();
                activity.setTitle(webview.getUrl());
                activity.setProgress(i * 100);
            }

            public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
            {
                super.onShowCustomView(view, customviewcallback);
                if (view instanceof FrameLayout)
                {
                    mCustomViewContainer = (FrameLayout)view;
                    if (mCustomViewContainer.getFocusedChild() instanceof VideoView)
                    {
                        view = (VideoView)mCustomViewContainer.getFocusedChild();
                        mCustomViewContainer.removeView(view);
                        view.setMediaController(null);
                        mCustomViewContainer.setVisibility(8);
                        mVideoView = view;
                        Object obj3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        obj3.gravity = 17;
                        customviewcallback = (ViewGroup)mWebview.getParent();
                        if (customviewcallback != null)
                        {
                            customviewcallback.addView(view, ((android.view.ViewGroup.LayoutParams) (obj3)));
                        }
                        view.setVisibility(0);
                        view.bringToFront();
                        view.setOnKeyListener(new android.view.View.OnKeyListener() {

                            final _cls7 this$1;

                            public boolean onKey(View view, int i, KeyEvent keyevent)
                            {
                                if (i == 4)
                                {
                                    closeVideo();
                                    mWebview.requestFocus();
                                    return true;
                                } else
                                {
                                    return false;
                                }
                            }

            
            {
                this$1 = _cls7.this;
                super();
            }
                        });
                        videoCloseButton = new ImageButton(mWebview.getContext());
                        obj3 = Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_x.png", AdManager.getDensityDpi(mWebview.getContext())));
                        videoCloseButton.setImageBitmap(((Bitmap) (obj3)));
                        videoCloseButton.setBackgroundColor(0);
                        videoCloseButton.setOnClickListener(new android.view.View.OnClickListener() {

                            final _cls7 this$1;

                            public void onClick(View view)
                            {
                                onHideCustomView();
                                closeVideo();
                            }

            
            {
                this$1 = _cls7.this;
                super();
            }
                        });
                        if (customviewcallback != null)
                        {
                            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                            layoutparams.gravity = 3;
                            customviewcallback.addView(videoCloseButton, layoutparams);
                        }
                        videoCloseButton.bringToFront();
                        view.setOnTouchListener(new android.view.View.OnTouchListener() {

                            final _cls7 this$1;

                            public boolean onTouch(View view, MotionEvent motionevent)
                            {
                                return false;
                            }

            
            {
                this$1 = _cls7.this;
                super();
            }
                        });
                        view.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

                            final _cls7 this$1;

                            public void onCompletion(MediaPlayer mediaplayer)
                            {
                                mediaplayer.stop();
                                onHideCustomView();
                                closeVideo();
                                Log.d("Amobee Video", "onCompletion");
                            }

            
            {
                this$1 = _cls7.this;
                super();
            }
                        });
                        view.start();
                    } else
                    {
                        customviewcallback = (ViewGroup)mWebview.getRootView();
                        if (customviewcallback != null)
                        {
                            customviewcallback.addView(view);
                            return;
                        }
                    }
                }
            }


            
            {
                this$0 = Browser.this;
                super();
                mCustomViewContainer = null;
                mVideoView = null;
                videoCloseButton = null;
            }
        });
    }

    protected void onPause()
    {
        super.onPause();
        if (mWebview != null)
        {
            try
            {
                Class.forName("android.webkit.WebView").getMethod("onPause", null).invoke(mWebview, null);
            }
            catch (Exception exception) { }
        }
        CookieSyncManager.getInstance().stopSync();
    }

    protected void onResume()
    {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
    }

}
