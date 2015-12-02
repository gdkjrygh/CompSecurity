// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import java.io.Closeable;

// Referenced classes of package com.facebook.loom.logger:
//            LogEntry

public abstract class LogWriter
    implements Closeable
{

    public LogWriter()
    {
    }

    public abstract long a(LogEntry logentry);
}
