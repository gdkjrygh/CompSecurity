// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinView

final class this._cls0
    implements android.view.ckListener
{

    final PinView this$0;

    public final void onClick(View view)
    {
        view = (DrawerLayout)Views.findViewById(getRootView(), com.google.android.apps.walletnfcrel.rawerLayout);
        if (view.isDrawerOpen(3))
        {
            view.closeDrawer(3);
            return;
        } else
        {
            view.openDrawer(3);
            return;
        }
    }

    s()
    {
        this$0 = PinView.this;
        super();
    }
}
