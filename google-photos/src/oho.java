// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class oho
    implements ohj
{

    final Context a;
    final mmv b;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();
    private final ohk e = new ohk();
    private final Set f = new HashSet();

    oho(Context context, muz muz)
    {
        a = context;
        b = (mmv)olm.a(context, mmv);
        olm.b(context, ohf);
        olm.b(context, ohi);
        context = olm.c(context, ohh);
        int i = 0;
        while (i < context.size()) 
        {
            muz = (ohh)context.get(i);
            k k1 = muz.a();
            boolean flag;
            if (c.put(k1.B(), muz) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "Two synclets with same name: %s", new Object[] {
                k1.B()
            });
            d.put(k1.B(), k1);
            i++;
        }
    }

    void a(int i)
    {
label0:
        {
            synchronized (f)
            {
                if (f.contains(Integer.valueOf(i)))
                {
                    break label0;
                }
            }
            return;
        }
        f.remove(Integer.valueOf(i));
        if (f.isEmpty())
        {
            a.unregisterReceiver(e);
        }
        set;
        JVM INSTR monitorexit ;
        return;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        TimeUnit.MINUTES.toMillis(15L);
    }
}
