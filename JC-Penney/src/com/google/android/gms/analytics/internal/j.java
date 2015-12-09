// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.u;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, bj, bk, d, 
//            bb, aa, ab, n, 
//            p

public class j extends z
{

    private static String a = "3";
    private static String b = "01VDIWEA?";
    private static j c;

    public j(ab ab1)
    {
        super(ab1);
    }

    public static j b()
    {
        return c;
    }

    protected String a(Object obj)
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
            String s;
            StringBuilder stringbuilder;
            if (String.valueOf(obj).charAt(0) == '-')
            {
                s = "-";
            } else
            {
                s = "";
            }
            obj = String.valueOf(Math.abs(((Long)obj).longValue()));
            stringbuilder = new StringBuilder();
            stringbuilder.append(s);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length() - 1)));
            stringbuilder.append("...");
            stringbuilder.append(s);
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

    protected void a()
    {
        com/google/android/gms/analytics/internal/j;
        JVM INSTR monitorenter ;
        c = this;
        com/google/android/gms/analytics/internal/j;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/j;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i, String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = (String)bj.c.a();
        if (Log.isLoggable(s1, i))
        {
            Log.println(i, s1, c(s, obj, obj1, obj2));
        }
        if (i >= 5)
        {
            b(i, s, obj, obj1, obj2);
        }
    }

    public void a(d d1, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "no reason provided";
        }
        if (d1 != null)
        {
            d1 = d1.toString();
        } else
        {
            d1 = "no hit data";
        }
        d((new StringBuilder()).append("Discarding hit. ").append(s1).toString(), d1);
    }

    public void a(Map map, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "no reason provided";
        }
        if (map != null)
        {
            s = new StringBuilder();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); s.append((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                if (s.length() > 0)
                {
                    s.append(',');
                }
                s.append((String)entry.getKey());
                s.append('=');
            }

            map = s.toString();
        } else
        {
            map = "no hit data";
        }
        d((new StringBuilder()).append("Discarding hit. ").append(s1).toString(), map);
    }

    public void b(int i, String s, Object obj, Object obj1, Object obj2)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        u.a(s);
        if (i < 0)
        {
            i = ((flag) ? 1 : 0);
        }
        if (i >= b.length())
        {
            i = b.length() - 1;
        }
        if (!q().b()) goto _L2; else goto _L1
_L1:
        char c1;
        if (q().a())
        {
            c1 = 'P';
        } else
        {
            c1 = 'C';
        }
_L4:
        obj = (new StringBuilder()).append(a).append(b.charAt(i)).append(c1).append(aa.a).append(":").append(c(s, a(obj), a(obj1), a(obj2))).toString();
        s = ((String) (obj));
        if (((String) (obj)).length() > 1024)
        {
            s = ((String) (obj)).substring(0, 1024);
        }
        obj = k().n();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        ((n) (obj)).g().a(s);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag1 = q().a();
        if (flag1)
        {
            c1 = 'p';
        } else
        {
            c1 = 'c';
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

}
