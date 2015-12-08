// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            MediaSaveToGalleryAgent

public final class MediaSaveToGalleryAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final MembersInjector membersInjector;

    public MediaSaveToGalleryAgent_Factory(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider)
    {
        return new MediaSaveToGalleryAgent_Factory(membersinjector, provider);
    }

    public final MediaSaveToGalleryAgent get()
    {
        MediaSaveToGalleryAgent mediasavetogalleryagent = new MediaSaveToGalleryAgent((Application)contextProvider.get());
        membersInjector.injectMembers(mediasavetogalleryagent);
        return mediasavetogalleryagent;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/MediaSaveToGalleryAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
