// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video;

import android.os.Handler;
import com.facebook.ads.internal.view.video.support.a;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.ads.internal.view.video:
//            a

class a
    implements Runnable
{

    final WeakReference a;
    final com.facebook.ads.internal.view.video.a b;

    public void run()
    {
        if ((com.facebook.ads.internal.view.video.a)a.get() != null)
        {
            int i = com.facebook.ads.internal.view.video.a.a(b).getCurrentPosition();
            if (i > com.facebook.ads.internal.view.video.a.b(b))
            {
                com.facebook.ads.internal.view.video.a.a(b, i);
            }
            com.facebook.ads.internal.view.video.a.c(b).postDelayed(this, 250L);
        }
    }

    ort.a(com.facebook.ads.internal.view.video.a a1, WeakReference weakreference)
    {
        b = a1;
        a = weakreference;
        super();
    }
}
