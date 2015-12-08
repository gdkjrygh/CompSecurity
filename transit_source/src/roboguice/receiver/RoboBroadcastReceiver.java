// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.receiver;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.inject.Injector;
import roboguice.RoboGuice;

public abstract class RoboBroadcastReceiver extends BroadcastReceiver
{

    public RoboBroadcastReceiver()
    {
    }

    protected void handleReceive(Context context, Intent intent)
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        RoboGuice.getBaseApplicationInjector((Application)context.getApplicationContext()).injectMembers(this);
        handleReceive(context, intent);
    }
}
