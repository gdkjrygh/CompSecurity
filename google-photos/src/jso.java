// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class jso extends jsw
{

    private static String a = "3";
    private static String b = "01VDIWEA?";
    private static jso c;

    public jso(jrk jrk1)
    {
        super(jrk1);
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

    public static jso b()
    {
        return c;
    }

    private void b(int i, String s, Object obj, Object obj1, Object obj2)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        b.d(s);
        if (i < 0)
        {
            i = ((flag) ? 1 : 0);
        }
        if (i >= b.length())
        {
            i = b.length() - 1;
        }
        if (!i().a()) goto _L2; else goto _L1
_L1:
        char c1;
        if (kbe.a)
        {
            c1 = 'P';
        } else
        {
            c1 = 'C';
        }
_L6:
        s = (new StringBuilder()).append(a).append(b.charAt(i)).append(c1).append(jsx.a).append(":").append(c(s, a(obj), a(obj1), a(obj2))).toString();
        if (s.length() > 1024)
        {
            s = s.substring(0, 1024);
        }
        obj = super.d;
        if (((jrk) (obj)).g == null || !((jrk) (obj)).g.q())
        {
            break MISSING_BLOCK_LABEL_221;
        }
          goto _L3
_L4:
        for (; obj == null; obj = null)
        {
            break MISSING_BLOCK_LABEL_176;
        }

        ((jss) (obj)).b.a(s);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (kbe.a)
        {
            c1 = 'p';
        } else
        {
            c1 = 'c';
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj = ((jrk) (obj)).g;
          goto _L4
        s;
        throw s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void a()
    {
        jso;
        JVM INSTR monitorenter ;
        c = this;
        jso;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        jso;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i, String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = (String)jsl.b.a();
        if (Log.isLoggable(s1, i))
        {
            Log.println(i, s1, c(s, obj, obj1, obj2));
        }
        if (i >= 5)
        {
            b(i, s, obj, obj1, obj2);
        }
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

    public final void a(jsn jsn1, String s)
    {
        if (jsn1 != null)
        {
            jsn1 = jsn1.toString();
        } else
        {
            jsn1 = "no hit data";
        }
        d((new StringBuilder("Discarding hit. ")).append(s).toString(), jsn1);
    }

}
