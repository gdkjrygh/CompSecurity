// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//            ValueAnimatorCompatImplHoneycombMr1

class eListenerProxy
    implements android.animation.eycombMr1._cls1
{

    final ValueAnimatorCompatImplHoneycombMr1 this$0;
    final eListenerProxy val$updateListener;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        val$updateListener.onAnimationUpdate();
    }

    eListenerProxy()
    {
        this$0 = final_valueanimatorcompatimplhoneycombmr1;
        val$updateListener = eListenerProxy.this;
        super();
    }
}
