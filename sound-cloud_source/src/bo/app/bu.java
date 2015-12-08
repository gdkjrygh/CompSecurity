// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appboy.d;
import com.appboy.services.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            by, dc, de, ep, 
//            eq

public class bu
    implements by
{

    private static final String a;
    private final Context b;
    private final boolean c = c();
    private final SharedPreferences d;

    public bu(Context context)
    {
        b = context.getApplicationContext();
        d = context.getSharedPreferences("com.appboy.managers.connected_device_storage", 0);
    }

    private void a(dc dc1)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = d.edit();
        editor.putString(dc1.a.a, dc1.a().toString());
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        dc1;
        throw dc1;
    }

    private boolean c()
    {
        Class class1;
        boolean flag;
        try
        {
            class1 = Class.forName("com.appboy.services.AppboyWearableListenerService", false, bo/app/bu.getClassLoader());
        }
        catch (Exception exception)
        {
            return false;
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            return false;
        }
        catch (Throwable throwable)
        {
            return false;
        }
        if (class1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        } else
        {
            return bo.app.ep.a(b, com/appboy/services/a);
        }
    }

    public final List a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        ArrayList arraylist;
        Iterator iterator;
        obj = d.edit();
        arraylist = new ArrayList();
        iterator = d.getAll().keySet().iterator();
_L1:
        String s;
        String s1;
        boolean flag;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_127;
            }
            s = (String)iterator.next();
            s1 = d.getString(s, null);
            flag = eq.c(s1);
        } while (flag);
        arraylist.add(bo.app.dc.a(new JSONObject(s1)));
          goto _L1
        JSONException jsonexception;
        jsonexception;
        ((android.content.SharedPreferences.Editor) (obj)).remove(s);
          goto _L1
        obj;
        throw obj;
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    public final volatile void a(Object obj)
    {
        a((dc)obj);
    }

    public final void b()
    {
        if (!c)
        {
            return;
        } else
        {
            Intent intent = (new Intent()).setClass(b, com/appboy/services/a);
            b.startService(intent);
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/bu.getName()
        });
    }
}
