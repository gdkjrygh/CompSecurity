// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.exception;

import java.io.IOException;

// Referenced classes of package com.google.android.apps.gsa.shared.exception:
//            a

public abstract class GsaBaseIOException extends IOException
    implements a
{

    public GsaBaseIOException(String s)
    {
        super(s);
    }

    public GsaBaseIOException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public Exception asException()
    {
        return this;
    }

    public abstract int getErrorCode();

    public abstract int getErrorType();

    public abstract boolean isAuthError();
}
