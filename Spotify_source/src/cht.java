// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public final class cht extends chs
{

    private Object e;
    private PopupWindow f;
    private boolean g;

    cht(Context context, ciu ciu, ckw ckw1, chq chq)
    {
        super(context, ciu, ckw1, chq);
        e = new Object();
        g = false;
    }

    private void f()
    {
        synchronized (e)
        {
            g = true;
            if ((a instanceof Activity) && ((Activity)a).isDestroyed())
            {
                f = null;
            }
            if (f != null)
            {
                if (f.isShowing())
                {
                    f.dismiss();
                }
                f = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void a(int i)
    {
        f();
        super.a(i);
    }

    public final void c()
    {
        f();
        super.c();
    }

    protected final void e()
    {
        FrameLayout framelayout;
        if (a instanceof Activity)
        {
            obj = ((Activity)a).getWindow();
        } else
        {
            obj = null;
        }
        while (obj == null || ((Window) (obj)).getDecorView() == null || ((Activity)a).isDestroyed()) 
        {
            return;
        }
        framelayout = new FrameLayout(a);
        framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        framelayout.addView(b.b(), -1, -1);
        synchronized (e)
        {
            if (!g)
            {
                break MISSING_BLOCK_LABEL_108;
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        f = new PopupWindow(framelayout, 1, 1, false);
        f.setOutsideTouchable(true);
        f.setClippingEnabled(false);
        bka.a("Displaying the 1x1 popup off the screen.");
        f.showAtLocation(((Window) (obj)).getDecorView(), 0, -1, -1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        f = null;
          goto _L1
    }
}
