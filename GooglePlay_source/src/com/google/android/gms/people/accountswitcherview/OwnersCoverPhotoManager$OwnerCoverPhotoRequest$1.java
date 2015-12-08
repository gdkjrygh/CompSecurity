// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            OwnersCoverPhotoManager

final class this._cls1
    implements ResultCallback
{

    final dth this$1;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.people.Request)result;
        this._cls1 _lcls1 = this._cls1.this;
        _lcls1._fld0.onImageLoaded(result.geLoaded(), result.geLoaded(), result.geLoaded(), result.geLoaded(), _lcls1.dth, _lcls1);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
