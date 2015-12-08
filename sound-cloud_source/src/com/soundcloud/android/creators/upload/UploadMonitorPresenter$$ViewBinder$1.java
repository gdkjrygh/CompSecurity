// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import a.a.a;
import android.view.View;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadMonitorPresenter

class val.target extends a
{

    final val.target this$0;
    final UploadMonitorPresenter val$target;

    public void doClick(View view)
    {
        val$target.onRetry();
    }

    Q()
    {
        this$0 = final_q;
        val$target = UploadMonitorPresenter.this;
        super();
    }
}
