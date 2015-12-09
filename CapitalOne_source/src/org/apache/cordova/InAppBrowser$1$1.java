// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import org.apache.cordova.api.CordovaInterface;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            InAppBrowser, CordovaWebView

class this._cls1
    implements android.content.nDismissListener
{

    final is._cls0 this$1;

    public void onDismiss(DialogInterface dialoginterface)
    {
        try
        {
            dialoginterface = new JSONObject();
            dialoginterface.put("type", "exit");
            InAppBrowser.access$100(_fld0, dialoginterface, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            Log.d("InAppBrowser", "Should never happen");
        }
    }

    l.thatWebView()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/InAppBrowser$1

/* anonymous class */
    class InAppBrowser._cls1
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
            InAppBrowser.access$002(InAppBrowser.this, new Dialog(cordova.getActivity(), 0x1030006));
            InAppBrowser.access$000(InAppBrowser.this).getWindow().getAttributes().windowAnimations = 0x1030002;
            InAppBrowser.access$000(InAppBrowser.this).requestWindowFeature(1);
            InAppBrowser.access$000(InAppBrowser.this).setCancelable(true);
            InAppBrowser.access$000(InAppBrowser.this).setOnDismissListener(new InAppBrowser._cls1._cls1());
            LinearLayout linearlayout = new LinearLayout(cordova.getActivity());
            linearlayout.setOrientation(1);
            Object obj = new RelativeLayout(cordova.getActivity());
            ((RelativeLayout) (obj)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, dpToPixels(44)));
            ((RelativeLayout) (obj)).setPadding(dpToPixels(2), dpToPixels(2), dpToPixels(2), dpToPixels(2));
            ((RelativeLayout) (obj)).setHorizontalGravity(3);
            ((RelativeLayout) (obj)).setVerticalGravity(48);
            RelativeLayout relativelayout = new RelativeLayout(cordova.getActivity());
            relativelayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            relativelayout.setHorizontalGravity(3);
            relativelayout.setVerticalGravity(16);
            relativelayout.setId(1);
            Button button = new Button(cordova.getActivity());
            Object obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(5);
            button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            button.setContentDescription("Back Button");
            button.setId(2);
            button.setText("<");
            button.setOnClickListener(new InAppBrowser._cls1._cls2());
            obj1 = new Button(cordova.getActivity());
            Object obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(1, 2);
            ((Button) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
            ((Button) (obj1)).setContentDescription("Forward Button");
            ((Button) (obj1)).setId(3);
            ((Button) (obj1)).setText(">");
            ((Button) (obj1)).setOnClickListener(new InAppBrowser._cls1._cls3());
            InAppBrowser.access$402(InAppBrowser.this, new EditText(cordova.getActivity()));
            obj2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(1, 1);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(0, 5);
            InAppBrowser.access$400(InAppBrowser.this).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
            InAppBrowser.access$400(InAppBrowser.this).setId(4);
            InAppBrowser.access$400(InAppBrowser.this).setSingleLine(true);
            InAppBrowser.access$400(InAppBrowser.this).setText(url);
            InAppBrowser.access$400(InAppBrowser.this).setInputType(16);
            InAppBrowser.access$400(InAppBrowser.this).setImeOptions(2);
            InAppBrowser.access$400(InAppBrowser.this).setInputType(0);
            InAppBrowser.access$400(InAppBrowser.this).setOnKeyListener(new InAppBrowser._cls1._cls4());
            obj2 = new Button(cordova.getActivity());
            Object obj3 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(11);
            ((Button) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
            ((Button) (obj1)).setContentDescription("Close Button");
            ((Button) (obj2)).setId(5);
            ((Button) (obj2)).setText("Done");
            ((Button) (obj2)).setOnClickListener(new InAppBrowser._cls1._cls5());
            InAppBrowser.access$702(InAppBrowser.this, new WebView(cordova.getActivity()));
            InAppBrowser.access$700(InAppBrowser.this).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            InAppBrowser.access$700(InAppBrowser.this).setWebChromeClient(new WebChromeClient());
            obj3 = new InAppBrowser.InAppBrowserClient(InAppBrowser.this, thatWebView, InAppBrowser.access$400(InAppBrowser.this));
            InAppBrowser.access$700(InAppBrowser.this).setWebViewClient(((android.webkit.WebViewClient) (obj3)));
            obj3 = InAppBrowser.access$700(InAppBrowser.this).getSettings();
            ((WebSettings) (obj3)).setJavaScriptEnabled(true);
            ((WebSettings) (obj3)).setJavaScriptCanOpenWindowsAutomatically(true);
            ((WebSettings) (obj3)).setBuiltInZoomControls(true);
            ((WebSettings) (obj3)).setPluginsEnabled(true);
            ((WebSettings) (obj3)).setDomStorageEnabled(true);
            InAppBrowser.access$700(InAppBrowser.this).loadUrl(url);
            InAppBrowser.access$700(InAppBrowser.this).setId(6);
            InAppBrowser.access$700(InAppBrowser.this).getSettings().setLoadWithOverviewMode(true);
            InAppBrowser.access$700(InAppBrowser.this).getSettings().setUseWideViewPort(true);
            InAppBrowser.access$700(InAppBrowser.this).requestFocus();
            InAppBrowser.access$700(InAppBrowser.this).requestFocusFromTouch();
            relativelayout.addView(button);
            relativelayout.addView(((View) (obj1)));
            ((RelativeLayout) (obj)).addView(relativelayout);
            ((RelativeLayout) (obj)).addView(InAppBrowser.access$400(InAppBrowser.this));
            ((RelativeLayout) (obj)).addView(((View) (obj2)));
            if (InAppBrowser.access$800(InAppBrowser.this))
            {
                linearlayout.addView(((View) (obj)));
            }
            linearlayout.addView(InAppBrowser.access$700(InAppBrowser.this));
            obj = new android.view.WindowManager.LayoutParams();
            ((android.view.WindowManager.LayoutParams) (obj)).copyFrom(InAppBrowser.access$000(InAppBrowser.this).getWindow().getAttributes());
            obj.width = -1;
            obj.height = -1;
            InAppBrowser.access$000(InAppBrowser.this).setContentView(linearlayout);
            InAppBrowser.access$000(InAppBrowser.this).show();
            InAppBrowser.access$000(InAppBrowser.this).getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
        }

            
            {
                this$0 = final_inappbrowser;
                url = s;
                thatWebView = CordovaWebView.this;
                super();
            }

        // Unreferenced inner class org/apache/cordova/InAppBrowser$1$2

/* anonymous class */
        class InAppBrowser._cls1._cls2
            implements android.view.View.OnClickListener
        {

            final InAppBrowser._cls1 this$1;

            public void onClick(View view)
            {
                InAppBrowser.access$200(this$0);
            }

                    
                    {
                        this$1 = InAppBrowser._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class org/apache/cordova/InAppBrowser$1$3

/* anonymous class */
        class InAppBrowser._cls1._cls3
            implements android.view.View.OnClickListener
        {

            final InAppBrowser._cls1 this$1;

            public void onClick(View view)
            {
                InAppBrowser.access$300(this$0);
            }

                    
                    {
                        this$1 = InAppBrowser._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class org/apache/cordova/InAppBrowser$1$4

/* anonymous class */
        class InAppBrowser._cls1._cls4
            implements android.view.View.OnKeyListener
        {

            final InAppBrowser._cls1 this$1;

            public boolean onKey(View view, int i, KeyEvent keyevent)
            {
                if (keyevent.getAction() == 0 && i == 66)
                {
                    InAppBrowser.access$500(this$0, InAppBrowser.access$400(this$0).getText().toString());
                    return true;
                } else
                {
                    return false;
                }
            }

                    
                    {
                        this$1 = InAppBrowser._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class org/apache/cordova/InAppBrowser$1$5

/* anonymous class */
        class InAppBrowser._cls1._cls5
            implements android.view.View.OnClickListener
        {

            final InAppBrowser._cls1 this$1;

            public void onClick(View view)
            {
                InAppBrowser.access$600(this$0);
            }

                    
                    {
                        this$1 = InAppBrowser._cls1.this;
                        super();
                    }
        }

    }

}
