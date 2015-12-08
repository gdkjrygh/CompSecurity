// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;

public final class msy extends msx
    implements TimeInterpolator
{

    public msy(float f, float f1, float f2, float f3)
    {
        b = 0.0F;
        a = 0.0F;
        c = f;
        d = f1;
        e = f2;
        this.f = 1.0F;
        h = 1.0F;
        g = 1.0F;
    }

    public final float getInterpolation(float f)
    {
        return a(b(f));
    }
}
