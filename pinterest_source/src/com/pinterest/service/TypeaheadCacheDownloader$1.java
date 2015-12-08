// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.reporting.CrashReporting;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.service:
//            TypeaheadCacheDownloader, PinterestWorkerService

class this._cls0
    implements Runnable
{

    final TypeaheadCacheDownloader this$0;

    public void run()
    {
        Object obj;
        if (TypeaheadCacheDownloader.access$000(TypeaheadCacheDownloader.this) == null || TypeaheadCacheDownloader.access$000(TypeaheadCacheDownloader.this).size() == 0 || TypeaheadCacheDownloader.access$100(TypeaheadCacheDownloader.this))
        {
            return;
        }
        Iterator iterator;
        Exception exception;
        String s;
        boolean flag;
        try
        {
            Thread.sleep(8000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CrashReporting.a(((Throwable) (obj)));
        }
        obj = TypeaheadCacheDownloader.access$200(TypeaheadCacheDownloader.this);
        obj;
        JVM INSTR monitorenter ;
        ModelHelper.deleteAllSearchTypeahead();
        iterator = TypeaheadCacheDownloader.access$000(TypeaheadCacheDownloader.this).iterator();
_L9:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        s = (String)iterator.next();
        if (TypeaheadCacheDownloader.access$100(TypeaheadCacheDownloader.this)) goto _L4; else goto _L3
_L3:
        if (!TypeaheadCacheDownloader.access$400(TypeaheadCacheDownloader.this, s, TypeaheadCacheDownloader.access$300(TypeaheadCacheDownloader.this))) goto _L6; else goto _L5
_L5:
        TypeaheadCacheDownloader.access$102(TypeaheadCacheDownloader.this, true);
_L4:
        flag = TypeaheadCacheDownloader.access$100(TypeaheadCacheDownloader.this);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        PLog.log("Download in progress, waiting...", new Object[0]);
        TypeaheadCacheDownloader.access$200(TypeaheadCacheDownloader.this).wait();
        TypeaheadCacheDownloader.access$600(TypeaheadCacheDownloader.this);
_L7:
        TypeaheadCacheDownloader.access$502(Preferences.persisted().getInt("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", 0));
        TypeaheadCacheDownloader.access$502(TypeaheadCacheDownloader.access$500() + 1);
        Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", TypeaheadCacheDownloader.access$500());
        continue; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L6:
        PLog.log((new StringBuilder("Cache downlaod failed partition: ")).append(TypeaheadCacheDownloader.access$500()).toString(), new Object[0]);
          goto _L4
        Exception exception2;
        exception2;
        TypeaheadCacheDownloader.access$600(TypeaheadCacheDownloader.this);
          goto _L7
        Exception exception1;
        exception1;
        TypeaheadCacheDownloader.access$600(TypeaheadCacheDownloader.this);
        throw exception1;
_L2:
        PLog.log("Download task exiting and closing service! No more downloads!", new Object[0]);
        Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", 0);
        Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_READY", true);
        if (TypeaheadCacheDownloader.access$700(TypeaheadCacheDownloader.this) != null)
        {
            TypeaheadCacheDownloader.access$700(TypeaheadCacheDownloader.this).onWorkerComplete();
            TypeaheadCacheDownloader.access$702(TypeaheadCacheDownloader.this, null);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    ()
    {
        this$0 = TypeaheadCacheDownloader.this;
        super();
    }
}
