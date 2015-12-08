// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.Log;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView, Browser

class AmobeeChromeClient extends WebChromeClient
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener
{

    private WebView interfazWeb;
    private android.webkit.WebChromeClient.CustomViewCallback mCallback;
    private LinearLayout mContentView;
    private FrameLayout mCustomViewContainer;
    int mStatusBarHeight;
    VideoView mVideoView;
    private MediaController mediaController;
    private FrameLayout progressView;
    ImageButton videoCloseButton;

    public AmobeeChromeClient(WebView webview)
    {
        progressView = null;
        videoCloseButton = null;
        mediaController = null;
        mStatusBarHeight = 0;
        interfazWeb = webview;
        progressView = new FrameLayout(webview.getContext());
    }

    private void HideExpandCloseButton(AmobeeView amobeeview)
    {
        if (amobeeview != null && !amobeeview.useCustomClose)
        {
            FrameLayout framelayout = (FrameLayout)amobeeview.getParent();
            if (framelayout != null)
            {
                amobeeview = (FrameLayout)framelayout.findViewById(amobeeview.EXPAND_CLOSE_ID);
                if (amobeeview != null)
                {
                    amobeeview.setVisibility(8);
                }
            }
        }
    }

    void closeVideo(View view, AmobeeView amobeeview)
    {
        if (mCallback != null)
        {
            if (mCallback != null)
            {
                mCallback.onCustomViewHidden();
                mCallback = null;
            }
            if (view != null && (ViewGroup)view.getParent() != null)
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
            if (amobeeview != null)
            {
                view = (ViewGroup)amobeeview.getParent();
                if (view != null)
                {
                    view = (FrameLayout)view.findViewById(amobeeview.EXPAND_CLOSE_ID);
                    if (view != null)
                    {
                        view.setVisibility(0);
                    }
                }
                amobeeview.setVisibility(0);
                return;
            }
        }
    }

    public void finishVideoPlay()
    {
        ViewGroup viewgroup;
        try
        {
            if (mVideoView != null)
            {
                mVideoView.stopPlayback();
            }
            onHideCustomView();
            closeVideo(videoCloseButton, (AmobeeView)interfazWeb);
            if (mCallback != null)
            {
                mCallback.onCustomViewHidden();
                mCallback = null;
            }
            if (mCustomViewContainer == null)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            viewgroup = (ViewGroup)mCustomViewContainer.getParent();
        }
        catch (Exception exception)
        {
            return;
        }
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        viewgroup.removeView(mCustomViewContainer);
    }

    public View getVideoLoadingProgressView()
    {
        return super.getVideoLoadingProgressView();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        mediaplayer.stop();
        mCustomViewContainer.setVisibility(8);
        onHideCustomView();
        closeVideo(videoCloseButton, (AmobeeView)interfazWeb);
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        if (consolemessage != null && consolemessage.message() != null)
        {
            Log.d("AmobeeView", (new StringBuilder()).append(consolemessage.message()).toString());
        }
        return true;
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 100 && interfazWeb != null)
        {
            mediaplayer = (AmobeeView)interfazWeb;
            onHideCustomView();
            closeVideo(videoCloseButton, mediaplayer);
        }
        return true;
    }

    public void onHideCustomView()
    {
        super.onHideCustomView();
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        AmobeeView amobeeview = (AmobeeView)webview;
        if (amobeeview.mUserGestureRequiredToOpenAds && !amobeeview.mUserTouchedTheView)
        {
            Log.d("AmobeeView", (new StringBuilder("JsAlert blocked: ")).append(s).append(", message: ").append(s1).toString());
            jsresult.cancel();
            return true;
        } else
        {
            return super.onJsAlert(webview, s, s1, jsresult);
        }
    }

    public boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        AmobeeView amobeeview = (AmobeeView)webview;
        if (amobeeview.mUserGestureRequiredToOpenAds && !amobeeview.mUserTouchedTheView)
        {
            Log.d("AmobeeView", (new StringBuilder("JsConfirm blocked: ")).append(s).append(", message: ").append(s1).toString());
            jsresult.cancel();
            return true;
        } else
        {
            return super.onJsConfirm(webview, s, s1, jsresult);
        }
    }

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        AmobeeView amobeeview = (AmobeeView)webview;
        if (amobeeview.mUserGestureRequiredToOpenAds && !amobeeview.mUserTouchedTheView)
        {
            Log.d("AmobeeView", (new StringBuilder("JsPrompt blocked: ")).append(s).append(", message: ").append(s1).toString());
            jspromptresult.cancel();
            return true;
        } else
        {
            return super.onJsPrompt(webview, s, s1, s2, jspromptresult);
        }
    }

    public void onShowCustomView(final View view, final android.webkit.WebChromeClient.CustomViewCallback amobeeView)
    {
        super.onShowCustomView(view, amobeeView);
        ViewGroup viewgroup;
        Object obj1;
        final AmobeeView ormma;
        android.widget.FrameLayout.LayoutParams layoutparams;
        mCallback = amobeeView;
        amobeeView = (FrameLayout)interfazWeb.getParent();
        if (!(view instanceof FrameLayout))
        {
            break MISSING_BLOCK_LABEL_666;
        }
        mCustomViewContainer = (FrameLayout)view;
        if (!(mCustomViewContainer.getFocusedChild() instanceof VideoView))
        {
            break MISSING_BLOCK_LABEL_345;
        }
        obj1 = (VideoView)mCustomViewContainer.getFocusedChild();
        ormma = (AmobeeView)interfazWeb;
        mCustomViewContainer.removeView(((View) (obj1)));
        ((VideoView) (obj1)).setMediaController(null);
        mCustomViewContainer.setVisibility(8);
        mVideoView = ((VideoView) (obj1));
        layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        viewgroup = (ViewGroup)interfazWeb.getParent();
        amobeeView = viewgroup;
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        amobeeView = (ViewGroup)interfazWeb.getParent();
        amobeeView.addView(((View) (obj1)), layoutparams);
        ((VideoView) (obj1)).setVisibility(0);
        ((VideoView) (obj1)).bringToFront();
        ((VideoView) (obj1)).setOnKeyListener(new android.view.View.OnKeyListener() {

            final AmobeeChromeClient this$0;
            private final AmobeeView val$ormma;
            private final View val$view;

            public boolean onKey(View view1, int j, KeyEvent keyevent)
            {
                if (j == 4)
                {
                    closeVideo(view, ormma);
                    interfazWeb.requestFocus();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = AmobeeChromeClient.this;
                view = view1;
                ormma = amobeeview;
                super();
            }
        });
        if (ormma == null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        Object obj;
        int i;
        try
        {
            if (ormma.isExpanded())
            {
                HideExpandCloseButton(ormma);
            }
            videoCloseButton = new ImageButton(interfazWeb.getContext());
            view = Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_x.png", ormma.mDensityDpi));
            videoCloseButton.setImageBitmap(view);
            videoCloseButton.setBackgroundColor(0);
            videoCloseButton.setOnClickListener(new android.view.View.OnClickListener() {

                final AmobeeChromeClient this$0;
                private final AmobeeView val$ormma;

                public void onClick(View view1)
                {
                    onHideCustomView();
                    closeVideo(videoCloseButton, ormma);
                }

            
            {
                this$0 = AmobeeChromeClient.this;
                ormma = amobeeview;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final View view)
        {
            Log.d("AmobeeVideoView", "error");
            return;
        }
        if (amobeeView == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        view = new android.widget.FrameLayout.LayoutParams(-2, -2);
        view.gravity = 3;
        amobeeView.addView(videoCloseButton, view);
        videoCloseButton.bringToFront();
        ((VideoView) (obj1)).setOnErrorListener(this);
        ((VideoView) (obj1)).setOnTouchListener(new android.view.View.OnTouchListener() {

            final AmobeeChromeClient this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                return false;
            }

            
            {
                this$0 = AmobeeChromeClient.this;
                super();
            }
        });
        ((VideoView) (obj1)).setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final AmobeeChromeClient this$0;
            private final AmobeeView val$ormma;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                mediaplayer.stop();
                onHideCustomView();
                closeVideo(videoCloseButton, ormma);
                Log.d("Amobee Video", "onCompletion");
            }

            
            {
                this$0 = AmobeeChromeClient.this;
                ormma = amobeeview;
                super();
            }
        });
        ((VideoView) (obj1)).start();
        return;
        if (interfazWeb == null)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        obj = (ViewGroup)interfazWeb.getRootView();
        amobeeView = (AmobeeView)interfazWeb;
        if (amobeeView.isExpanded())
        {
            HideExpandCloseButton(amobeeView);
            amobeeView.setVisibility(8);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        ((ViewGroup) (obj)).addView(view);
        if (mCustomViewContainer.getChildCount() > 0)
        {
            mCustomViewContainer.getChildAt(0).setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final AmobeeChromeClient this$0;

                public void onFocusChange(View view1, boolean flag)
                {
                    Log.d("VideoView on focus change", (new StringBuilder("view;")).append(view1).append(", hasFocus:").append(flag).toString());
                }

            
            {
                this$0 = AmobeeChromeClient.this;
                super();
            }
            });
            mCustomViewContainer.getChildAt(0).setOnKeyListener(new android.view.View.OnKeyListener() {

                final AmobeeChromeClient this$0;
                private final AmobeeView val$amobeeView;
                private final View val$view;

                public boolean onKey(View view1, int j, KeyEvent keyevent)
                {
                    if (j == 4)
                    {
                        closeVideo(view, amobeeView);
                        interfazWeb.requestFocus();
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = AmobeeChromeClient.this;
                view = view1;
                amobeeView = amobeeview;
                super();
            }
            });
        }
        videoCloseButton = new ImageButton(interfazWeb.getContext());
        obj = Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_x.png", ((AmobeeView)interfazWeb).mDensityDpi));
        videoCloseButton.setImageBitmap(((android.graphics.Bitmap) (obj)));
        videoCloseButton.setBackgroundColor(0);
        (new android.widget.FrameLayout.LayoutParams(-2, -2)).gravity = 53;
        i = (int)((float)AmobeeView.CLOSE_AREA_SIZE * AdManager.getDensity(view.getContext()));
        amobeeView = new android.view.View.OnClickListener() {

            final AmobeeChromeClient this$0;
            private final AmobeeView val$amobeeView;

            public void onClick(View view1)
            {
                closeVideo(view1, amobeeView);
            }

            
            {
                this$0 = AmobeeChromeClient.this;
                amobeeView = amobeeview;
                super();
            }
        };
        obj = new FrameLayout(view.getContext());
        ((FrameLayout) (obj)).setBackgroundColor(0);
        obj1 = new android.widget.FrameLayout.LayoutParams(i, i);
        obj1.gravity = 53;
        mStatusBarHeight = AdManager.getStatusBarHeight(view.getContext());
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_652;
        }
        ((android.widget.FrameLayout.LayoutParams) (obj1)).setMargins(0, mStatusBarHeight, 0, 0);
_L1:
        ((FrameLayout) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        videoCloseButton.setOnClickListener(amobeeView);
        ((FrameLayout) (obj)).addView(videoCloseButton);
        ((FrameLayout)view).addView(((View) (obj)));
        return;
        view.setPadding(0, mStatusBarHeight, 0, 0);
          goto _L1
        Log.d("AmobeeVideoView", "View is not FrameLayout");
    }

}
