// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class lji
{

    private static final ljj d[] = new ljj[0];
    private static lji e;
    public final Application a;
    public ljq b;
    public ljt c;
    private final List f = new ArrayList();

    private lji(Application application)
    {
        b.d(application);
        a = application;
    }

    public static lji a(Context context)
    {
        b.d(context);
        context = (Application)context.getApplicationContext();
        b.d(context);
        lji;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new lji(context);
        }
        context = e;
        lji;
        JVM INSTR monitorexit ;
        return context;
        context;
        lji;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(ljj ljj1)
    {
        b.d(ljj1);
        synchronized (f)
        {
            f.remove(ljj1);
            f.add(ljj1);
        }
        return;
        ljj1;
        list;
        JVM INSTR monitorexit ;
        throw ljj1;
    }

    public ljj[] a()
    {
label0:
        {
            ljj aljj[];
            synchronized (f)
            {
                if (!f.isEmpty())
                {
                    break label0;
                }
                aljj = d;
            }
            return aljj;
        }
        ljj aljj1[] = (ljj[])f.toArray(new ljj[f.size()]);
        list;
        JVM INSTR monitorexit ;
        return aljj1;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
