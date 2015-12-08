// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            s, w

class PZ
    implements ResultCallback
{

    final s PZ;

    public void j(Status status)
    {
        if (!status.isSuccess())
        {
            w.p("DriveContentsImpl", "Error discarding contents");
            return;
        } else
        {
            w.m("DriveContentsImpl", "Contents discarded");
            return;
        }
    }

    public void onResult(Result result)
    {
        j((Status)result);
    }

    llback(s s1)
    {
        PZ = s1;
        super();
    }
}
