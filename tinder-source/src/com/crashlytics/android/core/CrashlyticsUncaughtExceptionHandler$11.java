// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, MetaDataStore

class I
    implements Callable
{

    final Map a;
    final CrashlyticsUncaughtExceptionHandler b;

    private Void a()
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj = null;
        String s = com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.c(b);
        obj3 = new MetaDataStore(CrashlyticsUncaughtExceptionHandler.d(b));
        obj1 = a;
        obj3 = ((MetaDataStore) (obj3)).d(s);
        String s1;
        s1 = MetaDataStore.a(((Map) (obj1)));
        obj1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((java.io.File) (obj3))), MetaDataStore.a));
        obj = obj1;
        ((Writer) (obj1)).write(s1);
        obj = obj1;
        ((Writer) (obj1)).flush();
        CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close key/value metadata file.");
        return null;
        Object obj2;
        obj2;
        obj1 = null;
_L4:
        obj = obj1;
        c.a().c("CrashlyticsCore", "Error serializing key/value metadata.", ((Throwable) (obj2)));
        CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close key/value metadata file.");
        return null;
        obj2;
        obj1 = obj;
        obj = obj2;
_L2:
        CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close key/value metadata file.");
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object call()
        throws Exception
    {
        return a();
    }
}
