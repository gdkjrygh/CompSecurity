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

class this._cls1
    implements android.content.CancelListener
{

    final nerDialogStack this$1;

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

    l.message()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class hu/dpal/phonegap/plugins/SpinnerDialog$1

/* anonymous class */
    class SpinnerDialog._cls1
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
            Object obj = new SpinnerDialog._cls1._cls1();
            if (isFixed)
            {
                obj = CallbackProgressDialog.show(cordova.getActivity(), title, message, true, false, null, callbackContext);
            } else
            {
                obj = ProgressDialog.show(cordova.getActivity(), title, message, true, true, ((android.content.DialogInterface.OnCancelListener) (obj)));
            }
            if (title == null && message == null)
            {
                ((ProgressDialog) (obj)).setContentView(new ProgressBar(cordova.getActivity()));
            }
            spinnerDialogStack.push(obj);
        }

            
            {
                this$0 = final_spinnerdialog;
                isFixed = flag;
                callbackContext = callbackcontext;
                cordova = cordovainterface;
                title = s;
                message = String.this;
                super();
            }
    }

}
