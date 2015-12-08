// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.bumptech.glide.load.a:
//            h

final class g
    implements h
{

    private g()
    {
    }

    g(byte byte0)
    {
        this();
    }

    public final HttpURLConnection a(URL url)
    {
        return (HttpURLConnection)url.openConnection();
    }
}
