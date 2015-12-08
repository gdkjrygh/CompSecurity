// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            TabLayout, ValueAnimatorCompat

class this._cls0
    implements rCompat.AnimatorUpdateListener
{

    final TabLayout this$0;

    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
    {
        scrollTo(valueanimatorcompat.getAnimatedIntValue(), 0);
    }

    rCompat()
    {
        this$0 = TabLayout.this;
        super();
    }
}
