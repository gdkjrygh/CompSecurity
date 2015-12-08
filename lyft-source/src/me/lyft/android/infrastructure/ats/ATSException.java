// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.ats;

import java.io.IOException;
import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.infrastructure.ats:
//            ATSError

public class ATSException extends IOException
{

    private ATSError error;
    private int statusCode;

    public ATSException(ATSError atserror, int i)
    {
        error = atserror;
        statusCode = i;
    }

    public ATSError getATSError()
    {
        ATSError atserror = new ATSError();
        atserror.setError((new StringBuilder()).append("Request failed with status: ").append(getStatusCode()).toString());
        return (ATSError)Objects.firstNonNull(error, atserror);
    }

    public String getMessage()
    {
        return getATSError().getMessage();
    }

    public int getStatusCode()
    {
        return statusCode;
    }
}
