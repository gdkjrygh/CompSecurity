// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            fd, hi, gb

public final class fe extends fd
{

    private Object i;
    private PopupWindow j;
    private boolean k;

    fe(Context context, gb.a a1, hi hi1, fc.a a2)
    {
        super(context, a1, hi1, a2);
        i = new Object();
        k = false;
    }

    private void d()
    {
        synchronized (i)
        {
            k = true;
            if ((c instanceof Activity) && ((Activity)c).isDestroyed())
            {
                j = null;
            }
            if (j != null)
            {
                if (j.isShowing())
                {
                    j.dismiss();
                }
                j = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void a(gb gb)
    {
        d();
        super.a(gb);
    }

    public final void b()
    {
        d();
        super.b();
    }

    protected final void c()
    {
        FrameLayout framelayout;
        if (c instanceof Activity)
        {
            obj = ((Activity)c).getWindow();
        } else
        {
            obj = null;
        }
        while (obj == null || ((Window) (obj)).getDecorView() == null || ((Activity)c).isDestroyed()) 
        {
            return;
        }
        framelayout = new FrameLayout(c);
        framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        framelayout.addView(d.a(), -1, -1);
        synchronized (i)
        {
            if (!k)
            {
                break MISSING_BLOCK_LABEL_108;
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        j = new PopupWindow(framelayout, 1, 1, false);
        j.setOutsideTouchable(true);
        j.setClippingEnabled(false);
        com.google.android.gms.ads.internal.util.client.b.a(3);
        j.showAtLocation(((Window) (obj)).getDecorView(), 0, -1, -1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        j = null;
          goto _L1
    }
}
