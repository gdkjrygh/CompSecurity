// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.SurfaceHolder;
import com.google.android.apps.moviemaker.ui.SizeLimitingSurfaceView;

public class cvc extends cuv
{

    private final SizeLimitingSurfaceView f;
    private final android.view.SurfaceHolder.Callback g = new cvd(this);

    public cvc(chq chq, SizeLimitingSurfaceView sizelimitingsurfaceview)
    {
        super(chq);
        f = (SizeLimitingSurfaceView)b.a(sizelimitingsurfaceview, "surfaceView", null);
        f.getHolder().addCallback(g);
        if (f.getHolder().getSurface() != null)
        {
            a(f.getHolder(), f.b, f.c);
        }
    }

    public final void a()
    {
        f.getHolder().removeCallback(g);
        super.a();
    }

    static 
    {
        cvc.getSimpleName();
    }
}
