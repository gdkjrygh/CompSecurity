// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import org.c.c.l;
import org.c.e.a.c;

public class HttpUtil
{

    public HttpUtil()
    {
    }

    public static boolean isHttpErrorCausedByCode(Exception exception, l l)
    {
        return exception != null && (exception instanceof c) && ((c)exception).getStatusCode() == l;
    }
}
