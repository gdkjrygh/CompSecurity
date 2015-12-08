// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

final class this._cls0
    implements ResultCallback
{

    final GamesSettingsFragment this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.internal.game.)result;
        onNotifyAclLoaded(result);
    }

    esult()
    {
        this$0 = GamesSettingsFragment.this;
        super();
    }
}
