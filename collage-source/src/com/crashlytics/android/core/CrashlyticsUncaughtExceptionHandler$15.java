// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

class val.sessionId
    implements FilenameFilter
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final String val$sessionId;

    public boolean accept(File file, String s)
    {
        return s.startsWith(val$sessionId);
    }

    I()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$sessionId = String.this;
        super();
    }
}
