// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.os.Handler;
import android.widget.VideoView;
import com.facebook.ads.internal.util.o;

// Referenced classes of package com.facebook.ads.internal.view:
//            g

class a
    implements Runnable
{

    final g a;

    public void run()
    {
        if (g.a(a).getCurrentPosition() > 3000)
        {
            (new o()).execute(new String[] {
                a.getVideoPlayReportURI()
            });
            return;
        } else
        {
            g.d(a).postDelayed(this, 250L);
            return;
        }
    }

    (g g1)
    {
        a = g1;
        super();
    }
}
