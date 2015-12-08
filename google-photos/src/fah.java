// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class fah
    implements fai
{

    private final Context a;
    private final faj b;
    private final Set c = new HashSet();
    private final noz d;

    fah(Context context, faj faj1)
    {
        a = context;
        b = faj1;
        d = noz.a(context, 2, "DatabaseProcessorMngr", new String[0]);
    }

    private SharedPreferences b()
    {
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = a.getSharedPreferences("com.google.android.apps.photos.dbprocessor.impl.DatabaseProcessorManagerImpl", 0);
        this;
        JVM INSTR monitorexit ;
        return sharedpreferences;
        Exception exception;
        exception;
        throw exception;
    }

    private static String c(fab fab1)
    {
        p.a(fab1.a(), "source must not be empty");
        p.a(fab1.b(), "identifier must not be empty");
        String s = String.valueOf(fab1.a());
        fab1 = String.valueOf(fab1.b());
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(fab1).length())).append(s).append(":").append(fab1).toString();
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.a().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (fad)b.a(obj);
            Iterator iterator1 = ((fad) (obj)).b().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj1 = (fab)iterator1.next();
                if (!a(((fab) (obj1))))
                {
                    obj1 = ((fad) (obj)).a(((fab) (obj1)));
                    if (((ezz) (obj1)).b())
                    {
                        arraylist.add(obj1);
                    }
                }
            }
        }

        return arraylist;
    }

    public final boolean a(fab fab1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1;
        p.a(fab1);
        flag1 = c.contains(fab1);
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag1 = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        fad fad1 = (fad)b.a(fab1.a());
        if (fad1 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        fab1 = String.valueOf(fab1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(fab1).length() + 59)).append("No provider found for database processor. Did you bind it? ").append(fab1).toString());
        fab1;
        this;
        JVM INSTR monitorexit ;
        throw fab1;
        Iterator iterator = fad1.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_294;
            }
        } while (!((fab)iterator.next()).b().equals(fab1.b()));
        for (boolean flag = true; flag; flag = false)
        {
            break MISSING_BLOCK_LABEL_197;
        }

        fab1 = String.valueOf(fab1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(fab1).length() + 40)).append("Database processor not in any provider: ").append(fab1).toString());
        if (!b().getBoolean(c(fab1), false))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        c.add(fab1);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
        if (fad1.a(fab1).b())
        {
            break MISSING_BLOCK_LABEL_288;
        }
        if (d.a())
        {
            noy.a("processor", fab1.b());
        }
        b(fab1);
        c.add(fab1);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
        flag1 = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(fab fab1)
    {
        this;
        JVM INSTR monitorenter ;
        b().edit().putBoolean(c(fab1), true).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        fab1;
        throw fab1;
    }
}
