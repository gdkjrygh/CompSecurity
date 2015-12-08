// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.events.CurrentDownloadEvent;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineSettingsFragment

private final class <init> extends DefaultSubscriber
{

    final OfflineSettingsFragment this$0;

    public final void onNext(CurrentDownloadEvent currentdownloadevent)
    {
        if (currentdownloadevent.kind == OfflineState.DOWNLOADED)
        {
            OfflineSettingsFragment.access$300(OfflineSettingsFragment.this);
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((CurrentDownloadEvent)obj);
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
