// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.features;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration.features:
//            FeatureStorage

class val.name
    implements f
{

    final FeatureStorage this$0;
    final String val$name;

    public Boolean call(String s)
    {
        return Boolean.valueOf(s.equals((new StringBuilder()).append(val$name).append("_enabled").toString()));
    }

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    ()
    {
        this$0 = final_featurestorage;
        val$name = String.this;
        super();
    }
}
