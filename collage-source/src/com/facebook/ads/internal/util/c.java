// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.facebook.ads.internal.util:
//            b

public class c
{

    private static List a = new ArrayList();

    public static String a()
    {
label0:
        {
            synchronized (a)
            {
                if (!a.isEmpty())
                {
                    break label0;
                }
            }
            return "";
        }
        Object obj1;
        obj1 = new ArrayList(a);
        a.clear();
        obj;
        JVM INSTR monitorexit ;
        obj = new JSONArray();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put(((b)((Iterator) (obj1)).next()).a())) { }
        break MISSING_BLOCK_LABEL_92;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        return ((JSONArray) (obj)).toString();
    }

    public static void a(b b1)
    {
        synchronized (a)
        {
            a.add(b1);
        }
        return;
        b1;
        list;
        JVM INSTR monitorexit ;
        throw b1;
    }

}
