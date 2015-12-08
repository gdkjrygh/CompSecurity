// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.content.Intent;
import com.aviary.android.feather.cds.billing.util.c;
import com.aviary.android.feather.cds.billing.util.e;
import com.aviary.android.feather.cds.billing.util.f;
import com.aviary.android.feather.cds.i;
import com.aviary.android.feather.cds.j;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, IAviaryController, LocalDataService

public class IAPService extends BaseContextService
    implements i
{

    public static final int e = com/aviary/android/feather/library/services/IAPService.hashCode();
    j d;
    private final Object f = new Object();

    public IAPService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
    }

    public e a()
    {
        if (g() != null)
        {
            return g().a();
        } else
        {
            return null;
        }
    }

    public f a(boolean flag, List list, List list1)
        throws c
    {
        return g().a(flag, list, list1);
    }

    public void a(com.aviary.android.feather.cds.billing.util.d.d d1)
    {
        g().a(d1);
    }

    public void a(String s, com.aviary.android.feather.cds.billing.util.d.c c1, String s1)
    {
        g().a(d().b(), s, e, c1, s1);
    }

    public boolean a(int k, int l, Intent intent)
    {
        return g().a(k, l, intent);
    }

    public void b()
    {
        synchronized (f)
        {
            if (d != null)
            {
                d.e();
            }
            d = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b_()
    {
        if (g() != null)
        {
            return g().b_();
        } else
        {
            return false;
        }
    }

    public boolean c()
    {
        if (g() != null)
        {
            return g().c();
        } else
        {
            return false;
        }
    }

    public final j g()
    {
        synchronized (f)
        {
            if (d == null && d() != null)
            {
                LocalDataService localdataservice = (LocalDataService)d().a(com/aviary/android/feather/library/services/LocalDataService);
                d = j.a(d().a(), (String)localdataservice.a("extra-billing-public-key", ""));
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
