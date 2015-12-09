// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.view.View;
import android.widget.Spinner;

// Referenced classes of package com.dominos.utils:
//            ExpirationDateSpinnerUtility

class this._cls0
    implements android.view.ty._cls2
{

    final ExpirationDateSpinnerUtility this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            ExpirationDateSpinnerUtility.access$100(ExpirationDateSpinnerUtility.this).performClick();
        }
    }

    ()
    {
        this$0 = ExpirationDateSpinnerUtility.this;
        super();
    }
}
