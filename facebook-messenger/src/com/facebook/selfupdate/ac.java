// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.app.DownloadManager;
import android.content.Context;
import com.facebook.common.f.f;
import com.facebook.config.b.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.selfupdate:
//            q, o, af, g, 
//            i, u, v

class ac extends d
{

    final u a;

    private ac(u u)
    {
        a = u;
        super();
    }

    ac(u u, v v)
    {
        this(u);
    }

    public q a()
    {
        return new q((com.facebook.base.a.d)a(com/facebook/base/a/d), (a)a(com/facebook/config/b/a), (Context)a(android/content/Context), (com.facebook.common.time.a)a(com/facebook/common/time/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (o)a(com/facebook/selfupdate/o), (DownloadManager)a(android/app/DownloadManager), (af)a(com/facebook/selfupdate/af), (g)a(com/facebook/selfupdate/g), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (i)a(com/facebook/selfupdate/i), (com.facebook.common.f.d)a(com/facebook/common/f/d), (f)a(com/facebook/common/f/f));
    }

    public Object b()
    {
        return a();
    }
}
