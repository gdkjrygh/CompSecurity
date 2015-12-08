// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.google.analytics.tracking.android:
//            q, aq

public final class bg
    implements q
{

    private final TreeSet a = new TreeSet();

    public bg(Context context, Collection collection)
    {
        a(context, collection);
    }

    private static Throwable a(Throwable throwable)
    {
        for (; throwable.getCause() != null; throwable = throwable.getCause()) { }
        return throwable;
    }

    private void a(Context context, Collection collection)
    {
        HashSet hashset;
        a.clear();
        hashset = new HashSet();
        if (collection != null)
        {
            hashset.addAll(collection);
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        collection = context.getApplicationContext().getPackageName();
        a.add(collection);
        context = context.getApplicationContext().getPackageManager().getPackageInfo(collection, 15).activities;
        if (context == null) goto _L2; else goto _L3
_L3:
        int j = context.length;
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(((ActivityInfo) (context[i])).packageName);
        i++;
        if (true) goto _L4; else goto _L2
        context;
        aq.c("No package found");
_L2:
        context = hashset.iterator();
label0:
        do
        {
            if (context.hasNext())
            {
                collection = (String)context.next();
                Iterator iterator = a.iterator();
                boolean flag = true;
                do
                {
label1:
                    {
                        if (iterator.hasNext())
                        {
                            String s = (String)iterator.next();
                            if (collection.startsWith(s))
                            {
                                break label1;
                            }
                            if (s.startsWith(collection))
                            {
                                a.remove(s);
                            }
                        }
                        if (flag)
                        {
                            a.add(collection);
                        }
                        continue label0;
                    }
                    flag = false;
                } while (true);
            }
            return;
        } while (true);
    }

    public final String a(String s, Throwable throwable)
    {
        Throwable throwable1;
        Object obj1;
        throwable1 = a(throwable);
        obj1 = a(throwable).getStackTrace();
        if (obj1 != null && obj1.length != 0) goto _L2; else goto _L1
_L1:
        throwable = null;
_L4:
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(throwable1.getClass().getSimpleName());
        if (throwable != null)
        {
            String as[] = throwable.getClassName().split("\\.");
            obj1 = "unknown";
            Object obj = obj1;
            if (as != null)
            {
                obj = obj1;
                if (as.length > 0)
                {
                    obj = as[as.length - 1];
                }
            }
            stringbuilder.append(String.format(" (@%s:%s:%s)", new Object[] {
                obj, throwable.getMethodName(), Integer.valueOf(throwable.getLineNumber())
            }));
        }
        if (s != null)
        {
            stringbuilder.append(String.format(" {%s}", new Object[] {
                s
            }));
        }
        return stringbuilder.toString();
_L2:
        int j = obj1.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            throwable = obj1[i];
            String s1 = throwable.getClassName();
            for (Iterator iterator = a.iterator(); iterator.hasNext();)
            {
                if (s1.startsWith((String)iterator.next()))
                {
                    continue; /* Loop/switch isn't completed */
                }
            }

            i++;
        } while (true);
        throwable = obj1[0];
        if (true) goto _L4; else goto _L3
_L3:
    }
}
