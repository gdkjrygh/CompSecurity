// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import android.app.Activity;
import android.view.View;
import com.facebook.base.activity.a;
import com.facebook.debug.log.b;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.common.v:
//            f

public class i extends a
{

    final f a;

    public i(f f1)
    {
        a = f1;
        super();
    }

    public void c(Activity activity)
    {
        Object obj = com.facebook.common.v.f.b(a);
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = f.c(a).keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view = (View)iterator.next();
            if (view.getContext() == activity)
            {
                b.b("UserInteraction", (new StringBuilder()).append("View ").append(view).append(" was still marked as interacting when its").append(" corresponding Activity was paused").toString());
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_104;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
        obj;
        JVM INSTR monitorexit ;
        com.facebook.common.v.f.a(a);
        return;
    }
}
