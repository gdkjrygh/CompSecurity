// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;

import java.util.ArrayList;
import java.util.Collection;
import me.lyft.android.common.Objects;

public class LyftError
{

    private static final String REASON_DUPLICATE_PHONE = "duplicatePhoneNumber";
    private static final String REASON_GENERAL = "general";
    private static final String REASON_INVALID_PHONE = "invalidPhone";
    private static final String REASON_SUSPENDED = "suspended";
    String error;
    ArrayList errors;

    public LyftError()
    {
    }

    public String getError()
    {
        return (String)Objects.firstNonNull(error, "");
    }

    public ArrayList getErrors()
    {
        return (ArrayList)Objects.firstNonNull(errors, new ArrayList());
    }

    public void setError(String s)
    {
        error = s;
    }

    public void setValidationErrors(Collection collection)
    {
        errors = new ArrayList(collection);
    }
}
