// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video;

import android.os.Handler;
import com.facebook.ads.internal.util.o;
import com.facebook.ads.internal.view.video.support.a;

// Referenced classes of package com.facebook.ads.internal.view.video:
//            a

class a
    implements Runnable
{

    final com.facebook.ads.internal.view.video.a a;

    public void run()
    {
        if (com.facebook.ads.internal.view.video.a.a(a).getCurrentPosition() > 3000)
        {
            (new o()).execute(new String[] {
                a.getVideoPlayReportURI()
            });
            return;
        } else
        {
            com.facebook.ads.internal.view.video.a.d(a).postDelayed(this, 250L);
            return;
        }
    }

    ort.a(com.facebook.ads.internal.view.video.a a1)
    {
        a = a1;
        super();
    }
}
