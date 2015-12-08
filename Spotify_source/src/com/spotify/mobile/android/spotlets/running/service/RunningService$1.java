// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.service;

import com.spotify.mobile.android.spotlets.running.model.RunningPlayerContextPage;
import com.spotify.mobile.android.util.logging.Logger;
import fep;
import hfb;

// Referenced classes of package com.spotify.mobile.android.spotlets.running.service:
//            RunningService

final class a
    implements hfb
{

    private String a;
    private RunningService b;

    public final void onCompleted()
    {
        String s = a;
    }

    public final void onError(Throwable throwable)
    {
        Logger.b(throwable, "Error while loading tracklists for %s", new Object[] {
            a
        });
    }

    public final void onNext(Object obj)
    {
        obj = (RunningPlayerContextPage)obj;
        RunningService.a(b).a(a, ((RunningPlayerContextPage) (obj)), null);
    }

    tPage(RunningService runningservice, String s)
    {
        b = runningservice;
        a = s;
        super();
    }
}
