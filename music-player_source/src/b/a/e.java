// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            h, c, fg

public final class e
{

    private final Map a = new HashMap();
    private final ArrayList b = new ArrayList();

    public e()
    {
    }

    public static List a(SharedPreferences sharedpreferences)
    {
        String s = sharedpreferences.getString("activities", "");
        if (!"".equals(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        sharedpreferences = new ArrayList();
        String as[] = s.split(";");
        int i = 0;
_L3:
        if (i >= as.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s1 = as[i];
        if (!TextUtils.isEmpty(s1))
        {
            sharedpreferences.add(new h(s1));
        }
        i++;
          goto _L3
        Exception exception;
        exception;
        exception.printStackTrace();
        if (sharedpreferences.size() <= 0) goto _L1; else goto _L4
_L4:
        return sharedpreferences;
    }

    public final void a()
    {
        String s;
        long l;
        s = null;
        l = 0L;
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = a.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((Long)entry.getValue()).longValue() > l)
            {
                l = ((Long)entry.getValue()).longValue();
                s = (String)entry.getKey();
            }
        } while (true);
        map;
        JVM INSTR monitorexit ;
        if (s != null)
        {
            b(s);
        }
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Context context)
    {
        Object obj;
        obj = context.getSharedPreferences("umeng_general_config", 0);
        context = ((SharedPreferences) (obj)).edit();
        if (b.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        String s = ((SharedPreferences) (obj)).getString("activities", "");
        obj = new StringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            ((StringBuilder) (obj)).append(s);
            ((StringBuilder) (obj)).append(";");
        }
        ArrayList arraylist = b;
        arraylist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(";"))
        {
            c c1 = (c)iterator.next();
            ((StringBuilder) (obj)).append(String.format("[\"%s\",%d]", new Object[] {
                c1.a, Long.valueOf(c1.b)
            }));
        }

        break MISSING_BLOCK_LABEL_150;
        context;
        throw context;
        b.clear();
        arraylist;
        JVM INSTR monitorexit ;
        ((StringBuilder) (obj)).deleteCharAt(((StringBuilder) (obj)).length() - 1);
        context.remove("activities");
        context.putString("activities", ((StringBuilder) (obj)).toString());
        context.commit();
        return;
    }

    public final void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            synchronized (a)
            {
                a.put(s, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void b(String s)
    {
        Long long1;
label0:
        {
            if (!TextUtils.isEmpty(s))
            {
                synchronized (a)
                {
                    long1 = (Long)a.remove(s);
                }
                if (long1 != null)
                {
                    break label0;
                }
                fg.d("MobclickAgent", String.format("please call 'onPageStart(%s)' before onPageEnd", new Object[] {
                    s
                }));
            }
            return;
        }
        long l = System.currentTimeMillis();
        long l1 = long1.longValue();
        synchronized (b)
        {
            b.add(new c(s, l - l1));
        }
    }
}
