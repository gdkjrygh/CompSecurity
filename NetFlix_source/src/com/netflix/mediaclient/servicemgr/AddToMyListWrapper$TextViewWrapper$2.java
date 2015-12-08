// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.view.View;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            AddToMyListWrapper

class this._cls1
    implements android.view.per.TextViewWrapper._cls2
{

    final this._cls1 this$1;

    public void onClick(View view)
    {
        int i = -1;
        view = cess._mth100(this._cls1.this).getPlayContext();
        if (view != null)
        {
            i = view.getTrackId();
        }
        LogUtils.reportAddToQueueActionStarted(cess._mth100(this._cls1.this), null, cess._mth100(this._cls1.this).getUiScreen());
        AddToMyListWrapper.access$300(_fld0, cess._mth100(this._cls1.this).getVideoId(), i);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
