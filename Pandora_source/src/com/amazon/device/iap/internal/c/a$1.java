// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.device.iap.internal.util.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.amazon.device.iap.internal.c:
//            a, e, d

class a
    implements Runnable
{

    final Context a;
    final a b;

    public void run()
    {
        SharedPreferences sharedpreferences;
        Iterator iterator;
        e.a(com.amazon.device.iap.internal.c.a.b(), "perform house keeping! ");
        sharedpreferences = a.getSharedPreferences(com.amazon.device.iap.internal.c.a.c(), 0);
        iterator = sharedpreferences.getAll().keySet().iterator();
_L1:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        s = (String)iterator.next();
        d d1 = d.a(sharedpreferences.getString(s, null));
        if (System.currentTimeMillis() - d1.c() > (long)com.amazon.device.iap.internal.c.a.d())
        {
            e.a(com.amazon.device.iap.internal.c.a.b(), (new StringBuilder()).append("house keeping - try remove Receipt:").append(s).append(" since it's too old").toString());
            b.a(s);
        }
          goto _L1
        com.amazon.device.iap.internal.c.e e1;
        e1;
        e.a(com.amazon.device.iap.internal.c.a.b(), (new StringBuilder()).append("house keeping - try remove Receipt:").append(s).append(" since it's invalid ").toString());
        b.a(s);
          goto _L1
        Throwable throwable;
        throwable;
        e.a(com.amazon.device.iap.internal.c.a.b(), (new StringBuilder()).append("Error in running cleaning job:").append(throwable).toString());
    }

    (a a1, Context context)
    {
        b = a1;
        a = context;
        super();
    }
}
