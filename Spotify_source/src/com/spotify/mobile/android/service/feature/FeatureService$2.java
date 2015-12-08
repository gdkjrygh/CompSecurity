// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import com.spotify.mobile.android.service.session.SessionState;
import eda;
import geh;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            FeatureService

final class a
    implements eda
{

    private FeatureService a;

    public final void a(SessionState sessionstate)
    {
        geh.b();
        boolean flag = FeatureService.a(a);
        FeatureService.a(a, sessionstate.e);
        if (flag && !FeatureService.a(a))
        {
            FeatureService.b(a);
        } else
        if (!flag && FeatureService.a(a))
        {
            FeatureService.c(a);
            return;
        }
    }

    A(FeatureService featureservice)
    {
        a = featureservice;
        super();
    }
}
