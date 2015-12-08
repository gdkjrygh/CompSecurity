// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import android.view.View;

// Referenced classes of package com.pinterest.activity.map:
//            GoogleServiceDialog

class this._cls0
    implements android.view.rviceDialog._cls3
{

    final GoogleServiceDialog this$0;

    public void onClick(View view)
    {
        GoogleServiceDialog.setPlayServiceDialogShown();
        dismiss();
    }

    ()
    {
        this$0 = GoogleServiceDialog.this;
        super();
    }
}
