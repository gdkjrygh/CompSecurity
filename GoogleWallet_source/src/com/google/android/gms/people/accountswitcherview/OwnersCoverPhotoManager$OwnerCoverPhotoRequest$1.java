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

    final onResult this$1;

    private void onResult(com.google.android.gms.people.CoverPhotoRequest._cls1 _pcls1)
    {
        ImageLoaded(_pcls1);
    }

    public final volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.people.CoverPhotoRequest._cls1.onResult)result);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
