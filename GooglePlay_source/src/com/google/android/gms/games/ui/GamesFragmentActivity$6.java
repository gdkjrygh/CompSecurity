// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.os.Bundle;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity

final class nt extends GamesDialogFragment
{

    final GamesFragmentActivity this$0;
    final android.content.Listener val$cancelListener;
    final android.content.istener val$negativeOnClickListener;
    final android.content.istener val$positiveOnClickListener;

    protected final android.support.v7.app.logBuilder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        return gamesdialogbuilder.setTitle(0x7f10015c).setMessage(0x7f10015b).egativeButton(0x7f100159, val$negativeOnClickListener).ositiveButton(0x7f10015a, val$positiveOnClickListener).nCancelListener(val$cancelListener);
    }

    r()
    {
        this$0 = final_gamesfragmentactivity;
        val$negativeOnClickListener = istener;
        val$positiveOnClickListener = istener1;
        val$cancelListener = android.content.Listener.this;
        super();
    }
}
