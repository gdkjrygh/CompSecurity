// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.controls:
//            Toolbar

class olbarItem
    implements android.view.ckListener
{

    final Toolbar this$0;
    final olbarItem val$toolbarItem;

    public void onClick(View view)
    {
        itemClick.onNext(val$toolbarItem);
        Toolbar.access$100(Toolbar.this).call(Integer.valueOf(olbarItem.access._mth000(val$toolbarItem)));
    }

    olbarItem()
    {
        this$0 = final_toolbar;
        val$toolbarItem = olbarItem.this;
        super();
    }
}
