// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.application;

import com.facebook.common.build.config.BuildConfig;

// Referenced classes of package com.facebook.config.application:
//            FbAppType

public class FbAppTypeSelector
{

    public FbAppTypeSelector()
    {
    }

    public static FbAppType a(FbAppType fbapptype, FbAppType fbapptype1, FbAppType fbapptype2)
    {
        String s = BuildConfig.d;
        if ("inhouse".equals(s))
        {
            return fbapptype1;
        }
        if ("debug".equals(s))
        {
            return fbapptype;
        } else
        {
            return fbapptype2;
        }
    }
}
