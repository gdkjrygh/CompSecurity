// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.view.View;

// Referenced classes of package android.support.v4.animation:
//            ValueAnimatorCompat

interface AnimatorProvider
{

    public abstract void clearInterpolator(View view);

    public abstract ValueAnimatorCompat emptyValueAnimator();
}
