// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            MojiPreviewDialogFragment, PickerDialogFragment

public final class MojiPreviewDialogFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider mapProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider objectInterfaceFinderProvider;

    public MojiPreviewDialogFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        analyticsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new MojiPreviewDialogFragment_MembersInjector(provider, provider1, provider2, provider3);
    }

    public static void injectAnalytics(MojiPreviewDialogFragment mojipreviewdialogfragment, Provider provider)
    {
        mojipreviewdialogfragment.analytics = (Analytics)provider.get();
    }

    public static void injectMap(MojiPreviewDialogFragment mojipreviewdialogfragment, Provider provider)
    {
        mojipreviewdialogfragment.map = (ObjectIdMap)provider.get();
    }

    public final void injectMembers(MojiPreviewDialogFragment mojipreviewdialogfragment)
    {
        if (mojipreviewdialogfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(mojipreviewdialogfragment, objectInterfaceFinderProvider);
            mojipreviewdialogfragment.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            mojipreviewdialogfragment.analytics = (Analytics)analyticsProvider.get();
            mojipreviewdialogfragment.map = (ObjectIdMap)mapProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MojiPreviewDialogFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/MojiPreviewDialogFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
