// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ad

class ae extends q
{

    final ad a;

    ae(ad ad1, Context context, IntentFilter intentfilter)
    {
        a = ad1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        b.b("orca:FriendListsLoader", (new StringBuilder()).append("friendsBroadcastReceiver : ").append(intent.getAction()).toString());
        a.t();
    }
}
