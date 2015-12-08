// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.view.NoInternetWarningBar;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            m

class a extends BroadcastReceiver
{

    final m a;

    public void onReceive(Context context, Intent intent)
    {
        if (m.a(a) == null)
        {
            return;
        }
        if (k.b(context))
        {
            m.a(a).setVisibility(8);
            return;
        } else
        {
            m.a(a).setVisibility(0);
            return;
        }
    }

    ingBar(m m1)
    {
        a = m1;
        super();
    }
}
