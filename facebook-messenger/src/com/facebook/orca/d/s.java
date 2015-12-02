// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import com.facebook.analytics.cache.IsAccessPatternLoggingEnabled;
import com.facebook.analytics.periodicreporters.ClientPeriodicReporters;
import com.facebook.analytics.periodicreporters.l;
import com.facebook.auth.f.b;
import com.facebook.common.w.q;
import com.facebook.f.d;
import com.facebook.f.f;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.IsAudioPlayerEnabled;
import com.facebook.orca.annotations.IsAudioRecorderEnabled;

// Referenced classes of package com.facebook.orca.d:
//            a, u, r, x, 
//            az, ac, be, bd, 
//            ay, ab, aw, aa, 
//            ae, y, af, z, 
//            e, v, m, w, 
//            bf, ad

public class s extends c
{

    public s()
    {
    }

    protected void a()
    {
        a(com/facebook/orca/d/a).a(new u(this, null)).a();
        a(com/facebook/orca/d/r).a(new x(this, null));
        a(com/facebook/orca/d/az).a(new ac(this, null)).a();
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsAudioRecorderEnabled).c(com/facebook/orca/d/be);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsAudioPlayerEnabled).c(com/facebook/orca/d/bd);
        a(com/facebook/orca/d/ay).a(new ab(this, null)).a();
        a(com/facebook/orca/d/aw).a(new aa(this, null));
        a(com/facebook/orca/d/ae).a(new y(this, null));
        a(com/facebook/orca/d/af).a(new z(this, null));
        a(com/facebook/orca/d/e).a(new v(this, null));
        a(com/facebook/orca/d/m).a(new w(this, null)).a();
        a(com/facebook/orca/d/bf).a(new ad(this, null)).a();
        c(com/facebook/ui/media/cache/g).a(com/facebook/orca/d/a);
        a(com/facebook/analytics/periodicreporters/l, com/facebook/analytics/periodicreporters/ClientPeriodicReporters).a(com/facebook/orca/d/a);
        c(com/facebook/auth/f/b).a(com/facebook/orca/d/a);
        c(com/facebook/f/f).a(com/facebook/analytics/cache/b);
        a(com/facebook/common/w/q).a(com/facebook/analytics/cache/IsAccessPatternLoggingEnabled).a(new d("fb4a_enable_media_cache_logging"));
    }
}
