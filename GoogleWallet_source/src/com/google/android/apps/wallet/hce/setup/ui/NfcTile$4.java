// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.ui:
//            NfcTile

final class this._cls0
    implements android.view.ckListener
{

    final NfcTile this$0;

    public final void onClick(View view)
    {
        NfcTile.access$000(NfcTile.this).sendLinkTap("NfcSettingsTile", new AnalyticsCustomDimension[0]);
        NfcTile.access$600(NfcTile.this).startService(NfcSetupApi.getRefreshIntent(NfcTile.access$500(NfcTile.this), 4));
    }

    pi()
    {
        this$0 = NfcTile.this;
        super();
    }
}
