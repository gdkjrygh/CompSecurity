// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.prompt;

import android.content.Context;
import com.dominos.android.sdk.data.http.cdn.ContentRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.prompt:
//            PromptAPI

public final class PromptAPI_ extends PromptAPI
{

    private Context context_;

    private PromptAPI_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static PromptAPI_ getInstance_(Context context)
    {
        return new PromptAPI_(context);
    }

    private void init_()
    {
        mContentRestClient = ContentRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
