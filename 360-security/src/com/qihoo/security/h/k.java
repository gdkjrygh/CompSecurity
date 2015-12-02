// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.h;

import android.content.Context;
import com.qihoo.security.SecurityApplication;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.h:
//            j, g

public final class k
{

    private static k c;
    private final Context a;
    private final Map b = d();
    private final HashSet d = new HashSet();

    private k(Context context)
    {
        a = context.getApplicationContext();
        c();
    }

    public static k a()
    {
        com/qihoo/security/h/k;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new k(SecurityApplication.a());
        }
        com/qihoo/security/h/k;
        JVM INSTR monitorexit ;
        return c;
        Exception exception;
        exception;
        com/qihoo/security/h/k;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b(int i)
    {
    }

    private void c()
    {
        Integer integer;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); d.add(integer))
        {
            integer = (Integer)iterator.next();
        }

    }

    private HashMap d()
    {
        HashMap hashmap = new HashMap();
        j j1 = new j(0, a);
        j1.a("android.permission.READ_SMS");
        j1.a("android.permission.WRITE_SMS");
        hashmap.put(Integer.valueOf(j1.a), j1);
        j1 = new j(1, a);
        j1.a("android.permission.READ_CONTACTS");
        j1.a("android.permission.WRITE_CONTACTS");
        hashmap.put(Integer.valueOf(j1.a), j1);
        j1 = new j(2, a);
        j1.a("android.permission.READ_CONTACTS");
        j1.a("android.permission.WRITE_CONTACTS");
        hashmap.put(Integer.valueOf(j1.a), j1);
        j1 = new j(4, a);
        j1.a("android.permission.SEND_SMS");
        hashmap.put(Integer.valueOf(j1.a), j1);
        j1 = new j(5, a);
        j1.a("android.permission.ACCESS_FINE_LOCATION");
        j1.a("android.permission.ACCESS_COARSE_LOCATION");
        hashmap.put(Integer.valueOf(5), j1);
        j1 = new j(6, a);
        j1.a("android.permission.READ_PHONE_STATE");
        hashmap.put(Integer.valueOf(6), j1);
        hashmap.put(Integer.valueOf(8), new g(8, a));
        j1 = new j(10, a);
        j1.a("android.permission.CALL_PHONE");
        j1.a("android.permission.CALL_PRIVILEGED");
        hashmap.put(Integer.valueOf(10), j1);
        return hashmap;
    }

    public boolean a(int i)
    {
        return d.contains(Integer.valueOf(i));
    }

    public Collection b()
    {
        return b.values();
    }
}
