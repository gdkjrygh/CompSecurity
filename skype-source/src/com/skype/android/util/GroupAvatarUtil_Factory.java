// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.android.app.media.MediaDocumentDownloadUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            GroupAvatarUtil, ImageCache

public final class GroupAvatarUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider imageCacheProvider;
    private final Provider mediaDocumentDownloadUtilProvider;

    public GroupAvatarUtil_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mediaDocumentDownloadUtilProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new GroupAvatarUtil_Factory(provider, provider1);
    }

    public final GroupAvatarUtil get()
    {
        return new GroupAvatarUtil((ImageCache)imageCacheProvider.get(), (MediaDocumentDownloadUtil)mediaDocumentDownloadUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/GroupAvatarUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
