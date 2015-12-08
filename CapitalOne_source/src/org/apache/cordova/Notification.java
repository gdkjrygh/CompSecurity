// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Vibrator;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class Notification extends CordovaPlugin
{

    public int confirmResult;
    public ProgressDialog progressDialog;
    public ProgressDialog spinnerDialog;

    public Notification()
    {
        confirmResult = -1;
        spinnerDialog = null;
        progressDialog = null;
    }

    public void activityStart(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (spinnerDialog != null)
        {
            spinnerDialog.dismiss();
            spinnerDialog = null;
        }
        s = new Runnable() {

            final Notification this$0;
            final CordovaInterface val$cordova;
            final String val$message;
            final String val$title;

            public void run()
            {
                spinnerDialog = ProgressDialog.show(cordova.getActivity(), title, message, true, true, new android.content.DialogInterface.OnCancelListener() {

                    final _cls3 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        spinnerDialog = null;
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
            }

            
            {
                this$0 = Notification.this;
                cordova = cordovainterface;
                title = s;
                message = s1;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void activityStop()
    {
        this;
        JVM INSTR monitorenter ;
        if (spinnerDialog != null)
        {
            spinnerDialog.dismiss();
            spinnerDialog = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void alert(String s, String s1, String s2, CallbackContext callbackcontext)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Runnable() {

            final Notification this$0;
            final String val$buttonLabel;
            final CallbackContext val$callbackContext;
            final CordovaInterface val$cordova;
            final String val$message;
            final String val$title;

            public void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(cordova.getActivity());
                builder.setMessage(message);
                builder.setTitle(title);
                builder.setCancelable(true);
                builder.setPositiveButton(buttonLabel, new android.content.DialogInterface.OnClickListener() {

                    final _cls1 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 0));
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls1 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 0));
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                builder.create();
                builder.show();
            }

            
            {
                this$0 = Notification.this;
                cordova = cordovainterface;
                message = s;
                title = s1;
                buttonLabel = s2;
                callbackContext = callbackcontext;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void beep(long l)
    {
        Object obj = RingtoneManager.getDefaultUri(2);
        obj = RingtoneManager.getRingtone(cordova.getActivity().getBaseContext(), ((android.net.Uri) (obj)));
        if (obj != null)
        {
            for (long l1 = 0L; l1 < l; l1++)
            {
                ((Ringtone) (obj)).play();
                for (long l2 = 5000L; ((Ringtone) (obj)).isPlaying() && l2 > 0L;)
                {
                    l2 -= 100L;
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch (InterruptedException interruptedexception) { }
                }

            }

        }
    }

    public void confirm(String s, String s1, String s2, CallbackContext callbackcontext)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Runnable() {

            final Notification this$0;
            final CallbackContext val$callbackContext;
            final CordovaInterface val$cordova;
            final String val$fButtons[];
            final String val$message;
            final String val$title;

            public void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(cordova.getActivity());
                builder.setMessage(message);
                builder.setTitle(title);
                builder.setCancelable(true);
                if (fButtons.length > 0)
                {
                    builder.setNegativeButton(fButtons[0], new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 1));
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
                if (fButtons.length > 1)
                {
                    builder.setNeutralButton(fButtons[1], new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 2));
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
                if (fButtons.length > 2)
                {
                    builder.setPositiveButton(fButtons[2], new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 3));
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
                builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls2 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 0));
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                builder.create();
                builder.show();
            }

            
            {
                this$0 = Notification.this;
                cordova = cordovainterface;
                message = s;
                title = s1;
                fButtons = as;
                callbackContext = callbackcontext;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (s.equals("beep"))
        {
            beep(jsonarray.getLong(0));
        } else
        if (s.equals("vibrate"))
        {
            vibrate(jsonarray.getLong(0));
        } else
        {
            if (s.equals("alert"))
            {
                alert(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getString(2), callbackcontext);
                return true;
            }
            if (s.equals("confirm"))
            {
                confirm(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getString(2), callbackcontext);
                return true;
            }
            if (s.equals("activityStart"))
            {
                activityStart(jsonarray.getString(0), jsonarray.getString(1));
            } else
            if (s.equals("activityStop"))
            {
                activityStop();
            } else
            if (s.equals("progressStart"))
            {
                progressStart(jsonarray.getString(0), jsonarray.getString(1));
            } else
            if (s.equals("progressValue"))
            {
                progressValue(jsonarray.getInt(0));
            } else
            if (s.equals("progressStop"))
            {
                progressStop();
            } else
            {
                return false;
            }
        }
        callbackcontext.success();
        return true;
    }

    public void progressStart(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (progressDialog != null)
        {
            progressDialog.dismiss();
            progressDialog = null;
        }
        s = new Runnable() {

            final Notification this$0;
            final CordovaInterface val$cordova;
            final String val$message;
            final Notification val$notification;
            final String val$title;

            public void run()
            {
                notification.progressDialog = new ProgressDialog(cordova.getActivity());
                notification.progressDialog.setProgressStyle(1);
                notification.progressDialog.setTitle(title);
                notification.progressDialog.setMessage(message);
                notification.progressDialog.setCancelable(true);
                notification.progressDialog.setMax(100);
                notification.progressDialog.setProgress(0);
                notification.progressDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls4 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        notification.progressDialog = null;
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
                notification.progressDialog.show();
            }

            
            {
                this$0 = Notification.this;
                notification = notification2;
                cordova = cordovainterface;
                title = s;
                message = s1;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void progressStop()
    {
        this;
        JVM INSTR monitorenter ;
        if (progressDialog != null)
        {
            progressDialog.dismiss();
            progressDialog = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void progressValue(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (progressDialog != null)
        {
            progressDialog.setProgress(i);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void vibrate(long l)
    {
        long l1 = l;
        if (l == 0L)
        {
            l1 = 500L;
        }
        ((Vibrator)cordova.getActivity().getSystemService("vibrator")).vibrate(l1);
    }
}
