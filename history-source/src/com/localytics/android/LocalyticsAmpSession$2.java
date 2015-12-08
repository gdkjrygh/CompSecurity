// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.localytics.android:
//            LocalyticsAmpSession, AmpSessionHandler

class val.remappedAttributes
    implements Runnable
{

    final LocalyticsAmpSession this$0;
    final Map val$attributes;
    final String val$eventString;
    final AmpSessionHandler val$handler;
    final TreeMap val$remappedAttributes;

    public void run()
    {
        AmpSessionHandler ampsessionhandler = val$handler;
        AmpSessionHandler ampsessionhandler1 = val$handler;
        String s = val$eventString;
        Object obj;
        if (val$attributes == null)
        {
            obj = null;
        } else
        {
            obj = val$remappedAttributes;
        }
        ampsessionhandler.sendMessage(ampsessionhandler1.obtainMessage(13, ((Object) (new Object[] {
            s, obj
        }))));
    }

    ()
    {
        this$0 = final_localyticsampsession;
        val$handler = ampsessionhandler;
        val$eventString = s;
        val$attributes = map;
        val$remappedAttributes = TreeMap.this;
        super();
    }
}
