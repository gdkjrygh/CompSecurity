// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.SharedPreferences;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineSettingsStorage

class this._cls0
    implements f
{

    final OfflineSettingsStorage this$0;

    public Boolean call(String s)
    {
        return Boolean.valueOf(OfflineSettingsStorage.access$000(OfflineSettingsStorage.this).getBoolean(s, false));
    }

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    ()
    {
        this$0 = OfflineSettingsStorage.this;
        super();
    }
}
