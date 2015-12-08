// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            AnnotationUtil, HeartsDialog

public final class HeartsDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider annotationUtilProvider;
    private final Provider contactUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider objectInterfaceFinderProvider;

    public HeartsDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        annotationUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            imageCacheProvider = provider4;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new HeartsDialog_MembersInjector(provider, provider1, provider2, provider3, provider4);
    }

    public static void injectAnnotationUtil(HeartsDialog heartsdialog, Provider provider)
    {
        heartsdialog.annotationUtil = (AnnotationUtil)provider.get();
    }

    public static void injectContactUtil(HeartsDialog heartsdialog, Provider provider)
    {
        heartsdialog.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectImageCache(HeartsDialog heartsdialog, Provider provider)
    {
        heartsdialog.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(HeartsDialog heartsdialog, Provider provider)
    {
        heartsdialog.lib = (SkyLib)provider.get();
    }

    public final void injectMembers(HeartsDialog heartsdialog)
    {
        if (heartsdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(heartsdialog, objectInterfaceFinderProvider);
            heartsdialog.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            heartsdialog.lib = (SkyLib)libProvider.get();
            heartsdialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            heartsdialog.imageCache = (ImageCache)imageCacheProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((HeartsDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/HeartsDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
