// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

// Referenced classes of package com.akamai.android.analytics:
//            Utils, PluginEvent, AnalyticsPlugin

class LineSender extends Timer
{

    private static int noofLinesSent = 0;
    private Vector linesToSend;

    public LineSender(Vector vector)
    {
        StringBuilder stringbuilder = new StringBuilder("AkamaiBeaconSender");
        int i = noofLinesSent;
        noofLinesSent = i + 1;
        super(stringbuilder.append(i).toString());
        linesToSend = null;
        linesToSend = vector;
        try
        {
            start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Vector vector)
        {
            return;
        }
    }

    public void start()
    {
        schedule(new TimerTask() {

            final LineSender this$0;

            public void run()
            {
                Iterator iterator = linesToSend.iterator();
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

            
            {
                this$0 = LineSender.this;
                super();
            }
        }, 0L);
    }

    public void stop()
    {
        cancel();
        purge();
    }


}
