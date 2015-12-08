// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.f;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            cp, dm, bv, jx, 
//            jw, jy, dl

public final class cy extends cp
{

    private static final String c;
    final SharedPreferences a;
    public bv b;

    public cy(Context context)
    {
        this(context, null, null);
    }

    public cy(Context context, String s, String s1)
    {
        b = null;
        a = context.getSharedPreferences((new StringBuilder("com.appboy.storage.device_cache")).append(dm.b(s, s1)).toString(), 0);
    }

    private bv d()
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject1 = b.b();
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
        if (!(obj1 instanceof JSONObject)) goto _L4; else goto _L3
_L3:
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        boolean flag;
        if (!jw.a(String.valueOf(obj1), String.valueOf(obj2), jx.c).a)
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
            jsonexception.printStackTrace();
            return b;
        }
        break; /* Loop/switch isn't completed */
        obj;
        ((JSONException) (obj)).printStackTrace();
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
            jsonexception1.printStackTrace();
            return b;
        }
        break; /* Loop/switch isn't completed */
_L2:
        bv bv1;
        try
        {
            bv1 = bv.a(((JSONObject) (obj)));
        }
        catch (JSONException jsonexception2)
        {
            jsonexception2.printStackTrace();
            return b;
        }
        return bv1;
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
        obj1 = (bv)obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj = new JSONObject(a.getString("cached_device", "{}"));
        obj1 = ((bv) (obj1)).b();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("cached_device", dl.a(((JSONObject) (obj)), ((JSONObject) (obj1))).toString());
        editor.apply();
        return;
        obj;
        ((JSONException) (obj)).printStackTrace();
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
            f.a, a/a/cy.getName()
        });
    }
}
