// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.httpstack;


// Referenced classes of package com.netflix.mediaclient.httpstack:
//            HttpUrlStack, HttpStack

public final class HttpStackFactory
{

    private HttpStackFactory()
    {
    }

    public static final HttpStack getHttpStack()
    {
        return new HttpUrlStack();
    }
}
