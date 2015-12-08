// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.service;

import com.spotify.mobile.android.spotlets.running.model.RunningPlayerContextPage;
import com.spotify.mobile.android.util.logging.Logger;
import fep;
import feq;
import hfb;

// Referenced classes of package com.spotify.mobile.android.spotlets.running.service:
//            RunningService

public final class b
    implements hfb
{

    private String a;
    private feq b;
    private RunningService c;

    public final void onCompleted()
    {
        String s = a;
    }

    public final void onError(Throwable throwable)
    {
        Logger.b(throwable, "Error while loading tracklists %s", new Object[] {
            a
        });
        b.b();
    }

    public final void onNext(Object obj)
    {
        obj = (RunningPlayerContextPage)obj;
        RunningService.a(c).a(a, ((RunningPlayerContextPage) (obj)), b);
    }

    public tPage(RunningService runningservice, String s, feq feq1)
    {
        c = runningservice;
        a = s;
        b = feq1;
        super();
    }
}
