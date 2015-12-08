// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.widget.FrameLayout;

// Referenced classes of package com.yume.android.player:
//            ar, S, B

final class af
    implements Runnable
{

    private S a;
    private final ar b;
    private final FrameLayout c;

    af(S s, ar ar1, FrameLayout framelayout)
    {
        a = s;
        b = ar1;
        c = framelayout;
        super();
    }

    public final void run()
    {
        try
        {
            if (b != null)
            {
                c.removeView(b);
                b.setVisibility(4);
                b.setVisibility(0);
                a.a.b((new StringBuilder("Video Display Cleared, VView: ")).append(b).toString());
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        a.a.c("Exception clearing Video Display.");
    }
}
