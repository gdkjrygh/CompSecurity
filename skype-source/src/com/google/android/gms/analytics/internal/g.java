// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.y;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            q, ae, r, s, 
//            j, al, c

public class g extends q
{

    private static String a = "3";
    private static String b = "01VDIWEA?";
    private static g c;

    public g(s s1)
    {
        super(s1);
    }

    private static String a(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Integer)
        {
            obj = new Long(((Integer)obj).intValue());
        }
        if (obj instanceof Long)
        {
            if (Math.abs(((Long)obj).longValue()) < 100L)
            {
                return String.valueOf(obj);
            }
            String s1;
            StringBuilder stringbuilder;
            if (String.valueOf(obj).charAt(0) == '-')
            {
                s1 = "-";
            } else
            {
                s1 = "";
            }
            obj = String.valueOf(Math.abs(((Long)obj).longValue()));
            stringbuilder = new StringBuilder();
            stringbuilder.append(s1);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length() - 1)));
            stringbuilder.append("...");
            stringbuilder.append(s1);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length()) - 1.0D));
            return stringbuilder.toString();
        }
        if (obj instanceof Boolean)
        {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable)
        {
            return obj.getClass().getCanonicalName();
        } else
        {
            return "-";
        }
    }

    public static g b()
    {
        return c;
    }

    private void b(int i, String s1, Object obj, Object obj1, Object obj2)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        y.a(s1);
        if (i < 0)
        {
            i = ((flag) ? 1 : 0);
        }
        if (i >= b.length())
        {
            i = b.length() - 1;
        }
        if (!o().a()) goto _L2; else goto _L1
_L1:
        char c1;
        if (com.google.android.gms.common.internal.g.a)
        {
            c1 = 'P';
        } else
        {
            c1 = 'C';
        }
_L4:
        obj = (new StringBuilder()).append(a).append(b.charAt(i)).append(c1).append(r.a).append(":").append(c(s1, a(obj), a(obj1), a(obj2))).toString();
        s1 = ((String) (obj));
        if (((String) (obj)).length() > 1024)
        {
            s1 = ((String) (obj)).substring(0, 1024);
        }
        obj = j().m();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        ((j) (obj)).g().a(s1);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag1 = com.google.android.gms.common.internal.g.a;
        if (flag1)
        {
            c1 = 'p';
        } else
        {
            c1 = 'c';
        }
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        throw s1;
    }

    protected final void a()
    {
        com/google/android/gms/analytics/internal/g;
        JVM INSTR monitorenter ;
        c = this;
        com/google/android/gms/analytics/internal/g;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/g;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i, String s1, Object obj, Object obj1, Object obj2)
    {
        String s2 = (String)al.c.a();
        if (Log.isLoggable(s2, i))
        {
            Log.println(i, s2, c(s1, obj, obj1, obj2));
        }
        if (i >= 5)
        {
            b(i, s1, obj, obj1, obj2);
        }
    }

    public final void a(c c1, String s1)
    {
        if (c1 != null)
        {
            c1 = c1.toString();
        } else
        {
            c1 = "no hit data";
        }
        d((new StringBuilder("Discarding hit. ")).append(s1).toString(), c1);
    }

    public final void a(Map map, String s1)
    {
        if (map != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append((String)entry.getKey());
                stringbuilder.append('=');
            }

            map = stringbuilder.toString();
        } else
        {
            map = "no hit data";
        }
        d((new StringBuilder("Discarding hit. ")).append(s1).toString(), map);
    }

}
