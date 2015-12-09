// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import com.pandora.android.ads.s;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            YuMeVideoActivity

class a
    implements Runnable
{

    final YuMeVideoActivity a;

    public void run()
    {
        try
        {
            YuMeVideoActivity.b(a);
            YuMeVideoActivity.c(a);
            YuMeVideoActivity.e(a).a(YuMeVideoActivity.d(a));
            if (!YuMeVideoActivity.e(a).e())
            {
                a.finish();
            }
            return;
        }
        catch (Exception exception)
        {
            p.df.a.c("YuMeVideoActivity", "Exception displaying YUME ad", exception);
        }
    }

    (YuMeVideoActivity yumevideoactivity)
    {
        a = yumevideoactivity;
        super();
    }
}
