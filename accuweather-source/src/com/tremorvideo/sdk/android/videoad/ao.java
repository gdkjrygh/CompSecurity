// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            al, a

class ao extends BroadcastReceiver
{

    final al a;

    ao(al al1)
    {
        a = al1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (a.b)
        {
            al.a(a).h();
        }
    }
}
