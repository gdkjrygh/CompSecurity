// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.chat.picker.MRUManager;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            MediaPickerSearchFragment

public final class MediaPickerSearchFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider mapProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider mruManagerProvider;
    private final Provider objectInterfaceFinderProvider;

    public MediaPickerSearchFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        mediaContentRosterProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mruManagerProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider4;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new MediaPickerSearchFragment_MembersInjector(provider, provider1, provider2, provider3, provider4);
    }

    public static void injectAnalytics(MediaPickerSearchFragment mediapickersearchfragment, Provider provider)
    {
        mediapickersearchfragment.analytics = (Analytics)provider.get();
    }

    public static void injectMap(MediaPickerSearchFragment mediapickersearchfragment, Provider provider)
    {
        mediapickersearchfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaContentRoster(MediaPickerSearchFragment mediapickersearchfragment, Provider provider)
    {
        mediapickersearchfragment.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public static void injectMruManager(MediaPickerSearchFragment mediapickersearchfragment, Provider provider)
    {
        mediapickersearchfragment.mruManager = (MRUManager)provider.get();
    }

    public final void injectMembers(MediaPickerSearchFragment mediapickersearchfragment)
    {
        if (mediapickersearchfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mediapickersearchfragment, objectInterfaceFinderProvider);
            mediapickersearchfragment.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            mediapickersearchfragment.map = (ObjectIdMap)mapProvider.get();
            mediapickersearchfragment.mruManager = (MRUManager)mruManagerProvider.get();
            mediapickersearchfragment.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MediaPickerSearchFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/Search/MediaPickerSearchFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
