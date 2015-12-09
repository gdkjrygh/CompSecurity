// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.os.Handler;
import com.spotify.mobile.android.service.session.SessionState;
import eda;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            AnnotateService

public final class a
    implements eda
{

    private AnnotateService a;

    public final void a(SessionState sessionstate)
    {
        boolean flag;
        flag = AnnotateService.a(a);
        AnnotateService.a(a, sessionstate.j);
        boolean flag1 = sessionstate.j;
        AnnotateService.b(a).removeMessages(0);
        if (!AnnotateService.a(a) || flag) goto _L2; else goto _L1
_L1:
        AnnotateService.b(a).sendEmptyMessageDelayed(0, 15000L);
        AnnotateService.c(a).removeMessages(0);
_L4:
        AnnotateService.a(a, sessionstate.b);
        if (!AnnotateService.d(a))
        {
            AnnotateService.e(a);
            AnnotateService.f(a);
            a.b();
        }
        if (sessionstate.g || !sessionstate.e)
        {
            a.stopSelf();
        }
        return;
_L2:
        if (!AnnotateService.a(a) && flag)
        {
            AnnotateService.c(a).sendEmptyMessageDelayed(0, 0x2bf20L);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (AnnotateService annotateservice)
    {
        a = annotateservice;
        super();
    }
}
