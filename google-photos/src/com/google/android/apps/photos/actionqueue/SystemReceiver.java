// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.actionqueue;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.photos.actionqueue:
//            InternalReceiver

public final class SystemReceiver extends BroadcastReceiver
{

    public SystemReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        InternalReceiver.a(context);
    }
}
