// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import ctz;
import hew;

// Referenced classes of package com.spotify.cosmos.android:
//            RxResolver

public class RxTypedResolver
{

    private Class mModelClass;
    private RxResolver mRxResolver;

    public RxTypedResolver(RxResolver rxresolver, Class class1)
    {
        mRxResolver = (RxResolver)ctz.a(rxresolver);
        mModelClass = (Class)ctz.a(class1);
    }

    public hew resolve(Request request)
    {
        return mRxResolver.resolve(request).a(JacksonResponseParser.forClass(mModelClass));
    }
}
