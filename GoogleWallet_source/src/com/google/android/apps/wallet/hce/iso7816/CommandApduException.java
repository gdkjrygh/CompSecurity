// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.iso7816;


// Referenced classes of package com.google.android.apps.wallet.hce.iso7816:
//            ResponseApdu

public final class CommandApduException extends Exception
{

    private final ResponseApdu mErrorResponse;

    public CommandApduException(ResponseApdu responseapdu)
    {
        mErrorResponse = responseapdu;
    }

    public final ResponseApdu getErrorResponse()
    {
        return mErrorResponse;
    }
}
