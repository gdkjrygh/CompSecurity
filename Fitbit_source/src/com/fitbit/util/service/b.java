// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.fitbit.data.bl.SyncService;
import com.fitbit.e.a;
import java.util.UUID;

// Referenced classes of package com.fitbit.util.service:
//            g, DispatcherService, d, c

public abstract class com.fitbit.util.service.b
    implements g
{
    public static class a
        implements d
    {

        private final b a;

        public void a(c c1, int i, Bundle bundle)
        {
            switch (i)
            {
            default:
                throw new IllegalArgumentException();

            case 1: // '\001'
                a.b();
                return;

            case 2: // '\002'
                a.a();
                c1.k();
                return;

            case 0: // '\0'
                a.a((Exception)bundle.get("exception"));
                c1.k();
                return;
            }
        }

        public a(b b1)
        {
            a = b1;
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(Exception exception);

        public abstract void b();
    }


    private static final String a = "AbstractServiceTask";
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private boolean e;
    private boolean f;

    public com.fitbit.util.service.b()
    {
    }

    public static Intent a(Context context, UUID uuid)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.util.service.DispatcherService.ACTION_CANCEL");
        context.putExtra("com.fitbit.util.service.DispatcherService.GUID", uuid);
        return context;
    }

    private static ResultReceiver a(Intent intent)
    {
        return (ResultReceiver)intent.getParcelableExtra("callback");
    }

    private final void a(ResultReceiver resultreceiver, Exception exception)
    {
        com.fitbit.e.a.e("AbstractServiceTask", exception);
        Bundle bundle = new Bundle();
        bundle.putSerializable("exception", exception);
        if (resultreceiver != null)
        {
            resultreceiver.send(0, bundle);
        }
    }

    public void E_()
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception;

    public void a(DispatcherService dispatcherservice, Intent intent)
    {
        b((SyncService)dispatcherservice, intent);
    }

    protected void a(boolean flag)
    {
        f = flag;
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(SyncService syncservice, Intent intent)
    {
        ResultReceiver resultreceiver = a(intent);
        if (resultreceiver != null)
        {
            resultreceiver.send(1, null);
        }
        try
        {
            a(syncservice, intent, resultreceiver);
        }
        // Misplaced declaration of an exception variable
        catch (SyncService syncservice)
        {
            if (f)
            {
                a(resultreceiver, syncservice);
                return;
            } else
            {
                throw syncservice;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SyncService syncservice)
        {
            a(resultreceiver, syncservice);
            return;
        }
        if (resultreceiver == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        resultreceiver.send(2, null);
    }

    public boolean b()
    {
        return true;
    }
}
