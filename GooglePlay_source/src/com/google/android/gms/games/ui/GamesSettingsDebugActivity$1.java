// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsDebugActivity

final class this._cls0
    implements android.content.er
{

    final GamesSettingsDebugActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        setSelectedServer(GamesSettingsDebugActivity.getSelectedServerFromG());
    }

    ()
    {
        this$0 = GamesSettingsDebugActivity.this;
        super();
    }
}
