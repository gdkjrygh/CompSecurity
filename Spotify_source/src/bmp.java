// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class bmp extends bnd
{

    private static String a = "3";
    private static String b = "01VDIWEA?";
    private static bmp c;

    public bmp(bnf bnf1)
    {
        super(bnf1);
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

    public static bmp b()
    {
        return c;
    }

    private void b(int i, String s, Object obj, Object obj1, Object obj2)
    {
        this;
        JVM INSTR monitorenter ;
        btl.a(s);
        if (i < 0)
        {
            i = 0;
        }
        if (i >= b.length())
        {
            i = b.length() - 1;
        }
        char c1;
        long l;
        if (super.f.d.a())
        {
            c1 = 'C';
        } else
        {
            c1 = 'c';
        }
        obj = (new StringBuilder()).append(a).append(b.charAt(i)).append(c1).append(bne.a).append(":").append(a(s, a(obj), a(obj1), a(obj2))).toString();
        s = ((String) (obj));
        if (((String) (obj)).length() > 1024)
        {
            s = ((String) (obj)).substring(0, 1024);
        }
        obj = super.f;
        if (((bnf) (obj)).g != null && ((bnf) (obj)).g.l()) goto _L2; else goto _L1
_L7:
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((bmt) (obj)).b;
        if (((bmu) (obj)).b() == 0L)
        {
            ((bmu) (obj)).a();
        }
        break MISSING_BLOCK_LABEL_391;
_L8:
        obj;
        JVM INSTR monitorenter ;
        l = ((bmu) (obj)).b.a.getLong(((bmu) (obj)).c(), 0L);
        if (l > 0L) goto _L6; else goto _L5
_L5:
        obj1 = ((bmu) (obj)).b.a.edit();
        ((android.content.SharedPreferences.Editor) (obj1)).putString(((bmu) (obj)).d(), s);
        ((android.content.SharedPreferences.Editor) (obj1)).putLong(((bmu) (obj)).c(), 1L);
        ((android.content.SharedPreferences.Editor) (obj1)).apply();
        obj;
        JVM INSTR monitorexit ;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = ((bnf) (obj)).g;
          goto _L7
_L6:
        if ((UUID.randomUUID().getLeastSignificantBits() & 0x7fffffffffffffffL) < 0x7fffffffffffffffL / (1L + l))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = ((bmu) (obj)).b.a.edit();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        ((android.content.SharedPreferences.Editor) (obj1)).putString(((bmu) (obj)).d(), s);
        ((android.content.SharedPreferences.Editor) (obj1)).putLong(((bmu) (obj)).c(), l + 1L);
        ((android.content.SharedPreferences.Editor) (obj1)).apply();
        obj;
        JVM INSTR monitorexit ;
          goto _L4
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L1:
        obj = null;
          goto _L7
        if (s == null)
        {
            s = "";
        }
          goto _L8
    }

    protected final void a()
    {
        bmp;
        JVM INSTR monitorenter ;
        c = this;
        bmp;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        bmp;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i, String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = (String)bnz.b.a;
        if (Log.isLoggable(s1, i))
        {
            Log.println(i, s1, a(s, obj, obj1, obj2));
        }
        if (i >= 5)
        {
            b(i, s, obj, obj1, obj2);
        }
    }

    public final void a(bmj bmj1, String s)
    {
        if (bmj1 != null)
        {
            bmj1 = bmj1.toString();
        } else
        {
            bmj1 = "no hit data";
        }
        d((new StringBuilder("Discarding hit. ")).append(s).toString(), bmj1);
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
