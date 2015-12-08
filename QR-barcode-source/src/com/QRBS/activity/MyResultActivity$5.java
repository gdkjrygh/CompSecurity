// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.view.View;
import com.scannerfire.utils.ResultUtils;

// Referenced classes of package com.QRBS.activity:
//            MyResultActivity

class this._cls0
    implements android.view.r
{

    final MyResultActivity this$0;

    public void onClick(View view)
    {
        ResultUtils.myAddressbookIntent(bundle, a);
    }

    ()
    {
        this$0 = MyResultActivity.this;
        super();
    }
}
