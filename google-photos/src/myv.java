// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;

final class myv
{

    private Set a;

    myv()
    {
        a = new lvg();
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.contains(s))
        {
            throw new IllegalArgumentException("Experiment fetch already in progress");
        }
        break MISSING_BLOCK_LABEL_30;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        a.add(s);
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean a(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.contains(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        long l;
        long l1;
        long l2;
        l = (new myj(context)).a().getLong(myj.b(s), 0L);
        l1 = ((muz)olm.a(context, muz)).a();
        l2 = ((myf)olm.a(context, myf)).b(myh.b, s).longValue();
        if (l1 - l >= l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public final void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.remove(s))
        {
            Log.e("ExpPreprocessor", "Trying to complete a sync that was not started.");
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(s);
        Log.e("ExpPreprocessor", "Sync failed due to network error.");
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
