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
//            dx, ev, da, le, 
//            ld, lf, eu

public final class eg extends dx
{

    private static final String c;
    final SharedPreferences a;
    public da b;

    public eg(Context context)
    {
        this(context, null, null);
    }

    public eg(Context context, String s, String s1)
    {
        b = null;
        a = context.getSharedPreferences((new StringBuilder("com.appboy.storage.device_cache")).append(ev.b(s, s1)).toString(), 0);
    }

    private da d()
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
        String s2;
        Object obj1;
        Object obj2;
        s2 = (String)iterator.next();
        obj1 = jsonobject1.opt(s2);
        obj2 = jsonobject.opt(s2);
        if (!(obj1 instanceof JSONObject) && !(obj1 instanceof JSONArray)) goto _L4; else goto _L3
_L3:
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        boolean flag;
        if (!ld.a(String.valueOf(obj1), String.valueOf(obj2), le.c).a)
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
            ((JSONObject) (obj)).put(s2, obj1);
        }
        catch (JSONException jsonexception)
        {
            String s = c;
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
            ((JSONObject) (obj)).put(s2, obj1);
        }
        catch (JSONException jsonexception1)
        {
            AppboyLogger.e(c, "Caught json exception creating dirty outbound device. Returning the whole device.", jsonexception1);
            return b;
        }
        break; /* Loop/switch isn't completed */
_L2:
        da da1;
        try
        {
            da1 = da.a(((JSONObject) (obj)));
        }
        catch (JSONException jsonexception2)
        {
            String s1 = c;
            return b;
        }
        return da1;
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
        obj1 = (da)obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj = new JSONObject(a.getString("cached_device", "{}"));
        obj1 = ((da) (obj1)).a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("cached_device", eu.a(((JSONObject) (obj)), ((JSONObject) (obj1))).toString());
        editor.apply();
        return;
        obj;
        obj = c;
        return;
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/eg.getName()
        });
    }
}
