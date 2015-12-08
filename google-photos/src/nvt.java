// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class nvt
{

    private static nvt d;
    public final Context a;
    public final Map b = new ConcurrentHashMap();
    public mfg c;

    private nvt(Context context)
    {
        a = context.getApplicationContext();
    }

    public static nvt a(Context context)
    {
        nvt;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new nvt(context);
        }
        context = d;
        nvt;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }
}
