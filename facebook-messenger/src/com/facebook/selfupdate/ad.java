// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.app.DownloadManager;
import android.content.Context;
import com.facebook.base.broadcast.CrossFbAppBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.c.s;
import com.facebook.config.b.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.selfupdate:
//            af, o, h, ae, 
//            u, v

class ad extends d
{

    final u a;

    private ad(u u)
    {
        a = u;
        super();
    }

    ad(u u, v v)
    {
        this(u);
    }

    public af a()
    {
        return new af((Context)e().a(android/content/Context), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (a)a(com/facebook/config/b/a), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (o)a(com/facebook/selfupdate/o), (s)a(com/facebook/c/s), (h)a(com/facebook/selfupdate/h), (com.facebook.common.f.d)a(com/facebook/common/f/d), (DownloadManager)a(android/app/DownloadManager), (j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/CrossFbAppBroadcast), (ae)a(com/facebook/selfupdate/ae));
    }

    public Object b()
    {
        return a();
    }
}
