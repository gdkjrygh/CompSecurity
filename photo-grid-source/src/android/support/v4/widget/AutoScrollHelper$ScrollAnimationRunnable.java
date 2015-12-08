// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v4.widget:
//            AutoScrollHelper

class <init>
    implements Runnable
{

    final AutoScrollHelper this$0;

    public void run()
    {
        if (!AutoScrollHelper.access$100(AutoScrollHelper.this))
        {
            return;
        }
        if (AutoScrollHelper.access$200(AutoScrollHelper.this))
        {
            AutoScrollHelper.access$202(AutoScrollHelper.this, false);
            AutoScrollHelper.access$300(AutoScrollHelper.this)._mth0();
        }
        <init> <init>1 = AutoScrollHelper.access$300(AutoScrollHelper.this);
        if (<init>1.ed() || !AutoScrollHelper.access$400(AutoScrollHelper.this))
        {
            AutoScrollHelper.access$102(AutoScrollHelper.this, false);
            return;
        }
        if (AutoScrollHelper.access$500(AutoScrollHelper.this))
        {
            AutoScrollHelper.access$502(AutoScrollHelper.this, false);
            AutoScrollHelper.access$600(AutoScrollHelper.this);
        }
        <init>1.crollDelta();
        int i = <init>1.X();
        int j = <init>1.Y();
        scrollTargetBy(i, j);
        ViewCompat.postOnAnimation(AutoScrollHelper.access$700(AutoScrollHelper.this), this);
    }

    private ()
    {
        this$0 = AutoScrollHelper.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
