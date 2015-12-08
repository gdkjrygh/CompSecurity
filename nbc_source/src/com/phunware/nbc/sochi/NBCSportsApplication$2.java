// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.content.SharedPreferences;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi:
//            NBCSportsApplication

class val.defaultUEH
    implements nHandler
{

    final NBCSportsApplication this$0;
    final nHandler val$defaultUEH;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        preferences.edit().putBoolean("HAS_CRASHED", true).commit();
        Timber.e(throwable, "UEH", new Object[0]);
        val$defaultUEH.uncaughtException(thread, throwable);
    }

    ()
    {
        this$0 = final_nbcsportsapplication;
        val$defaultUEH = nHandler.this;
        super();
    }
}
