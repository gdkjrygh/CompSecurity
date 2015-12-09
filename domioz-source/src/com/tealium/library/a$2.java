// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

// Referenced classes of package com.tealium.library:
//            Tealium

final class tReceiver extends BroadcastReceiver
{

    private SharedPreferences a;

    public final void onReceive(Context context, Intent intent)
    {
        a.edit().putBoolean("is_disabled", true).commit();
        Tealium.disable();
    }

    eferences(SharedPreferences sharedpreferences)
    {
        a = sharedpreferences;
        super();
    }
}
