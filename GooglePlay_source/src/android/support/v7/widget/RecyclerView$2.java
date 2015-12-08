// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class this._cls0
    implements Runnable
{

    final RecyclerView this$0;

    public final void run()
    {
        if (mItemAnimator != null)
        {
            mItemAnimator.runPendingAnimations();
        }
        boolean _tmp = RecyclerView.access$502$767d6395(RecyclerView.this);
    }

    emAnimator()
    {
        this$0 = RecyclerView.this;
        super();
    }
}
