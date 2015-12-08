// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration:
//            Configuration, UserPlan, ConfigurationOperations

class val.plan
    implements f
{

    final ConfigurationOperations this$0;
    final String val$plan;

    public Boolean call(Configuration configuration)
    {
        boolean flag;
        if (!configuration.plan.id.equals(val$plan))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((Configuration)obj);
    }

    ()
    {
        this$0 = final_configurationoperations;
        val$plan = String.this;
        super();
    }
}
