// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            ValueAnimatorCompat

class imatorListener
    implements pl.AnimatorListenerProxy
{

    final ValueAnimatorCompat this$0;
    final imatorListener val$listener;

    public void onAnimationCancel()
    {
        val$listener.onAnimationCancel(ValueAnimatorCompat.this);
    }

    public void onAnimationEnd()
    {
        val$listener.onAnimationEnd(ValueAnimatorCompat.this);
    }

    public void onAnimationStart()
    {
        val$listener.onAnimationStart(ValueAnimatorCompat.this);
    }

    imatorListener()
    {
        this$0 = final_valueanimatorcompat;
        val$listener = imatorListener.this;
        super();
    }
}
