// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.yume.android.player:
//            S, B

final class ae
    implements Runnable
{

    private S a;
    private final RelativeLayout b;
    private final FrameLayout c;

    ae(S s, RelativeLayout relativelayout, FrameLayout framelayout)
    {
        a = s;
        b = relativelayout;
        c = framelayout;
        super();
    }

    public final void run()
    {
        try
        {
            if (b != null)
            {
                b.removeAllViews();
                if (c != null)
                {
                    c.removeView(b);
                }
                a.a.b("ImageAd Display Cleared.");
            }
            return;
        }
        catch (Exception exception)
        {
            a.a.c("Exception clearing ImageAd Display.");
            exception.printStackTrace();
            return;
        }
    }
}
