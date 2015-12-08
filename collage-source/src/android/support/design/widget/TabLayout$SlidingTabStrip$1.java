// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            TabLayout, ValueAnimatorCompat, AnimationUtils

class val.targetRight
    implements UpdateListener
{

    final val.targetRight this$1;
    final int val$startLeft;
    final int val$startRight;
    final int val$targetLeft;
    final int val$targetRight;

    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
    {
        float f = valueanimatorcompat.getAnimatedFraction();
        cess._mth1900(this._cls1.this, AnimationUtils.lerp(val$startLeft, val$targetLeft, f), AnimationUtils.lerp(val$startRight, val$targetRight, f));
    }

    UpdateListener()
    {
        this$1 = final_updatelistener;
        val$startLeft = i;
        val$targetLeft = j;
        val$startRight = k;
        val$targetRight = I.this;
        super();
    }
}
