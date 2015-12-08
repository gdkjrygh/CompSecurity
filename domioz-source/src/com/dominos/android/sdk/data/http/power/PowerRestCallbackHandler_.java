// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestCallbackHandler

public final class PowerRestCallbackHandler_ extends PowerRestCallbackHandler
{

    private Context context_;

    private PowerRestCallbackHandler_(Context context)
    {
        context_ = context;
        init_();
    }

    public static PowerRestCallbackHandler_ getInstance_(Context context)
    {
        return new PowerRestCallbackHandler_(context);
    }

    private void init_()
    {
        appService = ApplicationService_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
