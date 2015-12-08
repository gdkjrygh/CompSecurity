// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.f;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            z, PackageProcessService

final class y
    implements z
{

    final PackageProcessService a;

    y(PackageProcessService packageprocessservice)
    {
        a = packageprocessservice;
        super();
    }

    public final void a()
    {
        a.startForeground(2, (new android.app.Notification.Builder(a)).setSmallIcon(0x1080081).setContentTitle(a.getText(f.title_install_offline_pack_notify)).setProgress(1, 0, true).getNotification());
    }

    public final void b()
    {
        h.a(19);
    }
}
