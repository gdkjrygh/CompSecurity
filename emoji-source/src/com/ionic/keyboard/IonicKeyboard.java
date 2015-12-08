// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ionic.keyboard;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class IonicKeyboard extends CordovaPlugin
{

    public IonicKeyboard()
    {
    }

    public boolean execute(String s, JSONArray jsonarray, final CallbackContext callbackContext)
        throws JSONException
    {
        if ("close".equals(s))
        {
            cordova.getThreadPool().execute(new Runnable() {

                final IonicKeyboard this$0;
                final CallbackContext val$callbackContext;

                public void run()
                {
                    InputMethodManager inputmethodmanager = (InputMethodManager)cordova.getActivity().getSystemService("input_method");
                    View view = cordova.getActivity().getCurrentFocus();
                    if (view == null)
                    {
                        callbackContext.error("No current focus");
                    }
                    inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 2);
                    callbackContext.success();
                }

            
            {
                this$0 = IonicKeyboard.this;
                callbackContext = callbackcontext;
                super();
            }
            });
            return true;
        }
        if ("show".equals(s))
        {
            cordova.getThreadPool().execute(new Runnable() {

                final IonicKeyboard this$0;
                final CallbackContext val$callbackContext;

                public void run()
                {
                    ((InputMethodManager)cordova.getActivity().getSystemService("input_method")).toggleSoftInput(0, 1);
                    callbackContext.success();
                }

            
            {
                this$0 = IonicKeyboard.this;
                callbackContext = callbackcontext;
                super();
            }
            });
            return true;
        } else
        {
            return false;
        }
    }

    public void initialize(final CordovaInterface rootView, final CordovaWebView appView)
    {
        super.initialize(rootView, appView);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        rootView.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        final float density = displaymetrics.density;
        rootView = rootView.getActivity().getWindow().getDecorView().findViewById(0x1020002).getRootView();
        appView = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            int previousHeightDiff;
            final IonicKeyboard this$0;
            final CordovaWebView val$appView;
            final float val$density;
            final View val$rootView;

            public void onGlobalLayout()
            {
                int i;
                Rect rect = new Rect();
                rootView.getWindowVisibleDisplayFrame(rect);
                i = (int)((float)(rootView.getRootView().getHeight() - (rect.bottom - rect.top)) / density);
                if (i <= 100 || i == previousHeightDiff) goto _L2; else goto _L1
_L1:
                appView.sendJavascript("cordova.plugins.Keyboard.isVisible = true");
                appView.sendJavascript((new StringBuilder()).append("cordova.fireWindowEvent('native.keyboardshow', { 'keyboardHeight':").append(Integer.toString(i)).append("});").toString());
                appView.sendJavascript((new StringBuilder()).append("cordova.fireWindowEvent('native.showkeyboard', { 'keyboardHeight':").append(Integer.toString(i)).append("});").toString());
_L4:
                previousHeightDiff = i;
                return;
_L2:
                if (i != previousHeightDiff && previousHeightDiff - i > 100)
                {
                    appView.sendJavascript("cordova.plugins.Keyboard.isVisible = false");
                    appView.sendJavascript("cordova.fireWindowEvent('native.keyboardhide')");
                    appView.sendJavascript("cordova.fireWindowEvent('native.hidekeyboard')");
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = IonicKeyboard.this;
                rootView = view;
                density = f;
                appView = cordovawebview;
                super();
                previousHeightDiff = 0;
            }
        };
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(appView);
    }
}
