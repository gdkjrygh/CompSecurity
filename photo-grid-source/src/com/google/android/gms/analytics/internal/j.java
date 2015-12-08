// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            y, az, z, aa, 
//            n, o, bh, bi, 
//            d

public class j extends y
{

    private static String a = "3";
    private static String b = "01VDIWEA?";
    private static j c;

    public j(aa aa1)
    {
        super(aa1);
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

    public static j b()
    {
        return c;
    }

    private void b(int k, String s, Object obj, Object obj1, Object obj2)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        bl.a(s);
        if (k < 0)
        {
            k = ((flag) ? 1 : 0);
        }
        if (k >= b.length())
        {
            k = b.length() - 1;
        }
        if (!o().a()) goto _L2; else goto _L1
_L1:
        char c1;
        if (i.a)
        {
            c1 = 'P';
        } else
        {
            c1 = 'C';
        }
_L4:
        obj = (new StringBuilder()).append(a).append(b.charAt(k)).append(c1).append(z.a).append(":").append(c(s, a(obj), a(obj1), a(obj2))).toString();
        s = ((String) (obj));
        if (((String) (obj)).length() > 1024)
        {
            s = ((String) (obj)).substring(0, 1024);
        }
        obj = j().m();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        ((n) (obj)).g().a(s);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag1 = i.a;
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

    protected final void a()
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

    public final void a(int k, String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = (String)bh.c.a();
        if (Log.isLoggable(s1, k))
        {
            Log.println(k, s1, c(s, obj, obj1, obj2));
        }
        if (k >= 5)
        {
            b(k, s, obj, obj1, obj2);
        }
    }

    public final void a(d d1, String s)
    {
        if (d1 != null)
        {
            d1 = d1.toString();
        } else
        {
            d1 = "no hit data";
        }
        d((new StringBuilder("Discarding hit. ")).append(s).toString(), d1);
    }

    public final void a(Map map, String s)
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
        d((new StringBuilder("Discarding hit. ")).append(s).toString(), map);
    }

}
