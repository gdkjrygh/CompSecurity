// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            TextInputLayout, ValueAnimatorCompat, CollapsingTextHelper

class this._cls0
    implements t.AnimatorUpdateListener
{

    final TextInputLayout this$0;

    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
    {
        TextInputLayout.access$400(TextInputLayout.this).setExpansionFraction(valueanimatorcompat.getAnimatedFloatValue());
    }

    t()
    {
        this$0 = TextInputLayout.this;
        super();
    }
}
