// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.util.SparseArray;

public final class eco
{

    private Service a;
    private SparseArray b;
    private int c;
    private final NotificationManager d;

    public eco(Service service)
    {
        b = new SparseArray();
        c = -1;
        a = service;
        d = (NotificationManager)service.getSystemService("notification");
    }

    private void b(int i, Notification notification)
    {
        a.startForeground(i, notification);
        c = i;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        b.remove(i);
        if (c != i) goto _L2; else goto _L1
_L1:
        a.stopForeground(true);
        c = -1;
        if (b.size() > 0)
        {
            i = b.keyAt(0);
            Notification notification = (Notification)b.get(i);
            d.cancel(i);
            b(i, notification);
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d.cancel(i);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i, Notification notification)
    {
        this;
        JVM INSTR monitorenter ;
        if (c != -1)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b(i, notification);
_L1:
        b.put(i, notification);
        this;
        JVM INSTR monitorexit ;
        return;
        d.notify(i, notification);
          goto _L1
        notification;
        throw notification;
    }
}
