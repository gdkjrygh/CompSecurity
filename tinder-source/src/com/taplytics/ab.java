// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import java.lang.reflect.Method;

// Referenced classes of package com.taplytics:
//            ac, gs, z

final class ab
    implements Runnable
{

    final z a;

    ab(z z)
    {
        a = z;
        super();
    }

    public final void run()
    {
        Class class1 = Class.forName("com.flurry.android.FlurryAgent");
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        class1.getMethod("logEvent", new Class[] {
            java/lang/String
        }).invoke(class1, new Object[] {
            "app started"
        });
_L2:
        (new Handler()).postDelayed(new ac(this), 750L);
        return;
        Object obj;
        obj;
_L3:
        Exception exception;
        if (obj instanceof Exception)
        {
            exception = (Exception)obj;
        } else
        {
            exception = null;
        }
        gs.b("flr", exception);
        if (true) goto _L2; else goto _L1
_L1:
        exception;
          goto _L3
    }
}
