// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

final class lvf extends ContentObserver
{

    private lve a;

    lvf(lve lve1, Handler handler)
    {
        a = lve1;
        super(handler);
    }

    public final void onChange(boolean flag)
    {
        lvd;
        JVM INSTR monitorenter ;
        lvd.a().clear();
        lvd.a(new Object());
        if (lvd.b().length > 0)
        {
            lvd.a(a.a, lvd.b());
        }
        lvd;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        lvd;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
