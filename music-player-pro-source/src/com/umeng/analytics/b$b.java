// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import com.umeng.common.Log;
import org.json.JSONObject;

// Referenced classes of package com.umeng.analytics:
//            b, d

private final class d
    implements Runnable
{

    final b a;
    private final Object b = new Object();
    private Context c;
    private JSONObject d;

    public void run()
    {
        try
        {
            if (d.getString("type").equals("online_config"))
            {
                com.umeng.analytics.b.a(a, c, d);
                return;
            }
        }
        catch (Exception exception)
        {
            Log.b("MobclickAgent", "Exception occurred in ReportMessageHandler");
            exception.printStackTrace();
            return;
        }
        if (d.getString("type").equals("cmd_cache_buffer"))
        {
            synchronized (b)
            {
                com.umeng.analytics.b.a(a).a(c);
            }
            return;
        }
        break MISSING_BLOCK_LABEL_92;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        if (d.getString("type").equals("flush"))
        {
            synchronized (b)
            {
                com.umeng.analytics.b.a(a).a(c);
                a.a(c, d);
            }
            return;
        }
        break MISSING_BLOCK_LABEL_153;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        synchronized (b)
        {
            com.umeng.analytics.b.a(a).a(c);
            a.a(c, d);
        }
        return;
        exception3;
        obj2;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    (b b1, b b2, Context context, JSONObject jsonobject)
    {
        a = b1;
        super();
        c = context.getApplicationContext();
        d = jsonobject;
    }
}
