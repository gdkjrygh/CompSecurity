// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;


// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationServiceException

public class FailedToConnectException extends LocationServiceException
{

    private final int errorCode;

    public FailedToConnectException(int i)
    {
        errorCode = i;
    }

    public String getMessage()
    {
        return "Failed to connect to location service";
    }

    public String getReason()
    {
        return (new StringBuilder()).append("failed_to_connect_").append(errorCode).toString();
    }
}
