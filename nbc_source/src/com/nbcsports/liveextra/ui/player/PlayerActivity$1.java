// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.DialogInterface;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

class this._cls0
    implements android.content.nCancelListener
{

    final PlayerActivity this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        finish();
    }

    ()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
