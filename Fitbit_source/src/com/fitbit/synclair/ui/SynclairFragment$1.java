// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.synclair.ui:
//            SynclairFragment

class a extends BroadcastReceiver
{

    final SynclairFragment a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            SynclairFragment.a(a);
        }
    }

    (SynclairFragment synclairfragment)
    {
        a = synclairfragment;
        super();
    }
}
