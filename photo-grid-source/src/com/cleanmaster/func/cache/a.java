// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.func.cache;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
{

    private static a a = new a();
    private Context b;
    private PackageManager c;
    private List d;

    public a()
    {
        b = PicksMob.getInstance().getContext();
        c = b.getPackageManager();
    }

    public static a a()
    {
        com/cleanmaster/func/cache/a;
        JVM INSTR monitorenter ;
        a a1 = a;
        com/cleanmaster/func/cache/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private List a(int i)
    {
        try
        {
            if (d == null)
            {
                d = c.getInstalledPackages(i);
            }
        }
        catch (Exception exception) { }
        return d;
    }

    public void a(String s)
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        if (i >= d.size()) goto _L2; else goto _L3
_L3:
        if (!((PackageInfo)d.get(i)).packageName.equals(s)) goto _L5; else goto _L4
_L4:
        d.remove(i);
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(String s, Context context)
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        context = context.getPackageManager().getPackageInfo(s, 0);
        int i = 0;
_L8:
        if (i >= d.size()) goto _L4; else goto _L3
_L3:
        if (!((PackageInfo)d.get(i)).packageName.equals(s)) goto _L6; else goto _L5
_L5:
        d.remove(i);
_L4:
        d.add(context);
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        s;
    }

    public List b()
    {
        Object obj = a(0);
        ArrayList arraylist = new ArrayList();
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                PackageInfo packageinfo = (PackageInfo)((Iterator) (obj)).next();
                if (com.cleanmaster.common.a.a(packageinfo.applicationInfo))
                {
                    arraylist.add(packageinfo);
                }
            } while (true);
        }
        return arraylist;
    }

    public List c()
    {
        Object obj = a(0);
        ArrayList arraylist = new ArrayList();
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                PackageInfo packageinfo = (PackageInfo)((Iterator) (obj)).next();
                if (com.cleanmaster.common.a.a(packageinfo.applicationInfo))
                {
                    arraylist.add(packageinfo.packageName);
                }
            } while (true);
        }
        return arraylist;
    }

}
