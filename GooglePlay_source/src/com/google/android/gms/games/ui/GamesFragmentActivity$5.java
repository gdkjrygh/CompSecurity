// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity

final class this._cls0
    implements android.content.Listener
{

    final GamesFragmentActivity this$0;

    public final void onCancel(DialogInterface dialoginterface)
    {
        logPlusUpgradeDialogFinishedEvent(GamesFragmentActivity.access$300(GamesFragmentActivity.this), GamesFragmentActivity.access$400(GamesFragmentActivity.this), 0);
        GamesFragmentActivity.access$500(GamesFragmentActivity.this);
    }

    ()
    {
        this$0 = GamesFragmentActivity.this;
        super();
    }
}
