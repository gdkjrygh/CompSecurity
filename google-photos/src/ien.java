// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class ien extends mvd
{

    private final List l;
    private final int m;
    private final idn n;
    private final ier o = new ieo(this);
    private final ier p = new iep(this);
    private final ier q = new ieq(this);

    public ien(Context context, List list, int i)
    {
        super(context);
        l = list;
        m = i;
        n = (idn)olm.a(context.getApplicationContext(), idn);
    }

    private void a(List list)
    {
        List list1 = Arrays.asList(new ier[] {
            o, p, q
        });
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            iei iei1 = (iei)iterator.next();
            Iterator iterator1 = list1.iterator();
            while (iterator1.hasNext()) 
            {
                if (((ier)iterator1.next()).a(iei1.c))
                {
                    arraylist.add(iei1);
                }
            }
        }

        list.removeAll(arraylist);
    }

    private boolean r()
    {
        for (Iterator iterator = l.iterator(); iterator.hasNext();)
        {
            if ("text/plain".equals(((Intent)iterator.next()).getType()))
            {
                return true;
            }
        }

        return false;
    }

    public final Object q()
    {
        Object obj = super.f.getPackageManager();
        HashMap hashmap = new HashMap();
        for (Iterator iterator = l.iterator(); iterator.hasNext();)
        {
            Intent intent = (Intent)iterator.next();
            Iterator iterator1 = ((PackageManager) (obj)).queryIntentActivities(intent, 0x10000).iterator();
            while (iterator1.hasNext()) 
            {
                ResolveInfo resolveinfo = (ResolveInfo)iterator1.next();
                String s = resolveinfo.activityInfo.packageName;
                int i = resolveinfo.labelRes;
                Object obj1 = String.format(Locale.US, "%s.%d", new Object[] {
                    s, Integer.valueOf(i)
                });
                if (!hashmap.containsKey(obj1))
                {
                    hashmap.put(obj1, new iei(s, resolveinfo));
                }
                obj1 = (iei)hashmap.get(obj1);
                Intent intent1 = (Intent)intent.clone();
                intent1.setComponent(new ComponentName(s, resolveinfo.activityInfo.name));
                if ("text/plain".equals(intent.getType()))
                {
                    ((iei) (obj1)).c.b = intent1;
                } else
                {
                    ((iei) (obj1)).c.c = intent1;
                }
            }
        }

        obj = new ArrayList(hashmap.values());
        a(((List) (obj)));
        if (r())
        {
            iei iei1 = n.a(m);
            iei1.d = 0x7fffffff;
            ((List) (obj)).add(0, iei1);
        }
        return obj;
    }
}
