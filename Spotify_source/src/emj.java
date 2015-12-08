// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.graphics.drawable.shapes.OvalShape;

public final class emj extends OvalShape
{

    private final int a;

    public emj(int i)
    {
        a = i;
    }

    protected final void onResize(float f, float f1)
    {
        float f2 = (float)a / 2.0F;
        f /= 2.0F;
        f1 /= 2.0F;
        rect().set(f - f2, f1 - f2, f + f2, f2 + f1);
    }
}
