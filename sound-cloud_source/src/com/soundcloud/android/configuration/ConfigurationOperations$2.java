// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.api.ApiClientRx;
import dagger.Lazy;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration:
//            ConfigurationOperations, Configuration

class this._cls0
    implements f
{

    final ConfigurationOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Long)obj);
    }

    public b call(Long long1)
    {
        return ((ApiClientRx)ConfigurationOperations.access$100(ConfigurationOperations.this).a()).mappedResponse(ConfigurationOperations.access$000(ConfigurationOperations.this).rations(), com/soundcloud/android/configuration/Configuration);
    }

    ()
    {
        this$0 = ConfigurationOperations.this;
        super();
    }
}
