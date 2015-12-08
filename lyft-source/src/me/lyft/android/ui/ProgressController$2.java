// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            ProgressController, ProgressView

class this._cls0
    implements Action1
{

    final ProgressController this$0;

    public void call(Boolean boolean1)
    {
        ProgressView progressview = ProgressController.access$100(ProgressController.this);
        int i;
        if (boolean1.booleanValue())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        progressview.setVisibility(i);
        ProgressController.access$100(ProgressController.this).setMessage(ProgressController.access$200(ProgressController.this));
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = ProgressController.this;
        super();
    }
}
