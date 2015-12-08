// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

// Referenced classes of package com.dominos.utils:
//            ExpirationDateSpinnerUtility

class this._cls1
    implements android.widget.r
{

    final is._cls0 this$1;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview.getSelectedItemPosition() > 0)
        {
            ExpirationDateSpinnerUtility.access$000(_fld0).performClick();
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
