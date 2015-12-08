// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import android.widget.FrameLayout;
import com.google.android.gms.internal.cl;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            h, f

public final class l
    implements Runnable
{

    public boolean a;
    private h b;

    l(h h1)
    {
        a = false;
        b = h1;
    }

    public final void a()
    {
        cl.a.postDelayed(this, 250L);
    }

    public final void run()
    {
        if (!a)
        {
            h h1 = b;
            if (h1.d != null)
            {
                long l1 = h1.d.getCurrentPosition();
                if (h1.h != l1 && l1 > 0L)
                {
                    if (h1.c())
                    {
                        h1.b.removeView(h1.g);
                    }
                    h1.a("timeupdate", new String[] {
                        "time", String.valueOf((float)l1 / 1000F)
                    });
                    h1.h = l1;
                }
            }
            a();
        }
    }
}
