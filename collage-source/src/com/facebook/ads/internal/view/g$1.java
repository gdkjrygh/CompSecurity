// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.os.Handler;
import android.widget.VideoView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.ads.internal.view:
//            g

class a
    implements Runnable
{

    final WeakReference a;
    final g b;

    public void run()
    {
        if ((g)a.get() != null)
        {
            int i = g.a(b).getCurrentPosition();
            if (i > g.b(b))
            {
                g.a(b, i);
            }
            g.c(b).postDelayed(this, 250L);
        }
    }

    (g g1, WeakReference weakreference)
    {
        b = g1;
        a = weakreference;
        super();
    }
}
