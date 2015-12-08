// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            ChangeGroupPictureDialog

public final class ChangeGroupPictureDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider asyncServiceProvider;
    private final Provider imageCacheProvider;
    private final Provider objectInterfaceFinderProvider;

    public ChangeGroupPictureDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            asyncServiceProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ChangeGroupPictureDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAsyncService(ChangeGroupPictureDialog changegrouppicturedialog, Provider provider)
    {
        changegrouppicturedialog.asyncService = (AsyncService)provider.get();
    }

    public static void injectImageCache(ChangeGroupPictureDialog changegrouppicturedialog, Provider provider)
    {
        changegrouppicturedialog.imageCache = (ImageCache)provider.get();
    }

    public final void injectMembers(ChangeGroupPictureDialog changegrouppicturedialog)
    {
        if (changegrouppicturedialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(changegrouppicturedialog, objectInterfaceFinderProvider);
            changegrouppicturedialog.imageCache = (ImageCache)imageCacheProvider.get();
            changegrouppicturedialog.asyncService = (AsyncService)asyncServiceProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ChangeGroupPictureDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ChangeGroupPictureDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
