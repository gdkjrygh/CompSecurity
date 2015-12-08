// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.DialogInterface;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobsManager;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ViewWoblActivity

final class this._cls0
    implements android.content.lickListener
{

    final ViewWoblActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -1 -1: default 20
    //                   -1 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        fullScreenProgressSpinnerManager.show();
        if (ViewWoblActivity.access$000(ViewWoblActivity.this) != null)
        {
            if (!networkAccessChecker.check())
            {
                fullScreenProgressSpinnerManager.hide();
                return;
            } else
            {
                wobsManager.deleteWob(ViewWoblActivity.access$000(ViewWoblActivity.this));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ()
    {
        this$0 = ViewWoblActivity.this;
        super();
    }
}
