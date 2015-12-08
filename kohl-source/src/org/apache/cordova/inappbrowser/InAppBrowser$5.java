// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.io.File;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowser, InAppBrowserDialog, InAppChromeClient

class val.thatWebView
    implements Runnable
{

    final InAppBrowser this$0;
    final CordovaWebView val$thatWebView;
    final String val$url;

    private int dpToPixels(int i)
    {
        return (int)TypedValue.applyDimension(1, i, cordova.getActivity().getResources().getDisplayMetrics());
    }

    public void run()
    {
        InAppBrowser.access$002(InAppBrowser.this, new InAppBrowserDialog(cordova.getActivity(), 0x1030006));
        InAppBrowser.access$000(InAppBrowser.this).getWindow().getAttributes().windowAnimations = 0x1030002;
        InAppBrowser.access$000(InAppBrowser.this).requestWindowFeature(1);
        InAppBrowser.access$000(InAppBrowser.this).setCancelable(true);
        InAppBrowser.access$000(InAppBrowser.this).setInAppBroswer(InAppBrowser.access$200(InAppBrowser.this));
        LinearLayout linearlayout = new LinearLayout(cordova.getActivity());
        linearlayout.setOrientation(1);
        Object obj = new RelativeLayout(cordova.getActivity());
        ((RelativeLayout) (obj)).setBackgroundColor(0xffcccccc);
        ((RelativeLayout) (obj)).setLayoutParams(new android.widget.LayoutParams(-1, dpToPixels(44)));
        ((RelativeLayout) (obj)).setPadding(dpToPixels(2), dpToPixels(2), dpToPixels(2), dpToPixels(2));
        ((RelativeLayout) (obj)).setHorizontalGravity(3);
        ((RelativeLayout) (obj)).setVerticalGravity(48);
        RelativeLayout relativelayout = new RelativeLayout(cordova.getActivity());
        relativelayout.setLayoutParams(new android.widget.LayoutParams(-2, -2));
        relativelayout.setHorizontalGravity(3);
        relativelayout.setVerticalGravity(16);
        relativelayout.setId(1);
        Button button = new Button(cordova.getActivity());
        Object obj1 = new android.widget.LayoutParams(-2, -1);
        ((android.widget.LayoutParams) (obj1)).addRule(5);
        button.setLayoutParams(((android.view.tParams) (obj1)));
        button.setContentDescription("Back Button");
        button.setId(2);
        Object obj2 = cordova.getActivity().getResources();
        obj1 = ((Resources) (obj2)).getDrawable(((Resources) (obj2)).getIdentifier("ic_action_previous_item", "drawable", cordova.getActivity().getPackageName()));
        Object obj3;
        Object obj4;
        boolean flag;
        if (android.os.DK_INT < 16)
        {
            button.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
        } else
        {
            button.setBackground(((android.graphics.drawable.Drawable) (obj1)));
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final InAppBrowser._cls5 this$1;

            public void onClick(View view)
            {
                InAppBrowser.access$300(this$0);
            }

            
            {
                this$1 = InAppBrowser._cls5.this;
                super();
            }
        });
        obj1 = new Button(cordova.getActivity());
        obj3 = new android.widget.LayoutParams(-2, -1);
        ((android.widget.LayoutParams) (obj3)).addRule(1, 2);
        ((Button) (obj1)).setLayoutParams(((android.view.tParams) (obj3)));
        ((Button) (obj1)).setContentDescription("Forward Button");
        ((Button) (obj1)).setId(3);
        obj3 = ((Resources) (obj2)).getDrawable(((Resources) (obj2)).getIdentifier("ic_action_next_item", "drawable", cordova.getActivity().getPackageName()));
        if (android.os.DK_INT < 16)
        {
            ((Button) (obj1)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
        } else
        {
            ((Button) (obj1)).setBackground(((android.graphics.drawable.Drawable) (obj3)));
        }
        ((Button) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final InAppBrowser._cls5 this$1;

            public void onClick(View view)
            {
                InAppBrowser.access$400(this$0);
            }

            
            {
                this$1 = InAppBrowser._cls5.this;
                super();
            }
        });
        InAppBrowser.access$502(InAppBrowser.this, new EditText(cordova.getActivity()));
        obj3 = new android.widget.LayoutParams(-1, -1);
        ((android.widget.LayoutParams) (obj3)).addRule(1, 1);
        ((android.widget.LayoutParams) (obj3)).addRule(0, 5);
        InAppBrowser.access$500(InAppBrowser.this).setLayoutParams(((android.view.tParams) (obj3)));
        InAppBrowser.access$500(InAppBrowser.this).setId(4);
        InAppBrowser.access$500(InAppBrowser.this).setSingleLine(true);
        InAppBrowser.access$500(InAppBrowser.this).setText(val$url);
        InAppBrowser.access$500(InAppBrowser.this).setInputType(16);
        InAppBrowser.access$500(InAppBrowser.this).setImeOptions(2);
        InAppBrowser.access$500(InAppBrowser.this).setInputType(0);
        InAppBrowser.access$500(InAppBrowser.this).setOnKeyListener(new android.view.View.OnKeyListener() {

            final InAppBrowser._cls5 this$1;

            public boolean onKey(View view, int i, KeyEvent keyevent)
            {
                if (keyevent.getAction() == 0 && i == 66)
                {
                    InAppBrowser.access$600(this$0, InAppBrowser.access$500(this$0).getText().toString());
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$1 = InAppBrowser._cls5.this;
                super();
            }
        });
        obj3 = new Button(cordova.getActivity());
        obj4 = new android.widget.LayoutParams(-2, -1);
        ((android.widget.LayoutParams) (obj4)).addRule(11);
        ((Button) (obj3)).setLayoutParams(((android.view.tParams) (obj4)));
        ((Button) (obj1)).setContentDescription("Close Button");
        ((Button) (obj3)).setId(5);
        obj2 = ((Resources) (obj2)).getDrawable(((Resources) (obj2)).getIdentifier("ic_action_remove", "drawable", cordova.getActivity().getPackageName()));
        if (android.os.DK_INT < 16)
        {
            ((Button) (obj3)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
        } else
        {
            ((Button) (obj3)).setBackground(((android.graphics.drawable.Drawable) (obj2)));
        }
        ((Button) (obj3)).setOnClickListener(new android.view.View.OnClickListener() {

            final InAppBrowser._cls5 this$1;

            public void onClick(View view)
            {
                closeDialog();
            }

            
            {
                this$1 = InAppBrowser._cls5.this;
                super();
            }
        });
        InAppBrowser.access$102(InAppBrowser.this, new WebView(cordova.getActivity()));
        InAppBrowser.access$100(InAppBrowser.this).setLayoutParams(new android.widget.youtParams(-1, -1));
        InAppBrowser.access$100(InAppBrowser.this).setWebChromeClient(new InAppChromeClient(val$thatWebView));
        obj2 = new AppBrowserClient(InAppBrowser.this, val$thatWebView, InAppBrowser.access$500(InAppBrowser.this));
        InAppBrowser.access$100(InAppBrowser.this).setWebViewClient(((android.webkit.WebViewClient) (obj2)));
        obj2 = InAppBrowser.access$100(InAppBrowser.this).getSettings();
        ((WebSettings) (obj2)).setJavaScriptEnabled(true);
        ((WebSettings) (obj2)).setJavaScriptCanOpenWindowsAutomatically(true);
        ((WebSettings) (obj2)).setBuiltInZoomControls(true);
        ((WebSettings) (obj2)).setPluginState(android.webkit.ginState.ON);
        obj4 = cordova.getActivity().getIntent().getExtras();
        if (obj4 == null)
        {
            flag = true;
        } else
        {
            flag = ((Bundle) (obj4)).getBoolean("InAppBrowserStorageEnabled", true);
        }
        if (flag)
        {
            ((WebSettings) (obj2)).setDatabasePath(cordova.getActivity().getApplicationContext().getDir("inAppBrowserDB", 0).getPath());
            ((WebSettings) (obj2)).setDatabaseEnabled(true);
        }
        ((WebSettings) (obj2)).setDomStorageEnabled(true);
        if (!InAppBrowser.access$700(InAppBrowser.this)) goto _L2; else goto _L1
_L1:
        CookieManager.getInstance().removeAllCookie();
_L4:
        InAppBrowser.access$100(InAppBrowser.this).loadUrl(val$url);
        InAppBrowser.access$100(InAppBrowser.this).setId(6);
        InAppBrowser.access$100(InAppBrowser.this).getSettings().setLoadWithOverviewMode(true);
        InAppBrowser.access$100(InAppBrowser.this).getSettings().setUseWideViewPort(true);
        InAppBrowser.access$100(InAppBrowser.this).requestFocus();
        InAppBrowser.access$100(InAppBrowser.this).requestFocusFromTouch();
        relativelayout.addView(button);
        relativelayout.addView(((View) (obj1)));
        ((RelativeLayout) (obj)).addView(relativelayout);
        ((RelativeLayout) (obj)).addView(InAppBrowser.access$500(InAppBrowser.this));
        ((RelativeLayout) (obj)).addView(((View) (obj3)));
        if (InAppBrowser.access$900(InAppBrowser.this))
        {
            linearlayout.addView(((View) (obj)));
        }
        linearlayout.addView(InAppBrowser.access$100(InAppBrowser.this));
        obj = new android.view.ayoutParams();
        ((android.view.ayoutParams) (obj)).copyFrom(InAppBrowser.access$000(InAppBrowser.this).getWindow().getAttributes());
        obj.width = -1;
        obj.height = -1;
        InAppBrowser.access$000(InAppBrowser.this).setContentView(linearlayout);
        InAppBrowser.access$000(InAppBrowser.this).show();
        InAppBrowser.access$000(InAppBrowser.this).getWindow().setAttributes(((android.view.ayoutParams) (obj)));
        if (InAppBrowser.access$1000(InAppBrowser.this))
        {
            InAppBrowser.access$000(InAppBrowser.this).hide();
        }
        return;
_L2:
        if (InAppBrowser.access$800(InAppBrowser.this))
        {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    _cls4.this._cls1()
    {
        this$0 = final_inappbrowser;
        val$url = s;
        val$thatWebView = CordovaWebView.this;
        super();
    }
}
