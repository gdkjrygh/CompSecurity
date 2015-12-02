// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.c;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.analytics.cache.IsAccessPatternLoggingEnabled;
import com.facebook.analytics.cache.h;
import com.facebook.cache.j;
import com.facebook.common.w.q;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.ui.images.base.ImageCacheReportingPrefix;
import com.facebook.ui.images.base.IsLargeImageCacheEnabled;
import com.facebook.ui.images.cache.a;

// Referenced classes of package com.facebook.ui.images.c:
//            a, b

class i extends d
{

    final com.facebook.ui.images.c.a a;

    private i(com.facebook.ui.images.c.a a1)
    {
        a = a1;
        super();
    }

    i(com.facebook.ui.images.c.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        ActivityManager activitymanager = (ActivityManager)e().a(android/app/ActivityManager);
        return new a((Context)e().a(android/content/Context), (com.facebook.ui.media.attachments.d)a(com/facebook/ui/media/attachments/d), (com.facebook.ui.images.a.a)a(com/facebook/ui/images/a/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.common.time.a)a(com/facebook/common/time/a), (com.facebook.ui.c.d)a(com/facebook/ui/c/d), (h)a(com/facebook/analytics/cache/h), (com.facebook.analytics.j.a)a(com/facebook/analytics/j/a), (com.facebook.common.e.h)a(com/facebook/common/e/h), activitymanager.getMemoryClass(), ((Boolean)a(java/lang/Boolean, com/facebook/ui/images/base/IsLargeImageCacheEnabled)).booleanValue(), (String)a(java/lang/String, com/facebook/ui/images/base/ImageCacheReportingPrefix), (av)a(com/facebook/analytics/av), (j)a(com/facebook/cache/j), b(com/facebook/common/w/q, com/facebook/analytics/cache/IsAccessPatternLoggingEnabled));
    }

    public Object b()
    {
        return a();
    }
}
