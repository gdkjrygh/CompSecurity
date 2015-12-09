// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

static final class A
    implements Interpolator
{

    public float getInterpolation(float f)
    {
        return f * f * f * f * f;
    }

    A()
    {
    }
}
