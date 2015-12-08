// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            OwnersAvatarManager

final class this._cls1
    implements ResultCallback
{

    final is._cls0 this$1;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.people.nerImageRequest)result;
        this._cls1 _lcls1 = this._cls1.this;
        OwnersAvatarManager.access$001$47dfddd1(_lcls1._fld0, result._mth0(), result.iptor(), _lcls1);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
