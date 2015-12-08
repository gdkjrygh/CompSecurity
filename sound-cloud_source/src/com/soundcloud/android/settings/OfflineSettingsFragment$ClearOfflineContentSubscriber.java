// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.offline.OfflineContentService;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.List;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineSettingsFragment

private final class <init> extends DefaultSubscriber
{

    final OfflineSettingsFragment this$0;

    public final volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public final void onNext(List list)
    {
        if (!list.isEmpty())
        {
            OfflineSettingsFragment.access$300(OfflineSettingsFragment.this);
        }
        OfflineContentService.stop(getActivity());
    }

    private ()
    {
        this$0 = OfflineSettingsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
