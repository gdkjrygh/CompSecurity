// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.features;

import android.content.SharedPreferences;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration.features:
//            FeatureStorage

class this._cls0
    implements f
{

    final FeatureStorage this$0;

    public Boolean call(String s)
    {
        return Boolean.valueOf(FeatureStorage.access$000(FeatureStorage.this).getBoolean(s, false));
    }

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    ()
    {
        this$0 = FeatureStorage.this;
        super();
    }
}
