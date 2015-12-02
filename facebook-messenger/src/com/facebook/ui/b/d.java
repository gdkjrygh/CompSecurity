// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.b;

import android.os.Handler;
import android.view.Choreographer;

// Referenced classes of package com.facebook.ui.b:
//            e

public class d
{

    private static boolean a;
    private Handler b;
    private Choreographer c;

    public d()
    {
        if (a)
        {
            c = a();
            return;
        } else
        {
            b = new Handler();
            return;
        }
    }

    private Choreographer a()
    {
        return Choreographer.getInstance();
    }

    private void a(android.view.Choreographer.FrameCallback framecallback)
    {
        c.postFrameCallback(framecallback);
    }

    private void b(android.view.Choreographer.FrameCallback framecallback)
    {
        c.removeFrameCallback(framecallback);
    }

    public void a(e e1)
    {
        if (a)
        {
            a(e1.a());
            return;
        } else
        {
            b.postDelayed(e1.b(), 0L);
            return;
        }
    }

    public void b(e e1)
    {
        if (a)
        {
            b(e1.a());
            return;
        } else
        {
            b.removeCallbacks(e1.b());
            return;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
