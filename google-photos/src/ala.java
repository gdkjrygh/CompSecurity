// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.SurfaceHolder;
import androidx.media.filterpacks.image.SurfaceHolderTarget;

public final class ala
    implements android.view.SurfaceHolder.Callback
{

    private SurfaceHolderTarget a;

    public ala(SurfaceHolderTarget surfaceholdertarget)
    {
        a = surfaceholdertarget;
        super();
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        SurfaceHolderTarget.a(a, surfaceholder);
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        SurfaceHolderTarget.a(a, surfaceholder);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        a.a();
    }
}
