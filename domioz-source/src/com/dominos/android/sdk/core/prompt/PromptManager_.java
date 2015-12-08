// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.prompt;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.core.prompt:
//            PromptManager, PromptAPI_

public final class PromptManager_ extends PromptManager
{

    private Context context_;

    private PromptManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static PromptManager_ getInstance_(Context context)
    {
        return new PromptManager_(context);
    }

    private void init_()
    {
        mPromptAPI = PromptAPI_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
