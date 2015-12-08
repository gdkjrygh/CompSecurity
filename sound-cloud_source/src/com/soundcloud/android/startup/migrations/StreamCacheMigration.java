// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import com.soundcloud.android.Consts;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            Migration

class StreamCacheMigration
    implements Migration
{

    StreamCacheMigration()
    {
    }

    public void applyMigration()
    {
        IOUtils.cleanDirs(new File[] {
            Consts.EXTERNAL_MEDIAPLAYER_STREAM_DIRECTORY, Consts.EXTERNAL_SKIPPY_STREAM_DIRECTORY
        });
    }

    public int getApplicableAppVersionCode()
    {
        return 254;
    }
}
