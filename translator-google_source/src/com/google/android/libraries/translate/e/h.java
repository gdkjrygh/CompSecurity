// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.e:
//            i, j

public final class h
{

    private static final SparseArray a = new SparseArray();
    private static final Object b = new Object();
    private static Handler c;

    public static void a(int k)
    {
        a(k, ((Bundle) (null)));
    }

    public static void a(int k, Bundle bundle)
    {
        synchronized (b)
        {
            if (c == null)
            {
                c = new Handler(Looper.getMainLooper());
            }
        }
        c.post(new i(k, bundle));
        return;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    public static void a(j j1)
    {
        for (int k = a.size() - 1; k >= 0; k--)
        {
            ((List)a.valueAt(k)).remove(j1);
        }

    }

    public static transient void a(j j1, int ai[])
    {
        int l = ai.length;
        for (int k = 0; k < l; k++)
        {
            int i1 = ai[k];
            List list = (List)a.get(i1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
            }
            if (!((List) (obj)).contains(j1))
            {
                ((List) (obj)).add(j1);
                a.put(i1, obj);
            }
        }

    }

    public static void b(int k, Bundle bundle)
    {
        Object obj = (List)a.get(k);
        if (obj != null)
        {
            for (obj = (new HashSet(((java.util.Collection) (obj)))).iterator(); ((Iterator) (obj)).hasNext(); ((j)((Iterator) (obj)).next()).a(k, bundle)) { }
        }
    }

}
