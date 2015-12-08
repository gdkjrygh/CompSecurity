// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class lhu
{

    public static final String a = lhu.getSimpleName();
    public static final long b;
    private static lhu h;
    public final Handler c;
    public final Runnable d;
    public final Object e;
    public ArrayList f;
    public ArrayList g;
    private final Context i;

    private lhu(Context context)
    {
        this((Context)b.d(context), new Handler(Looper.getMainLooper()));
    }

    private lhu(Context context, Handler handler)
    {
        d = new lhv(this);
        e = new Object();
        f = null;
        g = null;
        i = context;
        c = handler;
    }

    static Object a(lhu lhu1)
    {
        return lhu1.e;
    }

    static ArrayList a(lhu lhu1, ArrayList arraylist)
    {
        lhu1.f = null;
        return null;
    }

    public static lhu a(Context context)
    {
        lhu;
        JVM INSTR monitorenter ;
        int j;
        b.d(context);
        j = android.os.Build.VERSION.SDK_INT;
        if (j >= 14) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        lhu;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (h == null)
        {
            h = new lhu(context.getApplicationContext());
        }
        context = h;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    static ArrayList b(lhu lhu1)
    {
        return lhu1.f;
    }

    static ArrayList b(lhu lhu1, ArrayList arraylist)
    {
        lhu1.g = null;
        return null;
    }

    static ArrayList c(lhu lhu1)
    {
        return lhu1.g;
    }

    static Context d(lhu lhu1)
    {
        return lhu1.i;
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(1L);
    }
}
