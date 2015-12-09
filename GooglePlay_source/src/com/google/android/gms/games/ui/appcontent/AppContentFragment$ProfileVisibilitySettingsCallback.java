// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private final class <init>
    implements ResultCallback
{

    final AppContentFragment this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.tingsCallback)result;
        if (canUseResult(result))
        {
            boolean flag = result.tingsCallback();
            if (flag != AppContentFragment.access$100(AppContentFragment.this))
            {
                AppContentFragment.access$102(AppContentFragment.this, flag);
                updateProfileVisibility(flag);
            }
        }
    }

    private ()
    {
        this$0 = AppContentFragment.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
