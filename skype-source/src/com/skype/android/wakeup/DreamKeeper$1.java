// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.wakeup:
//            DreamKeeper

final class a
    implements android.os.ck
{

    final DreamKeeper a;

    public final boolean handleMessage(Message message)
    {
        long l;
        long l1;
        if (1 != message.what)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        l1 = SystemClock.uptimeMillis();
        l = 0L;
        message = DreamKeeper.a(a);
        message;
        JVM INSTR monitorenter ;
        Object obj = DreamKeeper.a(a).iterator();
_L1:
        a a1;
        int i;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_146;
        }
        i = ((Integer)((Iterator) (obj)).next()).intValue();
        a1 = (a)DreamKeeper.b(a).get(i);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ((Iterator) (obj)).remove();
          goto _L1
        obj;
        message;
        JVM INSTR monitorexit ;
        throw obj;
        long l2 = a1.a();
        if (l1 < l2)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        ((Iterator) (obj)).remove();
        DreamKeeper.b(a).remove(i);
          goto _L1
        l = Math.max(l, l1 - l2);
          goto _L1
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        DreamKeeper.g().info("no intrusive wakeup items. Moving to background");
        DreamKeeper.c(a).clear();
        a.e();
_L2:
        message;
        JVM INSTR monitorexit ;
        return true;
        DreamKeeper.d(a).sendEmptyMessageDelayed(1, l);
          goto _L2
        DreamKeeper.g().warning((new StringBuilder("Ignored event: ")).append(message.what).toString());
        return false;
    }

    (DreamKeeper dreamkeeper)
    {
        a = dreamkeeper;
        super();
    }
}
