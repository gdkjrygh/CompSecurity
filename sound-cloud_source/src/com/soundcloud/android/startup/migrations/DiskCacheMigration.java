// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import com.soundcloud.android.Consts;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            Migration

class DiskCacheMigration
    implements Migration
{

    DiskCacheMigration()
    {
    }

    public void applyMigration()
    {
        File file = new File(Consts.FILES_PATH, ".lrucache");
        if (file.exists())
        {
            IOUtils.deleteDir(file);
        }
    }

    public int getApplicableAppVersionCode()
    {
        return 158;
    }
}
