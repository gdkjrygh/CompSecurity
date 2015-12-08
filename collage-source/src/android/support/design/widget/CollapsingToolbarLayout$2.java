// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            CollapsingToolbarLayout, ValueAnimatorCompat

class this._cls0
    implements orUpdateListener
{

    final CollapsingToolbarLayout this$0;

    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
    {
        CollapsingToolbarLayout.access$200(CollapsingToolbarLayout.this, valueanimatorcompat.getAnimatedIntValue());
    }

    orUpdateListener()
    {
        this$0 = CollapsingToolbarLayout.this;
        super();
    }
}
