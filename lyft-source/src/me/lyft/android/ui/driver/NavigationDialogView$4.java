// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            NavigationDialogView

class this._cls0
    implements android.view.DialogView._cls4
{

    final NavigationDialogView this$0;

    public void onClick(View view)
    {
        appFlow.goTo(new me.lyft.android.ui.placesearch.erSetDropoffSearch(true));
        dialogFlow.dismiss();
    }

    .DriverSetDropoffSearch()
    {
        this$0 = NavigationDialogView.this;
        super();
    }
}
