// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.view.MotionEvent;
import android.view.View;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            GuidedSearchTypeAheadAdapter

class this._cls0
    implements android.view.SearchTypeAheadAdapter._cls1
{

    final GuidedSearchTypeAheadAdapter this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            Device.hideSoftKeyboard(view);
        }
        return false;
    }

    ()
    {
        this$0 = GuidedSearchTypeAheadAdapter.this;
        super();
    }
}
