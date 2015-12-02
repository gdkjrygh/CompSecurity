// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.c;

// Referenced classes of package com.facebook.push.c2dm:
//            C2DMBroadcastReceiver, C2DMService, a

class b
    implements com.facebook.c.b
{

    private b()
    {
    }

    b(a a1)
    {
        this();
    }

    public void a(Context context, Intent intent, c c1)
    {
        com.facebook.debug.log.b.b(C2DMBroadcastReceiver.a(), (new StringBuilder()).append("received intent with action: ").append(intent.getAction()).toString());
        C2DMService.a(context, intent);
        c1.setResult(-1, null, null);
    }
}
