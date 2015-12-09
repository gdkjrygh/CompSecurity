// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import an;
import android.os.Bundle;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import da;
import dwz;
import java.util.Collection;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            FeatureService

final class a
    implements an
{

    private FeatureService a;

    public final da a(Bundle bundle)
    {
        return new dwz(a);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        FeatureService.d(a).add(aderSource.d);
        if (FeatureService.e(a))
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
