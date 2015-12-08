// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class afv extends Animation
{

    public final float a;
    private float b;
    private float c;
    private SwitchCompat d;

    public afv(SwitchCompat switchcompat, float f, float f1)
    {
        d = switchcompat;
        super();
        b = f;
        a = f1;
        c = f1 - f;
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        SwitchCompat.a(d, b + c * f);
    }
}
