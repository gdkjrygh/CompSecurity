// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

final class a
{

    static final Interpolator a = new LinearInterpolator();
    static final Interpolator b = new android.support.v4.view.b.a();
    static final Interpolator c = new DecelerateInterpolator();

    static int a(int i, int j, float f)
    {
        return Math.round((float)(j - i) * f) + i;
    }

}
