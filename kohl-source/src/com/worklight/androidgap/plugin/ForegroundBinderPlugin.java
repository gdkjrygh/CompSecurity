// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.IBinder;
import com.worklight.common.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class ForegroundBinderPlugin extends CordovaPlugin
{
    static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action BIND_TO_SERVICE;
        public static final Action UNBIND_FROM_SERVICE;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/worklight/androidgap/plugin/ForegroundBinderPlugin$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            BIND_TO_SERVICE = new Action("BIND_TO_SERVICE", 0);
            UNBIND_FROM_SERVICE = new Action("UNBIND_FROM_SERVICE", 1);
            $VALUES = (new Action[] {
                BIND_TO_SERVICE, UNBIND_FROM_SERVICE
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String TAG = "WLForegroundBinder";
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/ForegroundBinderPlugin.getName());
    private Context ctx;
    private Integer notificationIdentifier;
    private ServiceConnection serviceConnection;

    public ForegroundBinderPlugin()
    {
    }

    private void bindService(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        String s;
        logger.debug("trying to bind service");
        Intent intent = new Intent();
        Context context = ctx.getApplicationContext();
        intent.setClassName(context, (new StringBuilder()).append(ctx.getPackageName()).append(".ForegroundService").toString());
        if (serviceConnection != null)
        {
            callbackcontext.error("already bound to service");
            return;
        }
        jsonarray.getString(0);
        final String popupText = jsonarray.getString(1);
        final String titleText = jsonarray.getString(2);
        final String explainText = jsonarray.getString(3);
        s = jsonarray.getString(4);
        final int notificationId = jsonarray.getInt(5);
        Class class1 = cordova.getActivity().getClass();
        final Class activityClass = class1;
        final int iconId;
        int i;
        try
        {
            if (jsonarray.length() >= 7)
            {
                activityClass = Class.forName(jsonarray.getString(6), false, context.getClassLoader());
            }
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            logger.error((new StringBuilder()).append("Class not found: ").append(jsonarray.getString(6)).append(". Using default.").toString());
            classnotfoundexception = class1;
        }
        iconId = 0x108004b;
        notificationIdentifier = Integer.valueOf(notificationId);
        i = context.getResources().getIdentifier(s, "drawable", context.getPackageName());
        iconId = i;
_L2:
        try
        {
            if (context.bindService(intent, new ServiceConnection() {

        final ForegroundBinderPlugin this$0;
        final Class val$activityClass;
        final String val$explainText;
        final int val$iconId;
        final int val$notificationId;
        final String val$popupText;
        final String val$titleText;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            serviceConnection = this;
            componentname = new Notification(iconId, popupText, System.currentTimeMillis());
            PendingIntent pendingintent = PendingIntent.getActivity(ctx, 0, new Intent(ctx, activityClass), 0);
            componentname.setLatestEventInfo(ctx, titleText, explainText, pendingintent);
            componentname.flags = ((Notification) (componentname)).flags | 2;
            ((com.worklight.androidgap.WLForegroundService.ForegroundBinder)ibinder).makeForeground(notificationId, componentname);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            ForegroundBinderPlugin.logger.debug("service disconnected");
            cancelNotification();
        }

            
            {
                this$0 = ForegroundBinderPlugin.this;
                iconId = i;
                popupText = s;
                activityClass = class1;
                titleText = s1;
                explainText = s2;
                notificationId = j;
                super();
            }
    }, 1))
            {
                callbackcontext.success();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            callbackcontext.error((new StringBuilder()).append("Could not bind to foreground service, reason: ").append(jsonarray.getMessage()).toString());
            return;
        }
        break; /* Loop/switch isn't completed */
        jsonarray;
        logger.error((new StringBuilder()).append("Icon not found: ").append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
        callbackcontext.error("Could not bind to foreground service");
        return;
    }

    private void cancelNotification()
    {
        if (notificationIdentifier != null)
        {
            ((NotificationManager)ctx.getSystemService("notification")).cancel(notificationIdentifier.intValue());
        }
        notificationIdentifier = null;
    }

    private static String toAllCaps(String s)
    {
        s = Pattern.compile("[A-Z]?[a-z]*").matcher(s);
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (!s.find())
            {
                break;
            }
            stringbuilder.append(s.group());
            if (!s.hitEnd())
            {
                stringbuilder.append("_");
            }
        } while (true);
        return stringbuilder.toString().toUpperCase();
    }

    private void unbindService(CallbackContext callbackcontext)
    {
        if (serviceConnection != null)
        {
            ctx.getApplicationContext().unbindService(serviceConnection);
            cancelNotification();
            callbackcontext.success();
            serviceConnection = null;
            return;
        } else
        {
            callbackcontext.error("no connection to service exists");
            return;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        logger.debug("execute called");
        ctx = cordova.getActivity();
        s = Action.valueOf(toAllCaps(s));
        static class _cls2
        {

            static final int $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action[];

            static 
            {
                $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action = new int[Action.values().length];
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action[Action.BIND_TO_SERVICE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action[Action.UNBIND_FROM_SERVICE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.worklight.androidgap.plugin.ForegroundBinderPlugin.Action[s.ordinal()];
        JVM INSTR tableswitch 1 2: default 78
    //                   1 60
    //                   2 68;
           goto _L1 _L2 _L3
_L2:
        bindService(jsonarray, callbackcontext);
        return true;
_L3:
        try
        {
            unbindService(callbackcontext);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return false;
_L1:
        return false;
    }

    public void onDestroy()
    {
        cancelNotification();
    }





/*
    static ServiceConnection access$202(ForegroundBinderPlugin foregroundbinderplugin, ServiceConnection serviceconnection)
    {
        foregroundbinderplugin.serviceConnection = serviceconnection;
        return serviceconnection;
    }

*/

}
