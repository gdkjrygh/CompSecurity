// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.actionqueue;

import android.content.Context;
import android.content.Intent;
import ez;
import npk;
import olm;

// Referenced classes of package com.google.android.apps.photos.actionqueue:
//            OnlineActionService

public final class InternalReceiver extends ez
{

    public InternalReceiver()
    {
    }

    public static void a(Context context)
    {
        context.sendBroadcast(new Intent("com.google.android.apps.photos.actionqueue.INTERNAL_ACTION"));
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (((npk)olm.a(context, npk)).a())
        {
            a(context, new Intent(context, com/google/android/apps/photos/actionqueue/OnlineActionService));
        }
    }
}
