// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;


// Referenced classes of package com.facebook.loom.logger:
//            LogEntry

final class  extends ThreadLocal
{

    private static LogEntry a()
    {
        return new LogEntry();
    }

    protected final Object initialValue()
    {
        return a();
    }

    ()
    {
    }
}
