// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import com.hmobile.common.SegmentedRadioGroup;

// Referenced classes of package com.hmobile.biblekjv:
//            SelectActivity

class val.position
    implements android.view.apter._cls1
{

    final this._cls1 this$1;
    private final int val$position;

    public void onClick(View view)
    {
        cess._mth0(this._cls1.this).book_id = val$position + 1;
        cess._mth0(this._cls1.this).segmentText.check(0x7f0e00ce);
    }

    ()
    {
        this$1 = final_;
        val$position = I.this;
        super();
    }
}
