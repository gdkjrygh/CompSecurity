// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.widget.MediaController;

// Referenced classes of package com.jirbo.adcolony:
//            e

class 
    implements android.view.aceHolder.Callback
{

    final e a;

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        boolean flag = true;
        a.u = j;
        a.v = k;
        if (a.p == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (a.s == j && a.t == k)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (a.r != null && i != 0 && j != 0)
        {
            if (a.B != 0)
            {
                a.seekTo(a.B);
            }
            a.start();
            if (a.w != null)
            {
                a.w.show();
            }
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        a.q = surfaceholder;
        if (a.r != null && a.o == 6 && a.p == 7)
        {
            a.r.setDisplay(a.q);
            a.d();
            return;
        } else
        {
            e.a(a);
            return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        a.q = null;
        if (a.w != null)
        {
            a.w.hide();
        }
        if (a.o != 6)
        {
            e.a(a, true);
        }
    }

    der(e e1)
    {
        a = e1;
        super();
    }
}
