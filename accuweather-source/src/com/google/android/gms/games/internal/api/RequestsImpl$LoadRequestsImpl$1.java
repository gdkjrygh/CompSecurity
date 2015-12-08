// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.request.GameRequestBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

class yG
    implements com.google.android.gms.games.request.pl._cls1
{

    final yG QC;
    final Status yG;

    public GameRequestBuffer getRequests(int i)
    {
        return null;
    }

    public Status getStatus()
    {
        return yG;
    }

    public void release()
    {
    }

    ( , Status status)
    {
        QC = ;
        yG = status;
        super();
    }
}
