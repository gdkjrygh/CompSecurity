// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class abx extends Animation
{

    private float a;
    private float b;
    private SwitchCompat c;

    private abx(SwitchCompat switchcompat, float f, float f1)
    {
        c = switchcompat;
        super();
        a = f;
        b = f1 - f;
    }

    public abx(SwitchCompat switchcompat, float f, float f1, byte byte0)
    {
        this(switchcompat, f, f1);
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        SwitchCompat.a(c, a + b * f);
    }
}
