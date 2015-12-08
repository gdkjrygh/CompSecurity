// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.appboy.Constants;
import com.appboy.services.AppboyWearableListenerService;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ce, di, dk, ev

public class ca
    implements ce
{

    private static final String a;
    private final Context b;
    private final boolean c = c();
    private final SharedPreferences d;

    public ca(Context context)
    {
        b = context.getApplicationContext();
        d = context.getSharedPreferences("com.appboy.managers.connected_device_storage", 0);
    }

    private void a(di di1)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = d.edit();
        editor.putString(di1.a.a, di1.a().toString());
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        di1;
        throw di1;
    }

    private boolean c()
    {
        Class class1;
        boolean flag;
        try
        {
            class1 = Class.forName("com.appboy.services.AppboyWearableListenerService", false, bo/app/ca.getClassLoader());
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            AppboyLogger.i(a, "AppboyWearableListenerService not found on path. Service not available.");
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
            AppboyLogger.i(a, "AppboyWearableListenerService not found on path. Service not available.");
        } else
        if (b.getPackageManager().queryIntentServices((new Intent()).setClass(b, com/appboy/services/AppboyWearableListenerService), 0x10000).size() > 0)
        {
            return true;
        }
        return false;
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
                break MISSING_BLOCK_LABEL_153;
            }
            s = (String)iterator.next();
            s1 = d.getString(s, null);
            flag = ev.c(s1);
        } while (flag);
        arraylist.add(di.a(new JSONObject(s1)));
          goto _L1
        JSONException jsonexception;
        jsonexception;
        AppboyLogger.e(a, (new StringBuilder("JSON error while pulling connected device from storage: ")).append(s1).toString(), jsonexception);
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
        a((di)obj);
    }

    public final void b()
    {
        if (!c)
        {
            AppboyLogger.i(a, "Appboy Wearable service is not available. Declare <service android:name=\"com.appboy.services.AppboyWearableListenerService\"/> in your appboy.xml to enable Appboy wearable service. See the Droidboy manifest for an example");
            return;
        } else
        {
            AppboyLogger.i(a, "Starting AppboyWearableListenerService.");
            Intent intent = (new Intent()).setClass(b, com/appboy/services/AppboyWearableListenerService);
            b.startService(intent);
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ca.getName()
        });
    }
}
