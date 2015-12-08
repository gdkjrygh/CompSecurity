// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;

public class DialogMessageReceiver extends BroadcastReceiver
{
    public static interface Callback
    {

        public abstract void handleDialogButton(String s, String s1);

        public abstract void handleDialogCancel(String s);

        public abstract void handleUserRatingChange(String s, float f);
    }


    private static final String TAG = "DialogMessageReceiver";
    private final Callback callback;

    public DialogMessageReceiver(Callback callback1)
    {
        callback = callback1;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("DialogMessageReceiver", 2))
        {
            Log.v("DialogMessageReceiver", (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        context = intent.getAction();
        if ("ui_rating".equals(context))
        {
            callback.handleUserRatingChange(intent.getExtras().getString("videoId"), intent.getExtras().getFloat("rating"));
        } else
        {
            if ("nflx_button_selected".equals(context))
            {
                callback.handleDialogButton(intent.getExtras().getString("nflx_dialog_id"), intent.getExtras().getString("nflx_action_selected"));
                return;
            }
            if ("nflx_button_canceled".equals(context))
            {
                callback.handleDialogCancel(intent.getExtras().getString("nflx_dialog_id"));
                return;
            }
            if (Log.isLoggable("DialogMessageReceiver", 3))
            {
                Log.d("DialogMessageReceiver", (new StringBuilder()).append("We do not support action ").append(context).toString());
                return;
            }
        }
    }
}
