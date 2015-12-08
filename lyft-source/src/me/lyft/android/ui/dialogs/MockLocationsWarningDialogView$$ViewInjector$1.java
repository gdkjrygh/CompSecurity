// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            MockLocationsWarningDialogView

class val.target extends DebouncingOnClickListener
{

    final lopmentSettings this$0;
    final MockLocationsWarningDialogView val$target;

    public void doClick(View view)
    {
        val$target.onClick_goToDevelopmentSettings(view);
    }

    ()
    {
        this$0 = final_;
        val$target = MockLocationsWarningDialogView.this;
        super();
    }
}
