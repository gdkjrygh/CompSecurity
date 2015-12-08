// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.worklight.common.Logger;

// Referenced classes of package com.worklight.androidgap.plugin:
//            ForegroundBinderPlugin

class val.notificationId
    implements ServiceConnection
{

    final ForegroundBinderPlugin this$0;
    final Class val$activityClass;
    final String val$explainText;
    final int val$iconId;
    final int val$notificationId;
    final String val$popupText;
    final String val$titleText;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ForegroundBinderPlugin.access$202(ForegroundBinderPlugin.this, this);
        componentname = new Notification(val$iconId, val$popupText, System.currentTimeMillis());
        PendingIntent pendingintent = PendingIntent.getActivity(ForegroundBinderPlugin.access$300(ForegroundBinderPlugin.this), 0, new Intent(ForegroundBinderPlugin.access$300(ForegroundBinderPlugin.this), val$activityClass), 0);
        componentname.setLatestEventInfo(ForegroundBinderPlugin.access$300(ForegroundBinderPlugin.this), val$titleText, val$explainText, pendingintent);
        componentname.flags = ((Notification) (componentname)).flags | 2;
        ((com.worklight.androidgap.roundBinder)ibinder).makeForeground(val$notificationId, componentname);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ForegroundBinderPlugin.access$000().debug("service disconnected");
        ForegroundBinderPlugin.access$100(ForegroundBinderPlugin.this);
    }

    nder()
    {
        this$0 = final_foregroundbinderplugin;
        val$iconId = i;
        val$popupText = s;
        val$activityClass = class1;
        val$titleText = s1;
        val$explainText = s2;
        val$notificationId = I.this;
        super();
    }
}
