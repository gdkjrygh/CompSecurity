// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import com.facebook.analytics.event.HoneyClientEventFast;
import com.facebook.analytics.logger.AnalyticsLogger;

// Referenced classes of package com.facebook.loom.logger:
//            FileManager

class a
    implements Runnable
{

    final FileManager a;

    public void run()
    {
        if (FileManager.a(a) != null)
        {
            HoneyClientEventFast honeyclienteventfast = FileManager.a(a).a("dextr_trace_trimmed", false);
            if (honeyclienteventfast.a())
            {
                honeyclienteventfast.b();
            }
        }
    }

    tEventFast(FileManager filemanager)
    {
        a = filemanager;
        super();
    }
}
