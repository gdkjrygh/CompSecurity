// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class HE extends HG
{

    private final GL b;

    public HE(GL gl)
    {
        b = gl;
    }

    public final String a()
    {
        return "Time";
    }

    public final View d()
    {
        return b.b;
    }

    public final void e()
    {
        GL gl = b;
        gl.a.a(0x7f040049, gl.b);
        gl.b = null;
    }
}
