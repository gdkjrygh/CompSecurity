// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.content.DialogInterface;
import com.soundcloud.android.offline.OfflineContentOperations;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineSettingsFragment

class this._cls0
    implements android.content.tener
{

    final OfflineSettingsFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        OfflineSettingsFragment.access$200(OfflineSettingsFragment.this).a(offlineContentOperations.clearOfflineContent().observeOn(a.a()).subscribe(new earOfflineContentSubscriber(OfflineSettingsFragment.this, null)));
    }

    earOfflineContentSubscriber()
    {
        this$0 = OfflineSettingsFragment.this;
        super();
    }
}
