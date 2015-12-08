// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.creators.record.RecordActivity", "members/com.soundcloud.android.creators.record.RecordFragment", "members/com.soundcloud.android.creators.upload.MetadataFragment", "members/com.soundcloud.android.creators.upload.UploadMonitorFragment", "members/com.soundcloud.android.creators.record.UploadActivity"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final RecordModule newModule()
    {
        return new RecordModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/creators/record/RecordModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
