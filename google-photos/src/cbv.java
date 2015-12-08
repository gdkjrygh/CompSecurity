// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;

final class cbv extends cbi
{

    cbv(cbj cbj)
    {
        super(cbj);
    }

    public final float u(cba cba)
    {
        float f = super.a.u(cba);
        return f + (1.0F - f) * b.getInterpolation(A(cba));
    }
}
