// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            k, c

final class l
{
    public static interface a
    {

        public abstract void a(c c1);

        public abstract void b(c c1);
    }


    private final Context a;
    private final a b;
    private final Handler c = new Handler();
    private final PackageManager d;
    private final ArrayList e = new ArrayList();
    private boolean f;
    private final BroadcastReceiver g = new BroadcastReceiver() {

        final l a;

        public void onReceive(Context context1, Intent intent)
        {
            l.a(a);
        }

            
            {
                a = l.this;
                super();
            }
    };
    private final Runnable h = new Runnable() {

        final l a;

        public void run()
        {
            l.a(a);
        }

            
            {
                a = l.this;
                super();
            }
    };

    public l(Context context, a a1)
    {
        a = context;
        b = a1;
        d = context.getPackageManager();
    }

    private int a(String s, String s1)
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            if (((k)e.get(i)).a(s, s1))
            {
                return i;
            }
        }

        return -1;
    }

    static void a(l l1)
    {
        l1.b();
    }

    private void b()
    {
        if (f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = new Intent("android.media.MediaRouteProviderService");
        obj = d.queryIntentServices(((Intent) (obj)), 0).iterator();
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
                int l1 = a(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name);
                if (l1 < 0)
                {
                    obj1 = new k(a, new ComponentName(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name));
                    ((k) (obj1)).f();
                    ArrayList arraylist = e;
                    int j = i + 1;
                    arraylist.add(i, obj1);
                    b.a(((c) (obj1)));
                    i = j;
                } else
                if (l1 >= i)
                {
                    Object obj2 = (k)e.get(l1);
                    ((k) (obj2)).f();
                    ((k) (obj2)).h();
                    obj2 = e;
                    int i1 = i + 1;
                    Collections.swap(((List) (obj2)), l1, i);
                    i = i1;
                }
            }
        } while (true);
        if (i < e.size())
        {
            int j1 = e.size() - 1;
            while (j1 >= i) 
            {
                k k1 = (k)e.get(j1);
                b.b(k1);
                e.remove(k1);
                k1.g();
                j1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a()
    {
        if (!f)
        {
            f = true;
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentfilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentfilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentfilter.addDataScheme("package");
            a.registerReceiver(g, intentfilter, null, c);
            c.post(h);
        }
    }
}
