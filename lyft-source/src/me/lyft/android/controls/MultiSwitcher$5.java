// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import me.lyft.android.common.Unit;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.controls:
//            MultiSwitcher, SwitcherSelection, ISwitcherItem

class val.wasUserAction
    implements Action1
{

    final MultiSwitcher this$0;
    final ISwitcherItem val$selectedItem;
    final boolean val$wasUserAction;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        unit = new SwitcherSelection(val$selectedItem, val$wasUserAction);
        MultiSwitcher.access$1800(MultiSwitcher.this).onNext(unit);
        MultiSwitcher.access$1900(MultiSwitcher.this).call(unit);
    }

    n()
    {
        this$0 = final_multiswitcher;
        val$selectedItem = iswitcheritem;
        val$wasUserAction = Z.this;
        super();
    }
}
