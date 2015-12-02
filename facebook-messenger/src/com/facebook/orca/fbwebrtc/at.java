// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.app.NotificationManager;
import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            ax, ai, aj

class at extends d
{

    final ai a;

    private at(ai ai)
    {
        a = ai;
        super();
    }

    at(ai ai, aj aj)
    {
        this(ai);
    }

    public ax a()
    {
        return new ax((Context)e().a(android/content/Context), (NotificationManager)e().a(android/app/NotificationManager));
    }

    public Object b()
    {
        return a();
    }
}
