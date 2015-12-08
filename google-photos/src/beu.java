// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLSurfaceView;
import com.google.android.apps.consumerphotoeditor.core.Renderer;

final class beu
    implements Runnable
{

    private bem a;

    beu(bem bem1)
    {
        a = bem1;
        super();
    }

    public final void run()
    {
        bem.n(a).b.loadPopImageTexture();
        bem.c(a).requestRender();
    }
}
