// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.BroadcastReceiver;
import android.content.Context;

// Referenced classes of package com.skype.android:
//            DaggerSkypeBroadcastReceiverComponent, SkypeBroadcastReceiverComponent

public abstract class SkypeBroadcastReceiver extends BroadcastReceiver
{

    private SkypeBroadcastReceiverComponent component;

    public SkypeBroadcastReceiver()
    {
    }

    protected SkypeBroadcastReceiverComponent getComponent(Context context)
    {
        if (component == null)
        {
            context = (SkypeApplicationComponent.ComponentProvider)context.getApplicationContext();
            component = DaggerSkypeBroadcastReceiverComponent.builder().a(context.a()).a();
        }
        return component;
    }
}
