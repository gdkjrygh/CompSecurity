// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;

final class ang.Object
    implements gfx
{

    private erc a;

    public final void a(float f)
    {
        float f1 = a.e.R();
        float f2 = a.h.a().getStreamMaxVolume(3);
        boolean flag;
        if (Math.round(f * f2) != Math.round(f1 * f2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.k && flag)
        {
            a.m = f;
            a.e.b(a.m);
        }
    }

    (erc erc1)
    {
        a = erc1;
        super();
    }
}
