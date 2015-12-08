// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package hu.dpal.phonegap.plugins;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import java.util.Stack;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package hu.dpal.phonegap.plugins:
//            SpinnerDialog, CallbackProgressDialog

class val.message
    implements Runnable
{

    final SpinnerDialog this$0;
    final CallbackContext val$callbackContext;
    final CordovaInterface val$cordova;
    final boolean val$isFixed;
    final String val$message;
    final String val$title;

    public void run()
    {
        Object obj = new android.content.DialogInterface.OnCancelListener() {

            final SpinnerDialog._cls1 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                if (!isFixed)
                {
                    for (; !spinnerDialogStack.empty(); callbackContext.success())
                    {
                        ((ProgressDialog)spinnerDialogStack.pop()).dismiss();
                    }

                }
            }

            
            {
                this$1 = SpinnerDialog._cls1.this;
                super();
            }
        };
        if (val$isFixed)
        {
            obj = CallbackProgressDialog.show(val$cordova.getActivity(), val$title, val$message, true, false, null, val$callbackContext);
        } else
        {
            obj = ProgressDialog.show(val$cordova.getActivity(), val$title, val$message, true, true, ((android.content.OnCancelListener) (obj)));
        }
        if (val$title == null && val$message == null)
        {
            ((ProgressDialog) (obj)).setContentView(new ProgressBar(val$cordova.getActivity()));
        }
        spinnerDialogStack.push(obj);
    }

    _cls1.this._cls1()
    {
        this$0 = final_spinnerdialog;
        val$isFixed = flag;
        val$callbackContext = callbackcontext;
        val$cordova = cordovainterface;
        val$title = s;
        val$message = String.this;
        super();
    }
}
