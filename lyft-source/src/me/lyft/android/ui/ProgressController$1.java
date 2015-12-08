// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.ViewGroup;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            ProgressController

class val.rootView
    implements Action1
{

    final ProgressController this$0;
    final ViewGroup val$rootView;

    public void call(Boolean boolean1)
    {
        ProgressController.access$000(ProgressController.this, val$rootView, boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = final_progresscontroller;
        val$rootView = ViewGroup.this;
        super();
    }
}
