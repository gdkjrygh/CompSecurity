// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.anim;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.google.android.apps.translate.anim:
//            g

public abstract class f extends Animation
{

    private android.view.animation.Animation.AnimationListener a;

    public f()
    {
    }

    public abstract void a(float f1);

    public final void a(Context context, int i)
    {
        setDuration(context.getResources().getInteger(i));
    }

    protected void applyTransformation(float f1, Transformation transformation)
    {
        this;
        JVM INSTR monitorenter ;
        a(f1);
        if (a == null || f1 != 1.0F)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        transformation = a;
        a = null;
        (new Handler()).post(new g(this, transformation));
        this;
        JVM INSTR monitorexit ;
        return;
        transformation;
        throw transformation;
    }

    public void setAnimationListener(android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = animationlistener;
    }
}
