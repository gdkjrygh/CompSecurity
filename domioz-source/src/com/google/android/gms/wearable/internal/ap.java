// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.aa;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.o;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            i, zzal, zzao, zze

public final class ap extends com.google.android.gms.wearable.internal.i
{

    private aa a;
    private c b;
    private i c;
    private o d;
    private final IntentFilter e[];

    public final void a()
    {
        a = null;
        b = null;
        c = null;
        d = null;
    }

    public final void a(DataHolder dataholder)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        b.onDataChanged(new d(dataholder));
        dataholder.g();
        return;
        Exception exception;
        exception;
        dataholder.g();
        throw exception;
        dataholder.g();
        return;
    }

    public final void a(zzal zzal)
    {
        if (c != null)
        {
            c.onMessageReceived(zzal);
        }
    }

    public final void a(zzao zzao)
    {
        if (d != null)
        {
            d.onPeerConnected(zzao);
        }
    }

    public final void a(zze zze)
    {
    }

    public final void b(zzao zzao)
    {
        if (d != null)
        {
            d.onPeerDisconnected(zzao);
        }
    }

    public final IntentFilter[] b()
    {
        return e;
    }
}
