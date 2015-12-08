// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package hu.dpal.phonegap.plugins;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import java.util.Stack;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package hu.dpal.phonegap.plugins:
//            CallbackProgressDialog

public class SpinnerDialog extends CordovaPlugin
{

    public Stack spinnerDialogStack;

    public SpinnerDialog()
    {
        spinnerDialogStack = new Stack();
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (s.equals("show"))
        {
            String s1;
            if ("null".equals(jsonarray.getString(0)))
            {
                s = null;
            } else
            {
                s = jsonarray.getString(0);
            }
            if ("null".equals(jsonarray.getString(1)))
            {
                s1 = null;
            } else
            {
                s1 = jsonarray.getString(1);
            }
            s = new Runnable() {

                final SpinnerDialog this$0;
                final CallbackContext val$callbackContext;
                final CordovaInterface val$cordova;
                final boolean val$isFixed;
                final String val$message;
                final String val$title;

                public void run()
                {
                    Object obj = new android.content.DialogInterface.OnCancelListener() {

                        final _cls1 this$1;

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
                this$1 = _cls1.this;
                super();
            }
                    };
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
                this$0 = SpinnerDialog.this;
                isFixed = flag;
                callbackContext = callbackcontext;
                cordova = cordovainterface;
                title = s;
                message = s1;
                super();
            }
            };
            cordova.getActivity().runOnUiThread(s);
        } else
        if (s.equals("hide"))
        {
            s = new Runnable() {

                final SpinnerDialog this$0;

                public void run()
                {
                    if (!spinnerDialogStack.empty())
                    {
                        ((ProgressDialog)spinnerDialogStack.pop()).dismiss();
                    }
                }

            
            {
                this$0 = SpinnerDialog.this;
                super();
            }
            };
            cordova.getActivity().runOnUiThread(s);
            return true;
        }
        return true;
    }
}
