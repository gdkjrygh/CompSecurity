// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            TabLayout, ValueAnimatorCompat

class ListenerAdapter extends ListenerAdapter
{

    final this._cls1 this$1;
    final int val$position;

    public void onAnimationCancel(ValueAnimatorCompat valueanimatorcompat)
    {
        cess._mth1702(this._cls1.this, val$position);
        cess._mth1802(this._cls1.this, 0.0F);
    }

    public void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat)
    {
        cess._mth1702(this._cls1.this, val$position);
        cess._mth1802(this._cls1.this, 0.0F);
    }

    ListenerAdapter()
    {
        this$1 = final_listeneradapter;
        val$position = I.this;
        super();
    }
}
