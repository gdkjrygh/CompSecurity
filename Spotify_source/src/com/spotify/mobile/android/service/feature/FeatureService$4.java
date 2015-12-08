// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import com.spotify.mobile.android.devtools.MethodTraceScope;
import dww;
import java.util.Collection;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            FeatureService

final class a
    implements dww
{

    private FeatureService a;

    public final void a(boolean flag)
    {
        boolean flag1 = FeatureService.d(a).add(aderSource.c);
        if (FeatureService.e(a) && flag1 | flag)
        {
            FeatureService.f(a);
            FeatureService.g(a);
            MethodTraceScope.g.b();
        }
    }

    aderSource(FeatureService featureservice)
    {
        a = featureservice;
        super();
    }
}
