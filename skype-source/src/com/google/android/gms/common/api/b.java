// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


public final class b
{

    public static String a(int i)
    {
        switch (i)
        {
        default:
            return (new StringBuilder("unknown status code: ")).append(i).toString();

        case -1: 
            return "SUCCESS_CACHE";

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";

        case 13: // '\r'
            return "ERROR_OPERATION_FAILED";

        case 14: // '\016'
            return "INTERRUPTED";

        case 15: // '\017'
            return "TIMEOUT";

        case 16: // '\020'
            return "CANCELED";

        case 3000: 
            return "AUTH_API_INVALID_CREDENTIALS";

        case 3001: 
            return "AUTH_API_ACCESS_FORBIDDEN";

        case 3002: 
            return "AUTH_API_CLIENT_ERROR";

        case 3003: 
            return "AUTH_API_SERVER_ERROR";

        case 3004: 
            return "AUTH_TOKEN_ERROR";

        case 3005: 
            return "AUTH_URL_RESOLUTION";
        }
    }
}
