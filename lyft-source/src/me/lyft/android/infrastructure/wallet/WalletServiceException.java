// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.wallet;

import me.lyft.android.common.IHasReason;

public class WalletServiceException extends Throwable
    implements IHasReason
{

    public static final int ERROR_CODE_AUTHENTICATION_FAILURE = 411;
    public static final int ERROR_CODE_BUYER_ACCOUNT_ERROR = 409;
    public static final int ERROR_CODE_INVALID_PARAMETERS = 404;
    public static final int ERROR_CODE_INVALID_TRANSACTION = 410;
    public static final int ERROR_CODE_MERCHANT_ACCOUNT_ERROR = 405;
    public static final int ERROR_CODE_SERVICE_UNAVAILABLE = 402;
    public static final int ERROR_CODE_SPENDING_LIMIT_EXCEEDED = 406;
    public static final int ERROR_CODE_UNSUPPORTED_API_VERSION = 412;
    private int errorCode;

    public WalletServiceException(int i)
    {
        errorCode = i;
    }

    private static String asMeaningfulString(int i)
    {
        switch (i)
        {
        case 403: 
        case 407: 
        case 408: 
        default:
            return (new StringBuilder()).append("other_").append(i).toString();

        case 402: 
            return "service_unavailable";

        case 404: 
            return "invalid_parameters";

        case 405: 
            return "merchant_account_error";

        case 406: 
            return "spending_limit_exceeded";

        case 409: 
            return "buyer_account_error";

        case 410: 
            return "invalid_transaction";

        case 411: 
            return "authentication_failure";

        case 412: 
            return "unsupported_api_version";
        }
    }

    public String getMessage()
    {
        return (new StringBuilder()).append("Failed to save wallet card: ").append(errorCode).toString();
    }

    public String getReason()
    {
        return (new StringBuilder()).append("wallet_").append(asMeaningfulString(errorCode)).toString();
    }
}
