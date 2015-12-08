// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.IHasReason;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.infrastructure.lyft:
//            LyftError

public class LyftApiException extends IOException
    implements IHasReason
{

    private LyftError lyftError;
    private int statusCode;

    public LyftApiException(LyftError lyfterror, int i)
    {
        lyftError = lyfterror;
        statusCode = i;
    }

    public LyftError getLyftError()
    {
        LyftError lyfterror = new LyftError();
        return (LyftError)Objects.firstNonNull(lyftError, lyfterror);
    }

    public String getLyftErrorMessage()
    {
        return getLyftError().getError();
    }

    public String getMessage()
    {
        String s1 = (new StringBuilder()).append("Request failed with status:").append(getStatusCode()).append(" error:").append(getLyftError().getError()).toString();
        String s = s1;
        if (getValidationErrors().size() > 0)
        {
            s = (new StringBuilder()).append(s1).append(" validation errors:").toString();
        }
        for (Iterator iterator = getValidationErrors().iterator(); iterator.hasNext();)
        {
            LyftError.ValidationError validationerror = (LyftError.ValidationError)iterator.next();
            s = (new StringBuilder()).append(s).append(validationerror.getField()).append("-").append(validationerror.getReason()).append("; ").toString();
        }

        return s;
    }

    public String getReason()
    {
        Object obj = getLyftError();
        StringBuilder stringbuilder = (new StringBuilder("lyft_")).append(getStatusCode());
        if (!Strings.isNullOrEmpty(((LyftError) (obj)).getError()))
        {
            stringbuilder.append("_").append(((LyftError) (obj)).getError());
        }
        LyftError.ValidationError validationerror;
        for (obj = ((LyftError) (obj)).getErrors().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append("_").append(validationerror.getField()).append("_").append(validationerror.getReason()))
        {
            validationerror = (LyftError.ValidationError)((Iterator) (obj)).next();
        }

        return stringbuilder.toString();
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public List getValidationErrors()
    {
        return getLyftError().getErrors();
    }

    public boolean isServerError()
    {
        return statusCode / 100 == 5;
    }
}
