// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.AudioManager;
import com.facebook.analytics.av;
import com.facebook.common.executors.a;
import com.facebook.inject.d;
import com.facebook.orca.j.c;

// Referenced classes of package com.facebook.orca.d:
//            af, s, t

class z extends d
{

    final s a;

    private z(s s)
    {
        a = s;
        super();
    }

    z(s s, t t)
    {
        this(s);
    }

    public af a()
    {
        return new af((AudioManager)a(android/media/AudioManager), (a)a(com/facebook/common/executors/a), (c)a(com/facebook/orca/j/c), (av)a(com/facebook/analytics/av), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
