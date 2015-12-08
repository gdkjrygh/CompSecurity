// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;

// Referenced classes of package com.skype.android.app.settings:
//            ManageAliasesAdapter

final class this._cls0
    implements letePhoneCallback
{

    final ManageAliasesAdapter this$0;

    public final void onDeletePhoneNumber(com.skype.android.app.shortcircuit.lient.AliasInfo aliasinfo)
    {
        scProfileWebClient.deletePhone(aliasinfo);
    }

    WebClient.AliasInfo()
    {
        this$0 = ManageAliasesAdapter.this;
        super();
    }
}
