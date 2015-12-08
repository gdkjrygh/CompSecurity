// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            at

final class ay extends BroadcastReceiver
{

    final at a;

    ay(at at1)
    {
        a = at1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        a.b(false);
    }
}
