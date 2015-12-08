// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.accuweather.android.ias:
//            AmazonProductChoiceDialog

class this._cls0
    implements android.view.ChoiceDialog._cls1
{

    final AmazonProductChoiceDialog this$0;

    public void onClick(View view)
    {
        getDialog().dismiss();
    }

    ()
    {
        this$0 = AmazonProductChoiceDialog.this;
        super();
    }
}
