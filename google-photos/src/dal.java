// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.SurfaceHolder;
import com.google.android.apps.moviemaker.ui.SizeLimitingSurfaceView;

public final class dal
    implements android.view.SurfaceHolder.Callback
{

    private SizeLimitingSurfaceView a;

    public dal(SizeLimitingSurfaceView sizelimitingsurfaceview)
    {
        a = sizelimitingsurfaceview;
        super();
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        SizeLimitingSurfaceView.a(a, j);
        SizeLimitingSurfaceView.b(a, k);
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }
}
