// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ionic.keyboard;

import android.graphics.Rect;
import android.view.View;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package com.ionic.keyboard:
//            IonicKeyboard

class previousHeightDiff
    implements android.view..OnGlobalLayoutListener
{

    int previousHeightDiff;
    final IonicKeyboard this$0;
    final CordovaWebView val$appView;
    final float val$density;
    final View val$rootView;

    public void onGlobalLayout()
    {
        int i;
        Rect rect = new Rect();
        val$rootView.getWindowVisibleDisplayFrame(rect);
        i = (int)((float)(val$rootView.getRootView().getHeight() - (rect.bottom - rect.top)) / val$density);
        if (i <= 100 || i == previousHeightDiff) goto _L2; else goto _L1
_L1:
        val$appView.sendJavascript("cordova.plugins.Keyboard.isVisible = true");
        val$appView.sendJavascript((new StringBuilder()).append("cordova.fireWindowEvent('native.keyboardshow', { 'keyboardHeight':").append(Integer.toString(i)).append("});").toString());
        val$appView.sendJavascript((new StringBuilder()).append("cordova.fireWindowEvent('native.showkeyboard', { 'keyboardHeight':").append(Integer.toString(i)).append("});").toString());
_L4:
        previousHeightDiff = i;
        return;
_L2:
        if (i != previousHeightDiff && previousHeightDiff - i > 100)
        {
            val$appView.sendJavascript("cordova.plugins.Keyboard.isVisible = false");
            val$appView.sendJavascript("cordova.fireWindowEvent('native.keyboardhide')");
            val$appView.sendJavascript("cordova.fireWindowEvent('native.hidekeyboard')");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    balLayoutListener()
    {
        this$0 = final_ionickeyboard;
        val$rootView = view;
        val$density = f;
        val$appView = CordovaWebView.this;
        super();
        previousHeightDiff = 0;
    }
}
