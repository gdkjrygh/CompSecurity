// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

    private void changeTextDirection(android.app.AlertDialog.Builder builder)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        builder.create();
        builder = builder.show();
        if (i >= 17)
        {
            ((TextView)builder.findViewById(0x102000b)).setTextDirection(5);
        }
    }

    private android.app.AlertDialog.Builder createDialog(CordovaInterface cordovainterface)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return new android.app.AlertDialog.Builder(cordovainterface.getActivity(), 5);
        } else
        {
            return new android.app.AlertDialog.Builder(cordovainterface.getActivity());
        }
    }

    private ProgressDialog createProgressDialog(CordovaInterface cordovainterface)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new ProgressDialog(cordovainterface.getActivity(), 5);
        } else
        {
            return new ProgressDialog(cordovainterface.getActivity());
        }
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
            final Notification val$notification;
            final String val$title;

            public void run()
            {
                notification.spinnerDialog = createProgressDialog(cordova);
                notification.spinnerDialog.setTitle(title);
                notification.spinnerDialog.setMessage(message);
                notification.spinnerDialog.setCancelable(true);
                notification.spinnerDialog.setIndeterminate(true);
                notification.spinnerDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls5 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        notification.spinnerDialog = null;
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                notification.spinnerDialog.show();
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
                android.app.AlertDialog.Builder builder = createDialog(cordova);
                builder.setMessage(message);
                builder.setTitle(title);
                builder.setCancelable(true);
                builder.setPositiveButton(buttonLabel, new android.content.DialogInterface.OnClickListener() {

                    final _cls2 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0));
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls2 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0));
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                changeTextDirection(builder);
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

    public void beep(final long count)
    {
        cordova.getThreadPool().execute(new Runnable() {

            final Notification this$0;
            final long val$count;

            public void run()
            {
                Object obj = RingtoneManager.getDefaultUri(2);
                obj = RingtoneManager.getRingtone(cordova.getActivity().getBaseContext(), ((android.net.Uri) (obj)));
                if (obj != null)
                {
                    for (long l = 0L; l < count; l++)
                    {
                        ((Ringtone) (obj)).play();
                        for (long l1 = 5000L; ((Ringtone) (obj)).isPlaying() && l1 > 0L;)
                        {
                            l1 -= 100L;
                            try
                            {
                                Thread.sleep(100L);
                            }
                            catch (InterruptedException interruptedexception) { }
                        }

                    }

                }
            }

            
            {
                this$0 = Notification.this;
                count = l;
                super();
            }
        });
    }

    public void confirm(String s, String s1, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Runnable() {

            final Notification this$0;
            final JSONArray val$buttonLabels;
            final CallbackContext val$callbackContext;
            final CordovaInterface val$cordova;
            final String val$message;
            final String val$title;

            public void run()
            {
                android.app.AlertDialog.Builder builder = createDialog(cordova);
                builder.setMessage(message);
                builder.setTitle(title);
                builder.setCancelable(true);
                if (buttonLabels.length() > 0)
                {
                    try
                    {
                        builder.setNegativeButton(buttonLabels.getString(0), new android.content.DialogInterface.OnClickListener() {

                            final _cls3 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 1));
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                    }
                    catch (JSONException jsonexception2) { }
                }
                if (buttonLabels.length() > 1)
                {
                    try
                    {
                        builder.setNeutralButton(buttonLabels.getString(1), new android.content.DialogInterface.OnClickListener() {

                            final _cls3 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 2));
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                    }
                    catch (JSONException jsonexception1) { }
                }
                if (buttonLabels.length() > 2)
                {
                    try
                    {
                        builder.setPositiveButton(buttonLabels.getString(2), new android.content.DialogInterface.OnClickListener() {

                            final _cls3 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 3));
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                    }
                    catch (JSONException jsonexception) { }
                }
                builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls3 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0));
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
                changeTextDirection(builder);
            }

            
            {
                this$0 = Notification.this;
                cordova = cordovainterface;
                message = s;
                title = s1;
                buttonLabels = jsonarray;
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
        boolean flag = false;
        if (!cordova.getActivity().isFinishing()) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        if (s.equals("beep"))
        {
            beep(jsonarray.getLong(0));
        } else
        {
            if (s.equals("alert"))
            {
                alert(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getString(2), callbackcontext);
                return true;
            }
            if (s.equals("confirm"))
            {
                confirm(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), callbackcontext);
                return true;
            }
            if (s.equals("prompt"))
            {
                prompt(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), callbackcontext);
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
            {
                if (!s.equals("progressValue"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                progressValue(jsonarray.getInt(0));
            }
        }
_L5:
        callbackcontext.success();
        return true;
        if (!s.equals("progressStop")) goto _L4; else goto _L3
_L3:
        progressStop();
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
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
                notification.progressDialog = createProgressDialog(cordova);
                notification.progressDialog.setProgressStyle(1);
                notification.progressDialog.setTitle(title);
                notification.progressDialog.setMessage(message);
                notification.progressDialog.setCancelable(true);
                notification.progressDialog.setMax(100);
                notification.progressDialog.setProgress(0);
                notification.progressDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls6 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        notification.progressDialog = null;
                    }

            
            {
                this$1 = _cls6.this;
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

    public void prompt(String s, String s1, JSONArray jsonarray, String s2, CallbackContext callbackcontext)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Runnable() {

            final Notification this$0;
            final JSONArray val$buttonLabels;
            final CallbackContext val$callbackContext;
            final CordovaInterface val$cordova;
            final String val$defaultText;
            final String val$message;
            final String val$title;

            public void run()
            {
                EditText edittext = new EditText(cordova.getActivity());
                edittext.setHint(defaultText);
                android.app.AlertDialog.Builder builder = createDialog(cordova);
                builder.setMessage(message);
                builder.setTitle(title);
                builder.setCancelable(true);
                builder.setView(edittext);
                final JSONObject result = new JSONObject();
                if (buttonLabels.length() > 0)
                {
                    try
                    {
                        builder.setNegativeButton(buttonLabels.getString(0), edittext. new android.content.DialogInterface.OnClickListener() {

                            final _cls4 this$1;
                            final EditText val$promptInput;
                            final JSONObject val$result;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                JSONObject jsonobject;
                                result.put("buttonIndex", 1);
                                jsonobject = result;
                                if (promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
                                dialoginterface = defaultText;
_L3:
                                jsonobject.put("input1", dialoginterface);
_L4:
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, result));
                                return;
_L2:
                                dialoginterface = promptInput.getText();
                                  goto _L3
                                dialoginterface;
                                dialoginterface.printStackTrace();
                                  goto _L4
                            }

            
            {
                this$1 = final__pcls4;
                result = jsonobject;
                promptInput = EditText.this;
                super();
            }
                        });
                    }
                    catch (JSONException jsonexception2) { }
                }
                if (buttonLabels.length() > 1)
                {
                    try
                    {
                        builder.setNeutralButton(buttonLabels.getString(1), edittext. new android.content.DialogInterface.OnClickListener() {

                            final _cls4 this$1;
                            final EditText val$promptInput;
                            final JSONObject val$result;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                JSONObject jsonobject;
                                result.put("buttonIndex", 2);
                                jsonobject = result;
                                if (promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
                                dialoginterface = defaultText;
_L3:
                                jsonobject.put("input1", dialoginterface);
_L4:
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, result));
                                return;
_L2:
                                dialoginterface = promptInput.getText();
                                  goto _L3
                                dialoginterface;
                                dialoginterface.printStackTrace();
                                  goto _L4
                            }

            
            {
                this$1 = final__pcls4;
                result = jsonobject;
                promptInput = EditText.this;
                super();
            }
                        });
                    }
                    catch (JSONException jsonexception1) { }
                }
                if (buttonLabels.length() > 2)
                {
                    try
                    {
                        builder.setPositiveButton(buttonLabels.getString(2), edittext. new android.content.DialogInterface.OnClickListener() {

                            final _cls4 this$1;
                            final EditText val$promptInput;
                            final JSONObject val$result;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                JSONObject jsonobject;
                                result.put("buttonIndex", 3);
                                jsonobject = result;
                                if (promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
                                dialoginterface = defaultText;
_L3:
                                jsonobject.put("input1", dialoginterface);
_L4:
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, result));
                                return;
_L2:
                                dialoginterface = promptInput.getText();
                                  goto _L3
                                dialoginterface;
                                dialoginterface.printStackTrace();
                                  goto _L4
                            }

            
            {
                this$1 = final__pcls4;
                result = jsonobject;
                promptInput = EditText.this;
                super();
            }
                        });
                    }
                    catch (JSONException jsonexception) { }
                }
                builder.setOnCancelListener(edittext. new android.content.DialogInterface.OnCancelListener() {

                    final _cls4 this$1;
                    final EditText val$promptInput;
                    final JSONObject val$result;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        dialoginterface.dismiss();
                        JSONObject jsonobject;
                        result.put("buttonIndex", 0);
                        jsonobject = result;
                        if (promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
                        dialoginterface = defaultText;
_L3:
                        jsonobject.put("input1", dialoginterface);
_L4:
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, result));
                        return;
_L2:
                        dialoginterface = promptInput.getText();
                          goto _L3
                        dialoginterface;
                        dialoginterface.printStackTrace();
                          goto _L4
                    }

            
            {
                this$1 = final__pcls4;
                result = jsonobject;
                promptInput = EditText.this;
                super();
            }
                });
                changeTextDirection(builder);
            }

            
            {
                this$0 = Notification.this;
                cordova = cordovainterface;
                defaultText = s;
                message = s1;
                title = s2;
                buttonLabels = jsonarray;
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



}
