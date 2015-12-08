// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;

public class WebViewAdUrlGenerator extends AdUrlGenerator
{

    private final boolean e;

    public WebViewAdUrlGenerator(Context context, boolean flag)
    {
        super(context);
        e = flag;
    }

    public String generateUrlString(String s)
    {
        a(s, "/m/ad");
        b("6");
        a(ClientMetadata.getInstance(a));
        a();
        a(e);
        return b();
    }
}
