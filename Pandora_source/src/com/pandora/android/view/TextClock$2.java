// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.pandora.android.view:
//            TextClock

class it> extends BroadcastReceiver
{

    final TextClock a;

    public void onReceive(Context context, Intent intent)
    {
        a.a(TextClock.a(a));
        TextClock.c(a);
        TextClock.b(a);
    }

    (TextClock textclock)
    {
        a = textclock;
        super();
    }
}
