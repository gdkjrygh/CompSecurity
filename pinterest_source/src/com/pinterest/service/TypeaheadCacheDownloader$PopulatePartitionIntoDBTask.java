// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.base.Application;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.FileUtils;
import com.pinterest.reporting.CrashReporting;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.pinterest.service:
//            TypeaheadCacheDownloader

class _partitionData extends BackgroundTask
{

    private byte _partitionData[];
    final TypeaheadCacheDownloader this$0;

    public void run()
    {
        File file;
        file = new File(Application.context().getCacheDir(), "typeahead_temp_cache");
        file.delete();
        FileUtils.writeByteArrayToFile(file, _partitionData);
        if (file.exists())
        {
            TypeaheadCacheDownloader.access$800(TypeaheadCacheDownloader.this, file);
        }
        TypeaheadCacheDownloader.access$600(TypeaheadCacheDownloader.this);
        return;
        Object obj;
        obj;
        PLog.error(((Throwable) (obj)), "File IO exception", new Object[0]);
        CrashReporting.a(((Throwable) (obj)));
        TypeaheadCacheDownloader.access$600(TypeaheadCacheDownloader.this);
        return;
        obj;
        TypeaheadCacheDownloader.access$600(TypeaheadCacheDownloader.this);
        throw obj;
    }

    public (byte abyte0[])
    {
        this$0 = TypeaheadCacheDownloader.this;
        super();
        _partitionData = abyte0;
    }
}
