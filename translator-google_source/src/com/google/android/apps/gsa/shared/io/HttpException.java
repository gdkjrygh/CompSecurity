// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.android.apps.gsa.shared.exception.GsaBaseIOException;
import com.google.common.base.p;
import java.util.Collections;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            o

public class HttpException extends GsaBaseIOException
{

    private final o mResponseData;

    public HttpException(int i, String s)
    {
        super((new StringBuilder(String.valueOf(s).length() + 12)).append(i).append(" ").append(s).toString());
        mResponseData = new o(i, s, Collections.emptyMap());
    }

    public HttpException(o o1)
    {
        int i = o1.a;
        String s = o1.b;
        super((new StringBuilder(String.valueOf(s).length() + 12)).append(i).append(" ").append(s).toString());
        mResponseData = (o)p.a(o1);
    }

    public int getErrorCode()
    {
        return mResponseData.a;
    }

    public int getErrorType()
    {
        return 212;
    }

    public o getResponseData()
    {
        return mResponseData;
    }

    public boolean isAuthError()
    {
        return getErrorCode() == 401;
    }
}
