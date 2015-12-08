// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.android.event.EventBus;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            UrlPreviewMediaAgent

public final class UrlPreviewMediaAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider eventBusProvider;

    public UrlPreviewMediaAgent_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new UrlPreviewMediaAgent_Factory(provider);
    }

    public final UrlPreviewMediaAgent get()
    {
        return new UrlPreviewMediaAgent((EventBus)eventBusProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/UrlPreviewMediaAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
