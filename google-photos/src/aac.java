// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class aac
{

    final Context a;
    final Handler b = new Handler();
    boolean c;
    final BroadcastReceiver d = new aad(this);
    final Runnable e = new aae(this);
    private final aaf f;
    private final PackageManager g;
    private final ArrayList h = new ArrayList();

    public aac(Context context, aaf aaf1)
    {
        a = context;
        f = aaf1;
        g = context.getPackageManager();
    }

    private int a(String s, String s1)
    {
        int j = h.size();
        boolean flag;
        for (int i = 0; i < j; i++)
        {
            zv zv1 = (zv)h.get(i);
            if (zv1.j.getPackageName().equals(s) && zv1.j.getClassName().equals(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return i;
            }
        }

        return -1;
    }

    static void a(aac aac1)
    {
        if (aac1.c)
        {
            Object obj = new Intent("android.media.MediaRouteProviderService");
            obj = aac1.g.queryIntentServices(((Intent) (obj)), 0).iterator();
            int i = 0;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = ((ResolveInfo)((Iterator) (obj)).next()).serviceInfo;
                if (obj1 != null)
                {
                    int l = aac1.a(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name);
                    if (l < 0)
                    {
                        obj1 = new zv(aac1.a, new ComponentName(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name));
                        ((zv) (obj1)).a();
                        aac1.h.add(i, obj1);
                        aac1.f.a(((ys) (obj1)));
                        i++;
                    } else
                    if (l >= i)
                    {
                        Object obj2 = (zv)aac1.h.get(l);
                        ((zv) (obj2)).a();
                        if (((zv) (obj2)).l == null && ((zv) (obj2)).c())
                        {
                            ((zv) (obj2)).e();
                            ((zv) (obj2)).d();
                        }
                        obj2 = aac1.h;
                        int j = i + 1;
                        Collections.swap(((List) (obj2)), l, i);
                        i = j;
                    }
                }
            } while (true);
            if (i < aac1.h.size())
            {
                for (int k = aac1.h.size() - 1; k >= i; k--)
                {
                    zv zv1 = (zv)aac1.h.get(k);
                    aac1.f.b(zv1);
                    aac1.h.remove(zv1);
                    if (!zv1.k)
                    {
                        continue;
                    }
                    if (zv.i)
                    {
                        (new StringBuilder()).append(zv1).append(": Stopping");
                    }
                    zv1.k = false;
                    zv1.b();
                }

            }
        }
    }
}
