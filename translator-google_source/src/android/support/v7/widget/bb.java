// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v7.widget:
//            SwitchCompat

final class bb extends Animation
{

    final float a;
    final float b;
    final float c;
    final SwitchCompat d;

    bb(SwitchCompat switchcompat, float f, float f1)
    {
        d = switchcompat;
        super();
        a = f;
        b = f1;
        c = f1 - f;
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        SwitchCompat.a(d, a + c * f);
    }
}
