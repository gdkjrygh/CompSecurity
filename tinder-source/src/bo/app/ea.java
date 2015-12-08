// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            dr, ep, cu, ky, 
//            kx, kz, eo

public final class ea extends dr
{

    private static final String c;
    final SharedPreferences a;
    public cu b;

    public ea(Context context)
    {
        this(context, null, null);
    }

    public ea(Context context, String s, String s1)
    {
        b = null;
        a = context.getSharedPreferences((new StringBuilder("com.appboy.storage.device_cache")).append(ep.b(s, s1)).toString(), 0);
    }

    private cu d()
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject1 = b.a();
        jsonobject = new JSONObject();
        Object obj = new JSONObject(a.getString("cached_device", "{}"));
        jsonobject = ((JSONObject) (obj));
_L8:
        Iterator iterator;
        obj = new JSONObject();
        iterator = jsonobject1.keys();
_L9:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        Object obj1;
        Object obj2;
        s = (String)iterator.next();
        obj1 = jsonobject1.opt(s);
        obj2 = jsonobject.opt(s);
        if (!(obj1 instanceof JSONObject) && !(obj1 instanceof JSONArray)) goto _L4; else goto _L3
_L3:
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        boolean flag;
        if (!kx.a(String.valueOf(obj1), String.valueOf(obj2), ky.c).a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L7
_L6:
        try
        {
            ((JSONObject) (obj)).put(s, obj1);
        }
        catch (JSONException jsonexception)
        {
            return b;
        }
        break; /* Loop/switch isn't completed */
        obj;
        AppboyLogger.e(c, "Caught exception confirming and unlocking Json objects.", ((Throwable) (obj)));
          goto _L8
_L4:
        if (obj1.equals(obj2))
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            ((JSONObject) (obj)).put(s, obj1);
        }
        catch (JSONException jsonexception1)
        {
            AppboyLogger.e(c, "Caught json exception creating dirty outbound device. Returning the whole device.", jsonexception1);
            return b;
        }
        break; /* Loop/switch isn't completed */
_L2:
        cu cu1;
        try
        {
            cu1 = cu.a(((JSONObject) (obj)));
        }
        catch (JSONException jsonexception2)
        {
            return b;
        }
        return cu1;
_L7:
        if (!flag) goto _L9; else goto _L6
    }

    final Object a()
    {
        return d();
    }

    final void a(Object obj)
    {
        Object obj1;
        obj1 = (cu)obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj = new JSONObject(a.getString("cached_device", "{}"));
        obj1 = ((cu) (obj1)).a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("cached_device", eo.a(((JSONObject) (obj)), ((JSONObject) (obj1))).toString());
        editor.apply();
        return;
        obj;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.remove("cached_device");
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ea.getName()
        });
    }
}
