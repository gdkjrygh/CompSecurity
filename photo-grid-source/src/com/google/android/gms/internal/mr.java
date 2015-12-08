// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            mq, ry, pb, mo

public final class mr extends mq
{

    private Object g;
    private PopupWindow h;
    private boolean i;

    mr(Context context, pb pb, ry ry1, mo mo)
    {
        super(context, pb, ry1, mo);
        g = new Object();
        i = false;
    }

    private void d()
    {
        synchronized (g)
        {
            i = true;
            if ((b instanceof Activity) && ((Activity)b).isDestroyed())
            {
                h = null;
            }
            if (h != null)
            {
                if (h.isShowing())
                {
                    h.dismiss();
                }
                h = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void a(int j)
    {
        d();
        super.a(j);
    }

    protected final void c()
    {
        FrameLayout framelayout;
        if (b instanceof Activity)
        {
            obj = ((Activity)b).getWindow();
        } else
        {
            obj = null;
        }
        while (obj == null || ((Window) (obj)).getDecorView() == null || ((Activity)b).isDestroyed()) 
        {
            return;
        }
        framelayout = new FrameLayout(b);
        framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        framelayout.addView(c.b(), -1, -1);
        synchronized (g)
        {
            if (!i)
            {
                break MISSING_BLOCK_LABEL_108;
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        h = new PopupWindow(framelayout, 1, 1, false);
        h.setOutsideTouchable(true);
        h.setClippingEnabled(false);
        zzb.zzaF("Displaying the 1x1 popup off the screen.");
        h.showAtLocation(((Window) (obj)).getDecorView(), 0, -1, -1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        h = null;
          goto _L1
    }

    public final void cancel()
    {
        d();
        super.cancel();
    }
}
