// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.MotionEvent;
import me.lyft.android.common.Unit;
import rx.functions.Action0;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.controls:
//            MultiSwitcher

class ureListener extends android.view.SimpleOnGestureListener
{

    final MultiSwitcher this$0;

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (MultiSwitcher.access$000(MultiSwitcher.this) == MultiSwitcher.access$100(MultiSwitcher.this))
        {
            MultiSwitcher.access$200(MultiSwitcher.this).onNext(Unit.create());
            MultiSwitcher.access$300(MultiSwitcher.this).call();
        }
        return false;
    }

    ureListener()
    {
        this$0 = MultiSwitcher.this;
        super();
    }
}
