// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import com.skype.android.video.ControlUnit;

final class e
    implements android.view.SurfaceHolder.Callback
{

    private int a;
    private int b;
    private int c;
    private int d;

    e(View view, int i)
    {
        a = 0;
        b = i;
        if (i == 2)
        {
            c = ControlUnit.registerView(view, 0, i, 0);
        }
        d = 0;
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (a == 0)
        {
            ControlUnit.sendControlCommand(4, d, j, k);
            return;
        } else
        {
            ControlUnit.sendControlCommand(3, d, j, k);
            return;
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (b != 2)
        {
            if (b != 3)
            {
                surfaceholder = surfaceholder.getSurface();
            }
            c = ControlUnit.registerView(surfaceholder, d, b, a);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        ControlUnit.unregisterView(c, d, b, a);
        surfaceholder.getSurface().release();
    }
}
