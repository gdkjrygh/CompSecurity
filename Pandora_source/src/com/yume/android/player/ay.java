// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.yume.android.player:
//            ar

final class ay
    implements android.view.SurfaceHolder.Callback
{

    private ar a;

    ay(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        boolean flag = true;
        a.g = j;
        a.h = k;
        if (a.b == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (a.e == j && a.f == k)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (a.d == null || i == 0 || j == 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (a.n != 0)
        {
            a.seekTo(a.n);
        }
        a.start();
        return;
        surfaceholder;
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        try
        {
            a.c = surfaceholder;
            if (a.d != null && a.a == 6 && a.b == 7)
            {
                a.d.setDisplay(a.c);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            return;
        }
        a.b();
        return;
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        a.c = null;
        if (a.a != 6)
        {
            a.a(true);
        }
    }
}
