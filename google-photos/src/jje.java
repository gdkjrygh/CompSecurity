// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Surface;

final class jje
    implements Runnable
{

    private Surface a;
    private jjc b;

    jje(jjc jjc1, Surface surface)
    {
        b = jjc1;
        a = surface;
        super();
    }

    public final void run()
    {
        b.f.t();
    }
}
