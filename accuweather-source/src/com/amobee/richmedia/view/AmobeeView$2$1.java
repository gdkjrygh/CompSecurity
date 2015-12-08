// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.AmobeeInterstitial;
import com.amobee.adsdk.Log;
import com.amobee.richmedia.controller.OrmmaUtilityController;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class this._cls1
    implements Runnable
{

    final xpandedView this$1;

    public void run()
    {
        ViewGroup viewgroup = AmobeeView.access$6(_fld0);
        if (viewgroup == null)
        {
            closeExpanded();
            return;
        }
        mStatusBarHeight = AdManager.getStatusBarHeight(getContext());
        android.widget.outParams outparams = new android.widget.outParams(-1, -1);
        FrameLayout framelayout = new FrameLayout(getContext());
        if (android.os.DK_INT >= 14)
        {
            outparams.setMargins(0, mStatusBarHeight, 0, 0);
        } else
        {
            framelayout.setPadding(0, mStatusBarHeight, 0, 0);
        }
        framelayout.setOnTouchListener(new android.view.View.OnTouchListener() {

            final AmobeeView._cls2._cls1 this$2;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                Log.i("AmobeeView", "background touch called");
                return true;
            }

            
            {
                this$2 = AmobeeView._cls2._cls1.this;
                super();
            }
        });
        framelayout.addView(_fld0);
        viewgroup.addView(framelayout, outparams);
        if (!useCustomClose)
        {
            addCloseButton();
        }
        mViewState = State.EXPANDED;
        AmobeeView.isExpanded = true;
        parentView.hasExpandedView = true;
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/amobee/richmedia/view/AmobeeView$2

/* anonymous class */
    class AmobeeView._cls2 extends WebViewClient
    {

        final AmobeeView this$0;

        public String getMimeType(String s)
        {
            Object obj = null;
            String s1 = MimeTypeMap.getFileExtensionFromUrl(s);
            s = obj;
            if (s1 != null)
            {
                s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s1);
            }
            return s;
        }

        public void onLoadResource(WebView webview, String s)
        {
            super.onLoadResource(webview, s);
        }

        public void onPageFinished(WebView webview, String s)
        {
            AmobeeView.access$3(AmobeeView.this, (int)((float)getHeight() / mDensity));
            AmobeeView.access$4(AmobeeView.this, (int)((float)getWidth() / mDensity));
            getCurrentPosition();
            AmobeeView.access$5(AmobeeView.this).handleCalendarEvent();
            if (mViewState == AmobeeView.ViewState.INTERSTITIAL && amobeeInterstitial != null && s.toLowerCase().startsWith("file://"))
            {
                webview = (FrameLayout)((FrameLayout)((Activity)getContext()).getWindow().getDecorView().getRootView()).findViewById(amobeeInterstitial.getRandom());
                if (webview == null)
                {
                    Log.d("[a\u2022mo\u2022bee]", "it is not the original context, interstitial will not be shown");
                    return;
                } else
                {
                    webview.setVisibility(0);
                    return;
                }
            }
            if (parentView != null && getParent() == null)
            {
                parentView.post(new AmobeeView._cls2._cls1());
            }
            AmobeeView.access$5(AmobeeView.this).ready();
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            this;
            JVM INSTR monitorenter ;
            if (mViewState != AmobeeView.ViewState.INTERSTITIAL || amobeeInterstitial == null) goto _L2; else goto _L1
_L1:
            webview = s.toLowerCase();
            if (!webview.contains("redirect") || !webview.contains((new StringBuilder()).append(amobeeInterstitial.getRandom()).toString())) goto _L4; else goto _L3
_L3:
            closeInterstitial();
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
_L4:
            boolean flag = webview.contains("actionpage");
            if (!flag);
            if (true) goto _L2; else goto _L5
_L5:
            webview;
            throw webview;
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            if (parentView != null)
            {
                closeExpanded();
            }
            Log.d("AmobeeView", (new StringBuilder("error:")).append(s).toString());
            super.onReceivedError(webview, i, s, s1);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            Object obj1;
            obj1 = s.toLowerCase();
            android.util.Log.d("njdskJDV", (new StringBuilder()).append(mViewState).append(" == ").append(AmobeeView.ViewState.INTERSTITIAL).toString());
            android.util.Log.d("njdskJDV", (new StringBuilder(String.valueOf(obj1))).append(" == ").append(AmobeeView.access$7(AmobeeView.this)).toString());
            if (mViewState != AmobeeView.ViewState.INTERSTITIAL || amobeeInterstitial == null || !((String) (obj1)).contains("redirect") || !((String) (obj1)).contains((new StringBuilder("n=")).append(amobeeInterstitial.getRandom()).toString())) goto _L2; else goto _L1
_L1:
            closeInterstitial();
_L14:
            return true;
_L2:
            Object obj;
            Uri uri;
            if (mViewState == AmobeeView.ViewState.INTERSTITIAL && ((String) (obj1)).contains("actionpage"))
            {
                return false;
            }
            if (mUserGestureRequiredToOpenAds && !mUserTouchedTheView)
            {
                Log.d("AmobeeView", (new StringBuilder("Url blocked: ")).append(((String) (obj1))).toString());
                return true;
            }
            uri = Uri.parse(s);
            obj = obj1;
            if (AmobeeView.access$0(AmobeeView.this) == null) goto _L4; else goto _L3
_L3:
            obj = obj1;
            if (!AmobeeView.access$8(AmobeeView.this, uri)) goto _L4; else goto _L5
_L5:
            obj = obj1;
            AmobeeView.access$0(AmobeeView.this).handleRequest(s);
            return true;
_L19:
            if (AmobeeView.access$0(AmobeeView.this) == null) goto _L7; else goto _L6
_L6:
            AmobeeView.access$0(AmobeeView.this).onLeavingApplication();
_L32:
            webview = new Intent();
            webview.setAction("android.intent.action.VIEW");
            webview.setData(uri);
            webview.addFlags(0x10000000);
            getContext().startActivity(webview);
            return true;
            webview;
            Log.d("OrmmaView", (new StringBuilder("this click interaction is not supported for url ")).append(((String) (obj))).toString());
            return true;
_L4:
            obj = obj1;
            if (mViewState != AmobeeView.ViewState.INTERSTITIAL)
            {
                break MISSING_BLOCK_LABEL_399;
            }
            obj = obj1;
            if (((String) (obj1)).startsWith("file://"))
            {
                return false;
            }
            obj = obj1;
            webview = ((WebView) (obj1));
            if (!((String) (obj1)).startsWith("wtai://wp/mc;"))
            {
                break MISSING_BLOCK_LABEL_431;
            }
            obj = obj1;
            webview = ((String) (obj1)).replace("wtai://wp/mc;", "tel:");
            obj = webview;
            if (!webview.startsWith("tel:"))
            {
                break MISSING_BLOCK_LABEL_639;
            }
            obj = webview;
            if (!getContext().getPackageManager().hasSystemFeature("android.hardware.telephony")) goto _L9; else goto _L8
_L8:
            obj = webview;
            if (AmobeeView.access$0(AmobeeView.this) == null) goto _L11; else goto _L10
_L10:
            obj = webview;
            AmobeeView.access$0(AmobeeView.this).onLeavingApplication();
_L12:
            obj = webview;
            if (amobeeInterstitial == null)
            {
                break MISSING_BLOCK_LABEL_529;
            }
            obj = webview;
            if (mViewState != AmobeeView.ViewState.INTERSTITIAL)
            {
                break MISSING_BLOCK_LABEL_529;
            }
            obj = webview;
            amobeeInterstitial.interstitialClicked();
            s = new Intent("android.intent.action.DIAL", Uri.parse(webview));
            s.addFlags(0x10000000);
            getContext().startActivity(s);
            return true;
            s;
            obj = webview;
            Log.d("OrmmaView", "this click interaction is not supported");
            return true;
_L11:
            obj = webview;
            if (parentView == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            if (AmobeeView.access$0(parentView) == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            AmobeeView.access$0(parentView).onLeavingApplication();
            if (true) goto _L12; else goto _L9
_L9:
            obj = webview;
            Log.d("OrmmaView", "this click interaction is not supported");
            return true;
            obj = webview;
            if (isUrlRequiresActionView(webview)) goto _L14; else goto _L13
_L13:
            obj = webview;
            if (!urlContainsVideo(uri.toString())) goto _L16; else goto _L15
_L15:
            obj = webview;
            if (AmobeeView.access$0(AmobeeView.this) == null) goto _L18; else goto _L17
_L17:
            obj = webview;
            AmobeeView.access$0(AmobeeView.this).onLeavingApplication();
_L20:
            obj = webview;
            obj1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            obj = webview;
            ((Intent) (obj1)).setDataAndType(Uri.parse(s), "video/*");
            obj = webview;
            ((Intent) (obj1)).addFlags(0x10000000);
            obj = webview;
            getContext().startActivity(((Intent) (obj1)));
            return true;
_L18:
            obj = webview;
            if (amobeeInterstitial == null)
            {
                break MISSING_BLOCK_LABEL_797;
            }
            obj = webview;
            if (mViewState != AmobeeView.ViewState.INTERSTITIAL)
            {
                break MISSING_BLOCK_LABEL_797;
            }
            obj = webview;
            try
            {
                amobeeInterstitial.interstitialClicked();
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview) { }
              goto _L19
            obj = webview;
            if (parentView == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            if (AmobeeView.access$0(parentView) == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            AmobeeView.access$0(parentView).onLeavingApplication();
            if (true) goto _L20; else goto _L16
_L16:
            obj = webview;
            if (!AmobeeView.useInternalBrowser) goto _L22; else goto _L21
_L21:
            obj = webview;
            open(uri.toString(), true, true, true);
_L27:
            obj = webview;
            if (mViewState != AmobeeView.ViewState.INTERSTITIAL) goto _L14; else goto _L23
_L23:
            obj = webview;
            if (amobeeInterstitial == null) goto _L14; else goto _L24
_L24:
            obj = webview;
            amobeeInterstitial.interstitialClicked();
            return true;
_L22:
            obj = webview;
            if (AmobeeView.access$0(AmobeeView.this) == null) goto _L26; else goto _L25
_L25:
            obj = webview;
            AmobeeView.access$0(AmobeeView.this).onLeavingApplication();
_L29:
            obj = webview;
            s = new Intent();
            obj = webview;
            s.setAction("android.intent.action.VIEW");
            obj = webview;
            s.setData(uri);
            obj = webview;
            s.addFlags(0x10000000);
            obj = webview;
            getContext().startActivity(s);
              goto _L27
_L26:
            obj = webview;
            if (parentView == null) goto _L29; else goto _L28
_L28:
            obj = webview;
            if (AmobeeView.access$0(parentView) == null) goto _L29; else goto _L30
_L30:
            obj = webview;
            AmobeeView.access$0(parentView).onLeavingApplication();
              goto _L29
_L7:
            if (parentView == null || AmobeeView.access$0(parentView) == null) goto _L32; else goto _L31
_L31:
            AmobeeView.access$0(parentView).onLeavingApplication();
              goto _L32
        }


            
            {
                this$0 = AmobeeView.this;
                super();
            }
    }

}
