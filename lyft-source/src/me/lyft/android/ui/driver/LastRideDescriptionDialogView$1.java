// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.ui.driver:
//            LastRideDescriptionDialogView

class this._cls0
    implements android.view.DialogView._cls1
{

    final LastRideDescriptionDialogView this$0;

    public void onClick(View view)
    {
        preferences.setLastRideDescriptionShown();
    }

    ()
    {
        this$0 = LastRideDescriptionDialogView.this;
        super();
    }
}
