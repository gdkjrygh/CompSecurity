// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.ats;

import java.util.ArrayList;
import me.lyft.android.common.Objects;

public class ATSError
{

    private ArrayList errors;
    private String message;

    public ATSError()
    {
    }

    public ArrayList getErrors()
    {
        return (ArrayList)Objects.firstNonNull(errors, new ArrayList());
    }

    public String getMessage()
    {
        return (String)Objects.firstNonNull(message, "");
    }

    public void setError(String s)
    {
        message = s;
    }
}
