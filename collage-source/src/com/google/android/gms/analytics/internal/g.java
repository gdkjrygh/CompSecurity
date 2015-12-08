// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, am, c, af, 
//            s, t, j

public class g extends r
{

    private static String a = "3";
    private static String b = "01VDIWEA?";
    private static g c;

    public g(t t1)
    {
        super(t1);
    }

    public static g b()
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

    protected void a()
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

    public void a(int i, String s1, Object obj, Object obj1, Object obj2)
    {
        String s2 = (String)am.c.a();
        if (Log.isLoggable(s2, i))
        {
            Log.println(i, s2, c(s1, obj, obj1, obj2));
        }
        if (i >= 5)
        {
            b(i, s1, obj, obj1, obj2);
        }
    }

    public void a(c c1, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "no reason provided";
        }
        if (c1 != null)
        {
            c1 = c1.toString();
        } else
        {
            c1 = "no hit data";
        }
        d((new StringBuilder()).append("Discarding hit. ").append(s2).toString(), c1);
    }

    public void a(Map map, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "no reason provided";
        }
        if (map != null)
        {
            s1 = new StringBuilder();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); s1.append((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                if (s1.length() > 0)
                {
                    s1.append(',');
                }
                s1.append((String)entry.getKey());
                s1.append('=');
            }

            map = s1.toString();
        } else
        {
            map = "no hit data";
        }
        d((new StringBuilder()).append("Discarding hit. ").append(s2).toString(), map);
    }

    public void b(int i, String s1, Object obj, Object obj1, Object obj2)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        z.a(s1);
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
        obj = (new StringBuilder()).append(a).append(b.charAt(i)).append(c1).append(s.a).append(":").append(c(s1, a(obj), a(obj1), a(obj2))).toString();
        s1 = ((String) (obj));
        if (((String) (obj)).length() > 1024)
        {
            s1 = ((String) (obj)).substring(0, 1024);
        }
        obj = k().n();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        ((j) (obj)).g().a(s1);
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
        s1;
        throw s1;
    }

}
