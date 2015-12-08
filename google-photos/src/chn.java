// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import java.util.concurrent.Callable;

final class chn
    implements Callable
{

    private float a[];

    chn(float af[])
    {
        a = af;
        super();
    }

    public final Object call()
    {
        GLES20.glClearColor(a[0], a[1], a[2], a[3]);
        GLES20.glClear(16384);
        return null;
    }
}
