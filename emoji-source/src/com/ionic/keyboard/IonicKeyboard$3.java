// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ionic.keyboard;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package com.ionic.keyboard:
//            IonicKeyboard

class val.callbackContext
    implements Runnable
{

    final IonicKeyboard this$0;
    final CallbackContext val$callbackContext;

    public void run()
    {
        ((InputMethodManager)cordova.getActivity().getSystemService("input_method")).toggleSoftInput(0, 1);
        val$callbackContext.success();
    }

    dManager()
    {
        this$0 = final_ionickeyboard;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
