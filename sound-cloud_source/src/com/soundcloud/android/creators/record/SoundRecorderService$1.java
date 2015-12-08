// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.app.Service;
import com.soundcloud.android.service.LocalBinder;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorderService

class this._cls0 extends LocalBinder
{

    final SoundRecorderService this$0;

    public volatile Service getService()
    {
        return getService();
    }

    public SoundRecorderService getService()
    {
        return SoundRecorderService.this;
    }

    ()
    {
        this$0 = SoundRecorderService.this;
        super();
    }
}
