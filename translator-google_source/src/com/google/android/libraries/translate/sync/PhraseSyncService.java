// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.libraries.translate.e.h;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            t, a

public class PhraseSyncService extends Service
{

    private static boolean a = false;
    private t b;

    public PhraseSyncService()
    {
    }

    static t a(PhraseSyncService phrasesyncservice)
    {
        return phrasesyncservice.b;
    }

    public static boolean a()
    {
        return a;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        b = new t(getApplicationContext());
        a = true;
        h.a(4);
        (new a(this)).a(new Void[0]);
    }

    public void onDestroy()
    {
        a = false;
        super.onDestroy();
    }

}
