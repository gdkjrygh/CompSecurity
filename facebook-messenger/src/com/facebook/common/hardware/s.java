// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.common.hardware:
//            q, t

class s extends BroadcastReceiver
{

    final q a;

    s(q q1)
    {
        a = q1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        q.a(a, Boolean.valueOf(false));
        for (context = q.a(a).keySet().iterator(); context.hasNext(); ((t)context.next()).b()) { }
    }
}
