// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;

import android.app.Activity;
import com.facebook.base.activity.a;
import com.google.common.a.fi;
import java.util.Collection;

// Referenced classes of package com.facebook.debug.fps:
//            a, FPSSupport, j, k

public class b extends a
{

    final com.facebook.debug.fps.a a;

    public b(com.facebook.debug.fps.a a1)
    {
        a = a1;
        super();
    }

    public void b(Activity activity)
    {
        if (activity.isChild())
        {
            return;
        }
        com.facebook.debug.fps.a.a(a, activity);
        com.facebook.debug.fps.a.b(a, activity);
        if (com.facebook.common.annotations.a.a().b(activity.getClass(), com/facebook/debug/fps/FPSSupport))
        {
            com.facebook.debug.fps.a.a(a, fi.a((Collection)com.facebook.debug.fps.a.a(a).b()));
        } else
        {
            com.facebook.debug.fps.a.a(a, fi.d());
        }
        if (com.facebook.debug.fps.a.b(a) instanceof j)
        {
            com.facebook.debug.fps.a.a(a, ((j)com.facebook.debug.fps.a.b(a)).a(com.facebook.debug.fps.a.c(a)));
        }
        com.facebook.debug.fps.a.d(a);
    }

    public void c(Activity activity)
    {
        if (activity.isChild())
        {
            return;
        }
        if (com.facebook.debug.fps.a.e(a).contains(k.ENABLE_FLUSH_DATA_ON_PAUSE))
        {
            a.a(null);
        }
        com.facebook.debug.fps.a.a(a, null);
        com.facebook.debug.fps.a.d(a);
        com.facebook.debug.fps.a.b(a, null);
    }
}
