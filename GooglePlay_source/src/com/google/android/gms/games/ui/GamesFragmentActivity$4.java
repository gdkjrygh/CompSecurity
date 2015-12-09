// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.DialogInterface;
import com.google.android.gms.common.config.GservicesValue;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity, G

final class this._cls0
    implements android.content.istener
{

    final GamesFragmentActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        logPlusUpgradeDialogFinishedEvent(GamesFragmentActivity.access$300(GamesFragmentActivity.this), GamesFragmentActivity.access$400(GamesFragmentActivity.this), -1);
        GamesFragmentActivity.access$500(GamesFragmentActivity.this);
        int _tmp = GamesFragmentActivity.access$302$5c9af8c7(GamesFragmentActivity.this);
        GamesFragmentActivity gamesfragmentactivity = GamesFragmentActivity.this;
        if (((Boolean)G.showBannerInPlusUpsellDialog.get()).booleanValue())
        {
            i = 2;
        } else
        {
            i = 1;
        }
        GamesFragmentActivity.access$402(gamesfragmentactivity, Integer.valueOf(i));
        GamesFragmentActivity.access$600(GamesFragmentActivity.this);
        dialoginterface.dismiss();
    }

    ()
    {
        this$0 = GamesFragmentActivity.this;
        super();
    }
}
