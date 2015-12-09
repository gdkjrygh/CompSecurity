// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.android.slyce.report.c:
//            an

class l
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, Runnable
{

    private volatile boolean a;
    private boolean b;
    private final WeakReference c;
    private final an d;
    private final Handler e;

    public l(View view, an an1, Handler handler)
    {
        d = an1;
        c = new WeakReference(view);
        e = handler;
        b = true;
        a = false;
        view = view.getViewTreeObserver();
        if (view.isAlive())
        {
            view.addOnGlobalLayoutListener(this);
        }
        run();
    }

    private void b()
    {
        if (b)
        {
            Object obj = (View)c.get();
            if (obj != null)
            {
                obj = ((View) (obj)).getViewTreeObserver();
                if (((ViewTreeObserver) (obj)).isAlive())
                {
                    ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                }
            }
            d.a();
        }
        b = false;
    }

    public void a()
    {
        a = true;
        e.post(this);
    }

    public void onGlobalLayout()
    {
        run();
    }

    public void run()
    {
        if (!b)
        {
            return;
        }
        View view = (View)c.get();
        if (view == null || a)
        {
            b();
            return;
        } else
        {
            d.b(view);
            e.removeCallbacks(this);
            e.postDelayed(this, 1000L);
            return;
        }
    }
}
