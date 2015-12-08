// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.Iterator;
import java.util.TimerTask;
import java.util.Vector;

// Referenced classes of package com.akamai.android.analytics:
//            LineSender, Utils, PluginEvent, AnalyticsPlugin

class this._cls0 extends TimerTask
{

    final LineSender this$0;

    public void run()
    {
        Iterator iterator = LineSender.access$0(LineSender.this).iterator();
_L1:
        if (!iterator.hasNext())
        {
            stop();
            return;
        }
        try
        {
            String s = (String)iterator.next();
            Utils.httpSend(s, true);
            AnalyticsPlugin.dispatchEvent(PluginEvent.LOGLINE, s);
        }
        catch (Exception exception)
        {
            return;
        }
          goto _L1
    }

    in()
    {
        this$0 = LineSender.this;
        super();
    }
}
