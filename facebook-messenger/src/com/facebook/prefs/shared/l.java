// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.prefs.shared:
//            j

class l extends BroadcastReceiver
{

    final j a;

    l(j j1)
    {
        a = j1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringArrayListExtra("prefs");
        b.b(j.f(), "Received preference change broadcast for keys: %s", new Object[] {
            context
        });
        j.a(a, context);
    }
}
