// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

final class this._cls1
    implements ResultCallback
{

    final keNextRequest this$1;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.DetailStateManager)result;
        this._cls1 _lcls1 = this._cls1.this;
        _lcls1.riendsStatusCode = result.mFriendsStatusCode().mStatusCode;
        _lcls1.riendsBuffer = result.mFriendsBuffer();
        if (!_lcls1._fld0.isFinishing())
        {
            _lcls1.keNextRequest();
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
