// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.offline.OfflineContentOperations;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration:
//            ConfigurationManager

class this._cls0
    implements f
{

    final ConfigurationManager this$0;

    public volatile Object call(Object obj)
    {
        return call((Void)obj);
    }

    public b call(Void void1)
    {
        return ConfigurationManager.access$000(ConfigurationManager.this).clearOfflineContent();
    }

    A()
    {
        this$0 = ConfigurationManager.this;
        super();
    }
}
