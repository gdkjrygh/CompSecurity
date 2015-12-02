// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            h

class j extends BroadcastReceiver
{

    final h a;

    j(h h1)
    {
        a = h1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!a.a())
        {
            h.a(a);
        }
    }
}
