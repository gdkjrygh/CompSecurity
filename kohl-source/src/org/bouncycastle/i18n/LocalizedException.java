// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.util.Locale;

// Referenced classes of package org.bouncycastle.i18n:
//            ErrorBundle

public class LocalizedException extends Exception
{

    private Throwable cause;
    protected ErrorBundle message;

    public LocalizedException(ErrorBundle errorbundle)
    {
        super(errorbundle.getText(Locale.getDefault()));
        message = errorbundle;
    }

    public LocalizedException(ErrorBundle errorbundle, Throwable throwable)
    {
        super(errorbundle.getText(Locale.getDefault()));
        message = errorbundle;
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }

    public ErrorBundle getErrorMessage()
    {
        return message;
    }
}
