// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import com.skype.SkyLib;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.search:
//            ContactSearchResultAdapter

public final class ContactSearchResultAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider contactUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider groupAvatarUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;
    private final Provider typeFaceFactoryProvider;

    public ContactSearchResultAdapter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6)
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
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        groupAvatarUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            typeFaceFactoryProvider = provider6;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new ContactSearchResultAdapter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public final ContactSearchResultAdapter get()
    {
        ContactSearchResultAdapter contactsearchresultadapter = new ContactSearchResultAdapter((Activity)activityProvider.get(), (ImageCache)imageCacheProvider.get(), (ContactUtil)contactUtilProvider.get(), (GroupAvatarUtil)groupAvatarUtilProvider.get(), (DefaultAvatars)defaultAvatarsProvider.get(), (SkyLib)libProvider.get(), (TypeFaceFactory)typeFaceFactoryProvider.get());
        membersInjector.injectMembers(contactsearchresultadapter);
        return contactsearchresultadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/search/ContactSearchResultAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
