// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.os.Handler;
import android.widget.VideoView;
import com.facebook.ads.internal.util.o;

// Referenced classes of package com.facebook.ads.internal.view:
//            d

class a
    implements Runnable
{

    final d a;

    public void run()
    {
        if (d.a(a).getCurrentPosition() > 3000)
        {
            (new o()).execute(new String[] {
                d.b(a)
            });
        }
        d.c(a).postDelayed(this, 250L);
    }

    (d d1)
    {
        a = d1;
        super();
    }
}
