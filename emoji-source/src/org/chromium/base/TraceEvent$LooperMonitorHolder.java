// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            TraceEvent, CommandLine

private static final class itor
{

    private static final sInstance sInstance;

    static 
    {
        Object obj;
        if (CommandLine.getInstance().hasSwitch("enable-idle-tracing"))
        {
            obj = new itor(null);
        } else
        {
            obj = new init>(null);
        }
        sInstance = ((sInstance) (obj));
    }


    private itor()
    {
    }
}
