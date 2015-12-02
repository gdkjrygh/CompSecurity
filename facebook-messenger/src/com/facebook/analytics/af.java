// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.Context;
import com.facebook.analytics.periodicreporters.m;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ak, f, g

class af extends d
{

    final f a;

    private af(f f)
    {
        a = f;
        super();
    }

    af(f f, g g)
    {
        this(f);
    }

    public m a()
    {
        return new m((Context)e().a(android/content/Context), (ak)a(com/facebook/analytics/ak), (com.facebook.base.a.d)a(com/facebook/base/a/d), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.common.process.d)a(com/facebook/common/process/d));
    }

    public Object b()
    {
        return a();
    }
}
