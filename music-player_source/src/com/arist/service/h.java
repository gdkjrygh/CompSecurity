// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import com.arist.activity.MyApplication;

// Referenced classes of package com.arist.service:
//            MusicPlayService, o

final class h
    implements Runnable
{

    final MusicPlayService a;

    h(MusicPlayService musicplayservice)
    {
        a = musicplayservice;
        super();
    }

    public final void run()
    {
        a.startForeground(0x759bc71, MusicPlayService.c(a).a(MyApplication.g(), MyApplication.d()));
    }
}
