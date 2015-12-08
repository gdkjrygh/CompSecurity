// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            Processor

public final class  extends b
    implements a
{

    private b eventBus;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/creators/upload/Processor, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
    }

    public final void injectMembers(Processor processor)
    {
        processor.eventBus = (EventBus)eventBus.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((Processor)obj);
    }

    public ()
    {
        super(null, "members/com.soundcloud.android.creators.upload.Processor", false, com/soundcloud/android/creators/upload/Processor);
    }
}
