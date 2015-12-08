// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.ViewCompat;
import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v4.widget:
//            AutoScrollHelper

private final class <init>
    implements Runnable
{

    final AutoScrollHelper this$0;

    public final void run()
    {
        boolean flag1 = false;
        if (!AutoScrollHelper.access$100(AutoScrollHelper.this))
        {
            return;
        }
        if (AutoScrollHelper.access$200(AutoScrollHelper.this))
        {
            boolean _tmp = AutoScrollHelper.access$202$2149d4c8(AutoScrollHelper.this);
            <init> <init>1 = AutoScrollHelper.access$300(AutoScrollHelper.this);
            <init>1.me = AnimationUtils.currentAnimationTimeMillis();
            <init>1.e = -1L;
            <init>1.me = <init>1.me;
            <init>1.ue = 0.5F;
            <init>1.ue = 0;
            <init>1.ue = 0;
        }
        <init> <init>2 = AutoScrollHelper.access$300(AutoScrollHelper.this);
        boolean flag = flag1;
        if (<init>2.e > 0L)
        {
            flag = flag1;
            if (AnimationUtils.currentAnimationTimeMillis() > <init>2.e + (long)<init>2.veRampDown)
            {
                flag = true;
            }
        }
        if (flag || !AutoScrollHelper.access$400(AutoScrollHelper.this))
        {
            boolean _tmp1 = AutoScrollHelper.access$102$2149d4c8(AutoScrollHelper.this);
            return;
        }
        if (AutoScrollHelper.access$500(AutoScrollHelper.this))
        {
            boolean _tmp2 = AutoScrollHelper.access$502$2149d4c8(AutoScrollHelper.this);
            AutoScrollHelper.access$600(AutoScrollHelper.this);
        }
        if (<init>2.me == 0L)
        {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        } else
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f = <init>2.At(l);
            f = f * 4F + -4F * f * f;
            long l1 = l - <init>2.me;
            <init>2.me = l;
            <init>2.me = (int)((float)l1 * f * <init>2.elocityX);
            <init>2.elocityX = (int)((float)l1 * f * <init>2.elocityY);
            int i = <init>2.elocityY;
            scrollTargetBy$255f295(i);
            ViewCompat.postOnAnimation(AutoScrollHelper.access$700(AutoScrollHelper.this), this);
            return;
        }
    }

    private ()
    {
        this$0 = AutoScrollHelper.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
