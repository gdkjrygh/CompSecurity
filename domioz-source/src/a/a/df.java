// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.f;
import com.appboy.f.a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

// Referenced classes of package a.a:
//            dg, dm, br

public class df
{

    public static final String a;
    public final SharedPreferences b;
    public AtomicBoolean c;
    public br d;
    public final Object e = new Object();

    public df(Context context, String s)
    {
        c = new AtomicBoolean(false);
        if (s == null)
        {
            com.appboy.f.a.d(a, "ServerConfigStorageProvider received null api key.");
            s = "";
        } else
        {
            s = (new StringBuilder(".")).append(s).toString();
        }
        b = context.getSharedPreferences((new StringBuilder("com.appboy.storage.serverconfigstorageprovider")).append(s).toString(), 0);
        (new dg(this, (byte)0)).execute(new Void[0]);
    }

    static br a(df df1, br br1)
    {
        df1.d = br1;
        return br1;
    }

    static Object a(df df1)
    {
        return df1.e;
    }

    private Set a(String s)
    {
        s = b.getString(s, "");
        if (dm.c(s))
        {
            return null;
        }
        HashSet hashset;
        int i;
        try
        {
            s = new JSONArray(s);
            hashset = new HashSet();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.appboy.f.a.b(a, "Experienced exception retrieving blacklisted strings from local storage. Returning null.", s);
            return null;
        }
        i = 0;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(s.getString(i));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
        return hashset;
    }

    public final void a(boolean flag)
    {
        c.set(flag);
    }

    public final boolean a()
    {
label0:
        {
            boolean flag;
            synchronized (e)
            {
                if (d == null)
                {
                    break label0;
                }
                flag = d.f;
            }
            return flag;
        }
        boolean flag1 = b.getBoolean("location_enabled_set", false);
        obj;
        JVM INSTR monitorexit ;
        return flag1;
        exception;
        throw exception;
    }

    public final boolean b()
    {
label0:
        {
            boolean flag;
            synchronized (e)
            {
                if (d == null)
                {
                    break label0;
                }
                flag = d.f;
            }
            return flag;
        }
        boolean flag1 = b.getBoolean("location_enabled", false);
        obj;
        JVM INSTR monitorexit ;
        return flag1;
        exception;
        throw exception;
    }

    public final long c()
    {
label0:
        {
            long l;
            synchronized (e)
            {
                if (d == null)
                {
                    break label0;
                }
                l = d.g;
            }
            return l;
        }
        long l1 = b.getLong("location_time", -1L);
        obj;
        JVM INSTR monitorexit ;
        return l1;
        exception;
        throw exception;
    }

    public final float d()
    {
label0:
        {
            float f1;
            synchronized (e)
            {
                if (d == null)
                {
                    break label0;
                }
                f1 = d.h;
            }
            return f1;
        }
        float f2 = b.getFloat("location_distance", -1F);
        obj;
        JVM INSTR monitorexit ;
        return f2;
        exception;
        throw exception;
    }

    public final long e()
    {
label0:
        {
            long l;
            synchronized (e)
            {
                if (d == null)
                {
                    break label0;
                }
                l = d.a;
            }
            return l;
        }
        long l1 = b.getLong("config_time", 0L);
        obj;
        JVM INSTR monitorexit ;
        return l1;
        exception;
        throw exception;
    }

    public final Set f()
    {
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = d.b;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj1;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
        obj = a("blacklisted_events");
          goto _L1
        obj = new HashSet();
        obj1;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final Set g()
    {
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = d.c;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj1;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
        obj = a("blacklisted_attributes");
          goto _L1
        obj = new HashSet();
        obj1;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final Set h()
    {
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = d.d;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj1;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
        obj = a("blacklisted_purchases");
          goto _L1
        obj = new HashSet();
        obj1;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/df.getName()
        });
    }
}
