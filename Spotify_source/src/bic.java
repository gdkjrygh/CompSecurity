// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.FrameLayout;

public final class bic
    implements Runnable
{

    public boolean a;
    private bhw b;

    bic(bhw bhw1)
    {
        a = false;
        b = bhw1;
    }

    public final void a()
    {
        cjj.a.postDelayed(this, 250L);
    }

    public final void run()
    {
        if (!a)
        {
            bhw bhw1 = b;
            if (bhw1.c != null)
            {
                long l = bhw1.c.f();
                if (bhw1.e != l && l > 0L)
                {
                    if (bhw1.h())
                    {
                        bhw1.a.removeView(bhw1.d);
                    }
                    bhw1.a("timeupdate", new String[] {
                        "time", String.valueOf((float)l / 1000F)
                    });
                    bhw1.e = l;
                }
            }
            a();
        }
    }
}
