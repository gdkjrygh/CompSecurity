// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.io.IOException;

public class UrlRequestException extends IOException
{

    UrlRequestException(String s, int i)
    {
        super(s, null);
    }

    UrlRequestException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
