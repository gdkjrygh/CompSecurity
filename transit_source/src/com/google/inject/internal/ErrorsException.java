// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            Errors

public class ErrorsException extends Exception
{

    private final Errors errors;

    public ErrorsException(Errors errors1)
    {
        errors = errors1;
    }

    public Errors getErrors()
    {
        return errors;
    }
}
