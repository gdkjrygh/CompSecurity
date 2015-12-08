// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import com.skype.android.event.EventBus;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            MediaMessageAgent

public final class MediaMessageAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider applicationProvider;
    private final Provider eventBusProvider;
    private final Provider mapProvider;
    private final MembersInjector membersInjector;

    public MediaMessageAgent_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        applicationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new MediaMessageAgent_Factory(membersinjector, provider, provider1, provider2);
    }

    public final MediaMessageAgent get()
    {
        MediaMessageAgent mediamessageagent = new MediaMessageAgent((Application)applicationProvider.get(), (EventBus)eventBusProvider.get(), (ObjectIdMap)mapProvider.get());
        membersInjector.injectMembers(mediamessageagent);
        return mediamessageagent;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/MediaMessageAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
