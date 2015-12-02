// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.support.v4.a.e;
import com.facebook.common.e.h;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.l.b;
import com.facebook.l.c;
import com.facebook.orca.annotations.IsMusicPresenceEnabled;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bo extends d
{

    final com.facebook.orca.app.h a;

    private bo(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    bo(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public c a()
    {
        return new c((Context)e().a(android/content/Context), (a)a(com/facebook/common/time/a), (e)a(android/support/v4/a/e), (AudioManager)a(android/media/AudioManager), (b)a(com/facebook/l/b), b(java/lang/Boolean, com/facebook/orca/annotations/IsMusicPresenceEnabled), (h)a(com/facebook/common/e/h), (Handler)a(android/os/Handler, com/facebook/common/executors/ForUiThread));
    }

    public Object b()
    {
        return a();
    }
}
