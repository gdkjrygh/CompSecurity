// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.c;

import com.facebook.analytics.cache.IsAccessPatternLoggingEnabled;
import com.facebook.analytics.periodicreporters.ClientPeriodicReporters;
import com.facebook.common.w.q;
import com.facebook.f.d;
import com.facebook.f.f;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;
import com.facebook.ui.images.b.aa;
import com.facebook.ui.images.b.e;
import com.facebook.ui.images.b.h;
import com.facebook.ui.images.b.l;
import com.facebook.ui.images.base.ImageCacheReportingPrefix;
import com.facebook.ui.images.base.IsLargeImageCacheEnabled;
import com.facebook.ui.images.d.k;
import com.facebook.ui.media.b.c;

// Referenced classes of package com.facebook.ui.images.c:
//            i, d, f, e, 
//            c, j, k, h, 
//            g

public class a extends b
{

    public a()
    {
    }

    protected void a()
    {
        f(com/facebook/cache/b);
        f(com/facebook/ui/media/b/c);
        a(com/facebook/ui/images/cache/a).a(new i(this, null)).a();
        a(com/facebook/ui/images/b/c).a(new com.facebook.ui.images.c.d(this, null)).a();
        a(com/facebook/ui/images/b/h).a(new com.facebook.ui.images.c.f(this, null)).a();
        a(com/facebook/ui/images/b/e).a(new com.facebook.ui.images.c.e(this, null)).a();
        a(com/facebook/ui/images/b/l).b(com/facebook/ui/images/b/a);
        a(com/facebook/ui/images/b/a).a(new com.facebook.ui.images.c.c(this, null)).a();
        a(com/facebook/ui/images/b/aa).a(new j(this, null));
        a(com/facebook/a/g).a(new com.facebook.ui.images.c.k(this, null)).a();
        a(com/facebook/ui/images/a/a).a(new com.facebook.ui.images.c.h(this, null)).a();
        a(com/facebook/ui/images/d/k).a(new com.facebook.ui.images.c.g(this, null));
        c(com/facebook/ui/media/cache/g).a(com/facebook/ui/images/cache/a);
        a(com/facebook/analytics/periodicreporters/l, com/facebook/analytics/periodicreporters/ClientPeriodicReporters).a(com/facebook/ui/images/cache/a);
        c(com/facebook/auth/f/b).a(com/facebook/ui/images/cache/a);
        b(java/lang/Boolean).a(com/facebook/ui/images/base/IsLargeImageCacheEnabled).a(Boolean.valueOf(false));
        b(java/lang/String).a(com/facebook/ui/images/base/ImageCacheReportingPrefix).a("default");
        c(com/facebook/f/f).a(com/facebook/analytics/cache/b);
        a(com/facebook/common/w/q).a(com/facebook/analytics/cache/IsAccessPatternLoggingEnabled).a(new d("fb4a_enable_media_cache_logging"));
    }
}
