// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class cyv
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, Runnable
{

    volatile boolean a;
    final Handler b;
    private boolean c;
    private final WeakReference d;
    private final czv e;

    public cyv(View view, czv czv1, Handler handler)
    {
        e = czv1;
        d = new WeakReference(view);
        b = handler;
        c = true;
        a = false;
        view = view.getViewTreeObserver();
        if (view.isAlive())
        {
            view.addOnGlobalLayoutListener(this);
        }
        run();
    }

    public final void onGlobalLayout()
    {
        run();
    }

    public final void run()
    {
        if (!c)
        {
            return;
        }
        Object obj = (View)d.get();
        if (obj == null || a)
        {
            if (c)
            {
                obj = (View)d.get();
                if (obj != null)
                {
                    obj = ((View) (obj)).getViewTreeObserver();
                    if (((ViewTreeObserver) (obj)).isAlive())
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
                e.a();
            }
            c = false;
            return;
        } else
        {
            e.b(((View) (obj)));
            b.removeCallbacks(this);
            b.postDelayed(this, 1000L);
            return;
        }
    }
}
