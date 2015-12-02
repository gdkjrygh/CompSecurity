// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package android_src.mms.g:
//            l

class m extends BroadcastReceiver
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"com.android.mms.RATE_LIMIT_CONFIRMED".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        this;
        JVM INSTR monitorenter ;
        context = a;
        int i;
        if (intent.getBooleanExtra("answer", false))
        {
            i = 1;
        } else
        {
            i = 2;
        }
        l.a(context, i);
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }
}
