// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;


// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            c

static final class Type
{

    static final int a[];

    static 
    {
        a = new int[com.squareup.okhttp.ws.ocket.PayloadType.values().length];
        try
        {
            a[com.squareup.okhttp.ws.ocket.PayloadType.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.squareup.okhttp.ws.ocket.PayloadType.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
