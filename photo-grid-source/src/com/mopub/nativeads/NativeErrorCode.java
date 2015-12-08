// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


public final class NativeErrorCode extends Enum
{

    public static final NativeErrorCode CONNECTION_ERROR;
    public static final NativeErrorCode EMPTY_AD_RESPONSE;
    public static final NativeErrorCode IMAGE_DOWNLOAD_FAILURE;
    public static final NativeErrorCode INVALID_JSON;
    public static final NativeErrorCode INVALID_REQUEST_URL;
    public static final NativeErrorCode NATIVE_ADAPTER_CONFIGURATION_ERROR;
    public static final NativeErrorCode NATIVE_ADAPTER_NOT_FOUND;
    public static final NativeErrorCode NETWORK_INVALID_REQUEST;
    public static final NativeErrorCode NETWORK_INVALID_STATE;
    public static final NativeErrorCode NETWORK_NO_FILL;
    public static final NativeErrorCode NETWORK_TIMEOUT;
    public static final NativeErrorCode SERVER_ERROR_RESPONSE_CODE;
    public static final NativeErrorCode UNEXPECTED_RESPONSE_CODE;
    public static final NativeErrorCode UNSPECIFIED;
    private static final NativeErrorCode b[];
    private final String a;

    private NativeErrorCode(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static NativeErrorCode valueOf(String s)
    {
        return (NativeErrorCode)Enum.valueOf(com/mopub/nativeads/NativeErrorCode, s);
    }

    public static NativeErrorCode[] values()
    {
        return (NativeErrorCode[])b.clone();
    }

    public final String toString()
    {
        return a;
    }

    static 
    {
        EMPTY_AD_RESPONSE = new NativeErrorCode("EMPTY_AD_RESPONSE", 0, "Server returned empty response.");
        INVALID_JSON = new NativeErrorCode("INVALID_JSON", 1, "Unable to parse JSON response from server.");
        IMAGE_DOWNLOAD_FAILURE = new NativeErrorCode("IMAGE_DOWNLOAD_FAILURE", 2, "Unable to download images associated with ad.");
        INVALID_REQUEST_URL = new NativeErrorCode("INVALID_REQUEST_URL", 3, "Invalid request url.");
        UNEXPECTED_RESPONSE_CODE = new NativeErrorCode("UNEXPECTED_RESPONSE_CODE", 4, "Received unexpected response code from server.");
        SERVER_ERROR_RESPONSE_CODE = new NativeErrorCode("SERVER_ERROR_RESPONSE_CODE", 5, "Server returned erroneous response code.");
        CONNECTION_ERROR = new NativeErrorCode("CONNECTION_ERROR", 6, "Network is unavailable.");
        UNSPECIFIED = new NativeErrorCode("UNSPECIFIED", 7, "Unspecified error occurred.");
        NETWORK_INVALID_REQUEST = new NativeErrorCode("NETWORK_INVALID_REQUEST", 8, "Third-party network received invalid request.");
        NETWORK_TIMEOUT = new NativeErrorCode("NETWORK_TIMEOUT", 9, "Third-party network failed to respond in a timely manner.");
        NETWORK_NO_FILL = new NativeErrorCode("NETWORK_NO_FILL", 10, "Third-party network failed to provide an ad.");
        NETWORK_INVALID_STATE = new NativeErrorCode("NETWORK_INVALID_STATE", 11, "Third-party network failed due to invalid internal state.");
        NATIVE_ADAPTER_CONFIGURATION_ERROR = new NativeErrorCode("NATIVE_ADAPTER_CONFIGURATION_ERROR", 12, "Custom Event Native was configured incorrectly.");
        NATIVE_ADAPTER_NOT_FOUND = new NativeErrorCode("NATIVE_ADAPTER_NOT_FOUND", 13, "Unable to find Custom Event Native.");
        b = (new NativeErrorCode[] {
            EMPTY_AD_RESPONSE, INVALID_JSON, IMAGE_DOWNLOAD_FAILURE, INVALID_REQUEST_URL, UNEXPECTED_RESPONSE_CODE, SERVER_ERROR_RESPONSE_CODE, CONNECTION_ERROR, UNSPECIFIED, NETWORK_INVALID_REQUEST, NETWORK_TIMEOUT, 
            NETWORK_NO_FILL, NETWORK_INVALID_STATE, NATIVE_ADAPTER_CONFIGURATION_ERROR, NATIVE_ADAPTER_NOT_FOUND
        });
    }
}
