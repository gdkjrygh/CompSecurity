// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.ads.internal:
//            h

private class <init> extends BroadcastReceiver
{

    final h a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(context))
        {
            h.h(a);
        } else
        if ("android.intent.action.SCREEN_ON".equals(context))
        {
            h.b(a);
            return;
        }
    }

    private ver(h h1)
    {
        a = h1;
        super();
    }

    ver(h h1, ver ver)
    {
        this(h1);
    }
}
