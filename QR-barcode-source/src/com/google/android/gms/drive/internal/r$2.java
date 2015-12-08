// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, v

class OL
    implements ResultCallback
{

    final r OL;

    public void k(Status status)
    {
        if (!status.isSuccess())
        {
            v.q("DriveContentsImpl", "Error discarding contents");
            return;
        } else
        {
            v.n("DriveContentsImpl", "Contents discarded");
            return;
        }
    }

    public void onResult(Result result)
    {
        k((Status)result);
    }

    llback(r r1)
    {
        OL = r1;
        super();
    }
}
