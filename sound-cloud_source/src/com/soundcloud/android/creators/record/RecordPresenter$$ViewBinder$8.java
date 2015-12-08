// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.widget.CompoundButton;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordPresenter

class val.target
    implements android.widget.Listener
{

    final val.target this$0;
    final RecordPresenter val$target;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        val$target.toggleFade();
    }

    ()
    {
        this$0 = final_;
        val$target = RecordPresenter.this;
        super();
    }
}
