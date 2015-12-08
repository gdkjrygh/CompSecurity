// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveContentsImpl, DriveLog

final class this._cls0
    implements ResultCallback
{

    final DriveContentsImpl this$0;

    public final volatile void onResult(Result result)
    {
        if (!((Status)result).isSuccess())
        {
            DriveLog.e("DriveContentsImpl", "Error discarding contents");
            return;
        } else
        {
            DriveLog.d("DriveContentsImpl", "Contents discarded");
            return;
        }
    }

    ()
    {
        this$0 = DriveContentsImpl.this;
        super();
    }
}
