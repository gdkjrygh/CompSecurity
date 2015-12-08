// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.game.Acls;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment, GamesSettingsActivity

final class this._cls0
    implements ResultCallback
{

    final GamesSettingsFragment this$0;

    public final volatile void onResult(Result result)
    {
        Object obj = (Status)result;
        result = GamesSettingsFragment.this;
        int i = ((Status) (obj)).mStatusCode;
        obj = ((GamesSettingsFragment) (result)).mParent.getGoogleApiClient();
        Games.Acls.loadNotifyAclInternal(((com.google.android.gms.common.api.GoogleApiClient) (obj))).setResultCallback(new <init>(result));
    }

    ()
    {
        this$0 = GamesSettingsFragment.this;
        super();
    }
}
