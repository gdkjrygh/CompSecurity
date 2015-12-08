// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;


// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            CmLoginSdkException, CmLoginSdkRequestError

public class CmLoginSdkServiceException extends CmLoginSdkException
{

    private static final long serialVersionUID = 1L;
    private final CmLoginSdkRequestError error;

    public CmLoginSdkServiceException(CmLoginSdkRequestError cmloginsdkrequesterror, String s)
    {
        super(s);
        error = cmloginsdkrequesterror;
    }

    public final String toString()
    {
        return (new StringBuilder("{CmLoginSdkServiceException: httpResponseCode: ")).append(error.getRequestStatusCode()).append(", CmLoginErrorCode: ").append(error.getErrorCode()).append(", CmLoginErrorType: ").append(error.getErrorType()).append(", message: ").append(error.getErrorMessage()).append("}").toString();
    }
}
