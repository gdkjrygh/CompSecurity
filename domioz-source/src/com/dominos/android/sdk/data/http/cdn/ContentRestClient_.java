// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.cdn;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.data.http.cdn:
//            ContentRestClient, ContentRestInterface_

public final class ContentRestClient_ extends ContentRestClient
{

    private Context context_;

    private ContentRestClient_(Context context)
    {
        context_ = context;
        init_();
    }

    public static ContentRestClient_ getInstance_(Context context)
    {
        return new ContentRestClient_(context);
    }

    private void init_()
    {
        mContentServiceInterface = new ContentRestInterface_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
