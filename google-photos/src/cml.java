// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class cml
{

    final Map a;

    private cml(Map map)
    {
        a = Collections.unmodifiableMap(map);
    }

    public static cml a(cmi cmi1, cod cod1)
    {
        long l = cod1.b;
        long l1 = cod1.c;
        if (cmi1.b.length == 0)
        {
            cod1 = new long[0];
        } else
        {
            int i = Math.min(b.a(l, cmi1.b), cmi1.b.length);
            int j = Math.max(b.b(l1, cmi1.b), 0);
            cod1 = Arrays.copyOfRange(cmi1.b, i, j + 1);
        }
        return a(cmi1, ((long []) (cod1)));
    }

    public static cml a(cmi cmi1, long al[])
    {
        HashMap hashmap = new HashMap();
        cmm acmm[] = cmm.values();
        int j = acmm.length;
        for (int i = 0; i < j; i++)
        {
            cmm cmm1 = acmm[i];
            Object obj = cmm1.q.a(cmi1, al);
            if (obj != null)
            {
                hashmap.put(cmm1, obj);
            }
        }

        return new cml(hashmap);
    }

    public static cml a(cvs cvs1)
    {
        HashMap hashmap = new HashMap();
        if (cvs1 != null)
        {
            cmm acmm[] = cmm.values();
            int j = acmm.length;
            for (int i = 0; i < j; i++)
            {
                cmm cmm1 = acmm[i];
                Object obj = cmm1.q.a(cvs1);
                if (obj != null)
                {
                    hashmap.put(cmm1, obj);
                }
            }

        }
        return new cml(hashmap);
    }

    public final cvs a()
    {
        cvs cvs1 = new cvs();
        cmm cmm1;
        Object obj;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); cmm1.q.a(obj, cvs1))
        {
            obj = (java.util.Map.Entry)iterator.next();
            cmm1 = (cmm)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
        }

        return cvs1;
    }

    public final Object a(cmm cmm1)
    {
        return a.get(cmm1);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof cml))
        {
            return false;
        } else
        {
            obj = (cml)obj;
            return b.e(a, ((cml) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return b.h(a, 17);
    }
}
