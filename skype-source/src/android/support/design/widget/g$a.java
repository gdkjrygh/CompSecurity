// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.design.widget:
//            g, l

private abstract class <init> extends Animation
{

    final g a;
    private float b;
    private float c;

    protected abstract float a();

    protected void applyTransformation(float f, Transformation transformation)
    {
        transformation = a.a;
        transformation.a(b + c * f, ((l) (transformation)).h);
    }

    public void reset()
    {
        super.reset();
        b = a.a.j;
        c = a() - b;
    }

    private ion(g g1)
    {
        a = g1;
        super();
    }

    init>(g g1, byte byte0)
    {
        this(g1);
    }
}
