// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.exception;

import com.google.android.apps.gsa.shared.util.common.L;

// Referenced classes of package com.google.android.apps.gsa.shared.exception:
//            GsaBaseIOException

public class GsaIOException extends GsaBaseIOException
{

    private final int mErrorCode;

    public GsaIOException(int i)
    {
        super((new StringBuilder(23)).append("Error code: ").append(i).toString());
        mErrorCode = a(i);
    }

    public GsaIOException(String s, int i)
    {
        super((new StringBuilder(String.valueOf(s).length() + 26)).append("Error code: ").append(i).append(" | ").append(s).toString());
        mErrorCode = a(i);
    }

    public GsaIOException(String s, Throwable throwable, int i)
    {
        String s1 = String.valueOf(throwable.getMessage());
        super((new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append("Error code: ").append(i).append(" | ").append(s).append(" | ").append(s1).toString(), throwable);
        mErrorCode = a(i);
    }

    public GsaIOException(Throwable throwable, int i)
    {
        String s = String.valueOf(throwable.getMessage());
        super((new StringBuilder(String.valueOf(s).length() + 26)).append("Error code: ").append(i).append(" | ").append(s).toString(), throwable);
        mErrorCode = a(i);
    }

    private static int a(int i)
    {
        if (i <= 0)
        {
            new com.google.android.apps.gsa.shared.util.common.L.DebugStackTraceLogger();
            L.a(4, "GsaIOException", "Error code (%d) must be greater than 0", new Object[] {
                Integer.valueOf(i)
            });
        }
        return i;
    }

    public Exception asException()
    {
        return this;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public int getErrorType()
    {
        return 211;
    }

    public boolean isAuthError()
    {
        return false;
    }
}
