// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.ui:
//            NfcTile

final class this._cls0
    implements android.view.ckListener
{

    final NfcTile this$0;

    public final void onClick(View view)
    {
        view = new Intent("com.google.android.gms.wallet.settings.GOOGLE_WALLET_SETTINGS");
        NfcTile.access$700(NfcTile.this).startActivity(view);
    }

    ()
    {
        this$0 = NfcTile.this;
        super();
    }
}
