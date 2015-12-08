// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Paint;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.util.Random;

public final class afF extends Animation
{

    public float a;
    public final Paint b;
    private float c;
    private float d;

    public final void a(float f)
    {
        b.setAlpha((int)(255F * f));
    }

    public final void a(float f, float f1)
    {
        c = f;
        d = f1;
        super.start();
    }

    public final void a(int i)
    {
        a = -(new Random()).nextInt(i) + i;
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        float f1 = c;
        a(f1 + (d - f1) * f);
    }
}
