// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;


// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetInstrumentsResponse

public final class <init>
{

    final GetInstrumentsResponse aUE;

    public final GetInstrumentsResponse build()
    {
        return aUE;
    }

    public final aUE setInstrumentIds(String as[])
    {
        aUE.aUC = as;
        return this;
    }

    public final aUE setPaymentInstruments(byte abyte0[][])
    {
        aUE.aUD = abyte0;
        return this;
    }

    private (GetInstrumentsResponse getinstrumentsresponse)
    {
        aUE = getinstrumentsresponse;
        super();
    }

    aUE(GetInstrumentsResponse getinstrumentsresponse, aUE aue)
    {
        this(getinstrumentsresponse);
    }
}
