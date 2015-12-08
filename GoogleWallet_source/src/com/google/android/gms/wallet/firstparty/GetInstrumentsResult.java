// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetInstrumentsResponse

public class GetInstrumentsResult
    implements Result
{

    private final Status EU;
    private final GetInstrumentsResponse aUF;

    public GetInstrumentsResult(Status status, GetInstrumentsResponse getinstrumentsresponse)
    {
        EU = status;
        aUF = getinstrumentsresponse;
    }

    public GetInstrumentsResponse getGetInstrumentsResponse()
    {
        return aUF;
    }

    public Status getStatus()
    {
        return EU;
    }
}
