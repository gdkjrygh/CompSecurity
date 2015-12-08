// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.app.Activity;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.widget:
//            GridListAdapterViewBuilder

public final class GridListAdapterViewBuilder_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider groupAvatarUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider mapProvider;

    public GridListAdapterViewBuilder_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            groupAvatarUtilProvider = provider5;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new GridListAdapterViewBuilder_Factory(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final GridListAdapterViewBuilder get()
    {
        return new GridListAdapterViewBuilder((Activity)contextProvider.get(), (ContactUtil)contactUtilProvider.get(), (ImageCache)imageCacheProvider.get(), (ObjectIdMap)mapProvider.get(), (DefaultAvatars)defaultAvatarsProvider.get(), (GroupAvatarUtil)groupAvatarUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/widget/GridListAdapterViewBuilder_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
