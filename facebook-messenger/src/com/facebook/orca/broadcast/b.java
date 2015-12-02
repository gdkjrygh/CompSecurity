// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import android.content.Intent;
import com.facebook.base.fragment.c;

// Referenced classes of package com.facebook.orca.broadcast:
//            BroadcastActivity

class b
    implements c
{

    final BroadcastActivity a;

    b(BroadcastActivity broadcastactivity)
    {
        a = broadcastactivity;
        super();
    }

    public void a(com.facebook.base.fragment.b b1, Intent intent)
    {
        if (intent == null)
        {
            a.onBackPressed();
        }
    }
}
