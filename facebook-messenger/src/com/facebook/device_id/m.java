// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;

// Referenced classes of package com.facebook.device_id:
//            i

class m
    implements b
{

    private static final Class a = com/facebook/device_id/m;
    private d b;

    m()
    {
    }

    private void a(Context context)
    {
        g.a(context);
        b = (d)t.a(context).a(com/facebook/prefs/shared/d);
    }

    public void a(Context context, Intent intent, c c1)
    {
        com.facebook.debug.log.b.b(a, "answering device id query");
        long l1;
        if (c1.getResultCode() == -1)
        {
            intent = c1.getResultData();
            long l = c1.getResultExtras(true).getLong("device_id_generated_timestamp_ms", 0x7fffffffffffffffL);
            if (intent != null && System.currentTimeMillis() - l > 0xa4cb800L)
            {
                com.facebook.debug.log.b.b(a, "stable device id already found skipping");
                return;
            }
            intent = new i(intent, l);
        } else
        {
            intent = null;
        }
        a(context);
        context = b.a(aj.e, null);
        l1 = b.a(aj.f, 0x7fffffffffffffffL);
        if (context == null || l1 == 0x7fffffffffffffffL)
        {
            com.facebook.debug.log.b.b(a, "no id found");
            return;
        }
        if (intent != null && l1 > intent.b())
        {
            com.facebook.debug.log.b.b(a, "previously broadcasted device id is older. skipping");
            return;
        } else
        {
            c1.setResultCode(-1);
            c1.setResultData(context);
            intent = new Bundle();
            intent.putLong("device_id_generated_timestamp_ms", l1);
            c1.setResultExtras(intent);
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("device id found: ").append(context).toString());
            return;
        }
    }

}
