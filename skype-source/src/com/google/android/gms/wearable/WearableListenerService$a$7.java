// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, zzj

final class b
    implements Runnable
{

    final zzj a;
    final AncsNotificationParcelable b;
    final celable c;

    public final void run()
    {
    }

    celable(celable celable, zzj zzj, AncsNotificationParcelable ancsnotificationparcelable)
    {
        c = celable;
        a = zzj;
        b = ancsnotificationparcelable;
        super();
    }
}
