// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bma;
import bpe;

// Referenced classes of package com.google.android.apps.moviemaker.app:
//            ApplicationEnabler

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()))
        {
            bpe.a(context).a.m().a();
        }
    }

    public ()
    {
    }
}
