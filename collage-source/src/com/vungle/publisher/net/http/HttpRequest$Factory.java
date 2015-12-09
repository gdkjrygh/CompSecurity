// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import android.os.Bundle;
import android.text.TextUtils;
import com.vungle.publisher.bt;

// Referenced classes of package com.vungle.publisher.net.http:
//            HttpRequest

public static abstract class 
{

    protected bt b;

    public abstract HttpRequest b();

    public HttpRequest c()
    {
        HttpRequest httprequest = b();
        Bundle bundle = new Bundle();
        String s = b.s();
        if (!TextUtils.isEmpty(s))
        {
            bundle.putString("User-Agent", s);
        }
        httprequest.c = bundle;
        return httprequest;
    }

    public ()
    {
    }
}
