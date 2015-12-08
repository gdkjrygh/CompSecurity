// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.caption;

import com.nbcsports.liveextra.library.configuration.Configuration;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.caption.caption:
//            CaptionPreviewHelper

public final class CaptionPreviewHelper_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;

    public CaptionPreviewHelper_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new CaptionPreviewHelper_Factory(provider);
    }

    public CaptionPreviewHelper get()
    {
        return new CaptionPreviewHelper((Configuration)configurationProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/caption/caption/CaptionPreviewHelper_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
