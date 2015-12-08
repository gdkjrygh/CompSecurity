// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.SharedPreferences;
import com.google.android.libraries.translate.c.d;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.k;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            PhraseSyncService, t, k

final class a extends k
{

    final PhraseSyncService a;

    a(PhraseSyncService phrasesyncservice)
    {
        a = phrasesyncservice;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = PhraseSyncService.a(a);
        long l = ((t) (aobj)).a(d.c().a(((t) (aobj)).a), ((t) (aobj)).b.c.getLong("last_sync_time", 0L));
        if (l > 0L)
        {
            ((t) (aobj)).b.c.edit().putLong("last_sync_time", l).putLong("last_sync_client_time", System.currentTimeMillis()).commit();
        }
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        h.a(5);
        a.stopSelf();
    }
}
