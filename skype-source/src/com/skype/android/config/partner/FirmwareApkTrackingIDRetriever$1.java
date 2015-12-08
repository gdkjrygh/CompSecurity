// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.skype.android.config.partner:
//            FirmwareApkTrackingIDRetriever

final class this._cls0
    implements FilenameFilter
{

    final FirmwareApkTrackingIDRetriever this$0;

    public final boolean accept(File file, String s)
    {
        return s.endsWith("apk") && s.startsWith("skype_raider_stub");
    }

    ()
    {
        this$0 = FirmwareApkTrackingIDRetriever.this;
        super();
    }
}
