// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.common:
//            ConversionUtil

public final class ConversionUtil_ extends ConversionUtil
{

    private Context context_;

    private ConversionUtil_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static ConversionUtil_ getInstance_(Context context)
    {
        return new ConversionUtil_(context);
    }

    private void init_()
    {
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
