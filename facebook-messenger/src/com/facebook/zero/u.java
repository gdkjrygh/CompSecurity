// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import android.content.Context;
import com.facebook.common.e.h;
import com.facebook.common.w.q;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.zero.annotations.IsUserCurrentlyZeroRated;
import com.facebook.zero.annotations.IsZeroRatingFeatureEnabled;
import com.facebook.zero.d.a;
import com.facebook.zero.rewrite.e;
import com.facebook.zero.ui.p;

// Referenced classes of package com.facebook.zero:
//            c, d

class u extends d
{

    final c a;

    private u(c c)
    {
        a = c;
        super();
    }

    u(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public a a()
    {
        return new a((Context)e().a(android/content/Context), (com.facebook.common.time.a)a(com/facebook/common/time/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.zero.server.d)a(com/facebook/zero/server/d), (k)a(com/facebook/fbservice/ops/k), (com.facebook.base.broadcast.a)a(com/facebook/base/broadcast/a), (h)a(com/facebook/common/e/h), (com.facebook.zero.b.d)a(com/facebook/zero/b/d), (com.facebook.zero.ui.h)a(com/facebook/zero/ui/h), (p)a(com/facebook/zero/ui/p), (e)a(com/facebook/zero/rewrite/e), b(java/lang/Boolean, com/facebook/zero/annotations/IsZeroRatingFeatureEnabled), b(com/facebook/common/w/q, com/facebook/zero/annotations/IsUserCurrentlyZeroRated));
    }

    public Object b()
    {
        return a();
    }
}
