// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.analytics.Analytics;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.calling:
//            DaggerVideoMonitorComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerVideoMonitorComponent this$0;
    final ilder val$builder;

    public final Analytics get()
    {
        Analytics analytics = skypeApplicationComponent.analytics();
        if (analytics == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return analytics;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    ilder()
    {
        this$0 = final_daggervideomonitorcomponent;
        val$builder = ilder.this;
        super();
        skypeApplicationComponent = ilder.access._mth100(val$builder);
    }
}
