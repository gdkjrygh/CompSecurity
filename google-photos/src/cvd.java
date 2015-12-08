// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.SurfaceHolder;
import java.util.Iterator;
import java.util.Set;

final class cvd
    implements android.view.SurfaceHolder.Callback
{

    private cvc a;

    cvd(cvc cvc1)
    {
        a = cvc1;
        super();
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        a.a(surfaceholder.getSurface(), j, k);
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        cvc cvc1 = a;
        synchronized (((cuv) (cvc1)).a)
        {
            cvc1.c = null;
            cvc1.d = true;
            cvc1.e = true;
        }
        for (surfaceholder = ((cuv) (cvc1)).b.iterator(); surfaceholder.hasNext(); ((cia)surfaceholder.next()).a()) { }
        break MISSING_BLOCK_LABEL_70;
        exception;
        surfaceholder;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
